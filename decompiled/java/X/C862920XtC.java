package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0XtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.utils.network.api.UserSetSettingsApi$Companion$setUserSetting$2", f = "UserSetSettingsApi.kt", l = {28}, m = "invokeSuspend")
public final class C862920XtC extends C09AX implements Function1<InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862920XtC(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862920XtC(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserSetSettingsApi$Companion@991a.setUserSetting$2");
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
            UserSetSettingsApi value = C862930XtD.LIZIZ.getValue();
            String str = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = value.setUserSetting(str, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserSetSettingsApi$Companion@991a.setUserSetting$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UserSetSettingsApi$Companion@991a.setUserSetting$2");
        return obj;
    }
}
