package X;

import Y.ACListenerS120S0200000_17;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentDeleteForbidRegionalSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ezg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110100ezg extends AbstractC1109880ezK<C1110190ezp, C1109400eyY> {
    public final C1668220tVs LLJLIL;
    public final ViewGroup LLJLILLLLZIIL;
    public final ViewGroup LLJLL;
    public final View LLJLLIL;
    public final C994850bzn LLJLLL;
    public final C0KVZ LLJZ;

    @Override // X.AbstractC1109880ezK
    public final Drawable h6() {
        return null;
    }

    @Override // X.AbstractC1109840ezG
    public final String d6() {
        PINNED_MODEL pinned_model = this.LLILLJJLI;
        return (pinned_model == 0 || pinned_model.LIZ == 0) ? "" : "live_star_comment";
    }

    @Override // X.AbstractC1109840ezG
    public final String a6() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(C497740JfY.LJIJI(2131844125));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1109880ezK
    public final void q6() {
        AbstractC1110800f0o abstractC1110800f0o;
        super.q6();
        C1109770ez9 c1109770ez9 = this.LL;
        C1116210f9X c1116210f9X = null;
        DataChannel dataChannel = c1109770ez9 != null ? c1109770ez9.LJIIIZ : null;
        PINNED_MODEL pinned_model = this.LLILLJJLI;
        if (pinned_model != 0 && (abstractC1110800f0o = pinned_model.LIZ) != null) {
            c1116210f9X = (C1116210f9X) abstractC1110800f0o.LJIL;
        }
        C1116200f9W.LIZ(dataChannel, c1116210f9X, "click", "avatar");
    }

    @Override // X.AbstractC1109880ezK
    public final void u6() {
        AbstractC1110800f0o abstractC1110800f0o;
        super.u6();
        C1109770ez9 c1109770ez9 = this.LL;
        C1116210f9X c1116210f9X = null;
        DataChannel dataChannel = c1109770ez9 != null ? c1109770ez9.LJIIIZ : null;
        PINNED_MODEL pinned_model = this.LLILLJJLI;
        if (pinned_model != 0 && (abstractC1110800f0o = pinned_model.LIZ) != null) {
            c1116210f9X = (C1116210f9X) abstractC1110800f0o.LJIL;
        }
        C1116200f9W.LIZ(dataChannel, c1116210f9X, "click", "user_name");
    }

    @Override // X.AbstractC1109880ezK
    public final void r6(String str) {
        DataChannel dataChannel;
        AbstractC1110800f0o abstractC1110800f0o;
        super.r6(str);
        C1109770ez9 c1109770ez9 = this.LL;
        C1116210f9X c1116210f9X = null;
        if (c1109770ez9 != null) {
            dataChannel = c1109770ez9.LJIIIZ;
        } else {
            dataChannel = null;
        }
        PINNED_MODEL pinned_model = this.LLILLJJLI;
        if (pinned_model != 0 && (abstractC1110800f0o = pinned_model.LIZ) != null) {
            c1116210f9X = (C1116210f9X) abstractC1110800f0o.LJIL;
        }
        C1116200f9W.LIZ(dataChannel, c1116210f9X, "long_press", str);
    }

    public C1110100ezg(View view, C1109770ez9 c1109770ez9) {
        super(view, c1109770ez9, false);
        AbstractC20085213iM abstractC20085213iM = (AbstractC20085213iM) view.findViewById(R.id.c9c);
        if (abstractC20085213iM != null) {
            abstractC20085213iM.setViewCompositionStrategy(C20088213iq.LIZIZ);
        }
        AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) view.findViewById(R.id.veq);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setIntValues(abstractC20628015ni.getPlaceholderColor(), abstractC20628015ni.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        abstractC20628015ni.setAnimator(valueAnimator);
        this.LLJLIL = (C1668220tVs) view.findViewById(R.id.c9c);
        this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.eux);
        this.LLJLL = (ViewGroup) view.findViewById(R.id.veq);
        this.LLJLLIL = view.findViewById(R.id.fl1);
        this.LLJLLL = (C994850bzn) view.findViewById(R.id.xlq);
        this.LLJZ = (C0KVZ) view.findViewById(R.id.m4u);
    }

    @Override // X.AbstractC1109880ezK, X.AbstractC1109840ezG, X.AbstractC1109720ez4
    public final void T5(C1109600eys c1109600eys, List list) {
        long jLIZIZ;
        DataChannel dataChannel;
        InterfaceC1116290f9f interfaceC1116290f9f;
        C1109770ez9 c1109770ez9;
        C1109400eyY c1109400eyY = (C1109400eyY) c1109600eys;
        if ((!list.isEmpty()) && Intrinsics.LJFF(ListProtector.get(list, 0), 2) && ((C1116210f9X) c1109400eyY.LIZ.LJIL).LLJIJIL == EnumC1116160f9S.DISPLAYING) {
            if (i6().getVisibility() == 0) {
                X5().LIZJ().LJIIZILJ();
                C786410Ut5.LLJZ(i6(), 8);
            }
            C994850bzn c994850bzn = this.LLJLLL;
            int visibility = c994850bzn.getVisibility();
            c994850bzn.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c994850bzn);
            C994850bzn c994850bzn2 = this.LLJLLL;
            C1116210f9X c1116210f9X = (C1116210f9X) c1109400eyY.LIZ.LJIL;
            c994850bzn2.LIZ(c1116210f9X.LLILZLL, c1116210f9X.LLJ);
            return;
        }
        show();
        if (((C1116210f9X) c1109400eyY.LIZ.LJIL).LLILZLL == 20) {
            this.LLJLIL.setGear(EnumC1088820eRM.HIGH);
        } else {
            this.LLJLIL.setGear(EnumC1088820eRM.LOW);
        }
        C1668220tVs c1668220tVs = this.LLJLIL;
        int i = this.LLILZLL;
        if (i != -1) {
            jLIZIZ = C1685850tyJ.LIZIZ(i);
        } else {
            jLIZIZ = C1685850tyJ.LIZIZ(1291845632);
        }
        c1668220tVs.m64setBackgroundColor8_81llA(jLIZIZ);
        List<BadgeStruct> listLLJLIL = c1109400eyY.LIZ.LLJLIL();
        BadgeStruct badgeStruct = null;
        if (listLLJLIL != null) {
            Iterator<BadgeStruct> it2 = listLLJLIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BadgeStruct next = it2.next();
                BadgeStruct badgeStruct2 = next;
                if (badgeStruct2 != null && badgeStruct2.badgeScene == 10) {
                    badgeStruct = next;
                    break;
                }
            }
            badgeStruct = badgeStruct;
        }
        User user = c1109400eyY.LIZ.getUser();
        if (badgeStruct != null && user != null && ((((int) badgeStruct.greyedByClient) & 8) != 8 || ((c1109770ez9 = this.LL) != null && (c1109770ez9.LJI || user.getId() == c1109770ez9.LJ())))) {
            C786410Ut5.LLJZ(this.LLJZ, 0);
            this.LLJZ.LJ(false, C1697810uHb.LJIILJJIL(badgeStruct), c1109400eyY.LIZ.getUser(), 1, new AwS561S0100000_17(this, 341), null, true);
        } else {
            C786410Ut5.LLJZ(this.LLJZ, 8);
        }
        if (((C1116210f9X) c1109400eyY.LIZ.LJIL).LLJIJIL == EnumC1116160f9S.BLANK) {
            this.LLJJLIIIJLLLLLLLZ = false;
            C786410Ut5.LJLZ(0, this.LLJLL);
            C786410Ut5.LJLZ(8, this.LLJLILLLLZIIL);
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C786410Ut5.LJLZ(8, this.LLJLL);
        C786410Ut5.LJLZ(0, this.LLJLILLLLZIIL);
        super.T5(c1109400eyY, list);
        if (((C1116210f9X) c1109400eyY.LIZ.LJIL).LLJIJIL == EnumC1116160f9S.SELF_WAITING) {
            C994850bzn c994850bzn3 = this.LLJLLL;
            int visibility2 = c994850bzn3.getVisibility();
            c994850bzn3.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c994850bzn3);
            C786410Ut5.LLJZ(i6(), 0);
            i6().setBadges(C1697810uHb.LJIILJJIL(X5()));
            X5().LJIIIZ();
        } else {
            C994850bzn c994850bzn4 = this.LLJLLL;
            int visibility3 = c994850bzn4.getVisibility();
            c994850bzn4.setVisibility(0);
            C1602160rnK.LIZIZ(visibility3, 0, c994850bzn4);
            C994850bzn c994850bzn5 = this.LLJLLL;
            C1116210f9X c1116210f9X2 = (C1116210f9X) c1109400eyY.LIZ.LJIL;
            c994850bzn5.LIZ(c1116210f9X2.LLILZLL, c1116210f9X2.LLJ);
        }
        C1109770ez9 c1109770ez92 = this.LL;
        if (c1109770ez92 == null || (dataChannel = c1109770ez92.LJIIIZ) == null || (interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel.gg0(C1110110ezh.class)) == null) {
            return;
        }
        if ((interfaceC1116290f9f.LIZIZ() == 1 || interfaceC1116290f9f.LIZIZ() == 2) && !LiveStarCommentDeleteForbidRegionalSetting.INSTANCE.getValue()) {
            C786410Ut5.LJLLLLLL(0, this.LLJLLIL);
            C786410Ut5.I7(new ACListenerS120S0200000_17(c1109400eyY, this, 23), this.LLJLLIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLJLLIL);
        }
    }

    @Override // X.AbstractC1109880ezK
    public final void w6(String str, String str2, String str3) {
        super.w6("star_comment", "star_comment", str3);
    }
}
