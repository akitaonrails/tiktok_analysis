package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerViewModelFactoryService;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StubPhoto2StickerViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StubPhotoCommentStickerViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.photocommentsticker.IPhotoCommentStickerViewModel;

/* JADX INFO: renamed from: X.0ZtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913940ZtI implements ViewModelProvider.Factory {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        switch (this.$t) {
            case 0:
                return (T) create$0(this, cls);
            case 1:
                return (T) create$1(this, cls);
            default:
                return null;
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        switch (this.$t) {
        }
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C913940ZtI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C913940ZtI c913940ZtI, Class cls) {
        IStickerViewModelFactoryService iStickerViewModelFactoryServiceLIZ = C903080Zbm.LIZ();
        if (iStickerViewModelFactoryServiceLIZ != null) {
            C903030Zbh c903030Zbh = (C903030Zbh) c913940ZtI.l0;
            Photo2StickerViewModel photo2StickerViewModelLIZ = iStickerViewModelFactoryServiceLIZ.LIZ(c903030Zbh.LL, c903030Zbh.LLILLJJLI);
            if (photo2StickerViewModelLIZ != null) {
                return photo2StickerViewModelLIZ;
            }
        }
        return new StubPhoto2StickerViewModel();
    }

    public static final ViewModel create$1(C913940ZtI c913940ZtI, Class cls) {
        IPhotoCommentStickerViewModel iPhotoCommentStickerViewModelLIZLLL;
        IStickerViewModelFactoryService iStickerViewModelFactoryServiceLIZ = C903080Zbm.LIZ();
        if (iStickerViewModelFactoryServiceLIZ != null && (iPhotoCommentStickerViewModelLIZLLL = iStickerViewModelFactoryServiceLIZ.LIZLLL(((C903060Zbk) c913940ZtI.l0).LL)) != null) {
            return iPhotoCommentStickerViewModelLIZLLL;
        }
        return new StubPhotoCommentStickerViewModel();
    }
}
