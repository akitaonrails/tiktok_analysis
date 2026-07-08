package X;

import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM$onAwemesLoad$3", f = "JSBVideoDetailShareVM.kt", l = {}, m = "invokeSuspend")
public final class C326440Cqw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSBVideoDetailShareVM LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C326440Cqw(JSBVideoDetailShareVM jSBVideoDetailShareVM, List<? extends Aweme> list, boolean z, InterfaceC1364105Vn<? super C326440Cqw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSBVideoDetailShareVM;
        this.LLILLJJLI = list;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326440Cqw(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("JSBVideoDetailShareVM@10df.onAwemesLoad$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLIZ = new C326480Cr0(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("JSBVideoDetailShareVM@10df.onAwemesLoad$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
