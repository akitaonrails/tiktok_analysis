package X;

import com.bytedance.touchpoint.api.model.FeedIncentiveToast;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336310kr implements InterfaceC626120Oh8 {
    public final int $t;

    public static final void onComplete$0(C19336310kr c19336310kr) {
    }

    public static final void onComplete$1(C19336310kr c19336310kr) {
    }

    public static final void onComplete$2(C19336310kr c19336310kr) {
    }

    public static final void onComplete$3(C19336310kr c19336310kr) {
    }

    public static final void onComplete$4(C19336310kr c19336310kr) {
    }

    public static final void onError$0(C19336310kr c19336310kr, Throwable th) {
    }

    public static final void onError$1(C19336310kr c19336310kr, Throwable th) {
    }

    public static final void onError$2(C19336310kr c19336310kr, Throwable th) {
    }

    public static final void onError$3(C19336310kr c19336310kr, Throwable th) {
    }

    public static final void onSubscribe$0(C19336310kr c19336310kr, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C19336310kr c19336310kr, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$2(C19336310kr c19336310kr, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$3(C19336310kr c19336310kr, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$4(C19336310kr c19336310kr, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
            case 2:
                onComplete$2(this);
                break;
            case 3:
                onComplete$3(this);
                break;
            case 4:
                onComplete$4(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
            case 3:
                onError$3(this, th);
                break;
            case 4:
                onError$4(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
            case 2:
                onNext$2(this, obj);
                break;
            case 3:
                onNext$3(this, obj);
                break;
            case 4:
                onNext$4(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                onSubscribe$2(this, interfaceC420801kM);
                break;
            case 3:
                onSubscribe$3(this, interfaceC420801kM);
                break;
            case 4:
                onSubscribe$4(this, interfaceC420801kM);
                break;
        }
    }

    public C19336310kr(int i) {
        this.$t = i;
    }

    public static final void onError$4(C19336310kr c19336310kr, Throwable th) {
        ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZLLL(null);
    }

    public static final void onNext$1(C19336310kr c19336310kr, Object obj) {
        TouchPoint touchPoint = (TouchPoint) obj;
        C1894320zOY.LIZ.getClass();
        C1894320zOY.LJIJI(touchPoint);
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1893670zNV c1893670zNVLJII = C2178808gE.LIZ().LJII(touchPoint);
        if (c1893670zNVLJII instanceof FeedIncentiveToast) {
            C736950SvV c736950SvV = C1897980zUS.LIZ;
            C1897980zUS.LIZ((FeedIncentiveToast) c1893670zNVLJII);
        }
    }

    public static final void onNext$3(C19336310kr c19336310kr, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
            if (currentUser != null) {
                currentUser.setContentLanguageDialogShown(true);
            }
            C0XQ7.LJFF().LJIJ();
        }
    }

    public static final void onNext$4(C19336310kr c19336310kr, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
            currentUser.setContentLanguageDialogShown(true);
            C848230XPh.LL.LJIILIIL(currentUser);
        }
        ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LIZLLL(null);
    }

    public static final /* bridge */ /* synthetic */ void onNext$0(C19336310kr c19336310kr, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onNext$2(C19336310kr c19336310kr, Object obj) {
    }
}
