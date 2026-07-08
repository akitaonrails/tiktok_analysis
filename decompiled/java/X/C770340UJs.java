package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VideoModeContainer$1$1", f = "VideoModeContainer.kt", l = {473}, m = "invokeSuspend")
public final class C770340UJs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C770200UJe LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770340UJs(C770200UJe c770200UJe, InterfaceC1364105Vn<? super C770340UJs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c770200UJe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770340UJs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "VideoModeContainer@8970.<init>$1$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 != r1) goto L68
            X.C155000ia.LIZIZ(r6)
        L14:
            X.0UJe r0 = r5.LLILLJJLI
            r0.LLLZL = r2
        L18:
            java.lang.String r2 = "VideoModeContainer"
            java.lang.String r0 = "all_banner_container try visible2"
            X.C20441214yg.LIZIZ(r2, r0)
            X.0UJe r0 = r5.LLILLJJLI
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getAllBannerContainerFromXml()
            int r1 = r0.getVisibility()
            r0 = 4
            if (r1 != r0) goto L4b
            java.lang.String r0 = "all_banner_container visible"
            X.C20441214yg.LIZIZ(r2, r0)
            X.0UJe r0 = r5.LLILLJJLI
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.getAllBannerContainerFromXml()
            X.C500260Jjc.LLFFF(r0)
            java.lang.Class<com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget> r0 = com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget.class
            X.12Dl r0 = X.C13LE.LIZ(r0)
            com.bytedance.android.live.broadcast.preview.PreviewWidget r0 = X.C0UKC.LJFF(r0)
            com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget r0 = (com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget) r0
            if (r0 == 0) goto L4b
            r0.I1()
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L51:
            X.C155000ia.LIZIZ(r6)
            X.0UJe r0 = r5.LLILLJJLI
            boolean r0 = r0.LLLZL
            if (r0 == 0) goto L18
            r5.LL = r1
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r3) goto L14
            X.C1C7U.LIZIZ(r4)
            return r3
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770340UJs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
