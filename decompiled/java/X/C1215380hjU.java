package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileNGOCellAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1215380hjU extends C2217421BqW implements Function0<Unit> {
    public C1215380hjU(EditProfileNGOCellAssem editProfileNGOCellAssem) {
        super(0, editProfileNGOCellAssem, EditProfileNGOCellAssem.class, "showSelectDonation", "showSelectDonation()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG c19egLIZ;
        FragmentManager supportFragmentManager;
        final EditProfileNGOCellAssem editProfileNGOCellAssem = (EditProfileNGOCellAssem) this.receiver;
        editProfileNGOCellAssem.getClass();
        DialogFragment selectDonationDialog = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).donationService().getSelectDonationDialog(new IDonationService.OnDonationOrgChangeListener() { // from class: X.0hjT
            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onDismiss() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onOrgSelected(IDonationService.OrganizationModel organizationModel) {
                boolean zLIZIZ;
                C127K c127k = editProfileNGOCellAssem.LLJ;
                if (c127k != null) {
                    String str = organizationModel.name;
                    if (str != null) {
                        zLIZIZ = C736460Sui.LIZIZ(str);
                    } else {
                        zLIZIZ = false;
                    }
                    C1215970hkR.LJ(c127k, str, zLIZIZ);
                }
                editProfileNGOCellAssem.Go().vQ2(organizationModel, C2097608Jq.LJ());
            }
        });
        if (!selectDonationDialog.isAdded() && (c19egLIZ = C724240Sb0.LIZ(editProfileNGOCellAssem)) != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            selectDonationDialog.show(supportFragmentManager, "profile_edit_select_donation");
        }
        return Unit.LIZ;
    }
}
