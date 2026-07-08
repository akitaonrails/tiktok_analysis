package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.redpoint.UserProfileBlockVM$blockUser$1", f = "UserProfileBlockVM.kt", l = {47, 66}, m = "invokeSuspend")
public final class C09ZA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ UserProfileBlockVM LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZA(UserProfileBlockVM userProfileBlockVM, String str, String str2, int i, int i2, Context context, InterfaceC1364105Vn<? super C09ZA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = userProfileBlockVM;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZA(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("UserProfileBlockVM@fd10.blockUser$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C479801ts c479801ts = new C479801ts(e, this.LLIZLLLIL, null);
            this.LL = e;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c479801ts) == objLJFF) {
                C1C7U.LIZIZ("UserProfileBlockVM@fd10.blockUser$1");
                return objLJFF;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    e = (Exception) this.LL;
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.setState(new AwS582S0100000_3(e, 15));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UserProfileBlockVM@fd10.blockUser$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09Z7 c09z7 = (C09Z7) this.LLILLL.LL.getValue().getOperator();
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            int i3 = this.LLILZLL;
            int i4 = this.LLIZ;
            this.LLILLJJLI = 1;
            obj = c09z7.LJJIJIIJIL(i3, i4, str, str2);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserProfileBlockVM@fd10.blockUser$1");
                return objLJFF;
            }
        }
        BlockStruct blockStruct = (BlockStruct) obj;
        NextLiveData<BlockStatus> nextLiveDataLJI = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJI();
        String str3 = this.LLILZ;
        if (blockStruct != null) {
            i = blockStruct.blockStatus;
        } else {
            i = 0;
        }
        nextLiveDataLJI.postValue(new BlockStatus(str3, i));
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        int i5 = this.LLILZLL;
        String str4 = this.LLILZ;
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i5);
        jSONObject.put("userId", str4);
        jSONObject.put("secUserId", str4);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "blockUserStatusChange"));
        UserProfileBlockVM userProfileBlockVM = this.LLILLL;
        String str5 = this.LLILZ;
        int i6 = this.LLIZ;
        userProfileBlockVM.getClass();
        userProfileBlockVM.setState(new C09Z9(str5, blockStruct, i6));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UserProfileBlockVM@fd10.blockUser$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
