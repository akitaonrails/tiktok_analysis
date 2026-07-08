package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.tiktok.myna.render.render.MynaElement;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AwS22S0410000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21332218e0 extends AbstractC21332518e3<C21327618dG> implements InterfaceC21332418e2 {
    public C21332318e1 h;

    @Override // X.AbstractC21333318eB
    public final int LJJJIL() {
        return 0;
    }

    @Override // X.AbstractC21333318eB
    public final int LJJJJ() {
        return 0;
    }

    @Override // X.AbstractC21333318eB
    public final C21339618fC LJJJZ() {
        return C21333518eD.LJ(this, false);
    }

    @Override // X.AbstractC21333318eB
    public void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
    }

    @Override // X.AbstractC21333318eB
    public final void LJJII() {
        if (this.c > 0) {
            int iLJZL = LJZL();
            for (int i = 0; i < iLJZL; i++) {
                AbstractC21333318eB<?> abstractC21333318eBLJZI = LJZI(i);
                if (abstractC21333318eBLJZI != null && abstractC21333318eBLJZI.LJIILL()) {
                    abstractC21333318eBLJZI.LJJII();
                }
            }
        }
        super.LJJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21332418e2
    public final InterfaceC21333118e9 getMynaDrawChild() {
        C21332318e1 c21332318e1 = this.h;
        if (c21332318e1 == null) {
            c21332318e1 = new C21332318e1(this);
            if (!LJIILL()) {
                ((AbstractC21332918e7) getView()).setDrawChildProxy(c21332318e1);
            }
            this.h = c21332318e1;
        }
        return c21332318e1;
    }

    public C21332218e0(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.LLJZ = "row";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // X.AbstractC21333318eB
    public final boolean LJIJ(Canvas canvas) {
        boolean z;
        ?? view;
        Object view2;
        if (this.c <= 0 && !LJIILL()) {
            return false;
        }
        C21332318e1 c21332318e1 = this.h;
        Intrinsics.LJFF(this.LLJJJ, "visible");
        if (LJIILL()) {
            AbstractC21332518e3<?> abstractC21332518e3 = this.LLLZI;
            if (abstractC21332518e3 != null) {
                view2 = abstractC21332518e3.getView();
            } else {
                view2 = null;
            }
            z = true;
            view = view2;
        } else {
            z = false;
            view = getView();
        }
        if (c21332318e1 != null && view != 0) {
            C1337990kvF.LIZJ(this, canvas, new AwS22S0410000_32((View) view, canvas, this, c21332318e1, z, 1));
            return true;
        }
        if (this.h == null) {
            C1325860kbg.LIZIZ(null, new AwS576S0100000_32(this, 867), C2097608Jq.LJ());
        }
        if (view != 0) {
            return false;
        }
        C1325860kbg.LIZIZ(null, new AwS576S0100000_32(this, 868), C2097608Jq.LJ());
        return false;
    }

    @Override // X.AbstractC21332518e3, X.AbstractC21333318eB
    public final void LJJJLL(MynaElement mynaElement) {
        super.LJJJLL(mynaElement);
        if (LJIILL()) {
            getMynaDrawChild();
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZZI(List<C1337880kv4> list) {
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    @Override // X.AbstractC21332518e3
    public final void LLFZ(AbstractC21333318eB<?> abstractC21333318eB) {
        if (abstractC21333318eB.LJIILL()) {
            ((C21332318e1) getMynaDrawChild()).LIZIZ = null;
            return;
        }
        C21332318e1 c21332318e1 = this.h;
        if (c21332318e1 == null) {
            return;
        }
        c21332318e1.LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21332518e3
    public final void LLIIII(AbstractC21333318eB<?> abstractC21333318eB) {
        C21332318e1 c21332318e1 = this.h;
        if (c21332318e1 != null) {
            ((WeakHashMap) c21332318e1.LIZJ.getValue()).remove(abstractC21333318eB);
            c21332318e1.LIZIZ = null;
            if (!abstractC21333318eB.LJIILL() && !c21332318e1.LIZ.LJIILL()) {
                ((AbstractC21332918e7) c21332318e1.LIZ.getView()).setChildrenDrawingOrderEnabled(!((WeakHashMap) c21332318e1.LIZJ.getValue()).isEmpty());
            }
        }
    }

    @Override // X.AbstractC21333318eB
    /* JADX INFO: renamed from: LLIIIZ, reason: merged with bridge method [inline-methods] */
    public void LJJJLIIL(C21327618dG c21327618dG) {
        c21327618dG.LL = this.LLILZLL;
        C21326718d7 c21326718d7 = this.LL.LIZ;
        c21327618dG.LLILLJJLI = c21326718d7.LJIL;
        c21327618dG.LLILLL = c21326718d7.LJJI;
        c21327618dG.LLILZ = c21326718d7.LJJIJ;
    }

    @Override // X.AbstractC21333318eB
    /* JADX INFO: renamed from: LLIIJI, reason: merged with bridge method [inline-methods] */
    public C21327618dG LJJJLZIJ(Context context) {
        return new C21327618dG(context);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJZZIII(List<C1337880kv4> list, C1337880kv4 c1337880kv4) {
        float f;
        if (c1337880kv4.LIZIZ == 1) {
            f = c1337880kv4.LIZ;
        } else {
            f = 0.0f;
        }
        this.LLILZLL.setBorder(EnumC1321440kUY.ALL, f);
        C1337990kvF.LJIIIIZZ(this, C1337850kv1.LIZJ(list));
    }

    @Override // X.AbstractC21333318eB
    public final long LJJJJZ(float f, EnumC1321460kUa enumC1321460kUa, float f2, EnumC1321460kUa enumC1321460kUa2) {
        return C1321430kUX.LIZ(0, 0);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIIJ(int i, int i2, int i3, int i4) {
        if (LJIILL()) {
            LJLJLLL(i, i2, i3, i4);
        } else {
            super.LJJLIIIIJ(i, i2, i3, i4);
        }
    }
}
