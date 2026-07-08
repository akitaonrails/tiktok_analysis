package X;

import X.AbstractC960400b6E;
import X.C955670ayb;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0b6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960410b6F<D extends C955670ayb, VH extends AbstractC960400b6E<D>> extends C0J8P<D, VH> {
    public abstract VH LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract String LJIIIZ();

    @Override // X.C0J8P
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC960400b6E) viewHolder).onViewAttachedToWindow();
    }

    @Override // X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC960400b6E) viewHolder).LLIILZL();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public void LJI(VH vh) {
        vh.onViewDetachedFromWindow();
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        AbstractC960400b6E abstractC960400b6E = (AbstractC960400b6E) viewHolder;
        C955670ayb c955670ayb = (C955670ayb) obj;
        int adapterPosition = abstractC960400b6E.getAdapterPosition();
        int i = AbstractC960400b6E.LLILLL;
        abstractC960400b6E.L5(null, adapterPosition, c955670ayb);
        C960940b76.LIZIZ(abstractC960400b6E, c955670ayb);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        long jLongValue;
        C955440ayE c955440ayE = new C955440ayE();
        AbstractC960400b6E abstractC960400b6ELJIIIIZZ = LJIIIIZZ(layoutInflater, viewGroup);
        String strLJIIIZ = LJIIIZ();
        if (C956080azG.LJ) {
            c955440ayE.LJIIL(strLJIIIZ, Scene.SCENE_SERVICE, true);
            Map<String, Long> map = C956080azG.LIZJ;
            Long l = (Long) ((LinkedHashMap) map).get(strLJIIIZ);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(strLJIIIZ, Long.valueOf(1 + jLongValue));
            c955440ayE.LJIIL(Long.valueOf(jLongValue), "count", true);
            c955440ayE.LJIILIIL();
            c955440ayE.LJIJJLI("inflate_view");
        }
        return abstractC960400b6ELJIIIIZZ;
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        AbstractC960400b6E abstractC960400b6E = (AbstractC960400b6E) viewHolder;
        C955670ayb c955670ayb = (C955670ayb) obj;
        abstractC960400b6E.L5(list, abstractC960400b6E.getAdapterPosition(), c955670ayb);
        C960940b76.LIZIZ(abstractC960400b6E, c955670ayb);
    }
}
