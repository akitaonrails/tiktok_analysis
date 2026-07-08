package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.notification.vm.GuideUserSwitchVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.unifiedauthapi.push.tracking.IPushOptInTrackingApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CQ extends LinearLayout implements View.OnClickListener, InterfaceC1368280li6 {
    public final C1917290zzb LL;
    public C197039127h LLILLJJLI;
    public C197039127h LLILLL;
    public RelativeLayout LLILZ;
    public TuxTextView LLILZIL;
    public C1841350y17 LLILZLL;
    public RelativeLayout LLIZ;
    public C1841350y17 LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public View LLJIJIL;
    public TuxTextView LLJILJIL;
    public GuideUserSwitchVM LLJILJILJ;
    public final Set<String> LLJILLL;
    public C1086540eNg LLJJ;
    public C424620Gku LLJJI;
    public C424620Gku LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public TuxIconView LLJJL;
    public SmartImageView LLJJLIIIJLLLLLLLZ;
    public C21415018rM LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public PushSettings LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public long LLLFFI;

    @Override // X.InterfaceC1368280li6
    public final void LIZIZ() {
    }

    public final void onShow() {
        this.LLJLLIL = true;
        if (Intrinsics.LJFF(this.LL.LIZLLL, "dm")) {
            this.LLLFF = true;
            C813020Vuu.LJIIL().LJI(getContext(), "key_opt_dm_dialog_show", false);
        }
        this.LLLFFI = System.currentTimeMillis();
        if (!Intrinsics.LJFF(this.LL.LIZ, "customized_ui_edm")) {
            C1917350zzh.LIZ(C1917350zzh.LIZ, this.LL, null, this.LLLF, this.LLLFF, "show_push_permission_pop_up", null, null, null, null, 482);
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL.LIZIZ);
        c2344009Gk.LJIIIIZZ("exp_name", "coin_incentive");
        c2344009Gk.LJIIIIZZ("trigger", this.LL.LIZLLL);
        C20684815ws.LJIILLIIL("show_email_consent_popup_page", c2344009Gk.LIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10CQ.LJ():void");
    }

    public final TuxTextView getAllDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.awx);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1841350y17 getAllRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ax4);
            this.LLIZLLLIL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final RelativeLayout getAllScopeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ax5);
            this.LLIZ = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final TuxTextView getAllTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ax7);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C197039127h getButtonCancelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d75);
            this.LLILLJJLI = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final C197039127h getButtonConfirmFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d77);
            this.LLILLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxTextView getFriendsDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.im0);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1841350y17 getFriendsRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.imc);
            this.LLILZLL = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final RelativeLayout getFriendsScopeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.imd);
            this.LLILZ = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final TuxTextView getFriendsTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.imn);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getHorizontalLineFromXml() {
        View view = this.LLJIJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.jrj);
        this.LLJIJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final C1917290zzb getParam() {
        return this.LL;
    }

    public static final String LIZJ(String str) {
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

    private final void setSettingList(PushSettings pushSettings) {
        int i;
        this.LLL = pushSettings;
        ArrayList arrayList = new ArrayList();
        if (pushSettings.diggPush == 0) {
            String string = getContext().getString(2131847791);
            this.LLJILLL.add("digg_push");
            arrayList.add(new C10CS(this.LL, string, "digg_push"));
        }
        if (pushSettings.commentPush == 0) {
            String string2 = getContext().getString(2131847788);
            this.LLJILLL.add("comment_push");
            arrayList.add(new C10CS(this.LL, string2, "comment_push"));
        }
        if (pushSettings.followPush == 0) {
            String string3 = getContext().getString(2131847790);
            this.LLJILLL.add("follow_push");
            arrayList.add(new C10CS(this.LL, string3, "follow_push"));
        }
        if (pushSettings.mentionPush == 0) {
            Context context = getContext();
            int iLIZIZ = C298710BnJ.LIZIZ();
            if (1 <= iLIZIZ && iLIZIZ < 5) {
                i = 2131837168;
            } else {
                i = 2131847793;
            }
            String string4 = context.getString(i);
            this.LLJILLL.add("mention_push");
            arrayList.add(new C10CS(this.LL, string4, "mention_push"));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            C1086540eNg c1086540eNg = this.LLJJ;
            if (c1086540eNg == null) {
                c1086540eNg = null;
            }
            c1086540eNg.getState().LJFF(null);
            C1086540eNg c1086540eNg2 = this.LLJJ;
            if (c1086540eNg2 == null) {
                c1086540eNg2 = null;
            }
            c1086540eNg2.getState().LIZLLL(arrayList2, null);
        }
    }

    public final C10CR LIZ(DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CX.LIZ)) {
            return C10CR.CONFIRM_ACTION_TYPE;
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CW.LIZ)) {
            return C10CR.CANCEL_ACTION_TYPE;
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C10CV.LIZ)) {
            return C10CR.CLOSE_BTN_ACTION_TYPE;
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
            return C10CR.BACK_PRESSED_ACTION_TYPE;
        }
        if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ)) {
            if (this.LLJLLL) {
                return C10CR.DELAY_ACTION_TYPE;
            }
            return C10CR.OTHER_ACTION_TYPE;
        }
        return C10CR.OTHER_ACTION_TYPE;
    }

    public final void LIZLLL(DialogInterface dialogInterface) {
        String str;
        int i = C2187451AjH.LIZ;
        this.LLJLLIL = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C10CR c10crLIZ = LIZ(dialogInterface);
        C1917290zzb c1917290zzb = this.LL;
        int value = c10crLIZ.getValue();
        String displayName = c10crLIZ.getDisplayName();
        if (C2255281DPa.LIZ()) {
            ((IPushOptInTrackingApi) ServiceManager.get().getService(IPushOptInTrackingApi.class)).LIZJ(value, c1917290zzb.LJI, jCurrentTimeMillis, displayName);
        }
        if (!Intrinsics.LJFF(this.LL.LIZ, "customized_ui_edm")) {
            C1917350zzh c1917350zzh = C1917350zzh.LIZ;
            C1917290zzb c1917290zzb2 = this.LL;
            boolean z = this.LLLF;
            boolean z2 = this.LLLFF;
            if (this.LLJZIJLIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C1917350zzh.LIZ(c1917350zzh, c1917290zzb2, null, z, z2, "click_push_permission_pop_up", str, c10crLIZ.getDisplayName(), null, Long.valueOf(jCurrentTimeMillis - this.LLLFFI), 130);
        } else {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LL.LIZIZ);
            c2344009Gk.LJIIIIZZ("exp_name", "coin_incentive");
            c2344009Gk.LJIIIIZZ("trigger", this.LL.LIZLLL);
            c2344009Gk.LJIIIIZZ("button_name", LIZ(dialogInterface).getDisplayName());
            C20684815ws.LJIILLIIL("click_email_consent_popup_page", c2344009Gk.LIZ);
        }
        this.LLLFF = false;
    }

    @Override // X.InterfaceC1368280li6
    public final void LLJJIJIL(List<IMContact> list) {
        int i = C2187451AjH.LIZ;
        if (Intrinsics.LJFF("dm_streak", this.LL.LIZLLL)) {
            return;
        }
        int size = ((ArrayList) list).size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            IMContact iMContact = (IMContact) C13LP.LJJJLZIJ(i2, list);
            if (iMContact instanceof IMUser) {
                C424620Gku c424620Gku = null;
                if (!z) {
                    C424620Gku c424620Gku2 = this.LLJJI;
                    if (c424620Gku2 == null) {
                        c424620Gku2 = null;
                    }
                    C1324840ka2.LJFF(c424620Gku2, iMContact.getDisplayAvatar());
                    z = true;
                } else {
                    C424620Gku c424620Gku3 = this.LLJJIII;
                    if (c424620Gku3 != null) {
                        c424620Gku = c424620Gku3;
                    }
                    C1324840ka2.LJFF(c424620Gku, iMContact.getDisplayAvatar());
                    return;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10CQ.onClick(android.view.View):void");
    }

    public final void setAllDescFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setAllRadioFromXml(C1841350y17 c1841350y17) {
        this.LLIZLLLIL = c1841350y17;
    }

    public final void setAllScopeFromXml(RelativeLayout relativeLayout) {
        this.LLIZ = relativeLayout;
    }

    public final void setAllTextFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setButtonCancelFromXml(C197039127h c197039127h) {
        this.LLILLJJLI = c197039127h;
    }

    public final void setButtonConfirmFromXml(C197039127h c197039127h) {
        this.LLILLL = c197039127h;
    }

    public final void setFriendsDescFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setFriendsRadioFromXml(C1841350y17 c1841350y17) {
        this.LLILZLL = c1841350y17;
    }

    public final void setFriendsScopeFromXml(RelativeLayout relativeLayout) {
        this.LLILZ = relativeLayout;
    }

    public final void setFriendsTextFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setHorizontalLineFromXml(View view) {
        this.LLJIJIL = view;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0703  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10CQ(android.content.Context r19, X.C1917290zzb r20) {
        /*
            Method dump skipped, instruction units count: 2264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10CQ.<init>(android.content.Context, X.0zzb):void");
    }

    public final void LJFF(C21415018rM c21415018rM, int i) {
        LJI(c21415018rM, C1618770sE7.LIZJ(i));
    }

    public final void LJI(C21415018rM c21415018rM, String str) {
        int iIntValue;
        float fLJIIJ = C12ES.LJIIJ(getContext()) - C12ES.LIZJ(64.0f, getContext());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTuxTextLayoutViewText(");
        sbLIZ.append(fLJIIJ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
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
