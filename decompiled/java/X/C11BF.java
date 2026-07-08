package X;

import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;

/* JADX INFO: renamed from: X.11BF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BF implements C11B2 {
    public final /* synthetic */ IDonationService.OnDonationOrgChangeListener LIZ;

    @Override // X.C11B2
    public final void onDismiss() {
        this.LIZ.onDismiss();
    }

    public C11BF(IDonationService.OnDonationOrgChangeListener onDonationOrgChangeListener) {
        this.LIZ = onDonationOrgChangeListener;
    }

    @Override // X.C11B2
    public final void LIZ(C11BE c11be) {
        IDonationService.OrganizationModel organizationModel = new IDonationService.OrganizationModel(c11be.getName(), c11be.getDesc(), c11be.getIcon(), c11be.getDetailUrl(), c11be.getDonateLink(), c11be.getOrgId(), c11be.getOrgType(), c11be.getNgoId(), c11be.getFundraiserId());
        if (c11be instanceof OrganizationModel) {
            organizationModel.setAddTime(c11be.getAddTime());
        }
        this.LIZ.onOrgSelected(organizationModel);
    }
}
