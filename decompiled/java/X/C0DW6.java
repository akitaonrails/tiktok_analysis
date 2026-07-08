package X;

import android.content.Context;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0DW6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DW6 extends LinearLayoutCompat {
    public final C0DUC LLJJI;
    public Function1<? super C1175004ii, Unit> LLJJIII;

    public C0DW6(Context context) {
        int i;
        super(context, null, 0);
        setOrientation(1);
        int iLJI = C511520K4g.LJI() - ((int) C511520K4g.LIZ(18.0f));
        if (iLJI > 0) {
            i = iLJI / 7;
        } else {
            i = 0;
        }
        int iLIZ = (int) C511520K4g.LIZ(32.0f);
        if (i > 0) {
            iLIZ = i < iLIZ ? iLIZ : i;
        }
        int iLIZ2 = (int) C511520K4g.LIZ(9.0f);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 7));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(iLIZ2, 0, iLIZ2, 0);
        C0DUC c0duc = new C0DUC(iLIZ, new AwS583S0100000_4(this, 237));
        this.LLJJI = c0duc;
        recyclerView.setAdapter(c0duc);
        addView(recyclerView, new C16GA(-1, -2));
    }

    public final void setOnEmojiClickListener(Function1<? super C1175004ii, Unit> function1) {
        this.LLJJIII = function1;
    }
}
