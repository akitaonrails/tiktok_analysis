package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293410jlL implements InterfaceC1292610jk3, InterfaceC1293690jln, InterfaceC1291770jih {
    public final Path LIZ = new Path();
    public final String LIZIZ;
    public final C1291430ji9 LIZJ;
    public final C1293110jkr LIZLLL;
    public final AbstractC1293310jlB<?, PointF> LJ;
    public final C1293540jlY LJFF;
    public C1293500jlU LJI;
    public boolean LJII;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJII = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        if (this.LJII) {
            return this.LIZ;
        }
        this.LIZ.reset();
        PointF pointFLJ = this.LIZLLL.LJ();
        float f = pointFLJ.x / 2.0f;
        float f2 = pointFLJ.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.LIZ.reset();
        if (this.LJFF.LIZLLL) {
            float f5 = -f2;
            this.LIZ.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.LIZ.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.LIZ.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.LIZ.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.LIZ.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.LIZ.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.LIZ.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.LIZ.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.LIZ.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.LIZ.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointFLJ2 = this.LJ.LJ();
        this.LIZ.offset(pointFLJ2.x, pointFLJ2.y);
        this.LIZ.close();
        C1293420jlM.LIZIZ(this.LIZ, this.LJI);
        this.LJII = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, i);
            if (interfaceC1291780jii instanceof C1293500jlU) {
                C1293500jlU c1293500jlU = (C1293500jlU) interfaceC1291780jii;
                if (c1293500jlU.LIZIZ == EnumC994260byq.Simultaneously) {
                    this.LJI = c1293500jlU;
                    c1293500jlU.LIZIZ(this);
                }
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        if (t == InterfaceC1292740jkG.LJI) {
            this.LIZLLL.LJIIIIZZ(c1292420jjk);
        } else {
            if (t != InterfaceC1292740jkG.LJII) {
                return;
            }
            this.LJ.LJIIIIZZ(c1292420jjk);
        }
    }

    public C1293410jlL(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1293540jlY c1293540jlY) {
        this.LIZIZ = c1293540jlY.LIZ;
        this.LIZJ = c1291430ji9;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ = c1293540jlY.LIZJ.LIZ();
        this.LIZLLL = (C1293110jkr) abstractC1293310jlBLIZ;
        AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ2 = c1293540jlY.LIZIZ.LIZ();
        this.LJ = abstractC1293310jlBLIZ2;
        this.LJFF = c1293540jlY;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        abstractC1293310jlBLIZ.LIZ(this);
        abstractC1293310jlBLIZ2.LIZ(this);
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
