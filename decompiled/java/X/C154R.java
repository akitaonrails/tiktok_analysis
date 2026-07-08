package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.collect.video.CollectVideoResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeVideoPage$loadData$1", f = "MusicCollectThemeVideoPage.kt", l = {166}, m = "invokeSuspend")
public final class C154R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154Q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154R(C154Q c154q, InterfaceC1364105Vn<? super C154R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154R(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        C1C7U.LIZ("MusicCollectThemeVideoPage@6ffb.loadData$1");
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
            C154Q c154q = this.LLILLJJLI;
            if (c154q.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadData$1");
                return unit;
            }
            c154q.LLJIJIL = true;
            c154q.LJJIFFI();
            C1DFB c1dfb = C0PEM.LIZJ;
            C859910XoL c859910XoL = new C859910XoL(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c859910XoL);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadData$1");
                return objLJFF;
            }
        }
        CollectVideoResponse collectVideoResponse = (CollectVideoResponse) obj;
        if (collectVideoResponse != null) {
            List<Aweme> awemeList = collectVideoResponse.getAwemeList();
            ArrayList arrayList = new ArrayList();
            if (awemeList != null) {
                for (Aweme aweme : awemeList) {
                    if (aweme.getMusic() != null) {
                        MusicModel musicModelConvertToMusicModel = aweme.getMusic().convertToMusicModel();
                        musicModelConvertToMusicModel.setLogPbOrNot(collectVideoResponse.getLogPb());
                        VideoMusicModel videoMusicModel = new VideoMusicModel(aweme, musicModelConvertToMusicModel);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("aweme_");
                        sbLIZ.append(aweme.getAid());
                        videoMusicModel.setId(C2188811AlT.LIZIZ(sbLIZ).hashCode());
                        arrayList.add(videoMusicModel);
                    }
                }
            }
            ((ArrayList) this.LLILLJJLI.LLJJIII.LIZ).clear();
            ((ArrayList) this.LLILLJJLI.LLJJIII.LIZ).addAll(arrayList);
            C154W c154w = this.LLILLJJLI.LLJJIII;
            c154w.LIZLLL = true;
            c154w.LJ = true;
            this.LLILLJJLI.LLJJIII.LIZIZ = collectVideoResponse.getNextCursor();
            C154W c154w2 = this.LLILLJJLI.LLJJIII;
            Boolean hasMore = collectVideoResponse.getHasMore();
            if (hasMore != null) {
                zBooleanValue = hasMore.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c154w2.LIZJ = zBooleanValue;
            C154W c154w3 = this.LLILLJJLI.LLJJIII;
            arrayList.size();
            c154w3.getClass();
            if (((ArrayList) this.LLILLJJLI.LLJJIII.LIZ).isEmpty()) {
                this.LLILLJJLI.LJJ();
            } else {
                this.LLILLJJLI.LJJIII();
                this.LLILLJJLI.LJIL();
            }
        } else {
            ((ArrayList) this.LLILLJJLI.LLJJIII.LIZ).clear();
            C154W c154w4 = this.LLILLJJLI.LLJJIII;
            c154w4.LIZLLL = true;
            c154w4.LJ = false;
            this.LLILLJJLI.LLJJIII.LIZIZ = C2286608xc.LJ(0);
            C154Q c154q2 = this.LLILLJJLI;
            c154q2.LLJJIII.LIZJ = false;
            c154q2.LJJI();
        }
        C154Q c154q3 = this.LLILLJJLI;
        c154q3.LLJIJIL = false;
        c154q3.LLJILJIL = true;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
