package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0r7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576270r7Z extends ConstraintLayout {
    public InterfaceC1576290r7b LL;
    public EnumC1576280r7a LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;

    public final InterfaceC1576290r7b getCallback() {
        return this.LL;
    }

    public final void setCallback(InterfaceC1576290r7b interfaceC1576290r7b) {
        this.LL = interfaceC1576290r7b;
    }

    public final void setEndStatus(EnumC1576280r7a enumC1576280r7a) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        this.LLILLJJLI = enumC1576280r7a;
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            EnumC1576280r7a enumC1576280r7a2 = EnumC1576280r7a.LINK;
            if (enumC1576280r7a == enumC1576280r7a2) {
                i = R.raw.icon_chevron_right_slim_thin_ltr;
            } else {
                i = R.raw.icon_x_mark;
            }
            tuxIconView.setIconRes(i);
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (enumC1576280r7a == enumC1576280r7a2) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            layoutParams.width = iLIZIZ;
            if (enumC1576280r7a == enumC1576280r7a2) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            layoutParams.height = iLIZIZ2;
            C786410Ut5.M6(tuxIconView, layoutParams);
        }
    }

    public final void setStartIconRes(int i) {
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        }
    }

    public final void setSubTitle(String str) {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setTitle(String str) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public C1576270r7Z(Context context, AttributeSet attributeSet) {
        Object c098200Yq;
        float fFloatValue;
        super(context, attributeSet);
        this.LLILLJJLI = EnumC1576280r7a.LINK;
        C786410Ut5.Sd(R.layout.cwj, C786410Ut5.ne(context), this);
        try {
            c098200Yq = Float.valueOf(getContext().getResources().getDimension(R.dimen.b5));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Float f = (Float) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C427690Gpr.LJ(this, fFloatValue);
        C786410Ut5.I7(new C1620690sHD(this, 1), this);
        this.LLILLL = (TuxIconView) findViewById(R.id.k44);
        this.LLILZ = (TuxTextView) findViewById(R.id.tv_title);
        findViewById(R.id.k4r);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k0c);
        C1097070eef.LIZ(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.I7(new C1620690sHD(this, 2), tuxIconView);
        this.LLILZLL = tuxIconView;
        this.LLILZIL = (TuxTextView) findViewById(R.id.tv_sub_title);
        setEndStatus(EnumC1576280r7a.LINK);
    }
}
