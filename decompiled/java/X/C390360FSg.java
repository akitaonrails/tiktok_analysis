package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$initListener$1$onStickerEditDone$2", f = "StickerManager.kt", l = {210}, m = "invokeSuspend")
public final class C390360FSg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C390390FSj LLILLL;
    public final /* synthetic */ C259800zU<StickerModel> LLILZ;
    public final /* synthetic */ StickerModel LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C390360FSg(C390390FSj c390390FSj, C259800zU<StickerModel> c259800zU, StickerModel stickerModel, boolean z, InterfaceC1364105Vn<? super C390360FSg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c390390FSj;
        this.LLILZ = c259800zU;
        this.LLILZIL = stickerModel;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C390360FSg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[LOOP:1: B:20:0x007b->B:22:0x0081, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "StickerManager@19f6.initListener$1$onStickerEditDone$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L47
            if (r0 != r3) goto L95
            X.00zU r1 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L15:
            r1.element = r8
        L17:
            X.0FSj r0 = r7.LLILLL
            java.util.List<X.0FTB> r0 = r0.LJIILIIL
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r5 = r7.LLILZIL
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0FTB r0 = (X.C0FTB) r0
            X.0oFx[] r1 = r0.LJJIJIL()
            X.0oFx r0 = r5.getStickerType()
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 == 0) goto L28
            r4.add(r2)
            goto L28
        L47:
            X.C155000ia.LIZIZ(r8)
            X.0FSj r0 = r7.LLILLL
            java.util.List<X.0FTJ<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel>> r1 = r0.LJIIL
            X.00zU<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r0 = r7.LLILZ
            T r0 = r0.element
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.StickerModel) r0
            int r0 = r0.getId()
            X.0FTJ r2 = X.C0FKU.LIZ(r0, r1)
            if (r2 == 0) goto L17
            X.00zU<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r1 = r7.LLILZ
            r7.LL = r1
            r7.LLILLJJLI = r3
            r0 = 0
            java.lang.Object r8 = r2.LJIJJ(r0, r7)
            if (r8 != r4) goto L15
            X.C1C7U.LIZIZ(r6)
            return r4
        L6f:
            java.util.List r0 = X.C13LP.LLIIII(r4)
            X.00zU<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r4 = r7.LLILZ
            boolean r3 = r7.LLILZLL
            java.util.Iterator r2 = r0.iterator()
        L7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()
            X.0FTB r1 = (X.C0FTB) r1
            T r0 = r4.element
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.StickerModel) r0
            r1.LIZ(r0, r3)
            goto L7b
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390360FSg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
