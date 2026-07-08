package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.rss.api.models.GetRssFeedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.repo.RssRepoImpl$fetchRssFeed$resp$1", f = "RssRepo.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1165980gRo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetRssFeedResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165980gRo(String str, Integer num, String str2, InterfaceC1364105Vn<? super C1165980gRo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165980gRo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RssRepoImpl@e91c.fetchRssFeed$resp$1");
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
            InterfaceC1166000gRq.LIZ.getClass();
            InterfaceC1166000gRq value = C1166010gRr.LIZIZ.getValue();
            String str = this.LLILLJJLI;
            Integer num = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            obj = value.LIZIZ(str, num, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RssRepoImpl@e91c.fetchRssFeed$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RssRepoImpl@e91c.fetchRssFeed$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetRssFeedResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
