package X;

import com.ss.android.ugc.aweme.component.music.UnlimitedMusicService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicList;
import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import com.ss.android.ugc.aweme.music.service.IUnlimitedMusicService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$loadMoreCollectedUnlimitedMusic$1", f = "CollectMusicManager.kt", l = {225}, m = "invokeSuspend")
public final class C20439214yM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20440014yU LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20439214yM(C20440014yU c20440014yU, boolean z, InterfaceC1364105Vn<? super C20439214yM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20440014yU;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20439214yM(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        UnlimitedMusicList unlimitedMusicList;
        C1C7U.LIZ("CollectMusicManager@c42d.loadMoreCollectedUnlimitedMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            c259800zU.element = new ArrayList();
            IUnlimitedMusicService iUnlimitedMusicServiceLIZIZ = UnlimitedMusicService.LIZIZ();
            int i2 = this.LLILLL.LJFF;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            obj = iUnlimitedMusicServiceLIZIZ.LIZ(i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CollectMusicManager@c42d.loadMoreCollectedUnlimitedMusic$1");
                return objLJFF;
            }
        }
        UnlimitedMusicListResponse unlimitedMusicListResponse = (UnlimitedMusicListResponse) obj;
        if (unlimitedMusicListResponse != null) {
            unlimitedMusicList = unlimitedMusicListResponse.musicData;
        } else {
            unlimitedMusicList = null;
        }
        if (unlimitedMusicList == null) {
            if (this.LLILZ) {
                InterfaceC20439814yS interfaceC20439814yS = this.LLILLL.LIZ;
                if (interfaceC20439814yS != null) {
                    interfaceC20439814yS.LLJJJIL((List) c259800zU.element, false);
                }
            } else {
                C20440014yU c20440014yU = this.LLILLL;
                InterfaceC20439814yS interfaceC20439814yS2 = c20440014yU.LIZ;
                if (interfaceC20439814yS2 != null) {
                    interfaceC20439814yS2.LLJJJIL(c20440014yU.LIZLLL, false);
                }
            }
        } else {
            UnlimitedMusicList unlimitedMusicList2 = unlimitedMusicListResponse.musicData;
            if (unlimitedMusicList2 != null) {
                C20440014yU c20440014yU2 = this.LLILLL;
                boolean z = this.LLILZ;
                c20440014yU2.LJI = unlimitedMusicList2.hasMore;
                c20440014yU2.LJFF = unlimitedMusicList2.nextCursor;
                List<Music> list = unlimitedMusicList2.musicList;
                if (true ^ list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<Music> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().convertToMusicModel());
                    }
                    c20440014yU2.LIZLLL.addAll(arrayList);
                    if (z) {
                        Boolean.valueOf(((List) c259800zU.element).addAll(arrayList));
                    } else {
                        c259800zU.element = c20440014yU2.LIZLLL;
                    }
                }
                if (((List) c259800zU.element).isEmpty()) {
                    InterfaceC20439814yS interfaceC20439814yS3 = c20440014yU2.LIZ;
                    if (interfaceC20439814yS3 != null) {
                        interfaceC20439814yS3.LLJJJIL((List) c259800zU.element, false);
                    }
                } else {
                    InterfaceC20439814yS interfaceC20439814yS4 = c20440014yU2.LIZ;
                    if (interfaceC20439814yS4 != null) {
                        interfaceC20439814yS4.LLJJJIL((List) c259800zU.element, c20440014yU2.LJI);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMusicManager@c42d.loadMoreCollectedUnlimitedMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
