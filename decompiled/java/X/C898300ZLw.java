package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS154S1200000_14;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C898300ZLw extends AbstractViewOnClickListenerC894730Z8d {
    public InterfaceC892560Yzu LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public C898320ZLy LLILZ;

    public final SmartImageView getImageButton() {
        return (SmartImageView) this.LLILLJJLI.getValue();
    }

    public final TuxTextView getTextButton() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public void LIZLLL() {
        C337180DJs.LIZ(getImageButton());
        C337180DJs.LIZ(getTextButton());
    }

    public final C898320ZLy getLightInteractionEntryContext() {
        return this.LLILZ;
    }

    public final InterfaceC892560Yzu getReporter() {
        return this.LL;
    }

    public static String LIZJ(C898320ZLy c898320ZLy) {
        Boolean boolValueOf = null;
        if (c898320ZLy.LIZLLL != 0) {
            return null;
        }
        C595710NYb c595710NYb = new C595710NYb(String.valueOf(C0YNP.LJII(c898320ZLy.LJ)));
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595710NYb);
        if (c595660NXwLIZIZ != null) {
            boolValueOf = Boolean.valueOf(C896480ZEw.LIZJ(c595660NXwLIZIZ));
        }
        return C898170ZLj.LL.LJJLIIIJLLLLLLLZ(boolValueOf);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C898320ZLy c898320ZLy;
        LightInteractionEntryConf lightInteractionEntryConf;
        String interactionName;
        if (!C0OBG.LIZIZ(view) && (c898320ZLy = this.LLILZ) != null && (lightInteractionEntryConf = c898320ZLy.LIZ) != null && (interactionName = lightInteractionEntryConf.getInteractionName()) != null) {
            InterfaceC892560Yzu interfaceC892560Yzu = this.LL;
            String str = "";
            if (interfaceC892560Yzu != null) {
                String str2 = c898320ZLy.LJFF.get("light_interaction_enter_from");
                if (str2 == null && (str2 = c898320ZLy.LJFF.get("enter_from")) == null) {
                    str2 = "";
                }
                String str3 = c898320ZLy.LJFF.get("light_interaction_enter_method");
                if (str3 == null && (str3 = c898320ZLy.LJFF.get("enter_method")) == null) {
                    str3 = "";
                }
                String str4 = c898320ZLy.LJFF.get("position");
                String strLIZJ = LIZJ(c898320ZLy);
                C898170ZLj c898170ZLj = C898170ZLj.LL;
                String interactionName2 = c898320ZLy.LIZ.getInteractionName();
                if (interactionName2 == null) {
                    interactionName2 = "";
                }
                interfaceC892560Yzu.LJ(str2, str3, str4, null, strLIZJ, c898170ZLj.LJII(interactionName2));
            }
            C0ZM3.LLILLJJLI.LJIILLIIL(getContext());
            IRemindUsersViewHelper iRemindUsersViewHelperLJIJJLI = C1336205Ku.LIZ(false).getImChatService().LJIJJLI();
            Context context = getContext();
            String str5 = c898320ZLy.LJFF.get("enter_from");
            if (str5 != null) {
                str = str5;
            }
            iRemindUsersViewHelperLJIJJLI.LIZ(context, str, true, new AwS154S1200000_14(c898320ZLy, this, interactionName, 1));
        }
    }

    public final void setLightInteractionEntryContext(C898320ZLy c898320ZLy) {
        this.LLILZ = c898320ZLy;
    }

    public final void setReporter(InterfaceC892560Yzu interfaceC892560Yzu) {
        this.LL = interfaceC892560Yzu;
    }

    public C898300ZLw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dan, this, true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS402S0200000_1(this, context, 93));
        this.LLILLL = C452501pT.LIZIZ(new AwS402S0200000_1(this, context, 94));
    }

    @Override // X.AbstractViewOnClickListenerC894730Z8d
    public final void LIZ(int i, C0ZM0 c0zm0, C0C97 c0c97, LightInteractionEntryConf lightInteractionEntryConf, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        String interactionName;
        C898320ZLy c898320ZLy = new C898320ZLy(i, c0zm0, c0c97, lightInteractionEntryConf, str, str3, str2, map, z, z2);
        if (Intrinsics.LJFF(this.LLILZ, c898320ZLy)) {
            return;
        }
        LIZLLL();
        if (str2.length() > 0 && (interactionName = lightInteractionEntryConf.getInteractionName()) != null && C0ZM3.LLILLJJLI.LJJIIZI(interactionName) != null) {
            this.LLILZ = c898320ZLy;
            if (lightInteractionEntryConf.getIconUrl() != null) {
                C337180DJs.LIZJ(getImageButton());
                ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_UID, true).LIZ("light_interaction_entry_icon_preload", lightInteractionEntryConf.getIconUrl());
                String iconUrl = lightInteractionEntryConf.getIconUrl();
                if (iconUrl != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(iconUrl);
                    c1331670kl3LJIIIZ.LIZLLL("LightInteractionEntryView");
                    C1332130kln.LIZJ(c1331670kl3LJIIIZ, C06TB.DEFAULT);
                    c1331670kl3LJIIIZ.LJJ(getImageButton());
                    C1332130kln.LJFF(c1331670kl3LJIIIZ, "LightInteractionEntryView", null, false, null, null, null, 62);
                }
            } else if (lightInteractionEntryConf.getText() != null) {
                C337180DJs.LIZJ(getTextButton());
                getTextButton().setText(lightInteractionEntryConf.getText());
            }
            InterfaceC892560Yzu interfaceC892560Yzu = this.LL;
            if (interfaceC892560Yzu != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append((String) map.get("enter_from"));
                sbLIZ.append((String) map.get("light_interaction_enter_from"));
                sbLIZ.append((String) map.get("enter_method"));
                sbLIZ.append((String) map.get("light_interaction_enter_method"));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str4 = (String) map.get("light_interaction_enter_from");
                String str5 = "";
                if (str4 == null && (str4 = (String) map.get("enter_from")) == null) {
                    str4 = "";
                }
                String str6 = (String) map.get("light_interaction_enter_method");
                if (str6 == null && (str6 = (String) map.get("enter_method")) == null) {
                    str6 = "";
                }
                String str7 = (String) map.get("position");
                String str8 = (String) map.get("push_label");
                String strLIZJ = LIZJ(c898320ZLy);
                C898170ZLj c898170ZLj = C898170ZLj.LL;
                String interactionName2 = lightInteractionEntryConf.getInteractionName();
                if (interactionName2 != null) {
                    str5 = interactionName2;
                }
                interfaceC892560Yzu.LIZIZ(strLIZIZ, str4, str6, str7, str8, strLIZJ, c898170ZLj.LJII(str5));
            }
        }
    }
}
