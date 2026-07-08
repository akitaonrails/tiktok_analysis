package X;

import Y.ACListenerS155S0100000_21;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363950lb7 extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final int LLLFFI;
    public SharePanelViewModel LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final InterfaceC897330ZId LLILZIL;
    public final InterfaceC1362600lYw LLILZLL;
    public final EnumC1364050lbH LLIZ;
    public final Function1<IMContact, Unit> LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final FrameLayout LLJIJIL;
    public final SmartAvatarImageView LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final C0HZQ LLJILLL;
    public final View LLJJ;
    public IMContact LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C427920GqE LLJJIJIL;
    public final C1364290lbf LLJJJ;
    public C0ZE7 LLJJJIL;
    public final C1361580lXI LLJJJJ;
    public boolean LLJJJJJIL;
    public C429270GsP LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public final C2252331DDr LLJLL;
    public final C2252331DDr LLJLLIL;
    public final C414301jJ LLJLLL;
    public final C1402260mau LLJZ;
    public final C515901zh LLJZIJLIL;
    public final C1363500laO LLL;
    public AnonymousClass0956 LLLF;
    public final C054G LLLFF;

    static {
        C844470XAv.LIZ.getClass();
        LLLFFI = C844470XAv.LIZ().getResources().getDimensionPixelSize(R.dimen.a2y);
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640));
    }

    public final void P5() {
        C19M4 c19m4;
        TextView textView = this.LLJ;
        if (!(textView instanceof C19M4) || (c19m4 = (C19M4) textView) == null) {
            return;
        }
        c19m4.setTextColorRes(this.LLILZ);
        c19m4.setEndIcon(null);
        IMContact iMContact = this.LLJJI;
        if (iMContact instanceof IMUser) {
            S5((IMUser) iMContact);
        } else if (iMContact instanceof IMConversation) {
            R5((IMConversation) iMContact);
        }
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        String strLJIIIZ;
        String strLIZJ;
        InterfaceC897330ZId interfaceC897330ZId;
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        Object objValueOf = "";
        if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ(this.LLJJI)) == null) {
            strLJIIIZ = "";
        }
        map.put("to_user_id", strLJIIIZ);
        map.put("rank_index", String.valueOf(this.LLJJIII));
        IMContact iMContact = this.LLJJI;
        map.put("icon_type", iMContact instanceof IMUser ? "private" : iMContact instanceof IMConversation ? "group" : "");
        IMContact iMContact2 = this.LLJJI;
        if (iMContact2 instanceof IMUser) {
            C1364620lcC.LIZ.getClass();
            strLIZJ = C1364620lcC.LIZJ(iMContact2, "");
        } else {
            strLIZJ = "";
        }
        map.put("share_relation_type", strLIZJ);
        map.put("panel_source", "share_panel");
        IMContact iMContact3 = this.LLJJI;
        if ((iMContact3 instanceof IMUser) && (iMUser = (IMUser) iMContact3) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILZLL;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
        if (C595800NYk.LIZ().imitateLiveDataInShareScenario || (interfaceC897330ZId = this.LLILZIL) == null) {
            return;
        }
        interfaceC897330ZId.LIZIZ(true, this.LLL);
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
        InterfaceC897330ZId interfaceC897330ZId;
        C1364290lbf c1364290lbf = this.LLJJJ;
        if (c1364290lbf != null) {
            c1364290lbf.LIZLLL();
        }
        ((IDMAvatarLoader) this.LLJJL.getValue()).LIZ();
        if (C595800NYk.LIZ().imitateLiveDataInShareScenario || (interfaceC897330ZId = this.LLILZIL) == null) {
            return;
        }
        interfaceC897330ZId.LJIIJ(this.LLL);
    }

    public final boolean L5(IMContact iMContact) {
        if (this.LL.LLJJJ) {
            if (iMContact instanceof IMUser) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = ((IMUser) iMContact).getFollowStatus();
                c2201941BFw.getClass();
                if (C2201941BFw.LIZLLL(followStatus)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final SpannableStringBuilder N5(String str) {
        Map<String, SpannableStringBuilder> map = C1364090lbL.LIZ;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((LinkedHashMap) map).get(str);
        if (spannableStringBuilder == null) {
            SpannableStringBuilder spannableStringBuilderLIZ = C0P0R.LIZ(new SpannableStringBuilder(C1364100lbM.LIZ(str)), this.LLJ.getPaint(), this.LLILLJJLI, this.LLJ.getMaxLines());
            map.put(str, spannableStringBuilderLIZ);
            return spannableStringBuilderLIZ;
        }
        return spannableStringBuilder;
    }

    public final void R5(IMConversation iMConversation) {
        String strLIZIZ;
        int conversationMemberCount;
        SharePackage sharePackage = this.LL.LL;
        String str = null;
        if (sharePackage != null) {
            str = sharePackage.itemType;
        }
        String str2 = "";
        if (!Intrinsics.LJFF(str, "group") || (conversationMemberCount = iMConversation.getConversationMemberCount()) < 1) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(conversationMemberCount);
            sbLIZ.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        TextView textView = this.LLJ;
        StringBuilder sb = new StringBuilder();
        String displayName = iMConversation.getDisplayName();
        if (C123100dR.LIZ(displayName) && displayName != null) {
            str2 = displayName;
        }
        sb.append(str2);
        sb.append(strLIZIZ);
        C1710306mr.LIZJ(textView, N5(sb.toString()));
    }

    public final void S5(IMUser iMUser) {
        boolean z;
        SpannableStringBuilder spannableStringBuilderN5;
        String strLIZJ = C1243240iSQ.LIZJ(C1243240iSQ.LIZ, iMUser, iMUser.getDisplayName());
        if (!C123100dR.LIZ(strLIZJ)) {
            strLIZJ = null;
        }
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String str = this.LL.LLJZ;
        boolean z2 = false;
        if (str != null && str.length() > 0 && Intrinsics.LJFF(str, iMUser.getUid())) {
            strLIZJ = this.itemView.getContext().getString(2131835446, strLIZJ);
            z = true;
        } else {
            z = false;
        }
        TextView textView = this.LLJ;
        if (z) {
            spannableStringBuilderN5 = C0P0R.LIZ(new SpannableStringBuilder(C1364100lbM.LIZ(strLIZJ)), this.LLJ.getPaint(), this.LLILLJJLI, this.LLJ.getMaxLines());
        } else {
            spannableStringBuilderN5 = N5(strLIZJ);
        }
        textView.setText(spannableStringBuilderN5);
        String strLJJIFFI = u.LJJIFFI(this.LLJ.getText().toString(), "\n", "", false);
        if (!Intrinsics.LJFF(iMUser.getDisplayName(), strLJJIFFI) && u.LJIIZILJ(strLJJIFFI, "... ", false)) {
            z2 = true;
        }
        C1908030zkf.LJIIIZ(this.LLJ.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LLJ, z2);
    }

    public final void U5(IMContact iMContact) {
        String strLJIIIZ;
        Bundle bundle;
        String str = this.LL.LLJJL;
        if (str != null) {
            ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
            if (contactFeatureLIZ != null) {
                strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact);
            } else {
                strLJIIIZ = null;
            }
            if (!Intrinsics.LJFF(strLJIIIZ, str) || this.LLJJIJIIJIL) {
                return;
            }
            boolean z = !this.LLJJIJI;
            IMContact iMContact2 = this.LLJJI;
            if (iMContact2 != null && this.LL.LJIJJLI(iMContact2, z)) {
                this.LLJLL.LIZJ(iMContact2);
                SharePackage sharePackage = this.LL.LL;
                if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                    C786410Ut5.LJJJI("incentive_share_action", "tiktok_friends", bundle);
                }
            }
            this.LL.LLJJL = null;
        }
    }

    public final void W5(EnumC1364010lbD enumC1364010lbD) {
        Bundle bundle;
        C19M4 c19m4;
        int i = C1364020lbE.LIZIZ[enumC1364010lbD.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
                            C786410Ut5.LJLLLLLL(0, this.LLJILLL);
                            this.LLJILLL.setSelected(false);
                            this.LLJILLL.setChecked(false);
                            C786410Ut5.LJLLLLLL(8, this.LLJJ);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    if (C1364020lbE.LIZ[this.LLIZ.ordinal()] == 1) {
                        C786410Ut5.LJLLLLLL(0, this.LLJJIJIL);
                        this.LLJJIJIL.setActivityStatus(this.LLJJJJLIIL);
                        C786410Ut5.LJLLLLLL(8, this.LLJILLL);
                        C786410Ut5.LJLLLLLL(8, this.LLJJ);
                        P5();
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, this.LLJJIJIL);
                    this.LLJJIJIL.setActivityStatus(this.LLJJJJLIIL);
                    C786410Ut5.LJLLLLLL(8, this.LLJILLL);
                    C786410Ut5.LJLLLLLL(8, this.LLJJ);
                    return;
                }
                if (C1364020lbE.LIZ[this.LLIZ.ordinal()] == 1) {
                    TuxIconView tuxIconView = this.LLJILJILJ;
                    if (tuxIconView != null) {
                        C786410Ut5.LJLLLLLL(8, tuxIconView);
                    }
                    TextView textView = this.LLJ;
                    if (!(textView instanceof C19M4) || (c19m4 = (C19M4) textView) == null) {
                        return;
                    }
                    c19m4.setTextColorRes(R.attr.a04);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    c19m4.setEndIcon(c419910GdJ);
                    c19m4.setText(c19m4.getContext().getString(2131837217));
                    return;
                }
                C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
                C786410Ut5.LJLLLLLL(0, this.LLJILLL);
                this.LLJILLL.setSelected(true);
                this.LLJILLL.setChecked(true);
                C786410Ut5.LJLLLLLL(0, this.LLJJ);
                return;
            }
            if (C1364020lbE.LIZ[this.LLIZ.ordinal()] != 1) {
                return;
            }
            Function1<IMContact, Unit> function1 = this.LLIZLLLIL;
            if (function1 != null) {
                function1.invoke(this.LLJJI);
                return;
            }
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            EnterChatParams enterChatParams = new EnterChatParams(this.itemView.getContext(), this.LLJJI);
            enterChatParams.setQuickChat(true);
            SharePackage sharePackage = this.LL.LL;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                String string = bundle.getString("enter_method");
                if (string != null) {
                    enterChatParams.setEnterMethodForMob(string);
                }
                String string2 = bundle.getString("enter_from");
                if (string2 != null) {
                    enterChatParams.setEnterFromForMob(string2);
                }
            }
            imChatService.LJIILLIIL(enterChatParams, null);
            InterfaceC1363760lao interfaceC1363760lao = this.LL.LLJILJIL;
            if (interfaceC1363760lao == null) {
                return;
            }
            interfaceC1363760lao.LJLJJLL();
            return;
        }
        if (C1364020lbE.LIZ[this.LLIZ.ordinal()] == 1) {
            C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
            TuxIconView tuxIconView2 = this.LLJILJILJ;
            if (tuxIconView2 != null) {
                C786410Ut5.LJLLLLLL(0, tuxIconView2);
            }
            P5();
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
        C786410Ut5.LJLLLLLL(8, this.LLJILLL);
        C786410Ut5.LJLLLLLL(8, this.LLJJ);
    }

    public final void I5(String str, String str2) {
        Object obj;
        Bundle bundle;
        String[] strArr = {"long_press", "publish_then_share"};
        SharePackage sharePackage = this.LL.LL;
        String str3 = null;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            try {
                obj = bundle.get("enter_method");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (C13LQ.LJJIJIIJI(obj, strArr) >= 0) {
            SharePackage sharePackage2 = this.LL.LL;
            if (sharePackage2 != null) {
                str3 = sharePackage2.itemType;
            }
            if (!Intrinsics.LJFF(str3, "repost")) {
                return;
            }
        }
        if (str2 != null) {
            InterfaceC899120ZPa interfaceC899120ZPa = (InterfaceC899120ZPa) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interfaceC899120ZPa != null) {
                interfaceC899120ZPa.LIZLLL(2, str2, new C1364030lbF(this), true);
                return;
            }
            return;
        }
        if (str != null) {
            InterfaceC899120ZPa interfaceC899120ZPa2 = (InterfaceC899120ZPa) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interfaceC899120ZPa2 == null) {
                return;
            }
            interfaceC899120ZPa2.LIZIZ(2, str, new C1364040lbG(this), true);
            return;
        }
        InterfaceC899120ZPa interfaceC899120ZPa3 = (InterfaceC899120ZPa) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC899120ZPa3 == null) {
            return;
        }
        interfaceC899120ZPa3.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r5, X.C429270GsP r6) {
        /*
            r4 = this;
            r4.LLJJJJLIIL = r6
            if (r6 == 0) goto L44
            boolean r0 = X.C429290GsR.LIZ(r6)
            r3 = 1
            if (r0 != r3) goto L44
        Lb:
            X.1DDr r1 = r4.LLJLLIL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.LIZJ(r0)
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto L33
            r0 = r5
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r0 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r0
            r0.setActive(r3)
            android.view.View r2 = r4.itemView
            java.lang.String r1 = r5.getUid()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.C0ZJ7.LIZIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r4.LLJJI
            X.0ZE7 r0 = r4.LLJJJIL
            X.C897490ZIt.LIZJ(r4, r1, r0)
        L32:
            return
        L33:
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r5 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r5
            r5.setActive(r3)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = r4.LLJJI
            X.0ZE7 r0 = r4.LLJJJIL
            X.C897490ZIt.LIZJ(r4, r1, r0)
            return
        L44:
            r3 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363950lb7.T5(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.0GsP):void");
    }

    public final void V5(C1362510lYn c1362510lYn, Boolean bool) {
        View viewFindViewById;
        boolean zBooleanValue;
        View viewFindViewById2;
        float f = 1.0f;
        if (c1362510lYn.LIZ && this.LLIZ == EnumC1364050lbH.MASK_WITH_CHECK_MARK) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = this.LLJJIJI;
            }
            if (zBooleanValue) {
                viewFindViewById2 = this.LLJILJIL;
            } else {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.bi2);
                }
            }
            if (viewFindViewById2 != null) {
                C786410Ut5.T4(viewFindViewById2, 0.34f);
            }
        } else {
            C786410Ut5.J5(this.LLJILJIL, 1.0f);
            View view2 = this.itemView;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.bi2)) != null) {
                C786410Ut5.T4(viewFindViewById, 1.0f);
            }
        }
        TextView textView = this.LLJ;
        if (c1362510lYn.LIZIZ) {
            f = 0.34f;
        }
        C786410Ut5.S4(f, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.0laO] */
    public C1363950lb7(View view, SharePanelViewModel sharePanelViewModel, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1362600lYw interfaceC1362600lYw, EnumC1364050lbH enumC1364050lbH, Function1<? super IMContact, Unit> function1) {
        Integer numLJFF;
        String string;
        Bundle bundle;
        int i4;
        Integer num;
        TuxTextView tuxTextView;
        FrameLayout.LayoutParams layoutParams;
        Bundle bundle2;
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = z4;
        this.LLILZ = i3;
        this.LLILZIL = interfaceC897330ZId;
        this.LLILZLL = interfaceC1362600lYw;
        this.LLIZ = enumC1364050lbH;
        this.LLIZLLLIL = function1;
        this.LLJJIII = -1;
        this.LLJJJJ = new C1361580lXI();
        view.getLayoutParams().width = i;
        TextView textView = (TextView) view.findViewById(R.id.p0w);
        this.LLJ = textView;
        textView.setImportantForAccessibility(2);
        TextView textView2 = (TextView) view.findViewById(R.id.p0x);
        this.LLJI = textView2;
        textView2.setImportantForAccessibility(2);
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.biz);
        this.LLJILJIL = smartAvatarImageView;
        smartAvatarImageView.setImportantForAccessibility(2);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.jgi);
        this.LLJILLL = c0hzq;
        c0hzq.setImportantForAccessibility(2);
        View viewFindViewById = view.findViewById(R.id.jgh);
        this.LLJJ = viewFindViewById;
        viewFindViewById.setImportantForAccessibility(2);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.wa5);
        this.LLJIJIL = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        C427920GqE c427920GqE = (C427920GqE) view.findViewById(R.id.a6g);
        this.LLJJIJIL = c427920GqE;
        C1428310nGv.LJII(this.LLJJ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        SharePackage sharePackage = this.LL.LL;
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
            numLJFF = C1369870lkf.LJFF(bundle2, "key_sheet_background_color");
            if (numLJFF != null) {
                int iIntValue = numLJFF.intValue();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(iIntValue);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
            }
        } else {
            numLJFF = null;
        }
        C1362230lYL c1362230lYL = this.LL.LLJI;
        if (c1362230lYL != null) {
            view.getLayoutParams().width = c1362230lYL.LJIIJJI;
            smartAvatarImageView.getLayoutParams().width = c1362230lYL.LJIIL;
            smartAvatarImageView.getLayoutParams().height = c1362230lYL.LJIIL;
            if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                } else {
                    layoutParams = null;
                }
                C786410Ut5.R6(tuxTextView, layoutParams);
                TuxTextView tuxTextView2 = (TuxTextView) textView;
                tuxTextView2.setTextColorRes(R.attr.a1h);
                Integer num2 = c1362230lYL.LJIIZILJ;
                if (num2 != null) {
                    tuxTextView2.setTuxFont(num2.intValue());
                }
            }
            Integer num3 = c1362230lYL.LJIILL;
            if (num3 != null) {
                c427920GqE.LIZ(Integer.valueOf(num3.intValue()));
            }
            Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))));
            c427920GqE.getClass();
            if (numValueOf != null) {
                c427920GqE.LL.setStrokeWidth(numValueOf.intValue());
            }
        } else {
            if (z) {
                view.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.g6(this.LLJ, layoutParams3);
            }
            if (z2) {
                int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.a2s);
                smartAvatarImageView.getLayoutParams().height = dimensionPixelOffset;
                smartAvatarImageView.getLayoutParams().width = dimensionPixelOffset;
            }
        }
        textView.setMaxLines(i2);
        Integer numLIZJ = C1308910kAL.LIZJ(i3, textView.getContext());
        if (numLIZJ != null) {
            textView.setTextColor(numLIZJ.intValue());
        }
        if (c1362230lYL != null && (num = c1362230lYL.LJIILLIIL) != null) {
            textView.setTextColor(num.intValue());
        }
        if (z3) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.g1p);
            if (tuxIconView != null) {
                if (z2) {
                    i4 = 22;
                } else {
                    i4 = 24;
                }
                float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i4));
                int i5 = (int) fLIZIZ;
                tuxIconView.getLayoutParams().width = i5;
                tuxIconView.getLayoutParams().height = i5;
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                c419910GdJ.LIZIZ = iLIZIZ;
                c419910GdJ.LIZJ = iLIZIZ;
                tuxIconView.setTuxIcon(c419910GdJ);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z2.LIZJ = Float.valueOf(fLIZIZ);
                c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                if (numLJFF == null) {
                    c384050F3z2.LJFF = Integer.valueOf(R.attr.a1b);
                } else {
                    c384050F3z2.LJ = numLJFF;
                }
                tuxIconView.setBackground(c384050F3z2.LIZ(tuxIconView.getContext()));
            } else {
                tuxIconView = null;
            }
            this.LLJILJILJ = tuxIconView;
        }
        C2211751BhN.LIZ(view, this.LLJJJJ);
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(this, 390);
        C786410Ut5.G9(smartAvatarImageView, new ACListenerS155S0100000_21(awS600S0100000_21, 263));
        C786410Ut5.T7(textView, new ACListenerS155S0100000_21(awS600S0100000_21, 263));
        C786410Ut5.b9(c0hzq, new ACListenerS155S0100000_21(awS600S0100000_21, 263));
        C786410Ut5.I7(new ACListenerS155S0100000_21(awS600S0100000_21, 263), view);
        SharePackage sharePackage2 = this.LL.LL;
        if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
            string = bundle.getString("panel_source");
        } else {
            string = null;
        }
        int iLIZLLL = C1369210ljb.LIZLLL(string);
        if (z) {
            C01GW c01gw = C1367480lgo.LIZ;
            if (C1367480lgo.LIZIZ(this.LL.LL)) {
                if (iLIZLLL == 1) {
                    this.LLJJJ = new C1364290lbf(view.getContext(), this.LL);
                }
                C1364290lbf c1364290lbf = this.LLJJJ;
                if (c1364290lbf != null) {
                    c1364290lbf.LIZJ((ViewGroup) view, this.LL.LLJI);
                }
            }
        }
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1582));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1584));
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, enumC2252401DDy, 2);
        this.LLJLL = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(1, 0, enumC2252401DDy, 2);
        this.LLJLLIL = c2252331DDrLIZIZ2;
        C1402260mau c1402260mau = new C1402260mau(c2252331DDrLIZIZ, this, 2);
        this.LLJLLL = new C414301jJ(c2252331DDrLIZIZ, c1402260mau, new C1363480laM(this, null));
        C1402260mau c1402260mau2 = new C1402260mau(c2252331DDrLIZIZ, this, 3);
        this.LLJZ = c1402260mau2;
        this.LLJZIJLIL = C09IC.LJIIIZ(c2252331DDrLIZIZ, c1402260mau, c2252331DDrLIZIZ2, c1402260mau2, new C1363980lbA(this, null));
        this.LLL = new C0NYY() { // from class: X.0laO
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String strLJIIIZ;
                IMContact iMContact = this.LL.LLJJI;
                if (iMContact == null) {
                    return Unit.LIZ;
                }
                ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
                C595660NXw c595660NXw = null;
                if (contactFeatureLIZ != null) {
                    strLJIIIZ = contactFeatureLIZ.LJIIIZ(iMContact);
                } else {
                    strLJIIIZ = null;
                }
                if (!map.containsKey(strLJIIIZ)) {
                    return Unit.LIZ;
                }
                if (strLJIIIZ != null) {
                    c595660NXw = map.get(strLJIIIZ);
                }
                if (this.LL.LLJJJJJIL == C896480ZEw.LIZJ(c595660NXw)) {
                    return Unit.LIZ;
                }
                this.LL.LLJJJJJIL = C896480ZEw.LIZJ(c595660NXw);
                this.LL.T5(iMContact, C896480ZEw.LIZIZ(c595660NXw));
                return Unit.LIZ;
            }
        };
        this.LLLFF = C2296808zG.LIZ(this.LL.LLJL.LL.plus(C2108208Ns.LIZ));
    }
}
