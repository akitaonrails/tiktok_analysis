package X;

import com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse;
import com.ss.android.ugc.aweme.account.api.ChangePasswordData;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0XbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment$onSubmit$1$1$1", f = "BaseUpdatePasswordFragment.kt", l = {}, m = "invokeSuspend")
public final class C851870XbN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChangePasswordApiResponse LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ BaseUpdatePasswordFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C851870XbN(ChangePasswordApiResponse changePasswordApiResponse, String str, C19EG c19eg, BaseUpdatePasswordFragment baseUpdatePasswordFragment, InterfaceC1364105Vn<? super C851870XbN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = changePasswordApiResponse;
        this.LLILLJJLI = str;
        this.LLILLL = c19eg;
        this.LLILZ = baseUpdatePasswordFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C851870XbN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C118300cf c118300cf = new C118300cf();
        if (Intrinsics.LJFF(this.LL.message, "success")) {
            z = true;
            C0XQ5.LJIIJJI(8, 1, this.LLILLJJLI);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIJ(this.LLILZ.getString(2131828514));
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            this.LLILLL.finish();
        } else {
            ChangePasswordData changePasswordData = this.LL.data;
            z = false;
            if (changePasswordData != null) {
                BaseUpdatePasswordFragment baseUpdatePasswordFragment = this.LLILZ;
                C0XYO c0xyo = C0XYO.LIZ;
                Integer num = changePasswordData.errorCode;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                String str = changePasswordData.errorMsg;
                if (str == null) {
                    str = "";
                }
                EnumC852660Xce enumC852660XceSR = baseUpdatePasswordFragment.SR();
                EnumC852910Xd3 enumC852910Xd3VR = baseUpdatePasswordFragment.VR();
                c0xyo.getClass();
                C0XYO.LIZIZ(iIntValue, baseUpdatePasswordFragment, enumC852660XceSR, enumC852910Xd3VR, baseUpdatePasswordFragment, str, null);
                Integer num2 = changePasswordData.errorCode;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c118300cf.element = iIntValue2;
            }
        }
        SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this.LLILZ);
        BaseUpdatePasswordFragment baseUpdatePasswordFragment2 = this.LLILZ;
        baseUpdatePasswordFragment2.getClass();
        String enterFrom = baseUpdatePasswordFragment2.getEnterFrom();
        BaseUpdatePasswordFragment baseUpdatePasswordFragment3 = this.LLILZ;
        baseUpdatePasswordFragment3.getClass();
        String enterMethod = baseUpdatePasswordFragment3.getEnterMethod();
        BaseUpdatePasswordFragment baseUpdatePasswordFragment4 = this.LLILZ;
        baseUpdatePasswordFragment4.getClass();
        String strPR = baseUpdatePasswordFragment4.PR();
        int i = c118300cf.element;
        BaseUpdatePasswordFragment baseUpdatePasswordFragment5 = this.LLILZ;
        baseUpdatePasswordFragment5.getClass();
        setPasswordMobHelper.LIZ(z, "normal", enterFrom, enterMethod, strPR, i, baseUpdatePasswordFragment5, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
