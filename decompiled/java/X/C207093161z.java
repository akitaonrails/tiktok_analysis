package X;

import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionFirstRealDisplayEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfCaptionLoadEndEvent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.161z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207093161z {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C00I7 LIZ;
    public final C016C LIZIZ;
    public final Function0<Long> LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public volatile Long LJIIIIZZ;
    public volatile Long LJIIIZ;
    public volatile boolean LJIIJ;
    public volatile String LJIIJJI;
    public C162K LJIIL;
    public long LJIILIIL = -1;
    public C016B LJIILJJIL;
    public final C017C LJIILL;

    public final String LIZ() {
        String str;
        C00I7 c00i7 = this.LIZ;
        return (c00i7 == null || (str = c00i7.LL) == null) ? "" : str;
    }

    public final int LIZIZ() {
        Long l = this.LJIIIIZZ;
        if (l == null && (l = this.LJIIIZ) == null) {
            return 0;
        }
        return (int) (this.LIZJ.invoke().longValue() - l.longValue());
    }

    public final void LIZLLL(C162F c162f) {
        Long l;
        int i;
        Integer numValueOf;
        Long lValueOf;
        long jIntValue;
        String str;
        String str2;
        String str3;
        Boolean bool;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        Long l2 = c162f.LIZJ;
        long j = 0;
        if (l2 != null && l2.longValue() >= 0) {
            l = c162f.LIZJ;
        } else {
            l = null;
        }
        C016B c016b = c162f.LIZ;
        int iLIZIZ = LIZIZ();
        if (!Intrinsics.LJFF(this.LIZIZ.LLILZIL, EnumC20038913at.REALTIME.getValue()) ? Intrinsics.LJFF(c162f.LIZLLL, Boolean.TRUE) : this.LIZLLL) {
            i = 1;
        } else {
            i = 0;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        if (!Intrinsics.LJFF(this.LIZIZ.LLILZLL, "switch_language") && (bool = c162f.LIZIZ) != null) {
            numValueOf = Integer.valueOf(!bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        Long l3 = this.LIZIZ.LLJIJIL;
        if (l3 != null) {
            long jLongValue = l3.longValue();
            if (l != null) {
                long jLongValue2 = l.longValue();
                if (jLongValue2 > jLongValue) {
                    j = jLongValue2 - jLongValue;
                }
                lValueOf = Long.valueOf(j);
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        int i2 = c016b.LL;
        int i3 = c016b.LLILLL;
        Integer num = c016b.LLILZ;
        Integer num2 = c016b.LLILZIL;
        Integer num3 = c016b.LLILZLL;
        Integer num4 = c016b.LLIZ;
        String str4 = c016b.LLIZLLLIL;
        Integer num5 = c016b.LLJI;
        C016B c016b2 = new C016B(i2, iLIZIZ, i3, num, num2, num3, num4, str4, numValueOf2, num5, c016b.LLJIJIL, numValueOf, l, lValueOf, c016b.LLJJ, c016b.LLJJI);
        if (num5 != null) {
            jIntValue = num5.intValue();
        } else {
            jIntValue = -1;
        }
        this.LJIILIIL = jIntValue;
        this.LJIILJJIL = c016b2;
        this.LJIILL.LIZIZ(c016b2);
        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
        C00I7 c00i7 = this.LIZ;
        String str5 = "";
        if (c00i7 == null || (str = c00i7.LL) == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadEnd, awemeId: ");
        C00I7 c00i72 = this.LIZ;
        if (c00i72 != null) {
            str2 = c00i72.LL;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", startParams: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endParams: ");
        sbLIZ.append(c016b2);
        C0SZC.LIZJ(str, "caption_load_end", C2188811AlT.LIZIZ(sbLIZ));
        C162K c162k = this.LJIIL;
        if (c162k != null) {
            C00I7 c00i73 = this.LIZ;
            if (c00i73 != null && (str3 = c00i73.LL) != null) {
                str5 = str3;
            }
            c162k.LIZIZ(str5, this.LIZIZ, c016b2);
        }
        C207069161b.LJ(ClaPerfCaptionLoadEndEvent.class, this.LJIILL, new AnonymousClass0174(), null, 24);
        if (C295750BiX.LIZ() && Intrinsics.LJFF(this.LIZIZ.LLILZLL, AnonymousClass1629.LAND_ON_ITEM.getValue())) {
            C162B.LIZIZ.ah(LIZ(), this.LIZIZ.LL);
        }
    }

    public final void LIZJ(long j, Integer num, String str, boolean z) {
        int iLongValue;
        int value;
        C017C c017c;
        String str2;
        boolean z2;
        Long l = this.LJIIIIZZ;
        if (l == null) {
            l = this.LJIIIZ;
        }
        boolean z3 = false;
        if (l != null) {
            iLongValue = (int) (j - l.longValue());
        } else {
            iLongValue = 0;
        }
        if (z) {
            if (num != null) {
                value = num.intValue();
            } else if (Intrinsics.LJFF(str, "SUCCESS")) {
                value = AnonymousClass1623.SUCCESS.getValue();
            } else {
                value = AnonymousClass1623.FAILURE.getValue();
            }
            if (num != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[ET_ACC] ui_end_loadend aid=");
                C00I7 c00i7 = this.LIZ;
                if (c00i7 != null) {
                    str2 = c00i7.LL;
                } else {
                    str2 = null;
                }
                sbLIZ.append(str2);
                sbLIZ.append(" dur=");
                sbLIZ.append(iLongValue);
                sbLIZ.append(" code=");
                sbLIZ.append(value);
                sbLIZ.append(" reason=");
                sbLIZ.append(str);
                sbLIZ.append(" hasStartTime=");
                if (this.LJIIIIZZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(" hasLoadStartTime=");
                if (this.LJIIIZ != null) {
                    z3 = true;
                }
                sbLIZ.append(z3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LJIILL.LIZIZ(new C0187004b(Integer.valueOf(iLongValue), Integer.valueOf(value), str, this.LJ, 1));
            if (C0BKU.LIZJ()) {
                C017C c017c2 = this.LJIILL;
                c017c2.getClass();
                c017c = new C017C();
                ((ArrayList) c017c.LIZ).addAll(C13LP.LJJJJLI(C13LP.LLIIII(c017c2.LIZ)));
            } else {
                c017c = this.LJIILL;
            }
            C207069161b.LJ(ClaPerfCaptionFirstRealDisplayEvent.class, c017c, new AnonymousClass0174(), null, 24);
        }
    }

    public C207093161z(C00I7 c00i7, C016C c016c, boolean z, C162G c162g, boolean z2, String str, String str2) {
        this.LIZ = c00i7;
        this.LIZIZ = c016c;
        this.LIZJ = c162g;
        this.LIZLLL = z2;
        this.LJ = str;
        this.LJFF = str2;
        C017C c017c = new C017C();
        c017c.LIZIZ(c00i7);
        c017c.LIZIZ(c016c);
        this.LJIILL = c017c;
    }
}
