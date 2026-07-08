package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.09kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2461509kj {
    public final C2461309kh LIZ;
    public final String LIZIZ;
    public final C837260Wsu LIZJ;

    public C2461509kj(Context context, C2461309kh c2461309kh) {
        int length;
        String strEncodeToString;
        this.LIZIZ = context.getPackageName();
        this.LIZ = c2461309kh;
        try {
            if (C786410Ut5.V3(context.getPackageManager(), "com.android.vending", 0).enabled) {
                Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    int i = 0;
                    do {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException e) {
                            TryCatchGuardChecker.doCheck(e);
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString) && ((!Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString))) {
                            i++;
                        } else {
                            this.LIZJ = new C837260Wsu(context, c2461309kh, C2461709kl.LIZ);
                            return;
                        }
                    } while (i < length);
                } else {
                    C2461309kh c2461309kh2 = C2461409ki.LIZ;
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        C2461309kh.LIZIZ(c2461309kh2.LIZ, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    } else {
                        c2461309kh2.getClass();
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            C2461309kh.LIZIZ(c2461309kh.LIZ, "Phonesky is not installed.", objArr2);
        } else {
            c2461309kh.getClass();
        }
        this.LIZJ = null;
    }

    public static Bundle LIZ(C2461509kj c2461509kj, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("package.name", c2461509kj.LIZIZ, bundle);
        C786410Ut5.LJJIJ(bundle, "nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList<AbstractC2461809km> arrayList = new ArrayList();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        arrayList.add(new AbstractC2461809km(jCurrentTimeMillis) { // from class: X.09kk
            public final long LIZ;

            {
                this.LIZ = jCurrentTimeMillis;
            }

            @Override // X.AbstractC2461809km
            public final void LIZ() {
            }

            @Override // X.AbstractC2461809km
            public final long LIZIZ() {
                return this.LIZ;
            }

            public final int hashCode() {
                long j = this.LIZ;
                return ((int) (j ^ (j >>> 32))) ^ (-724379968);
            }

            public final String toString() {
                return "EventRecord{eventType=3, eventTimestamp=" + this.LIZ + "}";
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AbstractC2461809km) {
                    AbstractC2461809km abstractC2461809km = (AbstractC2461809km) obj;
                    abstractC2461809km.LIZ();
                    if (this.LIZ == abstractC2461809km.LIZIZ()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC2461809km abstractC2461809km : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", abstractC2461809km.LIZIZ());
            arrayList2.add(bundle2);
        }
        C786410Ut5.LJJIL(bundle, "event_timestamps", new ArrayList(arrayList2));
        return bundle;
    }
}
