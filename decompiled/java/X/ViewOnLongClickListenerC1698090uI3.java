package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import iyl.i3;

/* JADX INFO: renamed from: X.0uI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewOnLongClickListenerC1698090uI3 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1698090uI3 viewOnLongClickListenerC1698090uI3, View view) {
        i3 i3VarLJIILLIIL = ((C1659140tHE) viewOnLongClickListenerC1698090uI3.l0).LJIILLIIL();
        if (i3VarLJIILLIIL != null) {
            C1659140tHE c1659140tHE = (C1659140tHE) viewOnLongClickListenerC1698090uI3.l0;
            c1659140tHE.LLIZLLLIL.LIZIZ((C1654400t9a) viewOnLongClickListenerC1698090uI3.l1, i3VarLJIILLIIL.LLIZLLLIL, i3VarLJIILLIIL);
            return i3VarLJIILLIIL.LLIZLLLIL;
        }
        return false;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1698090uI3 viewOnLongClickListenerC1698090uI3, View view) {
        ((C1643970ssl) viewOnLongClickListenerC1698090uI3.l0).LJII.onNext((EffectCategoryResponse) viewOnLongClickListenerC1698090uI3.l1);
        return true;
    }

    public ViewOnLongClickListenerC1698090uI3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
