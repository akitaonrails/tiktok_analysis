package X;

import kotlin.Pair;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339780DTs {
    public static final void LIZ(C123700dX c123700dX, C1737170vJ5 c1737170vJ5) {
        C339790DTt c339790DTtLIZ = c1737170vJ5.LIZ();
        if (c339790DTtLIZ == null) {
            return;
        }
        C1737910vKH.LIZ("advanced_mobile_open_result", C2097608Jq.LJIIIIZZ(new Pair("enter_from", c339790DTtLIZ.LIZIZ), new Pair("ame_enter_from", c339790DTtLIZ.LIZJ), new Pair("open_project_result", String.valueOf(c123700dX.LIZIZ))));
        C1737910vKH.LIZ("advanced_mobile_editor_open", C2097608Jq.LJIIIIZZ(new Pair("is_pro_template", c339790DTtLIZ.LJIJI), new Pair("is_h5_entry", c339790DTtLIZ.LJIJ), new Pair("enter_from", c339790DTtLIZ.LIZIZ), new Pair("ame_enter_from", c339790DTtLIZ.LIZJ), new Pair("is_photo_mode", c339790DTtLIZ.LJIIIZ)));
    }

    public static final Object LIZIZ(C1737170vJ5 c1737170vJ5, InterfaceC1364105Vn<? super C123700dX> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LIZJ(c1737170vJ5, new AwS583S0100000_4(c2252611DEt, 223));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1737170vJ5 r9, kotlin.jvm.functions.Function1<? super X.C123700dX, kotlin.Unit> r10) {
        /*
            boolean r0 = X.C299080Bnu.LIZ()
            r4 = 0
            if (r0 == 0) goto L2b
            X.0DTt r0 = r9.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r3 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r3 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r3
            if (r3 == 0) goto L66
            if (r0 == 0) goto L59
            android.content.Context r2 = r0.LIZ
            java.lang.String r0 = r0.LJ
            if (r0 != 0) goto L24
        L22:
            java.lang.String r0 = ""
        L24:
            r1 = 1
            boolean r0 = r3.LIZJ(r2, r0, r1)
            if (r0 != r1) goto L66
        L2b:
            java.lang.Class<com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService> r3 = com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService r3 = (com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService) r3
            java.lang.String r2 = "EffectCreatorServiceWrapper"
            if (r3 != 0) goto L5b
            X.0DTu r1 = X.C339800DTu.LIZIZ
            java.lang.String r0 = "cannot get IEffectCreatorService"
            X.C201955140j.LJIIIIZZ(r1, r2, r0)
            X.0DTu r1 = X.C339800DTu.LIZIZ
            java.lang.String r0 = "openProject, df not found"
            X.C201955140j.LJIIIIZZ(r1, r2, r0)
            X.00dX r2 = new X.00dX
            r1 = 5
            java.lang.String r0 = "ame dynamic feature not found"
            r2.<init>(r4, r1, r0)
            LIZ(r2, r9)
            r10.invoke(r2)
            return
        L59:
            r2 = 0
            goto L22
        L5b:
            kotlin.jvm.internal.AwS370S0200000_4 r1 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 52
            r1.<init>(r9, r10, r0)
            r3.LIZ(r9, r1)
            return
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339780DTs.LIZJ(X.0vJ5, kotlin.jvm.functions.Function1):void");
    }
}
