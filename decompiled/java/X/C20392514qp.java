package X;

import Y.AfS200S0100000_31;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import java.util.Map;

/* JADX INFO: renamed from: X.14qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20392514qp implements InterfaceC472150IfN {
    public final /* synthetic */ C20392414qo LIZ;

    public C20392514qp(C20392414qo c20392414qo) {
        this.LIZ = c20392414qo;
    }

    @Override // X.InterfaceC472150IfN
    public final void onFailed(Throwable th) {
        C20441214yg.LJ("PlaybookDetailCustomPreviewFootView", "query Live permission failed");
        this.LIZ.LIZ(false);
    }

    @Override // X.InterfaceC472150IfN
    public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
        Boolean boolValueOf;
        C19482011Jy c19482011JyLJJ;
        C20392414qo c20392414qo = this.LIZ;
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
        } else {
            boolValueOf = null;
        }
        c20392414qo.LLIZ = C500260Jjc.LJJJI(boolValueOf);
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LIZ.LLILLL);
        if (c0utjPl1 != null && (c19482011JyLJJ = c0utjPl1.LJJ()) != null) {
            this.LIZ.LLJILJILJ.LIZ(new C11QI(c19482011JyLJJ.LJIILL(new AfS200S0100000_31(this.LIZ, 17)).LJIIL(new C09JN() { // from class: X.14qq
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookDetailCustomFooterView@7585.checkUserHasLivePermission$1$onSuccess$2");
                    C20441214yg.LJFF("PlaybookDetailCustomPreviewFootView", "getSaveReferenceInInsight error", (Throwable) obj);
                    C1C7U.LIZIZ("PlaybookDetailCustomFooterView@7585.checkUserHasLivePermission$1$onSuccess$2");
                }
            })).LJIILL().LJIIZILJ());
        }
    }
}
