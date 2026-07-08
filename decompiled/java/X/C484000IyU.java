package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0IyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484000IyU {
    public final InterfaceC484030IyX LIZ;
    public float LIZJ;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public final int LIZIZ = (int) C497740JfY.LIZIZ(64.0f);
    public final int LIZLLL = 8;

    public C484000IyU(RunnableC781530UlD runnableC781530UlD, InterfaceC484030IyX interfaceC484030IyX) {
        this.LIZ = interfaceC484030IyX;
        runnableC781530UlD.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0IyT
            public int LL;
            public int LLILLJJLI;

            /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
            
                r8 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[LOOP:0: B:20:0x005e->B:38:0x00a4, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[LOOP:1: B:40:0x00a9->B:56:0x00d7, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x007e A[EDGE_INSN: B:59:0x007e->B:30:0x007e BREAK  A[LOOP:0: B:20:0x005e->B:38:0x00a4], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x007e A[EDGE_INSN: B:63:0x007e->B:30:0x007e BREAK  A[LOOP:1: B:40:0x00a9->B:56:0x00d7], SYNTHETIC] */
            @Override // X.AbstractC1585810rMx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIJ(androidx.recyclerview.widget.RecyclerView r13, int r14) {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C483990IyT.LJJIIJ(androidx.recyclerview.widget.RecyclerView, int):void");
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                View viewFindViewByPosition;
                C484000IyU c484000IyU = this.LLILLL;
                if (c484000IyU.LIZJ <= 0.0f && i2 > 0) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int height = 0;
                    if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null) {
                        height = viewFindViewByPosition.getHeight();
                    }
                    c484000IyU.LIZJ = height;
                    int[] iArr = new int[2];
                    recyclerView.getLocationOnScreen(iArr);
                    int i3 = iArr[1];
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recyclerView absoluteY=");
                    sbLIZ.append(i3);
                    C20441214yg.LIZIZ("VideoPlayerScrollTrigger", C2188811AlT.LIZIZ(sbLIZ));
                    float f = i3;
                    float f2 = c484000IyU.LIZLLL + c484000IyU.LIZJ;
                    float f3 = f2 / 2;
                    float f4 = f3 + f;
                    c484000IyU.LJFF = f4;
                    float f5 = f4 + f3;
                    c484000IyU.LJ = f5;
                    c484000IyU.LJII = f + f2;
                    c484000IyU.LJI = f5 + f3;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DownRightTrigger=");
                    sbLIZ2.append(c484000IyU.LJFF);
                    sbLIZ2.append(",DownLeftTrigger=");
                    sbLIZ2.append(c484000IyU.LJ);
                    sbLIZ2.append(",UpRightTrigger=");
                    sbLIZ2.append(c484000IyU.LJII);
                    sbLIZ2.append(",UpLeftTrigger=");
                    sbLIZ2.append(c484000IyU.LJI);
                    C20441214yg.LIZIZ("VideoPlayerScrollTrigger", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LL += i2;
            }
        });
    }
}
