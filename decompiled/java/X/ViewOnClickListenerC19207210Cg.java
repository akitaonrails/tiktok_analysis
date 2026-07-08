package X;

import Y.AfS53S1100000_28;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.unifiedauth.push.PushUserGuideSubSwitchVM;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupElementsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.SubSwitch;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC19207210Cg extends LinearLayout implements View.OnClickListener, InterfaceC1368280li6 {
    public final UnifiedAuthPopupConfig LL;
    public PushUserGuideSubSwitchVM LLILLJJLI;
    public final Set<String> LLILLL;
    public C1086550eNh LLILZ;
    public View LLILZIL;
    public ConstraintLayout LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C424620Gku LLJ;
    public C424620Gku LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxIconView LLJILLL;
    public SmartImageView LLJJ;
    public C21415018rM LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public C197039127h LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;

    public final void onShow() {
        this.LLJJJ = true;
        if (Intrinsics.LJFF(this.LL.trigger, "dm")) {
            C813020Vuu.LJIIL().LJI(getContext(), "key_opt_dm_dialog_show", false);
        }
        this.LLJJJJLIIL = System.currentTimeMillis();
        C19207810Cm.LIZ(C19207810Cm.LIZ, this.LL, "show_push_permission_pop_up", null, null, null, 60);
    }

    private final C197039127h getButtonCancelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d75);
            this.LLJJL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButtonConfirmFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d77);
            this.LLJJLIIIJLLLLLLLZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    @Override // X.InterfaceC1368280li6
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load recent failed: ");
        sbLIZ.append(Unit.LIZ);
        C211000rc.LIZIZ("PushUserGuidePopupView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1039745817) {
            if (iHashCode != -868304044) {
                if (iHashCode == 1844104722 && str.equals("interaction")) {
                    return "338_interaction";
                }
                return "338";
            }
            if (str.equals("toggle")) {
                return "338_toggle";
            }
            return "338";
        }
        if (str.equals("normal")) {
            return "338_normal";
        }
        return "338";
    }

    private final void setOnclickListener(View... viewArr) {
        if (viewArr.length != 0) {
            for (View view : viewArr) {
                if (view != null) {
                    C786410Ut5.I7(this, view);
                }
            }
        }
    }

    private final void setSettingList(List<SubSwitch> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        C211000rc.LIZ("PushUserGuidePopupView");
        ArrayList arrayList = new ArrayList();
        for (SubSwitch subSwitch : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setSettingList: ");
            sbLIZ.append(subSwitch.switchText);
            sbLIZ.append(" = ");
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            sbLIZ.append(c19328310jZ.LIZLLL(subSwitch.switchField));
            C2188811AlT.LIZIZ(sbLIZ);
            C211000rc.LIZ("[Push]");
            if (c19328310jZ.LIZLLL(subSwitch.switchField) == 0) {
                this.LLILLL.add(subSwitch.switchField);
                arrayList.add(new C19207110Cf(this.LL, subSwitch.switchText, subSwitch.switchField));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            C1086550eNh c1086550eNh = this.LLILZ;
            if (c1086550eNh != null && (state2 = c1086550eNh.getState()) != null) {
                state2.LJFF(null);
            }
            C1086550eNh c1086550eNh2 = this.LLILZ;
            if (c1086550eNh2 != null && (state = c1086550eNh2.getState()) != null) {
                state.LIZLLL(arrayList2, null);
            }
        }
    }

    public final void LIZJ(DialogInterface dialogInterface) {
        C10CR c10cr;
        String str;
        C211000rc.LIZ("[Push]");
        this.LLJJJ = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CX.LIZ)) {
            c10cr = C10CR.CONFIRM_ACTION_TYPE;
        } else if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CW.LIZ)) {
            c10cr = C10CR.CANCEL_ACTION_TYPE;
        } else if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CV.LIZ)) {
            c10cr = C10CR.CLOSE_BTN_ACTION_TYPE;
        } else if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
            c10cr = C10CR.BACK_PRESSED_ACTION_TYPE;
        } else if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ) && this.LLJJJIL) {
            c10cr = C10CR.DELAY_ACTION_TYPE;
        } else {
            c10cr = C10CR.OTHER_ACTION_TYPE;
        }
        UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LL;
        int value = c10cr.getValue();
        String displayName = c10cr.getDisplayName();
        if (C2255281DPa.LIZ()) {
            ((IPushOptInTrackingApi) ServiceManager.get().getService(IPushOptInTrackingApi.class)).LIZJ(value, unifiedAuthPopupConfig.triggerTS, jCurrentTimeMillis, displayName);
        }
        C19207810Cm c19207810Cm = C19207810Cm.LIZ;
        UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LL;
        if (this.LLJJJJJIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C19207810Cm.LIZ(c19207810Cm, unifiedAuthPopupConfig2, "click_push_permission_pop_up", str, c10cr.getDisplayName(), Long.valueOf(jCurrentTimeMillis - this.LLJJJJLIIL), 16);
    }

    @Override // X.InterfaceC1368280li6
    public final void LLJJIJIL(List<IMContact> list) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load recent success size ");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" list:");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PushUserGuidePopupView");
        C211000rc.LIZ("[Push]");
        String str = this.LL.avatar;
        if (str != null && str.length() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        int i2 = i ^ 1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            IMContact iMContact = (IMContact) C13LP.LJJJLZIJ(i3, list);
            if (iMContact instanceof IMUser) {
                if (i2 == 0) {
                    C1324840ka2.LJFF(this.LLJ, iMContact.getDisplayAvatar());
                } else if (i2 == 1) {
                    C1324840ka2.LJFF(this.LLJI, iMContact.getDisplayAvatar());
                    return;
                }
                i2++;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        PopupActionsConfig popupActionsConfig;
        String str5;
        PopupInstanceConfig popupInstanceConfigLIZ;
        PopupActionsConfig popupActionsConfig2;
        PopupActionsConfig popupActionsConfig3;
        PopupActionsConfig popupActionsConfig4;
        PopupElementsConfig popupElementsConfig;
        List<SubSwitch> list;
        if (view.getContext() == null) {
            return;
        }
        int id = view.getId();
        String str6 = "normal";
        if (id == R.id.d77) {
            C0O1V c0o1v = UnifiedAuthPopupConfig.Companion;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LL;
            c0o1v.getClass();
            PopupInstanceConfig popupInstanceConfigLIZ2 = C0O1V.LIZ(unifiedAuthPopupConfig);
            String str7 = null;
            if (popupInstanceConfigLIZ2 != null) {
                str3 = popupInstanceConfigLIZ2.panelType;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, "normal")) {
                if (Intrinsics.LJFF("dm_streak", this.LL.trigger)) {
                    if (!C824390WVp.LIZJ(getContext())) {
                        C1440005kM.LIZ(new C1634906ah(true));
                    } else {
                        C1440005kM.LIZ(new C1634906ah(false));
                    }
                } else if (Intrinsics.LJFF("dm", this.LL.trigger)) {
                    C1440005kM.LIZ(new C1686406j0());
                }
            }
            PopupInstanceConfig popupInstanceConfigLIZ3 = C0O1V.LIZ(this.LL);
            if (popupInstanceConfigLIZ3 != null && (popupElementsConfig = popupInstanceConfigLIZ3.popupElementsConfig) != null && (list = popupElementsConfig.subSwitches) != null) {
                list.isEmpty();
            }
            if ((!this.LLILLL.isEmpty()) && (popupInstanceConfigLIZ = C0O1V.LIZ(this.LL)) != null && (popupActionsConfig2 = popupInstanceConfigLIZ.popupActionsConfig) != null && popupActionsConfig2.needSetSubSwitches) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLILLL, ",1,", null, null, 0, null, null, 62);
                PopupInstanceConfig popupInstanceConfigLIZ4 = C0O1V.LIZ(this.LL);
                if (popupInstanceConfigLIZ4 != null && (popupActionsConfig4 = popupInstanceConfigLIZ4.popupActionsConfig) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJJLIIIJ);
                    sbLIZ.append(",1");
                    popupActionsConfig4.setSubSwitchesNewKeyValues(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Toggle new key-values: ");
                PopupInstanceConfig popupInstanceConfigLIZ5 = C0O1V.LIZ(this.LL);
                if (popupInstanceConfigLIZ5 != null && (popupActionsConfig3 = popupInstanceConfigLIZ5.popupActionsConfig) != null) {
                    str7 = popupActionsConfig3.subSwitchesNewKeyValues;
                }
                sbLIZ2.append(str7);
                C2188811AlT.LIZIZ(sbLIZ2);
                C211000rc.LIZ("[Push]");
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Configs: ");
            sbLIZ3.append(C08JS.LIZLLL(this.LL));
            C2188811AlT.LIZIZ(sbLIZ3);
            C211000rc.LIZ("PushUserGuidePopupView");
            PopupInstanceConfig popupInstanceConfigLIZ6 = C0O1V.LIZ(this.LL);
            if (popupInstanceConfigLIZ6 != null && (popupActionsConfig = popupInstanceConfigLIZ6.popupActionsConfig) != null) {
                if (popupActionsConfig.jump2SystemSettings && !C824390WVp.LIZJ(getContext())) {
                    C211000rc.LIZ("[Push]");
                    C824390WVp.LJFF(getContext(), this.LL.trigger);
                }
                if (popupActionsConfig.needSetSubSwitches && (str5 = popupActionsConfig.subSwitchesNewKeyValues) != null && str5.length() > 0) {
                    AbstractC19484711Kz.LJII(new C19334510kZ(str5, popupActionsConfig, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS53S1100000_28(popupActionsConfig, str5, 4), new AfS53S1100000_28(popupActionsConfig, str5, 5));
                }
            }
            InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
            PopupInstanceConfig popupInstanceConfigLIZ7 = C0O1V.LIZ(this.LL);
            if (popupInstanceConfigLIZ7 != null && (str4 = popupInstanceConfigLIZ7.panelType) != null) {
                str6 = str4;
            }
            interfaceC1589330rSdLIZJ.LJIJI(LIZ(str6), "turnOnNotif_bottomSheet_button_getNotified", true);
            C211000rc.LIZ("[Push]");
            String str8 = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(this, C10CX.LIZ);
            return;
        }
        if (id == R.id.d75) {
            C211000rc.LIZ("[Push]");
            String str9 = TuxSheet._pnsPageId;
            C1391190mJ3.LJ(this, C10CW.LIZ);
            InterfaceC1589330rSd interfaceC1589330rSdLIZJ2 = C849850XVn.LIZIZ.LIZJ();
            C0O1V c0o1v2 = UnifiedAuthPopupConfig.Companion;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig2 = this.LL;
            c0o1v2.getClass();
            PopupInstanceConfig popupInstanceConfigLIZ8 = C0O1V.LIZ(unifiedAuthPopupConfig2);
            if (popupInstanceConfigLIZ8 != null && (str2 = popupInstanceConfigLIZ8.panelType) != null) {
                str6 = str2;
            }
            interfaceC1589330rSdLIZJ2.LJIJI(LIZ(str6), "turnOnNotif_bottomSheet_button_notNow", false);
            return;
        }
        if (id == R.id.fru) {
            boolean z = !this.LLJJJJ;
            this.LLJJJJ = z;
            this.LLJJJJJIL = true;
            if (z) {
                TuxTextView tuxTextView = this.LLJJIII;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
            } else {
                TuxTextView tuxTextView2 = this.LLJJIII;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
            }
            C19207810Cm c19207810Cm = C19207810Cm.LIZ;
            UnifiedAuthPopupConfig unifiedAuthPopupConfig3 = this.LL;
            if (this.LLJJJJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C19207810Cm.LIZ(c19207810Cm, unifiedAuthPopupConfig3, "expand_push_description", str, null, null, 56);
            return;
        }
        if (id != R.id.e2l) {
            return;
        }
        String str10 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(this, C10CV.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC19207210Cg(android.content.Context r16, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r17) {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC19207210Cg.<init>(android.content.Context, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig):void");
    }

    public final void LIZLLL(C21415018rM c21415018rM, String str) {
        int iIntValue;
        float fLJIIJ = C12ES.LJIIJ(getContext()) - C12ES.LIZJ(64.0f, getContext());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTuxTextLayoutViewText(");
        sbLIZ.append(fLJIIJ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c444830HcP.LJII(123);
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJ = (int) fLJIIJ;
        c444840HcQ.LJI = Layout.Alignment.ALIGN_CENTER;
        c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, false, C431830GwX.LIZ(c444830HcP, null, null), 27));
    }
}
