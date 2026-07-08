package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PanelButtons;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208010Co extends AbstractC20659615so<TuxPanel> {
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
        String str2 = unifiedAuthPopupConfig.subSceneId;
        String str3 = unifiedAuthPopupConfig.trigger;
        c19209010Cy.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        if (str2.length() == 0) {
            str2 = "others";
        }
        c2344009Gk.LJFF("page_name", str2);
        c2344009Gk.LJFF("trigger", str3);
        c2344009Gk.LJFF("show_type", "popup");
        c2344009Gk.LIZJ(1, "mobile");
        C20684815ws.LJIILLIIL("tiktok_sms_popup_show", c2344009Gk.LIZ);
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

    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.bytedance.tux.sheet.intro.TuxPanel, java.lang.Object] */
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
        c0hti.LIZ = R.drawable.x0;
        C844470XAv.LIZ.getClass();
        Drawable drawableLIZ = c0hti.LIZ(C844470XAv.LIZ());
        final C259800zU c259800zU = new C259800zU();
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LIZLLL = drawableLIZ;
        c1391960mKI.LJI = 1;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILLJJLI;
        List<PopupInstanceConfig> list = unifiedAuthPopupConfig.popupInstances;
        if (list == null || (popupInstanceConfig3 = (PopupInstanceConfig) ListProtector.get(list, unifiedAuthPopupConfig.currentIndex)) == null || (popupElementsConfig3 = popupInstanceConfig3.popupElementsConfig) == null || (str = popupElementsConfig3.title) == null) {
            str = "Get updates from friends sent to your SMS?";
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
        c1391990mKL.LIZJ = new AwS642S0100000_28(this, 67);
        c1391960mKI.LJIIJJI = c1391990mKL;
        c1391960mKI.LIZ = true;
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        DialogInterfaceOnDismissListenerC19333110kL dialogInterfaceOnDismissListenerC19333110kL = new DialogInterfaceOnDismissListenerC19333110kL(this, c259800zU, 2);
        ?? r1 = c439850HMpLIZ.LIZ;
        r1.LLILZIL = dialogInterfaceOnDismissListenerC19333110kL;
        r1.LLILZLL = new DialogInterface.OnCancelListener() { // from class: X.10Cz
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractC439520HLi abstractC439520HLi;
                String str3;
                C10DT c10dt = this.LL.LLILZ;
                if (c10dt != null) {
                    c10dt.LIZ(C10CV.LIZ);
                }
                TuxPanel tuxPanel = c259800zU.element;
                if (tuxPanel != null) {
                    abstractC439520HLi = tuxPanel.LLJILLL;
                } else {
                    abstractC439520HLi = null;
                }
                if (Intrinsics.LJFF(abstractC439520HLi, C439530HLj.LIZ)) {
                    str3 = "cancel";
                } else {
                    str3 = "";
                }
                C19209010Cy c19209010Cy = C19209010Cy.LIZ;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig4 = this.LL.LLILLJJLI;
                String str4 = unifiedAuthPopupConfig4.enterFrom;
                String str5 = unifiedAuthPopupConfig4.subSceneId;
                String str6 = unifiedAuthPopupConfig4.trigger;
                c19209010Cy.getClass();
                C19209010Cy.LIZLLL(str4, str5, str6, str3, null);
            }
        };
        c259800zU.element = r1;
        return r1;
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        C10DU c10du = this.LLILZIL;
        if (c10du != null) {
            c10du.LIZ(str);
        }
    }

    public C19208010Co(UnifiedAuthPopupConfig unifiedAuthPopupConfig, C19EG c19eg, C10DF c10df, C10D6 c10d6) {
        this.LLILLJJLI = unifiedAuthPopupConfig;
        this.LLILLL = c19eg;
        this.LLILZ = c10df;
        this.LLILZIL = c10d6;
    }
}
