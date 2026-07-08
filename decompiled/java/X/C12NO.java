package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import v7.o;

/* JADX INFO: renamed from: X.12NO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager$getGlobalHotMusicList$1", f = "AIChooseMusicManager.kt", l = {830}, m = "invokeSuspend")
public final class C12NO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ o<MusicList> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12NO(int i, int i2, o<MusicList> oVar, InterfaceC1364105Vn<? super C12NO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = oVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12NO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIChooseMusicManager@73c4.getGlobalHotMusicList$1");
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
                C12NG c12ng = new C12NG();
                int i2 = this.LLILLJJLI;
                int i3 = this.LLILLL;
                this.LL = 1;
                obj = c12ng.LIZ("Global", i2, i3, true, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AIChooseMusicManager@73c4.getGlobalHotMusicList$1");
                    return objLJFF;
                }
            }
            C12NM c12nm = (C12NM) obj;
            MusicList musicList = new MusicList();
            List<MusicModel> list = c12nm.LIZJ;
            ArrayList arrayList = new ArrayList();
            Iterator<MusicModel> it2 = list.iterator();
            while (it2.hasNext()) {
                Music music = it2.next().getMusic();
                if (music != null) {
                    arrayList.add(music);
                }
            }
            musicList.items = arrayList;
            musicList.cursor = c12nm.LIZLLL;
            musicList.setHasMore(c12nm.LJ);
            LogPbBean logPbBean = c12nm.LJFF;
            musicList.logPb = logPbBean;
            if (logPbBean != null) {
                BaseResponse.ServerTimeExtra serverTimeExtra = new BaseResponse.ServerTimeExtra();
                serverTimeExtra.logid = c12nm.LJFF.getImprId();
                musicList.extra = serverTimeExtra;
            }
            C686250Qvv.LIZJ(null, "panel-hot", musicList.items, null);
            C686250Qvv.LIZIZ("hot_music", musicList.items);
            this.LLILZ.LIZJ(musicList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            MusicList musicList2 = new MusicList();
            musicList2.items = C13BV.INSTANCE;
            musicList2.cursor = this.LLILLJJLI;
            musicList2.setHasMore(false);
            this.LLILZ.LIZJ(musicList2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIChooseMusicManager@73c4.getGlobalHotMusicList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
