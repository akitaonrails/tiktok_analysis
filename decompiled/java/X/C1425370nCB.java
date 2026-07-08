package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425370nCB extends ConstraintLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public C1419770n39 LL;
    public final C1322110kVd LLILLJJLI;
    public final C1322110kVd LLILLL;
    public final ViewGroup LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerHook.viewPostDelay(this, new ARunnableS122S0100000_22(this, 91), 500L);
    }

    public static List e0(C1322110kVd c1322110kVd) {
        ArrayList arrayList = new ArrayList();
        C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(c1322110kVd, AbstractC21616419ik.LJIILL, 1.2f);
        c21616519ilLJIILL.LJI(1.0f);
        arrayList.add(c21616519ilLJIILL);
        C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(c1322110kVd, AbstractC21616419ik.LJIILLIIL, 1.2f);
        c21616519ilLJIILL2.LJI(1.0f);
        arrayList.add(c21616519ilLJIILL2);
        C21616519il c21616519ilLJIILL3 = C1619980sG4.LJIILL(c1322110kVd, AbstractC21616419ik.LJIIZILJ, 5.0f);
        c21616519ilLJIILL3.LJI(0.0f);
        arrayList.add(c21616519ilLJIILL3);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [REQUEST, X.0kbR] */
    public static void h0(C1322110kVd c1322110kVd, String str) {
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.IMMEDIATE;
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
    }

    public C1425370nCB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.doi, this, true);
        this.LLILLJJLI = (C1322110kVd) findViewById(R.id.jzt);
        this.LLILLL = (C1322110kVd) findViewById(R.id.jzu);
        this.LLILZ = (ViewGroup) findViewById(R.id.d_1);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.e26);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.f77);
        C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 42));
        C786410Ut5.U8(c197039127h, new ACListenerS156S0100000_22(this, 43));
    }
}
