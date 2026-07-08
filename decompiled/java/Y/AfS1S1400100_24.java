package Y;

import X.C09JN;
import X.C0XIR;
import X.C1159110gGj;
import X.C1611790s2r;
import X.C1613010s4p;
import X.C1613360s5O;
import X.C1C7U;
import X.C23112093u;
import X.InterfaceC1614200s6k;
import android.util.Log;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class AfS1S1400100_24 implements C09JN {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String strValueOf;
        String message;
        String stackTraceString;
        String str;
        String stackTraceString2;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$10");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
            message = ((C0XIR) th).getErrorMsg();
        } else {
            strValueOf = "-1";
            message = th.getMessage();
        }
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        if (message == null) {
            stackTraceString = Log.getStackTraceString(th);
        } else {
            stackTraceString = message;
        }
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l1;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l2;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_failed", strValueOf, stackTraceString, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l3).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        for (InterfaceC1614200s6k interfaceC1614200s6k : (ArrayList) list) {
            if (message == null) {
                stackTraceString2 = Log.getStackTraceString(th);
                if (stackTraceString2 == null) {
                    stackTraceString2 = "unknown message";
                }
            } else {
                stackTraceString2 = message;
            }
            interfaceC1614200s6k.LJ(c1613360s5O, strValueOf, stackTraceString2);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$10");
    }

    public static final void accept$1(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String str;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$1");
        ((SeriesPaymentServiceImpl) afS1S1400100_24.l1).LJIILIIL(new C1159110gGj(afS1S1400100_24.j5));
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l2;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l3;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_start", null, null, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l1).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LJIILIIL(c1613360s5O);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$1");
    }

    public static final void accept$2(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String str;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$2");
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l1;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l2;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_success", CardStruct.IStatusCode.DEFAULT, null, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l3).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LJII(c1613360s5O);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$2");
    }

    public static final void accept$3(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String strValueOf;
        String message;
        String stackTraceString;
        String str;
        String stackTraceString2;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$3");
        Throwable th = (Throwable) obj;
        if (th instanceof C0XIR) {
            strValueOf = String.valueOf(((C23112093u) th).getErrorCode());
            message = ((C0XIR) th).getErrorMsg();
        } else {
            strValueOf = "-1";
            message = th.getMessage();
        }
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        if (message == null) {
            stackTraceString = Log.getStackTraceString(th);
        } else {
            stackTraceString = message;
        }
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l1;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l2;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_failed", strValueOf, stackTraceString, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l3).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        for (InterfaceC1614200s6k interfaceC1614200s6k : (ArrayList) list) {
            if (message == null) {
                stackTraceString2 = Log.getStackTraceString(th);
                if (stackTraceString2 == null) {
                    stackTraceString2 = "unknown message";
                }
            } else {
                stackTraceString2 = message;
            }
            interfaceC1614200s6k.LJ(c1613360s5O, strValueOf, stackTraceString2);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$3");
    }

    public static final void accept$4(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String str;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$8");
        ((SeriesPaymentServiceImpl) afS1S1400100_24.l1).LJIILIIL(new C1159110gGj(afS1S1400100_24.j5));
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l2;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l3;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_start", null, null, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l1).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LJIILIIL(c1613360s5O);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$8");
    }

    public static final void accept$5(AfS1S1400100_24 afS1S1400100_24, Object obj) {
        String str;
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$9");
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        long j = afS1S1400100_24.j5;
        String str2 = afS1S1400100_24.s0;
        C1613010s4p c1613010s4p = (C1613010s4p) afS1S1400100_24.l1;
        if (c1613010s4p != null) {
            str = c1613010s4p.enterFrom;
        } else {
            str = null;
        }
        SeriesCategory seriesCategory = (SeriesCategory) afS1S1400100_24.l2;
        c1611790s2r.getClass();
        C1611790s2r.LJIIIIZZ("create_success", CardStruct.IStatusCode.DEFAULT, null, j, str2, str, seriesCategory);
        List<InterfaceC1614200s6k> list = ((SeriesPaymentServiceImpl) afS1S1400100_24.l3).LIZ;
        C1613360s5O c1613360s5O = (C1613360s5O) afS1S1400100_24.l4;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1614200s6k) it2.next()).LJII(c1613360s5O);
        }
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.makePurchase$disposable$9");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS1S1400100_24(long r2, com.ss.android.ugc.aweme.feed.model.SeriesCategory r4, X.C1613010s4p r5, X.C1613360s5O r6, com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            switch(r9) {
                case 0: goto L16;
                case 1: goto L5;
                case 2: goto L16;
                case 3: goto L16;
                case 4: goto L5;
                case 5: goto L16;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r7
            r0.j5 = r2
            r0.s0 = r8
            r0.l2 = r5
            r0.l3 = r4
            r0.l4 = r6
        L12:
            r0.<init>()
            return
        L16:
            r0 = r1
            r0.j5 = r2
            r0.s0 = r8
            r0.l1 = r5
            r0.l2 = r4
            r0.l3 = r7
            r0.l4 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS1S1400100_24.<init>(long, com.ss.android.ugc.aweme.feed.model.SeriesCategory, X.0s4p, X.0s5O, com.ss.android.ugc.aweme.series.payment.serviceimpl.SeriesPaymentServiceImpl, java.lang.String, int):void");
    }
}
