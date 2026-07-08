package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.dependency.friend.FriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.VoucherData;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05F6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpShopMgr$followAndClaimVoucher$1$1$1", f = "PdpShopMgr.kt", l = {}, m = "invokeSuspend")
public final class C05F6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Response<FollowShopAndClaimData> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05F6(Response<FollowShopAndClaimData> response, String str, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C05F6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = response;
        this.LLILLJJLI = str;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05F6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        String str;
        AnonymousClass0317 anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("PdpShopMgr@d226.followAndClaimVoucher$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FollowShopAndClaimData followShopAndClaimData = this.LL.data;
        if (followShopAndClaimData != null) {
            zLJFF = Intrinsics.LJFF(followShopAndClaimData.isFollowed, true);
        } else {
            zLJFF = false;
        }
        VoucherData voucherData = null;
        if (zLJFF) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = FriendDependencyService.createIFriendDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IFriendDependencyService.class.getName();
                if (anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IFriendDependencyService.class);
            }
            ((IFriendDependencyService) anonymousClass0317CreateIFriendDependencyServicebyMonsterPlugin).getRelationObservable().postValue(new FollowStatus(this.LLILLJJLI, 1));
        }
        Function2<Boolean, String, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            Boolean boolValueOf = Boolean.valueOf(this.LL.isCodeOK());
            Response<FollowShopAndClaimData> response = this.LL;
            FollowShopAndClaimData followShopAndClaimData2 = response.data;
            if (followShopAndClaimData2 == null || (str = followShopAndClaimData2.text) == null) {
                str = response.message;
            }
            function2.invoke(boolValueOf, str);
        }
        FollowShopAndClaimData followShopAndClaimData3 = this.LL.data;
        if (followShopAndClaimData3 != null) {
            voucherData = followShopAndClaimData3.voucher;
        }
        C1751570vgJ c1751570vgJ = new C1751570vgJ();
        c1751570vgJ.LJIIIIZZ(new AwS368S0200000_2(voucherData, (VoucherData) this.LL, (Response<FollowShopAndClaimData>) 139));
        c1751570vgJ.LIZJ(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucher$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
