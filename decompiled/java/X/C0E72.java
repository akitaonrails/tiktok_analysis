package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E72, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmap$1", f = "StickerItemView.kt", l = {695, 696}, m = "invokeSuspend")
public final class C0E72 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C367470Eav LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E72(C367470Eav c367470Eav, String str, InterfaceC1364105Vn<? super C0E72> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c367470Eav;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E72(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "StickerItemView@8b0e.getDrawBitmap$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L7a
            if (r0 != r5) goto L97
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            X.0Eav r0 = r8.LLILLJJLI
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.getNleTrackSlot$editor_trackpanel_release()
            r6 = 0
            if (r0 == 0) goto L52
            boolean r0 = X.C351220Dpo.LLJJJIL(r0)
            if (r0 != r2) goto L52
            X.0Eav r0 = r8.LLILLJJLI
            int r3 = r0.LLLJ
        L32:
            X.0Eav r0 = r8.LLILLJJLI
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.getNleTrackSlot$editor_trackpanel_release()
            if (r0 == 0) goto L6a
            boolean r0 = X.C351220Dpo.LLJJJIL(r0)
            if (r0 != r2) goto L6a
            java.lang.String r1 = r8.LLILLL
            java.lang.String r0 = "gif"
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r6)
            if (r0 == 0) goto L6a
            X.0Eav r1 = r8.LLILLJJLI
            java.lang.String r0 = r8.LLILLL
            r1.LJIILIIL(r3, r0)
            goto L16
        L52:
            X.0Eav r0 = r8.LLILLJJLI
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r0.getNleTrackSlot$editor_trackpanel_release()
            if (r0 == 0) goto L65
            boolean r0 = X.C351220Dpo.LLJZIJLIL(r0)
            if (r0 != r2) goto L65
            X.0Eav r0 = r8.LLILLJJLI
            int r3 = r0.LLLJIL
            goto L32
        L65:
            X.0Eav r0 = r8.LLILLJJLI
            int r3 = r0.LLLIZZ
            goto L32
        L6a:
            X.0Eav r1 = r8.LLILLJJLI
            java.lang.String r0 = r8.LLILLL
            r8.LL = r2
            java.lang.Object r9 = r1.LJIILL(r3, r3, r0, r8)
            if (r9 != r4) goto L7d
            X.C1C7U.LIZIZ(r7)
            return r4
        L7a:
            X.C155000ia.LIZIZ(r9)
        L7d:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0E71 r2 = new X.0E71
            X.0Eav r1 = r8.LLILLJJLI
            r0 = 0
            r2.<init>(r1, r9, r0)
            r8.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r7)
            return r4
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E72.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
