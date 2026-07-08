package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998630c5t extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final LinearLayout LLILZ;
    public final LinearLayout LLILZIL;
    public final List<Integer> LLILZLL;

    public C998630c5t(Context context) {
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.vv, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        this.LLILLJJLI = viewSd.findViewById(R.id.hff);
        this.LLILLL = viewSd.findViewById(R.id.eoo);
        this.LLILZ = (LinearLayout) viewSd.findViewById(R.id.you_see_container);
        this.LLILZIL = (LinearLayout) viewSd.findViewById(R.id.pvh);
        List<Integer> listLJIIJJI = C1697810uHb.LJIIJJI(1, 2, 3, 4, 5);
        this.LLILZLL = listLJIIJJI;
        int screenWidth = ScreenUtils.getScreenWidth(context);
        float fLIZJ = C12ES.LIZJ(4.0f, context);
        float fLIZJ2 = (screenWidth - C12ES.LIZJ(56.0f, context)) / 5;
        int i = (int) (((fLIZJ2 - (fLIZJ * 2)) / 9) * 16);
        Context context2 = getContext();
        ((Number) ListProtector.get(listLJIIJJI, 0)).intValue();
        Context context3 = getContext();
        ((Number) ListProtector.get(listLJIIJJI, 1)).intValue();
        Context context4 = getContext();
        ((Number) ListProtector.get(listLJIIJJI, 2)).intValue();
        Context context5 = getContext();
        ((Number) ListProtector.get(listLJIIJJI, 3)).intValue();
        Context context6 = getContext();
        ((Number) ListProtector.get(listLJIIJJI, 4)).intValue();
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(new C998640c5u(context2, new C998650c5v(true, false, true)), new C998640c5u(context3, new C998650c5v(true, true, true)), new C998640c5u(context4, new C998650c5v(true, true, true)), new C998640c5u(context5, new C998650c5v(true, true, true)), new C998640c5u(context6, new C998650c5v(true, false, true)));
        Iterator it2 = listLJIIJJI2.iterator();
        while (it2.hasNext()) {
            this.LLILZ.addView((View) it2.next(), new LinearLayout.LayoutParams((int) fLIZJ2, -2));
        }
        Iterator it3 = listLJIIJJI2.iterator();
        while (it3.hasNext()) {
            ((C998640c5u) it3.next()).setBgHeight(i);
        }
        Context context7 = getContext();
        ((Number) ListProtector.get(this.LLILZLL, 0)).intValue();
        Context context8 = getContext();
        ((Number) ListProtector.get(this.LLILZLL, 1)).intValue();
        Context context9 = getContext();
        ((Number) ListProtector.get(this.LLILZLL, 2)).intValue();
        Context context10 = getContext();
        ((Number) ListProtector.get(this.LLILZLL, 3)).intValue();
        Context context11 = getContext();
        ((Number) ListProtector.get(this.LLILZLL, 4)).intValue();
        List listLJIIJJI3 = C1697810uHb.LJIIJJI(new C998640c5u(context7, new C998650c5v(true, false, false)), new C998640c5u(context8, new C998650c5v(false, false, false)), new C998640c5u(context9, new C998650c5v(false, false, false)), new C998640c5u(context10, new C998650c5v(false, false, false)), new C998640c5u(context11, new C998650c5v(true, false, false)));
        Iterator it4 = listLJIIJJI3.iterator();
        while (it4.hasNext()) {
            this.LLILZIL.addView((View) it4.next(), new LinearLayout.LayoutParams((int) fLIZJ2, -2));
        }
        Iterator it5 = listLJIIJJI3.iterator();
        while (it5.hasNext()) {
            ((C998640c5u) it5.next()).setBgHeight(i);
        }
    }

    public final void setExitListener(Function0<Unit> function0) {
        C786410Ut5.I7(new ACListenerS151S0100000_16(function0, 52), this.LLILLJJLI);
        C786410Ut5.I7(new ACListenerS151S0100000_16(function0, 53), this.LLILLL);
    }
}
