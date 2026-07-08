package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731830vAT extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ PcsServiceBioDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731830vAT(PcsServiceBioDialog pcsServiceBioDialog) {
        super(1);
        this.LL = pcsServiceBioDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        DialogFragment dialogFragment;
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        this.LL.close(1);
        PcsServiceBioDialog pcsServiceBioDialog = this.LL;
        pcsServiceBioDialog.getClass();
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(pcsServiceBioDialog);
        Fragment fragmentLJJJJZI = null;
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            fragmentLJJJJZI = supportFragmentManager.LJJJJZI("quick_chat_sheet");
        }
        if ((fragmentLJJJJZI instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        return Unit.LIZ;
    }
}
