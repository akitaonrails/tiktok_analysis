package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.SocialAvatarFastFlowApi;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HK8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$performUploadProcessInBackground$2$1", f = "SocialAvatarCreationServiceImpl.kt", l = {259}, m = "invokeSuspend")
public final class C0HK8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0HL8 LLILLJJLI;
    public final /* synthetic */ SocialAvatarCreationServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HK8(C0HL8 c0hl8, SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl, InterfaceC1364105Vn<? super C0HK8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hl8;
        this.LLILLL = socialAvatarCreationServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HK8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        long jLongValue;
        C1C7U.LIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$2$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (Intrinsics.LJFF(this.LLILLJJLI.LIZIZ, "chat")) {
                    i = 6;
                } else {
                    i = 1;
                }
                SocialAvatarFastFlowApi.LIZ.getClass();
                SocialAvatarFastFlowApi value = C439020HJk.LIZIZ.getValue();
                this.LL = 1;
                obj = value.getSocialAvatarQueueStatus(i, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$2$1");
                    return objLJFF;
                }
            }
            SocialAvatarQueueStatusResult socialAvatarQueueStatusResult = (SocialAvatarQueueStatusResult) obj;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Long l = socialAvatarQueueStatusResult.queueWaitTime;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = socialAvatarQueueStatusResult.avgTaskTime;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            long millis = timeUnit.toMillis(jLongValue + jLongValue2 + ((long) MixStudioSettings.INSTANCE.avatarGenerationBufferSeconds()));
            SocialAvatarFastFlowService socialAvatarFastFlowServiceLIZLLL = this.LLILLL.LIZLLL();
            this.LLILLL.getClass();
            socialAvatarFastFlowServiceLIZLLL.LIZ(SocialAvatarCreationServiceImpl.LJ(), new C0HK4(C2286608xc.LJFF(millis)));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$2$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$2$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
