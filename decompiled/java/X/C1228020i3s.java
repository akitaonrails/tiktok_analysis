package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS88S0200000_19;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.ExposureBody;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.GroupRecShowInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.newconversation.NewConversationButtonProtocol$doSecondaryButtonClick$1$1$1", f = "NewConversationButtonProtocol.kt", l = {204}, m = "invokeSuspend")
public final class C1228020i3s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1227990i3p LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228020i3s(C1227990i3p c1227990i3p, Fragment fragment, InterfaceC1364105Vn<? super C1228020i3s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1227990i3p;
        this.LLILLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228020i3s(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewConversationButtonProtocol@745a.doSecondaryButtonClick$1$1$1");
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
                TikTokImApi tikTokImApi = (TikTokImApi) C1477105qL.LIZJ.getValue();
                String str = (String) this.LLILLJJLI.LLJILLL.getValue();
                if (str == null) {
                    str = "";
                }
                ExposureBody exposureBody = new ExposureBody(6, 2, new GroupRecShowInfo(str));
                this.LL = 1;
                obj = tikTokImApi.exposureCreateGroupChatEntry(exposureBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NewConversationButtonProtocol@745a.doSecondaryButtonClick$1$1$1");
                    return objLJFF;
                }
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            InterfaceC1226510i1R interfaceC1226510i1R = this.LLILLJJLI.LL.LIZ;
            if (interfaceC1226510i1R != null) {
                interfaceC1226510i1R.LIZLLL();
            }
            if (baseResponse.status_code == 0) {
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILLJJLI.LL.LIZ;
                if (interfaceC1226510i1R2 != null) {
                    interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                }
            } else {
                C1481605r4.LIZIZ(new ARunnableS112S0100000_12(this.LLILLL, 434));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1481605r4.LIZIZ(new ARunnableS88S0200000_19(this.LLILLJJLI, this.LLILLL, 63));
            this.LLILLJJLI.LLILLJJLI.getTag();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewConversationButtonProtocol@745a.doSecondaryButtonClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
