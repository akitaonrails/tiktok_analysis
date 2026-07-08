package X;

import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910140zo4 extends C214906198m {
    public RecyclerView LL;
    public C1911810zql LLILLJJLI;
    public View LLILLL;

    public C1910140zo4(Context context, InterfaceC1911830zqn interfaceC1911830zqn) {
        super(context);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fiz, null, false);
        setContentView(viewTd);
        this.LL = (RecyclerView) viewTd.findViewById(R.id.wuh);
        this.LLILLL = viewTd.findViewById(R.id.c30);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C446980Hfs.LIZ(context, R.color.dr)));
        setFocusable(true);
        setAnimationStyle(R.style.ag6);
        View view = this.LLILLL;
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 84), view == null ? null : view);
        RecyclerView recyclerView = this.LL;
        (recyclerView == null ? null : recyclerView).setLayoutManager(new LinearLayoutManager(context, 1, false));
        C1911810zql c1911810zql = new C1911810zql(interfaceC1911830zqn);
        this.LLILLJJLI = c1911810zql;
        c1911810zql.setShowFooter(false);
        RecyclerView recyclerView2 = this.LL;
        recyclerView2 = recyclerView2 == null ? null : recyclerView2;
        C1911810zql c1911810zql2 = this.LLILLJJLI;
        recyclerView2.setAdapter(c1911810zql2 != null ? c1911810zql2 : null);
    }
}
