package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06ST, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ST extends FrameLayout {
    public final RecyclerView LL;

    public C06ST(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fgu, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0h);
        this.LL = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }
}
