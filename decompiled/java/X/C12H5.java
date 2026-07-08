package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12H5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$sendRequest$1$handleEffectFetchResponseSuccess$1$2$2", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
public final class C12H5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<BeautyCategory> LL;
    public final /* synthetic */ C12HN LLILLJJLI;
    public final /* synthetic */ C19729512Hd LLILLL;
    public final /* synthetic */ C12H8 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12H5(List<BeautyCategory> list, C12HN c12hn, C19729512Hd c19729512Hd, C12H8 c12h8, InterfaceC1364105Vn<? super C12H5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c12hn;
        this.LLILLL = c19729512Hd;
        this.LLILZ = c12h8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12H5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("BeautySource@786f.sendRequest$1$handleEffectFetchResponseSuccess$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LJT sendRequest: assign allData from categories. allData size is ");
        sbLIZ.append(this.LL.size());
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C12HN c12hn = this.LLILLJJLI;
        c12hn.LJJIII = false;
        c12hn.LJJ(this.LL);
        C12HF.LIZIZ(0, this.LLILLL.LIZ, "success");
        C12H8 c12h8 = this.LLILZ;
        if (c12h8 != null) {
            c12h8.onSuccess();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("BeautySource@786f.sendRequest$1$handleEffectFetchResponseSuccess$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
