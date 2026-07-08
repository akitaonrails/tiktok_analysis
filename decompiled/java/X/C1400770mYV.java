package X;

import Y.ACListenerS124S0200000_21;
import android.os.Bundle;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mYV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400770mYV extends AbstractC1261240ivS {
    public final String LLIZ;
    public final InterfaceC1260110itd LLIZLLLIL;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
    }

    @Override // X.AbstractC1261240ivS
    public final void a6() {
    }

    public C1400770mYV(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = str;
        this.LLIZLLLIL = interfaceC1260110itd;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.cover);
        C786410Ut5.I7(new ACListenerS124S0200000_21(view, this, 108), view);
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        this.LL = aweme;
    }
}
