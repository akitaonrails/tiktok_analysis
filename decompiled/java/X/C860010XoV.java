package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeMusicPage$loadMoreData$1$collectMusicResponse$1", f = "MusicCollectThemeMusicPage.kt", l = {173}, m = "invokeSuspend")
public final class C860010XoV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C154L LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860010XoV(int i, C154L c154l, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c154l;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860010XoV c860010XoV = new C860010XoV(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c860010XoV.LLILLJJLI = obj;
        return c860010XoV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1$collectMusicResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C154L c154l = this.LLILLL;
                int i2 = this.LLILZ;
                C20440014yU c20440014yU = C20440014yU.LJIIJ;
                int i3 = c154l.LLJJIII.LIZJ;
                MusicThemeTag musicThemeTag = c154l.LLJJI;
                if (musicThemeTag != null) {
                    str = musicThemeTag.key;
                } else {
                    str = null;
                }
                this.LL = 1;
                obj = c20440014yU.LJI(i3, 12, i2, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1$collectMusicResponse$1");
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
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("MusicCollectThemeMusicPage@d38c.loadMoreData$1$collectMusicResponse$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
