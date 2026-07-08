package X;

import com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;

/* JADX INFO: renamed from: X.110w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194324110w implements InterfaceC19413110xF {
    public final /* synthetic */ C19458411Aw LIZ;

    public C194324110w(C19458411Aw c19458411Aw) {
        this.LIZ = c19458411Aw;
    }

    @Override // X.InterfaceC19413110xF
    public final void LJJIFFI() {
        OrganizationListViewModel organizationListViewModel = this.LIZ.LLJJIJI;
        if (organizationListViewModel == null) {
            organizationListViewModel = null;
        }
        if (organizationListViewModel.LLILZ == 1) {
            C19413310xH value = organizationListViewModel.LL.getValue();
            if (value == null || !value.LIZIZ) {
                organizationListViewModel.vQ2(true);
            } else {
                organizationListViewModel.wQ2(true);
            }
        }
    }
}
