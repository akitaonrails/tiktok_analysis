package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel$updateMethod$1", f = "TwoStepVerificationActivityViewModel.kt", l = {1124, 1127, 1138}, m = "invokeSuspend")
public final class C1234110iDh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TwoStepVerificationActivityViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1233840iDG LLILLL;
    public final /* synthetic */ User LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234110iDh(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, EnumC1233840iDG enumC1233840iDG, User user, InterfaceC1364105Vn<? super C1234110iDh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = twoStepVerificationActivityViewModel;
        this.LLILLL = enumC1233840iDG;
        this.LLILZ = user;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234110iDh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
            EnumC852630Xcb enumC852630Xcb = EnumC852630Xcb.CHANGE_MOBILE;
            this.LL = 1;
            obj = c852610XcZ.LIZIZ(enumC852630Xcb, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
                return objLJFF;
            }
        }
        SafeEnvV2Response safeEnvV2Response = (SafeEnvV2Response) obj;
        String str = null;
        if (!Intrinsics.LJFF(safeEnvV2Response.message, "success")) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1233770iD9 c1233770iD9 = new C1233770iD9(this.LLILLJJLI, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1233770iD9) == objLJFF) {
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
                return objLJFF;
            }
        } else {
            this.LLILLJJLI.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_success_toast", false);
            C786410Ut5.LJJJI("page", "twosv_setup", bundle);
            SafeEnvData safeEnvData = safeEnvV2Response.data;
            if (safeEnvData == null || !safeEnvData.safe) {
                z = false;
            }
            bundle.putBoolean("is_safe_env", z);
            SafeEnvData safeEnvData2 = safeEnvV2Response.data;
            if (safeEnvData2 != null) {
                str = safeEnvData2.passportTicket;
            }
            C786410Ut5.LJJJI("passport_ticket", str, bundle);
            bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_TWO_STEP_VERIFICATION.getValue());
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1233990iDV c1233990iDV = new C1233990iDV(this.LLILLJJLI, bundle, this.LLILLL, this.LLILZ, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c1233990iDV) == objLJFF) {
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1");
        return unit2;
    }
}
