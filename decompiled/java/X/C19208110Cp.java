package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PanelButtons;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208110Cp extends AbstractC20659615so<TuxPanel> {
    public final int LL = 0;
    public final UnifiedAuthPopupConfig LLILLJJLI;
    public final C19EG LLILLL;
    public final C10DT LLILZ;
    public final C10DU LLILZIL;

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void onPopupDismiss() {
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        C10DU c10du = this.LLILZIL;
        if (c10du != null) {
            c10du.LIZIZ();
        }
        C19209010Cy c19209010Cy = C19209010Cy.LIZ;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
        String str = unifiedAuthPopupConfig.enterFrom;
        String str2 = unifiedAuthPopupConfig.trigger;
        String str3 = LJIIL() ? "subscription" : "consent";
        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LLILLJJLI;
        String str4 = unifiedAuthPopupConfig2.sceneId;
        String str5 = unifiedAuthPopupConfig2.subSceneId;
        c19209010Cy.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("trigger", str2);
        c2344009Gk.LJFF("pop_up_type", str3);
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, str4);
        c2344009Gk.LJFF("sub_scene", str5);
        C20684815ws.LJIILLIIL("show_email_permission_pop_up", c2344009Gk.LIZ);
    }

    public final boolean LJIIL() {
        UnifiedAuthPopupConfig unifiedAuthPopupConfig;
        int i;
        List<PopupInstanceConfig> list;
        PopupInstanceConfig popupInstanceConfig;
        String str;
        List<PopupInstanceConfig> list2 = this.LLILLJJLI.popupInstances;
        if (list2 != null && !list2.isEmpty() && (i = (unifiedAuthPopupConfig = this.LLILLJJLI).currentIndex) >= 0 && (list = unifiedAuthPopupConfig.popupInstances) != null && i < list.size()) {
            UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LLILLJJLI;
            List<PopupInstanceConfig> list3 = unifiedAuthPopupConfig2.popupInstances;
            if (list3 == null || (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list3, unifiedAuthPopupConfig2.currentIndex)) == null || (str = popupInstanceConfig.panelId) == null) {
                return false;
            }
            return u.LJIIZILJ(str, "subscribe", false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index out of index_out_of_boundaries. config.popupInstances.size: ");
        List<PopupInstanceConfig> list4 = this.LLILLJJLI.popupInstances;
        sbLIZ.append(list4 != null ? Integer.valueOf(list4.size()) : null);
        sbLIZ.append(", config.currentIndex: ");
        sbLIZ.append(this.LLILLJJLI.currentIndex);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LLILLL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        String str;
        String strConcat;
        String str2;
        PopupInstanceConfig popupInstanceConfig;
        PopupElementsConfig popupElementsConfig;
        PanelButtons panelButtons;
        PopupInstanceConfig popupInstanceConfig2;
        PopupElementsConfig popupElementsConfig2;
        PopupInstanceConfig popupInstanceConfig3;
        PopupElementsConfig popupElementsConfig3;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.wz;
        C844470XAv.LIZ.getClass();
        Drawable drawableLIZ = c0hti.LIZ(C844470XAv.LIZ());
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LIZLLL = drawableLIZ;
        c1391960mKI.LJI = 1;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        if (list == null || (popupInstanceConfig3 = (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex)) == null || (popupElementsConfig3 = popupInstanceConfig3.popupElementsConfig) == null || (str = popupElementsConfig3.title) == null) {
            str = "Get updates from friends sent to your email?";
        }
        c1391960mKI.LJII = str;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LLILLJJLI;
        List<PopupInstanceConfig> list2 = unifiedAuthPopupConfig2.popupInstances;
        if (list2 == null || (popupInstanceConfig2 = (PopupInstanceConfig) ListProtector.get(list2, unifiedAuthPopupConfig2.currentIndex)) == null || (popupElementsConfig2 = popupInstanceConfig2.popupElementsConfig) == null || (strConcat = popupElementsConfig2.subtitle) == null) {
            strConcat = "[DEBUG] You will also be sent trending content, newsletters, promotions, account updates and more. You can unsubscribe at anytime.";
        }
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && this.LLILLJJLI.useServer) {
            strConcat = "[server] ".concat(strConcat);
        }
        c1391960mKI.LJIIIIZZ = strConcat;
        C1391990mKL c1391990mKL = new C1391990mKL();
        UnifiedAuthPopupConfig unifiedAuthPopupConfig3 = this.LLILLJJLI;
        List<PopupInstanceConfig> list3 = unifiedAuthPopupConfig3.popupInstances;
        if (list3 == null || (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list3, unifiedAuthPopupConfig3.currentIndex)) == null || (popupElementsConfig = popupInstanceConfig.popupElementsConfig) == null || (panelButtons = popupElementsConfig.buttons) == null || (str2 = panelButtons.positiveBtnText) == null) {
            str2 = "Get Updates";
        }
        c1391990mKL.LIZ(str2);
        c1391990mKL.LIZJ = new AwS642S0100000_28(this, 103);
        c1391960mKI.LJIIJJI = c1391990mKL;
        c1391960mKI.LIZ = true;
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        DialogInterfaceOnDismissListenerC19333210kM dialogInterfaceOnDismissListenerC19333210kM = new DialogInterfaceOnDismissListenerC19333210kM(this, 20);
        TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
        tuxPanel.LLILZIL = dialogInterfaceOnDismissListenerC19333210kM;
        tuxPanel.LLILZLL = new DialogInterfaceOnCancelListenerC19332810kI(this, 9);
        return tuxPanel;
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        C10DU c10du = this.LLILZIL;
        if (c10du != null) {
            c10du.LIZ(str);
        }
    }

    public C19208110Cp(UnifiedAuthPopupConfig unifiedAuthPopupConfig, C19EG c19eg, C10DE c10de, C10D5 c10d5) {
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = c19eg;
        this.LLILZ = c10de;
        this.LLILZIL = c10d5;
    }
}
