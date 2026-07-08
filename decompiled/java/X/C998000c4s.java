package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.slideslip.view.CarouselLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0c4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998000c4s implements InterfaceC21676019sM {
    public final Scene LL;
    public final C1627130sRb LLILLJJLI;
    public int LLILLL;
    public final View LLILZ;
    public final CarouselLayoutManager LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(584));
    public MotionEvent LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        if (motionEvent.getX() + this.LLILLL > this.LLILZ.getLeft() && motionEvent.getX() + this.LLILLL < this.LLILZ.getRight()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0019  */
    @Override // X.InterfaceC21676019sM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C998000c4s.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public C998000c4s(C1630020sWG c1630020sWG, C1627130sRb c1627130sRb, int i, View view, CarouselLayoutManager carouselLayoutManager, C997980c4q c997980c4q) {
        this.LL = c1630020sWG;
        this.LLILLJJLI = c1627130sRb;
        this.LLILLL = i;
        this.LLILZ = view;
        this.LLILZIL = carouselLayoutManager;
        this.LLILZLL = c997980c4q;
    }
}
