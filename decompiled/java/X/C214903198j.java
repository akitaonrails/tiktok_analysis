package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.198j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214903198j extends C09AY implements Function0<C198X> {
    public final /* synthetic */ SAFFragmentRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214903198j(SAFFragmentRootScene sAFFragmentRootScene) {
        super(0);
        this.LL = sAFFragmentRootScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C198X invoke() {
        SAFFragmentRootScene sAFFragmentRootScene = this.LL;
        Activity activityRequireActivity = sAFFragmentRootScene.requireActivity();
        Context contextOnGetSceneContext = ((SAFContextThemeConfig) this.LL.LLJIJIL.getValue()).getEnableUnifyFragmentContextAndInflater() ? this.LL.onGetSceneContext() : this.LL.requireActivity();
        this.LL.getClass();
        return new C198X(sAFFragmentRootScene, activityRequireActivity, contextOnGetSceneContext, !C665300Q7s.LIZ() ? (Handler) this.LL.LLJJJIL.getValue() : C20580084k.LIZIZ);
    }
}
