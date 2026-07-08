package X;

import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12HD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$loadFromLocalDefault$1", f = "BeautySource.kt", l = {247}, m = "invokeSuspend")
public final class C12HD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12HN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12HD(C12HN c12hn, InterfaceC1364105Vn<? super C12HD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12hn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12HD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.loadFromLocalDefault$1");
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
            C12HN c12hn = this.LLILLJJLI;
            BeautyFilterConfig beautyFilterConfig = c12hn.LIZIZ;
            C19730912Hr c19730912Hr = beautyFilterConfig.dataConfig.LIZ;
            if (c19730912Hr != null) {
                c12hn.LJJII.getClass();
                List listLIZ = C19730612Ho.LIZ(c19730912Hr, beautyFilterConfig);
                C2238608ps c2238608ps = C2107608Nm.LIZ;
                C12HC c12hc = new C12HC(c12hn, listLIZ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c2238608ps, c12hc) == objLJFF) {
                    C1C7U.LIZIZ("BeautySource@786f.loadFromLocalDefault$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySource@786f.loadFromLocalDefault$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
