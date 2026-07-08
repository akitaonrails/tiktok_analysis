package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C389701fL {
    public final C395101gD LIZ;
    public LiveEffect LIZIZ;
    public final C2252331DDr LIZJ;
    public final AnonymousClass0950 LIZLLL;
    public final C01GW LJ;
    public DataChannel LJFF;
    public AnonymousClass0956 LJI;

    public static boolean LIZJ() {
        List<LiveEffect> listQr = C0UA1.LIZ().qr("tiktok_live_boards");
        if (listQr.isEmpty()) {
            return false;
        }
        Iterator<LiveEffect> it2 = listQr.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LJLL(), "liveboards_2")) {
                return true;
            }
        }
        return false;
    }

    public C389701fL(C395101gD c395101gD) {
        this.LIZ = c395101gD;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(1, 0, null, 6);
        this.LIZJ = c2252331DDrLIZIZ;
        this.LIZLLL = C09IC.LIZ(c2252331DDrLIZIZ);
        this.LJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(552));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C390101fP
            if (r0 == 0) goto L94
            r5 = r8
            X.01fP r5 = (X.C390101fP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r1)
        L23:
            X.01fv r0 = X.C393301fv.LIZ
            X.C392601fo.LJII(r0, r3)
            X.C392601fo.LIZLLL(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01GW r0 = r7.LJ
            java.lang.Object r0 = r0.getValue()
            X.01fS r0 = (X.InterfaceC390401fS) r0
            if (r0 == 0) goto L3e
            r0.LJ()
        L3e:
            X.0950 r0 = r7.LIZLLL
            java.util.List r0 = r0.LIZ()
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L65
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L65
            boolean r0 = X.C500260Jjc.LJJ()
            if (r0 == 0) goto L23
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r7.LJFF
            if (r2 == 0) goto L23
            java.lang.Class<X.0UEi> r1 = X.C768940UEi.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.SX0(r1, r0)
            goto L23
        L65:
            X.0956 r0 = r7.LJI
            if (r0 == 0) goto L7f
            boolean r0 = r0.isActive()
            if (r0 != r6) goto L7f
        L6f:
            X.0950 r1 = r7.LIZLLL
            X.01fM r0 = new X.01fM
            r0.<init>(r7, r3)
            r5.LLILLL = r6
            java.lang.Object r0 = X.C09IC.LJIJ(r1, r5, r0)
            if (r0 != r4) goto L23
            return r4
        L7f:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.01er r1 = new X.01er
            r1.<init>(r7, r3)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            r7.LJI = r0
            goto L6f
        L94:
            X.01fP r5 = new X.01fP
            r5.<init>(r7, r8)
            goto L12
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389701fL.LIZIZ(X.05Vn):java.lang.Object");
    }

    public final InterfaceC346201Wa LIZ(Context context, EnumC389301fH enumC389301fH) {
        if (LIZJ()) {
            return C09IC.LJIJJLI(new C331001Qe(this, null), new C095D(new C389101fF(context, enumC389301fH, null)));
        }
        return new C2501109r7(new C321801Mq(null), new C516501zn(C09IC.LJ(new C395601gI(context, null, this, null)), 3), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(android.content.Context r8, X.EnumC389301fH r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389701fL.LIZLLL(android.content.Context, X.01fH, X.05Vn):java.lang.Object");
    }
}
