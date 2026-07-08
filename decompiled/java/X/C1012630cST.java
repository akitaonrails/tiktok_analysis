package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.shopheader.SearchAdShopInfoHeaderModel;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012630cST extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final SearchAdShopInfoHeaderModel LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public final C01GW LLLFF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final C1610670s13 LJJ() {
        return (C1610670s13) this.LLJZIJLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r21, X.InterfaceC1014340cVE r22) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1012630cST.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1012630cST(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        this.LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1051));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1052));
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1053));
        this.LLJZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1057));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1055));
        this.LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1056));
        this.LLLFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1054));
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (SearchAdShopInfoHeaderModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), SearchAdShopInfoHeaderModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLJLILLLLZIIL = (SearchAdShopInfoHeaderModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
