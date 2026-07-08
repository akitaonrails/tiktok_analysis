package X;

import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20674915vH extends C09AY implements Function0<C488650JEh> {
    public final /* synthetic */ SAFFragmentRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20674915vH(SAFFragmentRootScene sAFFragmentRootScene) {
        super(0);
        this.LL = sAFFragmentRootScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C488650JEh invoke() {
        return ((SAFContextThemeConfig) this.LL.LLJIJIL.getValue()).getThemeForSAFThemeWrapper() != 0 ? new C488650JEh(C12WG.LJ(this.LL), ((SAFContextThemeConfig) this.LL.LLJIJIL.getValue()).getThemeForSAFThemeWrapper()) : new C488650JEh(C12WG.LJ(this.LL));
    }
}
