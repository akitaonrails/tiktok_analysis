package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.StickerManager$requestCheckApi$1$1", f = "StickerManager.kt", l = {148}, m = "invokeSuspend")
public final class C335401Rw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C335401Rw(InterfaceC1364105Vn<? super C335401Rw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335401Rw(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerManager@42fa.requestCheckApi$1$1");
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
            C2252331DDr c2252331DDr = C01S3.LIZIZ;
            Integer numLJ = C2286608xc.LJ(3);
            this.LL = 1;
            if (c2252331DDr.emit(numLJ, this) == objLJFF) {
                C1C7U.LIZIZ("StickerManager@42fa.requestCheckApi$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerManager@42fa.requestCheckApi$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C335401Rw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
