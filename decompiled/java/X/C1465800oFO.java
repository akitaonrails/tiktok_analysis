package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import g3a.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0oFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465800oFO extends a implements InterfaceC1408530ml1 {
    public final int LLIZLLLIL;
    public final WeakReference<Context> LLJ;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) PluggableExtentionKt.pluggableSpi$default(ILayoutPreloadServiceForEditPage.class, false, false, false, 14, null);
        if (iLayoutPreloadServiceForEditPage != null) {
            iLayoutPreloadServiceForEditPage.preloadLayoutFiles(this.LLJ.get(), this.LLIZLLLIL);
        }
        LJIIJ();
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public C1465800oFO(C19EG c19eg, int i) {
        this.LLIZLLLIL = i;
        this.LLJ = new WeakReference<>(c19eg);
        LJ(AFwS261S0000000_22.get$arr$(282));
    }
}
