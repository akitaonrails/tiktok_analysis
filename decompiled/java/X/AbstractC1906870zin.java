package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1906870zin extends C1906860zim {
    public final C01GW aliasObserver$delegate;
    public C0HX6 avatar;
    public final C01GW avatarEntry$delegate;
    public EnumC1906970zix scene;
    public final C01GW socPubAvatarFrameLayout$delegate;
    public static final C1906940ziu Companion = new Object() { // from class: X.0ziu
    };
    public static final int $stable = 8;

    public abstract Observer<C1243340iSa> createAliasObserver();

    public abstract User getUserFromNotice();

    public boolean isFromAggregatedAvatar() {
        return false;
    }

    private final Observer<C1243340iSa> getAliasObserver() {
        return (Observer) this.aliasObserver$delegate.getValue();
    }

    private final InterfaceC1398730mVD getAvatarEntry() {
        return (InterfaceC1398730mVD) this.avatarEntry$delegate.getValue();
    }

    public final C1609500rzA getSocPubAvatarFrameLayout() {
        return (C1609500rzA) this.socPubAvatarFrameLayout$delegate.getValue();
    }

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public void onAttached() {
        super.onAttached();
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(requireLifeCycleOwner(), getAliasObserver());
        }
    }

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public void onDetached() {
        super.onDetached();
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().removeObserver(getAliasObserver());
        }
    }

    public AbstractC1906870zin(View view) {
        super(view);
        this.socPubAvatarFrameLayout$delegate = C452501pT.LIZIZ(new AwS572S0100000_28(view, 481));
        this.avatarEntry$delegate = C452501pT.LIZIZ(new AwS572S0100000_28(this, 480));
        this.aliasObserver$delegate = C452501pT.LIZIZ(new AwS572S0100000_28(this, 479));
    }

    @Override // X.AbstractC1906850zil
    public void applyNewStyle(C1906880zio c1906880zio) {
        super.applyNewStyle(c1906880zio);
        applyHeadStoryRing(c1906880zio, getSocPubAvatarFrameLayout());
        getSocPubAvatarFrameLayout().setRingStrokeWidthByAvatarSize(52);
    }

    public final void checkAndGetStory(boolean z) {
        User userFromNotice;
        if (z) {
            userFromNotice = getUserFromNotice();
        } else {
            userFromNotice = null;
        }
        if (!isFromAggregatedAvatar()) {
            InterfaceC1398730mVD avatarEntry = getAvatarEntry();
            if (avatarEntry != null) {
                avatarEntry.LIZLLL(userFromNotice);
                return;
            }
            return;
        }
        InterfaceC1398730mVD avatarEntry2 = getAvatarEntry();
        if (avatarEntry2 == null) {
            return;
        }
        avatarEntry2.LIZLLL(null);
    }

    public final void setLogScene(EnumC1906970zix enumC1906970zix) {
        this.scene = enumC1906970zix;
    }

    @Override // X.AbstractC1906850zil
    public void addTypeIconToAvatar(C0HX6 c0hx6, UrlModel urlModel, boolean z) {
        this.avatar = c0hx6;
        if (getSocPubAvatarFrameLayout().getMode() != EnumC1605470rsf.NONE) {
            return;
        }
        super.addTypeIconToAvatar(c0hx6, urlModel, z);
    }

    public final void reSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    public static /* synthetic */ void checkAndGetStory$default(AbstractC1906870zin abstractC1906870zin, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            abstractC1906870zin.checkAndGetStory(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAndGetStory");
    }
}
