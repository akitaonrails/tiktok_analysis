package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0INt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465630INt extends RecyclerView.ViewHolder {
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final View LLILZ;
    public final View LLILZIL;

    public C465630INt(View view) {
        Context context;
        Resources resources;
        Configuration configuration;
        super(view);
        this.LL = (C1324720kZq) view.findViewById(R.id.mvv);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.htv);
        this.LLILLL = (C16F5) view.findViewById(R.id.b_x);
        this.LLILZ = view.findViewById(R.id.o1m);
        this.LLILZIL = view.findViewById(R.id.o12);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && (context = view.getContext()) != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) C497740JfY.LIZIZ(250.0f);
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
