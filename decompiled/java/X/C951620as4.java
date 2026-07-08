package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0as4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951620as4 extends AbstractC960400b6E<C954460awe> {
    public final InterfaceC951640as6 LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public C954460awe LLJI;

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "CoHostInviteListMangePanelUserViewHolder";
    }

    public static boolean N5(C954460awe c954460awe) {
        List<LinkUser> listLJI;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null && (listLJI = C948780anU.LJI(interfaceC954180awCLJIIIZ)) != null) {
            for (LinkUser linkUser : listLJI) {
                Long l = linkUser.userId;
                long j = c954460awe.LJ;
                if (l != null && l.longValue() == j) {
                    if (linkUser != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean P5(C954460awe c954460awe) {
        if (!c954460awe.LJI() && c954460awe.LJIIJ() && !N5(c954460awe)) {
            return true;
        }
        return false;
    }

    public C951620as4(View view, InterfaceC951640as6 interfaceC951640as6) {
        super(view);
        this.LLILZ = interfaceC951640as6;
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 989));
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 990));
        this.LLIZ = C1935407i4.LIZ(new AwS559S0100000_15(view, 991));
        this.LLIZLLLIL = C1935407i4.LIZ(new AwS559S0100000_15(view, 988));
        this.LLJ = C1935407i4.LIZ(new AwS559S0100000_15(view, 992));
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        String str;
        String str2;
        long j;
        long jLLLLIL;
        TextView textView;
        int i2;
        ImageModel imageModel;
        C954460awe c954460awe = (C954460awe) obj;
        this.LLJI = c954460awe;
        ImageView imageView = (ImageView) this.LLILZIL.getValue();
        Long lValueOf = null;
        if (imageView != null) {
            C754570Tip c754570Tip = c954460awe.LJIJJ;
            if (c754570Tip != null) {
                imageModel = c754570Tip.LIZJ;
            } else {
                imageModel = null;
            }
            C1121670fIL.LJIILIIL(imageView, imageModel, imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
        }
        if (c954460awe.LJJIIZ != EnumC950200apm.LINKED && !c954460awe.LJI() && !N5(c954460awe)) {
            if (c954460awe.LJIIJ() && (textView = (TextView) this.LLJ.getValue()) != null) {
                if (c954460awe.LJIJ == EnumC919160a1i.PLAYTYPE_APPLY.value) {
                    i2 = 2131841170;
                } else {
                    i2 = 2131841169;
                }
                textView.setText(i2);
            }
        } else {
            TextView textView2 = (TextView) this.LLJ.getValue();
            if (textView2 != null) {
                C754570Tip c754570Tip2 = c954460awe.LJIJJ;
                if (c754570Tip2 != null) {
                    str = c754570Tip2.LIZ;
                    str2 = c754570Tip2.LIZIZ;
                } else {
                    str = null;
                    str2 = null;
                }
                textView2.setText(C0KVU.LIZIZ(str, str2));
            }
        }
        if (P5(c954460awe)) {
            LiveIconView liveIconView = (LiveIconView) this.LLILZLL.getValue();
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
        } else {
            LiveIconView liveIconView2 = (LiveIconView) this.LLILZLL.getValue();
            if (liveIconView2 != null) {
                C786410Ut5.LLJJIJIL(liveIconView2, 8);
            }
        }
        C954460awe c954460awe2 = this.LLJI;
        if (c954460awe2 != null) {
            if (P5(c954460awe2)) {
                C16F5 c16f5 = (C16F5) this.LLIZ.getValue();
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 0);
                }
                C954460awe c954460awe3 = this.LLJI;
                if (c954460awe3 != null) {
                    j = c954460awe3.LJIIJ;
                } else {
                    j = 0;
                }
                long j2 = j / 1000;
                if (c954460awe2.LJIIL && c954460awe2.LJIILIIL) {
                    jLLLLIL = C915980Zwa.LJII().LLLLIL(c954460awe2.LJIILL);
                } else {
                    jLLLLIL = C915980Zwa.LJII().LLLLIL(c954460awe2.LJ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateCountDown, user.isWaiting, coHostUser?.uid = ");
                C954460awe c954460awe4 = this.LLJI;
                if (c954460awe4 != null) {
                    lValueOf = Long.valueOf(c954460awe4.LJ);
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", countDownText = ");
                sbLIZ.append(jLLLLIL);
                sbLIZ.append(", initCountDown = ");
                sbLIZ.append(j2);
                C20441214yg.LJIIIZ("CoHostInviteListMangePanelUserViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                TextView textView3 = (TextView) this.LLIZ.getValue();
                if (textView3 != null) {
                    String strLJIJI = C497740JfY.LJIJI(2131841124);
                    Object[] objArr = new Object[1];
                    if (jLLLLIL > 0) {
                        j2 = jLLLLIL;
                    }
                    objArr[0] = Long.valueOf(j2);
                    textView3.setText(C341701Uh.LIZ(strLJIJI, objArr));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateCountDown, GONE, coHostUser?.uid = ");
                C954460awe c954460awe5 = this.LLJI;
                if (c954460awe5 != null) {
                    lValueOf = Long.valueOf(c954460awe5.LJ);
                }
                sbLIZ2.append(lValueOf);
                C20441214yg.LJIIIZ("CoHostInviteListMangePanelUserViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
                C16F5 c16f52 = (C16F5) this.LLIZ.getValue();
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
            }
        }
        if (P5(c954460awe) && c954460awe.LJIIJJI()) {
            ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL.getValue();
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.LLIZLLLIL.getValue();
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        }
        C954460awe c954460awe6 = this.LLJI;
        if (c954460awe6 != null) {
            LiveIconView liveIconView3 = (LiveIconView) this.LLILZIL.getValue();
            if (liveIconView3 != null) {
                C786410Ut5.g8(liveIconView3, new ACListenerS118S0200000_15(this, c954460awe6, 54));
            }
            ViewGroup viewGroup3 = (ViewGroup) this.LLIZLLLIL.getValue();
            if (viewGroup3 != null) {
                C786410Ut5.K7(viewGroup3, new ACListenerS118S0200000_15(this, c954460awe6, 55));
            }
        }
    }
}
