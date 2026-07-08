package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844470y69 extends ConstraintLayout {
    public static final int LLILZIL = C439101nJ.LIZ(36);
    public static final int LLILZLL = C439101nJ.LIZ(10);
    public static final int LLIZ = 2;
    public final FrameLayout LL;
    public final LiveIconView LLILLJJLI;
    public final LiveIconView LLILLL;
    public final View LLILZ;

    public final void setExitClickListener(Function0<Unit> function0) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(function0, 48));
        }
    }

    public C1844470y69(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1844470y69(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h7k, this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.i34);
        this.LL = frameLayout;
        findViewById(R.id.tv_title);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.lm8);
        this.LLILLL = (LiveIconView) findViewById(R.id.luo);
        this.LLILZ = findViewById(R.id.lup);
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (true) {
            ImageModel imageModel = null;
            if (!it2.hasNext()) {
                break;
            }
            C754570Tip c754570Tip = it2.next().LJIJJ;
            if (c754570Tip != null) {
                imageModel = c754570Tip.LIZJ;
            }
            arrayList.add(imageModel);
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C19RC c19rc = new C19RC(getContext());
                int i4 = LLILZIL;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
                layoutParams.setMarginStart(i2 * (i4 - LLILZLL));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19rc);
                c19rc.setLayoutParams(layoutParams);
                C19RX shapeAppearanceModel = c19rc.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C19RY c19ry = new C19RY(shapeAppearanceModel);
                C1844480y6A c1844480y6A = new C1844480y6A(0.5f);
                c19ry.LJ = c1844480y6A;
                c19ry.LJFF = c1844480y6A;
                c19ry.LJI = c1844480y6A;
                c19ry.LJII = c1844480y6A;
                c19rc.setShapeAppearanceModel(new C19RX(c19ry));
                c19rc.setStrokeColor(ColorStateList.valueOf(C497740JfY.LIZLLL(R.attr.c8d, getContext())));
                float fLIZIZ = (int) C497740JfY.LIZIZ(LLIZ);
                c19rc.setStrokeWidth(fLIZIZ);
                int i5 = (int) (fLIZIZ / 2);
                c19rc.setPadding(i5, i5, i5, i5);
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ((ImageModel) obj);
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJJI(c19rc);
                FrameLayout frameLayout2 = this.LL;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c19rc);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        FrameLayout frameLayout3 = this.LL;
        if (frameLayout3 != null) {
            frameLayout3.requestLayout();
        }
    }
}
