package X;

import android.view.ContextThemeWrapper;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1188570h2F extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1188570h2F(Object obj) {
        super(1, obj, PoiFeedBottomAssem.class, "setRatingScoreHighlighted", "setRatingScoreHighlighted(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        PoiFeedBottomAssem poiFeedBottomAssem = (PoiFeedBottomAssem) this.receiver;
        poiFeedBottomAssem.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(poiFeedBottomAssem.getContext(), R.style.y0);
        if (zBooleanValue) {
            i = R.attr.a1h;
        } else {
            i = R.attr.a1k;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, contextThemeWrapper);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxTextView tuxTextView = poiFeedBottomAssem.LLJJJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(iIntValue);
            }
        }
        return Unit.LIZ;
    }
}
