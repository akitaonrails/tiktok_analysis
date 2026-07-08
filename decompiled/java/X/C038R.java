package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.038R, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038R extends LinearLayout {
    public final TuxTextView LL;
    public final View LLILLJJLI;

    public C038R(Context context) {
        super(context, null, 0);
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bwx, layoutInflaterCloneInContext, this);
        }
        this.LL = (TuxTextView) findViewById(R.id.xyq);
        View viewFindViewById = findViewById(R.id.kkr);
        this.LLILLJJLI = viewFindViewById;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1p);
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
    }
}
