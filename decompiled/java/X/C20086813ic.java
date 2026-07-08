package X;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20086813ic extends AbstractC20055313dX implements InterfaceC1695680uEA {
    public final C20086713ib LLJJIII;
    public final C20087013ie LLJJIJI;
    public RenderNode LLJJIJIIJIL;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    public final RenderNode LLJJIJIIJIL() {
        RenderNode renderNode = this.LLJJIJIIJIL;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.LLJJIJIIJIL = renderNode2;
        return renderNode2;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        EdgeEffect edgeEffect;
        boolean z;
        EdgeEffect edgeEffect2;
        boolean z2;
        boolean zLLJJIJI;
        boolean z3;
        float f;
        this.LLJJIII.LJIIIIZZ(interfaceC1669010tX9.LIZIZ());
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
        Canvas canvas = C1296530jqN.LIZ;
        Canvas canvas2 = ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ;
        ((C13FE) this.LLJJIII.LIZLLL).getValue();
        if (C1680770tq7.LJ(interfaceC1669010tX9.LIZIZ())) {
            interfaceC1669010tX9.LLIIJLIL();
            return;
        }
        if (!canvas2.isHardwareAccelerated()) {
            C20087013ie c20087013ie = this.LLJJIJI;
            EdgeEffect edgeEffect3 = c20087013ie.LIZLLL;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = c20087013ie.LJ;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = c20087013ie.LJFF;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = c20087013ie.LJI;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = c20087013ie.LJII;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = c20087013ie.LJIIIIZZ;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            EdgeEffect edgeEffect9 = c20087013ie.LJIIIZ;
            if (edgeEffect9 != null) {
                edgeEffect9.finish();
            }
            EdgeEffect edgeEffect10 = c20087013ie.LJIIJ;
            if (edgeEffect10 != null) {
                edgeEffect10.finish();
            }
            interfaceC1669010tX9.LLIIJLIL();
            return;
        }
        float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(C1689890u4p.LIZ);
        C20087013ie c20087013ie2 = this.LLJJIJI;
        if ((c20087013ie2.LIZLLL == null || !(!r0.isFinished())) && !C20087013ie.LJIIIIZZ(c20087013ie2.LJII) && (((edgeEffect = c20087013ie2.LJ) == null || !(!edgeEffect.isFinished())) && !C20087013ie.LJIIIIZZ(c20087013ie2.LJIIIIZZ))) {
            z = false;
        } else {
            z = true;
        }
        C20087013ie c20087013ie3 = this.LLJJIJI;
        if ((c20087013ie3.LJFF == null || !(!r0.isFinished())) && !C20087013ie.LJIIIIZZ(c20087013ie3.LJIIIZ) && (((edgeEffect2 = c20087013ie3.LJI) == null || !(!edgeEffect2.isFinished())) && !C20087013ie.LJIIIIZZ(c20087013ie3.LJIIJ))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (z2) {
                LLJJIJIIJIL().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
            } else {
                LLJJIJIIJIL().setPosition(0, 0, canvas2.getWidth() + (C814420VxA.LIZIZ(fLJJJJLL) * 2), canvas2.getHeight());
            }
        } else if (z2) {
            LLJJIJIIJIL().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight() + (C814420VxA.LIZIZ(fLJJJJLL) * 2));
        } else {
            interfaceC1669010tX9.LLIIJLIL();
            return;
        }
        RecordingCanvas recordingCanvasBeginRecording = LLJJIJIIJIL().beginRecording();
        if (C20087013ie.LJIIIIZZ(c20087013ie2.LJIIIZ)) {
            EdgeEffect edgeEffectLIZ = c20087013ie2.LJIIIZ;
            if (edgeEffectLIZ == null) {
                edgeEffectLIZ = c20087013ie2.LIZ(EnumC1684030tvN.Horizontal);
                c20087013ie2.LJIIIZ = edgeEffectLIZ;
            }
            LLJJIJI(90.0f, edgeEffectLIZ, recordingCanvasBeginRecording);
            edgeEffectLIZ.finish();
        }
        if (c20087013ie2.LJFF != null && (!r0.isFinished())) {
            EdgeEffect edgeEffectLIZJ = c20087013ie2.LIZJ();
            zLLJJIJI = LLJJIJI(270.0f, edgeEffectLIZJ, recordingCanvasBeginRecording);
            if (c20087013ie2.LJI()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.LLJJIII.LIZJ() & 4294967295L));
                EdgeEffect edgeEffectLIZ2 = c20087013ie2.LJIIIZ;
                if (edgeEffectLIZ2 == null) {
                    edgeEffectLIZ2 = c20087013ie2.LIZ(EnumC1684030tvN.Horizontal);
                    c20087013ie2.LJIIIZ = edgeEffectLIZ2;
                }
                C20087213ig.LIZLLL(edgeEffectLIZ2, C20087213ig.LIZIZ(edgeEffectLIZJ), 1 - fIntBitsToFloat);
            }
        } else {
            zLLJJIJI = false;
        }
        if (C20087013ie.LJIIIIZZ(c20087013ie2.LJII)) {
            EdgeEffect edgeEffectLIZ3 = c20087013ie2.LJII;
            if (edgeEffectLIZ3 == null) {
                edgeEffectLIZ3 = c20087013ie2.LIZ(EnumC1684030tvN.Vertical);
                c20087013ie2.LJII = edgeEffectLIZ3;
            }
            LLJJIJI(180.0f, edgeEffectLIZ3, recordingCanvasBeginRecording);
            edgeEffectLIZ3.finish();
        }
        EdgeEffect edgeEffect11 = c20087013ie2.LIZLLL;
        if (edgeEffect11 == null) {
            z3 = false;
        } else {
            z3 = !edgeEffect11.isFinished();
        }
        if (z3) {
            EdgeEffect edgeEffectLJ = c20087013ie2.LJ();
            if (!LLJJIJI(0.0f, edgeEffectLJ, recordingCanvasBeginRecording) && !zLLJJIJI) {
                zLLJJIJI = false;
            } else {
                zLLJJIJI = true;
            }
            if (c20087013ie2.LJIIIZ()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.LLJJIII.LIZJ() >> 32));
                EdgeEffect edgeEffectLIZ4 = c20087013ie2.LJII;
                if (edgeEffectLIZ4 == null) {
                    edgeEffectLIZ4 = c20087013ie2.LIZ(EnumC1684030tvN.Vertical);
                    c20087013ie2.LJII = edgeEffectLIZ4;
                }
                C20087213ig.LIZLLL(edgeEffectLIZ4, C20087213ig.LIZIZ(edgeEffectLJ), fIntBitsToFloat2);
            }
        }
        if (C20087013ie.LJIIIIZZ(c20087013ie2.LJIIJ)) {
            EdgeEffect edgeEffectLIZ5 = c20087013ie2.LJIIJ;
            if (edgeEffectLIZ5 == null) {
                edgeEffectLIZ5 = c20087013ie2.LIZ(EnumC1684030tvN.Horizontal);
                c20087013ie2.LJIIJ = edgeEffectLIZ5;
            }
            LLJJIJI(270.0f, edgeEffectLIZ5, recordingCanvasBeginRecording);
            edgeEffectLIZ5.finish();
        }
        if (c20087013ie2.LJI != null && (!r0.isFinished())) {
            EdgeEffect edgeEffectLIZLLL = c20087013ie2.LIZLLL();
            if (!LLJJIJI(90.0f, edgeEffectLIZLLL, recordingCanvasBeginRecording) && !zLLJJIJI) {
                zLLJJIJI = false;
            } else {
                zLLJJIJI = true;
            }
            if (c20087013ie2.LJII()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.LLJJIII.LIZJ() & 4294967295L));
                EdgeEffect edgeEffectLIZ6 = c20087013ie2.LJIIJ;
                if (edgeEffectLIZ6 == null) {
                    edgeEffectLIZ6 = c20087013ie2.LIZ(EnumC1684030tvN.Horizontal);
                    c20087013ie2.LJIIJ = edgeEffectLIZ6;
                }
                C20087213ig.LIZLLL(edgeEffectLIZ6, C20087213ig.LIZIZ(edgeEffectLIZLLL), fIntBitsToFloat3);
            }
        }
        if (C20087013ie.LJIIIIZZ(c20087013ie2.LJIIIIZZ)) {
            EdgeEffect edgeEffectLIZ7 = c20087013ie2.LJIIIIZZ;
            if (edgeEffectLIZ7 == null) {
                edgeEffectLIZ7 = c20087013ie2.LIZ(EnumC1684030tvN.Vertical);
                c20087013ie2.LJIIIIZZ = edgeEffectLIZ7;
            }
            LLJJIJI(0.0f, edgeEffectLIZ7, recordingCanvasBeginRecording);
            edgeEffectLIZ7.finish();
        }
        if (c20087013ie2.LJ != null && (!r0.isFinished())) {
            EdgeEffect edgeEffectLIZIZ = c20087013ie2.LIZIZ();
            if (!LLJJIJI(180.0f, edgeEffectLIZIZ, recordingCanvasBeginRecording) && !zLLJJIJI) {
                zLLJJIJI = false;
            } else {
                zLLJJIJI = true;
            }
            if (c20087013ie2.LJFF()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.LLJJIII.LIZJ() >> 32));
                EdgeEffect edgeEffectLIZ8 = c20087013ie2.LJIIIIZZ;
                if (edgeEffectLIZ8 == null) {
                    edgeEffectLIZ8 = c20087013ie2.LIZ(EnumC1684030tvN.Vertical);
                    c20087013ie2.LJIIIIZZ = edgeEffectLIZ8;
                }
                C20087213ig.LIZLLL(edgeEffectLIZ8, C20087213ig.LIZIZ(edgeEffectLIZIZ), 1 - fIntBitsToFloat4);
            }
        }
        if (zLLJJIJI) {
            this.LLJJIII.LIZLLL();
        }
        if (z2) {
            f = 0.0f;
        } else {
            f = fLJJJJLL;
        }
        if (z) {
            fLJJJJLL = 0.0f;
        }
        EnumC1671200tag layoutDirection = interfaceC1669010tX9.getLayoutDirection();
        C1696880uG6 c1696880uG6 = new C1696880uG6();
        c1696880uG6.LIZ = recordingCanvasBeginRecording;
        long jLIZIZ = interfaceC1669010tX9.LIZIZ();
        InterfaceC1690500u5o interfaceC1690500u5oLIZLLL = interfaceC1669010tX9.LJLJI().LIZLLL();
        EnumC1671200tag enumC1671200tagLJ = interfaceC1669010tX9.LJLJI().LJ();
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ2 = interfaceC1669010tX9.LJLJI().LIZ();
        long jLIZIZ2 = interfaceC1669010tX9.LJLJI().LIZIZ();
        C1695970uEd c1695970uEd = interfaceC1669010tX9.LJLJI().LIZIZ;
        C1695230uDR c1695230uDRLJLJI = interfaceC1669010tX9.LJLJI();
        c1695230uDRLJLJI.LJI(interfaceC1669010tX9);
        c1695230uDRLJLJI.LJII(layoutDirection);
        c1695230uDRLJLJI.LJFF(c1696880uG6);
        c1695230uDRLJLJI.LIZJ(jLIZIZ);
        c1695230uDRLJLJI.LIZIZ = null;
        c1696880uG6.save();
        try {
            interfaceC1669010tX9.LJLJI().LIZ.LJII(f, fLJJJJLL);
            try {
                interfaceC1669010tX9.LLIIJLIL();
                float f2 = -f;
                float f3 = -fLJJJJLL;
                interfaceC1669010tX9.LJLJI().LIZ.LJII(f2, f3);
                c1696880uG6.LJIIJ();
                C1695230uDR c1695230uDRLJLJI2 = interfaceC1669010tX9.LJLJI();
                c1695230uDRLJLJI2.LJI(interfaceC1690500u5oLIZLLL);
                c1695230uDRLJLJI2.LJII(enumC1671200tagLJ);
                c1695230uDRLJLJI2.LJFF(interfaceC1686290tz1LIZ2);
                c1695230uDRLJLJI2.LIZJ(jLIZIZ2);
                c1695230uDRLJLJI2.LIZIZ = c1695970uEd;
                LLJJIJIIJIL().endRecording();
                int iSave = canvas2.save();
                canvas2.translate(f2, f3);
                canvas2.drawRenderNode(LLJJIJIIJIL());
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC1669010tX9.LJLJI().LIZ.LJII(-f, -fLJJJJLL);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c1696880uG6.LJIIJ();
            C1695230uDR c1695230uDRLJLJI3 = interfaceC1669010tX9.LJLJI();
            c1695230uDRLJLJI3.LJI(interfaceC1690500u5oLIZLLL);
            c1695230uDRLJLJI3.LJII(enumC1671200tagLJ);
            c1695230uDRLJLJI3.LJFF(interfaceC1686290tz1LIZ2);
            c1695230uDRLJLJI3.LIZJ(jLIZIZ2);
            c1695230uDRLJLJI3.LIZIZ = c1695970uEd;
            throw th2;
        }
    }

    public C20086813ic(C20065413fA c20065413fA, C20086713ib c20086713ib, C20087013ie c20087013ie) {
        this.LLJJIII = c20086713ib;
        this.LLJJIJI = c20087013ie;
        LLJJ(c20065413fA);
    }

    public static boolean LLJJIJI(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
