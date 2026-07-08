package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343470DdJ extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final TuxIconView getIcon() {
        return (TuxIconView) this.LL.getValue();
    }

    private final TuxTextView getText() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public C343470DdJ(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 490));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS548S0100000_4(context, 491));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        setBackgroundColor(C343420DdE.LIZJ(R.attr.c3, context));
        linearLayout.addView(getIcon(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))));
        View view = new View(context);
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        linearLayout.addView(view);
        linearLayout.addView(getText(), new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2, 17));
    }

    public final void setIconRes(int i) {
        getIcon().setIconRes(i);
    }

    public final void setText(String str) {
        getText().setText(str);
    }
}
