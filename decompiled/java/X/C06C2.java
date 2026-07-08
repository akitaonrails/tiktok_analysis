package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.06C2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager$getSettingsAndTryShow$1", f = "PushUserGuidePopupManager.kt", l = {396}, m = "invokeSuspend")
public final class C06C2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ UnifiedAuthPopupConfig LLILZ;
    public final /* synthetic */ C10DS LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06C2(List<String> list, Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, C10DS c10ds, InterfaceC1364105Vn<? super C06C2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = context;
        this.LLILZ = unifiedAuthPopupConfig;
        this.LLILZIL = c10ds;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06C2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PushUserGuidePopupManager@2b75.getSettingsAndTryShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C211000rc.LIZ("PushUserGuidePopupManager");
                PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                this.LL = 1;
                pushUserGuidePopupManager.getClass();
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C06C1(null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PushUserGuidePopupManager@2b75.getSettingsAndTryShow$1");
                    return objLJFF;
                }
            }
            PushSettings pushSettings = (PushSettings) obj;
            if (pushSettings != null) {
                C211000rc.LIZ("PushUserGuidePopupManager");
                C19328310jZ.LIZIZ.LIZIZ(pushSettings);
                PushUserGuidePopupManager pushUserGuidePopupManager2 = PushUserGuidePopupManager.LIZ;
                List<String> list = this.LLILLJJLI;
                Context context = this.LLILLL;
                UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LLILZ;
                C10DS c10ds = this.LLILZIL;
                pushUserGuidePopupManager2.getClass();
                PushUserGuidePopupManager.LIZ(list, context, unifiedAuthPopupConfig, c10ds);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C211000rc.LIZIZ("PushUserGuidePopupManager", "settings to json error");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushUserGuidePopupManager@2b75.getSettingsAndTryShow$1");
        return unit;
    }
}
