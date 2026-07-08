package X;

import com.ss.android.ugc.aweme.component.music.UnlimitedMusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicList;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import com.ss.android.ugc.aweme.music.service.IUnlimitedMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initUnlimitedCollectMusicList$1", f = "CollectMusicManager.kt", l = {196}, m = "invokeSuspend")
public final class C20439314yN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20440014yU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20439314yN(C20440014yU c20440014yU, InterfaceC1364105Vn<? super C20439314yN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20440014yU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20439314yN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectMusicManager@c42d.initUnlimitedCollectMusicList$1");
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
            IUnlimitedMusicService iUnlimitedMusicServiceLIZIZ = UnlimitedMusicService.LIZIZ();
            int i2 = this.LLILLJJLI.LJFF;
            this.LL = 1;
            obj = iUnlimitedMusicServiceLIZIZ.LIZ(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CollectMusicManager@c42d.initUnlimitedCollectMusicList$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) obj;
        if (unlimitedMusicListResponse != null && unlimitedMusicListResponse.musicData != null) {
            UnlimitedMusicList unlimitedMusicList = unlimitedMusicListResponse.musicData;
            if (unlimitedMusicList != null) {
                C20440014yU c20440014yU = this.LLILLJJLI;
                c20440014yU.LJI = unlimitedMusicList.hasMore;
                c20440014yU.LJFF = unlimitedMusicList.nextCursor;
                List<Music> list = unlimitedMusicList.musicList;
                if (!list.isEmpty()) {
                    c20440014yU.LIZLLL.clear();
                    CopyOnWriteArrayList<MusicModel> copyOnWriteArrayList = c20440014yU.LIZLLL;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<Music> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().convertToMusicModel());
                    }
                    copyOnWriteArrayList.addAll(arrayList);
                    InterfaceC20439814yS interfaceC20439814yS = c20440014yU.LIZ;
                    if (interfaceC20439814yS != null) {
                        interfaceC20439814yS.LLJJJIL(c20440014yU.LIZLLL, c20440014yU.LJI);
                    }
                    InterfaceC20439814yS interfaceC20439814yS2 = c20440014yU.LIZ;
                    if (interfaceC20439814yS2 != null) {
                        interfaceC20439814yS2.LIZ(c20440014yU.LIZLLL);
                    }
                } else {
                    c20440014yU.LIZLLL.clear();
                    InterfaceC20439814yS interfaceC20439814yS3 = c20440014yU.LIZ;
                    if (interfaceC20439814yS3 != null) {
                        interfaceC20439814yS3.LIZJ();
                    }
                }
            }
        } else {
            InterfaceC20439814yS interfaceC20439814yS4 = this.LLILLJJLI.LIZ;
            if (interfaceC20439814yS4 != null) {
                interfaceC20439814yS4.LIZIZ();
            }
        }
        this.LLILLJJLI.LJ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMusicManager@c42d.initUnlimitedCollectMusicList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
