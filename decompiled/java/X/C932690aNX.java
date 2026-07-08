package X;

import Y.ACListenerS53S0101000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestInviteFriendDailyLimitSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0aNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932690aNX extends AbstractC960470b6L<C932680aNW> {
    public final DataChannel LL;
    public final C518340KUm LLILLJJLI;
    public final boolean LLILLL;
    public final C1324720kZq LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final C16FS LLIZLLLIL;
    public final View LLJ;
    public final C932810aNj LLJI;
    public C932680aNW LLJIJIL;

    public final void L5(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasInvited = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("updateInviteButtonStyle", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C16FS c16fs = this.LLIZLLLIL;
            if (c16fs != null) {
                c16fs.setText(C497740JfY.LJIJI(2131852857));
            }
            C16FS c16fs2 = this.LLIZLLLIL;
            if (c16fs2 != null) {
                c16fs2.j0(R.style.a8b);
            }
            C16FS c16fs3 = this.LLIZLLLIL;
            if (c16fs3 != null) {
                c16fs3.setEnabled(false);
                return;
            }
            return;
        }
        C16FS c16fs4 = this.LLIZLLLIL;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIJI(2131852855));
        }
        C16FS c16fs5 = this.LLIZLLLIL;
        if (c16fs5 != null) {
            c16fs5.j0(R.style.a7v);
        }
        C16FS c16fs6 = this.LLIZLLLIL;
        if (c16fs6 == null) {
            return;
        }
        c16fs6.setEnabled(true);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        ImageModel avatarThumb;
        String string;
        int iIntValue;
        boolean z;
        Integer num;
        GuestInvitePanelResp.ListUser listUser;
        User user;
        View view;
        int i2;
        int iLIZIZ;
        C932680aNW c932680aNW = (C932680aNW) obj;
        this.LLJIJIL = c932680aNW;
        if (this.LLILLL) {
            View view2 = this.itemView;
            if (c932680aNW.LIZIZ) {
                i2 = R.drawable.dk4;
            } else {
                i2 = R.drawable.dk5;
            }
            view2.setBackgroundResource(i2);
            View view3 = this.itemView;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                if (c932680aNW.LIZIZ) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    iLIZIZ = 0;
                }
                marginLayoutParams.bottomMargin = iLIZIZ;
                C786410Ut5.W5(view3, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        GuestInvitePanelResp.ListUser listUser2 = c932680aNW.LIZ;
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            c16f5.setText(C0KVU.LIZ(listUser2.user));
        }
        int i3 = listUser2.onlineStatus;
        if (i3 != 0 && i3 != 2) {
            if (i3 == 1 && (view = this.LLJ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        } else {
            View view4 = this.LLJ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
        }
        L5(listUser2.invited);
        int size = listUser2.recommendTagTextList.size();
        if (size != 0) {
            if (size != 1) {
                C16F5 c16f52 = this.LLIZ;
                if (c16f52 != null) {
                    C12ES.LJIILL(0, c16f52);
                }
                C16F5 c16f53 = this.LLILZLL;
                if (c16f53 != null) {
                    C12ES.LJIILL(0, c16f53);
                }
                C16F5 c16f54 = this.LLILZLL;
                if (c16f54 != null) {
                    c16f54.setMaxLines(1);
                }
                C16F5 c16f55 = this.LLILZLL;
                if (c16f55 != null) {
                    c16f55.setText((CharSequence) C13LP.LJJJLZIJ(0, listUser2.recommendTagTextList));
                }
                C16F5 c16f56 = this.LLIZ;
                if (c16f56 != null) {
                    c16f56.setText((CharSequence) C13LP.LJJJLZIJ(1, listUser2.recommendTagTextList));
                }
            } else {
                C16F5 c16f57 = this.LLIZ;
                if (c16f57 != null) {
                    C439101nJ.LJI(c16f57);
                }
                C16F5 c16f58 = this.LLILZLL;
                if (c16f58 != null) {
                    C12ES.LJIILL(0, c16f58);
                }
                C16F5 c16f59 = this.LLILZLL;
                if (c16f59 != null) {
                    c16f59.setMaxLines(2);
                }
                C16F5 c16f510 = this.LLILZLL;
                if (c16f510 != null) {
                    c16f510.setText((CharSequence) C13LP.LJJJLZIJ(0, listUser2.recommendTagTextList));
                }
            }
        } else {
            C16F5 c16f511 = this.LLILZLL;
            if (c16f511 != null) {
                C786410Ut5.LLJJJJ(c16f511, 8);
            }
            C16F5 c16f512 = this.LLIZ;
            if (c16f512 != null) {
                C786410Ut5.LLJJJJ(c16f512, 8);
            }
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        User user2 = listUser2.user;
        if (user2 != null) {
            avatarThumb = user2.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el9;
        c1324610kZfLJIIIZ.LJJI(this.LLILZ);
        C16FS c16fs = this.LLIZLLLIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS53S0101000_15(i, this, 0));
        }
        C932680aNW c932680aNW2 = this.LLJIJIL;
        if (c932680aNW2 == null || (listUser = c932680aNW2.LIZ) == null || (user = listUser.user) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
            string = "";
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(C754980TjU.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int i4 = i + 1;
        Boolean boolValueOf = Boolean.valueOf(c932680aNW.LIZ.invited);
        GuestInvitePanelResp.ListUser listUser3 = c932680aNW.LIZ;
        Map<String, String> map = listUser3.trackMap;
        if (listUser3.onlineStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        C923300a8O.LIZIZ("show", string, iIntValue, i4, boolValueOf, map, z, c932680aNW.LIZJ, c932680aNW.LIZLLL, c932680aNW.LJ);
    }

    public C932690aNX(View view, DataChannel dataChannel, C518340KUm c518340KUm, boolean z) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = c518340KUm;
        this.LLILLL = z;
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.user_avatar);
        this.LLILZIL = (C16F5) view.findViewById(R.id.p94);
        this.LLILZLL = (C16F5) view.findViewById(R.id.wgs);
        this.LLIZ = (C16F5) view.findViewById(R.id.wgt);
        C16FS c16fs = (C16FS) view.findViewById(R.id.cra);
        this.LLIZLLLIL = c16fs;
        this.LLJ = view.findViewById(R.id.view_online_dot);
        this.LLJI = new C932810aNj(MultiGuestInviteFriendDailyLimitSetting.INSTANCE.count());
        if (z && c16fs != null) {
            c16fs.setCircular(true);
            c16fs.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        }
    }
}
