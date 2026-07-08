package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.AboutThisAdVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel.AdTopicsViewModel;

/* JADX INFO: renamed from: X.0UsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786090UsZ implements ViewModelProvider.Factory {
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
            case 4:
                return (T) create$4(this, cls);
            case 5:
                return (T) create$5(this, cls);
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

    public C786090UsZ(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C786090UsZ c786090UsZ, Class cls) {
        return new AdvertiserVM();
    }

    public static final ViewModel create$1(C786090UsZ c786090UsZ, Class cls) {
        return new AboutThisAdVM();
    }

    public static final ViewModel create$2(C786090UsZ c786090UsZ, Class cls) {
        return new ComplianceVM();
    }

    public static final ViewModel create$3(C786090UsZ c786090UsZ, Class cls) {
        return new SubscriptionVM();
    }

    public static final ViewModel create$4(C786090UsZ c786090UsZ, Class cls) {
        return new ThirdPartyVM();
    }

    public static final ViewModel create$5(C786090UsZ c786090UsZ, Class cls) {
        return new AdTopicsViewModel();
    }
}
