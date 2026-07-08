package X;

import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.ur.experiment.ManageBatchUnfollowAbilityExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265550j2P extends LinearLayout {
    public TuxTextView LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxSheet LLILZIL;
    public int LLILZLL;
    public Function1<? super Integer, Boolean> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public View LLJ;

    public final Function0<Unit> getOnManageFollowTextListener() {
        return this.LLIZLLLIL;
    }

    public C1265550j2P(Context context) {
        super(context, null, 0);
        this.LLILZLL = EnumC1155170gAN.DEFAULT.getValue();
        setupView(context);
        View view = this.LLILLJJLI;
        C786410Ut5.I7(new C1265800j2o(this, 3), view != null ? view : null);
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS154S0100000_19(this, 197));
        }
    }

    private final void setupView(Context context) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout;
        int i;
        C786410Ut5.Sd(R.layout.ejf, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.igw);
        this.LLILLJJLI = findViewById(R.id.vp6);
        this.LLILLL = (TuxTextView) findViewById(R.id.vp7);
        this.LLILZ = (TuxTextView) findViewById(R.id.nxn);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 16);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        int i2 = 0;
        setOrientation(0);
        boolean zBooleanValue = ((Boolean) ManageBatchUnfollowAbilityExp.LIZJ.getValue()).booleanValue();
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            view = null;
            view2 = null;
        } else {
            view = view2;
        }
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
            if (zBooleanValue) {
                layoutParams.weight = 1.0f;
                layoutParams.width = 0;
            } else {
                layoutParams.width = -2;
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.W5(view, layoutParams);
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            if (zBooleanValue) {
                C23250099c.LIZLLL((InterfaceC497601wk) C341890Dal.LIZ.getValue(), null, null, new C01LS("following_list", "show", null), 3);
            } else {
                i2 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i2);
        }
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            view3 = null;
        }
        if ((view3 instanceof LinearLayout) && (linearLayout = (LinearLayout) view3) != null) {
            if (zBooleanValue) {
                i = 8388627;
            } else {
                i = 17;
            }
            linearLayout.setGravity(i);
        }
    }

    public final void LIZ(int i) {
        String strLIZJ;
        Boolean boolInvoke;
        String str;
        int i2 = this.LLILZLL;
        EnumC1155170gAN enumC1155170gAN = EnumC1155170gAN.DEFAULT;
        if (i2 == enumC1155170gAN.getValue()) {
            strLIZJ = C1216270hkv.LIZJ(2131834829);
        } else {
            strLIZJ = C1216270hkv.LIZJ(2131834830);
        }
        Function1<? super Integer, Boolean> function1 = this.LLIZ;
        TuxTextView tuxTextView = null;
        if (function1 != null) {
            boolInvoke = function1.invoke(Integer.valueOf(this.LLILZLL));
        } else {
            boolInvoke = null;
        }
        if (Intrinsics.LJFF(boolInvoke, Boolean.FALSE)) {
            this.LLILZLL = i;
        } else {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            tuxTextView.setText(strLIZJ);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (this.LLILZLL == enumC1155170gAN.getValue()) {
            str = "default";
        } else {
            str = "latest";
        }
        c2344009Gk.LJIIIIZZ("to_status", str);
        C20684815ws.LJIILLIIL("livesdk_following_sort_change", c2344009Gk.LIZ);
    }

    public final void setOnManageFollowTextListener(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setSortChangeCallback(Function1<? super Integer, Boolean> function1) {
        this.LLIZ = function1;
    }

    public final void setStyle(String str) {
        TuxTextView tuxTextView = null;
        if (Intrinsics.LJFF(str, "left")) {
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
    }
}
