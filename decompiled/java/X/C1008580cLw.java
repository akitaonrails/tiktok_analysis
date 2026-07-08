package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.ad.AdCipInfo;
import com.ss.android.ugc.aweme.feed.model.ad.Policy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import wh6.AbS506S0200000_16;

/* JADX INFO: renamed from: X.0cLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008580cLw extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        Policy policy;
        AdCipInfo cipInfo = this.LLILLJJLI.LIZLLL.getCipInfo();
        if (TextUtils.isEmpty((cipInfo == null || (policy = cipInfo.policy) == null) ? null : policy.policyName)) {
            return new C1014500cVU(false, "data_load_fail");
        }
        InterfaceC1017820caq interfaceC1017820caq = (InterfaceC1017820caq) this.LLJLIL.getValue();
        return (interfaceC1017820caq == null || !interfaceC1017820caq.LJIIIZ(this.LLILLJJLI.LIZLLL)) ? new C1014500cVU(false, "data_load_fail") : new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        C1D2P c1d2pLJIIIIZZ;
        super.LJII(anoleComponentAppearModel);
        InterfaceC1017820caq interfaceC1017820caq = (InterfaceC1017820caq) this.LLJLIL.getValue();
        if (interfaceC1017820caq != null && (c1d2pLJIIIIZZ = interfaceC1017820caq.LJIIIIZZ(this.LLILLJJLI.LIZLLL)) != null) {
            String tag = this.LL.getTag();
            String refer = this.LL.getRefer();
            AnoleComponentModel anoleComponentModel = this.LL;
            c1d2pLJIIIIZZ.LJJJ(Long.valueOf(anoleComponentModel.getID()), tag, refer, anoleComponentModel.type);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        Policy policy;
        super.Fk(viewGroup, interfaceC1014340cVE);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.pq, viewGroup, false);
        String str = null;
        if (viewTd != null) {
            TextView textView = (TextView) viewTd.findViewById(R.id.dtb);
            AdCipInfo cipInfo = this.LLILLJJLI.LIZLLL.getCipInfo();
            if (cipInfo != null && (policy = cipInfo.policy) != null) {
                str = policy.policyName;
            }
            textView.setText(str);
        } else {
            viewTd = null;
        }
        this.LLJJIJIL = viewTd;
        this.LLJJI = new C1009390cNF(-2.0d, -2.0d);
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.I7(new AbS506S0200000_16(this, viewGroup, 2), view);
        }
    }

    public C1008580cLw(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(522));
    }
}
