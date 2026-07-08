package X;

import Y.ARunnableS41S0300000_8;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v7.o;

/* JADX INFO: renamed from: X.0Mpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C580450Mpf implements Function0 {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ o LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    public /* synthetic */ C580450Mpf(Context context, Bundle bundle, o oVar, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = oVar;
        this.LLILZ = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.LL;
        String str = this.LLILLJJLI;
        o oVar = this.LLILLL;
        Bundle bundle = this.LLILZ;
        boolean[] zArr = {false};
        ProgressDialogC1399790mWv[] progressDialogC1399790mWvArr = {null};
        if (context instanceof LifecycleOwner) {
            zArr[0] = true;
            new SafeHandler(C0CHQ.LIZ().LJIJJ().LJIIIIZZ(C1388190mED.LIZ(context))).postDelayed(new ARunnableS41S0300000_8(zArr, context, progressDialogC1399790mWvArr, 2), 300L);
        }
        IAVEffectService iAVEffectServiceEffectService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, "");
        iAVEffectServiceEffectService.buildEffectPlatform(context, new C580680Mq2(str, map, zArr, progressDialogC1399790mWvArr, oVar, bundle), null);
        return Unit.LIZ;
    }
}
