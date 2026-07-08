package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.productcard.SearchAdProductCardModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007610cKN extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public SearchAdProductCardModel LLJLL;
    public final C01GW LLJLLIL;
    public final Set<WeakReference<InterfaceC991230btx>> LLJLLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LJJ() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        Set<WeakReference<InterfaceC991230btx>> set = this.LLJLLL;
        if (set != null) {
            Iterator<WeakReference<InterfaceC991230btx>> it2 = set.iterator();
            while (it2.hasNext()) {
                InterfaceC991230btx interfaceC991230btx = it2.next().get();
                if (interfaceC991230btx != null) {
                    interfaceC991230btx.Y3(abstractC1003980cEW);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r19, X.InterfaceC1014340cVE r20) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1007610cKN.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1007610cKN(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1030));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(559));
        this.LLJLLIL = c01gwLIZIZ;
        this.LLJLLL = new LinkedHashSet();
        try {
            C1227904rF c1227904rF = (C1227904rF) c01gwLIZIZ.getValue();
            C1227904rF c1227904rF2 = (C1227904rF) c01gwLIZIZ.getValue();
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF2.getClass();
            String strLJI = C1227904rF.LJI(map);
            c1227904rF.getClass();
            c098200Yq = (SearchAdProductCardModel) C1227904rF.LIZIZ(strLJI, SearchAdProductCardModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLJLL = (SearchAdProductCardModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
