package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FW8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerOpShortCuts$showShortCuts$1", f = "StickerOpShortCuts.kt", l = {66, 67}, m = "invokeSuspend")
public final class C0FW8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLL;
    public final /* synthetic */ C0FW7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FW8(C0FTJ<? extends StickerModel> c0ftj, C0FTJ<? extends StickerModel> c0ftj2, C0FW7 c0fw7, InterfaceC1364105Vn<? super C0FW8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = c0ftj2;
        this.LLILZ = c0fw7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FW8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "StickerOpShortCuts@8772.showShortCuts$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L58
            if (r0 == r1) goto L69
            if (r0 != r2) goto L7a
            X.C155000ia.LIZIZ(r6)
        L16:
            X.0FW7 r0 = r5.LLILZ
            android.view.View r0 = r0.LJJIL()
            android.view.ViewParent r0 = r0.getParent()
            r2 = 0
            if (r0 != 0) goto L49
            X.0FW7 r0 = r5.LLILZ
            android.widget.FrameLayout r1 = r0.LLILLJJLI
            android.view.View r0 = r0.LJJIL()
            r1.addView(r0)
            X.0FW7 r0 = r5.LLILZ
            android.view.View r0 = r0.LJJIL()
            X.C786410Ut5.LJLLLLLL(r2, r0)
            kotlin.jvm.internal.AwS549S0100000_5 r2 = new kotlin.jvm.internal.AwS549S0100000_5
            X.0FW7 r1 = r5.LLILZ
            r0 = 1011(0x3f3, float:1.417E-42)
            r2.<init>(r1, r0)
            X.C01TT.LIZJ(r2)
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L49:
            X.0FW7 r0 = r5.LLILZ
            android.view.View r0 = r0.LJJIL()
            X.C786410Ut5.LJLLLLLL(r2, r0)
            X.0FW7 r0 = r5.LLILZ
            r0.LJJIJIL()
            goto L43
        L58:
            X.C155000ia.LIZIZ(r6)
            X.0FTJ<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r0 = r5.LLILLJJLI
            r5.LL = r1
            java.lang.Object r0 = r0.LJIJJ(r1, r5)
            if (r0 != r3) goto L6c
            X.C1C7U.LIZIZ(r4)
            return r3
        L69:
            X.C155000ia.LIZIZ(r6)
        L6c:
            X.0FTJ<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r0 = r5.LLILLL
            r5.LL = r2
            java.lang.Object r0 = r0.LJIJJ(r1, r5)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r4)
            return r3
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FW8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
