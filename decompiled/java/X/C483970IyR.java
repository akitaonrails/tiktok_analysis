package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0IyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483970IyR {
    public final RecyclerView LIZ;
    public InterfaceC484040IyY LIZJ;
    public float LJ;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final int LIZIZ = (int) C497740JfY.LIZIZ(64.0f);
    public final int LJFF = 8;
    public final C483980IyS LIZLLL = new AbstractC1585810rMx() { // from class: X.0IyS
        public int LL;
        public int LLILLJJLI;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        
            r8 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
        
            r8 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[LOOP:0: B:24:0x0062->B:44:0x00aa, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00dd A[LOOP:1: B:46:0x00af->B:62:0x00dd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0082 A[EDGE_INSN: B:66:0x0082->B:34:0x0082 BREAK  A[LOOP:0: B:24:0x0062->B:44:0x00aa], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0082 A[EDGE_INSN: B:69:0x0082->B:34:0x0082 BREAK  A[LOOP:1: B:46:0x00af->B:62:0x00dd], SYNTHETIC] */
        @Override // X.AbstractC1585810rMx
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJJIIJ(androidx.recyclerview.widget.RecyclerView r13, int r14) {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C483980IyS.LJJIIJ(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            View viewFindViewByPosition;
            C483970IyR c483970IyR = this.LLILLL;
            if (c483970IyR.LJ <= 0.0f && i2 > 0) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int height = 0;
                if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null) {
                    height = viewFindViewByPosition.getHeight();
                }
                c483970IyR.LJ = height;
                int[] iArr = new int[2];
                recyclerView.getLocationOnScreen(iArr);
                int i3 = iArr[1];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recyclerView absoluteY=");
                sbLIZ.append(i3);
                C20441214yg.LIZIZ("VideoPlayerScrollTrigger", C2188811AlT.LIZIZ(sbLIZ));
                float f = i3;
                float f2 = c483970IyR.LJFF + c483970IyR.LJ;
                float f3 = f2 / 2;
                float f4 = f3 + f;
                c483970IyR.LJII = f4;
                float f5 = f4 + f3;
                c483970IyR.LJI = f5;
                c483970IyR.LJIIIZ = f + f2;
                c483970IyR.LJIIIIZZ = f5 + f3;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DownRightTrigger=");
                sbLIZ2.append(c483970IyR.LJII);
                sbLIZ2.append(",DownLeftTrigger=");
                sbLIZ2.append(c483970IyR.LJI);
                sbLIZ2.append(",UpRightTrigger=");
                sbLIZ2.append(c483970IyR.LJIIIZ);
                sbLIZ2.append(",UpLeftTrigger=");
                sbLIZ2.append(c483970IyR.LJIIIIZZ);
                C20441214yg.LIZIZ("VideoPlayerScrollTrigger", C2188811AlT.LIZIZ(sbLIZ2));
            }
            this.LL += i2;
        }
    };

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0IyS] */
    public C483970IyR(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }
}
