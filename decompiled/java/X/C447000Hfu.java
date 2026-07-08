package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Hfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447000Hfu extends FrameLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public final C1322110kVd LL;
    public final C1322110kVd LLILLJJLI;
    public C0HZZ LLILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerHook.viewPostDelay(this, new ARunnableS106S0100000_6((Object) this, 102), 500L);
    }

    public C447000Hfu(C19EG c19eg) {
        super(c19eg, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d1m, this, true);
        this.LL = (C1322110kVd) findViewById(R.id.jzt);
        this.LLILLJJLI = (C1322110kVd) findViewById(R.id.jzu);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.e26);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.cnw);
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.cny);
        TextView textView = (TextView) findViewById(R.id.tv_tip);
        TextView textView2 = (TextView) findViewById(R.id.zhs);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 52));
        C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 53));
        C786410Ut5.U8(c197039127h2, new ACListenerS141S0100000_6(this, 54));
        textView.setText(getContext().getString(2131821241));
        textView2.setText(getContext().getString(2131821240));
        c197039127h.setText(getContext().getString(2131821239));
        c197039127h2.setText(getContext().getString(2131821242));
    }

    public static List LIZ(C1322110kVd c1322110kVd) {
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

    /* JADX WARN: Type inference failed for: r1v3, types: [REQUEST, X.0kbR] */
    public final void LIZIZ(C0HZZ c0hzz) {
        this.LLILLL = c0hzz;
        C1324750kZt.LJIIIZ(this.LL, Uri.fromFile(new C0VSJ(c0hzz.LIZ)).toString(), -1, -1);
        C1322110kVd c1322110kVd = this.LLILLJJLI;
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(c0hzz.LIZIZ));
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.IMMEDIATE;
        ?? LIZ = c1325700kbQLIZLLL.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
    }
}
