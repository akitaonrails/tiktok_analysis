package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.MultiGuestGiftSwitchTargetDialog;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC937350aV3 extends AbstractC937370aV5 implements View.OnClickListener {
    public final C11NZ<List<User>> LLIZ;
    public final C11NZ<Integer> LLIZLLLIL;
    public final C11NZ<Long> LLJ;
    public final C11NZ<Integer> LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public final DataChannel LLJILJILJ;
    public final Runnable LLJILLL;
    public View LLJJ;
    public User LLJJI;
    public C16F5 LLJJIII;
    public C19R6 LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public TextView LLJJJ;
    public LiveIconView LLJJJIL;
    public C16F5 LLJJJJ;
    public C20743416Fc LLJJJJJIL;
    public RecyclerView LLJJJJLIIL;
    public final C01GW LLJJL;
    public C937360aV4 LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final List<User> LLJLIL;
    public Long LLJLILLLLZIIL;
    public Integer LLJLL;
    public final C11NJ LLJLLIL;
    public User LLJLLL;
    public final C01GW LLJZ;
    public MultiGuestGiftSwitchTargetDialog LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public List<LinkListUser> LLLFF;
    public boolean LLLFFI;
    public final C921840a62 LLLFZ;

    @Override // X.AbstractC1100450ek7
    public final void LJIL() {
    }

    @Override // X.AbstractC1100450ek7
    public final void LJIILJJIL() {
        this.LLJLLIL.LJ();
        this.LLJILJILJ.zQ2(this);
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog = this.LLJZIJLIL;
        if (multiGuestGiftSwitchTargetDialog == null || !multiGuestGiftSwitchTargetDialog.isShowing()) {
            return;
        }
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog2 = this.LLJZIJLIL;
        if (multiGuestGiftSwitchTargetDialog2 != null) {
            multiGuestGiftSwitchTargetDialog2.dismiss();
        }
        this.LLJZIJLIL = null;
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        C915980Zwa.LJIIIIZZ().Fe(this.LLLFZ);
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZI() {
        boolean z;
        String strValueOf;
        Object next;
        this.LLJJI = UserService.getInstance().user().LJIJJLI();
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, this);
        }
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, this);
        }
        User user = (User) this.LLJZ.getValue();
        User user2 = (User) C13LP.LJJJLL(this.LLJLIL);
        String str = this.LLJIJIL;
        boolean z2 = this.LLLFFI;
        Iterator<LinkListUser> it2 = this.LLLFF.iterator();
        loop0: do {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            LinkListUser next2 = it2.next();
            Iterator it3 = ((ArrayList) this.LLJLIL).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break loop0;
                }
                next = it3.next();
                User user3 = (User) next;
                User user4 = next2.user;
                if (user4 != null && user3.getId() == user4.getId()) {
                    break;
                }
            }
        } while (next != null);
        z = false;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (str != null) {
            map.put("gift_enter_from", str);
        }
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (user2 != null) {
            map.put("to_user_type", z ? "all" : C917520Zz4.LJIILL(user2));
        }
        if (!z) {
            strValueOf = String.valueOf(user2 != null ? Long.valueOf(user2.getId()) : null);
        } else if (!Intrinsics.LJFF(str, "anchor_link_guest")) {
            Room roomLIZJ = C950220apo.LIZJ();
            strValueOf = String.valueOf(roomLIZJ != null ? roomLIZJ.getOwnerUserId() : 0L);
        } else if (user == null || (strValueOf = user.getIdStr()) == null) {
            strValueOf = "";
        }
        map.put("to_user_id", strValueOf);
        map.put("is_back", z2 ? "1" : CardStruct.IStatusCode.DEFAULT);
        C0KX4.LIZ("livesdk_gift_recipient_switch_entrance_show", map, null, true);
        this.LLLFFI = false;
        this.LLJILJILJ.DQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 876));
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        super.LJJIZ();
        C915980Zwa.LJIIIIZZ().a9(this.LLLFZ);
    }

    public final int LJJJJ(int i) {
        return C814420VxA.LIZIZ(i * this.LL.getResources().getDisplayMetrics().density);
    }

    public final void LJJJJI(View view) {
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.tv_single_to);
        this.LLJJJJ = c16f5;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        this.LLJJJIL = (LiveIconView) view.findViewById(R.id.k0t);
        C16F5 c16f52 = this.LLJJIII;
        if (c16f52 != null) {
            c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.eyv, this.LL));
        }
        LiveIconView liveIconView = this.LLJJJIL;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        LiveIconView liveIconView2 = this.LLJJJIL;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, this);
        }
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.horizontalChainStyle = -1;
                c19me.startToStart = 0;
                c19me.endToStart = R.id.k0s;
                ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                C786410Ut5.W5(constraintLayout, c19me);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C19R6 c19r6 = this.LLJJIJI;
        if (c19r6 != null) {
            ViewGroup.LayoutParams layoutParams2 = c19r6.getLayoutParams();
            if (layoutParams2 != null) {
                C19ME c19me2 = (C19ME) layoutParams2;
                c19me2.startToStart = -1;
                c19me2.startToEnd = R.id.tv_single_to;
                c19me2.endToStart = R.id.dxk;
                c19me2.endToEnd = -1;
                C786410Ut5.W5(c19r6, c19me2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        C19R6 c19r62 = this.LLJJIJI;
        if (c19r62 != null) {
            C500260Jjc.LJLJJL(LJJJJ(8), c19r62);
        }
        LJJJJIZL(false);
    }

    public final void LJJJJIZL(boolean z) {
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (z) {
                    c19me.endToStart = R.id.zq0;
                    c19me.endToEnd = -1;
                    c19me.horizontalWeight = 1.0f;
                } else {
                    c19me.endToStart = -1;
                    c19me.endToEnd = 0;
                    c19me.horizontalWeight = -1.0f;
                }
                C786410Ut5.W5(c16f5, c19me);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final void LJJJJJ(List<? extends User> list) {
        Drawable drawableLIZ;
        int width;
        if (list != null && ((ArrayList) list).size() > 1) {
            if (this.LLJL <= 0) {
                View view = this.LLJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    return;
                }
                return;
            }
            View view2 = this.LLJJ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C500260Jjc.LJLJLJ(this.LLJJLIIIJLLLLLLLZ, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) e3.h);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                drawableLIZ = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, this.LL, Integer.valueOf(C439101nJ.LIZ(12)), Integer.valueOf(C439101nJ.LIZ(12)));
            } else {
                drawableLIZ = C0UDZ.LIZ(R.drawable.etw);
            }
            if (drawableLIZ != null) {
                drawableLIZ.setBounds(0, 0, C439101nJ.LIZ(12), C439101nJ.LIZ(12));
            } else {
                drawableLIZ = null;
            }
            C786410Ut5.q2(spannableStringBuilder, new C416760GVu(drawableLIZ), length, length2, 33);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(this.LLJL);
            spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
            spannableStringBuilder.append((CharSequence) ")");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C497740JfY.LJIJI(2131843408));
            int i = this.LL.getResources().getDisplayMetrics().widthPixels / 2;
            C16F5 c16f5 = this.LLJJJJ;
            if (c16f5 != null) {
                width = c16f5.getWidth();
            } else {
                width = 0;
            }
            int iLJJJJ = ((i - LJJJJ(36)) - width) - LJJJJ(30);
            C937360aV4 c937360aV4 = this.LLJJLIIIJLLLLLLLZ;
            if (c937360aV4 != null) {
                if (c937360aV4.getGiftIconTextMaxWidth() == 0) {
                    c937360aV4.setGiftIconTextMaxWidth(iLJJJJ);
                }
                C16F5 c16f52 = this.LLJJJJ;
                if (c16f52 != null) {
                    C12ES.LJIILL(0, c16f52);
                }
                C16F5 c16f53 = this.LLJJJJ;
                c937360aV4.setTextSize(14.0f);
                if (c16f53 != null) {
                    c16f53.setTextSize(13.0f);
                }
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) spannableStringBuilder2).append((CharSequence) spannableStringBuilder);
                if (c937360aV4.getPaint().measureText(spannableStringBuilderAppend.toString()) > c937360aV4.LLJJ) {
                    int i2 = 13;
                    do {
                        float f = i2;
                        c937360aV4.setTextSize(f);
                        if (c16f53 != null) {
                            c16f53.setTextSize(f);
                        }
                        if (c937360aV4.getPaint().measureText(spannableStringBuilderAppend.toString()) < c937360aV4.LLJJ) {
                            break;
                        } else {
                            i2--;
                        }
                    } while (9 < i2);
                }
                if (c937360aV4.getPaint().measureText(spannableStringBuilderAppend.toString()) > c937360aV4.LLJJ && spannableStringBuilder2.length() > 1) {
                    spannableStringBuilderAppend = spannableStringBuilder2.replace(spannableStringBuilder2.length() / 2, spannableStringBuilder2.length(), (CharSequence) "...").append((CharSequence) spannableStringBuilder);
                }
                c937360aV4.setText(spannableStringBuilderAppend);
                return;
            }
            C16F5 c16f54 = this.LLJJJJ;
            if (c16f54 == null) {
                return;
            }
            C439101nJ.LJI(c16f54);
            return;
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        C500260Jjc.LJLJLJ(this.LLJJLIIIJLLLLLLLZ, false);
        C16F5 c16f55 = this.LLJJJJ;
        if (c16f55 == null) {
            return;
        }
        C439101nJ.LJI(c16f55);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long lValueOf;
        String strValueOf;
        long ownerUserId;
        String strLJIILL;
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog;
        Long lValueOf2;
        Long lValueOf3;
        String str;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append("_MultiGuestGiftSwitchTargetLeaf_");
            sbLIZ.append(232);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fast click ");
            sbLIZ2.append(view);
            sbLIZ2.append(", so return");
            C1AZW.LJIILL(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return;
        }
        boolean z = true;
        if (!Intrinsics.LJFF(view, this.LLJJIJIIJIL) && !Intrinsics.LJFF(view, this.LLJJJIL)) {
            if (Intrinsics.LJFF(view, this.LLJJIJIL) && ((ArrayList) this.LLJLIL).size() <= 1 && C930480aJy.LJ("openUserProfile", this.LL, this.LLJLLIL)) {
                if (C930480aJy.LJIJJ(Long.valueOf(UserService.getInstance().user().getCurrentUserId()))) {
                    str = "live_anchor_c_audience";
                } else {
                    str = "live_audience_c_audience";
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(this.LLJLLL, str);
                userProfileEvent.mReportType = "report_user";
                userProfileEvent.mSource = "guest_connection";
                userProfileEvent.mClickUserPosition = "gift_panel";
                userProfileEvent.clickModule = "multi_guest_gift_panel";
                C784440Upu.LIZ().LIZIZ(userProfileEvent);
                return;
            }
            return;
        }
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.TRUE);
        }
        if (((ArrayList) this.LLJLIL).size() <= 1) {
            z = false;
        }
        if (this.LLJZIJLIL == null) {
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.addAll(this.LLLFF);
            } else {
                Iterator<LinkListUser> it2 = this.LLLFF.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    LinkListUser next = it2.next();
                    User user = next.user;
                    if (user != null) {
                        lValueOf2 = Long.valueOf(user.getId());
                    } else {
                        lValueOf2 = null;
                    }
                    User user2 = this.LLJLLL;
                    if (user2 != null) {
                        lValueOf3 = Long.valueOf(user2.getId());
                    } else {
                        lValueOf3 = null;
                    }
                    if (Intrinsics.LJFF(lValueOf2, lValueOf3)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
            User user3 = this.LLJLLL;
            boolean z2 = this.LLJILJIL;
            String str2 = this.LLJIJIL;
            List<LinkListUser> list = this.LLLFF;
            Long l = this.LLJLILLLLZIIL;
            Integer num = this.LLJLL;
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 957);
            MultiGuestGiftSwitchTargetDialog.LLJJ = user3;
            MultiGuestGiftSwitchTargetDialog.LLJJI = arrayList;
            MultiGuestGiftSwitchTargetDialog.LLJJIII = z2;
            MultiGuestGiftSwitchTargetDialog.LLJJIJI = str2;
            MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog2 = new MultiGuestGiftSwitchTargetDialog();
            ((ArrayList) multiGuestGiftSwitchTargetDialog2.LLJI).addAll(list);
            multiGuestGiftSwitchTargetDialog2.LLJIJIL = awS559S0100000_15;
            multiGuestGiftSwitchTargetDialog2.LLJILJILJ = l;
            multiGuestGiftSwitchTargetDialog2.LLJILLL = num;
            this.LLJZIJLIL = multiGuestGiftSwitchTargetDialog2;
        }
        MultiGuestGiftSwitchTargetDialog multiGuestGiftSwitchTargetDialog3 = this.LLJZIJLIL;
        if (multiGuestGiftSwitchTargetDialog3 != null) {
            multiGuestGiftSwitchTargetDialog3.setOnDismissListener(new DialogInterfaceOnDismissListenerC786080UsY(this, 34));
        }
        FragmentManager fragmentManager = (FragmentManager) this.LLJILJILJ.gg0(C748880TZe.class);
        if (fragmentManager != null && (multiGuestGiftSwitchTargetDialog = this.LLJZIJLIL) != null) {
            multiGuestGiftSwitchTargetDialog.show(fragmentManager, ViewOnClickListenerC937350aV3.class.getName());
        }
        User user4 = this.LLJLLL;
        String str3 = this.LLJIJIL;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (str3 != null) {
            map.put("gift_enter_from", str3);
        }
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        if (user4 != null) {
            if (z) {
                strLJIILL = "all";
            } else {
                strLJIILL = C917520Zz4.LJIILL(user4);
            }
            map.put("to_user_type", strLJIILL);
        }
        if (z) {
            if (Intrinsics.LJFF(str3, "anchor_link_guest")) {
                if (user4 == null || (strValueOf = user4.getIdStr()) == null) {
                    strValueOf = "";
                }
            } else {
                Room roomLIZJ = C950220apo.LIZJ();
                if (roomLIZJ != null) {
                    ownerUserId = roomLIZJ.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                strValueOf = String.valueOf(ownerUserId);
            }
        } else {
            if (user4 != null) {
                lValueOf = Long.valueOf(user4.getId());
            } else {
                lValueOf = null;
            }
            strValueOf = String.valueOf(lValueOf);
        }
        map.put("to_user_id", strValueOf);
        C0KX4.LIZ("livesdk_gift_recipient_switch_entrance_click", map, null, true);
    }

    @Override // X.AbstractC937370aV5
    public final void LJJJIL(String str, boolean z) {
        this.LLJIJIL = str;
        this.LLJILJIL = z;
        LJJJI();
    }

    @Override // X.AbstractC1100450ek7
    public final Pair<View, C19ME> LJJJ(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ViewGroup.LayoutParams layoutParams;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ht9, viewGroup, false);
        this.LLJJ = viewTd;
        this.LLJJIII = (C16F5) viewTd.findViewById(R.id.y50);
        C19R6 c19r6 = (C19R6) viewTd.findViewById(R.id.l9h);
        if (c19r6 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.etn, context);
            if (numLIZJ != null) {
                c19r6.setBackgroundColor(numLIZJ.intValue());
            }
            c19r6.setPadding(C439101nJ.LIZ(1), C439101nJ.LIZ(1), C439101nJ.LIZ(1), C439101nJ.LIZ(1));
        } else {
            c19r6 = null;
        }
        this.LLJJIJI = c19r6;
        this.LLJJIJIIJIL = (ViewGroup) viewTd.findViewById(R.id.iwe);
        this.LLJJIJIL = (ConstraintLayout) viewTd.findViewById(R.id.y4x);
        viewTd.findViewById(R.id.dx1);
        this.LLJJJ = (TextView) viewTd.findViewById(R.id.zoj);
        this.LLJJJJJIL = (C20743416Fc) viewTd.findViewById(R.id.zq0);
        TextView textView = this.LLJJJ;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131843411));
        }
        this.LLJJJJLIIL = (RecyclerView) viewTd.findViewById(R.id.twz);
        this.LLJJLIIIJLLLLLLLZ = (C937360aV4) viewTd.findViewById(R.id.tv_selected_coins);
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        RecyclerView recyclerView2 = this.LLJJJJLIIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((AbstractC21673619ry) this.LLJJL.getValue());
        }
        RecyclerView recyclerView3 = this.LLJJJJLIIL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C785840UsA(1));
        }
        C16F5 c16f5 = (C16F5) viewTd.findViewById(R.id.tv_single_to);
        this.LLJJJJ = c16f5;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        C20743416Fc c20743416Fc = this.LLJJJJJIL;
        if (c20743416Fc != null) {
            C786410Ut5.LLJJJJLIIL(c20743416Fc, 8);
        }
        C937360aV4 c937360aV4 = this.LLJJLIIIJLLLLLLLZ;
        if (c937360aV4 != null) {
            c937360aV4.setTextColor(C497740JfY.LIZLLL(R.attr.eyv, this.LL));
        }
        C937360aV4 c937360aV42 = this.LLJJLIIIJLLLLLLLZ;
        if (c937360aV42 != null && (layoutParams = c937360aV42.getLayoutParams()) != null) {
            ((C19ME) layoutParams).startToEnd = R.id.tv_single_to;
        }
        C937360aV4 c937360aV43 = this.LLJJLIIIJLLLLLLLZ;
        if (c937360aV43 != null) {
            C500260Jjc.LJLJJL(LJJJJ(6), c937360aV43);
        }
        C500260Jjc.LJLJLJ(this.LLJJJJLIIL, false);
        LJJJJI(viewTd);
        this.LLIZ.LJJLJLI(new AfS184S0100000_15(this, 157));
        this.LLIZLLLIL.LJJLJLI(new AfS181S0100000_12(this, 241));
        this.LLJ.LJJLJLI(new AfS181S0100000_12(this, 242));
        this.LLJI.LJJLJLI(new AfS181S0100000_12(this, 243));
        return new Pair<>(viewTd, null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0a62] */
    public ViewOnClickListenerC937350aV3(Context context, C11RK c11rk, C11RK c11rk2, C11RK c11rk3, C11RK c11rk4, String str, boolean z, int i, DataChannel dataChannel, ARunnableS117S0100000_17 aRunnableS117S0100000_17) {
        super(context, i);
        this.LLIZ = c11rk;
        this.LLIZLLLIL = c11rk2;
        this.LLJ = c11rk3;
        this.LLJI = c11rk4;
        this.LLJIJIL = str;
        this.LLJILJIL = z;
        this.LLJILJILJ = dataChannel;
        this.LLJILLL = aRunnableS117S0100000_17;
        this.LLJJL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(355));
        this.LLJLIL = new ArrayList();
        this.LLJLLIL = new C11NJ();
        this.LLJZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 871));
        this.LLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(354));
        this.LLLFF = C13BV.INSTANCE;
        this.LLLFZ = new InterfaceC964770bDH() { // from class: X.0a62
            @Override // X.InterfaceC964770bDH
            public final void LIZ(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJFF(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJ(String str2, C1AZU c1azu, C2231141CUe c2231141CUe) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str2, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIZILJ(String str2, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIJJLI(String str2, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJI(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIFFI(int i2, int i3, int i4) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIIZI(String str2, String str3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str2, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str2, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str2, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i2, C965030bDh c965030bDh) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJZI(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLL(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJZ(int i2, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJLIIIJJIZ(String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z2, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJLLL(int i2, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIILZL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIL(List<LinkUser> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str2, String str3) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str2, boolean z2, boolean z3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i2, InterfaceC958070b2T interfaceC958070b2T, String str2, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i2, C967130bH5 c967130bH5, String str2, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i2, InterfaceC958070b2T interfaceC958070b2T, String str2, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str2, String str3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str2) {
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
            @Override // X.InterfaceC964770bDH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIZ(java.lang.String r6, long r7) {
                /*
                    r5 = this;
                    X.0aV3 r0 = r5.LL
                    com.bytedance.android.live.base.model.user.User r4 = r0.LLJLLL
                    r3 = 0
                    if (r4 == 0) goto L39
                    com.bytedance.android.live.base.model.user.User r1 = r0.LLJJI
                    if (r1 == 0) goto L47
                    X.0aJy r0 = X.C930480aJy.LIZ
                    r0.getClass()
                    boolean r1 = X.C930480aJy.LJIJI(r1)
                    r0 = 1
                    if (r1 != r0) goto L47
                    X.0amx r1 = X.C948450amx.LIZIZ
                    java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
                    java.lang.Object r1 = r1.LJIIIZ(r0)
                    boolean r0 = r1 instanceof X.InterfaceC302401Fe
                    if (r0 == 0) goto L39
                    X.01Fe r1 = (X.InterfaceC302401Fe) r1
                    if (r1 == 0) goto L39
                    X.0aGn r2 = r1.LIZ()
                    if (r2 == 0) goto L39
                    long r0 = r4.getId()
                    com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C921170a4x.LJIIIZ(r2, r0)
                L35:
                    if (r0 == 0) goto L39
                    java.lang.String r3 = r0.mInteractIdStr
                L39:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r3)
                    if (r0 == 0) goto L46
                    X.0aV3 r0 = r5.LL
                    java.lang.Runnable r0 = r0.LLJILLL
                    r0.run()
                L46:
                    return
                L47:
                    X.0amx r1 = X.C948450amx.LIZIZ
                    java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
                    java.lang.Object r1 = r1.LJIIIZ(r0)
                    boolean r0 = r1 instanceof X.InterfaceC917640ZzG
                    if (r0 == 0) goto L39
                    X.0ZzG r1 = (X.InterfaceC917640ZzG) r1
                    if (r1 == 0) goto L39
                    X.0aGn r2 = r1.LIZ()
                    if (r2 == 0) goto L39
                    long r0 = r4.getId()
                    com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C921170a4x.LJIIJJI(r2, r0)
                    if (r0 == 0) goto L39
                    com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C930540aK4.LIZ(r0)
                    goto L35
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C921840a62.LJJIZ(java.lang.String, long):void");
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                this.LL.getClass();
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
                this.LL.LLJILLL.run();
            }
        };
    }
}
