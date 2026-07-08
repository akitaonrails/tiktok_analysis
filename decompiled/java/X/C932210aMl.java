package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS81S0300000_15;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiPanelManageGuestOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932210aMl extends AbstractC960470b6L<C928770aHD> {
    public final InterfaceC302401Fe LL;
    public final InterfaceC932240aMo LLILLJJLI;
    public final DataChannel LLILLL;
    public final InterfaceC931760aM2 LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final LinearLayout LLIZ;
    public final LiveIconView LLIZLLLIL;
    public final LiveIconView LLJ;
    public final LiveIconView LLJI;
    public final LinearLayout LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final List<LinearLayout> LLJJ;
    public final LinkedList<C932220aMm> LLJJI;
    public final List<String> LLJJIII;
    public final int LLJJIJI;
    public boolean LLJJIJIIJIL;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        LinearLayout.LayoutParams layoutParams;
        User user;
        FollowInfo followInfo;
        Boolean boolValueOf;
        FollowInfo followInfo2;
        int i2;
        int i3;
        int i4;
        C928770aHD c928770aHD = (C928770aHD) obj;
        if (i == 0) {
            C500260Jjc.LJLJL(0, this.itemView);
        } else {
            C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), this.itemView);
        }
        int size = c928770aHD.LIZ.size();
        this.LLILZIL.setText(C497740JfY.LJIIL(2131755908, size, Integer.valueOf(size)));
        if (this.LLJILJIL) {
            C786410Ut5.LLIL(this.LLILZLL, 8);
            C786410Ut5.LJZL(0, this.LLIZ);
            LiveIconView liveIconView = this.LLJI;
            if (this.LLJILLL) {
                if (!this.LLJJIJIIJIL) {
                    C932160aMg.LIZJ("show", "microphone");
                }
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i2);
            LiveIconView liveIconView2 = this.LLJ;
            if (this.LLJILJILJ) {
                if (!this.LLJJIJIIJIL) {
                    C932160aMg.LIZJ("show", "camera");
                }
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconView2, i3);
            if (size > 0) {
                if (this.LLJILJIL) {
                    i4 = R.attr.ezt;
                } else {
                    i4 = R.attr.ewy;
                }
            } else {
                i4 = R.attr.ewz;
            }
            int iLIZJ = C20736316Cj.LIZJ(i4, this.LLIZLLLIL);
            this.LLIZLLLIL.setIconTint(iLIZJ);
            if (this.LLJILJILJ) {
                this.LLJ.setIconTint(iLIZJ);
            }
            if (this.LLJILLL) {
                this.LLJI.setIconTint(iLIZJ);
            }
            C500260Jjc.LJLIIIL(500L, this.LLIZLLLIL, new AwS594S0100000_15(this, 61));
            C500260Jjc.LJLIIIL(500L, this.LLJ, new AwS594S0100000_15(this, 62));
            C500260Jjc.LJLIIIL(500L, this.LLJI, new AwS594S0100000_15(this, 63));
            this.LLJJIJIIJIL = true;
        } else {
            C786410Ut5.LJZL(8, this.LLIZ);
            C786410Ut5.LLIL(this.LLILZLL, 0);
            C500260Jjc.LJLIIIL(500L, this.LLILZLL, new AwS594S0100000_15(this, 64));
        }
        for (LinearLayout linearLayout : (ArrayList) this.LLJJ) {
            LinkedList<C932220aMm> linkedList = this.LLJJI;
            while (linearLayout.getChildCount() > 0) {
                C786410Ut5.LJJLIL(0, linearLayout);
                Unit unit = Unit.LIZ;
                if (unit instanceof C932220aMm) {
                    linkedList.add((C932220aMm) unit);
                }
            }
            C786410Ut5.LJZL(0, linearLayout);
        }
        int iCeil = (int) Math.ceil(((double) c928770aHD.LIZ.size()) / ((double) 4));
        if (iCeil > ((ArrayList) this.LLJJ).size()) {
            for (int size2 = ((ArrayList) this.LLJJ).size(); size2 < iCeil; size2++) {
                LinearLayout linearLayout2 = new LinearLayout(this.itemView.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.d6(linearLayout2, layoutParams2);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
                ((ArrayList) this.LLJJ).add(linearLayout2);
                this.LLJIJIL.addView(linearLayout2);
            }
        }
        if (iCeil < ((ArrayList) this.LLJJ).size()) {
            int size3 = ((ArrayList) this.LLJJ).size();
            while (iCeil < size3) {
                C786410Ut5.LJZL(8, (LinearLayout) ListProtector.get(this.LLJJ, iCeil));
                iCeil++;
            }
        }
        int i5 = 0;
        for (LinkPlayerInfo linkPlayerInfo : c928770aHD.LIZ) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                int i7 = i5 / 4;
                int i8 = i5 % 4;
                C932220aMm c932220aMm = (C932220aMm) C19719612Di.LJJIIZI(this.LLJJI);
                if (c932220aMm == null) {
                    c932220aMm = new C932220aMm(this.itemView.getContext());
                }
                c932220aMm.setFollowClickListener(this.LLILZ);
                DataChannel dataChannel = this.LLILLL;
                c932220aMm.LLILLL = dataChannel;
                C1118590fDN c1118590fDN = c932220aMm.LLILLJJLI;
                Long userId = c932220aMm.getUserId();
                long id = linkPlayerInfo2.mUser.getId();
                if (userId == null || userId.longValue() != id) {
                    c1118590fDN.LIZJ(linkPlayerInfo2.mUser.getAvatarThumb());
                    c932220aMm.LL.setText(C0KVU.LIZ(linkPlayerInfo2.mUser));
                }
                if (MultiGuestFollowBackGuideSetting.INSTANCE.enableAnchorListPanelFollow()) {
                    User user2 = linkPlayerInfo2.mUser;
                    if ((user2 != null && (followInfo2 = user2.getFollowInfo()) != null && ((int) followInfo2.getFollowStatus()) == 1) || ((user = linkPlayerInfo2.mUser) != null && (followInfo = user.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 2)) {
                        C1118590fDN c1118590fDN2 = c932220aMm.LLILLJJLI;
                        AnimatorSet animatorSet = c1118590fDN2.LLJI;
                        if (animatorSet != null) {
                            boolValueOf = Boolean.valueOf(animatorSet.isRunning());
                        } else {
                            boolValueOf = null;
                        }
                        if (!C500260Jjc.LJJJI(boolValueOf)) {
                            c1118590fDN2.LJ();
                        }
                    } else {
                        c932220aMm.LLILLJJLI.LJFF();
                        c932220aMm.LLILLJJLI.setFollowOnClickListener(new ACListenerS118S0200000_15(c932220aMm, linkPlayerInfo2, 4));
                    }
                }
                c1118590fDN.setAvatarOnClickListener(new ACListenerS81S0300000_15(c932220aMm, linkPlayerInfo2, dataChannel, 1));
                c932220aMm.LLILZ = linkPlayerInfo2;
                ViewGroup.LayoutParams layoutParams3 = c932220aMm.getLayoutParams();
                if (!(layoutParams3 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams3) == null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                layoutParams.width = this.LLJJIJI;
                if (i8 < 3) {
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                } else {
                    layoutParams.setMarginEnd(0);
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c932220aMm);
                c932220aMm.setLayoutParams(layoutParams);
                ((ViewGroup) ListProtector.get(this.LLJJ, i7)).addView(c932220aMm);
                if (((ArrayList) this.LLJJIII).contains(linkPlayerInfo2.mInteractIdStr)) {
                    C20441214yg.LIZIZ("MultiLiveOnlineGuestViewHolder", "logGuestShow was reported.");
                } else {
                    C924970aB5.LIZ(c928770aHD.LIZ.size(), i6, "show", String.valueOf(linkPlayerInfo2.mUser.getId()), C930540aK4.LJIILJJIL(linkPlayerInfo2), linkPlayerInfo2.trackMap);
                    ((ArrayList) this.LLJJIII).add(linkPlayerInfo2.mInteractIdStr);
                }
                i5 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public C932210aMl(View view, InterfaceC302401Fe interfaceC302401Fe, InterfaceC932240aMo interfaceC932240aMo, DataChannel dataChannel, InterfaceC931760aM2 interfaceC931760aM2) {
        boolean z;
        super(view);
        this.LL = interfaceC302401Fe;
        this.LLILLJJLI = interfaceC932240aMo;
        this.LLILLL = dataChannel;
        this.LLILZ = interfaceC931760aM2;
        this.LLILZIL = (TextView) view.findViewById(R.id.zgr);
        this.LLILZLL = (TextView) view.findViewById(R.id.ziq);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.m8w);
        this.LLIZLLLIL = (LiveIconView) view.findViewById(R.id.crh);
        this.LLJ = (LiveIconView) view.findViewById(R.id.cow);
        this.LLJI = (LiveIconView) view.findViewById(R.id.cs8);
        this.LLJIJIL = (LinearLayout) view;
        int value = MultiPanelManageGuestOptSetting.INSTANCE.getValue();
        boolean zLIZLLL = C932270aMr.LIZLLL();
        this.LLJILJIL = zLIZLLL;
        boolean z2 = false;
        if (value >= 2 && zLIZLLL) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJILJ = z;
        if (value >= 1 && zLIZLLL) {
            z2 = true;
        }
        this.LLJILLL = z2;
        ArrayList arrayList = new ArrayList();
        this.LLJJ = arrayList;
        this.LLJJI = new LinkedList<>();
        View viewFindViewById = view.findViewById(R.id.bjz);
        View viewFindViewById2 = view.findViewById(R.id.bk0);
        arrayList.add(viewFindViewById);
        arrayList.add(viewFindViewById2);
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = ((C497740JfY.LJIIZILJ() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 3)) / 4;
    }
}
