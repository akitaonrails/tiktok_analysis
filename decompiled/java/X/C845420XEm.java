package X;

import Y.ARunnableS113S0100000_13;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ug.bus.UgCallbackCenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845420XEm implements InterfaceC815680VzC, C0XN9 {
    public static volatile C845420XEm LLILLL;
    public boolean LL;
    public String LLILLJJLI;

    public static C845420XEm LJJZ() {
        if (LLILLL == null) {
            synchronized (C845420XEm.class) {
                try {
                    if (LLILLL == null) {
                        LLILLL = new C845420XEm();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLL;
    }

    public C845420XEm() {
        this.LLILLJJLI = "";
        TTAccountInit.LIZ();
        C0XO0.LIZLLL(C848000XOk.LIZ()).LIZ(this);
        this.LLILLJJLI = getSecUid();
        this.LL = !TextUtils.isEmpty(r0);
    }

    @Override // X.InterfaceC815680VzC
    public final String getSecUid() {
        TTAccountInit.LIZ();
        return C0XO0.LIZLLL(C848000XOk.LIZ()).LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C0XN9
    public final void LJI(C0XGH c0xgh) {
        int i = c0xgh.LIZ;
        if (i != 1 && i != 2) {
            if (!this.LL) {
                String secUid = getSecUid();
                if (!this.LL) {
                    UgCallbackCenter.LIZ(new C809160Vog(secUid));
                    this.LLILLJJLI = secUid;
                    this.LL = true;
                    return;
                }
                return;
            }
            String secUid2 = getSecUid();
            if (this.LLILLJJLI.equals(secUid2)) {
                return;
            }
            this.LLILLJJLI = secUid2;
            UgCallbackCenter.LIZ(new C809170Voh(secUid2));
            return;
        }
        this.LL = false;
        this.LLILLJJLI = "";
        UgCallbackCenter.LIZ(new Object() { // from class: X.0XEo
        });
    }

    @Override // X.InterfaceC815680VzC
    public final void LJIJJLI(InterfaceC815690VzD interfaceC815690VzD) {
        final C845430XEn c845430XEn = new C845430XEn(this, interfaceC815690VzD);
        AbstractC845510XEv.LIZ.execute(new ARunnableS113S0100000_13(new AbstractC845510XEv<List<C845480XEs>>() { // from class: X.0XEq
            public final /* synthetic */ int LIZJ = 0;
            public final /* synthetic */ Object LIZLLL = null;

            /* JADX WARN: Removed duplicated region for block: B:47:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.AbstractC845510XEv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<X.C845480XEs> LIZ() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C845460XEq.LIZ():java.lang.Object");
            }

            @Override // X.AbstractC845510XEv
            public final void LIZIZ(List<C845480XEs> list) {
                List<C845480XEs> list2 = list;
                if (c845430XEn != null) {
                    if (list2 != null && list2.size() != 0) {
                        C845430XEn c845430XEn2 = (C845430XEn) c845430XEn;
                        c845430XEn2.getClass();
                        ArrayList arrayList = new ArrayList();
                        TTAccountInit.LIZ();
                        C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C848000XOk.LIZ());
                        boolean z = false;
                        for (C845480XEs c845480XEs : list2) {
                            if (!z && !TextUtils.isEmpty(c845480XEs.LJ) && c845480XEs.LJ.equals(c0xo0LIZLLL.LLJJLIIIJLLLLLLLZ)) {
                                z = true;
                            }
                            arrayList.add(new C1895307bb(c845480XEs.LIZLLL, c845480XEs.LJ, c845480XEs.LJFF, c845480XEs.LJII));
                        }
                        if (!z && c845430XEn2.LIZIZ.LL) {
                            arrayList.add(new C1895307bb(c0xo0LIZLLL.LLJJL, c0xo0LIZLLL.LLJJLIIIJLLLLLLLZ, c0xo0LIZLLL.LLILLL, c0xo0LIZLLL.LLJJIJI));
                        }
                        c845430XEn2.LIZ.LIZ(arrayList);
                        return;
                    }
                    C845430XEn c845430XEn3 = (C845430XEn) c845430XEn;
                    c845430XEn3.getClass();
                    TTAccountInit.LIZ();
                    C0XO0 c0xo0LIZLLL2 = C0XO0.LIZLLL(C848000XOk.LIZ());
                    ArrayList arrayList2 = new ArrayList();
                    if (c845430XEn3.LIZIZ.LL) {
                        arrayList2.add(new C1895307bb(c0xo0LIZLLL2.LLJJL, c0xo0LIZLLL2.LLJJLIIIJLLLLLLLZ, c0xo0LIZLLL2.LLILLL, c0xo0LIZLLL2.LLJJIJI));
                    }
                    c845430XEn3.LIZ.LIZ(arrayList2);
                }
            }
        }, 161));
    }
}
