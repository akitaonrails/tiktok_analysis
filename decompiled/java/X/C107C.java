package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.v2.dm.vm.GuideInboxSettingsVM;

/* JADX INFO: renamed from: X.107C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C107C extends C108A {
    public final String LJII;
    public final MutableLiveData<Integer> LJIIIIZZ;
    public final MutableLiveData<Integer> LJIIIZ;
    public final MutableLiveData<Integer> LJIIJ;

    @Override // X.C108A, X.C107J
    public final MutableLiveData<Integer> LIZ() {
        return this.LJIIJ;
    }

    @Override // X.C108A, X.C107J
    public final MutableLiveData<Integer> LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.C108A, X.C107J
    public final MutableLiveData<Integer> LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.C108A
    public final String LJFF() {
        return this.LJII;
    }

    public C107C(ViewModelStoreOwner viewModelStoreOwner, String str) {
        super(viewModelStoreOwner, str);
        GuideInboxSettingsVM guideInboxSettingsVM = (GuideInboxSettingsVM) new ViewModelProvider(viewModelStoreOwner).get(GuideInboxSettingsVM.class);
        this.LJII = "dm_guide_modify_inbox_permission_popup";
        this.LJIIIIZZ = guideInboxSettingsVM.LL;
        this.LJIIIZ = guideInboxSettingsVM.LLILLJJLI;
        this.LJIIJ = guideInboxSettingsVM.LLILLL;
    }
}
