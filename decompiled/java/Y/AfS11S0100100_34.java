package Y;

import X.C09JN;
import X.C1C7U;
import X.C20175213ws;
import X.C2215341BnA;
import X.C2215351BnB;
import X.EnumC20175313wt;
import X.EnumC2215301Bn6;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;

/* JADX INFO: loaded from: classes35.dex */
public class AfS11S0100100_34 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

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
        }
    }

    public static final void accept$0(AfS11S0100100_34 afS11S0100100_34, Object obj) {
        Integer numValueOf;
        String str;
        C1C7U.LIZ("AIGCQuickGenerateMoreTask@5219.start$1");
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        ((C2215351BnB) afS11S0100100_34.l0).aigcResult = responseQuickGenerate;
        if (responseQuickGenerate != null && responseQuickGenerate.status_code == 0) {
            C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GEN_MORE, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1), null, null, null, 56);
        } else {
            C20175213ws c20175213ws = C20175213ws.LIZ;
            EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_GEN_MORE;
            EnumC20175313wt enumC20175313wt = EnumC20175313wt.FAIL;
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1);
            ResponseQuickGenerate responseQuickGenerate2 = ((C2215351BnB) afS11S0100100_34.l0).aigcResult;
            if (responseQuickGenerate2 != null) {
                numValueOf = Integer.valueOf(responseQuickGenerate2.status_code);
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            ResponseQuickGenerate responseQuickGenerate3 = ((C2215351BnB) afS11S0100100_34.l0).aigcResult;
            if (responseQuickGenerate3 != null) {
                str = responseQuickGenerate3.status_msg;
            } else {
                str = null;
            }
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, enumC20175313wt, lValueOf, null, strValueOf, str, 8);
        }
        ((C2215351BnB) afS11S0100100_34.l0).LIZ();
        C1C7U.LIZIZ("AIGCQuickGenerateMoreTask@5219.start$1");
    }

    public static final void accept$1(AfS11S0100100_34 afS11S0100100_34, Object obj) {
        C1C7U.LIZ("AIGCQuickGenerateMoreTask@5219.start$2");
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_GEN_MORE, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1), null, null, ((Throwable) obj).getMessage(), 24);
        ((C2215351BnB) afS11S0100100_34.l0).LIZ();
        C1C7U.LIZIZ("AIGCQuickGenerateMoreTask@5219.start$2");
    }

    public static final void accept$2(AfS11S0100100_34 afS11S0100100_34, Object obj) {
        Integer numValueOf;
        String str;
        C1C7U.LIZ("AIGCQuickRequestTask@b492.start$1");
        ResponseQuickGenerate responseQuickGenerate = (ResponseQuickGenerate) obj;
        ((C2215341BnA) afS11S0100100_34.l0).aigcResult = responseQuickGenerate;
        if (responseQuickGenerate != null && responseQuickGenerate.status_code == 0) {
            C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_FAST_GEN, EnumC20175313wt.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1), null, null, null, 56);
        } else {
            C20175213ws c20175213ws = C20175213ws.LIZ;
            EnumC2215301Bn6 enumC2215301Bn6 = EnumC2215301Bn6.AIGC_NET_FAST_GEN;
            EnumC20175313wt enumC20175313wt = EnumC20175313wt.FAIL;
            Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1);
            ResponseQuickGenerate responseQuickGenerate2 = ((C2215341BnA) afS11S0100100_34.l0).aigcResult;
            if (responseQuickGenerate2 != null) {
                numValueOf = Integer.valueOf(responseQuickGenerate2.status_code);
            } else {
                numValueOf = null;
            }
            String strValueOf = String.valueOf(numValueOf);
            ResponseQuickGenerate responseQuickGenerate3 = ((C2215341BnA) afS11S0100100_34.l0).aigcResult;
            if (responseQuickGenerate3 != null) {
                str = responseQuickGenerate3.status_msg;
            } else {
                str = null;
            }
            C20175213ws.LIZ(c20175213ws, enumC2215301Bn6, enumC20175313wt, lValueOf, null, strValueOf, str, 8);
        }
        ((C2215341BnA) afS11S0100100_34.l0).LIZ();
        C1C7U.LIZIZ("AIGCQuickRequestTask@b492.start$1");
    }

    public static final void accept$3(AfS11S0100100_34 afS11S0100100_34, Object obj) {
        C1C7U.LIZ("AIGCQuickRequestTask@b492.start$2");
        C20175213ws.LIZ(C20175213ws.LIZ, EnumC2215301Bn6.AIGC_NET_FAST_GEN, EnumC20175313wt.FAIL, Long.valueOf(SystemClock.elapsedRealtime() - afS11S0100100_34.j1), null, null, ((Throwable) obj).getMessage(), 24);
        ((C2215341BnA) afS11S0100100_34.l0).LIZ();
        C1C7U.LIZIZ("AIGCQuickRequestTask@b492.start$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS11S0100100_34(long r2, X.C2215341BnA r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS11S0100100_34.<init>(long, X.1BnA, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS11S0100100_34(long r2, X.C2215351BnB r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Ld
            r0 = r1
            r0.j1 = r2
            r0.l0 = r4
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r4
            r0.j1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS11S0100100_34.<init>(long, X.1BnB, int):void");
    }
}
