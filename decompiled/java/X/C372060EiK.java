package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.scene.EditorProComponent$updateSceneInitData$2", f = "EditorProComponent.kt", l = {}, m = "invokeSuspend")
public final class C372060EiK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C372050EiJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C372060EiK(C372050EiJ c372050EiJ, InterfaceC1364105Vn<? super C372060EiK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c372050EiJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C372060EiK(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "EditorProComponent@ebc0.updateSceneInitData$2"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0EiJ r0 = r5.LL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.C5()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r0 = r0.pugcTemplateData
            boolean r1 = r0.isFromCreateTemplate
            r0 = 1
            if (r1 != r0) goto L67
        L1c:
            if (r0 == 0) goto L5a
            X.01GW r0 = X.C273820AoG.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.01GW r0 = X.C273830AoH.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = java.lang.Math.max(r1, r0)
        L3a:
            X.0E1f r2 = X.EnumC357850E1f.MAX_PIP_TRACK_COUNT
            X.0nzR r0 = X.C1455910nzR.LIZ
            r0.getClass()
            com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit r1 = X.C1455910nzR.LIZLLL()
            int r0 = r1.countLimit
            int r0 = java.lang.Math.max(r0, r3)
            r1.countLimit = r0
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.C0E5G.LIZJ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L5a:
            X.01GW r0 = X.C273820AoG.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            goto L3a
        L67:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372060EiK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
