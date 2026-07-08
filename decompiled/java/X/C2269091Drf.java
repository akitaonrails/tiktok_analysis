package X;

import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.gamora.editor.sticker.donation.EditSelectDonationOrganizationDialogFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269091Drf extends C09AY implements Function0<C11BH> {
    public C2269091Drf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11BH] */
    @Override // kotlin.jvm.functions.Function0
    public final C11BH invoke() {
        return new IDonationService() { // from class: X.11BH
            @Override // com.ss.android.ugc.aweme.services.external.IDonationService
            public final DialogFragment getSelectDonationDialog(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
                EditSelectDonationOrganizationDialogFragment editSelectDonationOrganizationDialogFragment = new EditSelectDonationOrganizationDialogFragment();
                editSelectDonationOrganizationDialogFragment.LLILLJJLI = new C11BF(onDonationOrgChangeListener);
                return editSelectDonationOrganizationDialogFragment;
            }
        };
    }
}
