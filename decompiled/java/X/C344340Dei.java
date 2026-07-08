package X;

import Y.ACListenerS139S0100000_4;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344340Dei extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZ = 0;
    public final InterfaceC344350Dej LL;
    public final C424700Gl2 LLILLJJLI;
    public Aweme LLILLL;

    public C344340Dei(View view, InterfaceC344350Dej interfaceC344350Dej) {
        super(view);
        this.LL = interfaceC344350Dej;
        C424700Gl2 c424700Gl2 = (C424700Gl2) view.findViewById(R.id.vje);
        this.LLILLJJLI = c424700Gl2;
        C786410Ut5.z9(c424700Gl2, new ACListenerS139S0100000_4(this, 69));
    }
}
