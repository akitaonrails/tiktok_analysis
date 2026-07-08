package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888640zFO {
    public final View LIZ;
    public final C1888510zFB LIZIZ;

    public C1888640zFO(ViewGroup viewGroup, RecyclerView.RecycledViewPool recycledViewPool, InterfaceC1888610zFL interfaceC1888610zFL) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h50, viewGroup, false);
        this.LIZ = viewTd;
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.eux);
        C1888510zFB c1888510zFB = new C1888510zFB(viewGroup.getContext(), interfaceC1888610zFL);
        this.LIZIZ = c1888510zFB;
        SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(7, 1, viewTd.getContext());
        recyclerView.setAdapter(c1888510zFB);
        recyclerView.setLayoutManager(sSGridLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(recycledViewPool);
    }
}
