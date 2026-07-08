package X;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCombineSettingResponse;
import com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$fetchAndInit$1", f = "UnsubscribeChannelSettingViewModel.kt", l = {161}, m = "invokeSuspend")
public final class C2148608bM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UnsubscribeChannelSettingViewModel LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148608bM(UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel, Integer num, InterfaceC1364105Vn<? super C2148608bM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = unsubscribeChannelSettingViewModel;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2148608bM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1");
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
                C1DFB c1dfb = C0PEM.LIZJ;
                C2148508bL c2148508bL = new C2148508bL(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c2148508bL);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1");
                    return objLJFF;
                }
            }
            SubscribeCombineSettingResponse subscribeCombineSettingResponse = (SubscribeCombineSettingResponse) obj;
            if (subscribeCombineSettingResponse != null && subscribeCombineSettingResponse.status_code == 0) {
                UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel = this.LLILLJJLI;
                GroupUnsubscribeSetting groupUnsubscribeSetting = subscribeCombineSettingResponse.groupUnsubscribeSetting;
                unsubscribeChannelSettingViewModel.LLILLJJLI = groupUnsubscribeSetting;
                C635440OwA.LIZ(groupUnsubscribeSetting);
                this.LLILLJJLI.vQ2(this.LLILLL.intValue());
                UnsubscribeChannelSettingViewModel unsubscribeChannelSettingViewModel2 = this.LLILLJJLI;
                MutableLiveData<String> mutableLiveData = unsubscribeChannelSettingViewModel2.LLILZ;
                GroupUnsubscribeSetting groupUnsubscribeSetting2 = unsubscribeChannelSettingViewModel2.LLILLJJLI;
                if (groupUnsubscribeSetting2 == null || (str = groupUnsubscribeSetting2.name) == null) {
                    str = "";
                }
                mutableLiveData.postValue(str);
            } else {
                C2286608xc.LJ(Log.d("gy-debug", "fetchAndInit failed"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2286608xc.LJ(Log.e("gy-debug", "updateSubscribe failed", e));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.fetchAndInit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
