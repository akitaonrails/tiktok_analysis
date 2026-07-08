package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchOpenLoopAnchorComponentModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005260cGa extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public SearchOpenLoopAnchorComponentModel LLJLL;
    public ViewGroup LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxTextView LLJZ;
    public TuxIconView LLJZIJLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        String text;
        super.LJII(anoleComponentAppearModel);
        String tag = this.LL.getTag();
        if (tag == null) {
            tag = "result_ad";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(tag, "othershow", this.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ("weak_anchor", "refer");
        SearchOpenLoopAnchorComponentModel searchOpenLoopAnchorComponentModel = this.LLJLL;
        String type = null;
        if (searchOpenLoopAnchorComponentModel != null) {
            text = searchOpenLoopAnchorComponentModel.getText();
        } else {
            text = null;
        }
        c1022820ciuLIZLLL.LIZJ(text, "text");
        SearchOpenLoopAnchorComponentModel searchOpenLoopAnchorComponentModel2 = this.LLJLL;
        if (searchOpenLoopAnchorComponentModel2 != null) {
            type = searchOpenLoopAnchorComponentModel2.getType();
        }
        c1022820ciuLIZLLL.LIZJ(type, "type");
        c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
        c1022820ciuLIZLLL.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r11, X.InterfaceC1014340cVE r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1005260cGa.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1005260cGa(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchOpenLoopAnchorComponent,type:");
        sbLIZ.append(anoleComponentModel.type);
        C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(490));
        this.LLJLILLLLZIIL = c01gwLIZIZ;
        try {
            C1227904rF c1227904rF = (C1227904rF) c01gwLIZIZ.getValue();
            C1227904rF c1227904rF2 = (C1227904rF) c01gwLIZIZ.getValue();
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF2.getClass();
            String strLJI = C1227904rF.LJI(map);
            c1227904rF.getClass();
            c098200Yq = (SearchOpenLoopAnchorComponentModel) C1227904rF.LIZIZ(strLJI, SearchOpenLoopAnchorComponentModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLJLL = (SearchOpenLoopAnchorComponentModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
