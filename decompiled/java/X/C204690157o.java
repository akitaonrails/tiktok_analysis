package X;

import Y.AObjectS405S0100000_31;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.157o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204690157o extends FrameLayout {
    public View LL;
    public RecyclerView LLILLJJLI;
    public InterfaceC559980Lxk LLILLL;

    public final C204691157p getCurSelectItemData() {
        throw null;
    }

    public final int getCurSelectPos() {
        throw null;
    }

    public final void setEditListener(InterfaceC559980Lxk interfaceC559980Lxk) {
        this.LLILLL = interfaceC559980Lxk;
    }

    public C204690157o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d9o, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (RecyclerView) (viewTd == null ? null : viewTd).findViewById(R.id.xq5);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = this.LLILLJJLI;
        (recyclerView == null ? null : recyclerView).setLayoutManager(linearLayoutManager);
        View view = this.LL;
        C560180Ly4.LIZ((view == null ? null : view).findViewById(R.id.tzb), new AObjectS405S0100000_31(this, 9));
        View view2 = this.LL;
        C560180Ly4.LIZ((view2 != null ? view2 : null).findViewById(R.id.db0), new AObjectS405S0100000_31(this, 10));
    }
}
