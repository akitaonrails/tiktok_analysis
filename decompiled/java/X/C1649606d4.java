package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1649606d4 extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final Set<C067L> LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLILZIL.getValue();
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return C1171750gb7.LIZ() && !this.LLILZ.LJII;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLILZLL;
    }

    public C1649606d4(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1175));
        this.LLILZLL = Collections.singleton(C067L.SINGLE);
        this.LLIZ = Collections.singleton(EnumC1596306Mv.COLLABORATIVE_COLLECTION_POP_UP);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1174));
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C1686306iz c1686306iz = (C1686306iz) this.LLIZLLLIL.getValue();
        TuxSheet tuxSheet = c1686306iz.LLILZ;
        if (tuxSheet != null && !tuxSheet.isStateSaved()) {
            TuxSheet tuxSheet2 = c1686306iz.LLILZ;
            if (tuxSheet2 != null) {
                tuxSheet2.dismiss();
            }
            c1686306iz.LLILZ = null;
            c1686306iz.LLZLI();
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        if (!this.LLILZ.LJI.isSingleChat()) {
            return new C06OH("Not single chat");
        }
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        if (!((C1686306iz) this.LLIZLLLIL.getValue()).LIZ()) {
            return new C06OH("Check conditions failed");
        }
        return C06OI.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06OO r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1649706d5
            if (r0 == 0) goto L3a
            r4 = r7
            X.06d5 r4 = (X.C1649706d5) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L40
            X.C155000ia.LIZIZ(r3)
        L22:
            X.01GW r0 = r5.LLIZLLLIL
            java.lang.Object r0 = r0.getValue()
            X.06iz r0 = (X.C1686306iz) r0
            r0.LIZIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r2) goto L22
            return r2
        L3a:
            X.06d5 r4 = new X.06d5
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1649606d4.LJIIJ(X.06OO, X.05Vn):java.lang.Object");
    }
}
