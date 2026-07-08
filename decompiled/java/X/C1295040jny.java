package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295040jny implements InterfaceC1295800jpC, InterfaceC1295830jpF, InterfaceC1294590jnF, InterfaceC1295760jp8 {
    public final C1294440jn0 LIZ;
    public final RectF LIZIZ;
    public final Matrix LIZJ;
    public final Path LIZLLL;
    public final RectF LJ;
    public final String LJFF;
    public final boolean LJI;
    public final List<InterfaceC1295810jpD> LJII;
    public final C1295950jpR LJIIIIZZ;
    public List<InterfaceC1295830jpF> LJIIIZ;
    public final C1295050jnz LJIIJ;

    public final List<InterfaceC1295830jpF> LIZIZ() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new ArrayList();
            for (int i = 0; i < this.LJII.size(); i++) {
                InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJII, i);
                if (interfaceC1295810jpD instanceof InterfaceC1295830jpF) {
                    this.LJIIIZ.add((InterfaceC1295830jpF) interfaceC1295810jpD);
                }
            }
        }
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIIIIZZ.invalidateSelf();
    }

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        this.LIZJ.reset();
        C1295050jnz c1295050jnz = this.LJIIJ;
        if (c1295050jnz != null) {
            this.LIZJ.set(c1295050jnz.LIZLLL());
        }
        this.LIZLLL.reset();
        if (this.LJI) {
            return this.LIZLLL;
        }
        for (int size = this.LJII.size() - 1; size >= 0; size--) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJII, size);
            if (interfaceC1295810jpD instanceof InterfaceC1295830jpF) {
                this.LIZLLL.addPath(((InterfaceC1295830jpF) interfaceC1295810jpD).getPath(), this.LIZJ);
            }
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.LJII.size());
        arrayList.addAll(list);
        for (int size = this.LJII.size() - 1; size >= 0; size--) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJII, size);
            interfaceC1295810jpD.LIZLLL(arrayList, this.LJII.subList(0, size));
            arrayList.add(interfaceC1295810jpD);
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        C1295050jnz c1295050jnz = this.LJIIJ;
        if (c1295050jnz != null) {
            c1295050jnz.LIZJ(c1295400joY, obj);
        }
    }

    @Override // X.InterfaceC1295800jpC
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        int iIntValue;
        if (this.LJI) {
            return;
        }
        this.LIZJ.set(matrix);
        C1295050jnz c1295050jnz = this.LJIIJ;
        if (c1295050jnz != null) {
            this.LIZJ.preConcat(c1295050jnz.LIZLLL());
            AbstractC1295190joD<Integer, Integer> abstractC1295190joD = this.LJIIJ.LJIIIZ;
            if (abstractC1295190joD == null) {
                iIntValue = 100;
            } else {
                iIntValue = abstractC1295190joD.LJFF().intValue();
            }
            i = (int) ((((iIntValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = false;
        if (this.LJIIIIZZ.LLJJJJ) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.LJII.size()) {
                    break;
                }
                if ((ListProtector.get(this.LJII, i2) instanceof InterfaceC1295800jpC) && (i3 = i3 + 1) >= 2) {
                    if (i != 255) {
                        z = true;
                        this.LIZIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
                        LJI(this.LIZIZ, this.LIZJ, true);
                        this.LIZ.setAlpha(i);
                        canvas.saveLayer(this.LIZIZ, this.LIZ);
                        i = 255;
                    }
                } else {
                    i2++;
                }
            }
        }
        for (int size = this.LJII.size() - 1; size >= 0; size--) {
            Object obj = ListProtector.get(this.LJII, size);
            if (obj instanceof InterfaceC1295800jpC) {
                ((InterfaceC1295800jpC) obj).LIZ(canvas, this.LIZJ, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LIZJ.set(matrix);
        C1295050jnz c1295050jnz = this.LJIIJ;
        if (c1295050jnz != null) {
            this.LIZJ.preConcat(c1295050jnz.LIZLLL());
        }
        this.LJ.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.LJII.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJII, size);
                if (interfaceC1295810jpD instanceof InterfaceC1295800jpC) {
                    ((InterfaceC1295800jpC) interfaceC1295810jpD).LJI(this.LJ, this.LIZJ, z);
                    rectF.union(this.LJ);
                }
            } else {
                return;
            }
        }
    }

    public C1295040jny(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294860jng c1294860jng, C1294720jnS c1294720jnS) {
        C1295320joQ c1295320joQ;
        String str = c1294860jng.LIZ;
        boolean z = c1294860jng.LIZJ;
        List<InterfaceC1294510jn7> list = c1294860jng.LIZIZ;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC1295810jpD interfaceC1295810jpDLIZ = ((InterfaceC1294510jn7) ListProtector.get(list, i2)).LIZ(c1295950jpR, c1294720jnS, abstractC1295030jnx);
            if (interfaceC1295810jpDLIZ != null) {
                arrayList.add(interfaceC1295810jpDLIZ);
            }
        }
        List<InterfaceC1294510jn7> list2 = c1294860jng.LIZIZ;
        while (true) {
            if (i < list2.size()) {
                InterfaceC1294510jn7 interfaceC1294510jn7 = (InterfaceC1294510jn7) ListProtector.get(list2, i);
                if (interfaceC1294510jn7 instanceof C1295320joQ) {
                    c1295320joQ = (C1295320joQ) interfaceC1294510jn7;
                    break;
                }
                i++;
            } else {
                c1295320joQ = null;
                break;
            }
        }
        this(c1295950jpR, abstractC1295030jnx, str, z, arrayList, c1295320joQ);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        if (!c1295090jo3.LIZJ(i, this.LJFF) && !"__container".equals(this.LJFF)) {
            return;
        }
        if (!"__container".equals(this.LJFF)) {
            String str = this.LJFF;
            c1295090jo32.getClass();
            C1295090jo3 c1295090jo33 = new C1295090jo3(c1295090jo32);
            c1295090jo33.LIZ.add(str);
            if (c1295090jo3.LIZ(i, this.LJFF)) {
                C1295090jo3 c1295090jo34 = new C1295090jo3(c1295090jo33);
                c1295090jo34.LIZIZ = this;
                ((ArrayList) list).add(c1295090jo34);
            }
            c1295090jo32 = c1295090jo33;
        }
        if (c1295090jo3.LIZLLL(i, this.LJFF)) {
            int iLIZIZ = i + c1295090jo3.LIZIZ(i, this.LJFF);
            for (int i2 = 0; i2 < this.LJII.size(); i2++) {
                InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJII, i2);
                if (interfaceC1295810jpD instanceof InterfaceC1295760jp8) {
                    ((InterfaceC1295760jp8) interfaceC1295810jpD).LJ(c1295090jo3, iLIZIZ, list, c1295090jo32);
                }
            }
        }
    }

    public C1295040jny(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, String str, boolean z, List<InterfaceC1295810jpD> list, C1295320joQ c1295320joQ) {
        this.LIZ = new C1294440jn0();
        this.LIZIZ = new RectF();
        this.LIZJ = new Matrix();
        this.LIZLLL = new Path();
        this.LJ = new RectF();
        this.LJFF = str;
        this.LJIIIIZZ = c1295950jpR;
        this.LJI = z;
        this.LJII = list;
        if (c1295320joQ != null) {
            C1295050jnz c1295050jnz = new C1295050jnz(c1295320joQ);
            this.LJIIJ = c1295050jnz;
            c1295050jnz.LIZ(abstractC1295030jnx);
            c1295050jnz.LIZIZ(this);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list, size);
            if (interfaceC1295810jpD instanceof InterfaceC1295820jpE) {
                arrayList.add(interfaceC1295810jpD);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((InterfaceC1295820jpE) ListProtector.get(arrayList, size2)).LIZIZ(arrayList2.listIterator(arrayList2.size()));
            } else {
                return;
            }
        }
    }
}
