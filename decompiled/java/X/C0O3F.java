package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.ab.FeedDiggFakeWriteOptExp;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.digg.request.VideoDiggRepository$operator$1$diggAweme$1", f = "VideoDiggRepository.kt", l = {96}, m = "invokeSuspend")
public final class C0O3F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0O99 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<String, Integer, Boolean, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function2<String, Exception, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O3F(C0O99 c0o99, Map<String, String> map, String str, int i, InterfaceC1631620sYq<? super String, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq, String str2, Function2<? super String, ? super Exception, Unit> function2, InterfaceC1364105Vn<? super C0O3F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0o99;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = str2;
        this.LLIZLLLIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3F(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        C1C7U.LIZ("VideoDiggRepository@33d5.operator$1$diggAweme$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C0O99 c0o99 = this.LLILLJJLI;
            Map<String, String> map = this.LLILLL;
            c0o99.LL.LJ();
            c0o99.LL.LIZLLL = "ttk_aweme_digg_api_monitor";
            String str = map.get("enter_from");
            if (!TextUtils.isEmpty(str)) {
                c0o99.LL.LIZIZ(str, "enter_from");
            }
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c0o99.LL.LIZIZ(str2, "digg_type");
            }
            C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0O3S(this.LLILLL));
            C0O7F.LJ(c613960O6gLIZ, new InterfaceC613660O5c<C0O3G>() { // from class: X.0O3C
                @Override // X.InterfaceC613660O5c
                public final C613670O5d<C0O3G> LIZ(C613670O5d<C0O3G> c613670O5d) {
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c613670O5d.LIZ);
                    if (thM5exceptionOrNullimpl != null && (thM5exceptionOrNullimpl instanceof C23112093u)) {
                        return C613670O5d.LIZ(c613670O5d, null, C613690O5f.LIZ(c613670O5d.LIZIZ), 1);
                    }
                    return c613670O5d;
                }
            });
            final String str3 = this.LLILZ;
            C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str3) { // from class: X.0O7d
                public final String LIZIZ;
                public final C614260O7k LIZJ;

                @Override // X.InterfaceC614350O7t
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC614210O7f
                public final AbstractC614250O7j LIZIZ() {
                    return this.LIZJ;
                }

                {
                    this.LIZIZ = str3;
                    C614260O7k c614260O7k = C614260O7k.LIZIZ;
                    c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                    this.LIZJ = c614260O7k;
                }
            });
            C0O7F.LJFF(c613960O6gLIZ, new C0O3G(new BaseResponse()));
            C01GW c01gw = FeedDiggFakeWriteOptExp.LIZ;
            FeedDiggFakeWriteOptExp.FakeWriteConfig fakeWriteConfig = (FeedDiggFakeWriteOptExp.FakeWriteConfig) c01gw.getValue();
            if (fakeWriteConfig != null) {
                i = fakeWriteConfig.retryCount;
            } else {
                i = 2;
            }
            FeedDiggFakeWriteOptExp.FakeWriteConfig fakeWriteConfig2 = (FeedDiggFakeWriteOptExp.FakeWriteConfig) c01gw.getValue();
            if (fakeWriteConfig2 != null) {
                i2 = fakeWriteConfig2.retryInterval;
            } else {
                i2 = 5;
            }
            C0O7F.LJII(c613960O6gLIZ, new C613690O5f(i, ((long) (i2 * 60)) * 1000, true));
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZ.LIZIZ();
            final C0O99 c0o992 = this.LLILLJJLI;
            final String str4 = this.LLILZ;
            final int i4 = this.LLILZIL;
            final InterfaceC1631620sYq<String, Integer, Boolean, Unit> interfaceC1631620sYq = this.LLILZLL;
            final Map<String, String> map2 = this.LLILLL;
            final String str5 = this.LLIZ;
            final Function2<String, Exception, Unit> function2 = this.LLIZLLLIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0NNX
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
                    C1DFH c1dfh = C0PEM.LIZ;
                    Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O7P((C0O7A) obj2, c0o992, str4, i4, interfaceC1631620sYq, map2, str5, jCurrentTimeMillis, function2, null));
                    if (objLJI != C099R.LJFF()) {
                        return Unit.LIZ;
                    }
                    return objLJI;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("VideoDiggRepository@33d5.operator$1$diggAweme$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoDiggRepository@33d5.operator$1$diggAweme$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
