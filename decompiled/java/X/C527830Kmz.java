package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicComponent$initData$1", f = "RecordChooseMusicComponentDiff.kt", l = {}, m = "invokeSuspend")
public final class C527830Kmz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C527830Kmz(InterfaceC1364105Vn<? super C527830Kmz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527830Kmz(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordChooseMusicComponent@3a14.initData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C526890KlT.LIZIZ.getClass();
        C0XED.LIZLLL();
        C0XED.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordChooseMusicComponent@3a14.initData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C527830Kmz(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
