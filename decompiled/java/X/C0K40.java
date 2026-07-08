package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0K40, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K40 extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final C0I7D LLILLL;
    public final TextView LLILZ;

    public C0K40(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (C0I7D) view.findViewById(R.id.rge);
        this.LLILZ = (TextView) view.findViewById(R.id.f830xlp);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K4H c0k4h;
        C0K4F c0k4f;
        if ((abstractC511160K2w instanceof C0K4H) && (c0k4h = (C0K4H) abstractC511160K2w) != null && (interfaceC2753014t instanceof C0K4F) && (c0k4f = (C0K4F) interfaceC2753014t) != null) {
            this.LLILZ.setText("0/50");
            this.LLILLL.addTextChangedListener(new C521830KdJ(this, c0k4h, 3));
            this.LLILLL.setOnFocusChangeListener(new ViewOnFocusChangeListenerC521740KdA(c0k4f, 4));
        }
    }
}
