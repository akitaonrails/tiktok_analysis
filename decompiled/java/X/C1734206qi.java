package X;

import Y.ACListenerS106S0200000_2;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC20647615qs("pro_inbox_upgrade_guide")
public final class C1734206qi extends AbstractC20660115st<DialogFragment> {
    public static final /* synthetic */ int LLJ = 0;
    public final Context LL;
    public final FragmentManager LLILLJJLI;
    public final String LLILLL;
    public final EnumC1665006fY LLILZ;
    public final Pair<InputStream, String> LLILZIL;
    public final int LLILZLL;
    public final InterfaceC1668206g4 LLIZ;
    public final Keva LLIZLLLIL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        C0XQ7.LJ();
        if (!Intrinsics.LJFF(C0XQ7.LIZ.LJIIJ().getCurUserId(), this.LLILLL)) {
            return false;
        }
        int i = C1665106fZ.LIZ[this.LLILZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
        } else {
            if (C889930Yvf.LIZ.LIZJ() != C05RV.PRO_CREATOR_INBOX) {
                return false;
            }
            String str = this.LLILLL;
            Keva repo = Keva.getRepo("ProInboxUpgradeGuidePopupTask");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shown_pro_creator_upgrade_guide:");
            sbLIZ.append(str);
            if (repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        final String str;
        int i;
        View view;
        int i2;
        int i3;
        String string;
        final EnumC1665006fY enumC1665006fY = this.LLILZ;
        if (enumC1665006fY == EnumC1665006fY.GUIDE_PRO_CREATOR_UPDATE) {
            Context context = this.LL;
            String str2 = this.LLILLL;
            View viewLJIIL = LJIIL(context, this.LLILZIL);
            TextView textView = (TextView) viewLJIIL.findViewById(R.id.rw5);
            if (textView != null) {
                textView.setText(context.getString(2131845343));
            }
            TextView textView2 = (TextView) viewLJIIL.findViewById(R.id.rwc);
            if (textView2 != null) {
                textView2.setText(context.getString(2131845339));
            }
            TextView textView3 = (TextView) viewLJIIL.findViewById(R.id.rw_);
            if (textView3 != null) {
                textView3.setText(context.getString(2131845336));
            }
            TextView textView4 = (TextView) viewLJIIL.findViewById(R.id.rwd);
            if (textView4 != null) {
                textView4.setText(context.getString(2131845340));
            }
            TextView textView5 = (TextView) viewLJIIL.findViewById(R.id.rwa);
            if (textView5 != null) {
                textView5.setText(context.getString(2131845337));
            }
            TextView textView6 = (TextView) viewLJIIL.findViewById(R.id.rwe);
            if (textView6 != null) {
                textView6.setText(context.getString(2131845341));
            }
            TextView textView7 = (TextView) viewLJIIL.findViewById(R.id.rwb);
            if (textView7 != null) {
                IMChatListApi.LJJIII.getClass();
                if (C890330YwJ.LIZ().LJJIII()) {
                    string = context.getString(2131830272);
                } else {
                    string = context.getString(2131845338);
                }
                textView7.setText(string);
            }
            TextView textView8 = (TextView) viewLJIIL.findViewById(R.id.rw4);
            if (textView8 != null) {
                textView8.setText(context.getString(2131845342));
                C786410Ut5.I7(new ACListenerS106S0200000_2(this, viewLJIIL, 13), viewLJIIL);
            }
            TuxIconView tuxIconView = (TuxIconView) viewLJIIL.findViewById(R.id.rw9);
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_folder_open_fill);
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewLJIIL;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            final String str3 = "creator_to_creator_pro";
            tuxSheet.LL = new DialogInterface.OnCancelListener() { // from class: X.06qk
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    String str4 = TuxSheet._pnsPageId;
                    AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                    if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343960De6.LIZ)) {
                        C1734206qi c1734206qi = this.LL;
                        String str5 = str3;
                        c1734206qi.getClass();
                        C1734206qi.LJIILIIL(str5, "click_back");
                        return;
                    }
                    if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343980De8.LIZ)) {
                        C1734206qi c1734206qi2 = this.LL;
                        String str6 = str3;
                        c1734206qi2.getClass();
                        C1734206qi.LJIILIIL(str6, "click_close");
                        return;
                    }
                    if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C1734506ql.LIZ)) {
                        C1734206qi c1734206qi3 = this.LL;
                        String str7 = str3;
                        c1734206qi3.getClass();
                        C1734206qi.LJIILIIL(str7, "click_cancel");
                        return;
                    }
                    C1734206qi c1734206qi4 = this.LL;
                    String str8 = str3;
                    c1734206qi4.getClass();
                    C1734206qi.LJIILIIL(str8, "click_background");
                }
            };
            tuxSheet.show(this.LLILLJJLI, "ProInboxUpgradeGuidePopupTask");
            Keva keva = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shown_pro_creator_upgrade_guide:");
            sbLIZ.append(str2);
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("type", "creator_to_creator_pro"));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("pro_inbox_mode_guide_popup_show", mapLIZJ);
            return tuxSheet;
        }
        final Context context2 = this.LL;
        String str4 = this.LLILLL;
        Pair<InputStream, String> pair = this.LLILZIL;
        if (enumC1665006fY == EnumC1665006fY.AUTO_SWITCH) {
            str = "personal_to_business";
        } else if (C889930Yvf.LIZ.LIZJ() == C05RV.PRO_CREATOR_INBOX) {
            str = "creator_pro_to_business";
        } else {
            str = "creator_to_business";
        }
        final View viewLJIIL2 = LJIIL(context2, pair);
        EnumC1665006fY enumC1665006fY2 = EnumC1665006fY.GUIDE_CREATOR_SWITCH;
        if (enumC1665006fY == enumC1665006fY2) {
            i = 2131845296;
        } else {
            i = 2131845295;
        }
        TextView textView9 = (TextView) viewLJIIL2.findViewById(R.id.rw5);
        if (textView9 != null) {
            textView9.setText(context2.getString(i));
        }
        final C197039127h c197039127h = (C197039127h) viewLJIIL2.findViewById(R.id.rw4);
        if (c197039127h != null) {
            if (enumC1665006fY == enumC1665006fY2) {
                i3 = 2131845293;
            } else {
                i3 = 2131845292;
            }
            c197039127h.setText(context2.getString(i3));
            view = viewLJIIL2;
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.06qj
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    String str5;
                    if (view2 != null) {
                        EnumC1665006fY enumC1665006fY3 = enumC1665006fY;
                        EnumC1665006fY enumC1665006fY4 = EnumC1665006fY.GUIDE_CREATOR_SWITCH;
                        if (enumC1665006fY3 != enumC1665006fY4 && C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX) {
                            String str6 = TuxSheet._pnsPageId;
                            C1391190mJ3.LJ(viewLJIIL2, C343970De7.LIZ);
                        } else {
                            c197039127h.setLoading(true);
                            c197039127h.setClickable(false);
                            C889930Yvf c889930Yvf = C889930Yvf.LIZ;
                            C05RV c05rv = C05RV.BUSINESS_INBOX;
                            AwS210S0300000_1 awS210S0300000_1 = new AwS210S0300000_1(c197039127h, viewLJIIL2, context2, 72);
                            c889930Yvf.getClass();
                            C889930Yvf.LIZ(c05rv, "click_upgrade_guide_popup", awS210S0300000_1);
                        }
                        if (enumC1665006fY == enumC1665006fY4) {
                            str5 = "click_confirm";
                        } else {
                            str5 = "click_ok";
                        }
                        C1734206qi c1734206qi = this;
                        String str7 = str;
                        c1734206qi.getClass();
                        C1734206qi.LJIILIIL(str7, str5);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c197039127h);
        } else {
            view = viewLJIIL2;
        }
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.rw6);
        if (c197039127h2 != null) {
            if (enumC1665006fY == enumC1665006fY2) {
                C786410Ut5.U8(c197039127h2, new ACListenerS137S0100000_2(view, 73));
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLLLJ(c197039127h2, i2);
        }
        C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
        c1390920mIc2.LIZ.LLJJIII = view;
        c1390920mIc2.LJIIIIZZ(1);
        TuxSheet tuxSheet2 = c1390920mIc2.LIZ;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.06qk
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str42 = TuxSheet._pnsPageId;
                AbstractC343940De4 abstractC343940De4LJIIJ = C1391190mJ3.LJIIJ(dialogInterface);
                if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343960De6.LIZ)) {
                    C1734206qi c1734206qi = this.LL;
                    String str5 = str;
                    c1734206qi.getClass();
                    C1734206qi.LJIILIIL(str5, "click_back");
                    return;
                }
                if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C343980De8.LIZ)) {
                    C1734206qi c1734206qi2 = this.LL;
                    String str6 = str;
                    c1734206qi2.getClass();
                    C1734206qi.LJIILIIL(str6, "click_close");
                    return;
                }
                if (Intrinsics.LJFF(abstractC343940De4LJIIJ, C1734506ql.LIZ)) {
                    C1734206qi c1734206qi3 = this.LL;
                    String str7 = str;
                    c1734206qi3.getClass();
                    C1734206qi.LJIILIIL(str7, "click_cancel");
                    return;
                }
                C1734206qi c1734206qi4 = this.LL;
                String str8 = str;
                c1734206qi4.getClass();
                C1734206qi.LJIILIIL(str8, "click_background");
            }
        };
        tuxSheet2.show(this.LLILLJJLI, "ProInboxUpgradeGuidePopupTask");
        this.LLIZ.LIZ(str4, enumC1665006fY);
        Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("type", str));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("pro_inbox_mode_guide_popup_show", mapLIZJ2);
        return tuxSheet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View LJIIL(android.content.Context r6, kotlin.Pair r7) {
        /*
            android.view.LayoutInflater r3 = X.C786410Ut5.ne(r6)
            r2 = 2131559591(0x7f0d04a7, float:1.874453E38)
            r1 = 0
            r0 = 1
            android.view.View r4 = X.C786410Ut5.Td(r3, r2, r1, r0)
            r5 = 2131398706(0x7f0a9032, float:1.8418217E38)
            r3 = 2131398701(0x7f0a902d, float:1.8418207E38)
            if (r7 == 0) goto L47
            android.view.View r2 = r4.findViewById(r3)
            X.0jpS r2 = (X.C1295960jpS) r2
            if (r2 == 0) goto L3a
            java.lang.Object r1 = r7.getFirst()
            java.io.InputStream r1 = (java.io.InputStream) r1
            java.lang.Object r0 = r7.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            r2.setAnimation(r1, r0)
            boolean r0 = X.C426750GoL.LIZLLL(r6)
            if (r0 == 0) goto L3a
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r2)
            r0 = 1127481344(0x43340000, float:180.0)
            r2.setRotationY(r0)
        L3a:
            android.view.View r0 = r4.findViewById(r5)
            if (r0 == 0) goto L47
            X.C339190DRl.LIZIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L59
        L47:
            android.view.View r0 = r4.findViewById(r3)
            if (r0 == 0) goto L50
            X.C339190DRl.LIZIZ(r0)
        L50:
            android.view.View r0 = r4.findViewById(r5)
            if (r0 == 0) goto L59
            X.C339190DRl.LIZLLL(r0)
        L59:
            r0 = 2131398704(0x7f0a9030, float:1.8418213E38)
            android.view.View r2 = r4.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r2 = (com.bytedance.tux.icon.TuxIconView) r2
            if (r2 == 0) goto L6e
            Y.ACListenerS137S0100000_2 r1 = new Y.ACListenerS137S0100000_2
            r0 = 72
            r1.<init>(r4, r0)
            X.C786410Ut5.a9(r2, r1)
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1734206qi.LJIIL(android.content.Context, kotlin.Pair):android.view.View");
    }

    public static void LJIILIIL(String str, String str2) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("type", str), new Pair("action_type", str2));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("pro_inbox_mode_guide_popup_action", mapLJIIIIZZ);
    }

    public C1734206qi(Context context, FragmentManager fragmentManager, String str, EnumC1665006fY enumC1665006fY, Pair pair, InboxFragmentV2 inboxFragmentV2) {
        super(inboxFragmentV2);
        this.LL = context;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = str;
        this.LLILZ = enumC1665006fY;
        this.LLILZIL = pair;
        this.LLILZLL = 2;
        this.LLIZ = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIJJ();
        this.LLIZLLLIL = Keva.getRepo("ProInboxUpgradeGuidePopupTask");
    }
}
