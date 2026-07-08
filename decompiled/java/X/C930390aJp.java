package X;

import Y.ACListenerS118S0200000_15;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.model.InviteChatGroupHelper;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930390aJp extends AbstractC960470b6L<C929190aHt> {
    public InterfaceC931760aM2 LL;
    public final InviteChatGroupHelper LLILLJJLI;
    public final LayoutInflater LLILLL;
    public final C1099610eil LLILZ;
    public final C1118590fDN LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C931950aML LLIZLLLIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LL = null;
    }

    public final void L5(long j) {
        String strLJIJI;
        C931950aML c931950aML = this.LLIZLLLIL;
        if (j == 1) {
            c931950aML.setEnabled(false);
            strLJIJI = C497740JfY.LJIJI(2131840633);
        } else {
            c931950aML.setEnabled(true);
            strLJIJI = C497740JfY.LJIJI(2131842208);
        }
        c931950aML.setText(strLJIJI);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        String str;
        C929190aHt c929190aHt = (C929190aHt) obj;
        this.itemView.setTag(R.id.yo6, String.valueOf(c929190aHt.LIZ.id));
        ListByTypeResponse.ChatGroupInfo chatGroupInfo = c929190aHt.LIZ;
        if (MultiGuestFollowBackGuideSetting.INSTANCE.enableAnchorListPanelFollow()) {
            C12ES.LJIILL(0, this.LLILZIL);
            this.LLILZIL.LJ();
            this.LLILZIL.LIZJ(ImageModel.genBy(chatGroupInfo.icon));
        } else {
            C12ES.LJIILL(0, this.LLILZ);
            C1099610eil c1099610eil = this.LLILZ;
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(chatGroupInfo.icon));
            int width = c1099610eil.getWidth();
            int height = c1099610eil.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(c1099610eil);
        }
        this.LLILZLL.setText(chatGroupInfo.title);
        int i2 = (int) c929190aHt.LIZ.members;
        this.LLIZ.setText(C497740JfY.LJIIL(2131755911, i2, Integer.valueOf(i2)));
        L5(chatGroupInfo.invited);
        this.LLIZLLLIL.setTag(c929190aHt);
        InviteChatGroupHelper inviteChatGroupHelper = (InviteChatGroupHelper) C948450amx.LIZIZ.LJIIJJI("INVITE_CHAT_GROUP_HELPER");
        if (inviteChatGroupHelper != null) {
            if (inviteChatGroupHelper.LJII) {
                inviteChatGroupHelper.LJII = false;
                int i3 = inviteChatGroupHelper.LJIIIIZZ;
                HashMap map = new HashMap();
                C01Z4.LIZ(null, map);
                map.put("group_num", String.valueOf(i3));
                MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
                if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_guest_connection", str);
                C0KX4.LIZ("livesdk_multi_anchor_guest_group_list_show", map, null, true);
                C924950aB3.LIZJ("outroom_group", i3, null, null, 60);
            }
            long j = c929190aHt.LIZ.id;
            if (!inviteChatGroupHelper.LJ.contains(Long.valueOf(j))) {
                inviteChatGroupHelper.LJ.add(Long.valueOf(j));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C930390aJp(InterfaceC931760aM2 interfaceC931760aM2, InviteChatGroupHelper inviteChatGroupHelper, LayoutInflater layoutInflater) {
        View viewSd = C786410Ut5.Sd(R.layout.hel, layoutInflater, null);
        C786410Ut5.W5(viewSd, new ViewGroup.LayoutParams(-1, -2));
        C439101nJ.LJI(viewSd.findViewById(R.id.lkk));
        C439101nJ.LJI(viewSd.findViewById(R.id.lki));
        super(viewSd);
        this.LL = interfaceC931760aM2;
        this.LLILLJJLI = inviteChatGroupHelper;
        this.LLILLL = layoutInflater;
        this.LLILZ = (C1099610eil) this.itemView.findViewById(R.id.lms);
        this.LLILZIL = (C1118590fDN) this.itemView.findViewById(R.id.lmw);
        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.tv_user_name);
        ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) C497740JfY.LIZIZ(4.0f);
            C786410Ut5.y6(c16f5, layoutParams);
        }
        C12ES.LJIILL(0, c16f5);
        this.LLILZLL = c16f5;
        C16F5 c16f52 = (C16F5) this.itemView.findViewById(R.id.tv_user_info_1);
        C12ES.LJIILL(0, c16f52);
        this.LLIZ = c16f52;
        C931950aML c931950aML = (C931950aML) this.itemView.findViewById(R.id.cra);
        C12ES.LJIILL(0, c931950aML);
        C1834150xpV.LJIIJ(c931950aML, true);
        c931950aML.setButtonStyle(1);
        c931950aML.setViewer(true);
        C786410Ut5.q8(c931950aML, new ACListenerS118S0200000_15(c931950aML, this, 79));
        this.LLIZLLLIL = c931950aML;
    }
}
