package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import irm.AkS89S0100000_21;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401480mZe extends AbstractC1261240ivS {
    public final View LLIZ;
    public final InterfaceC1260110itd LLIZLLLIL;
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

    public C1401480mZe(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = view;
        this.LLIZLLLIL = interfaceC1260110itd;
        this.LLJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(514));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1392));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1391));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(515));
        C786410Ut5.I7(new AkS89S0100000_21(this, 31), view);
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
                C23250099c.LIZLLL((InterfaceC497601wk) this.LLJILJIL.getValue(), null, null, new C0CTI(queryKeywords, this, null), 3);
            }
            this.LLJILLL = count;
            if (count > 1) {
                TextView textView = (TextView) this.LLJIJIL.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((View) this.LLJIJIL.getValue()).getContext().getResources().getString(2131847721));
                sbLIZ.append(": ");
                sbLIZ.append(count);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            ((TextView) this.LLJIJIL.getValue()).setText(((View) this.LLJIJIL.getValue()).getContext().getResources().getString(2131847721));
        }
    }
}
