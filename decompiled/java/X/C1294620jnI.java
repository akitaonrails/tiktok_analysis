package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294620jnI implements InterfaceC1295830jpF, InterfaceC1294590jnF, InterfaceC1295880jpK {
    public final String LIZIZ;
    public final C1295950jpR LIZJ;
    public final C1295270joL LIZLLL;
    public final AbstractC1295190joD<?, PointF> LJ;
    public final C1294630jnJ LJFF;
    public boolean LJII;
    public final Path LIZ = new Path();
    public final C1294580jnE LJI = new C1294580jnE();

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJII = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        if (this.LJII) {
            return this.LIZ;
        }
        this.LIZ.reset();
        if (this.LJFF.LJ) {
            this.LJII = true;
            return this.LIZ;
        }
        PointF pointFLJFF = this.LIZLLL.LJFF();
        float f = pointFLJFF.x / 2.0f;
        float f2 = pointFLJFF.y / 2.0f;
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
        PointF pointFLJFF2 = this.LJ.LJFF();
        this.LIZ.offset(pointFLJFF2.x, pointFLJFF2.y);
        this.LIZ.close();
        this.LJI.LIZ(this.LIZ);
        this.LJII = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list, i);
            if (interfaceC1295810jpD instanceof C1294570jnD) {
                C1294570jnD c1294570jnD = (C1294570jnD) interfaceC1295810jpD;
                if (c1294570jnD.LIZJ == EnumC994250byp.SIMULTANEOUSLY) {
                    ((ArrayList) this.LJI.LIZ).add(c1294570jnD);
                    c1294570jnD.LIZIZ(this);
                }
            }
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        if (obj == InterfaceC1295080jo2.LJIIJ) {
            this.LIZLLL.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJIILIIL) {
                return;
            }
            this.LJ.LJIIJ(c1295400joY);
        }
    }

    public C1294620jnI(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294630jnJ c1294630jnJ) {
        this.LIZIZ = c1294630jnJ.LIZ;
        this.LIZJ = c1295950jpR;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ = c1294630jnJ.LIZJ.LIZ();
        this.LIZLLL = (C1295270joL) abstractC1295190joDLIZ;
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ2 = c1294630jnJ.LIZIZ.LIZ();
        this.LJ = abstractC1295190joDLIZ2;
        this.LJFF = c1294630jnJ;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295190joDLIZ2.LIZ(this);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }
}
