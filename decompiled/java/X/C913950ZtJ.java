package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.report.ChatReportPageViewModelImpl;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IStickerViewModelFactoryService;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StubAISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.provider.StubAddStickerToFavViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IAddStickerToFavViewModel;

/* JADX INFO: renamed from: X.0ZtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913950ZtJ implements ViewModelProvider.Factory {
    public final int $t;

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
            case 2:
                return (T) create$2(this, cls);
            case 3:
                return (T) create$3(this, cls);
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

    public C913950ZtJ(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C913950ZtJ c913950ZtJ, Class cls) {
        return new AwemeStatusViewModel();
    }

    public static final ViewModel create$1(C913950ZtJ c913950ZtJ, Class cls) {
        return new ChatReportPageViewModelImpl();
    }

    public static final ViewModel create$2(C913950ZtJ c913950ZtJ, Class cls) {
        AISelfStickerInlineViewModel aISelfStickerInlineViewModelLIZIZ;
        IStickerViewModelFactoryService iStickerViewModelFactoryServiceLIZ = C903080Zbm.LIZ();
        if (iStickerViewModelFactoryServiceLIZ != null && (aISelfStickerInlineViewModelLIZIZ = iStickerViewModelFactoryServiceLIZ.LIZIZ()) != null) {
            return aISelfStickerInlineViewModelLIZIZ;
        }
        return new StubAISelfStickerInlineViewModel();
    }

    public static final ViewModel create$3(C913950ZtJ c913950ZtJ, Class cls) {
        IAddStickerToFavViewModel iAddStickerToFavViewModelLIZJ;
        IStickerViewModelFactoryService iStickerViewModelFactoryServiceLIZ = C903080Zbm.LIZ();
        if (iStickerViewModelFactoryServiceLIZ != null && (iAddStickerToFavViewModelLIZJ = iStickerViewModelFactoryServiceLIZ.LIZJ()) != null) {
            return iAddStickerToFavViewModelLIZJ;
        }
        return new StubAddStickerToFavViewModel();
    }
}
