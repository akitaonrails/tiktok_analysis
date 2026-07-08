package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeAllMusicPage$loadMoreData$1$collectMusicResponse$1", f = "MusicCollectThemeAllMusicPage.kt", l = {99}, m = "invokeSuspend")
public final class C859980XoS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C154G LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859980XoS(C154G c154g, int i, InterfaceC1364105Vn<? super C859980XoS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c154g;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859980XoS c859980XoS = new C859980XoS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c859980XoS.LLILLJJLI = obj;
        return c859980XoS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1$collectMusicResponse$1");
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
                C154G c154g = this.LLILLL;
                int i2 = this.LLILZ;
                C20440014yU c20440014yU = C20440014yU.LJIIJ;
                int i3 = c154g.LLJJIJI.LIZJ;
                this.LL = 1;
                obj = c20440014yU.LIZLLL(i3, 12, i2, false, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1$collectMusicResponse$1");
                    return objLJFF;
                }
            }
            c098200Yq = (Pair) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("MusicCollectThemeAllMusicPage@cf93.loadMoreData$1$collectMusicResponse$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
