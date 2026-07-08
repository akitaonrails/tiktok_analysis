package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.music.music.collect.video.CollectVideoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectFirstTabPage$loadData$1$videoListResponseTask$1", f = "MusicCollectFirstTabPage.kt", l = {201}, m = "invokeSuspend")
public final class C859920XoM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CollectVideoResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C859920XoM(InterfaceC1364105Vn<? super C859920XoM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C859920XoM c859920XoM = new C859920XoM(interfaceC1364105Vn);
        c859920XoM.LLILLJJLI = obj;
        return c859920XoM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MusicCollectFirstTabPage@9c55.loadData$1$videoListResponseTask$1");
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
                this.LL = 1;
                obj = C859950XoP.LIZ(0, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicCollectFirstTabPage@9c55.loadData$1$videoListResponseTask$1");
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
        C1C7U.LIZIZ("MusicCollectFirstTabPage@9c55.loadData$1$videoListResponseTask$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CollectVideoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
