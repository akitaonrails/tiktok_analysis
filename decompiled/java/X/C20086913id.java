package X;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: X.13id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20086913id extends AbstractC20055313dX implements InterfaceC1695680uEA {
    public final C20086713ib LLJJIII;
    public final C20087013ie LLJJIJI;
    public final InterfaceC1679150tnV LLJJIJIIJIL;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        boolean z;
        boolean zLLJJIJI;
        boolean z2;
        this.LLJJIII.LJIIIIZZ(interfaceC1669010tX9.LIZIZ());
        if (C1680770tq7.LJ(interfaceC1669010tX9.LIZIZ())) {
            interfaceC1669010tX9.LLIIJLIL();
            return;
        }
        interfaceC1669010tX9.LLIIJLIL();
        ((C13FE) this.LLJJIII.LIZLLL).getValue();
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
        Canvas canvas = C1296530jqN.LIZ;
        Canvas canvas2 = ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ;
        C20087013ie c20087013ie = this.LLJJIJI;
        EdgeEffect edgeEffect = c20087013ie.LJFF;
        if (edgeEffect == null) {
            z = false;
        } else {
            z = !edgeEffect.isFinished();
        }
        if (z) {
            EdgeEffect edgeEffectLIZJ = c20087013ie.LIZJ();
            float f = -Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L));
            zLLJJIJI = LLJJIJI(270.0f, (((long) Float.floatToRawIntBits(interfaceC1669010tX9.LJJJJLL(this.LLJJIJIIJIL.LIZ(interfaceC1669010tX9.getLayoutDirection())))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), edgeEffectLIZJ, canvas2);
        } else {
            zLLJJIJI = false;
        }
        EdgeEffect edgeEffect2 = c20087013ie.LIZLLL;
        if (edgeEffect2 == null) {
            z2 = false;
        } else {
            z2 = !edgeEffect2.isFinished();
        }
        if (z2) {
            if (!LLJJIJI(0.0f, (((long) Float.floatToRawIntBits(interfaceC1669010tX9.LJJJJLL(this.LLJJIJIIJIL.LIZLLL()))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), c20087013ie.LJ(), canvas2) && !zLLJJIJI) {
                zLLJJIJI = false;
            } else {
                zLLJJIJI = true;
            }
        }
        if (c20087013ie.LJI != null && (!r0.isFinished())) {
            if (!LLJJIJI(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((-C814420VxA.LIZIZ(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)))) + interfaceC1669010tX9.LJJJJLL(this.LLJJIJIIJIL.LIZJ(interfaceC1669010tX9.getLayoutDirection())))) & 4294967295L), c20087013ie.LIZLLL(), canvas2) && !zLLJJIJI) {
                zLLJJIJI = false;
            } else {
                zLLJJIJI = true;
            }
        }
        if (c20087013ie.LJ != null && (!r0.isFinished())) {
            EdgeEffect edgeEffectLIZIZ = c20087013ie.LIZIZ();
            float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(this.LLJJIJIIJIL.LIZIZ());
            float f2 = -Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32));
            if (!LLJJIJI(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L))) + fLJJJJLL)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), edgeEffectLIZIZ, canvas2) && !zLLJJIJI) {
                return;
            }
        } else if (!zLLJJIJI) {
            return;
        }
        this.LLJJIII.LIZLLL();
    }

    public C20086913id(C20065413fA c20065413fA, C20086713ib c20086713ib, C20087013ie c20087013ie, InterfaceC1679150tnV interfaceC1679150tnV) {
        this.LLJJIII = c20086713ib;
        this.LLJJIJI = c20087013ie;
        this.LLJJIJIIJIL = interfaceC1679150tnV;
        LLJJ(c20065413fA);
    }

    public static boolean LLJJIJI(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
