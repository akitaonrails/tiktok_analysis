package Y;

import X.C1348790lCf;
import X.C1907480zjm;
import X.C19U0;
import X.C19U1;
import X.C1C7U;
import X.C262110AOz;
import X.C279930Ay7;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C790600Uzq;
import X.C793770VBv;
import X.C814420VxA;
import X.InterfaceC1685420txc;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS0S1201000_4 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC1685420txc<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super View, Unit> interfaceC1685420txc;
        Layout layout = ((TuxTextView) this.l1).getLayout();
        if (layout == null) {
            return;
        }
        int lineLeft = C444960Hcc.LIZJ(((C1907480zjm) this.l2).getContext()) ? ((int) layout.getLineLeft(layout.getLineCount() - 1)) - ((TuxTextView) this.l1).getLeft() : ((TuxTextView) this.l1).getRight() - ((int) layout.getLineRight(layout.getLineCount() - 1));
        View contentEllipsizeView = ((C1907480zjm) this.l2).getContentEllipsizeView();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (contentEllipsizeView != null ? contentEllipsizeView.getLayoutParams() : null);
        if (C279930Ay7.LIZ()) {
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            marginLayoutParams.setMarginEnd(Math.max(lineLeft - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0));
            marginLayoutParams.bottomMargin = 0;
        } else if (((Number) C262110AOz.LIZ.getValue()).intValue() == 1) {
            marginLayoutParams.setMarginEnd(((lineLeft + ((int) ((TuxTextView) this.l1).getPaint().measureText(this.s0))) + (((int) ((TuxTextView) this.l1).getPaint().measureText("...")) / 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
        } else {
            marginLayoutParams.setMarginEnd(lineLeft - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-5));
            marginLayoutParams.width = this.i3;
        }
        View contentEllipsizeView2 = ((C1907480zjm) this.l2).getContentEllipsizeView();
        if (contentEllipsizeView2 != null) {
            C786410Ut5.W5(contentEllipsizeView2, marginLayoutParams);
        }
        View contentEllipsizeView3 = ((C1907480zjm) this.l2).getContentEllipsizeView();
        if (contentEllipsizeView3 != null) {
            C786410Ut5.LJLLLLLL(0, contentEllipsizeView3);
        }
        View contentEllipsizeView4 = ((C1907480zjm) this.l2).getContentEllipsizeView();
        if (contentEllipsizeView4 != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4((C1907480zjm) this.l2, 37), contentEllipsizeView4);
        }
        if (C279930Ay7.LIZ() || ((Number) C262110AOz.LIZ.getValue()).intValue() != 1 || (interfaceC1685420txc = ((C1907480zjm) this.l2).LLJIJIL) == null) {
            return;
        }
        interfaceC1685420txc.invoke(0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), ((C1907480zjm) this.l2).getContentEllipsizeView());
    }

    public final void LIZ$1() {
        C1348790lCf c1348790lCf = (C1348790lCf) this.l1;
        int i = this.i3;
        C19U1 c19u1 = (C19U1) this.l2;
        String str = this.s0;
        View viewSd = C786410Ut5.Sd(R.layout.a1e, C786410Ut5.ne(c1348790lCf.LIZJ), null);
        ((TextView) viewSd.findViewById(R.id.c8h)).setText(str);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.c8g);
        C19U0 tabAt = c19u1.getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZLLL(viewSd);
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(c1348790lCf, 11));
    }

    public static final void run$0(ARunnableS0S1201000_4 aRunnableS0S1201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SystemNotificationCellMiddleArea@c0f6.buildContentWithTime$4");
        try {
            aRunnableS0S1201000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SystemNotificationCellMiddleArea@c0f6.buildContentWithTime$4");
    }

    public static final void run$1(ARunnableS0S1201000_4 aRunnableS0S1201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("GiftChoosePanel@3980.setupViews$1$2");
        try {
            aRunnableS0S1201000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftChoosePanel@3980.setupViews$1$2");
    }

    public static final void run$2(ARunnableS0S1201000_4 aRunnableS0S1201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MinisRevisitMissionUiBinder@27ba.bindRewardIcon$1$onComplete$1");
        try {
            if (Intrinsics.LJFF(((SmartImageView) aRunnableS0S1201000_4.l1).getTag(aRunnableS0S1201000_4.i3), aRunnableS0S1201000_4.s0)) {
                C786410Ut5.LLFF(0, (SmartImageView) aRunnableS0S1201000_4.l1);
                TuxIconView tuxIconView = (TuxIconView) aRunnableS0S1201000_4.l2;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                ((SmartImageView) aRunnableS0S1201000_4.l1).invalidate();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisRevisitMissionUiBinder@27ba.bindRewardIcon$1$onComplete$1");
    }

    public static final void run$3(ARunnableS0S1201000_4 aRunnableS0S1201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("MinisRevisitMissionUiBinder@27ba.bindRewardIcon$1$onFailed$1");
        try {
            if (Intrinsics.LJFF(((SmartImageView) aRunnableS0S1201000_4.l1).getTag(aRunnableS0S1201000_4.i3), aRunnableS0S1201000_4.s0)) {
                C786410Ut5.LLFF(4, (SmartImageView) aRunnableS0S1201000_4.l1);
                TuxIconView tuxIconView = (TuxIconView) aRunnableS0S1201000_4.l2;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisRevisitMissionUiBinder@27ba.bindRewardIcon$1$onFailed$1");
    }

    public static final void run$4(ARunnableS0S1201000_4 aRunnableS0S1201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorStatusAndDuration$1");
        try {
            JSONObject jSONObjectLIZ = new C790600Uzq(aRunnableS0S1201000_4.s0, aRunnableS0S1201000_4.i3, (JSONObject) aRunnableS0S1201000_4.l1, null, null, (JSONObject) aRunnableS0S1201000_4.l2).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorStatusAndDuration", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorStatusAndDuration$1");
    }

    public ARunnableS0S1201000_4(Object obj, int i, String str, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i3 = i;
        this.s0 = str;
        this.l2 = obj2;
    }
}
