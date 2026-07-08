package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.trending.CreationHashtagModel;
import com.ss.android.ugc.aweme.challenge.trending.MusicTrendingHashtagApi;
import com.ss.android.ugc.aweme.challenge.trending.MusicTrendingHashtagResponse;
import com.ss.android.ugc.aweme.challenge.trending.MusicTrendingHashtagViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NRV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.challenge.trending.MusicTrendingHashtagViewModel$fetchMusicTrendingHashtags$1", f = "MusicTrendingHashtagViewModel.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0NRV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ MusicTrendingHashtagViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NRV(long j, MusicTrendingHashtagViewModel musicTrendingHashtagViewModel, InterfaceC1364105Vn<? super C0NRV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = musicTrendingHashtagViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NRV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicTrendingHashtagViewModel@f5c4.fetchMusicTrendingHashtags$1");
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
                MusicTrendingHashtagApi.LIZ.getClass();
                MusicTrendingHashtagApi value = C0NRW.LIZJ.getValue();
                long j = this.LLILLJJLI;
                this.LL = 1;
                obj = value.getMusicTrendingHashtags(j, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicTrendingHashtagViewModel@f5c4.fetchMusicTrendingHashtags$1");
                    return objLJFF;
                }
            }
            List<CreationHashtagModel> list = ((MusicTrendingHashtagResponse) obj).hashtagList;
            if (list != null) {
                this.LLILLL.LL.setValue(list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicTrendingHashtagViewModel@f5c4.fetchMusicTrendingHashtags$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
