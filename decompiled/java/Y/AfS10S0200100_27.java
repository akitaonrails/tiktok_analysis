package Y;

import X.C098200Yq;
import X.C09JN;
import X.C0IGH;
import X.C1842150y2P;
import X.C189200o6;
import X.C1C7U;
import X.C784440Upu;
import X.InterfaceC1842140y2O;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class AfS10S0200100_27 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS10S0200100_27 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS10S0200100_27.accept$0(Y.AfS10S0200100_27, java.lang.Object):void");
    }

    public static final void accept$1(AfS10S0200100_27 afS10S0200100_27, Object obj) {
        Object c098200Yq;
        int iIntValue;
        C1C7U.LIZ("LiveRepostServiceImpl@9d34.removeRepost$1");
        C784440Upu.LIZ().LIZIZ(new C0IGH(afS10S0200100_27.j2, false));
        Object obj2 = null;
        try {
            String str = (String) ((Map) afS10S0200100_27.l1).get("reposted_user_cnt");
            if (str != null) {
                c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1842150y2P.LIZ.getClass();
        C1842150y2P.LJIIL(iIntValue, false, true);
        InterfaceC1842140y2O interfaceC1842140y2O = (InterfaceC1842140y2O) afS10S0200100_27.l0;
        if (interfaceC1842140y2O != null) {
            interfaceC1842140y2O.onSuccess();
        }
        C1C7U.LIZIZ("LiveRepostServiceImpl@9d34.removeRepost$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS10S0200100_27(long r2, X.InterfaceC1842140y2O r4, java.util.Map r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto Lf
            r0 = r1
            r0.j2 = r2
            r0.l0 = r4
            r0.l1 = r5
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.j2 = r2
            r0.l0 = r5
            r0.l1 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS10S0200100_27.<init>(long, X.0y2O, java.util.Map, int):void");
    }
}
