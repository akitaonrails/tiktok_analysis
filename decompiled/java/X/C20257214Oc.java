package X;

import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility;
import java.util.Map;

/* JADX INFO: renamed from: X.14Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20257214Oc implements C14SX, InterfaceC1587906Jp {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C20257114Ob LLILLL;

    @Override // X.C14SX
    public final Map<String, Object> LJI() {
        INimbleLynxDependAbility iNimbleLynxDependAbility = (INimbleLynxDependAbility) C1558520qew.LIZ(LIZIZ(), INimbleLynxDependAbility.class, null);
        if (iNimbleLynxDependAbility != null) {
            return iNimbleLynxDependAbility.pT0();
        }
        return null;
    }

    @Override // X.C14SX
    public final String getRawData() {
        String str = this.LLILLJJLI.element;
        return str == null ? "" : str;
    }

    @Override // X.C14SX
    public final String getSchema() {
        String str = this.LL.element;
        return str == null ? "" : str;
    }

    public C20257214Oc(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, C20257114Ob c20257114Ob) {
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c20257114Ob;
    }
}
