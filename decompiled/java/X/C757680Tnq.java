package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment$onViewCreated$2$1$1", f = "MusicGiftDetailPageDialogFragment.kt", l = {142}, m = "invokeSuspend")
public final class C757680Tnq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P1<C1147340fxk> LLILLJJLI;
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757680Tnq(C05P1<C1147340fxk> c05p1, MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, InterfaceC1364105Vn<? super C757680Tnq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p1;
        this.LLILLL = musicGiftDetailPageDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C757680Tnq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new C757690Tnr(this.LLILLJJLI));
            final MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LLILLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fxV
                /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, X.InterfaceC1364105Vn r11) {
                    /*
                        r9 = this;
                        r4 = r10
                        X.0fxk r4 = (X.C1147340fxk) r4
                        com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment r0 = r1
                        X.1DUN r3 = r0.LLJZ
                        if (r3 == 0) goto L2c
                        X.0fxk r0 = r3.LLILLL
                        r2 = 0
                        if (r0 == 0) goto L40
                        boolean r1 = r0.LJIIIIZZ
                        r0 = 1
                        if (r1 != r0) goto L40
                    L13:
                        r3.LLILLL = r4
                        if (r0 == 0) goto L25
                        boolean r0 = r4.LJIIIIZZ
                        if (r0 != 0) goto L25
                        r0 = 0
                        r3.LLIZLLLIL = r0
                        r3.LLJ = r0
                        r3.LLJI = r0
                        r3.LJ()
                    L25:
                        boolean r0 = r3.LLILZIL
                        if (r0 == 0) goto L2f
                        r3.LJFF(r2)
                    L2c:
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        return r0
                    L2f:
                        X.0jXb r1 = r3.LL
                        X.05dG r0 = r3.LLILZ
                        float r5 = r0.LIZJ
                        r6 = 0
                        r7 = r6
                        r8 = r6
                        X.0jbd r0 = r3.LIZ(r4, r5, r6, r7, r8)
                        r1.setUniforms(r0)
                        goto L2c
                    L40:
                        r0 = 0
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1147190fxV.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (c095dLJIIIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
