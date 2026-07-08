package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0REF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REF extends C09AY implements Function0<GradientDrawable> {
    public C0REF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        int[] iArrLLII;
        C589800NBi.LIZ.getClass();
        if (C589800NBi.LIZIZ()) {
            float[] fArr = CellGradualComponent.LLLFZ;
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList.add(Integer.valueOf(Color.argb(C13LZ.LJ((int) (255 * f), 0, 255), 0, 0, 0)));
            }
            iArrLLII = C13LP.LLII(arrayList);
        } else {
            iArrLLII = CellGradualComponent.LLLFFI;
        }
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArrLLII);
    }
}
