package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.collect.video.CollectVideoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.154S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectSecondTabMusicVideoPage$loadMoreData$1", f = "MusicCollectSecondTabMusicVideoPage.kt", l = {166}, m = "invokeSuspend")
public final class C154S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154S(C154P c154p, InterfaceC1364105Vn<? super C154S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154S(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C154P c154p;
        C129L c129l;
        C1C7U.LIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1");
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
            C154P c154p2 = this.LLILLJJLI;
            if (c154p2.LLJIJIL) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1");
                return unit;
            }
            c154p2.LLJIJIL = true;
            C129L c129l2 = c154p2.LLJI;
            if (c129l2 != null) {
                c129l2.showLoadMoreLoading();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C859930XoN c859930XoN = new C859930XoN(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c859930XoN);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1");
                return objLJFF;
            }
        }
        CollectVideoResponse collectVideoResponse = (CollectVideoResponse) obj;
        if (collectVideoResponse != null) {
            List<Aweme> awemeList = collectVideoResponse.getAwemeList();
            ArrayList arrayList = new ArrayList();
            if (awemeList != null) {
                C154P c154p3 = this.LLILLJJLI;
                for (Aweme aweme : awemeList) {
                    if (aweme.getMusic() != null) {
                        Iterator it2 = ((ArrayList) c154p3.LLJJIJI.LIZ).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                MusicModel musicModel = (MusicModel) it2.next();
                                if (!(musicModel instanceof VideoMusicModel) || !Intrinsics.LJFF(((VideoMusicModel) musicModel).getAweme().getAid(), aweme.getAid())) {
                                }
                            } else {
                                MusicModel musicModelConvertToMusicModel = aweme.getMusic().convertToMusicModel();
                                musicModelConvertToMusicModel.setLogPbOrNot(collectVideoResponse.getLogPb());
                                VideoMusicModel videoMusicModel = new VideoMusicModel(aweme, musicModelConvertToMusicModel);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("aweme_");
                                sbLIZ.append(aweme.getAid());
                                videoMusicModel.setId(C2188811AlT.LIZIZ(sbLIZ).hashCode());
                                arrayList.add(videoMusicModel);
                                break;
                            }
                        }
                    }
                }
            }
            ((ArrayList) this.LLILLJJLI.LLJJIJI.LIZ).addAll(arrayList);
            C154W c154w = this.LLILLJJLI.LLJJIJI;
            arrayList.size();
            c154w.getClass();
            this.LLILLJJLI.LLJJIJI.LIZIZ = collectVideoResponse.getNextCursor();
            C154W c154w2 = this.LLILLJJLI.LLJJIJI;
            Boolean hasMore = collectVideoResponse.getHasMore();
            if (hasMore != null) {
                zBooleanValue = hasMore.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c154w2.LIZJ = zBooleanValue;
            ((ArrayList) this.LLILLJJLI.LLJJIJIIJIL).addAll(arrayList);
            this.LLILLJJLI.LLJJJ = collectVideoResponse.getNextCursor();
            C154P c154p4 = this.LLILLJJLI;
            Boolean hasMore2 = collectVideoResponse.getHasMore();
            if (hasMore2 != null) {
                zBooleanValue2 = hasMore2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c154p4.LLJJIJIL = zBooleanValue2;
            if ((!arrayList.isEmpty()) && (c129l = (c154p = this.LLILLJJLI).LLJI) != null) {
                c129l.setDataAfterLoadMore(c154p.LLJJIJIIJIL);
            }
            C154P c154p5 = this.LLILLJJLI;
            if (c154p5.LLJJIJIL) {
                C129L c129l3 = c154p5.LLJI;
                if (c129l3 != null) {
                    c129l3.resetLoadMoreState();
                }
            } else {
                C129L c129l4 = c154p5.LLJI;
                if (c129l4 != null) {
                    c129l4.setShowFooter(false);
                }
            }
        }
        this.LLILLJJLI.LLJIJIL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectSecondTabMusicVideoPage@d2ab.loadMoreData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
