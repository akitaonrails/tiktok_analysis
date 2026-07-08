package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImpressionUtil$save$1", f = "ImpressionUtil.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1752470vhl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1752460vhk LLILLJJLI;
    public final /* synthetic */ List<Feed> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752470vhl(C1752460vhk c1752460vhk, List<Feed> list, InterfaceC1364105Vn<? super C1752470vhl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1752460vhk;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752470vhl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImpressionUtil@30d0.save$1");
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
            C1752510vhp c1752510vhp = InterfaceC1752540vhs.LIZ;
            WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest(this.LLILLJJLI.LIZ, this.LLILLL, null, null);
            this.LL = 1;
            if (c1752510vhp.LIZIZ(writeImpressionRequest, this) == objLJFF) {
                C1C7U.LIZIZ("ImpressionUtil@30d0.save$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImpressionUtil@30d0.save$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
