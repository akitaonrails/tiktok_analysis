package X;

import X.AbstractC20055413dY;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS239S0300000_30;

/* JADX INFO: renamed from: X.13gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ViewOnDragListenerC20076513gx implements View.OnDragListener, InterfaceC20078013hC {
    public final InterfaceC1631620sYq<C1696700uFo, C1680770tq7, Function1<? super InterfaceC1675870tiD, Unit>, Boolean> LIZ;
    public final C20076613gy LIZIZ = new C20076613gy(0);
    public final C835410Wpv<InterfaceC20076713gz> LIZJ = new C835410Wpv<>(0);
    public final AndroidDragAndDropManager$modifier$1 LIZLLL = new AbstractC1685820tyG<C20076613gy>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // X.AbstractC1685820tyG
        public final AbstractC20055413dY LJIJI() {
            return this.LIZIZ.LIZIZ;
        }

        public final int hashCode() {
            return this.LIZIZ.LIZIZ.hashCode();
        }

        @Override // X.AbstractC1685820tyG
        public final /* bridge */ /* synthetic */ void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC20076513gx(C1696680uFm c1696680uFm) {
        this.LIZ = c1696680uFm;
    }

    @Override // X.InterfaceC20078013hC
    public final boolean LIZ(InterfaceC20076713gz interfaceC20076713gz) {
        return this.LIZJ.contains(interfaceC20076713gz);
    }

    @Override // X.InterfaceC20078013hC
    public final void LIZIZ(InterfaceC20076713gz interfaceC20076713gz) {
        this.LIZJ.add(interfaceC20076713gz);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C20078813hK c20078813hK = new C20078813hK(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                C20076613gy c20076613gy = this.LIZIZ;
                c20076613gy.getClass();
                C013C c013c = new C013C();
                AwS239S0300000_30 awS239S0300000_30 = new AwS239S0300000_30(c20078813hK, c20076613gy, c013c, 16);
                if (awS239S0300000_30.invoke(c20076613gy) == EnumC20045413bw.ContinueTraversal) {
                    C20050913cp.LIZJ(c20076613gy, awS239S0300000_30);
                }
                boolean z = c013c.element;
                C835410Wpv<InterfaceC20076713gz> c835410Wpv = this.LIZJ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    ((InterfaceC20076713gz) c835430Wpx.next()).LJLL(c20078813hK);
                }
                return z;
            case 2:
                this.LIZIZ.LJJJLL(c20078813hK);
                return false;
            case 3:
                return this.LIZIZ.LJJZZIII(c20078813hK);
            case 4:
                this.LIZIZ.LJJZ(c20078813hK);
                this.LIZJ.clear();
                return false;
            case 5:
                this.LIZIZ.LLIIIL(c20078813hK);
                return false;
            case 6:
                this.LIZIZ.LJJJI(c20078813hK);
                return false;
            default:
                return false;
        }
    }
}
