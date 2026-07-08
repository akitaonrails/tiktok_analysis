package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.UsAddressListAssemViewModel;

/* JADX INFO: renamed from: X.04JV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JV implements ViewModelProvider.Factory {
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

    public C04JV(int i) {
        this.$t = i;
    }

    public static final ViewModel create$0(C04JV c04jv, Class cls) {
        return new AddressListAssemViewModel();
    }

    public static final ViewModel create$1(C04JV c04jv, Class cls) {
        return new UsAddressListAssemViewModel();
    }
}
