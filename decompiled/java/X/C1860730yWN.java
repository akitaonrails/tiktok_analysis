package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem$flushPendingMessageContentExposureReports$2", f = "TakoAnswerBaseAssem.kt", l = {}, m = "invokeSuspend")
public final class C1860730yWN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1860790yWT> LL;
    public final /* synthetic */ TakoAnswerBaseAssem<C1858660yT2> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860730yWN(List<C1860790yWT> list, TakoAnswerBaseAssem<C1858660yT2> takoAnswerBaseAssem, InterfaceC1364105Vn<? super C1860730yWN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = takoAnswerBaseAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860730yWN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1858330ySV c1858330ySVLIZ;
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.flushPendingMessageContentExposureReports$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1860790yWT> list = this.LL;
        TakoAnswerBaseAssem<C1858660yT2> takoAnswerBaseAssem = this.LLILLJJLI;
        for (C1860790yWT c1860790yWT : list) {
            Object obj2 = C1860750yWP.LIZ;
            if (!C1860750yWP.LIZ(c1860790yWT.LIZ)) {
                C1860750yWP.LIZIZ(c1860790yWT.LIZ);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str = c1860790yWT.LIZJ;
                String str2 = c1860790yWT.LJFF;
                String str3 = c1860790yWT.LJI;
                String str4 = c1860790yWT.LJII;
                String str5 = c1860790yWT.LIZ;
                String str6 = c1860790yWT.LJIIIIZZ;
                long j = c1860790yWT.LIZIZ;
                String str7 = c1860790yWT.LJIIIZ;
                C1862900yZs c1862900yZs = c1860790yWT.LJIIJJI;
                String str8 = c1860790yWT.LJIIJ;
                String str9 = c1860790yWT.LJIIL;
                String str10 = c1860790yWT.LIZLLL;
                if (str10 == null) {
                    str10 = "";
                }
                String str11 = c1860790yWT.LJ;
                if (str11 == null) {
                    str11 = "";
                }
                C1862330yYx.LJJJJJL(c1862330yYx, str, str2, str3, str4, str5, str6, j, str7, c1862900yZs, str8, str9, str10, str11);
                String str12 = c1860790yWT.LIZJ;
                String str13 = c1860790yWT.LJFF;
                String str14 = c1860790yWT.LJI;
                String str15 = c1860790yWT.LIZ;
                Integer num = c1860790yWT.LJIILJJIL;
                int i = c1860790yWT.LJIILL;
                int i2 = c1860790yWT.LJIILLIIL;
                String str16 = c1860790yWT.LJIILIIL;
                String str17 = c1860790yWT.LIZLLL;
                if (str17 == null) {
                    str17 = "";
                }
                String str18 = c1860790yWT.LJ;
                if (str18 == null) {
                    str18 = "";
                }
                C1862330yYx.LJJJJLI(c1862330yYx, str12, str13, str14, str15, num, i, i2, str16, str17, str18);
                if (!C07IB.LIZ() && ((C1858660yT2) C631370Opb.LIZ(takoAnswerBaseAssem)).LL.LLILLL.isMultiAnswer && (c1858330ySVLIZ = C1858340ySW.LIZ(c1860790yWT.LIZ)) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1858340ySW.LIZJ(jCurrentTimeMillis, c1860790yWT.LIZ);
                    String str19 = c1860790yWT.LJFF;
                    String str20 = c1860790yWT.LJI;
                    String str21 = c1860790yWT.LIZ;
                    Integer numLJ = C2286608xc.LJ(c1858330ySVLIZ.LIZ + 1);
                    String str22 = c1860790yWT.LIZJ;
                    String str23 = c1860790yWT.LIZLLL;
                    if (str23 == null) {
                        str23 = "";
                    }
                    String str24 = c1860790yWT.LJ;
                    if (str24 == null) {
                        str24 = "";
                    }
                    C1862330yYx.LJLJLLL(c1862330yYx, str19, str20, str21, numLJ, str22, str23, str24, "default", c1860790yWT.LJIILIIL, (jCurrentTimeMillis - c1858330ySVLIZ.LIZIZ) - c1858330ySVLIZ.LIZJ);
                    C1858340ySW.LIZ.remove(c1860790yWT.LIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.flushPendingMessageContentExposureReports$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
