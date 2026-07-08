package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS574S0100000_30;
import mf.a;

/* JADX INFO: renamed from: X.14Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20226514Ch extends LinearLayout {
    public TuxTextView LL;
    public C1841350y17 LLILLJJLI;
    public TuxTextView LLILLL;
    public int LLILZ;
    public Function0<Unit> LLILZIL;

    public final Function0<Unit> getClickListener() {
        return this.LLILZIL;
    }

    public final int getType() {
        return this.LLILZ;
    }

    public C20226514Ch(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.fpk, C786410Ut5.ne(context), this);
        this.LL = (TuxTextView) findViewById(R.id.pq3);
        this.LLILLJJLI = (C1841350y17) findViewById(R.id.pq5);
        this.LLILLL = (TuxTextView) findViewById(R.id.pq2);
        C427690Gpr.LJ(this, 0.0f);
    }

    public final void setClickListener(Function0<Unit> function0) {
        this.LLILZIL = function0;
        View.OnClickListener aCListenerS164S0100000_30 = new ACListenerS164S0100000_30(function0, 26);
        if (C1848410yCV.LIZ) {
            aCListenerS164S0100000_30 = new f(aCListenerS164S0100000_30);
        }
        a aVar = new a(aCListenerS164S0100000_30);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C1841350y17 c1841350y17 = this.LLILLJJLI;
        if (c1841350y17 != null) {
            c1841350y17.setInterceptToggleListener(new AwS574S0100000_30(function0, (Function0<Unit>) 318));
        }
    }

    public final void setType(int i) {
        this.LLILZ = i;
    }
}
