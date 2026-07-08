package X;

import Y.ACListenerS144S0100000_9;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notification.banner.vh.SkylightLiveGuideBannerItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0OzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637550OzZ extends RecyclerView.ViewHolder implements C0Z37<SkylightLiveGuideBannerItem>, InterfaceC1508640pMU {
    public final View LL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "";
    }

    public C637550OzZ(View view, AwS572S0100000_28 awS572S0100000_28) {
        super(view);
        this.LL = view;
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.brp), new ACListenerS144S0100000_9(awS572S0100000_28, 132));
    }

    @Override // X.C0Z37
    public final /* bridge */ /* synthetic */ void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
    }
}
