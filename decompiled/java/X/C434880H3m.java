package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0H3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434880H3m extends FrameLayout implements InterfaceC434870H3l {
    public List<C1376750lvl> LL;
    public final C434850H3j LLILLJJLI;
    public InterfaceC434870H3l LLILLL;
    public final TuxNavBar LLILZ;

    public final TuxNavBar getNavBar() {
        return this.LLILZ;
    }

    public C434880H3m(Context context) {
        super(context);
        this.LL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d84, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.ui4);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.fxw);
        this.LLILZ = tuxNavBar;
        C434850H3j c434850H3j = new C434850H3j(this);
        this.LLILLJJLI = c434850H3j;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        c434850H3j.LLILLJJLI = this.LL;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c434850H3j);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, getContext());
        if (numLIZJ != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        C426750GoL.LJIIIZ(recyclerView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 24);
        C426750GoL.LJIIL(recyclerView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 21);
    }

    @Override // X.InterfaceC434870H3l
    public final void LIZ(C1376750lvl c1376750lvl) {
        InterfaceC434870H3l interfaceC434870H3l = this.LLILLL;
        if (interfaceC434870H3l != null) {
            interfaceC434870H3l.LIZ(c1376750lvl);
        }
    }
}
