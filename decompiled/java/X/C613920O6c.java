package X;

import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceProviderImpl;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent$showSkylight$1$1", f = "RecommendFeedComponent.kt", l = {282}, m = "invokeSuspend")
public final class C613920O6c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ RecommendFeedComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613920O6c(long j, RecommendFeedComponent recommendFeedComponent, InterfaceC1364105Vn<? super C613920O6c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = recommendFeedComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613920O6c(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendFeedComponent@e7a3.showSkylight$1$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("RecommendFeedComponent@e7a3.showSkylight$1$1");
                return objLJFF;
            }
        }
        FeedSkylightServiceProviderImpl.LJIIIIZZ().LJ().LJII(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendFeedComponent@e7a3.showSkylight$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
