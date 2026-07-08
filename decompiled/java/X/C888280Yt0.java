package X;

import Y.ACListenerS107S0200000_3;
import Y.ACListenerS138S0100000_3;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888280Yt0 extends RecyclerView.ViewHolder implements C0Z37<C1896107bj>, InterfaceC1508640pMU {
    public static final /* synthetic */ int LLILZIL = 0;
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "DmAutoArchiveGuideBannerVH";
    }

    public C888280Yt0(View view, AwS558S0100000_14 awS558S0100000_14) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = awS558S0100000_14;
        this.LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1684));
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1685));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        C1896107bj c1896107bj = (C1896107bj) interfaceC1891350zJl;
        TextView textView = (TextView) this.LL.findViewById(R.id.bdi);
        if (textView != null) {
            int i2 = C878730Ydb.LIZ().expirationTimeToAutoArchiveDay;
            textView.setText(this.LL.getContext().getResources().getQuantityString(2131755204, i2, String.valueOf(i2)));
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLILLL.getValue();
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS138S0100000_3(this, 11));
        }
        C197039127h c197039127h = (C197039127h) this.LLILZ.getValue();
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS107S0200000_3(c1896107bj, this, 1));
        }
    }
}
