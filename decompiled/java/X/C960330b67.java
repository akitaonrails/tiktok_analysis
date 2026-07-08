package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0b67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960330b67 extends AbstractC960410b6F<C958770b3b, C960300b64> {
    public final RecyclerView LIZIZ;
    public final InterfaceC960350b69 LIZJ;
    public final C11NJ LIZLLL = new C11NJ();

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "MultiCoHostRecapGuideViewBinder";
    }

    @Override // X.AbstractC960410b6F, X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC960400b6E) viewHolder).onViewDetachedFromWindow();
        this.LIZLLL.LJ();
    }

    @Override // X.AbstractC960410b6F
    /* JADX INFO: renamed from: LJIIJ */
    public final void LJI(AbstractC960400b6E abstractC960400b6E) {
        abstractC960400b6E.onViewDetachedFromWindow();
        this.LIZLLL.LJ();
    }

    public C960330b67(RunnableC781530UlD runnableC781530UlD, InterfaceC960350b69 interfaceC960350b69) {
        this.LIZIZ = runnableC781530UlD;
        this.LIZJ = interfaceC960350b69;
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gsh, viewGroup, false);
        return new AbstractC960400b6E<C958770b3b>(viewTd) { // from class: X.0b64
            public final C01GW LLILZ;

            @Override // X.AbstractC960400b6E
            public final String getName() {
                return "MultiCoHostRecapGuideViewHolder";
            }

            {
                super(viewTd);
                this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS559S0100000_15(viewTd, 703));
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
            @Override // X.AbstractC960400b6E
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void I5(java.util.List r27, int r28, java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 712
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C960300b64.I5(java.util.List, int, java.lang.Object):void");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void LJIIJJI(SpannableStringBuilder spannableStringBuilder, View view, List list, int i) {
        LayerDrawable layerDrawable;
        ?? r5 = 0;
        r5 = 0;
        LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) list.toArray(new Drawable[0]));
        if (list.size() == 2) {
            layerDrawable2.setLayerInset(0, 0, 0, (int) C497740JfY.LIZIZ(13.0f), 0);
            layerDrawable2.setLayerInset(1, (int) C497740JfY.LIZIZ(13.0f), 0, 0, 0);
            layerDrawable = layerDrawable2;
        } else {
            layerDrawable = layerDrawable2;
            if (list.size() == 3) {
                LayerDrawable layerDrawable3 = layerDrawable2;
                r5 = 0;
                layerDrawable3.setLayerInset(0, 0, 0, (int) C497740JfY.LIZIZ(26.0f), 0);
                layerDrawable3.setLayerInset(1, (int) C497740JfY.LIZIZ(13.0f), 0, (int) C497740JfY.LIZIZ(13.0f), 0);
                layerDrawable3.setLayerInset(2, (int) C497740JfY.LIZIZ(26.0f), 0, 0, 0);
                layerDrawable = layerDrawable3;
            }
        }
        layerDrawable.setBounds(r5, r5, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight());
        C416760GVu c416760GVu = new C416760GVu(layerDrawable);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, "{users}", r5, r5, 6);
        C786410Ut5.q2(spannableStringBuilder, c416760GVu, iLJJJ, iLJJJ + 7, 33);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, view.getContext()));
        if (i >= 0) {
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, i, spannableStringBuilder.length(), 34);
        }
        ((TextView) view.findViewById(R.id.ze2)).setText(spannableStringBuilder);
    }
}
