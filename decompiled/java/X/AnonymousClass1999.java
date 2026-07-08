package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.1999, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1999 {
    public static final boolean LIZ(InterfaceC214902198i interfaceC214902198i) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        if (interfaceC214902198i != null && (sAFFragmentRootSceneIb = interfaceC214902198i.ib()) != null && C1447800nmM.LIZ(sAFFragmentRootSceneIb) != null) {
            return true;
        }
        return false;
    }

    public static final Bundle LIZIZ(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        Bundle bundle2 = parcelObtain.readBundle(NavigationScene.class.getClassLoader());
        if (bundle2 != null) {
            parcelObtain.recycle();
            return bundle2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Bundle LJ(Bundle bundle, Class<? extends InterfaceC214902198i> cls, C199B c199b, SAFContextThemeConfig sAFContextThemeConfig, boolean z) {
        if (c199b.LIZLLL) {
            bundle = LIZIZ(bundle);
        }
        C786410Ut5.LJJJI("fragmentClass", cls.getName(), bundle);
        if (!((Boolean) C18066075s.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJJIJL(bundle, "arg_context_config", sAFContextThemeConfig);
        }
        bundle.putBoolean("saf_navigation_marker", z);
        bundle.putBoolean("arg_navigate_with_reuse", c199b.LJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Navigator] navigateParam.useReuse:");
        sbLIZ.append(c199b.LJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(final X.InterfaceC214902198i r13, kotlin.jvm.functions.Function0<? extends X.InterfaceC214902198i> r14, java.lang.Class<? extends X.InterfaceC214902198i> r15, android.app.Activity r16, int r17, android.os.Bundle r18, X.C199B r19, X.C199S r20, com.ss.android.ugc.aweme.SAFContextThemeConfig r21) {
        /*
            r12 = r21
            r10 = r19
            r9 = r18
            r5 = r16
            r6 = r15
            r7 = r14
            if (r5 == 0) goto L5b
            if (r13 == 0) goto L14
            boolean r0 = LIZ(r13)
            if (r0 != 0) goto L6f
        L14:
            java.lang.Object r4 = r7.invoke()
            X.198i r4 = (X.InterfaceC214902198i) r4
            X.1991 r0 = X.C1800490wxD.LIZIZ(r4)
            r2 = 0
            if (r0 == 0) goto L5b
            boolean r1 = r0.LJIJI
            r0 = 1
            if (r1 != r0) goto L5b
            android.os.Bundle r3 = LJ(r9, r6, r10, r12, r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shell navigate saf: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "SAFNavigator"
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(r0, r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            r4.pg(r5, r3)
            return
        L5b:
            if (r13 != 0) goto L6f
            java.lang.String r3 = r6.getName()
            X.15nz r2 = new X.15nz
            java.lang.Object r1 = r7.invoke()
            X.198i r1 = (X.InterfaceC214902198i) r1
            java.lang.String r0 = "from null fragment."
            r2.<init>(r13, r1, r3, r0)
            throw r2
        L6f:
            com.ss.android.ugc.aweme.SAFFragmentRootScene r5 = r13.ib()
            java.lang.String r3 = ""
            if (r5 == 0) goto L96
            com.bytedance.scene.navigation.NavigationScene r4 = X.C1447800nmM.LIZ(r5)
            if (r4 == 0) goto L88
            r13 = 0
            r14 = 256(0x100, float:3.59E-43)
            r11 = r20
            r8 = r17
            LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L88:
            X.15nz r2 = new X.15nz
            java.lang.Object r1 = r7.invoke()
            X.198i r1 = (X.InterfaceC214902198i) r1
            java.lang.String r0 = "nav null"
            r2.<init>(r13, r1, r3, r0)
            throw r2
        L96:
            X.15nz r2 = new X.15nz
            java.lang.Object r1 = r7.invoke()
            X.198i r1 = (X.InterfaceC214902198i) r1
            java.lang.String r0 = "scene null"
            r2.<init>(r13, r1, r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1999.LIZLLL(X.198i, kotlin.jvm.functions.Function0, java.lang.Class, android.app.Activity, int, android.os.Bundle, X.199B, X.199S, com.ss.android.ugc.aweme.SAFContextThemeConfig):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030e  */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.0ELn, X.199G] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [X.19Ah] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [X.198i] */
    /* JADX WARN: Type inference failed for: r6v14, types: [X.15vF] */
    /* JADX WARN: Type inference failed for: r6v16, types: [X.15vG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.scene.navigation.NavigationScene r24, final com.ss.android.ugc.aweme.SAFFragmentRootScene r25, final java.lang.Class r26, kotlin.jvm.functions.Function0 r27, int r28, android.os.Bundle r29, X.C199B r30, X.C199S r31, com.ss.android.ugc.aweme.SAFContextThemeConfig r32, com.ss.android.ugc.aweme.SAFFragmentRootScene r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1999.LIZJ(com.bytedance.scene.navigation.NavigationScene, com.ss.android.ugc.aweme.SAFFragmentRootScene, java.lang.Class, kotlin.jvm.functions.Function0, int, android.os.Bundle, X.199B, X.199S, com.ss.android.ugc.aweme.SAFContextThemeConfig, com.ss.android.ugc.aweme.SAFFragmentRootScene, int):void");
    }
}
