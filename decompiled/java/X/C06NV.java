package X;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06NV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NV extends C06O6<C06AH> {
    public final C1671006gW LLILZ;
    public final C1634706af LLILZIL;
    public final C01GW LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final Set<C067L> LLIZLLLIL;
    public C1732606qS LLJ;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZLL.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZLLLIL;
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C1732606qS c1732606qS = this.LLJ;
        if (c1732606qS != null) {
            c1732606qS.dismiss();
        }
        this.LLJ = null;
    }

    public C06NV(C1600706On c1600706On, C1671006gW c1671006gW) {
        super(c1600706On);
        this.LLILZ = c1671006gW;
        this.LLILZIL = (C1634706af) c1600706On.LJIIJJI;
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1177));
        this.LLIZ = Collections.singleton(EnumC1596306Mv.READ_RECEIPT_TOP);
        this.LLIZLLLIL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C06AH c06ah = (C06AH) c06oo;
        if (c06ah.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        String str = c06ah.LIZJ.noticeCode;
        if (str == null) {
            str = "";
        }
        if (C1651506dN.LIZIZ(str)) {
            return C06OI.LIZ;
        }
        return new C06OH("Read status invalid");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    @Override // X.C06O6
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06AH r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C06NX
            if (r0 == 0) goto L48
            r4 = r7
            X.06NX r4 = (X.C06NX) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L4e
            X.06AH r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct r0 = r6.LIZJ
            java.lang.String r2 = r0.noticeCode
            if (r2 != 0) goto L2c
            java.lang.String r2 = ""
        L2c:
            X.06gW r1 = r5.LLILZ
            X.06NY r0 = new X.06NY
            r0.<init>()
            X.06qS r0 = X.C1670806gU.LIZ(r1, r2, r0)
            r5.LLJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L24
            return r2
        L48:
            X.06NX r4 = new X.06NX
            r4.<init>(r5, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06NV.LJIIJ(X.06AH, X.05Vn):java.lang.Object");
    }
}
