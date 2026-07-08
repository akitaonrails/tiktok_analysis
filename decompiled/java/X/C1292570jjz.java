package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jjz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292570jjz implements InterfaceC1292580jk0, InterfaceC1292610jk3, InterfaceC1293690jln, InterfaceC1291570jiN {
    public final Matrix LIZ;
    public final Path LIZIZ;
    public final RectF LIZJ;
    public final String LIZLLL;
    public final List<InterfaceC1291780jii> LJ;
    public final C1291430ji9 LJFF;
    public List<InterfaceC1292610jk3> LJI;
    public final C1292730jkF LJII;

    public final List<InterfaceC1292610jk3> LIZIZ() {
        if (this.LJI == null) {
            this.LJI = new ArrayList();
            for (int i = 0; i < this.LJ.size(); i++) {
                InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(this.LJ, i);
                if (interfaceC1291780jii instanceof InterfaceC1292610jk3) {
                    this.LJI.add((InterfaceC1292610jk3) interfaceC1291780jii);
                }
            }
        }
        return this.LJI;
    }

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJFF.invalidateSelf();
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        this.LIZ.reset();
        C1292730jkF c1292730jkF = this.LJII;
        if (c1292730jkF != null) {
            this.LIZ.set(c1292730jkF.LIZLLL());
        }
        this.LIZIZ.reset();
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(this.LJ, size);
            if (interfaceC1291780jii instanceof InterfaceC1292610jk3) {
                this.LIZIZ.addPath(((InterfaceC1292610jk3) interfaceC1291780jii).getPath(), this.LIZ);
            }
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.LJ.size());
        arrayList.addAll(list);
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(this.LJ, size);
            interfaceC1291780jii.LIZLLL(arrayList, this.LJ.subList(0, size));
            arrayList.add(interfaceC1291780jii);
        }
    }

    @Override // X.InterfaceC1292580jk0
    public final void LJ(RectF rectF, Matrix matrix) {
        this.LIZ.set(matrix);
        C1292730jkF c1292730jkF = this.LJII;
        if (c1292730jkF != null) {
            this.LIZ.preConcat(c1292730jkF.LIZLLL());
        }
        this.LIZJ.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.LJ.size() - 1; size >= 0; size--) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(this.LJ, size);
            if (interfaceC1291780jii instanceof InterfaceC1292580jk0) {
                ((InterfaceC1292580jk0) interfaceC1291780jii).LJ(this.LIZJ, this.LIZ);
                if (rectF.isEmpty()) {
                    rectF.set(this.LIZJ);
                } else {
                    rectF.set(Math.min(rectF.left, this.LIZJ.left), Math.min(rectF.top, this.LIZJ.top), Math.max(rectF.right, this.LIZJ.right), Math.max(rectF.bottom, this.LIZJ.bottom));
                }
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        C1292730jkF c1292730jkF = this.LJII;
        if (c1292730jkF != null) {
            c1292730jkF.LIZJ(t, c1292420jjk);
        }
    }

    public C1292570jjz(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1292560jjy c1292560jjy) {
        C1292750jkH c1292750jkH;
        String str = c1292560jjy.LIZ;
        List<InterfaceC1292590jk1> list = c1292560jjy.LIZIZ;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC1291780jii interfaceC1291780jiiLIZ = ((InterfaceC1292590jk1) ListProtector.get(list, i2)).LIZ(c1291430ji9, abstractC1292630jk5);
            if (interfaceC1291780jiiLIZ != null) {
                arrayList.add(interfaceC1291780jiiLIZ);
            }
        }
        List<InterfaceC1292590jk1> list2 = c1292560jjy.LIZIZ;
        while (true) {
            if (i < list2.size()) {
                InterfaceC1292590jk1 interfaceC1292590jk1 = (InterfaceC1292590jk1) ListProtector.get(list2, i);
                if (interfaceC1292590jk1 instanceof C1292750jkH) {
                    c1292750jkH = (C1292750jkH) interfaceC1292590jk1;
                    break;
                }
                i++;
            } else {
                c1292750jkH = null;
                break;
            }
        }
        this(c1291430ji9, abstractC1292630jk5, str, arrayList, c1292750jkH);
    }

    @Override // X.InterfaceC1292580jk0
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        this.LIZ.set(matrix);
        C1292730jkF c1292730jkF = this.LJII;
        if (c1292730jkF != null) {
            this.LIZ.preConcat(c1292730jkF.LIZLLL());
            i = (int) ((((LJ().intValue() / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.LJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ListProtector.get(this.LJ, size);
                if (obj instanceof InterfaceC1292580jk0) {
                    ((InterfaceC1292580jk0) obj).LIZ(canvas, this.LIZ, i);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        if (!c1291740jie.LIZJ(i, this.LIZLLL)) {
            return;
        }
        if (!"__container".equals(this.LIZLLL)) {
            String str = this.LIZLLL;
            c1291740jie2.getClass();
            C1291740jie c1291740jie3 = new C1291740jie(c1291740jie2);
            c1291740jie3.LIZ.add(str);
            if (c1291740jie.LIZ(i, this.LIZLLL)) {
                C1291740jie c1291740jie4 = new C1291740jie(c1291740jie3);
                c1291740jie4.LIZIZ = this;
                ((ArrayList) list).add(c1291740jie4);
            }
            c1291740jie2 = c1291740jie3;
        }
        if (c1291740jie.LIZLLL(i, this.LIZLLL)) {
            int iLIZIZ = i + c1291740jie.LIZIZ(i, this.LIZLLL);
            for (int i2 = 0; i2 < this.LJ.size(); i2++) {
                InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(this.LJ, i2);
                if (interfaceC1291780jii instanceof InterfaceC1291570jiN) {
                    ((InterfaceC1291570jiN) interfaceC1291780jii).LJFF(c1291740jie, iLIZIZ, list, c1291740jie2);
                }
            }
        }
    }

    public C1292570jjz(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, String str, List<InterfaceC1291780jii> list, C1292750jkH c1292750jkH) {
        this.LIZ = new Matrix();
        this.LIZIZ = new Path();
        this.LIZJ = new RectF();
        this.LIZLLL = str;
        this.LJFF = c1291430ji9;
        this.LJ = list;
        if (c1292750jkH != null) {
            C1292730jkF c1292730jkF = new C1292730jkF(c1292750jkH);
            this.LJII = c1292730jkF;
            c1292730jkF.LIZ(abstractC1292630jk5);
            c1292730jkF.LIZIZ(this);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, size);
            if (interfaceC1291780jii instanceof InterfaceC1292600jk2) {
                arrayList.add(interfaceC1291780jii);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((InterfaceC1292600jk2) ListProtector.get(arrayList, size2)).LIZIZ(arrayList2.listIterator(arrayList2.size()));
            } else {
                return;
            }
        }
    }
}
