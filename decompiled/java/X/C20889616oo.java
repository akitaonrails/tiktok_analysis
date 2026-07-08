package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20889616oo extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new FrameLayout(context, attributeSet) { // from class: X.0DHt
            {
                int i;
                super(context, attributeSet, 0);
                if (((Boolean) C07Q1.LIZ.getValue()).booleanValue() && TakoEnterMethodListExperiment.LIZ(((Boolean) C0B15.LIZ.getValue()).booleanValue())) {
                    i = R.layout.fp8;
                } else {
                    i = R.layout.fp7;
                }
                C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
            }
        };
    }
}
