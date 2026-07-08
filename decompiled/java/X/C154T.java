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

/* JADX INFO: renamed from: X.154T, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.page.MusicCollectThemeVideoPage$loadMoreData$1", f = "MusicCollectThemeVideoPage.kt", l = {218}, m = "invokeSuspend")
public final class C154T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C154Q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154T(C154Q c154q, InterfaceC1364105Vn<? super C154T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c154q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C154T(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        C1C7U.LIZ("MusicCollectThemeVideoPage@6ffb.loadMoreData$1");
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
                C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadMoreData$1");
                return unit;
            }
            c154q.LLJIJIL = true;
            C129L c129l = c154q.LLJI;
            if (c129l != null) {
                c129l.showLoadMoreLoading();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C859940XoO c859940XoO = new C859940XoO(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c859940XoO);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadMoreData$1");
                return objLJFF;
            }
        }
        CollectVideoResponse collectVideoResponse = (CollectVideoResponse) obj;
        if (collectVideoResponse != null) {
            List<Aweme> awemeList = collectVideoResponse.getAwemeList();
            ArrayList arrayList = new ArrayList();
            if (awemeList != null) {
                C154Q c154q2 = this.LLILLJJLI;
                for (Aweme aweme : awemeList) {
                    if (aweme.getMusic() != null) {
                        Iterator it2 = ((ArrayList) c154q2.LLJJIII.LIZ).iterator();
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
            ((ArrayList) this.LLILLJJLI.LLJJIII.LIZ).addAll(arrayList);
            this.LLILLJJLI.LLJJIII.LIZIZ = collectVideoResponse.getNextCursor();
            C154W c154w = this.LLILLJJLI.LLJJIII;
            Boolean hasMore = collectVideoResponse.getHasMore();
            if (hasMore != null) {
                zBooleanValue = hasMore.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c154w.LIZJ = zBooleanValue;
            C154W c154w2 = this.LLILLJJLI.LLJJIII;
            arrayList.size();
            c154w2.getClass();
            if (!arrayList.isEmpty()) {
                ((ArrayList) this.LLILLJJLI.LLJJIJIIJIL).addAll(arrayList);
                C154Q c154q3 = this.LLILLJJLI;
                C129L c129l2 = c154q3.LLJI;
                if (c129l2 != null) {
                    c129l2.setDataAfterLoadMore(c154q3.LLJJIJIIJIL);
                }
            }
            C154Q c154q4 = this.LLILLJJLI;
            if (c154q4.LLJJIII.LIZJ) {
                C129L c129l3 = c154q4.LLJI;
                if (c129l3 != null) {
                    c129l3.resetLoadMoreState();
                }
            } else {
                C129L c129l4 = c154q4.LLJI;
                if (c129l4 != null) {
                    c129l4.setShowFooter(false);
                }
            }
        }
        this.LLILLJJLI.LLJIJIL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicCollectThemeVideoPage@6ffb.loadMoreData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
