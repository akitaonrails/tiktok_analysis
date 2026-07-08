package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DeleteImageResponseData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0v4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$deleteImage$1", f = "ImageListViewModel.kt", l = {180, 193}, m = "invokeSuspend")
public final class C1728280v4k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageListViewModel LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;
    public final /* synthetic */ ImageItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728280v4k(ImageListViewModel imageListViewModel, RootData rootData, ImageItem imageItem, InterfaceC1364105Vn<? super C1728280v4k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageListViewModel;
        this.LLILLL = rootData;
        this.LLILZ = imageItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728280v4k(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X52 c0x52;
        DeleteImageResponseData deleteImageResponseData;
        boolean z;
        ImageListViewModel imageListViewModel;
        InterfaceC1728700v5Q interfaceC1728700v5Q;
        InterfaceC1729810v7D interfaceC1729810v7D;
        C1728990v5t c1728990v5tUm1;
        LiveEffect liveEffect;
        Response response;
        Object objDeleteImage = obj;
        C1C7U.LIZ("ImageListViewModel@65ae.deleteImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String message = null;
        try {
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            c0x52 = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objDeleteImage);
                    this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(614));
                    RootData rootData = this.LLILLL;
                    C1729250v6J.LJII(rootData.roomId, rootData.authorId, rootData.isNewUser, true, "photo_delete", this.LLILLL.templateEntryType, null, rootData.LIZ());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objDeleteImage);
        } else {
            C155000ia.LIZIZ(objDeleteImage);
            C1728220v4e c1728220v4e = this.LLILLJJLI.LL.LLILLJJLI;
            String str = this.LLILLL.authorId;
            String str2 = this.LLILZ.imageId;
            this.LL = 1;
            objDeleteImage = c1728220v4e.LL.LL.deleteImage(str, str2, this);
            if (objDeleteImage == objLJFF) {
                C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
                return objLJFF;
            }
        }
        c0x52 = (C0X52) objDeleteImage;
        th = null;
        if (c0x52 != null && (response = (Response) c0x52.LIZIZ) != null) {
            deleteImageResponseData = (DeleteImageResponseData) response.data;
        } else {
            deleteImageResponseData = null;
        }
        int size = 0;
        if (c0x52 != null && c0x52.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z && deleteImageResponseData != null) {
            List<ITEM> listListGetAll = this.LLILLJJLI.listGetAll();
            if (listListGetAll != 0) {
                size = listListGetAll.size();
            }
            this.LLILLJJLI.listRemoveItem(this.LLILZ);
            if (this.LLILZ.isUsing && (interfaceC1728700v5Q = (imageListViewModel = this.LLILLJJLI).LLILLL) != null && (interfaceC1729810v7D = imageListViewModel.LLILZIL) != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null && (liveEffect = c1728990v5tUm1.LLILZIL) != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModel), null, null, new C1728300v4m(imageListViewModel, interfaceC1728700v5Q, liveEffect, null), 3);
            }
            if (size - 1 <= 0) {
                this.LL = 2;
                if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                    C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
                    return objLJFF;
                }
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(614));
                RootData rootData2 = this.LLILLL;
                C1729250v6J.LJII(rootData2.roomId, rootData2.authorId, rootData2.isNewUser, true, "photo_delete", this.LLILLL.templateEntryType, null, rootData2.LIZ());
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
                return unit2;
            }
            this.LLILLJJLI.setState(new AwS605S0100000_26(deleteImageResponseData, 631));
            RootData rootData22 = this.LLILLL;
            C1729250v6J.LJII(rootData22.roomId, rootData22.authorId, rootData22.isNewUser, true, "photo_delete", this.LLILLL.templateEntryType, null, rootData22.LIZ());
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
            return unit22;
        }
        RootData rootData3 = this.LLILLL;
        String str3 = rootData3.roomId;
        String str4 = rootData3.authorId;
        boolean z2 = rootData3.isNewUser;
        if (th != null) {
            message = th.getMessage();
        }
        C1729250v6J.LJII(str3, str4, z2, false, "photo_delete", this.LLILLL.templateEntryType, message, this.LLILLL.LIZ());
        Unit unit222 = Unit.LIZ;
        C1C7U.LIZIZ("ImageListViewModel@65ae.deleteImage$1");
        return unit222;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
