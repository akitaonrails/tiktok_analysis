package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.IFetchSimilarMusicCallback;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.service.MusicDetailService$findSimilarMusic$1$2", f = "MusicDetailService.kt", l = {}, m = "invokeSuspend")
public final class C1165290gQh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<MusicModel> LL;
    public final /* synthetic */ C443120HZe<SuggestMusicList, Integer, String> LLILLJJLI;
    public final /* synthetic */ IFetchSimilarMusicCallback LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1165290gQh(C259800zU<MusicModel> c259800zU, C443120HZe<? extends SuggestMusicList, Integer, String> c443120HZe, IFetchSimilarMusicCallback iFetchSimilarMusicCallback, InterfaceC1364105Vn<? super C1165290gQh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c443120HZe;
        this.LLILLL = iFetchSimilarMusicCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165290gQh(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        String third;
        String imprId;
        SuggestMusicList first;
        LogPbBean logPbBean;
        Integer second;
        C1C7U.LIZ("MusicDetailService@ecb.findSimilarMusic$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MusicModel musicModel = this.LL.element;
        if (musicModel != null && musicModel.getMusic() != null) {
            this.LLILLL.onSuccess(this.LL.element);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicDetailService@ecb.findSimilarMusic$1$2");
            return unit;
        }
        C443120HZe<SuggestMusicList, Integer, String> c443120HZe = this.LLILLJJLI;
        if (c443120HZe != null && (second = c443120HZe.getSecond()) != null) {
            iIntValue = second.intValue();
        } else {
            iIntValue = -1;
        }
        C443120HZe<SuggestMusicList, Integer, String> c443120HZe2 = this.LLILLJJLI;
        if (c443120HZe2 == null || (third = c443120HZe2.getThird()) == null) {
            third = "fetch null";
        }
        C443120HZe<SuggestMusicList, Integer, String> c443120HZe3 = this.LLILLJJLI;
        if (c443120HZe3 != null && (first = c443120HZe3.getFirst()) != null && (logPbBean = first.logPb) != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        this.LLILLL.onFailed(iIntValue, third, imprId);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicDetailService@ecb.findSimilarMusic$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
