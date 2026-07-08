package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671510tbB extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1672050tc3 LL;
    public final /* synthetic */ Function0 LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ Function0 LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C05P1 LLIZ;
    public final /* synthetic */ C05P0 LLIZLLLIL;
    public final /* synthetic */ C05P0 LLJ;
    public final /* synthetic */ C05P1 LLJI;
    public final /* synthetic */ C05P0 LLJIJIL;
    public final /* synthetic */ C05P0 LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671510tbB(C1672050tc3 c1672050tc3, int i, Function0 function0, SocialMediaPickerViewModel socialMediaPickerViewModel, Function0 function02, float f, boolean z, C05P1 c05p1, C05P0 c05p0, C05P0 c05p02, C05P1 c05p12, C05P0 c05p03, C05P0 c05p04) {
        super(2);
        this.LL = c1672050tc3;
        this.LLILLJJLI = function0;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = function02;
        this.LLILZIL = f;
        this.LLILZLL = z;
        this.LLIZ = c05p1;
        this.LLIZLLLIL = c05p0;
        this.LLJ = c05p02;
        this.LLJI = c05p12;
        this.LLJIJIL = c05p03;
        this.LLJILJIL = c05p04;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        int i;
        String strLIZIZ;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if (((num.intValue() & 11) ^ 2) == 0 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            this.LL.getClass();
            this.LL.LIZLLL();
            C1672050tc3 c1672050tc3 = this.LL;
            interfaceC1680500tpg2.LJJIIJZLJL(1665933873);
            C1671530tbD c1671530tbDLIZJ = c1672050tc3.LIZJ();
            C2267581DpE c2267581DpELIZ = c1671530tbDLIZJ.LIZ();
            C2267581DpE c2267581DpELIZIZ = c1671530tbDLIZJ.LIZIZ();
            C2267581DpE c2267581DpELIZJ = c1671530tbDLIZJ.LIZJ();
            c1671530tbDLIZJ.LIZ.LIZIZ();
            SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = this.LLILLL.LL.getTitleAreaUIConfig();
            if (titleAreaUIConfig != null && !titleAreaUIConfig.getHasSelector()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                interfaceC1680500tpg2.LJJIIJZLJL(1665950054);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg2.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS283S0000000_35.get$arr$(94);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg2.LJ();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1672050tc3.LIZ(c1685760tyA, c2267581DpELIZ, (Function1) objLJJ);
                SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig2 = this.LLILLL.LL.getTitleAreaUIConfig();
                if (titleAreaUIConfig2 != null) {
                    strLIZIZ = titleAreaUIConfig2.getTitle();
                } else {
                    strLIZIZ = null;
                }
                interfaceC1680500tpg2.LJJIIJZLJL(-223345997);
                if (strLIZIZ == null) {
                    strLIZIZ = C0MBB.LIZIZ(2131847917, interfaceC1680500tpg2);
                }
                interfaceC1680500tpg2.LJ();
                C1669310tXd.LIZJ(interfaceC1685750ty9LIZ, strLIZIZ, this.LLILZ, this.LLILLL, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(1666434212);
                SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLL;
                C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ2 = interfaceC1680500tpg2.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ2 == C1680510tph.LIZIZ) {
                    objLJJ2 = AFwS283S0000000_35.get$arr$(95);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
                }
                interfaceC1680500tpg2.LJ();
                C1669310tXd.LIZ(socialMediaPickerViewModel, C1672050tc3.LIZ(c1685760tyA2, c2267581DpELIZ, (Function1) objLJJ2), this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            }
            C1685760tyA c1685760tyA3 = InterfaceC1685750ty9.LIZ;
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = AFwS283S0000000_35.get$arr$(96);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            interfaceC1680500tpg2.LJ();
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(C1672050tc3.LIZ(c1685760tyA3, c2267581DpELIZIZ, (Function1) objLJJ3), 1.0f), 0.0f, 48, 0.0f, 0.0f, 13);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg2);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg2.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg2, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg2.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg2.LJJIII();
                if (interfaceC1680500tpg2.LJJIIZ()) {
                    interfaceC1680500tpg2.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg2.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg2, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg2.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg2.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg2.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg2.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg2, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                SocialMediaPickerViewModel socialMediaPickerViewModel2 = this.LLILLL;
                float f = ((C1668650tWZ) this.LLIZ.getValue()).LL;
                interfaceC1680500tpg2.LJJIIJZLJL(-1746271574);
                boolean zLJII = interfaceC1680500tpg2.LJII(this.LLILLL);
                Object objLJJ4 = interfaceC1680500tpg2.LJJ();
                if (zLJII || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS286S0300000_8(this.LLILLL, (SocialMediaPickerViewModel) this.LLIZLLLIL, (C05P0<C0ZDN>) this.LLJ, (C05P0<SocMediaResource>) 2);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
                }
                interfaceC1680500tpg2.LJ();
                C569920MWw.LIZ(socialMediaPickerViewModel2, null, f, (Function2) objLJJ4, interfaceC1680500tpg2, 0, 2);
                interfaceC1680500tpg2.LJIIIZ();
                interfaceC1680500tpg2.LJJIIJZLJL(-223291987);
                if (((Boolean) this.LLJI.getValue()).booleanValue()) {
                    EnumC563950M9x pageUIStyle = this.LLILLL.LL.getPageUIConfig().getPageUIStyle();
                    if (pageUIStyle == EnumC563950M9x.STORY_STYLE) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                        Object objLJJ5 = interfaceC1680500tpg2.LJJ();
                        if (objLJJ5 == c1680520tpi) {
                            objLJJ5 = AFwS283S0000000_35.get$arr$(97);
                            interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
                        }
                        interfaceC1680500tpg2.LJ();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1672050tc3.LIZ(c1685760tyA3, c2267581DpELIZJ, (Function1) objLJJ5);
                        interfaceC1680500tpg2.LJJIIJZLJL(5004770);
                        Object objLJJ6 = interfaceC1680500tpg2.LJJ();
                        if (objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS581S0100000_2(this.LLJIJIL, (C05P0<InterfaceC1692950u9l>) 299);
                            interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
                        }
                        interfaceC1680500tpg2.LJ();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = C1685330txT.LIZ(interfaceC1685750ty9LIZ2, (Function1) objLJJ6);
                        SocialMediaPickerViewModel socialMediaPickerViewModel3 = this.LLILLL;
                        int i2 = socialMediaPickerViewModel3.xQ2().LIZIZ;
                        interfaceC1680500tpg2.LJJIIJZLJL(5004770);
                        boolean zLJII2 = interfaceC1680500tpg2.LJII(this.LLILLL);
                        Object objLJJ7 = interfaceC1680500tpg2.LJJ();
                        if (zLJII2 || objLJJ7 == c1680520tpi) {
                            objLJJ7 = new AwS587S0100000_8(this.LLILLL, 280);
                            interfaceC1680500tpg2.LJJIJIIJI(objLJJ7);
                        }
                        Function1 function1 = (Function1) objLJJ7;
                        interfaceC1680500tpg2.LJ();
                        interfaceC1680500tpg2.LJJIIJZLJL(5004770);
                        Object objLJJ8 = interfaceC1680500tpg2.LJJ();
                        if (objLJJ8 == c1680520tpi) {
                            objLJJ8 = new AwS581S0100000_2(this.LLJILJIL, (C05P0<InterfaceC1692950u9l>) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                            interfaceC1680500tpg2.LJJIJIIJI(objLJJ8);
                        }
                        interfaceC1680500tpg2.LJ();
                        i = 5004770;
                        C1669570tY3.LIZJ(interfaceC1685750ty9LIZ3, socialMediaPickerViewModel3, false, i2, null, null, function1, (Function1) objLJJ8, interfaceC1680500tpg2, 12582912, 52);
                    } else {
                        i = 5004770;
                        if (pageUIStyle != EnumC563950M9x.GENERAL_STYLE) {
                            throw new C1954807lC();
                        }
                    }
                } else {
                    i = 5004770;
                }
                interfaceC1680500tpg2.LJ();
                interfaceC1680500tpg2.LJJIIJZLJL(-223250843);
                if (this.LLILLL.CQ2() && this.LLILZLL) {
                    C1683130ttv c1683130ttv = (C1683130ttv) ((C13FE) this.LLILLL.LLJILJILJ).getValue();
                    if (c1683130ttv == null || !Intrinsics.LJFF(this.LLJILJIL.getValue(), C1683130ttv.LJ)) {
                        c1683130ttv = (C1683130ttv) this.LLJILJIL.getValue();
                    }
                    SocialMediaPickerViewModel socialMediaPickerViewModel4 = this.LLILLL;
                    int i3 = socialMediaPickerViewModel4.xQ2().LIZIZ;
                    interfaceC1680500tpg2.LJJIIJZLJL(i);
                    boolean zLJII3 = interfaceC1680500tpg2.LJII(this.LLILLL);
                    Object objLJJ9 = interfaceC1680500tpg2.LJJ();
                    if (zLJII3 || objLJJ9 == c1680520tpi) {
                        objLJJ9 = new AwS581S0100000_2(this.LLILLL, 301);
                        interfaceC1680500tpg2.LJJIJIIJI(objLJJ9);
                    }
                    interfaceC1680500tpg2.LJ();
                    C1671460tb6.LIZIZ(socialMediaPickerViewModel4, i3, c1683130ttv, (Function1) objLJJ9, interfaceC1680500tpg2, 0);
                }
                interfaceC1680500tpg2.LJ();
                SocMediaResource socMediaResource = (SocMediaResource) this.LLJ.getValue();
                interfaceC1680500tpg2.LJJIIJZLJL(-223233373);
                if (socMediaResource != null) {
                    FillElement fillElement = c.LIZJ;
                    SocialMediaPickerViewModel socialMediaPickerViewModel5 = this.LLILLL;
                    interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
                    boolean zLJII4 = interfaceC1680500tpg2.LJII(this.LLILLL);
                    Object objLJJ10 = interfaceC1680500tpg2.LJJ();
                    if (zLJII4 || objLJJ10 == c1680520tpi) {
                        objLJJ10 = new AwS409S0200000_8(this.LLILLL, (SocialMediaPickerViewModel) this.LLJ, (C05P0<Boolean>) 66);
                        interfaceC1680500tpg2.LJJIJIIJI(objLJJ10);
                    }
                    interfaceC1680500tpg2.LJ();
                    C1669300tXc.LIZ(fillElement, socialMediaPickerViewModel5, socMediaResource, (Function0) objLJJ10, interfaceC1680500tpg2, 6);
                }
                interfaceC1680500tpg2.LJ();
                interfaceC1680500tpg2.LJ();
                this.LL.getClass();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
