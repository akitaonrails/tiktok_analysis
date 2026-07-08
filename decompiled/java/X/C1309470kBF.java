package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM$fetchAlbum$1", f = "EcPhotoSearchAlbumVM.kt", l = {67, 68}, m = "invokeSuspend")
public final class C1309470kBF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcPhotoSearchAlbumVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function1<List<? extends MediaModel>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1309470kBF(EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, Context context, Function1<? super List<? extends MediaModel>, Unit> function1, InterfaceC1364105Vn<? super C1309470kBF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecPhotoSearchAlbumVM;
        this.LLILLL = context;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309470kBF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LLILLJJLI;
            Context context = this.LLILLL;
            this.LL = 1;
            obj = ecPhotoSearchAlbumVM.vQ2(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (list == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1309490kBH c1309490kBH = new C1309490kBH(this.LLILLJJLI, list, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1309490kBH) == objLJFF) {
            C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
