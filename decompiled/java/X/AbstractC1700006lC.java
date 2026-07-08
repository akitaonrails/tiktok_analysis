package X;

import X.C1700106lD;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06lC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1700006lC<T extends C1700106lD> extends C06O6<T> implements InterfaceC453460HqK, InterfaceC453160Hpq {
    public final C1600706On LLILZ;
    public final C1634706af LLILZIL;
    public final C06OC LLILZLL;
    public final Set<C067L> LLIZ;

    public boolean LJIILIIL() {
        return false;
    }

    public abstract void LJIILJJIL(T t);

    public abstract void LJIILLIIL(T t);

    @Override // X.C06O6
    public final void LJ() {
        C453470HqL c453470HqL;
        View view = this.LLILLL;
        if (!(view instanceof C453470HqL) || (c453470HqL = (C453470HqL) view) == null) {
            return;
        }
        c453470HqL.LIZ(new AwS546S0100000_2(this, 1171));
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZ;
    }

    public AbstractC1700006lC(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = (C1634706af) c1600706On.LJIIJJI;
        this.LLILZLL = new C06OC(R.layout.crb);
        this.LLIZ = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
    }

    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        C453470HqL c453470HqL;
        C1700106lD c1700106lD = (C1700106lD) c06oo;
        View view = this.LLILLL;
        if ((view instanceof C453470HqL) && (c453470HqL = (C453470HqL) view) != null) {
            LJIILLIIL(c1700106lD);
            LJIILJJIL(c1700106lD);
            if (LJIILIIL()) {
                return Unit.LIZ;
            }
            c453470HqL.LIZJ(c1700106lD.LIZJ, C1017903yT.LIZ(), this, this);
        }
        return Unit.LIZ;
    }

    public final void LJIILL(StickerItem stickerItem, EnumC454490Hrz enumC454490Hrz, Rect rect) {
        InterfaceC1700206lE value = this.LLILZIL.LJIIIZ.getValue();
        if (value != null) {
            value.Up0(new C454070HrJ(stickerItem, enumC454490Hrz, rect, 20));
        }
    }
}
