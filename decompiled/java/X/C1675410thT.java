package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0thT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1675410thT implements Observer, InterfaceC1635506an {
    public final /* synthetic */ PhotoPreviewFragment LL;

    public C1675410thT(PhotoPreviewFragment photoPreviewFragment) {
        this.LL = photoPreviewFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, PhotoPreviewFragment.class, "handleToastMessageError", "handleToastMessageError(Lcom/ss/android/ugc/aweme/subscription/preview/photos/PhotoPreviewErrorMessage;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        PhotoPreviewFragment photoPreviewFragment = this.LL;
        photoPreviewFragment.getClass();
        if (Intrinsics.LJFF(obj, C1675420thU.LIZ)) {
            C1389890mGx c1389890mGx = new C1389890mGx(photoPreviewFragment);
            c1389890mGx.LJIIIZ(2131839519);
            c1389890mGx.LJIIJJI();
        } else {
            if (Intrinsics.LJFF(obj, C1675440thW.LIZ)) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(photoPreviewFragment);
                c1389890mGx2.LJIIIZ(2131839522);
                c1389890mGx2.LJIIJJI();
                return;
            }
            throw new C1954807lC();
        }
    }
}
