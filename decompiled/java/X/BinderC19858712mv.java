package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.12mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class BinderC19858712mv extends AbstractBinderC19858612mu {
    public final /* synthetic */ C19858912mx LLILLJJLI;

    public BinderC19858712mv(C19858912mx c19858912mx) {
        this.LLILLJJLI = c19858912mx;
    }

    @Override // X.InterfaceC19858112mp
    public final void LJJI(String str, String str2) {
        if (str != null && str2 != null) {
            C19858812mw c19858812mw = (C19858812mw) ((LinkedHashMap) this.LLILLJJLI.LJ).get(str);
            if (c19858812mw != null) {
                c19858812mw.LIZ = str2;
            }
            C19859212n0 c19859212n0 = this.LLILLJJLI.LJI;
            if (c19859212n0 != null) {
                c19859212n0.LJJI(str, str2);
            }
        }
    }

    @Override // X.InterfaceC19858112mp
    public final void LJJJJI(String str, int i) {
        if (str != null && i != 0) {
            C19858812mw c19858812mw = (C19858812mw) ((LinkedHashMap) this.LLILLJJLI.LJ).get(str);
            if (c19858812mw != null) {
                c19858812mw.LIZIZ = i;
            }
            C19859212n0 c19859212n0 = this.LLILLJJLI.LJI;
            if (c19859212n0 != null) {
                c19859212n0.LJJJJI(str, i);
            }
        }
    }
}
