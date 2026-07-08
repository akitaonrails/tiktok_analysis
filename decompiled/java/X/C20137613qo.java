package X;

import android.graphics.BitmapFactory;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import kotlin.Pair;
import kotlin.jvm.internal.AwS114S1000000_30;

/* JADX INFO: renamed from: X.13qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137613qo {
    public static final C20137613qo LIZ = new C20137613qo();
    public static final LruCache<String, C558340Lv6> LIZIZ = new LruCache<>(100);
    public static final LruCache<String, C0E21> LIZJ = new LruCache<>(100);

    public static C350360DoQ LIZIZ(String str) {
        int[] iArr = new int[16];
        int iNativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(str, iArr);
        if (iNativeGetAudioFileInfo == 0) {
            C350360DoQ c350360DoQ = new C350360DoQ();
            c350360DoQ.LIZ = iArr[3];
            return c350360DoQ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAudioFileInfo error with code=");
        sbLIZ.append(iNativeGetAudioFileInfo);
        C2484209oO.LIZJ("MediaUtil", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static C0E21 LIZJ(String str) {
        AwS114S1000000_30 awS114S1000000_30 = new AwS114S1000000_30(str, 2);
        C0E21 c0e21 = LIZJ.get(str);
        if (c0e21 == null) {
            return (C0E21) awS114S1000000_30.invoke();
        }
        return c0e21;
    }

    public static Pair LJ(C558340Lv6 c558340Lv6) {
        int i = c558340Lv6.LIZIZ;
        int i2 = c558340Lv6.LIZJ;
        int i3 = c558340Lv6.LIZLLL;
        if (i3 == 90 || i3 == 270) {
            i2 = i;
            i = i2;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C558340Lv6 LIZLLL(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20137613qo.LIZLLL(java.lang.String):X.0Lv6");
    }

    public static void LIZ(String str, BitmapFactory.Options options) {
        Object c098200Yq;
        try {
            options.inJustDecodeBounds = true;
            c098200Yq = C2471909mP.LIZLLL(str, options);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decodeBitmap error ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C355090Dw3.LIZLLL("MediaUtil", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
