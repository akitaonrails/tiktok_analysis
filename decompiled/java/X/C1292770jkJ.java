package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292770jkJ implements InterfaceC1292580jk0, InterfaceC1293690jln, InterfaceC1291770jih {
    public final Path LIZ;
    public final Paint LIZIZ;
    public final AbstractC1292630jk5 LIZJ;
    public final String LIZLLL;
    public final List<InterfaceC1292610jk3> LJ;
    public final C1293060jkm LJFF;
    public final C1293030jkj LJI;
    public C1293360jlG LJII;
    public final C1291430ji9 LJIIIIZZ;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJIIIIZZ.invalidateSelf();
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list2, i);
            if (interfaceC1291780jii instanceof InterfaceC1292610jk3) {
                ((ArrayList) this.LJ).add(interfaceC1291780jii);
            }
        }
    }

    @Override // X.InterfaceC1292580jk0
    public final void LJ(RectF rectF, Matrix matrix) {
        this.LIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJ).size(); i++) {
            this.LIZ.addPath(((InterfaceC1292610jk3) ListProtector.get(this.LJ, i)).getPath(), matrix);
        }
        this.LIZ.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        if (t == InterfaceC1292740jkG.LIZ) {
            LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LIZLLL) {
            LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t != InterfaceC1292740jkG.LJJ) {
            return;
        }
        if (c1292420jjk == null) {
            this.LJII = null;
            return;
        }
        C1293360jlG c1293360jlG = new C1293360jlG(c1292420jjk);
        this.LJII = c1293360jlG;
        c1293360jlG.LIZ(this);
        this.LIZJ.LIZIZ(this.LJII);
    }

    public C1292770jkJ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1292780jkK c1292780jkK) {
        Path path = new Path();
        this.LIZ = path;
        this.LIZIZ = new Paint(1);
        this.LJ = new ArrayList();
        this.LIZJ = abstractC1292630jk5;
        this.LIZLLL = c1292780jkK.LIZJ;
        this.LJIIIIZZ = c1291430ji9;
        if (c1292780jkK.LIZLLL != null && c1292780jkK.LJ != null) {
            path.setFillType(c1292780jkK.LIZIZ);
            AbstractC1293310jlB<Integer, Integer> abstractC1293310jlBLIZ = c1292780jkK.LIZLLL.LIZ();
            this.LJFF = (C1293060jkm) abstractC1293310jlBLIZ;
            abstractC1293310jlBLIZ.LIZ(this);
            abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
            AbstractC1293310jlB<Integer, Integer> abstractC1293310jlBLIZ2 = c1292780jkK.LJ.LIZ();
            this.LJI = (C1293030jkj) abstractC1293310jlBLIZ2;
            abstractC1293310jlBLIZ2.LIZ(this);
            abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
            return;
        }
        this.LJFF = null;
        this.LJI = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1292580jk0
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        this.LIZIZ.setColor(LJ().intValue());
        Paint paint = this.LIZIZ;
        int iMin = Math.min(255, (int) ((((i / 255.0f) * LJ().intValue()) / 100.0f) * 255.0f));
        paint.setAlpha(Math.max(0, iMin));
        C1293360jlG c1293360jlG = this.LJII;
        if (c1293360jlG != null) {
            this.LIZIZ.setColorFilter((ColorFilter) c1293360jlG.LJ());
        }
        this.LIZ.reset();
        for (int i2 = 0; i2 < ((ArrayList) this.LJ).size(); i2++) {
            this.LIZ.addPath(((InterfaceC1292610jk3) ListProtector.get(this.LJ, i2)).getPath(), matrix);
        }
        canvas.drawPath(this.LIZ, this.LIZIZ);
        C1291650jiV.LIZ();
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
