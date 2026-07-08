package X;

import com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.InvitePageViewModel$clickInvite$1$1", f = "InvitePageViewModel.kt", l = {123}, m = "invokeSuspend")
public final class C1238360iKY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InvitePageViewModel LLILZ;
    public final /* synthetic */ AbstractC1238320iKU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238360iKY(InvitePageViewModel invitePageViewModel, AbstractC1238320iKU abstractC1238320iKU, InterfaceC1364105Vn<? super C1238360iKY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = invitePageViewModel;
        this.LLILZIL = abstractC1238320iKU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1238360iKY c1238360iKY = new C1238360iKY(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1238360iKY.LLILLL = obj;
        return c1238360iKY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("InvitePageViewModel@70af.clickInvite$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLL;
            c259800zU = new C259800zU();
            c259800zU.element = "";
            if (Intrinsics.LJFF(this.LLILZ.LLILLL.getValue(), C1238390iKb.LIZ)) {
                InvitePageViewModel invitePageViewModel = this.LLILZ;
                invitePageViewModel.LLJI = null;
                String str2 = invitePageViewModel.LLJ;
                T t = str2;
                if (str2 == null) {
                    t = "";
                }
                c259800zU.element = t;
            } else {
                InvitePageViewModel invitePageViewModel2 = this.LLILZ;
                invitePageViewModel2.LLJ = null;
                String str3 = invitePageViewModel2.LLJI;
                T t2 = str3;
                if (str3 == null) {
                    t2 = "";
                }
                c259800zU.element = t2;
            }
            ManageOrgPermissionsApi manageOrgPermissionsApi = ManageOrgPermissionsApi.LIZ;
            InvitePageViewModel invitePageViewModel3 = this.LLILZ;
            String str4 = invitePageViewModel3.LLJI;
            String str5 = invitePageViewModel3.LLJ;
            int iIntValue = ((C1238350iKX) this.LLILZIL).LIZ.intValue();
            this.LLILLL = obj2;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            obj = manageOrgPermissionsApi.LJII(iIntValue, str4, str5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InvitePageViewModel@70af.clickInvite$1$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.SendInviteResponse sendInviteResponse = (ManageOrgPermissionsApi.SendInviteResponse) obj;
        this.LLILZ.LLIZ.setValue(false);
        if (!Intrinsics.LJFF(sendInviteResponse.message, "success")) {
            Integer num = sendInviteResponse.data.errorCode;
            if (num != null && (8030 == num.intValue() || 8501 == num.intValue())) {
                this.LLILZ.LL.setValue(C1238340iKW.LIZ);
            } else {
                InvitePageViewModel invitePageViewModel4 = this.LLILZ;
                String str6 = sendInviteResponse.data.description;
                C2252321DDq c2252321DDq = invitePageViewModel4.LLILZIL;
                if (!Intrinsics.LJFF(str6, "")) {
                    str = str6;
                }
                c2252321DDq.setValue(str);
                InvitePageViewModel invitePageViewModel5 = this.LLILZ;
                invitePageViewModel5.LL.setValue(new C1238330iKV(invitePageViewModel5.xQ2()));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InvitePageViewModel@70af.clickInvite$1$1");
            return unit;
        }
        String str7 = sendInviteResponse.data.inviteId;
        if (str7 != null) {
            InvitePageViewModel invitePageViewModel6 = this.LLILZ;
            invitePageViewModel6.LL.setValue(new C1238310iKT(Intrinsics.LJFF(invitePageViewModel6.LLILLL.getValue(), C1238380iKa.LIZ), (String) c259800zU.element, str7));
        } else {
            InvitePageViewModel invitePageViewModel7 = this.LLILZ;
            invitePageViewModel7.LL.setValue(new C1238330iKV(invitePageViewModel7.xQ2()));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InvitePageViewModel@70af.clickInvite$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
