package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene$onCreate$1", f = "TextToImageEditScene.kt", l = {131}, m = "invokeSuspend")
public final class C1430905it extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1430905it(InterfaceC1364105Vn<? super C1430905it> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1430905it(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageEditScene@591c.onCreate$1");
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
            if (C388300FKi.LIZJ().length() > 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TextToImageEditScene@591c.onCreate$1");
                return unit;
            }
            C0E4Z c0e4z = C0E4Z.LIZ;
            this.LL = 1;
            c0e4z.getClass();
            if (C0E4Z.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("TextToImageEditScene@591c.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageEditScene@591c.onCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1430905it(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
