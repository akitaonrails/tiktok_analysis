package X;

import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$loadMoreCollectMusic$1", f = "CollectMusicManager.kt", l = {278}, m = "invokeSuspend")
public final class C20439414yO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20440014yU LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20439414yO(C20440014yU c20440014yU, int i, String str, boolean z, InterfaceC1364105Vn<? super C20439414yO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20440014yU;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20439414yO(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<? extends MusicModel> arrayList;
        C1C7U.LIZ("CollectMusicManager@c42d.loadMoreCollectMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                arrayList = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            arrayList = new ArrayList<>();
            C20440014yU c20440014yU = this.LLILLL;
            int i2 = c20440014yU.LJFF;
            int i3 = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            obj = c20440014yU.LJ(i2, 12, i3, str, false, null, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CollectMusicManager@c42d.loadMoreCollectMusic$1");
                return objLJFF;
            }
        }
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        if (collectedMusicList != null) {
            this.LLILLL.LJFF = collectedMusicList.getCursor();
            this.LLILLL.LJI = collectedMusicList.isHasMore();
            List<Music> items = collectedMusicList.getItems();
            if (items != null && items.size() > 0) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(items, 10));
                Iterator<Music> it2 = items.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().convertToMusicModel());
                }
                C20440014yU c20440014yU2 = this.LLILLL;
                List<MusicModel> listLIZ = c20440014yU2.LIZ(c20440014yU2.LIZJ, arrayList2, false);
                if (this.LLILZLL) {
                    Boolean.valueOf(arrayList.addAll(listLIZ));
                } else {
                    arrayList = this.LLILLL.LIZJ;
                }
            }
            if (arrayList.isEmpty()) {
                InterfaceC20439814yS interfaceC20439814yS = this.LLILLL.LIZ;
                if (interfaceC20439814yS != null) {
                    interfaceC20439814yS.LLJJJIL(arrayList, false);
                }
            } else {
                C20440014yU c20440014yU3 = this.LLILLL;
                InterfaceC20439814yS interfaceC20439814yS2 = c20440014yU3.LIZ;
                if (interfaceC20439814yS2 != null) {
                    interfaceC20439814yS2.LLJJJIL(arrayList, c20440014yU3.LJI);
                }
            }
        } else if (this.LLILZLL) {
            InterfaceC20439814yS interfaceC20439814yS3 = this.LLILLL.LIZ;
            if (interfaceC20439814yS3 != null) {
                interfaceC20439814yS3.LLJJJIL(arrayList, false);
            }
        } else {
            C20440014yU c20440014yU4 = this.LLILLL;
            InterfaceC20439814yS interfaceC20439814yS4 = c20440014yU4.LIZ;
            if (interfaceC20439814yS4 != null) {
                interfaceC20439814yS4.LLJJJIL(c20440014yU4.LIZJ, false);
            }
        }
        this.LLILLL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMusicManager@c42d.loadMoreCollectMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
