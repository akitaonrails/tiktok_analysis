package X;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U5R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U5R extends RecyclerView.ViewHolder {
    public final C1324720kZq LL;
    public final View LLILLJJLI;
    public final C20515815Po LLILLL;
    public ViewStub LLILZ;
    public View LLILZIL;
    public ViewStub LLILZLL;
    public C20743416Fc LLIZ;

    public final void I5() {
        View viewLJLLLL;
        if (this.LLILZ == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.c3e);
            this.LLILZ = viewStub;
            this.LLILZIL = (viewStub == null || (viewLJLLLL = C786410Ut5.LJLLLL(viewStub)) == null) ? null : viewLJLLLL.findViewById(R.id.c3d);
        }
    }

    public C0U5R(View view) {
        super(view);
        this.LL = (C1324720kZq) view.findViewById(R.id.kb6);
        View viewFindViewById = view.findViewById(R.id.uke);
        this.LLILLJJLI = viewFindViewById;
        C20515815Po c20515815Po = (C20515815Po) view.findViewById(R.id.nl1);
        this.LLILLL = c20515815Po;
        c20515815Po.setCircleRadius((int) C497740JfY.LIZIZ(14.0f));
        c20515815Po.setStrokeWidth((int) C497740JfY.LIZIZ(4.0f));
        c20515815Po.setMaxProgress(100);
        if (C768880UEc.LIZ()) {
            viewFindViewById.setBackgroundResource(R.drawable.eew);
        }
    }
}
