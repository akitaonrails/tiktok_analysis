package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.HorizontalTemplateListAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class ViewOnLayoutChangeListenerC391520FWs implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC391520FWs(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String strLJJJJJ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391520FWs);
        C0E48 c0e48LIZIZ = ((C0EBP) viewOnLayoutChangeListenerC391520FWs.l0).LIZIZ();
        if (c0e48LIZIZ == null || (nLETrackSlotLLLLLLIL = c0e48LIZIZ.LLLLLLIL()) == null || (strLJJJJJ = C351220Dpo.LJJJJJ(nLETrackSlotLLLLLLIL)) == null) {
            strLJJJJJ = "";
        }
        C0EDF.LJIIL((C0EDF) viewOnLayoutChangeListenerC391520FWs.l1, strLJJJJJ, C0E17.DIRECT_SCROLL, 8);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391520FWs);
        ((C386950FFd) viewOnLayoutChangeListenerC391520FWs.l0).LJ();
        ((Function0) viewOnLayoutChangeListenerC391520FWs.l1).invoke();
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) viewOnLayoutChangeListenerC391520FWs.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391520FWs);
        ((Function0) viewOnLayoutChangeListenerC391520FWs.l1).invoke();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0FGR c0fgrLIZJ;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391520FWs);
        try {
            ((C391040FUw) viewOnLayoutChangeListenerC391520FWs.l0).getClass();
            C391040FUw.LIZIZ();
            C0FJZ c0fjz = (C0FJZ) viewOnLayoutChangeListenerC391520FWs.l1;
            C450720Hlu c450720Hlu = new C450720Hlu(c0fjz.LIZIZ.getContext());
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391600mJi.LJII = 3000L;
            c1391600mJi.LJIJJ = false;
            c450720Hlu.LJIIJ(2131850133);
            c0fjz.LJIIJJI = c450720Hlu.LIZIZ();
            C0P0T c0p0t = ((C0FJZ) viewOnLayoutChangeListenerC391520FWs.l1).LJIIJJI;
            if (c0p0t != null) {
                c0p0t.show();
            }
            C0FF8 c0ff8 = ((C0FJZ) viewOnLayoutChangeListenerC391520FWs.l1).LIZJ.LJFF;
            if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                c0fgrLIZJ.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC391520FWs);
        int width = ((TuxIconView) viewOnLayoutChangeListenerC391520FWs.l0).getWidth();
        int height = ((TuxIconView) viewOnLayoutChangeListenerC391520FWs.l0).getHeight();
        if (width > 0 && height > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable drawable = ((TuxIconView) viewOnLayoutChangeListenerC391520FWs.l0).getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, width, height);
                drawable.draw(canvas);
            }
            float f = height;
            LinearGradient linearGradient = new LinearGradient(0.0f, f, 0.0f, 0.0f, (int[]) viewOnLayoutChangeListenerC391520FWs.l1, (float[]) null, Shader.TileMode.CLAMP);
            Paint paint = new Paint(1);
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawRect(0.0f, 0.0f, width, f, paint);
            ((TuxIconView) viewOnLayoutChangeListenerC391520FWs.l0).setImageDrawable(new BitmapDrawable(((TuxIconView) viewOnLayoutChangeListenerC391520FWs.l0).getResources(), bitmapCreateBitmap));
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC391520FWs viewOnLayoutChangeListenerC391520FWs, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        List list = (List) ((HorizontalTemplateListAssem) viewOnLayoutChangeListenerC391520FWs.l0).LLJJIJIL.getValue();
        try {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor((String) it2.next())));
            }
            int[] iArrLLII = C13LP.LLII(arrayList);
            int size = list.size();
            float[] fArr = new float[size];
            for (int i9 = 0; i9 < size; i9++) {
                fArr[i9] = i9 / (list.size() - 1);
            }
            ((TuxTextView) viewOnLayoutChangeListenerC391520FWs.l1).getPaint().setShader(new LinearGradient(0.0f, 0.0f, ((TuxTextView) viewOnLayoutChangeListenerC391520FWs.l1).getPaint().measureText(((TuxTextView) viewOnLayoutChangeListenerC391520FWs.l1).getText().toString()), 0.0f, iArrLLII, fArr, Shader.TileMode.CLAMP));
            ((TuxTextView) viewOnLayoutChangeListenerC391520FWs.l1).invalidate();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
