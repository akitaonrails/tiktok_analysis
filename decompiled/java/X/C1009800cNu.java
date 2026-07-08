package X;

import android.app.Activity;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.anchor.service.CommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.profilecomponent.AnoleProfileNativeCardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0cNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009800cNu extends AbstractC1014240cV4 {
    public final InterfaceC1009820cNw LLJLIL;
    public final Activity LLJLILLLLZIIL;
    public final AnoleProfileNativeCardModel LLJLL;
    public ConstraintLayout LLJLLIL;
    public SmartImageView LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public C197039127h LLL;
    public TuxIconView LLLF;
    public AnonymousClass0956 LLLFF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        AnonymousClass0956 anonymousClass0956 = this.LLLFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLFF = null;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        InterfaceC1009820cNw interfaceC1009820cNw = this.LLJLIL;
        if (interfaceC1009820cNw != null) {
            interfaceC1009820cNw.LIZIZ();
        }
        this.LLLFF = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01OQ(((long) CommerceAnchorService.LJIILL().LJFF()) * 1000, new C1009810cNv(this), null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r6, X.InterfaceC1014340cVE r7) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009800cNu.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1009800cNu(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1009820cNw interfaceC1009820cNw) {
        Object c098200Yq;
        Map<String, ? extends Object> map;
        Map<String, AnoleComponentModel> map2;
        AnoleComponentModel anoleComponentModel2;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1009820cNw;
        boolean z = c1009340cNA.LIZJ instanceof Aweme;
        this.LLJLILLLLZIIL = C1388190mED.LIZ(context);
        try {
            Gson gson = C7740030o.LIZ().getGson();
            if (gson != null) {
                AnoleModel anoleModel = c1009340cNA.LJFF;
                if (anoleModel != null && (map2 = anoleModel.components) != null && (anoleComponentModel2 = map2.get("profile_card")) != null) {
                    map = anoleComponentModel2.data;
                } else {
                    map = null;
                }
                c098200Yq = (AnoleProfileNativeCardModel) gson.LJII(gson.LJIILL(map), AnoleProfileNativeCardModel.class);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1022620cia.LJ("ProfileCardComponent", "getCardData() parse success");
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCardData() parse failed ,reason = ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1022620cia.LJ("ProfileCardComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJLL = (AnoleProfileNativeCardModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
