package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.tiktok.pns.utils.network.api.UserSettingsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.102G, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.audiencecontrol.AudienceControlManager$enterAudienceControlPage$1$1$1", f = "AudienceControlManager.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C102G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PushSettings>, Object> {
    public int LL;

    public C102G(InterfaceC1364105Vn<? super C102G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C102G(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudienceControlManager@6b54.enterAudienceControlPage$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C102H c102h = UserSettingsApi.LIZ;
            this.LL = 1;
            c102h.getClass();
            obj = C102H.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AudienceControlManager@6b54.enterAudienceControlPage$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AudienceControlManager@6b54.enterAudienceControlPage$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PushSettings> interfaceC1364105Vn) {
        return new C102G(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
