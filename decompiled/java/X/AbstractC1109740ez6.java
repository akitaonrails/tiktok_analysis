package X;

import X.AbstractC1109720ez4;
import androidx.recyclerview.widget.RecyclerView;
import cu0.a;
import cu0.b;
import java.util.List;

/* JADX INFO: renamed from: X.0ez6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1109740ez6<TEXT_MODEL extends a, PINNED_MODEL extends b<TEXT_MODEL>, VH extends AbstractC1109720ez4<TEXT_MODEL, PINNED_MODEL>> extends C0J8P<PINNED_MODEL, VH> {
    public C1109770ez9 LIZIZ;

    public final C1109770ez9 LJIIIIZZ() {
        C1109770ez9 c1109770ez9 = this.LIZIZ;
        if (c1109770ez9 != null) {
            return c1109770ez9;
        }
        return null;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        ((AbstractC1109720ez4) viewHolder).L5((C1109600eys) obj, C13BV.INSTANCE);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        ((AbstractC1109720ez4) viewHolder).L5((C1109600eys) obj, list);
    }
}
