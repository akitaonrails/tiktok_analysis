package X;

import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarOptActivity;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import com.ss.android.ugc.ur.socialavatar.UpdateSocialAvatarStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442840HYc {
    public final EnlargeAvatarOptActivity LIZ;
    public final User LIZIZ;
    public final C442890HYh LIZJ;
    public C1232410iAx LJII;
    public C1255030ilR LJIIIIZZ;
    public Integer LJIILJJIL;
    public Function1<? super Integer, Unit> LJIILL;
    public Function0<Unit> LJIILLIIL;
    public boolean LJIJJLI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(525));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1332));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1329));
    public final C1245180iVY LJI = new C1245180iVY();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(526));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(529));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(527));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(528));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1335));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1327));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1328));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1326));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1325));
    public final C01GW LJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1330));
    public final C01GW LJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1333));
    public final C01GW LJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1324));
    public final C01GW LJJIFFI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1331));
    public final C01GW LJJII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1320));
    public final C01GW LJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1323));
    public final C01GW LJJIIJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1334));
    public final C01GW LJJIIJZLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1321));
    public final C521490Kcl LJJIIZ = new C521490Kcl(this, 5);

    public final User LIZLLL() {
        return (User) this.LIZLLL.getValue();
    }

    public final String LJ() {
        return (String) this.LJ.getValue();
    }

    public final String LJFF() {
        return (String) this.LJIILIIL.getValue();
    }

    public final boolean LJI() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZJ() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C442840HYc.LIZJ():android.view.View");
    }

    public final boolean LJIIJ() {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (C1245160iVW.LIZJ(LIZLLL()) || !((SocialAvatarAccess) this.LJIIJJI.getValue()).LIZLLL()) {
            return false;
        }
        Integer num5 = this.LJIILJJIL;
        return (num5 != null && num5.intValue() == 0) || ((num = this.LJIILJJIL) != null && num.intValue() == 1) || (((num2 = this.LJIILJJIL) != null && num2.intValue() == 3) || (((num3 = this.LJIILJJIL) != null && num3.intValue() == 7) || ((num4 = this.LJIILJJIL) != null && num4.intValue() == -1)));
    }

    public static boolean LJII(User user) {
        ProfileBadgeStruct profileBadge;
        String url;
        if (!C268330AfP.LIZIZ() || (profileBadge = user.getProfileBadge()) == null || (url = profileBadge.getUrl()) == null || url.length() == 0 || C10EU.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(User user) {
        Integer numLIZ;
        if ((C1245160iVW.LIZJ(user) && C1245160iVW.LIZ(user)) || (!(!C442910HYj.LIZIZ) && C442910HYj.LIZJ() && (numLIZ = C442910HYj.LIZ()) != null && numLIZ.intValue() == 1)) {
            return true;
        }
        return false;
    }

    public final View LIZIZ(String str) {
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LIZ, R.layout.ed1, null);
        C1322090kVb c1322090kVb = (C1322090kVb) viewLJLLJ.findViewById(R.id.g_n);
        if (c1322090kVb != null) {
            c1322090kVb.setImageDrawable(null);
        }
        TextView textView = (TextView) viewLJLLJ.findViewById(R.id.xom);
        if (textView != null) {
            textView.setText(str);
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        return viewLJLLJ;
    }

    public final void LJIIIIZZ(int i) {
        this.LJI.LJII = new UpdateSocialAvatarStruct(Integer.valueOf(i), null, null, null, null, null, null);
        Function1<? super Integer, Unit> function1 = this.LJIILL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
        AvatarMetaInfo avatarMetaInfoLIZ = C1245170iVX.LIZ(this.LIZIZ);
        if (avatarMetaInfoLIZ != null) {
            avatarMetaInfoLIZ.setAvatarChoice(Integer.valueOf(i));
        }
        C1232410iAx c1232410iAx = this.LJII;
        if (c1232410iAx == null) {
            c1232410iAx = null;
        }
        c1232410iAx.LIZIZ(this.LJI.LIZ());
        C442860HYe.LIZ.getClass();
        if (C442860HYe.LIZ()) {
            C442910HYj.LIZLLL(i);
        }
        C0HWW c0hww = C0HWW.LIZ;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c0hww.getClass();
        C0HWW.LJJIIJZLJL("self_enlarged_profile", z, false);
    }

    public static void LJIIIZ(View view, EnumC442850HYd enumC442850HYd) {
        int iOrdinal = enumC442850HYd.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    C631450Opj.LIZ(view, Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
                    return;
                }
                throw new C1954807lC();
            }
            C631450Opj.LIZ(view, null, null, null, Float.valueOf(C418440Gaw.LIZIZ(10)), Float.valueOf(C418440Gaw.LIZIZ(10)), 7);
            return;
        }
        C631450Opj.LIZ(view, null, Float.valueOf(C418440Gaw.LIZIZ(10)), Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, 25);
    }

    public static void LJIIL(View view, boolean z) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            if (z) {
                tuxIconView.setIconRes(R.raw.icon_heart_fill);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, view.getContext());
                if (numLIZJ != null) {
                    tuxIconView.setTintColor(numLIZJ.intValue());
                    return;
                }
                return;
            }
            tuxIconView.setIconRes(R.raw.icon_heart);
            tuxIconView.setTintColorRes(R.attr.ee);
        }
    }

    public final View LIZ(int i, String str) {
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LIZ, R.layout.ed1, null);
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        tuxIconView.setIconRes(i);
        tuxIconView.setTintColorRes(R.attr.ee);
        ((TextView) viewLJLLJ.findViewById(R.id.xom)).setText(str);
        C786410Ut5.l((RemoteImageView) viewLJLLJ.findViewById(R.id.g_n), 8);
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        return viewLJLLJ;
    }

    public C442840HYc(EnlargeAvatarOptActivity enlargeAvatarOptActivity, User user, C442890HYh c442890HYh) {
        this.LIZ = enlargeAvatarOptActivity;
        this.LIZIZ = user;
        this.LIZJ = c442890HYh;
    }

    public final void LJIIJJI(LinearLayout linearLayout, String str, Function1<? super Integer, Unit> function1, Function0<Unit> function0) {
        ProfileBadgeStruct profileBadge;
        C1232410iAx c1232410iAx = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());
        c1232410iAx.LLJ = this.LIZ;
        this.LJII = c1232410iAx;
        this.LJIILL = function1;
        this.LJIILLIIL = function0;
        C786410Ut5.LJJJJJL(linearLayout);
        C631450Opj.LIZ(linearLayout, Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(14.0f))), null, null, null, null, 30);
        boolean zLJI = LJI();
        String str2 = this.LIZJ.LIZ;
        if (zLJI) {
            C0HWW c0hww = C0HWW.LIZ;
            String strLJFF = LJFF();
            String strLJ = LJ();
            c0hww.getClass();
            C0HWW.LJIIJ("show", str2, strLJFF, strLJ, true);
            if (LJIILIIL(this.LIZIZ)) {
                linearLayout.addView((View) this.LJJIFFI.getValue());
                linearLayout.addView((View) this.LJJ.getValue());
                if (LJII(this.LIZIZ)) {
                    linearLayout.addView((View) this.LJJIII.getValue());
                }
            } else {
                if (C0HZE.LIZIZ.LJIIIZ() || C1245160iVW.LIZJ(this.LIZIZ) || C437530HDr.LIZIZ(LIZLLL())) {
                    linearLayout.addView((View) this.LJJ.getValue());
                }
                if (LJII(this.LIZIZ)) {
                    linearLayout.addView((View) this.LJJIII.getValue());
                }
                linearLayout.addView((View) this.LJJI.getValue());
            }
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HE4(this, zLJI, linearLayout, null), 3);
            User user = this.LIZIZ;
            if (LJII(user) && (profileBadge = user.getProfileBadge()) != null && profileBadge.getShouldShow()) {
                linearLayout.addView((View) this.LJJII.getValue());
            }
            linearLayout.addView((View) this.LJIL.getValue());
        }
        C1371590lnR c1371590lnRLJJJI = C621180OYa.LIZ.LJJJI(this.LIZIZ, this.LIZ, str, str2);
        if (c1371590lnRLJJJI == null || c1371590lnRLJJJI.LIZ.isEmpty()) {
            LJIIIZ((View) this.LJIL.getValue(), EnumC442850HYd.LLILLL);
        } else {
            if (!LJIILIIL(LIZLLL())) {
                LJIIIZ((View) this.LJJIIJ.getValue(), EnumC442850HYd.LLILLJJLI);
            }
            linearLayout.addView((View) this.LJJIIJ.getValue());
            C786410Ut5.I7(new ACListenerS110S0200000_6(this, c1371590lnRLJJJI, 40), (View) this.LJJIIJ.getValue());
        }
        if (zLJI && LJIILIIL(this.LIZIZ)) {
            linearLayout.addView((View) this.LJJIIJZLJL.getValue());
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LJIIIZ.getValue(), null, null, new C0HED(this, null), 3);
    }
}
