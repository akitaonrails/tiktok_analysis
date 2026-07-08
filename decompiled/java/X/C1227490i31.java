package X;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227490i31 extends C1225700i08 {
    public final C1227600i3C LLILZ;
    public final C01GW LLILZIL;
    public EnumC1227730i3P LLILZLL;
    public final C01GW LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[PHI: r8
      0x00fc: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:53:0x00c8, B:38:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.C1224590hyL r13) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227490i31.LJIJ(X.0hyL):void");
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        List<C1224840hyk> list;
        boolean z;
        String strInvoke;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LLILLJJLI.LLILLL;
        if (interfaceC1226510i1R != null && (list = c1224790hyf.LIZIZ) != null) {
            if (!this.LLILZ.LJIILJJIL && !(!list.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            interfaceC1226510i1R.LJIIZILJ(z, false);
            EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
            Boolean boolValueOf = Boolean.valueOf(!list.isEmpty());
            Function1<Integer, String> function1 = this.LLILZ.LJIILLIIL;
            if (function1 == null || (strInvoke = function1.invoke(Integer.valueOf(list.size()))) == null) {
                strInvoke = this.LLILZ.LJIIIZ.LIZJ;
            }
            interfaceC1226510i1R.LJIJJLI(new C1224600hyM(enumC1227730i3P, boolValueOf, strInvoke, (Boolean) null, 24), new C1224600hyM(EnumC1227730i3P.SECONDARY, Boolean.valueOf(!list.isEmpty()), (String) null, (Boolean) null, 28), false);
        }
    }

    public C1227490i31(AbstractC1225770i0F abstractC1225770i0F, C1227600i3C c1227600i3C) {
        super(abstractC1225770i0F, c1227600i3C);
        this.LLILZ = c1227600i3C;
        this.LLILZIL = C452501pT.LIZIZ(new AwS420S0200000_19(this, abstractC1225770i0F, 208));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3333));
    }
}
