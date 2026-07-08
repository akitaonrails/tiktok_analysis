package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05PW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$reset$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C05PW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05PW(InterfaceC1364105Vn<? super C05PW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.reset$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1347505Pd c1347505Pd = C1347505Pd.LIZ;
        C1347505Pd.LJIIL = C0XQ7.LJFF().getCurUserId();
        C1347505Pd.LJFF = true;
        C1347505Pd.LJII.clear();
        C1347505Pd.LJI.clear();
        C1347505Pd.LIZLLL = null;
        ((ArrayList) C1347505Pd.LIZJ).clear();
        C1347505Pd.LJFF = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.reset$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05PW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
