package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20675015vI extends C09AY implements Function0<SAFContextThemeConfig> {
    public final /* synthetic */ SAFFragmentRootScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20675015vI(SAFFragmentRootScene sAFFragmentRootScene) {
        super(0);
        this.LL = sAFFragmentRootScene;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable, com.ss.android.ugc.aweme.SAFContextThemeConfig] */
    @Override // kotlin.jvm.functions.Function0
    public final SAFContextThemeConfig invoke() {
        ?? parcelable;
        Bundle bundle = this.LL.mArguments;
        return (bundle == null || (parcelable = bundle.getParcelable("arg_context_config")) == 0) ? new SAFContextThemeConfig(false, 0) : parcelable;
    }
}
