package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS87S0210000_2;

/* JADX INFO: renamed from: X.0MWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569950MWz extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLIZ;
    public final /* synthetic */ C05P0<String> LLIZLLLIL;
    public final /* synthetic */ C05P0<Boolean> LLJ;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> LLJI;

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        int iLIZLLL;
        boolean z;
        boolean z2;
        boolean z3;
        int size;
        boolean z4;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) interfaceC1680500tpg2.LJJIL(C20055113dV.LJII);
            Context context = (Context) interfaceC1680500tpg2.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            C1690080u58 c1690080u58LIZ = C1690130u5D.LIZ(0, 0, interfaceC1680500tpg2, 0, 3);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(0);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(0);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (objLJJ3 == c1680520tpi) {
                if (C0LJ5.LIZIZ() && C0LJ5.LIZ().enableEarlyGridRender) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objLJJ3 = Boolean.valueOf(z4);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            boolean zBooleanValue = ((Boolean) objLJJ3).booleanValue();
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            if (objLJJ4 == c1680520tpi) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.heightPixels - ((int) (88 * displayMetrics.density));
                if (i < 0) {
                    i = 0;
                }
                objLJJ4 = new C1668650tWZ(interfaceC1690500u5o.LJJI(i));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            float f = ((C1668650tWZ) objLJJ4).LL;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ5 = interfaceC1680500tpg2.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = Long.valueOf(SystemClock.elapsedRealtime());
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
            }
            long jLongValue = ((Number) objLJJ5).longValue();
            interfaceC1680500tpg2.LJ();
            Unit unit = Unit.LIZ;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            Object objLJJ6 = interfaceC1680500tpg2.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = new C01N4(zBooleanValue, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(unit, (Function2) objLJJ6, interfaceC1680500tpg2);
            if (zBooleanValue) {
                interfaceC1680500tpg2.LJJIIJZLJL(1190928791);
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ7 = interfaceC1680500tpg2.LJJ();
                if (objLJJ7 == c1680520tpi) {
                    objLJJ7 = C20028913Yh.LJ(new AwS403S0200000_2(c05p0, (C05P0<Integer>) c05p02, (C05P0<Integer>) 31));
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ7);
                }
                interfaceC1680500tpg2.LJ();
                iLIZLLL = ((Number) ((C05P1) objLJJ7).getValue()).intValue();
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(1191191578);
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ8 = interfaceC1680500tpg2.LJJ();
                if (objLJJ8 == c1680520tpi) {
                    objLJJ8 = C1696870uG5.LIZ(0);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ8);
                }
                InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ8;
                interfaceC1680500tpg2.LJ();
                Integer numValueOf = Integer.valueOf(((Number) c05p02.getValue()).intValue());
                Integer numValueOf2 = Integer.valueOf(((Number) c05p0.getValue()).intValue());
                interfaceC1680500tpg2.LJJIIJZLJL(-1746271574);
                Object objLJJ9 = interfaceC1680500tpg2.LJJ();
                if (objLJJ9 == c1680520tpi) {
                    objLJJ9 = new C05VW(c05p02, c05p0, interfaceC1676320tiw, null);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ9);
                }
                interfaceC1680500tpg2.LJ();
                C1680540tpk.LJ(numValueOf, numValueOf2, (Function2) objLJJ9, interfaceC1680500tpg2);
                iLIZLLL = interfaceC1676320tiw.LIZLLL();
                interfaceC1680500tpg2.LJ();
            }
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ10 = interfaceC1680500tpg2.LJJ();
            Object obj = objLJJ10;
            if (objLJJ10 == c1680520tpi) {
                boolean[] zArr = {false};
                interfaceC1680500tpg2.LJJIJIIJI(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            interfaceC1680500tpg2.LJ();
            if (iLIZLLL > 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJIJI = interfaceC1680500tpg2.LJIJI(iLIZLLL) | interfaceC1680500tpg2.LJII(zArr2);
            Object objLJJ11 = interfaceC1680500tpg2.LJJ();
            if (zLJIJI || objLJJ11 == c1680520tpi) {
                objLJJ11 = new C323901Nl(iLIZLLL, zArr2, zBooleanValue, jLongValue, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ11);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ11, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ12 = interfaceC1680500tpg2.LJJ();
            if (objLJJ12 == c1680520tpi) {
                objLJJ12 = new LinkedHashSet();
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ12);
            }
            Set set = (Set) objLJJ12;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            SocialMediaPickerViewModel socialMediaPickerViewModel = this.LL;
            Object objLJJ13 = interfaceC1680500tpg2.LJJ();
            if (objLJJ13 == c1680520tpi) {
                List<C0LJE> listAQ2 = socialMediaPickerViewModel.AQ2();
                if (listAQ2 != null) {
                    size = listAQ2.size();
                } else {
                    size = 1;
                }
                objLJJ13 = C1696870uG5.LIZ(size);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ13);
            }
            InterfaceC1676320tiw interfaceC1676320tiw2 = (InterfaceC1676320tiw) objLJJ13;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            Object objLJJ14 = interfaceC1680500tpg2.LJJ();
            if (objLJJ14 == c1680520tpi) {
                objLJJ14 = new AwS552S0100000_8(interfaceC1676320tiw2, 364);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ14);
            }
            interfaceC1680500tpg2.LJ();
            C1386605bk c1386605bkLIZIZ = C1690670u65.LIZIZ(0, (Function0) objLJJ14, interfaceC1680500tpg2, 390);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ15 = interfaceC1680500tpg2.LJJ();
            if (objLJJ15 == c1680520tpi) {
                objLJJ15 = new C13EY();
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ15);
            }
            C13EY c13ey = (C13EY) objLJJ15;
            interfaceC1680500tpg2.LJ();
            Integer numValueOf3 = Integer.valueOf(interfaceC1676320tiw2.LIZLLL());
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            Object objLJJ16 = interfaceC1680500tpg2.LJJ();
            if (objLJJ16 == c1680520tpi) {
                objLJJ16 = new C05VN(c13ey, interfaceC1676320tiw2, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ16);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(numValueOf3, (Function2) objLJJ16, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ17 = interfaceC1680500tpg2.LJJ();
            if (objLJJ17 == c1680520tpi) {
                objLJJ17 = C1696870uG5.LIZ(0);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ17);
            }
            InterfaceC1676320tiw interfaceC1676320tiw3 = (InterfaceC1676320tiw) objLJJ17;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ18 = interfaceC1680500tpg2.LJJ();
            if (objLJJ18 == c1680520tpi) {
                objLJJ18 = C20028913Yh.LJ(new AwS403S0200000_2(c13ey, (C13EY<Integer, C1690050u55>) interfaceC1676320tiw3, (InterfaceC1676320tiw) 30));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ18);
            }
            C05P1 c05p1 = (C05P1) objLJJ18;
            interfaceC1680500tpg2.LJ();
            String str = this.LL.zQ2().LIZ.LIZ;
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            Object objLJJ19 = interfaceC1680500tpg2.LJJ();
            if (objLJJ19 == c1680520tpi) {
                objLJJ19 = new C05VO(c13ey, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ19);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(str, (Function2) objLJJ19, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ = interfaceC1680500tpg2.LJJIIJ(c1386605bkLIZIZ) | interfaceC1680500tpg2.LJII(this.LL);
            SocialMediaPickerViewModel socialMediaPickerViewModel2 = this.LL;
            Object objLJJ20 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ || objLJJ20 == c1680520tpi) {
                objLJJ20 = new C05VP(c1386605bkLIZIZ, socialMediaPickerViewModel2, interfaceC1676320tiw3, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ20);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(c1386605bkLIZIZ, (Function2) objLJJ20, interfaceC1680500tpg2);
            Object value = ((C13FE) this.LL.LLJL).getValue();
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg2.LJII(this.LL) | interfaceC1680500tpg2.LJJIIJ(c1386605bkLIZIZ);
            SocialMediaPickerViewModel socialMediaPickerViewModel3 = this.LL;
            Object objLJJ21 = interfaceC1680500tpg2.LJJ();
            if (zLJII || objLJJ21 == c1680520tpi) {
                objLJJ21 = new C05VQ(socialMediaPickerViewModel3, c1386605bkLIZIZ, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ21);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(value, (Function2) objLJJ21, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ22 = interfaceC1680500tpg2.LJJ();
            if (objLJJ22 == c1680520tpi) {
                objLJJ22 = C20028913Yh.LJ(new AwS546S0100000_2(c1690080u58LIZ, 804));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ22);
            }
            C05P1 c05p12 = (C05P1) objLJJ22;
            interfaceC1680500tpg2.LJ();
            if (C0LJ5.LIZIZ() && C0LJ5.LIZ().enableFirstFrameScrollUnlock) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJIIZILJ = interfaceC1680500tpg2.LJIIZILJ(z2);
            Object objLJJ23 = interfaceC1680500tpg2.LJJ();
            if (zLJIIZILJ || objLJJ23 == c1680520tpi) {
                objLJJ23 = C20028913Yh.LJ(new AwS87S0210000_2(z2, (boolean) c1690080u58LIZ, (C1690080u58) c05p12, (C05P1<Integer>) 5));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ23);
            }
            C05P1 c05p13 = (C05P1) objLJJ23;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            SocialMediaPickerViewModel socialMediaPickerViewModel4 = this.LL;
            Object objLJJ24 = interfaceC1680500tpg2.LJJ();
            if (objLJJ24 == c1680520tpi) {
                objLJJ24 = C20028913Yh.LJ(new AwS409S0200000_8(socialMediaPickerViewModel4, c1690080u58LIZ, 63));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ24);
            }
            C05P1 c05p14 = (C05P1) objLJJ24;
            interfaceC1680500tpg2.LJ();
            boolean z5 = true;
            if (1 == C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_sticky_nested_scroll_handoff", true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            List<C0LJE> listAQ22 = this.LL.AQ2();
            if (listAQ22 == null || listAQ22.size() <= 1) {
                z5 = false;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(this.LLILLJJLI);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            Object objLJJ25 = interfaceC1680500tpg2.LJJ();
            if (objLJJ25 == c1680520tpi) {
                objLJJ25 = new AwS581S0100000_2(c05p0, (C05P0<InterfaceC1692950u9l>) 302);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ25);
            }
            interfaceC1680500tpg2.LJ();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LIZLLL, (Function1) objLJJ25);
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ2 = interfaceC1680500tpg2.LJJIIJ(this.LLILLJJLI) | interfaceC1680500tpg2.LJII(this.LL) | interfaceC1680500tpg2.LJIIZILJ(this.LLILLL) | interfaceC1680500tpg2.LJIJ(this.LLILZ) | interfaceC1680500tpg2.LJIJI(iLIZLLL) | interfaceC1680500tpg2.LJII(set) | interfaceC1680500tpg2.LJJIIJ(interfaceC1690500u5o) | interfaceC1680500tpg2.LJIIZILJ(z3) | interfaceC1680500tpg2.LJJIIJ(c1690080u58LIZ) | interfaceC1680500tpg2.LJIJ(this.LLILZIL) | interfaceC1680500tpg2.LJIJ(this.LLILZLL) | interfaceC1680500tpg2.LJJIIJ(this.LLIZ) | interfaceC1680500tpg2.LJIIZILJ(z5) | interfaceC1680500tpg2.LJJIIJ(c1386605bkLIZIZ) | interfaceC1680500tpg2.LJJIIJ(c05p13);
            SocialMediaPickerViewModel socialMediaPickerViewModel5 = this.LL;
            boolean z6 = this.LLILLL;
            C05P0<String> c05p03 = this.LLIZLLLIL;
            C05P0<Boolean> c05p04 = this.LLJ;
            InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> interfaceC1631620sYq = this.LLJI;
            InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLJJLI;
            float f2 = this.LLILZ;
            float f3 = this.LLILZIL;
            float f4 = this.LLILZLL;
            Function2<C1378605aS, SocMediaResource, Unit> function2 = this.LLIZ;
            Object objLJJ26 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ2 || objLJJ26 == c1680520tpi) {
                objLJJ26 = new C0MAD(socialMediaPickerViewModel5, z6, c05p03, c05p04, interfaceC1631620sYq, interfaceC1685750ty9, f2, c05p02, z5, c1386605bkLIZIZ, c13ey, z3, iLIZLLL, zBooleanValue, set, jLongValue, interfaceC1690500u5o, c1690080u58LIZ, f3, f4, function2, f, c05p12, c05p1, c05p13);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ26);
            }
            interfaceC1680500tpg2.LJ();
            C636400Oxi.LIZ(interfaceC1685750ty9LIZ, c1690080u58LIZ, null, false, null, null, null, false, null, (Function1) objLJJ26, interfaceC1680500tpg2, 0, 508);
            if (this.LL.LL.getAiLiveSwitchStyle() == EnumC563850M9n.FLOAT_TOGGLE || (this.LL.LL.getAiLiveSwitchStyle() == EnumC563850M9n.CELL_BUTTON && !((Boolean) c05p14.getValue()).booleanValue())) {
                SocialMediaPickerViewModel socialMediaPickerViewModel6 = this.LL;
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty92 = this.LLILLJJLI;
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1672220tcK.LIZIZ(interfaceC1685750ty92, C1668040tVa.LJII), 16, 0.0f, 0.0f, 44, 6);
                interfaceC1680500tpg2.LJJIIJZLJL(5004770);
                boolean zLJII2 = interfaceC1680500tpg2.LJII(this.LL);
                SocialMediaPickerViewModel socialMediaPickerViewModel7 = this.LL;
                Object objLJJ27 = interfaceC1680500tpg2.LJJ();
                if (zLJII2 || objLJJ27 == c1680520tpi) {
                    objLJJ27 = new AwS552S0100000_8(socialMediaPickerViewModel7, 363);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ27);
                }
                interfaceC1680500tpg2.LJ();
                C1669170tXP.LIZ(socialMediaPickerViewModel6, C634380OuS.LIZJ(interfaceC1685750ty9LJIIL, false, null, (Function0) objLJJ27, 7), interfaceC1680500tpg2, 0, 0);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569950MWz(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, float f, float f2, float f3, Function2 function2, C05P0 c05p0, C05P0 c05p02, C19719212De c19719212De) {
        super(2);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = z;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
        this.LLIZ = function2;
        this.LLIZLLLIL = c05p0;
        this.LLJ = c05p02;
        this.LLJI = c19719212De;
    }
}
