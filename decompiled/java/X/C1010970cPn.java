package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010970cPn extends AbstractC1010710cPN<C1010980cPo> {
    public boolean LLILZLL;
    public final C01GW LLIZ;

    @Override // X.AbstractC1010710cPN
    public final View LIZIZ() {
        return (View) this.LLIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    @Override // X.AbstractC1010710cPN, X.C0PPF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind() {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010970cPn.bind():void");
    }

    public C1010970cPn(C1010580cPA c1010580cPA) {
        super(c1010580cPA);
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 763));
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        if (!C1010120cOQ.LJIILL(this.LLILLJJLI) || ((aweme = this.LLILLJJLI) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.componentRelations) != null && map.containsKey("search_enhanced_style_anchor"))) {
            return false;
        }
        return true;
    }
}
