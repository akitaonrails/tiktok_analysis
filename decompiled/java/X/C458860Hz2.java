package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Hz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C458860Hz2 extends C455920HuI {
    public final C1578970rBv LLJJ;
    public final FrameLayout LLJJI;

    public final FrameLayout getActionPanel() {
        return this.LLJJI;
    }

    public final void setupActionsBeforeShow(List<? extends C1562980qm8<?>> list) {
        this.LLJJ.LLLFZ(list);
    }

    public C458860Hz2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C458860Hz2(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, attributeSet, i);
        C1578970rBv c1578970rBv = new C1578970rBv(context);
        this.LLJJ = c1578970rBv;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.nqb);
        this.LLJJI = frameLayout;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nqa);
        recyclerView.setAdapter(c1578970rBv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        int i2 = 0;
        setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)));
        recyclerView.setOverScrollMode(2);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        float[] fArr = new float[8];
        do {
            fArr[i2] = fLIZIZ;
            i2++;
        } while (i2 < 8);
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint.setColor(iIntValue);
        frameLayout.setBackground(shapeDrawable);
    }
}
