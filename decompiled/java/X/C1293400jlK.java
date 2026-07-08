package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293400jlK implements InterfaceC1293690jln, InterfaceC1291770jih, InterfaceC1292610jk3 {
    public final Path LIZ = new Path();
    public final RectF LIZIZ = new RectF();
    public final String LIZJ;
    public final C1291430ji9 LIZLLL;
    public final AbstractC1293310jlB<?, PointF> LJ;
    public final C1293110jkr LJFF;
    public final C1293040jkk LJI;
    public C1293500jlU LJII;
    public boolean LJIIIIZZ;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJIIIIZZ = false;
        this.LIZLLL.invalidateSelf();
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        if (this.LJIIIIZZ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        PointF pointFLJ = this.LJFF.LJ();
        float f = pointFLJ.x / 2.0f;
        float f2 = pointFLJ.y / 2.0f;
        C1293040jkk c1293040jkk = this.LJI;
        float fFloatValue = c1293040jkk == null ? 0.0f : c1293040jkk.LJ().floatValue();
        float fMin = Math.min(f, f2);
        if (fFloatValue > fMin) {
            fFloatValue = fMin;
        }
        PointF pointFLJ2 = this.LJ.LJ();
        this.LIZ.moveTo(pointFLJ2.x + f, (pointFLJ2.y - f2) + fFloatValue);
        this.LIZ.lineTo(pointFLJ2.x + f, (pointFLJ2.y + f2) - fFloatValue);
        if (fFloatValue > 0.0f) {
            RectF rectF = this.LIZIZ;
            float f3 = pointFLJ2.x + f;
            float f4 = fFloatValue * 2.0f;
            float f5 = pointFLJ2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            this.LIZ.arcTo(this.LIZIZ, 0.0f, 90.0f, false);
        }
        this.LIZ.lineTo((pointFLJ2.x - f) + fFloatValue, pointFLJ2.y + f2);
        if (fFloatValue > 0.0f) {
            RectF rectF2 = this.LIZIZ;
            float f6 = pointFLJ2.x - f;
            float f7 = pointFLJ2.y + f2;
            float f8 = fFloatValue * 2.0f;
            rectF2.set(f6, f7 - f8, f8 + f6, f7);
            this.LIZ.arcTo(this.LIZIZ, 90.0f, 90.0f, false);
        }
        this.LIZ.lineTo(pointFLJ2.x - f, (pointFLJ2.y - f2) + fFloatValue);
        if (fFloatValue > 0.0f) {
            RectF rectF3 = this.LIZIZ;
            float f9 = pointFLJ2.x - f;
            float f10 = pointFLJ2.y - f2;
            float f11 = fFloatValue * 2.0f;
            rectF3.set(f9, f10, f9 + f11, f11 + f10);
            this.LIZ.arcTo(this.LIZIZ, 180.0f, 90.0f, false);
        }
        this.LIZ.lineTo((pointFLJ2.x + f) - fFloatValue, pointFLJ2.y - f2);
        if (fFloatValue > 0.0f) {
            RectF rectF4 = this.LIZIZ;
            float f12 = pointFLJ2.x + f;
            float f13 = fFloatValue * 2.0f;
            float f14 = pointFLJ2.y - f2;
            rectF4.set(f12 - f13, f14, f12, f13 + f14);
            this.LIZ.arcTo(this.LIZIZ, 270.0f, 90.0f, false);
        }
        this.LIZ.close();
        C1293420jlM.LIZIZ(this.LIZ, this.LJII);
        this.LJIIIIZZ = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, i);
            if (interfaceC1291780jii instanceof C1293500jlU) {
                C1293500jlU c1293500jlU = (C1293500jlU) interfaceC1291780jii;
                if (c1293500jlU.LIZIZ == EnumC994260byq.Simultaneously) {
                    this.LJII = c1293500jlU;
                    c1293500jlU.LIZIZ(this);
                }
            }
        }
    }

    public C1293400jlK(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1293490jlT c1293490jlT) {
        this.LIZJ = c1293490jlT.LIZ;
        this.LIZLLL = c1291430ji9;
        AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ = c1293490jlT.LIZIZ.LIZ();
        this.LJ = abstractC1293310jlBLIZ;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ2 = c1293490jlT.LIZJ.LIZ();
        this.LJFF = (C1293110jkr) abstractC1293310jlBLIZ2;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ3 = c1293490jlT.LIZLLL.LIZ();
        this.LJI = (C1293040jkk) abstractC1293310jlBLIZ3;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ3);
        abstractC1293310jlBLIZ.LIZ(this);
        abstractC1293310jlBLIZ2.LIZ(this);
        abstractC1293310jlBLIZ3.LIZ(this);
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
