package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.knadapt.DataPreProcess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0scR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633850scR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(98));

    public static final InterfaceC1635410sex LIZ(Context context, Function1<? super EffectPlatformBuilder, Unit> function1) {
        if (C297340Bl6.LIZIZ() && function1 == null) {
            return (InterfaceC1635410sex) LIZ.getValue();
        }
        IEffectPlatformFactory iEffectPlatformFactory = (IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class);
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(context);
        DataPreProcess.enable = false;
        DataPreProcess.enableOptimize = false;
        if (function1 != null) {
            function1.invoke(effectPlatformBuilder);
        }
        return iEffectPlatformFactory.create(effectPlatformBuilder);
    }
}
