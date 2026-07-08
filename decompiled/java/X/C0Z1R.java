package X;

import Y.ACListenerS137S0100000_2;
import Y.ACListenerS149S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.common.experiment.IMRequestFrequencyLimitConfig;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.core.chatlist.api.service.IIMChatListApi;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageAdapterAnalytics;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z1R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z1R extends LinearLayout implements C06OA {
    public final /* synthetic */ C06ME LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public C1674106h1 LLIZLLLIL;
    public C909290Zln LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final FrameLayout getBgContentView() {
        return (FrameLayout) this.LLILLJJLI.getValue();
    }

    private final TuxTextView getBtnAgree() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final TuxTextView getBtnDelete() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final TuxTextView getBtnReportBlock() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    private final TuxTextView getSubTitleTv() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    public final void LIZJ() {
        String displayName;
        String string;
        IMUser fromUser;
        if (this.LLJI || getVisibility() == 8 || getBgContentView() == null) {
            return;
        }
        this.LLJI = true;
        C909290Zln c909290Zln = this.LLJ;
        if (c909290Zln == null || (fromUser = c909290Zln.getFromUser()) == null || (displayName = fromUser.getDisplayName()) == null) {
            displayName = "";
        }
        TuxTextView titleTv = getTitleTv();
        if (titleTv != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZ(getContext().getResources(), 2131837245, displayName);
            titleTv.setText(c1360520lVa.LIZ);
        }
        TuxTextView btnReportBlock = getBtnReportBlock();
        if (btnReportBlock != null) {
            if (((Number) C271760Akw.LIZ.getValue()).intValue() == 1) {
                btnReportBlock.setText(btnReportBlock.getContext().getString(2131835247));
                C786410Ut5.h9(btnReportBlock, new ACListenerS137S0100000_2(this, 60));
            } else {
                btnReportBlock.setText(btnReportBlock.getContext().getString(2131837252));
                C786410Ut5.h9(btnReportBlock, new ACListenerS149S0100000_14(this, 58));
            }
        }
        TuxTextView btnDelete = getBtnDelete();
        if (btnDelete != null) {
            C786410Ut5.h9(btnDelete, new ACListenerS137S0100000_2(this, 61));
        }
        TuxTextView btnAgree = getBtnAgree();
        if (btnAgree != null) {
            C786410Ut5.h9(btnAgree, new ACListenerS149S0100000_14(this, 59));
        }
        TuxTextView subTitleTv = getSubTitleTv();
        if (subTitleTv != null) {
            C909290Zln c909290Zln2 = this.LLJ;
            if (Intrinsics.LJFF(c909290Zln2 != null ? Boolean.valueOf(c909290Zln2.isTCM()) : null, Boolean.TRUE)) {
                String string2 = getContext().getString(2131832162);
                String string3 = getContext().getString(2131832161, string2);
                C444910HcX c444910HcX = new C444910HcX(string3);
                c444910HcX.LIZ(41);
                int iLJJJ = a0.LJJJ(string3, string2, 0, false, 6);
                C786410Ut5.s2(c444910HcX, new C913790Zt3(C960203pA.LIZ(R.attr.a1h, getContext()), this, 1), iLJJJ, string2.length() + iLJJJ, 34);
                C786410Ut5.s2(c444910HcX, new C444920HcY(42, true), iLJJJ, string2.length() + iLJJJ, 34);
                subTitleTv.setMovementMethod(LinkMovementMethod.getInstance());
                subTitleTv.setHighlightColor(0);
                subTitleTv.setText(c444910HcX);
                return;
            }
            C909290Zln c909290Zln3 = this.LLJ;
            if (c909290Zln3 != null && c909290Zln3.isRisky()) {
                subTitleTv.setText(getContext().getString(2131837244));
                return;
            }
            NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
            if (!getDifferentiatePrimaryAndSecondary() || noticeFeatureLIZ == null) {
                if (!this.LLJIJIL) {
                    string = getContext().getString(2131837246);
                } else if (((Number) C271760Akw.LIZ.getValue()).intValue() != 1) {
                    string = getContext().getString(2131831685);
                } else if (C0Z1S.LIZ()) {
                    int i = ((IMRequestFrequencyLimitConfig) C0Z1S.LIZIZ.getValue()).count;
                    string = getContext().getResources().getQuantityString(2131755251, i, Integer.valueOf(i));
                } else {
                    string = getContext().getString(2131831619);
                }
            } else if (C0Z1S.LIZ()) {
                int i2 = ((IMRequestFrequencyLimitConfig) C0Z1S.LIZIZ.getValue()).count;
                string = getContext().getResources().getQuantityString(2131755251, i2, Integer.valueOf(i2));
            } else {
                string = C1710306mr.LIZIZ(2131830239, C1383370m6R.LJIIJ(noticeFeatureLIZ.LJI()), C1383370m6R.LJIIJ(noticeFeatureLIZ.LJIIJJI()));
            }
            subTitleTv.setText(string);
        }
    }

    public final void LJ() {
        C909290Zln c909290Zln = this.LLJ;
        if (c909290Zln != null) {
            String str = c909290Zln.isRisky() ? "filtered_message_request" : "non_filtered_message_request";
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ != null) {
                IReportUtils.LIZ.getClass();
                IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
                if (iReportUtilsLIZ != null) {
                    iReportUtilsLIZ.LIZ(new C1689006jQ(c909290Zln, "button", str, null, 24), activityLIZ, "4", null, true);
                }
            }
            IIMMessageAdapterAnalytics iIMMessageAdapterAnalytics = (IIMMessageAdapterAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageAdapterAnalytics.class);
            if (iIMMessageAdapterAnalytics != null) {
                iIMMessageAdapterAnalytics.LIZ(c909290Zln.getFromUser(), c909290Zln, str, C0I0B.LJFF.LIZIZ());
            }
            LIZLLL(c909290Zln, "report", null);
        }
    }

    public final boolean getDifferentiatePrimaryAndSecondary() {
        NoticeFeature noticeFeatureLIZ;
        List<FilterTabType> listLJIIIIZZ;
        C06QI c06qi = NoticeFeature.LIZ;
        NoticeFeature noticeFeatureLIZ2 = c06qi.LIZ();
        return (noticeFeatureLIZ2 == null || !noticeFeatureLIZ2.LJ() || (noticeFeatureLIZ = c06qi.LIZ()) == null || (listLJIIIIZZ = noticeFeatureLIZ.LJIIIIZZ()) == null || !listLJIIIIZZ.contains(FilterTabType.SECONDARY)) ? false : true;
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss singleSessionInfo = ");
        C909290Zln c909290Zln = this.LLJ;
        sbLIZ.append(c909290Zln != null ? c909290Zln.hashCode() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJLLLLLL(8, this);
        C909290Zln c909290Zln2 = this.LLJ;
        if (c909290Zln2 != null) {
            c909290Zln2.setChatType(0);
        }
        LLZLI();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisibility visibility = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ();
    }

    public C0Z1R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1347));
        this.LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1353));
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1352));
        this.LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1351));
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1350));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1349));
        LIZJ();
    }

    public static void LIZLLL(C909290Zln c909290Zln, String str, EnumC868530Y5j enumC868530Y5j) {
        String str2;
        String strLJIL;
        InterfaceC890150Yw1 interfaceC890150Yw1LIZIZ;
        String str3;
        String str4;
        String str5;
        String str6;
        MatchedFriendStruct matchedFriend;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        Map<String, String> mapLIZIZ;
        Map<String, String> mapLIZIZ2;
        if (c909290Zln.isTCM()) {
            str2 = "tcm";
        } else {
            str2 = "stranger";
        }
        IMUser fromUser = c909290Zln.getFromUser();
        String str7 = null;
        if (fromUser != null) {
            IMContactApi.LIZ.getClass();
            strLJIL = C069P.LIZ().LIZ().LJIL(fromUser);
        } else {
            strLJIL = null;
        }
        IIMChatListApi.LJJIIJ.getClass();
        IIMChatListApi value = C0NN2.LIZIZ.getValue();
        if (value != null && (interfaceC890150Yw1LIZIZ = value.LIZIZ()) != null) {
            String enterFromForMob = c909290Zln.getEnterFromForMob();
            boolean zIsRisky = c909290Zln.isRisky();
            Map<String, String> extraMobParams = c909290Zln.getExtraMobParams();
            if (extraMobParams == null || (str3 = extraMobParams.get("chat_section")) == null) {
                str3 = "";
            }
            IChatRoomEventTrackingStore.LIZ.getClass();
            IChatRoomEventTrackingStore iChatRoomEventTrackingStoreLIZ = C1761106v3.LIZ();
            if (iChatRoomEventTrackingStoreLIZ != null && (mapLIZIZ2 = iChatRoomEventTrackingStoreLIZ.LIZIZ(c909290Zln.getUuid())) != null) {
                str4 = mapLIZIZ2.get("tab_name");
            } else {
                str4 = null;
            }
            IChatRoomEventTrackingStore iChatRoomEventTrackingStoreLIZ2 = C1761106v3.LIZ();
            if (iChatRoomEventTrackingStoreLIZ2 != null && (mapLIZIZ = iChatRoomEventTrackingStoreLIZ2.LIZIZ(c909290Zln.getUuid())) != null) {
                str5 = mapLIZIZ.get("chat_label");
            } else {
                str5 = null;
            }
            String conversationId = c909290Zln.getConversationId();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c909290Zln.getConversationId());
            if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
                str6 = ext.get("a:conv_entrance_log");
            } else {
                str6 = null;
            }
            IMUser fromUser2 = c909290Zln.getFromUser();
            if (fromUser2 != null && (matchedFriend = fromUser2.getMatchedFriend()) != null) {
                str7 = matchedFriend.recType;
            }
            interfaceC890150Yw1LIZIZ.LIZLLL(enterFromForMob, zIsRisky, str, str2, str3, enumC868530Y5j, "single", str4, str5, conversationId, str6, str7, strLJIL);
        }
    }

    public final void LIZ(C909290Zln c909290Zln, EnumC868530Y5j enumC868530Y5j, Function0<Unit> function0) {
        long jLongValue;
        String uid;
        Long lLJIILIIL;
        if (c909290Zln == null) {
            return;
        }
        IMUser fromUser = c909290Zln.getFromUser();
        if (fromUser != null && (uid = fromUser.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C876470YZx.LIZ().LJIIIIZZ(new Pair(Long.valueOf(jLongValue), c909290Zln.getConversationId()), enumC868530Y5j, new C1769006wK(this, function0, 1));
        LIZLLL(c909290Zln, "accept", enumC868530Y5j);
    }
}
