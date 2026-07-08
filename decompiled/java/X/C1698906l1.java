package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06l1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1698906l1 extends AbstractC1643906c9<C06AH, C1699106l3> {
    public final C19EG LLILZLL;
    public final SessionInfo LLIZ;

    @Override // X.C06OD
    public final void LIZLLL() {
        C1699106l3 c1699106l3 = (C1699106l3) this.LLILZIL;
        if (c1699106l3 != null) {
            C786410Ut5.LJLLLLLL(8, c1699106l3);
            c1699106l3.LLZLI();
        }
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        int iIntValue;
        int iIntValue2;
        long jLongValue;
        Long lLJIILIIL;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String displayName;
        Map<String, String> map = ((C06AH) c06oo).LIZJ.msgContent.extras;
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        String str = map.get("creator_id");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(str, null, "im_ai_group_shot");
        String conversationId = this.LLIZ.getConversationId();
        String str3 = map.get("task_id");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = map.get("template_id");
        if (str4 == null) {
            str4 = "";
        }
        if (iMUserLIZLLL != null && (displayName = iMUserLIZLLL.getDisplayName()) != null) {
            str2 = displayName;
        }
        String str5 = map.get("current_count");
        if (str5 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str5)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 0;
        }
        String str6 = map.get("total_count");
        if (str6 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str6)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        } else {
            iIntValue2 = 0;
        }
        int chatType = this.LLIZ.getChatType();
        String str7 = map.get("last_msg_id");
        if (str7 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str7)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C1699306l5 c1699306l5 = new C1699306l5(iIntValue, iIntValue2, chatType, jLongValue, conversationId, str3, str4, str2);
        C1699106l3 c1699106l3 = (C1699106l3) this.LLILZIL;
        if (c1699106l3 != null) {
            c1699106l3.setBackground(null);
            C786410Ut5.LJLLLLLL(0, c1699106l3);
            C912070ZqH.LIZIZ.LJIIL().LJIIL("chat", EnumC1786290waJ.ONGOING_TOP_BANNER, EnumC1711006my.JOIN, C2286608xc.LJ(this.LLIZ.getChatType()));
            C19EG c19eg = this.LLILZLL;
            if (c19eg != null) {
                c1699106l3.LJIIIIZZ(c19eg, c1699306l5, new AwS546S0100000_2(this, 977));
            }
        }
        return this.LLILZIL;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jLongValue;
        boolean z;
        Long lLJIILIIL;
        String strLJFF = C0YNP.LJFF(this.LLIZ.getConversationId(), "aigs_notice_last_dismiss_time");
        if (strLJFF != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue + 259200000 < System.currentTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C1698906l1(C19EG c19eg, SessionInfo sessionInfo, ViewGroup viewGroup) {
        super(EnumC1596306Mv.ONGOING_GROUP_SHOT, viewGroup, R.layout.cen);
        this.LLILZLL = c19eg;
        this.LLIZ = sessionInfo;
    }
}
