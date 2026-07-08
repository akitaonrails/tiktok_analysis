package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceExploreNameMaxLengthSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import cu0.b;
import java.util.List;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.Intrinsics;
import mr0.r0;

/* JADX INFO: renamed from: X.0ezG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1109840ezG<MODEL extends r0<? extends AbstractC1136060ffY>, PINNED_MODEL extends b<MODEL>> extends AbstractC1109720ez4<MODEL, PINNED_MODEL> {
    public final int LLIZLLLIL;
    public MODEL LLJ;
    public AbstractC1136060ffY LLJI;
    public C1109020exw LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final ImageView LLJJIJI;

    public abstract View b6();

    public String d6() {
        return "report_message";
    }

    public final C1110560f0Q V5() {
        return (C1110560f0Q) this.LLJILJILJ.getValue();
    }

    public final C1110570f0R W5() {
        return (C1110570f0R) this.LLJJI.getValue();
    }

    public final C1110560f0Q X5() {
        return (C1110560f0Q) this.LLJJ.getValue();
    }

    public final C1110560f0Q c6() {
        return (C1110560f0Q) this.LLJILLL.getValue();
    }

    public final void onHide() {
        C500260Jjc.LJLJLJ(this.itemView, false);
        X5().LIZJ().LJIIZILJ();
    }

    public final void show() {
        C1109610eyt c1109610eyt = this.LLILLJJLI;
        C1109610eyt c1109610eyt2 = c1109610eyt instanceof C1109610eyt ? c1109610eyt : null;
        if (c1109610eyt2 != null) {
            c1109610eyt2.LJIIL = true;
        }
        C500260Jjc.LJLJLJ(this.itemView, true);
        C500260Jjc.LJLJLJ(this.LLJJIJI, false);
    }

    public String a6() {
        return C497740JfY.LJIJI(2131843780);
    }

    @Override // X.AbstractC1109720ez4
    public final ImageView P5() {
        return this.LLJJIJI;
    }

    public final void U5(String str) {
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        Boolean boolValueOf;
        String str2;
        Room room2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pin_comment_platform_click");
        C1109770ez9 c1109770ez9 = this.LL;
        User user = null;
        if (c1109770ez9 != null) {
            dataChannel = c1109770ez9.LJIIIZ;
        } else {
            dataChannel = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel);
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 != null) {
            room = c1109770ez92.LJII;
            dataChannel2 = c1109770ez92.LJIIIZ;
        } else {
            room = null;
            dataChannel2 = null;
        }
        c474500IjALIZ.LJJII(C0KYR.LIZIZ(room, dataChannel2), "admin_type");
        C1109770ez9 c1109770ez93 = this.LL;
        if (c1109770ez93 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez93.LJJ);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_extended_comment_filed");
        C1109770ez9 c1109770ez94 = this.LL;
        if (c1109770ez94 != null) {
            room2 = c1109770ez94.LJII;
        } else {
            room2 = null;
        }
        C1109020exw c1109020exw = this.LLJIJIL;
        if (c1109020exw != null) {
            user = c1109020exw.LIZIZ;
        }
        c474500IjALIZ.LJJII(C0KYR.LIZ(user, room2), "pin_user");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }

    public void e6(String str) {
        C1110560f0Q c1110560f0QV5 = V5();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('s');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (c1110560f0QV5.LIZJ().LJJL != 0) {
            c1110560f0QV5.LIZJ().LJJJZ = strLIZIZ;
            c1110560f0QV5.LIZJ().LIZIZ = -1;
        }
        b6().requestLayout();
        b6().invalidate();
    }

    public void f6(PINNED_MODEL pinned_model) {
        boolean z;
        boolean z2;
        C1109610eyt c1109610eyt;
        C1109020exw c1109020exw;
        C1109020exw c1109020exw2;
        boolean z3 = pinned_model instanceof C1109610eyt;
        C1109610eyt c1109610eyt2 = null;
        if (z3) {
            c1109610eyt2 = (C1109610eyt) pinned_model;
        }
        if (c1109610eyt2 != null && (c1109020exw2 = c1109610eyt2.LJIIIZ) != null) {
            z = c1109020exw2.LJ;
        } else {
            z = false;
        }
        if (z3 && (c1109610eyt = (C1109610eyt) pinned_model) != null && (c1109020exw = c1109610eyt.LJIIIZ) != null) {
            z2 = c1109020exw.LIZJ;
        } else {
            z2 = false;
        }
        this.LLJILJIL = z2;
        if (z) {
            if (!z2) {
                C500260Jjc.LJLJLJ((View) this.LLJJIII.getValue(), true);
                return;
            }
            View view = (View) this.LLJJIII.getValue();
            if (view == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, view);
            return;
        }
        if (z2) {
            View view2 = (View) this.LLJJIII.getValue();
            if (view2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, view2);
            return;
        }
        C500260Jjc.LJLJLJ((View) this.LLJJIII.getValue(), false);
    }

    public AbstractC1109840ezG(View view, C1109770ez9 c1109770ez9) {
        super(view, c1109770ez9);
        this.LLIZLLLIL = (int) C497740JfY.LIZIZ(16.0f);
        LivePublicScreenSpaceExploreNameMaxLengthSetting.INSTANCE.getNameMaxLength();
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 118));
        this.LLJILLL = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 121));
        this.LLJJ = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 120));
        this.LLJJI = C452501pT.LIZIZ(new AwS418S0200000_17(view, this, 119));
        this.LLJJIII = C292401Bi.LIZ(new AwS418S0200000_17(view, this, 117));
        ImageView imageView = (ImageView) view.findViewById(R.id.qgd);
        C786410Ut5.Q7(imageView, new ACListenerS152S0100000_17(this, 175));
        this.LLJJIJI = imageView;
        if (!(this instanceof C1110100ezg)) {
            ((C19MX) view.findViewById(R.id.tlg)).setReferencedIds(new int[]{R.id.e2m, R.id.qgd});
        }
        view.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(this, 11));
    }

    @Override // X.AbstractC1109720ez4
    public void T5(PINNED_MODEL pinned_model, List<? extends Object> list) {
        boolean z;
        C1109610eyt c1109610eyt;
        C1109020exw c1109020exw;
        C1109610eyt c1109610eyt2;
        C1109610eyt c1109610eyt3;
        C1109020exw c1109020exw2;
        if (!Intrinsics.LJFF(this.LLILLJJLI, pinned_model) && !pinned_model.LJ) {
            S5().removeCallbacks(R5());
        }
        pinned_model.LIZLLL++;
        this.LLJ = (AbstractC1110800f0o) pinned_model.LIZ();
        this.LLJI = ((AbstractC1110800f0o) pinned_model.LIZ()).LJIL;
        boolean z2 = pinned_model instanceof C1109610eyt;
        C1109020exw c1109020exw3 = null;
        if (z2 && (c1109610eyt3 = (C1109610eyt) pinned_model) != null && (c1109020exw2 = c1109610eyt3.LJIIIZ) != null) {
            z = c1109020exw2.LIZJ;
        } else {
            z = false;
        }
        this.LLJILJIL = z;
        if (z2) {
            if (z2 && (c1109610eyt2 = (C1109610eyt) pinned_model) != null) {
                c1109020exw3 = c1109610eyt2.LJIIIZ;
            }
        }
        this.LLJIJIL = c1109020exw3;
        if (z2 && (c1109610eyt = (C1109610eyt) pinned_model) != null && (c1109020exw = c1109610eyt.LJIIIZ) != null) {
            long jLIZ = c1109020exw.LIZ();
            if (jLIZ != -1) {
                e6(String.valueOf(jLIZ));
            }
        }
    }
}
