package X;

import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS99S0110000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718790SHl implements InterfaceC718870SHt {
    public final Context LL;
    public final VideoDescAssem LLILLJJLI;
    public final VideoDescVM LLILLL;
    public C21415018rM LLILZ;
    public Layout LLILZIL;
    public Layout LLILZLL;
    public Layout LLIZ;
    public Layout LLIZLLLIL;
    public Layout LLJ;
    public Aweme LLJI;
    public int LLJIJIL;
    public Integer LLJILJIL;
    public Integer LLJILJILJ;
    public final int LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C630740Ooa LLJJIJIIJIL;
    public final C630740Ooa LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public C718810SHn LLJJJJ;
    public TuxIconDrawable LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.InterfaceC718870SHt
    public final void LJJIIJ() {
    }

    public final int LIZLLL() {
        Integer num = this.LLJILJILJ;
        return num != null ? num.intValue() : LJFF() ? R.attr.a1k : R.attr.zl;
    }

    public final boolean LJFF() {
        return ((Boolean) this.LLJJJIL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJ() {
        return Intrinsics.LJFF(this.LLILZIL, this.LLILZLL) || Intrinsics.LJFF(this.LLILZIL, this.LLIZLLLIL);
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJI() {
        Aweme aweme = this.LLJI;
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        return ((Boolean) C277150Atd.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJJLI() {
        C21415018rM c21415018rM = this.LLILZ;
        return c21415018rM != null && c21415018rM.getVisibility() == 0;
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJJIJIIJI() {
        C21415018rM c21415018rM;
        Aweme aweme = this.LLJI;
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || (c21415018rM = this.LLILZ) == null || c21415018rM.getVisibility() != 0) {
            return false;
        }
        Layout textLayout = c21415018rM.getTextLayout();
        return C0SI6.LIZIZ(textLayout) || C0SI6.LIZ(textLayout) || C0SI6.LIZJ(textLayout, LJ().getText());
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIJLIJ() {
        C21415018rM c21415018rM = this.LLILZ;
        if (c21415018rM != null) {
            C786410Ut5.LJLLLLLL(8, c21415018rM);
        }
    }

    public final C719020SIi LJ() {
        return LJFF() ? new C719040SIk(this.LL) : new C719020SIi(this.LL);
    }

    @Override // X.InterfaceC718870SHt
    public final int LIZIZ() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJIIZILJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJIJJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJI() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJIJIIJIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJIJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC718870SHt
    public final C21415018rM getTitleView() {
        return this.LLILZ;
    }

    public final boolean LJI(Aweme aweme) {
        PlayListInfo playListInfo;
        BaseFeedPageParams baseFeedPageParams;
        if (aweme == null) {
            return false;
        }
        PlayListInfo playListInfo2 = aweme.playlist_info;
        Fragment fragment = null;
        if (playListInfo2 == null || playListInfo2.getMixId() == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getIndex() == null) {
            return false;
        }
        C0S4N c0s4n = C0S4N.LIZ;
        VideoItemParams item = this.LLILLL.getItem();
        if (item != null) {
            baseFeedPageParams = item.baseFeedPageParams;
        } else {
            baseFeedPageParams = null;
        }
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        VideoItemParams item2 = this.LLILLL.getItem();
        if (item2 != null) {
            fragment = item2.fragment;
        }
        boolean zPu = c1599640rjG.Pu(fragment);
        c0s4n.getClass();
        if (!C0S4N.LIZ(aweme, baseFeedPageParams, zPu)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJIILL(int i) {
        this.LLJIJIL = i;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJIILLIIL(Layout layout) {
        this.LLILZLL = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJ(Layout layout) {
        this.LLIZLLLIL = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIFFI(Layout layout) {
        this.LLJ = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIIZ(View view) {
        C21415018rM c21415018rM = (C21415018rM) view.findViewById(R.id.fo_).findViewById(R.id.title);
        this.LLILZ = c21415018rM;
        if (c21415018rM != null) {
            c21415018rM.setTextAlignment(5);
        }
        C21415018rM c21415018rM2 = this.LLILZ;
        if (c21415018rM2 != null) {
            c21415018rM2.setLayoutDirection(0);
        }
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIIZI(Layout layout) {
        this.LLILZIL = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIJ(Layout layout) {
        this.LLIZ = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LLILLL(Aweme aweme) {
        this.LLJI = aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    @Override // X.InterfaceC718870SHt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LJJII(com.ss.android.ugc.aweme.feed.model.Aweme r22, X.C0S64 r23) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718790SHl.LJJII(com.ss.android.ugc.aweme.feed.model.Aweme, X.0S64):kotlin.Pair");
    }

    public C718790SHl(Context context, VideoDescAssem videoDescAssem, VideoDescVM videoDescVM) {
        int iIntValue;
        this.LL = context;
        this.LLILLJJLI = videoDescAssem;
        this.LLILLL = videoDescVM;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJIJIL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, context);
        this.LLJILJIL = Integer.valueOf(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        this.LLJILJILJ = Integer.valueOf(R.attr.av3);
        this.LLJILLL = 2;
        this.LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1469));
        this.LLJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1465));
        this.LLJJIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1470));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1468));
        this.LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1473));
        this.LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1472));
        this.LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1467));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1466));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1471));
    }

    @Override // X.InterfaceC718870SHt
    public final void LJIL(int i, int i2, Integer num) {
        this.LLJIJIL = i;
        this.LLJILJIL = Integer.valueOf(i2);
        this.LLJILJILJ = num;
        int iLIZLLL = LIZLLL();
        Integer num2 = ((C419910GdJ) this.LLJJJJLIIL.getValue()).LJ;
        if (num2 == null || iLIZLLL != num2.intValue()) {
            ((C419910GdJ) this.LLJJJJLIIL.getValue()).LJ = Integer.valueOf(iLIZLLL);
            this.LLJJJJJIL = ((C419910GdJ) this.LLJJJJLIIL.getValue()).LIZ(this.LL);
        }
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJJIIJZLJL(Aweme aweme, PostModeEntranceMechanism postModeEntranceMechanism, Boolean bool, String str) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNavigateToPostModeDetail: ");
        Aweme aweme2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", expand: ");
        sbLIZ.append(bool);
        sbLIZ.append(", hideMethod: ");
        sbLIZ.append(str);
        sbLIZ.append(", mech: ");
        sbLIZ.append(postModeEntranceMechanism);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LJFF() && !LJFF()) {
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            VideoItemParams item = this.LLILLL.getItem();
            if (item != null) {
                aweme2 = item.getAweme();
            }
            if (c1ee2.LJJLIIIJJIZ(aweme2) && !this.LLILLL.yQ2(aweme)) {
                if (bool == null || bool.booleanValue()) {
                    VideoDescVM videoDescVM = this.LLILLL;
                    videoDescVM.getClass();
                    videoDescVM.setState(new AwS377S0200000_11(aweme, postModeEntranceMechanism, 90));
                }
                if (postModeEntranceMechanism == PostModeEntranceMechanism.SEE_MORE_BTN && str != null) {
                    IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) this.LLJJ.getValue();
                    this.LLILLL.LLJ = str;
                    C20684815ws.LJFF().execute(new ARunnableS80S0200000_11(this, iPhotoModeAbility, 48));
                }
                return true;
            }
        }
        return false;
    }

    public final Layout LIZ(C444830HcP c444830HcP, Layout layout, String str, boolean z, Aweme aweme, float f) {
        int i;
        String desc = aweme.getDesc();
        int iIntValue = 0;
        if ((desc == null || a0.LJJJIL(desc)) && !LJFF() && !AwemeExtKt.isAdTraffic(aweme)) {
            if ((C582980Mtk.LIZIZ(aweme) || C295600BiI.LIZIZ(aweme) || C0BUZ.LIZ(aweme)) && !LJI(aweme)) {
                C718800SHm c718800SHm = new C718800SHm(str);
                c718800SHm.LJI(this.LLJILLL);
                c718800SHm.LJI = true;
                c718800SHm.LJII = LJ();
                if (this.LLILLL.LLILLJJLI) {
                    i = 52;
                } else {
                    i = 42;
                }
                c718800SHm.LJIIIZ(i);
                c718800SHm.LIZLLL(f);
                Integer numLIZJ = C1308910kAL.LIZJ(LIZLLL(), this.LL);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                c718800SHm.LJIIIIZZ(iIntValue);
                C719090SIp c719090SIpLIZJ = C718950SIb.LIZJ(null, null, new AwS377S0200000_11(this, c718800SHm, 115), new AwS377S0200000_11(c718800SHm, c444830HcP, 116), new AwS99S0110000_11(z, this, 4), C295600BiI.LIZIZ(this.LLJI), C0BUZ.LIZ(this.LLJI));
                this.LLILLL.OQ2(c719090SIpLIZJ.LIZ, c719090SIpLIZJ.LIZIZ, c718800SHm, z);
                Layout layout2 = c719090SIpLIZJ.LIZIZ;
                if (layout2 == null) {
                    return c719090SIpLIZJ.LIZ;
                }
                return layout2;
            }
            return layout;
        }
        return layout;
    }

    public final Layout LIZJ(C444830HcP c444830HcP, Layout layout, String str, boolean z, Aweme aweme, Boolean bool, float f, C0SKK c0skk, boolean z2, final String str2, final String str3, final String str4) {
        String desc;
        int i;
        C718810SHn c718810SHn = this.LLJJJJ;
        if (c718810SHn == null) {
            C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
            Aweme aweme2 = this.LLJI;
            boolean zLJFF = LJFF();
            c299210Bo7.getClass();
            if (!C299210Bo7.LIZ(aweme2, zLJFF)) {
                c718810SHn = null;
            } else {
                c718810SHn = new C718810SHn();
                c718810SHn.LJIIIIZZ(str2, str3, str4);
                if (this.LLILLL.LLILLJJLI) {
                    i = 52;
                } else {
                    i = 42;
                }
                c718810SHn.LJIILJJIL(i);
                c718810SHn.LJIILIIL(C1308910kAL.LIZJ(LIZLLL(), this.LL));
                Integer numLIZJ = this.LLJILJIL;
                if (numLIZJ == null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.a01, new C1361400lX0(this.LL, R.style.y0));
                }
                c718810SHn.LJ = numLIZJ;
                c718810SHn.LJIL = new InterfaceC719180SIy() { // from class: X.0SI2
                    @Override // X.InterfaceC719180SIy
                    public final void LIZ(boolean z3) {
                        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PhotoDescDelegate onTranslateClick ");
                        sbLIZ.append(z3);
                        sbLIZ.append(" seeTranslationText: ");
                        sbLIZ.append(str2);
                        sbLIZ.append(" seeOriginalText: ");
                        sbLIZ.append(str4);
                        sbLIZ.append(" translatingText: ");
                        sbLIZ.append(str3);
                        C0SZC.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (z3) {
                            TranslationAbility translationAbility = (TranslationAbility) this.LLJJIJIL.getValue();
                            if (translationAbility != null) {
                                translationAbility.Ol(EnumC715590S5d.CLICK);
                                return;
                            }
                            return;
                        }
                        TranslationAbility translationAbility2 = (TranslationAbility) this.LLJJIJIL.getValue();
                        if (translationAbility2 == null) {
                            return;
                        }
                        translationAbility2.ww0(EnumC715590S5d.CLICK);
                    }
                };
                this.LLJJJJ = c718810SHn;
            }
        }
        C299210Bo7 c299210Bo72 = C299210Bo7.LIZ;
        boolean zLJFF2 = LJFF();
        c299210Bo72.getClass();
        if (C299210Bo7.LIZ(aweme, zLJFF2) && c718810SHn != null && (((desc = aweme.getDesc()) == null || a0.LJJJIL(desc)) && !Intrinsics.LJFF(bool, Boolean.TRUE))) {
            if (C0SI6.LIZIZ(layout)) {
                return LIZ(c444830HcP, layout, str, z, aweme, f);
            }
            c718810SHn.LJIJJLI = aweme;
            c718810SHn.LJIJJ = c0skk;
            c718810SHn.LIZIZ = z2;
            Layout layoutLIZ = c718810SHn.LIZ(c444830HcP, c444830HcP.LIZIZ(), this.LLJILLL, null, z2);
            TranslationControlsAbility translationControlsAbility = (TranslationControlsAbility) this.LLJJIJIIJIL.getValue();
            if (translationControlsAbility != null) {
                translationControlsAbility.gh(c718810SHn.LIZJ);
            }
            return layoutLIZ;
        }
        return LIZ(c444830HcP, layout, str, z, aweme, f);
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIII(Aweme aweme, C0S5S c0s5s, boolean z, int i, Boolean bool, int i2, float f, C0SKK c0skk, boolean z2, String str, String str2, String str3) {
        boolean z3;
        String title;
        Layout layoutLIZJ;
        String desc;
        if (aweme != null && !LJFF()) {
            C21415018rM c21415018rM = this.LLILZ;
            if (c21415018rM != null) {
                C786410Ut5.LLLLZIL(c21415018rM, 8);
                if (c0s5s != null && c0s5s.LIZIZ) {
                    z3 = true;
                    title = c0s5s.LIZ;
                } else {
                    z3 = false;
                    PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                    if (photoModeImageInfo != null) {
                        title = photoModeImageInfo.getTitle();
                    }
                    C444830HcP c444830HcP = new C444830HcP();
                    c444830HcP.LJIILIIL("");
                    c21415018rM.setTextLayout(c444830HcP.LIZIZ());
                    return;
                }
                if (title != null && title.length() != 0) {
                    String desc2 = aweme.getDesc();
                    if (desc2 != null && desc2.length() != 0) {
                        C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), c21415018rM);
                    } else {
                        C0H1U.LJII(0, c21415018rM);
                    }
                    C786410Ut5.LLLLZIL(c21415018rM, 0);
                    C444830HcP c444830HcP2 = new C444830HcP();
                    c444830HcP2.LJIILIIL(title);
                    c444830HcP2.LJIILL(i);
                    c444830HcP2.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
                    c444830HcP2.LJIILJJIL(this.LLJIJIL);
                    c444830HcP2.LJII(C1EE2.LIZIZ.LIZ());
                    c444830HcP2.LIZIZ.LJII = TextUtils.TruncateAt.END;
                    if (z) {
                        layoutLIZJ = c444830HcP2.LIZIZ();
                        if (z3) {
                            this.LLIZLLLIL = layoutLIZJ;
                        } else {
                            this.LLILZLL = layoutLIZJ;
                        }
                    } else {
                        c444830HcP2.LJIIIZ(this.LLJILLL);
                        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
                        boolean zLJFF = LJFF();
                        c299210Bo7.getClass();
                        if (C299210Bo7.LIZ(aweme, zLJFF) && (((desc = aweme.getDesc()) == null || a0.LJJJIL(desc)) && !Intrinsics.LJFF(bool, Boolean.TRUE))) {
                            c444830HcP2.LIZIZ.LJIIIIZZ = i - i2;
                        }
                        Layout layoutLIZIZ = c444830HcP2.LIZIZ();
                        if (!C0SI6.LIZIZ(layoutLIZIZ)) {
                            layoutLIZJ = LIZJ(c444830HcP2, layoutLIZIZ, title, z3, aweme, bool, f, c0skk, z2, str, str2, str3);
                        } else {
                            String desc3 = aweme.getDesc();
                            if ((desc3 == null || a0.LJJJIL(desc3)) && 1 != 0) {
                                c444830HcP2.LIZIZ.LJIIIIZZ = i - ((int) f);
                            }
                            layoutLIZJ = LIZJ(c444830HcP2, c444830HcP2.LIZIZ(), title, z3, aweme, bool, f, c0skk, z2, str, str2, str3);
                        }
                        if (z3) {
                            this.LLJ = layoutLIZJ;
                        } else {
                            this.LLIZ = layoutLIZJ;
                        }
                    }
                    if (!Intrinsics.LJFF(this.LLILZIL, layoutLIZJ)) {
                        this.LLILZIL = layoutLIZJ;
                        c21415018rM.setTextLayout(layoutLIZJ);
                        return;
                    }
                    return;
                }
                C444830HcP c444830HcP3 = new C444830HcP();
                c444830HcP3.LJIILIIL("");
                c21415018rM.setTextLayout(c444830HcP3.LIZIZ());
                return;
            }
            return;
        }
        C21415018rM c21415018rM2 = this.LLILZ;
        if (c21415018rM2 != null) {
            C339190DRl.LIZIZ(c21415018rM2);
        }
    }
}
