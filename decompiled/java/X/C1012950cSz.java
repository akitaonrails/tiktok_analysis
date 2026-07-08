package X;

import android.widget.FrameLayout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0cSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012950cSz implements InterfaceC1013520cTu {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final FrameLayout LIZJ;
    public final /* synthetic */ C1013300cTY LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // X.InterfaceC1013520cTu
    public final void LIZLLL(Integer num) {
    }

    @Override // X.InterfaceC1013520cTu
    public final void LJ(long j) {
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZIZ() {
        this.LIZLLL.LLILLJJLI.LJJIZ(this.LJ, C1013100cTE.LIZ);
        C786410Ut5.LJJJJIZL(this.LIZLLL.LLILZIL);
    }

    @Override // X.InterfaceC1013520cTu
    public final void onStart() {
        this.LIZLLL.LLILLJJLI.LJJIZ(this.LJ, C1013110cTF.LIZ);
    }

    @Override // X.InterfaceC1013520cTu
    public final FrameLayout M4() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZ(int i) {
        this.LIZLLL.LLILLJJLI.LJJIZ(this.LJ, new C1012960cT0(i));
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZJ(int i) {
        this.LIZLLL.LLILLJJLI.LJJIZ(this.LJ, new C1012970cT1(i));
    }

    public C1012950cSz(String str, String str2, C1013300cTY c1013300cTY, int i) {
        this.LIZLLL = c1013300cTY;
        this.LJ = i;
        this.LIZ = str;
        this.LIZIZ = Collections.singletonList(str2);
        this.LIZJ = c1013300cTY.LLILZIL;
    }
}
