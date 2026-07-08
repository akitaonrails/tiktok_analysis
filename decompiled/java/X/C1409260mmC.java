package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationListData$4", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409260mmC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1409340mmK LL;
    public final /* synthetic */ C1409380mmO LLILLJJLI;
    public final /* synthetic */ InterfaceC1409290mmF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409260mmC(C1409340mmK c1409340mmK, C1409380mmO c1409380mmO, InterfaceC1409290mmF interfaceC1409290mmF, InterfaceC1364105Vn<? super C1409260mmC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1409340mmK;
        this.LLILLJJLI = c1409380mmO;
        this.LLILLL = interfaceC1409290mmF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409260mmC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        List<SingleImageData> imageList;
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1409340mmK c1409340mmK = this.LL;
        ImageAlbumData imageAlbumData = c1409340mmK.LJJJLIIL().getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSrcImageInfo().getPath());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        c1409340mmK.LLJJIJIIJIL = arrayList;
        this.LL.q3(this.LLILLJJLI);
        this.LL.LLIZLLLIL.LJIIJ(this.LLILLJJLI);
        this.LLILLL.LIZ(new C1409400mmQ(this.LLILLJJLI));
        List<InterfaceC1409290mmF> list = this.LL.LLJJI;
        C1409380mmO c1409380mmO = this.LLILLJJLI;
        Iterator<InterfaceC1409290mmF> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ(new C1409400mmQ(c1409380mmO));
        }
        this.LL.LLJJI.clear();
        this.LL.LLJJIJI = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationListData$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
