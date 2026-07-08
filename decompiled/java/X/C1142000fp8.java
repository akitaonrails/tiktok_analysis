package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$audioSpectrumListener$1$1", f = "MusicGiftPreviewPlayer.kt", l = {}, m = "invokeSuspend")
public final class C1142000fp8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1143590frh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142000fp8(C1143590frh c1143590frh, InterfaceC1364105Vn<? super C1142000fp8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1143590frh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1142000fp8(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "MusicGiftPreviewPlayer@5196.audioSpectrumListener$1$1"
            X.C1C7U.LIZ(r2)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r4)
            boolean r0 = X.C1142070fpF.LJIIJJI
            if (r0 != 0) goto L21
            X.1DDq r0 = X.C1142070fpF.LIZLLL
            java.lang.Object r0 = r0.getValue()
            X.0fpA r0 = (X.C1142020fpA) r0
            X.0fgr r0 = r0.LIZ
            if (r0 == 0) goto L37
            X.0fpQ r1 = r0.LJIIIIZZ
        L1d:
            X.0fpQ r0 = X.EnumC1142180fpQ.SECONDARY_PAGE
            if (r1 != r0) goto L31
        L21:
            X.0fpF r0 = X.C1142070fpF.LIZ
            X.0frh r1 = r3.LL
            r0.getClass()
            com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService r0 = X.C1142070fpF.LJIILIIL()
            if (r0 == 0) goto L31
            r0.Hk0(r1)
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r2)
            return r0
        L37:
            r1 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142000fp8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
