package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05XQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService$performRelationSearch$relationResults$1", f = "HorizontalMentionMixSearchService.kt", l = {174}, m = "invokeSuspend")
public final class C05XQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C316790CbN>>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<List<C316790CbN>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05XQ(AnonymousClass0957<? extends List<C316790CbN>> anonymousClass0957, InterfaceC1364105Vn<? super C05XQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05XQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.performRelationSearch$relationResults$1");
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
            AnonymousClass0957<List<C316790CbN>> anonymousClass0957 = this.LLILLJJLI;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performRelationSearch$relationResults$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performRelationSearch$relationResults$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C316790CbN>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
