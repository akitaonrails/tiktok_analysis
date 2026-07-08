package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import irm.AkS59S0200000_21;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401470mZd extends AbstractC1261240ivS {
    public final InterfaceC1260110itd LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public AwemeDraft LLJILJILJ;
    public int LLJILLL;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
    }

    @Override // X.AbstractC1261240ivS
    public final void a6() {
    }

    public final TextView b6() {
        return C1394640mOc.LIZ() ? (TextView) this.LLJIJIL.getValue() : (TextView) this.LLJI.getValue();
    }

    public C1401470mZd(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = interfaceC1260110itd;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(690));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1699));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1697));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1698));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(691));
        C786410Ut5.I7(new AkS59S0200000_21(view, this, 11), view);
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        C1401450mZb c1401450mZb;
        this.LL = aweme;
        if ((aweme instanceof C1401450mZb) && (c1401450mZb = (C1401450mZb) aweme) != null) {
            List<String> queryKeywords = c1401450mZb.getQueryKeywords();
            int count = c1401450mZb.getCount();
            boolean z2 = c1401450mZb.shouldUpdate;
            c1401450mZb.shouldUpdate = false;
            if (this.LLJILJILJ == null || z2) {
                C23250099c.LIZLLL((InterfaceC497601wk) this.LLJILJIL.getValue(), null, null, new C0CTH(queryKeywords, this, null), 3);
            }
            this.LLJILLL = count;
            if (count > 1) {
                TextView textViewB6 = b6();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(b6().getContext().getResources().getString(2131847721));
                sbLIZ.append(": ");
                sbLIZ.append(count);
                textViewB6.setText(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                b6().setText(b6().getContext().getResources().getString(2131847721));
            }
            if (C1394640mOc.LIZ()) {
                C786410Ut5.LLIL((TextView) this.LLJIJIL.getValue(), 0);
                C786410Ut5.LLIL((TextView) this.LLJI.getValue(), 8);
            }
        }
    }
}
