package X;

import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0CaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316080CaE {
    public final Function0<InterfaceC497601wk> LIZ;

    public static InterfaceC318260Cdk LIZ() {
        IEffectCreatorService iEffectCreatorService = (IEffectCreatorService) PluggableExtentionKt.pluggableSpi$default(IEffectCreatorService.class, false, false, false, 14, null);
        if (iEffectCreatorService != null) {
            return iEffectCreatorService.draftService();
        }
        return null;
    }

    public C316080CaE(AwS548S0100000_4 awS548S0100000_4) {
        this.LIZ = awS548S0100000_4;
    }
}
