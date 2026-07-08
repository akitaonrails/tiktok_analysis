package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("dm_updates_to_direct_message_settings")
public final class C1906290zhr extends AbstractC20660115st<DialogFragment> {
    public final Fragment LL;
    public final String LLILLJJLI;
    public final InterfaceC1887820zE4 LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        if (this.LL != null) {
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            if (iPrivacyServiceLJIJJ.LJJIFFI()) {
                iPrivacyServiceLJIJJ.LJJIIJ("dm_inbox");
            } else {
                iPrivacyServiceLJIJJ.LJIILJJIL();
                iPrivacyServiceLJIJJ.LJJIIJZLJL("dm_inbox");
            }
            C19EG activity = this.LL.getActivity();
            if (activity != null) {
                ComplianceServiceProvider.LJIJJ().LJIJJ(activity, null, new AwS572S0100000_28(this, 1102));
            }
        }
        return null;
    }

    public C1906290zhr(Fragment fragment, String str, InterfaceC1887820zE4 interfaceC1887820zE4, InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1887820zE4;
        this.LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(798));
    }
}
