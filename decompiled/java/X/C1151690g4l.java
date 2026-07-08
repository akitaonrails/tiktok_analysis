package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;

/* JADX INFO: renamed from: X.0g4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151690g4l implements ViewModelProvider.Factory {
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

    public C1151690g4l(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C1151690g4l c1151690g4l, Class cls) {
        return new SelectPollViewModel(((AbsSelectPollWidget) c1151690g4l.l0).dataChannel);
    }

    public static final ViewModel create$1(C1151690g4l c1151690g4l, Class cls) {
        return new ListLiveCircleItemVM((C19EG) c1151690g4l.l0);
    }

    public static final ViewModel create$2(C1151690g4l c1151690g4l, Class cls) {
        return new ListLiveCircleItemVM.ListLiveCircleItemVMFollower((C19EG) c1151690g4l.l0);
    }

    public static final ViewModel create$3(C1151690g4l c1151690g4l, Class cls) {
        return new ListLiveCircleItemVM.ListLiveCircleItemVMFollowing((C19EG) c1151690g4l.l0);
    }
}
