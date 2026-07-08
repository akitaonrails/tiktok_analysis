package X;

import com.ss.android.ugc.aweme.account.login.trustedfriends.FetchNeedVerifyFriendListResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.setting.page.security.SecurityAccountRecoveryCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.security.SecurityAccountRecoveryCell$onResume$1$1", f = "SecurityAccountRecoveryItem.kt", l = {}, m = "invokeSuspend")
public final class C848710XRd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<FetchNeedVerifyFriendListResponse> LL;
    public final /* synthetic */ SecurityAccountRecoveryCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848710XRd(C0X52<FetchNeedVerifyFriendListResponse> c0x52, SecurityAccountRecoveryCell securityAccountRecoveryCell, InterfaceC1364105Vn<? super C848710XRd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = securityAccountRecoveryCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C848710XRd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityAccountRecoveryCell@3166.onResume$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = false;
        if (this.LL.LIZJ()) {
            FetchNeedVerifyFriendListResponse.NeedToVerifyFriendStatus needToVerifyFriendStatus = this.LL.LIZIZ.data;
            if (needToVerifyFriendStatus.showRedDot) {
                SecurityAccountRecoveryCell securityAccountRecoveryCell = this.LLILLJJLI;
                String str = needToVerifyFriendStatus.errorCode;
                securityAccountRecoveryCell.getClass();
                SecurityAccountRecoveryCell.L5("1", str);
                C848730XRf c848730XRf = (C848730XRf) this.LLILLJJLI.getItem();
                if (c848730XRf != null) {
                    c848730XRf.LLILZIL = true;
                }
            } else {
                SecurityAccountRecoveryCell securityAccountRecoveryCell2 = this.LLILLJJLI;
                String str2 = needToVerifyFriendStatus.errorCode;
                securityAccountRecoveryCell2.getClass();
                SecurityAccountRecoveryCell.L5(CardStruct.IStatusCode.DEFAULT, str2);
                C848730XRf c848730XRf2 = (C848730XRf) this.LLILLJJLI.getItem();
                if (c848730XRf2 != null) {
                    c848730XRf2.LLILZIL = false;
                }
            }
        } else {
            this.LLILLJJLI.getClass();
            SecurityAccountRecoveryCell.L5(CardStruct.IStatusCode.DEFAULT, "-100");
            C848730XRf c848730XRf3 = (C848730XRf) this.LLILLJJLI.getItem();
            if (c848730XRf3 != null) {
                c848730XRf3.LLILZIL = false;
            }
        }
        SecurityAccountRecoveryCell securityAccountRecoveryCell3 = this.LLILLJJLI;
        C127K c127k = securityAccountRecoveryCell3.LLILLJJLI;
        if (c127k != null) {
            C848730XRf c848730XRf4 = (C848730XRf) securityAccountRecoveryCell3.getItem();
            if (c848730XRf4 != null) {
                z = c848730XRf4.LLILZIL;
            }
            c127k.setShowAlertBadge(z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecurityAccountRecoveryCell@3166.onResume$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
