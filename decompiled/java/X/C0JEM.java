package X;

import Y.ACListenerS111S0200000_7;
import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JEM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JEM extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILLL = 0;
    public final ShortVideoContext LL;
    public final Function0<C0JEO> LLILLJJLI;

    public C0JEM(View view, Activity activity, ShortVideoContext shortVideoContext, AwS551S0100000_7 awS551S0100000_7) {
        super(view);
        this.LL = shortVideoContext;
        this.LLILLJJLI = awS551S0100000_7;
        C1378990lzN.LIZIZ(view, Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, null, null, 30);
        C786410Ut5.I7(new ACListenerS111S0200000_7(activity, this, 19), view);
    }
}
