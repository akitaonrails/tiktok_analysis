package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721460SRs {
    public final C1337800kuw LIZ;
    public final C16GX LIZIZ;
    public final RecyclerView LIZJ;
    public C0SS5 LJ;
    public int LJFF;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1568));
    public final C0SS7 LJI = new InterfaceC1324370kZH() { // from class: X.0SS7
        @Override // X.InterfaceC1324380kZI
        public final void LLZZJLIL(C16GX c16gx, int i) {
            this.LL.LJFF = i;
        }
    };
    public final C01GW LJII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1575));

    public final AdvancedStopAtOffsetAppBarBehavior LIZ() {
        return (AdvancedStopAtOffsetAppBarBehavior) this.LIZLLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0SS7] */
    public C721460SRs(C1337800kuw c1337800kuw, C0SSD c0ssd, C0SU0 c0su0) {
        this.LIZ = c1337800kuw;
        this.LIZIZ = c0ssd;
        this.LIZJ = c0su0;
    }
}
