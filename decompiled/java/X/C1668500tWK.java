package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668500tWK extends C09AY implements InterfaceC1631620sYq<InterfaceC1668850tWt, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1350305Qf LLILLL;
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627890sSp> LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function2<int[], Boolean, Unit> LLIZLLLIL;
    public final /* synthetic */ Function2<List<Integer>, Boolean, Unit> LLJ;
    public final /* synthetic */ Function2<Integer, Float, Unit> LLJI;
    public final /* synthetic */ float LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ Function1<Integer, Unit> LLJILLL;
    public final /* synthetic */ InterfaceC1631620sYq<String, UrlModel, C1320770kTT<C1331070kk5>, Unit> LLJJ;
    public final /* synthetic */ float LLJJI;
    public final /* synthetic */ Function1<MotionEvent, Unit> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1668500tWK(C1690080u58 c1690080u58, float f, C1350305Qf c1350305Qf, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, boolean z, Function2<? super int[], ? super Boolean, Unit> function2, Function2<? super List<Integer>, ? super Boolean, Unit> function22, Function2<? super Integer, ? super Float, Unit> function23, float f2, boolean z2, boolean z3, Function1<? super Integer, Unit> function13, InterfaceC1631620sYq<? super String, ? super UrlModel, ? super C1320770kTT<C1331070kk5>, Unit> interfaceC1631620sYq, float f3, Function1<? super MotionEvent, Unit> function14) {
        super(3);
        this.LL = c1690080u58;
        this.LLILLJJLI = f;
        this.LLILLL = c1350305Qf;
        this.LLILZ = interfaceC1665500tRU;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = z;
        this.LLIZLLLIL = function2;
        this.LLJ = function22;
        this.LLJI = function23;
        this.LLJIJIL = f2;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = function13;
        this.LLJJ = interfaceC1631620sYq;
        this.LLJJI = f3;
        this.LLJJIII = function14;
    }

    public static final int LIZ(C05P1<Integer> c05p1) {
        return c05p1.getValue().intValue();
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1668850tWt interfaceC1668850tWt, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        float f;
        float f2;
        boolean z;
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt2 = interfaceC1668850tWt;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1668850tWt2)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Long.valueOf(System.currentTimeMillis()));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            interfaceC1680500tpg2.LJ();
            if (interfaceC1680500tpg2.LJJIL(C20055113dV.LJIILIIL) == EnumC1671200tag.Ltr) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            C1690080u58 c1690080u58 = this.LL;
            Object objLJJ3 = interfaceC1680500tpg2.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJ(new AwS568S0100000_24(c1690080u58, 1910));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ3);
            }
            C05P1 c05p1 = (C05P1) objLJJ3;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            C1690080u58 c1690080u582 = this.LL;
            Object objLJJ4 = interfaceC1680500tpg2.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJ(new AwS569S0100000_25(c1690080u582, 1182));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ4);
            }
            C05P1 c05p12 = (C05P1) objLJJ4;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            C1690080u58 c1690080u583 = this.LL;
            Object objLJJ5 = interfaceC1680500tpg2.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJ(new AwS564S0100000_20(c1690080u583, 56));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ5);
            }
            C05P1 c05p13 = (C05P1) objLJJ5;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ6 = interfaceC1680500tpg2.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJI(Boolean.FALSE);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ6);
            }
            final C05P0 c05p03 = (C05P0) objLJJ6;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ7 = interfaceC1680500tpg2.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = C20028913Yh.LJI(Float.valueOf(0.0f));
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ7);
            }
            final C05P0 c05p04 = (C05P0) objLJJ7;
            interfaceC1680500tpg2.LJ();
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) interfaceC1680500tpg2.LJJIL(C20055113dV.LJII);
            final float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(this.LLJIJIL);
            float fLJJJJLL2 = interfaceC1690500u5o.LJJJJLL(interfaceC1668850tWt2.LJI());
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJIJ = interfaceC1680500tpg2.LJIJ(fLJJJJLL2);
            Object objLJJ8 = interfaceC1680500tpg2.LJJ();
            if (zLJIJ || objLJJ8 == c1680520tpi) {
                float f3 = fLJJJJLL2 - fLJJJJLL;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                objLJJ8 = Float.valueOf(f3 / 2.0f);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ8);
            }
            float fFloatValue = ((Number) objLJJ8).floatValue();
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJIJ2 = interfaceC1680500tpg2.LJIJ(fFloatValue);
            Object objLJJ9 = interfaceC1680500tpg2.LJJ();
            if (zLJIJ2 || objLJJ9 == c1680520tpi) {
                objLJJ9 = C1682520tsw.LIZIZ(interfaceC1690500u5o.LLIIIJ(fFloatValue), 0.0f, 2);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ9);
            }
            InterfaceC1679150tnV interfaceC1679150tnV = (InterfaceC1679150tnV) objLJJ9;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJIJ3 = interfaceC1680500tpg2.LJIJ(fLJJJJLL2);
            Object objLJJ10 = interfaceC1680500tpg2.LJJ();
            if (zLJIJ3 || objLJJ10 == c1680520tpi) {
                objLJJ10 = Float.valueOf(fLJJJJLL2 / 2.0f);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ10);
            }
            float fFloatValue2 = ((Number) objLJJ10).floatValue();
            interfaceC1680500tpg2.LJ();
            float fLJJJJLL3 = interfaceC1690500u5o.LJJJJLL(this.LLJJI) / fLJJJJLL;
            Context context = (Context) interfaceC1680500tpg2.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            InterfaceC1686570tzT interfaceC1686570tzTLIZIZ = C1675630thp.LIZIZ(this.LL, null, interfaceC1680500tpg2, 0, 2);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJIJ4 = interfaceC1680500tpg2.LJIJ(this.LLILLJJLI);
            final float f4 = this.LLILLJJLI;
            Object objLJJ11 = interfaceC1680500tpg2.LJJ();
            if (!zLJIJ4 && objLJJ11 != c1680520tpi) {
                f2 = fLJJJJLL;
            } else {
                f2 = fLJJJJLL;
                objLJJ11 = new InterfaceC20086513iZ() { // from class: X.05Xj
                    @Override // X.InterfaceC20086513iZ
                    public final long LJJJLZIJ(int i2, long j) {
                        if (i2 == 1) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long jLongValue = jCurrentTimeMillis - c05p0.getValue().longValue();
                            if (jLongValue < 1) {
                                jLongValue = 1;
                            }
                            c05p0.setValue(Long.valueOf(jCurrentTimeMillis));
                            c05p04.setValue(Float.valueOf(Math.abs(((Float.intBitsToFloat((int) (j >> 32)) / jLongValue) / fLJJJJLL) * LSPassThroughRecordSizeConfig.DEFAULT)));
                            c05p03.setValue(Boolean.TRUE);
                            return 0L;
                        }
                        return 0L;
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final Object LLILII(long j, InterfaceC1364105Vn<? super C1395705dD> interfaceC1364105Vn) {
                        c05p03.setValue(Boolean.FALSE);
                        c05p04.setValue(Float.valueOf(0.0f));
                        return new C1395705dD(C1395705dD.LJFF(f4, j));
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final long LJJLI(int i2, long j, long j2) {
                        return 0L;
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final Object LLFII(long j, long j2, InterfaceC1364105Vn<? super C1395705dD> interfaceC1364105Vn) {
                        c05p03.setValue(Boolean.FALSE);
                        c05p04.setValue(Float.valueOf(0.0f));
                        return C1670040tYo.LIZ();
                    }
                };
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ11);
            }
            C1368905Xj c1368905Xj = (C1368905Xj) objLJJ11;
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Object objLJJ12 = interfaceC1680500tpg2.LJJ();
            if (objLJJ12 == c1680520tpi) {
                objLJJ12 = Float.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ12);
            }
            float fFloatValue3 = ((Number) objLJJ12).floatValue();
            interfaceC1680500tpg2.LJ();
            interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
            Function1<MotionEvent, Unit> function1 = this.LLJJIII;
            Object objLJJ13 = interfaceC1680500tpg2.LJJ();
            if (objLJJ13 == c1680520tpi) {
                objLJJ13 = new C21149817pg(fFloatValue3, function1);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ13);
            }
            C21149817pg c21149817pg = (C21149817pg) objLJJ13;
            interfaceC1680500tpg2.LJ();
            Boolean boolValueOf = Boolean.valueOf(this.LL.LIZIZ());
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJII = interfaceC1680500tpg2.LJII(c21149817pg) | interfaceC1680500tpg2.LJJIIJ(this.LL);
            C1690080u58 c1690080u584 = this.LL;
            Object objLJJ14 = interfaceC1680500tpg2.LJJ();
            if (zLJII || objLJJ14 == c1680520tpi) {
                objLJJ14 = new C05UG(c21149817pg, c1690080u584, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ14);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ14, interfaceC1680500tpg2);
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            boolean zLJII2 = interfaceC1680500tpg2.LJII(c21149817pg);
            Object objLJJ15 = interfaceC1680500tpg2.LJJ();
            if (zLJII2 || objLJJ15 == c1680520tpi) {
                objLJJ15 = new AwS604S0100000_25(c21149817pg, 957);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ15);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LIZIZ(c21149817pg, (Function1) objLJJ15, interfaceC1680500tpg2);
            C1350305Qf c1350305Qf = this.LLILLL;
            InterfaceC1665500tRU<InterfaceC1627890sSp> interfaceC1665500tRU = this.LLILZ;
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ = interfaceC1680500tpg2.LJJIIJ(this.LLILLL) | interfaceC1680500tpg2.LJII(this.LLILZ) | interfaceC1680500tpg2.LJJIIJ(this.LL);
            C1350305Qf c1350305Qf2 = this.LLILLL;
            InterfaceC1665500tRU<InterfaceC1627890sSp> interfaceC1665500tRU2 = this.LLILZ;
            C1690080u58 c1690080u585 = this.LL;
            Object objLJJ16 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ || objLJJ16 == c1680520tpi) {
                objLJJ16 = new C05TW(c1350305Qf2, interfaceC1665500tRU2, c1690080u585, c05p1, c05p02, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ16);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJ(c1350305Qf, interfaceC1665500tRU, (Function2) objLJJ16, interfaceC1680500tpg2);
            Integer numValueOf = Integer.valueOf(LIZ(c05p1));
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ2 = interfaceC1680500tpg2.LJJIIJ(this.LLILZIL);
            Function1<Integer, Unit> function12 = this.LLILZIL;
            Object objLJJ17 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ2 || objLJJ17 == c1680520tpi) {
                objLJJ17 = new C05P9(function12, c05p1, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ17);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(numValueOf, (Function2) objLJJ17, interfaceC1680500tpg2);
            Boolean boolValueOf2 = Boolean.valueOf(this.LL.LIZIZ());
            InterfaceC1665500tRU<InterfaceC1627890sSp> interfaceC1665500tRU3 = this.LLILZ;
            interfaceC1680500tpg2.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ3 = interfaceC1680500tpg2.LJJIIJ(this.LL) | interfaceC1680500tpg2.LJII(this.LLILZ);
            C1690080u58 c1690080u586 = this.LL;
            InterfaceC1665500tRU<InterfaceC1627890sSp> interfaceC1665500tRU4 = this.LLILZ;
            Object objLJJ18 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ3 || objLJJ18 == c1680520tpi) {
                objLJJ18 = new C05TV(c1690080u586, interfaceC1665500tRU4, c05p1, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ18);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJ(boolValueOf2, interfaceC1665500tRU3, (Function2) objLJJ18, interfaceC1680500tpg2);
            Boolean boolValueOf3 = Boolean.valueOf(this.LL.LIZIZ());
            interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ4 = interfaceC1680500tpg2.LJJIIJ(this.LL) | interfaceC1680500tpg2.LJII(this.LLILZ) | interfaceC1680500tpg2.LJJIIJ(this.LLILZLL);
            C1690080u58 c1690080u587 = this.LL;
            InterfaceC1665500tRU<InterfaceC1627890sSp> interfaceC1665500tRU5 = this.LLILZ;
            Function1<Integer, Unit> function13 = this.LLILZLL;
            Object objLJJ19 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ4 || objLJJ19 == c1680520tpi) {
                objLJJ19 = new C05TS(c1690080u587, interfaceC1665500tRU5, function13, c05p1, null);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ19);
            }
            interfaceC1680500tpg2.LJ();
            C1680540tpk.LJFF(boolValueOf3, (Function2) objLJJ19, interfaceC1680500tpg2);
            if (((Boolean) C1668490tWJ.LIZIZ.getValue()).booleanValue()) {
                interfaceC1680500tpg2.LJJIIJZLJL(-1694144284);
                C1668490tWJ.LJIIJJI(this.LL, f2, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(-1694033924);
                C1690080u58 c1690080u588 = this.LL;
                Boolean boolValueOf4 = Boolean.valueOf(this.LLIZ);
                interfaceC1680500tpg2.LJJIIJZLJL(-1224400529);
                boolean zLJJIIJ5 = interfaceC1680500tpg2.LJJIIJ(this.LL) | interfaceC1680500tpg2.LJIJ(f2) | interfaceC1680500tpg2.LJJIIJ(this.LLJ) | interfaceC1680500tpg2.LJIIZILJ(this.LLIZ);
                C1690080u58 c1690080u589 = this.LL;
                Function2<List<Integer>, Boolean, Unit> function2 = this.LLJ;
                boolean z2 = this.LLIZ;
                Object objLJJ20 = interfaceC1680500tpg2.LJJ();
                if (zLJJIIJ5 || objLJJ20 == c1680520tpi) {
                    objLJJ20 = new C1358405Ti(c1690080u589, f2, function2, z2, null);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ20);
                }
                interfaceC1680500tpg2.LJ();
                C1680540tpk.LJ(c1690080u588, boolValueOf4, (Function2) objLJJ20, interfaceC1680500tpg2);
                interfaceC1680500tpg2.LJ();
            }
            float f5 = f2;
            C1668490tWJ.LJIIJ(LIZ(c05p1), ((Number) c05p12.getValue()).intValue(), this.LLILZ.size(), fFloatValue, f5, fFloatValue2, ((Boolean) c05p03.getValue()).booleanValue(), ((C1668650tWZ) C1668490tWJ.LIZ.getValue()).LL, ((Number) c05p04.getValue()).floatValue(), this.LLJI, interfaceC1680500tpg2, 0);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1668630tWX.LIZ(c.LJI(C1686320tz4.LIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), c1368905Xj, null), this.LLJIJIL));
            if (this.LLJILJIL && !this.LLJILJILJ) {
                z = true;
            } else {
                z = false;
            }
            C1668490tWJ.LIZIZ(this.LL, interfaceC1686570tzTLIZIZ, z, interfaceC1679150tnV, interfaceC1685750ty9LIZ, this.LLILZ, f2, fFloatValue, fFloatValue2, fLJJJJLL3, f, c21149817pg, this.LLJILJILJ, this.LLJILLL, this.LLJIJIL, LIZ(c05p1), ((Number) c05p12.getValue()).intValue(), ((Boolean) c05p13.getValue()).booleanValue(), this.LLJJ, interfaceC1680500tpg2, 0, 0);
        }
        return Unit.LIZ;
    }
}
