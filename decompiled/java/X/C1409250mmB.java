package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.data.ImageInspirationDataComponent$getInspirationData$result$1", f = "ImageInspirationDataComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409250mmB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1409340mmK LL;
    public final /* synthetic */ C1409380mmO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409250mmB(C1409340mmK c1409340mmK, C1409380mmO c1409380mmO, InterfaceC1364105Vn<? super C1409250mmB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1409340mmK;
        this.LLILLJJLI = c1409380mmO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409250mmB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        List<SingleImageData> imageList;
        C1C7U.LIZ("ImageInspirationDataComponent@4ae1.getInspirationData$result$1");
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
        C1409340mmK c1409340mmK2 = this.LL;
        c1409340mmK2.LLJJIJI = false;
        c1409340mmK2.LLIZLLLIL.LJIIJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationDataComponent@4ae1.getInspirationData$result$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
