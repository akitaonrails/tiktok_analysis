package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.15Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20529315Ut extends RecyclerView.ViewHolder {
    public final int LL;
    public final C197039127h LLILLJJLI;
    public C15TU LLILLL;
    public final /* synthetic */ C20529215Us LLILZ;

    public final ExploreCustomTopicStruct I5() {
        return (ExploreCustomTopicStruct) C13LP.LJJJLZIJ(getBindingAdapterPosition(), this.LLILZ.LLILLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20529315Ut(C20529215Us c20529215Us, View view) {
        super(view);
        this.LLILZ = c20529215Us;
        this.LL = (int) (((double) C497820Jfg.LIZ(view.getContext())) * 0.72d);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.yej);
        this.LLILLJJLI = c197039127h;
        try {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            c384050F3z.LIZJ = Float.valueOf(view.getContext().getResources().getDimension(R.dimen.b4));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            c197039127h.LJJJJL(new AwS397S0200000_31(c384050F3z.LIZ(view.getContext()), this, 140));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
