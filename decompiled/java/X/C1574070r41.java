package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.preload.CollectionVideo;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaVideoApi;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.MiniDramaAwemeCacheServiceImpl$preloadAwemeForComponent$2$1$1", f = "MiniDramaAwemeCacheServiceImpl.kt", l = {95}, m = "invokeSuspend")
public final class C1574070r41 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574070r41(String str, long j, String str2, InterfaceC1364105Vn<? super C1574070r41> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1574070r41(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        CollectionVideo collectionVideo;
        PaidVideoItem paidVideoItem;
        C1C7U.LIZ("MiniDramaAwemeCacheServiceImpl@40f7.preloadAwemeForComponent$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Aweme aweme2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1617470sC1 c1617470sC1 = MiniDramaVideoApi.LIZ;
                String str = this.LLILLJJLI;
                List listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILLL));
                String str2 = this.LLILZ;
                this.LL = 1;
                obj = c1617470sC1.LIZJ(listSingletonList, str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MiniDramaAwemeCacheServiceImpl@40f7.preloadAwemeForComponent$2$1$1");
                    return objLJFF;
                }
            }
            List list = (List) obj;
            if (list != null && (collectionVideo = (CollectionVideo) C13LP.LJJJLZIJ(0, list)) != null && (paidVideoItem = collectionVideo.video) != null) {
                aweme = paidVideoItem.aweme;
            } else {
                aweme = null;
            }
            if (C1579380rCa.LIZ(aweme)) {
                C1C7U.LIZIZ("MiniDramaAwemeCacheServiceImpl@40f7.preloadAwemeForComponent$2$1$1");
                return null;
            }
            aweme2 = aweme;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("MiniDramaAwemeCacheServiceImpl@40f7.preloadAwemeForComponent$2$1$1");
        return aweme2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
