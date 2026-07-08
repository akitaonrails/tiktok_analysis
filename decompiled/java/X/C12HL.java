package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUesTabInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12HL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$getUsedBeautyInfo$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
public final class C12HL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C12HN LL;
    public final /* synthetic */ Function1<BeautifyUsedInfo, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12HL(C12HN c12hn, Function1<? super BeautifyUsedInfo, Unit> function1, InterfaceC1364105Vn<? super C12HL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c12hn;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12HL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.getUsedBeautyInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object value = this.LL.LJJ.getValue();
        C12HN c12hn = this.LL;
        Function1<BeautifyUsedInfo, Unit> function1 = this.LLILLJJLI;
        synchronized (value) {
            try {
                c12hn.LJIILIIL().info.clear();
                for (BeautyCategory beautyCategory : c12hn.LJI) {
                    if (c12hn.oe(beautyCategory.getCategoryResponse().getId(), false)) {
                        BeautifyUesTabInfo beautifyUesTabInfoLIZIZ = C12HM.LIZIZ(beautyCategory.getCategoryResponse().getName(), beautyCategory.getBeautyList());
                        if (!beautifyUesTabInfoLIZIZ.parentNameList.isEmpty()) {
                            c12hn.LJIILIIL().info.add(beautifyUesTabInfoLIZIZ);
                        }
                    }
                }
                ((ArrayList) c12hn.LJIJJLI).clear();
                ((ArrayList) c12hn.LJIJJLI).addAll(c12hn.LJIILIIL().info);
                C12JP c12jp = c12hn.LJIILLIIL;
                if (c12jp != null) {
                    c12hn.LJIILIIL();
                    InterfaceC19731912Ib interfaceC19731912Ib = c12jp.LIZ;
                    if (interfaceC19731912Ib != null) {
                        interfaceC19731912Ib.LJFF();
                    }
                }
                if (function1 != null) {
                    function1.invoke(c12hn.LJIILIIL());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySource@786f.getUsedBeautyInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
