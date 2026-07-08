package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectFirstTabPage$loadData$1$musicListResponseTask$1", f = "MusicCollectFirstTabPage.kt", l = {183}, m = "invokeSuspend")
public final class C859960XoQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859960XoQ(int i, InterfaceC1364105Vn<? super C859960XoQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859960XoQ c859960XoQ = new C859960XoQ(this.LLILLL, interfaceC1364105Vn);
        c859960XoQ.LLILLJJLI = obj;
        return c859960XoQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MusicCollectFirstTabPage@9c55.loadData$1$musicListResponseTask$1");
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
                int i2 = this.LLILLL;
                C20440014yU c20440014yU = C20440014yU.LJIIJ;
                this.LL = 1;
                obj = c20440014yU.LIZLLL(0, 12, i2, true, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectFirstTabPage@9c55.loadData$1$musicListResponseTask$1");
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
        C1C7U.LIZIZ("MusicCollectFirstTabPage@9c55.loadData$1$musicListResponseTask$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends CollectedMusicList, ? extends List<? extends MusicModel>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
