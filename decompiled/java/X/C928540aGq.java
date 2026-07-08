package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicMultiGuestSimplifyReservationSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928540aGq extends AbstractC960470b6L<C929140aHo> {
    public final InterfaceC921430a5N LL;
    public final int LLILLJJLI;
    public C1099610eil LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16FS LLILZLL;
    public C16F5 LLIZ;
    public C16FS LLIZLLLIL;

    public final void N5() {
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131841147));
            c16fs.setClickable(false);
            c16fs.j0(R.style.a81);
        }
    }

    public final void L5(ListByTypeResponse.ReservedUser reservedUser) {
        C16FS c16fs = this.LLIZLLLIL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131842074));
            c16fs.setClickable(true);
            c16fs.j0(R.style.a7r);
            if (this.LLILLJJLI == 1) {
                C500260Jjc.LJLIIIL(500L, c16fs, new AwS224S0300000_15(reservedUser, c16fs, this, 1));
            } else {
                C500260Jjc.LJLIIIL(500L, c16fs, new AwS381S0200000_15(this, reservedUser, 10));
            }
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        String strLJIJJ;
        ImageModel avatarThumb;
        C929140aHo c929140aHo = (C929140aHo) obj;
        View view = this.itemView;
        this.LLILLL = (C1099610eil) view.findViewById(R.id.tbr);
        this.LLILZ = (C16F5) view.findViewById(R.id.tbt);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tbs);
        this.LLILZLL = (C16FS) view.findViewById(R.id.tbp);
        this.LLIZ = (C16F5) view.findViewById(R.id.tbq);
        this.LLIZLLLIL = (C16FS) view.findViewById(R.id.z_);
        LinkmicMultiGuestSimplifyReservationSetting linkmicMultiGuestSimplifyReservationSetting = LinkmicMultiGuestSimplifyReservationSetting.INSTANCE;
        if (linkmicMultiGuestSimplifyReservationSetting.enable()) {
            C16FS c16fs = this.LLIZLLLIL;
            if (c16fs != null) {
                C12ES.LJIILL(0, c16fs);
            }
            C16FS c16fs2 = this.LLILZLL;
            if (c16fs2 != null) {
                C439101nJ.LJI(c16fs2);
            }
        } else {
            C16FS c16fs3 = this.LLIZLLLIL;
            if (c16fs3 != null) {
                C439101nJ.LJI(c16fs3);
            }
            C16FS c16fs4 = this.LLILZLL;
            if (c16fs4 != null) {
                C12ES.LJIILL(0, c16fs4);
            }
        }
        ListByTypeResponse.ReservedUser reservedUser = c929140aHo.LIZ;
        User user = reservedUser.user;
        C1099610eil c1099610eil = this.LLILLL;
        if (c1099610eil != null) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJJI(c1099610eil);
        }
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(C0KVU.LIZ(user));
        }
        int i2 = reservedUser.reserveType;
        if (i2 != 1) {
            if (i2 == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - reservedUser.updateTime;
                C16F5 c16f52 = this.LLILZIL;
                if (c16f52 != null) {
                    int iLJIIIIZZ = C963140bAe.LJIIIIZZ((int) (jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    if (iLJIIIIZZ < 60) {
                        strLJIJJ = C497740JfY.LJIJJ(2131844664, Integer.valueOf(iLJIIIIZZ));
                    } else {
                        strLJIJJ = C497740JfY.LJIJJ(2131844663, Integer.valueOf(iLJIIIIZZ / 60));
                    }
                    c16f52.setText(strLJIJJ);
                }
            }
        } else {
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                c16f53.setText(C932140aMe.LJI(reservedUser.tagList));
            }
        }
        if (this.LLILLJJLI == 1) {
            if (linkmicMultiGuestSimplifyReservationSetting.enable()) {
                L5(reservedUser);
            } else {
                int i3 = reservedUser.reserveType;
                if (i3 != 1) {
                    if (i3 != 2) {
                        N5();
                    } else {
                        N5();
                    }
                } else {
                    C16FS c16fs5 = this.LLILZLL;
                    if (c16fs5 != null) {
                        c16fs5.setText(C497740JfY.LJIJI(2131841150));
                        c16fs5.setClickable(true);
                        c16fs5.j0(R.style.a89);
                        C786410Ut5.h8(c16fs5, new ACListenerS118S0200000_15(reservedUser, this, 13));
                    }
                }
            }
            C16F5 c16f54 = this.LLIZ;
            if (c16f54 != null) {
                C439101nJ.LJI(c16f54);
                return;
            }
            return;
        }
        if (linkmicMultiGuestSimplifyReservationSetting.enable()) {
            L5(reservedUser);
        } else {
            C16FS c16fs6 = this.LLILZLL;
            if (c16fs6 != null) {
                c16fs6.setText(C497740JfY.LJIJI(2131841140));
                c16fs6.setClickable(true);
                c16fs6.j0(R.style.a7n);
                C500260Jjc.LJLIIIL(500L, c16fs6, new AwS381S0200000_15(this, reservedUser, 13));
            }
        }
        if (reservedUser.reserveType == 2) {
            C16F5 c16f55 = this.LLIZ;
            if (c16f55 == null) {
                return;
            }
            C12ES.LJIILL(0, c16f55);
            return;
        }
        C16F5 c16f56 = this.LLIZ;
        if (c16f56 == null) {
            return;
        }
        C439101nJ.LJI(c16f56);
    }

    public C928540aGq(View view, InterfaceC921430a5N interfaceC921430a5N, int i) {
        super(view);
        this.LL = interfaceC921430a5N;
        this.LLILLJJLI = i;
        if (C930540aK4.LJIJJLI()) {
            view.setBackground(null);
        }
    }
}
