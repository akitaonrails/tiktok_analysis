package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21694819vO implements InterfaceC1891350zJl {
    public final PhotoModeImage LL;
    public final int LLILLJJLI;
    public final Aweme LLILLL;
    public final InterfaceC1361270lWn LLILZ;
    public final boolean LLILZIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        Object objLJJJLL;
        UrlModel urlModel;
        List<String> urlList;
        UrlModel urlModel2;
        List<String> urlList2;
        if (!(interfaceC1891350zJl instanceof C21694819vO)) {
            return false;
        }
        PhotoModeImage photoModeImage = this.LL;
        Object objLJJJLL2 = null;
        if (photoModeImage != null && (urlModel2 = photoModeImage.urlModel) != null && (urlList2 = urlModel2.getUrlList()) != null) {
            objLJJJLL = C13LP.LJJJLL(urlList2);
        } else {
            objLJJJLL = null;
        }
        PhotoModeImage photoModeImage2 = ((C21694819vO) interfaceC1891350zJl).LL;
        if (photoModeImage2 != null && (urlModel = photoModeImage2.urlModel) != null && (urlList = urlModel.getUrlList()) != null) {
            objLJJJLL2 = C13LP.LJJJLL(urlList);
        }
        return Intrinsics.LJFF(objLJJJLL, objLJJJLL2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C21694819vO)) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C21694819vO(PhotoModeImage photoModeImage, int i, Aweme aweme, InterfaceC1361270lWn interfaceC1361270lWn, boolean z) {
        this.LL = photoModeImage;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
        this.LLILZ = interfaceC1361270lWn;
        this.LLILZIL = z;
    }
}
