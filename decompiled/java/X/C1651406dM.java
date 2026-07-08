package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1651406dM extends C06O6<C06AH> {
    public final C1600706On LLILZ;
    public final C01GW LLILZIL;
    public final C1634706af LLILZLL;
    public final C01GW LLIZ;
    public final Set<EnumC1596306Mv> LLIZLLLIL;
    public final Set<C067L> LLJ;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return (C067K) this.LLIZ.getValue();
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLJ;
    }

    public C1651406dM(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1067));
        this.LLILZLL = (C1634706af) c1600706On.LJIIJJI;
        this.LLIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1066));
        this.LLIZLLLIL = Collections.singleton(EnumC1596306Mv.READ_RECEIPT_BOTTOM);
        this.LLJ = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        C1652206dU c1652206dU = (C1652206dU) this.LLILZIL.getValue();
        if (c1652206dU != null && (tuxSheet = c1652206dU.LLILLL) != null && !tuxSheet.isStateSaved() && (tuxSheet2 = c1652206dU.LLILLL) != null && tuxSheet2.isAdded()) {
            TuxSheet tuxSheet3 = c1652206dU.LLILLL;
            if (tuxSheet3 != null) {
                tuxSheet3.dismiss();
            }
            c1652206dU.LLILLL = null;
        }
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    @Override // X.C06O6
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C06AH r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1651406dM.LJIIJ(X.06AH, X.05Vn):java.lang.Object");
    }
}
