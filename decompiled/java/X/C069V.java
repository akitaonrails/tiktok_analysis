package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.069V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.preload.task.EffectsPreloadTask$afterUserEnterInbox$2", f = "EffectsPreloadTask.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C069V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C069W LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C069V(C069W c069w, InterfaceC1364105Vn<? super C069V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c069w;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C069V(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("EffectsPreloadTask@d52d.afterUserEnterInbox$2");
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
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                C2213981Bky.LIZIZ.getApplicationContext();
                this.LL = 1;
                obj = iMCameraBridgeApiLIZ.LJJIII(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectsPreloadTask@d52d.afterUserEnterInbox$2");
                    return objLJFF;
                }
            } else {
                zBooleanValue = false;
                this.LLILLJJLI.LIZ = zBooleanValue;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EffectsPreloadTask@d52d.afterUserEnterInbox$2");
                return unit;
            }
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        this.LLILLJJLI.LIZ = zBooleanValue;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectsPreloadTask@d52d.afterUserEnterInbox$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
