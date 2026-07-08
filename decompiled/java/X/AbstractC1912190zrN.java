package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;

/* JADX INFO: renamed from: X.0zrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1912190zrN extends AbstractC1912160zrK {
    public final SmartImageView LLJJ;
    public final SmartImageView LLJJI;

    public void LJII(C1331670kl3 c1331670kl3) {
    }

    @Override // X.InterfaceC1912220zrQ
    public void LIZ(C1911990zr3 c1911990zr3) {
        UrlModel urlModel = c1911990zr3.LIZLLL;
        UrlModel urlModel2 = c1911990zr3.LJ;
        if (urlModel != null && urlModel2 != null) {
            C19488711Mn c19488711MnLJIIIIZZ = LJIIIIZZ(this.LLJJ, urlModel);
            C19488711Mn c19488711MnLJIIIIZZ2 = LJIIIIZZ(this.LLJJI, urlModel2);
            if (c19488711MnLJIIIIZZ != null && c19488711MnLJIIIIZZ2 != null) {
                C11NZ.LJLLILLLL(c19488711MnLJIIIIZZ, c19488711MnLJIIIIZZ2, new InterfaceC500500Jk0() { // from class: X.0x07
                    @Override // X.InterfaceC500500Jk0
                    public final Object apply(Object obj, Object obj2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((String) obj);
                        sbLIZ.append((String) obj2);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                }).LIZIZ(new C19336510kt(this, 7));
                this.LLJJ.getDrawable().setVisible(true, false);
                this.LLJJI.getDrawable().setVisible(true, false);
            }
        }
    }

    public final C19488711Mn LJIIIIZZ(SmartImageView smartImageView, UrlModel urlModel) {
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        try {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(urlModel.getUrlList());
            return C11NZ.LJIJJLI(new C1864910yd7(urlModel2, this, smartImageView, 1)).LJJLIIIJJIZ(3L);
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public AbstractC1912190zrN(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, C1912000zr4 c1912000zr4) {
        super(context, view, smartImageView, smartImageView2, view2, view3, c1912000zr4);
        this.LLJJ = smartImageView;
        this.LLJJI = smartImageView2;
    }
}
