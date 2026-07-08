package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM$fetchAlbum$1$1", f = "EcPhotoSearchAlbumVM.kt", l = {}, m = "invokeSuspend")
public final class C1309490kBH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcPhotoSearchAlbumVM LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;
    public final /* synthetic */ Function1<List<? extends MediaModel>, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1309490kBH(EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, List<? extends MediaModel> list, Function1<? super List<? extends MediaModel>, Unit> function1, InterfaceC1364105Vn<? super C1309490kBH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecPhotoSearchAlbumVM;
        this.LLILLJJLI = list;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309490kBH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CopyOnWriteArrayList<MediaModel> copyOnWriteArrayList;
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LL;
        List<MediaModel> list = this.LLILLJJLI;
        ecPhotoSearchAlbumVM.LL.clear();
        ecPhotoSearchAlbumVM.LL.put("All", new C1309500kBI("All", new CopyOnWriteArrayList(list)));
        for (MediaModel mediaModel : list) {
            String str = mediaModel.albumClass;
            if (str != null && str.length() > 0) {
                C1309500kBI c1309500kBI = ecPhotoSearchAlbumVM.LL.get(str);
                if (c1309500kBI != null && (copyOnWriteArrayList = c1309500kBI.LIZIZ) != null) {
                    copyOnWriteArrayList.add(mediaModel);
                } else {
                    ConcurrentHashMap<String, C1309500kBI> concurrentHashMap = ecPhotoSearchAlbumVM.LL;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    copyOnWriteArrayList2.add(mediaModel);
                    concurrentHashMap.put(str, new C1309500kBI(str, copyOnWriteArrayList2));
                }
            }
        }
        Function1<List<? extends MediaModel>, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(this.LLILLJJLI);
        }
        this.LL.LLILZ.setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
