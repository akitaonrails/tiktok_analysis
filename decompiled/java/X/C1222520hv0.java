package X;

import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;

/* JADX INFO: renamed from: X.0hv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222520hv0 {
    public final DialogC1389620mGW LIZ;

    public C1222520hv0(C19EG c19eg, ManageGroupViewModel manageGroupViewModel) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
        dialogC1389620mGW.LJJLL(false);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.setOnCancelListener(new DialogInterfaceOnCancelListenerC1265930j31(manageGroupViewModel, 0));
        this.LIZ = dialogC1389620mGW;
    }
}
