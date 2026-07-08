package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1338750kwT extends LinearLayout implements InterfaceC1338780kwW {
    public final C1338700kwO LL;

    public C1338750kwT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.InterfaceC1338780kwW
    public final void LJJJJJL(GodaV2Style godaV2Style) {
        ArrayList<Float> arrayList;
        Float f;
        if (godaV2Style != null) {
            arrayList = godaV2Style.margin;
        } else {
            arrayList = null;
        }
        Float fValueOf = Float.valueOf(0.0f);
        int i = 0;
        List listLJIIJJI = C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i >= 0) {
                float fFloatValue = ((Number) obj).floatValue();
                if (arrayList != null && (f = (Float) C13LP.LJJJLZIJ(i, arrayList)) != null) {
                    fFloatValue = f.floatValue();
                }
                arrayList2.add(Integer.valueOf((int) (fFloatValue * Resources.getSystem().getDisplayMetrics().density)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        setTag(R.id.eh2, new C1015980cXs(arrayList2));
        this.LL.LIZLLL(godaV2Style, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 29));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.LJ(canvas, getWidth(), getHeight(), new AwS599S0100000_20(this, 30));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            C1338700kwO c1338700kwO = this.LL;
            int width = getWidth();
            int height = getHeight();
            c1338700kwO.getClass();
            C1338700kwO.LJFF(width, height, view);
        }
    }

    public C1338750kwT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1338700kwO c1338700kwO = new C1338700kwO(this);
        this.LL = c1338700kwO;
        c1338700kwO.LJI();
    }

    public /* synthetic */ C1338750kwT(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.LL.LJII();
        }
    }
}
