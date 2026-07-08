package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.v2.viewmodel.StoryMusicCoverEntranceViewModel;
import com.ss.android.ugc.aweme.services.IMusicExService;
import com.ss.android.ugc.aweme.services.MusicEntranceResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS117S0101000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.StoryMusicCoverEntranceViewModel$fetchStoryEntranceInfoWhenRefresh$1", f = "StoryMusicCoverEntranceViewModel.kt", l = {89}, m = "invokeSuspend")
public final class C630610OoN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMusicExService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ StoryMusicCoverEntranceViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C630610OoN(IMusicExService iMusicExService, String str, String str2, int i, StoryMusicCoverEntranceViewModel storyMusicCoverEntranceViewModel, InterfaceC1364105Vn<? super C630610OoN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMusicExService;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = storyMusicCoverEntranceViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C630610OoN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        int size2;
        C1C7U.LIZ("StoryMusicCoverEntranceViewModel@32ed.fetchStoryEntranceInfoWhenRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMusicExService iMusicExService = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            int iIntValue = ((Number) C036X.LIZ.getValue()).intValue();
            int i3 = this.LLILZIL;
            this.LL = 1;
            obj = iMusicExService.getMusicDetailPageStoryEntrance(str, str2, null, iIntValue, i3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryMusicCoverEntranceViewModel@32ed.fetchStoryEntranceInfoWhenRefresh$1");
                return objLJFF;
            }
        }
        MusicEntranceResult musicEntranceResult = (MusicEntranceResult) obj;
        if (musicEntranceResult != null) {
            StoryMusicCoverEntranceViewModel storyMusicCoverEntranceViewModel = this.LLILZLL;
            storyMusicCoverEntranceViewModel.getClass();
            List<Aweme> list = musicEntranceResult.awemeList;
            int i4 = 0;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            List<String> list2 = musicEntranceResult.unreadStoryIds;
            if (list2 != null) {
                size2 = list2.size();
            } else {
                size2 = 0;
            }
            if (size == 0) {
                i2 = 0;
            } else if (size2 == 0) {
                i2 = 2;
            }
            storyMusicCoverEntranceViewModel.setState(new AwS117S0101000_9(i2, musicEntranceResult, 11));
            List<Aweme> list3 = musicEntranceResult.awemeList;
            IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (list3 != null && iAwemeService != null) {
                for (Aweme aweme : list3) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        Aweme awemeLLILLL = iAwemeService.LLILLL(aweme);
                        if (awemeLLILLL != null) {
                            String str3 = musicEntranceResult.requestId;
                            if (str3 == null) {
                                str3 = "";
                            }
                            awemeLLILLL.setRequestId(str3);
                            ListProtector.set(list3, i4, awemeLLILLL);
                        }
                        i4 = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            C630620OoO c630620OoO = C630620OoO.LIZ;
            Integer numLJ = C2286608xc.LJ(storyMusicCoverEntranceViewModel.hashCode());
            c630620OoO.getClass();
            if (numLJ != null) {
                numLJ.intValue();
                C630620OoO.LIZIZ.put(numLJ, musicEntranceResult);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryMusicCoverEntranceViewModel@32ed.fetchStoryEntranceInfoWhenRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
