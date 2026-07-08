package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C978703s9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0260 A[Catch: s -> 0x0275, Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:165:0x0255, B:167:0x0269, B:170:0x0272, B:176:0x027c, B:174:0x0278, B:166:0x0260), top: B:197:0x023f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.AddressEditEnterParams LIZJ(android.content.Intent r39) {
        /*
            Method dump skipped, instruction units count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978703s9.LIZJ(android.content.Intent):com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressEditEnterParams");
    }

    public static Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static String LIZIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
