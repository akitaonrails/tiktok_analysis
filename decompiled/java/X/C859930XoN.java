package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.music.music.collect.video.CollectVideoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectSecondTabMusicVideoPage$loadMoreData$1$collectVideoResponse$1", f = "MusicCollectSecondTabMusicVideoPage.kt", l = {169}, m = "invokeSuspend")
public final class C859930XoN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CollectVideoResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C154P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859930XoN(C154P c154p, InterfaceC1364105Vn<? super C859930XoN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c154p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859930XoN c859930XoN = new C859930XoN(this.LLILLL, interfaceC1364105Vn);
        c859930XoN.LLILLJJLI = obj;
        return c859930XoN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int iIntValue;
        C1C7U.LIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1$collectVideoResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Integer num = this.LLILLL.LLJJJ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                this.LL = 1;
                obj = C859950XoP.LIZ(iIntValue, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1$collectVideoResponse$1");
                    return objLJFF;
                }
            }
            c098200Yq = (CollectVideoResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1$collectVideoResponse$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CollectVideoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
