package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import wh6.AbS500S0200000_9;

/* JADX INFO: renamed from: X.0OFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616420OFs extends AbstractC1261240ivS {
    public final InterfaceC1260110itd LLIZ;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
    }

    @Override // X.AbstractC1261240ivS
    public final void a6() {
    }

    public C616420OFs(View view, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = interfaceC1260110itd;
        View viewFindViewById = view.findViewById(R.id.txt_report);
        if (C960203pA.LIZIZ(this.itemView.getContext())) {
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.txt_privacy_declare);
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1k);
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.txt_report);
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1h);
            }
        }
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS500S0200000_9(this, view, 5), viewFindViewById);
        }
    }
}
