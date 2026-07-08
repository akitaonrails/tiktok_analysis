package X;

import com.ss.android.ugc.aweme.tako.setting.TakoWsConfigInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05BY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.channel.TakoWsClient$timer$1", f = "TakoWsClient.kt", l = {54}, m = "invokeSuspend")
public final class C05BY extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05BY(InterfaceC1364105Vn<? super C05BY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05BY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoWsClient@7403.timer$1");
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
            TakoWsConfigInfoModel takoWsConfigInfoModel = C05BZ.LIZ;
            long j = C05BZ.LIZLLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TakoWsClient@7403.timer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoWsClient@7403.timer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        num.intValue();
        return new C05BY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
