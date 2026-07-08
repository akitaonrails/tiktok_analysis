package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;

/* JADX INFO: renamed from: X.0P9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640220P9g extends AbstractC1585810rMx {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final RecyclerView LL;
    public final C0P8X LLILLJJLI;
    public final C640240P9i LLILLL;
    public Integer LLILZ;
    public final C640230P9h LLILZIL;
    public int LLILZLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C640220P9g.class, "isVisible", "isVisible()Z", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        C640230P9h c640230P9h = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return ((Boolean) c640230P9h.LL).booleanValue();
    }

    public final void LJJIJIIJIL(boolean z) {
        setValue(this, LLIZ[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0P9h] */
    public C640220P9g(RecyclerView recyclerView, SearchActivityCardBgController searchActivityCardBgController, C640240P9i c640240P9i) {
        this.LL = recyclerView;
        this.LLILLJJLI = searchActivityCardBgController;
        this.LLILLL = c640240P9i;
        final Boolean bool = Boolean.TRUE;
        this.LLILZIL = new C0NTU<Boolean>(bool) { // from class: X.0P9h
            @Override // X.C0NTU
            public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    if (zBooleanValue) {
                        this.LLILLJJLI.LJLLI();
                    } else {
                        this.LLILLJJLI.LJLL();
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ea A[PHI: r3
      0x01ea: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v6 int) binds: [B:111:0x01e6, B:108:0x01dc, B:86:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[PHI: r3
      0x013c: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v6 int) binds: [B:111:0x01e6, B:108:0x01dc, B:86:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f A[ADDED_TO_REGION] */
    @Override // X.AbstractC1585810rMx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r14, int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C640220P9g.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
