package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel;

/* JADX INFO: renamed from: X.16HM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HM implements ViewModelProvider.Factory {
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

    public C16HM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final ViewModel create$0(C16HM c16hm, Class cls) {
        PublishModel publishModel = (PublishModel) ((TTEPVideoSaveActivity) c16hm.l0).LLILLJJLI.getValue();
        ((TTEPVideoSaveActivity) c16hm.l0).getClass();
        return new TTEPVideoSaveViewModel(publishModel);
    }

    public static final ViewModel create$1(C16HM c16hm, Class cls) {
        return new TabletBottomControlBarViewModel((IFeedBottomBarFacade) c16hm.l0);
    }
}
