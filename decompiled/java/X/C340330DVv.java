package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340330DVv {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams LIZIZ(android.app.Activity r4) {
        /*
            r3 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4b
            r0 = 33
            java.lang.String r2 = "key_pass_through"
            if (r1 < r0) goto L1d
            if (r4 == 0) goto L3d
            android.content.Intent r0 = r4.getIntent()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L3d
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L4b
            if (r1 == 0) goto L3d
            goto L3f
        L18:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4b
            goto L3d
        L1d:
            if (r4 == 0) goto L30
            android.content.Intent r0 = r4.getIntent()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L30
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L4b
            if (r0 == 0) goto L30
            goto L32
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4b
        L30:
            r1 = r3
            goto L38
        L32:
            android.os.Parcelable r1 = r0.getParcelable(r2)     // Catch: java.lang.Throwable -> L4b
            com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams r1 = (com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams) r1     // Catch: java.lang.Throwable -> L4b
        L38:
            boolean r0 = r1 instanceof com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            r1 = r3
            goto L47
        L3f:
            java.lang.Class<com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams> r0 = com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams.class
            java.lang.Object r1 = r1.getParcelable(r2, r0)     // Catch: java.lang.Throwable -> L4b
            com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams r1 = (com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams) r1     // Catch: java.lang.Throwable -> L4b
        L47:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L57:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L5e
            r3 = r1
        L5e:
            com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams r3 = (com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340330DVv.LIZIZ(android.app.Activity):com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams LIZJ(androidx.fragment.app.Fragment r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L4
            goto L6
        L4:
            r1 = r2
            goto L10
        L6:
            X.19EG r0 = r3.getActivity()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L4
            com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams r1 = LIZIZ(r0)     // Catch: java.lang.Throwable -> L14
        L10:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L14
            goto L20
        L14:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L20:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L27
            r2 = r1
        L27:
            com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams r2 = (com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340330DVv.LIZJ(androidx.fragment.app.Fragment):com.bytedance.effectcreatormobile.ckeapi.data.PassThroughParams");
    }

    public static final boolean LIZLLL(Activity activity) {
        String str;
        PassThroughParams passThroughParamsLIZIZ = LIZIZ(activity);
        if (passThroughParamsLIZIZ != null) {
            str = passThroughParamsLIZIZ.ameAigcEnterFrom;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF("ame_aigc_create_button", str) && !Intrinsics.LJFF("ame_aigc_template", str) && !Intrinsics.LJFF("ame_aigc_draft", str)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(C19EG c19eg) {
        String str;
        PassThroughParams passThroughParamsLIZIZ;
        PassThroughParams passThroughParamsLIZIZ2;
        String str2 = null;
        if (c19eg != null && (passThroughParamsLIZIZ2 = LIZIZ(c19eg)) != null) {
            str = passThroughParamsLIZIZ2.ameAigcEnterFrom;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "ame_aigc_template")) {
            if (c19eg != null && (passThroughParamsLIZIZ = LIZIZ(c19eg)) != null) {
                str2 = passThroughParamsLIZIZ.ameAigcEnterFrom;
            }
            if (!Intrinsics.LJFF(str2, "ame_aigc_draft")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final Map<String, String> LIZ(PassThroughParams passThroughParams, String... strArr) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (passThroughParams == null) {
            return linkedHashMap;
        }
        for (String str2 : strArr) {
            if (Intrinsics.LJFF(str2, "ame_enter_from")) {
                str = passThroughParams.ameEnterFrom;
            } else if (Intrinsics.LJFF(str2, "enter_from")) {
                str = passThroughParams.enterFrom;
            }
            linkedHashMap.put(str2, str);
        }
        return linkedHashMap;
    }

    public static final void LJFF(C19GS c19gs, PassThroughParams passThroughParams) {
        Intent intent;
        if (c19gs != null && (intent = c19gs.getIntent()) != null) {
            intent.putExtra("key_pass_through", passThroughParams);
        }
    }
}
