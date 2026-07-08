package X;

import android.view.View;
import com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0mw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415420mw8 {
    public final /* synthetic */ C1415280mvu LIZ;

    public C1415420mw8(C1415280mvu c1415280mvu) {
        this.LIZ = c1415280mvu;
    }

    public final void LIZ(RecommendEffectLayoutManager recommendEffectLayoutManager, View view, float f) {
        boolean z;
        Number numberValueOf;
        boolean z2;
        float fAbs = Math.abs(f);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        if (fAbs == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            numberValueOf = Float.valueOf(1.0f);
        } else if (fAbs <= 2.0f) {
            numberValueOf = Double.valueOf(((double) 1.0f) - (((double) fAbs) * 0.2d));
        } else {
            numberValueOf = Float.valueOf(0.6f);
        }
        C786410Ut5.Ob(view, numberValueOf.floatValue());
        C786410Ut5.pc(view, numberValueOf.floatValue());
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.w65);
        if (fAbs == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c1324800kZy.setRectFRadius(C418440Gaw.LIZIZ(10));
            c1324800kZy.invalidate();
        } else if (fAbs == 1.0f || fAbs == 2.0f) {
            c1324800kZy.setRectFRadius(C418440Gaw.LIZIZ(10) * numberValueOf.floatValue());
            c1324800kZy.invalidate();
        }
        if (this.LIZ.LLLLILI().LIZ.LIZ) {
            int position = recommendEffectLayoutManager.getPosition(view);
            Float f2 = (Float) ((LinkedHashMap) this.LIZ.LLLFF).get(Integer.valueOf(position));
            if (f2 != null) {
                C1415280mvu c1415280mvu = this.LIZ;
                if (f2.floatValue() >= 0.1d && fAbs < 0.1d && System.currentTimeMillis() - c1415280mvu.LLLFFI > 50) {
                    C1415280mvu c1415280mvu2 = this.LIZ;
                    f2.floatValue();
                    new C0ZDN(c1415280mvu2.requireActivity()).LIZ(0);
                    c1415280mvu2.LLLFFI = System.currentTimeMillis();
                }
            }
            this.LIZ.LLLFF.put(Integer.valueOf(position), Float.valueOf(fAbs));
        }
    }
}
