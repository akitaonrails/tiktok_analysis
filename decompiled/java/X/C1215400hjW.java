package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileNGOCellAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: renamed from: X.0hjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1215400hjW extends C2217421BqW implements Function0<Unit> {
    public C1215400hjW(EditProfileNGOCellAssem editProfileNGOCellAssem) {
        super(0, editProfileNGOCellAssem, EditProfileNGOCellAssem.class, "showCustomizeDonation", "showCustomizeDonation()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EditProfileNGOCellAssem editProfileNGOCellAssem = (EditProfileNGOCellAssem) this.receiver;
        Context context = editProfileNGOCellAssem.getContext();
        if (context != null) {
            IFundraiserService iFundraiserServiceLJIILL = ComplianceServiceProvider.LJIILL();
            ProfileNgoStruct profileNgoStruct = editProfileNGOCellAssem.Go().getState().LLILLJJLI;
            String orgId = profileNgoStruct != null ? profileNgoStruct.getOrgId() : null;
            EnumC1910580zom enumC1910580zom = EnumC1910580zom.PROFILE;
            EnumC1910570zol enumC1910570zol = EnumC1910570zol.PROFILE;
            ProfileNgoStruct profileNgoStruct2 = editProfileNGOCellAssem.Go().getState().LLILLJJLI;
            iFundraiserServiceLJIILL.LJIILIIL(context, orgId, enumC1910580zom, enumC1910570zol, false, profileNgoStruct2 != null ? profileNgoStruct2.getFundraiserId() : null, new AwS668S0100000_19(editProfileNGOCellAssem, 47));
        }
        return Unit.LIZ;
    }
}
