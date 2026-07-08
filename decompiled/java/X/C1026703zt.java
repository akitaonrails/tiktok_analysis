package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.ConfirmUserAuctionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.UserAuctionInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM$saveAuctionInfo$1", f = "AuctionAddressPayVM.kt", l = {213}, m = "invokeSuspend")
public final class C1026703zt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AuctionAddressPayVM LL;
    public Function0 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ConfirmUserAuctionInfoRequest LLILZ;
    public final /* synthetic */ AuctionAddressPayVM LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026703zt(ConfirmUserAuctionInfoRequest confirmUserAuctionInfoRequest, AuctionAddressPayVM auctionAddressPayVM, Function0<Unit> function0, InterfaceC1364105Vn<? super C1026703zt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = confirmUserAuctionInfoRequest;
        this.LLILZIL = auctionAddressPayVM;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026703zt(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AuctionAddressPayVM auctionAddressPayVM;
        Function0<Unit> function0;
        String str;
        C1C7U.LIZ("AuctionAddressPayVM@b013.saveAuctionInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (i != 0) {
            if (i == 1) {
                function0 = this.LLILLJJLI;
                auctionAddressPayVM = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ConfirmUserAuctionInfoRequest confirmUserAuctionInfoRequest = this.LLILZ;
            if (confirmUserAuctionInfoRequest != null) {
                auctionAddressPayVM = this.LLILZIL;
                function0 = this.LLILZLL;
                C10291040r c10291040r = InterfaceC10295040v.LIZ;
                this.LL = auctionAddressPayVM;
                this.LLILLJJLI = function0;
                this.LLILLL = 1;
                obj = c10291040r.LIZ(confirmUserAuctionInfoRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AuctionAddressPayVM@b013.saveAuctionInfo$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AuctionAddressPayVM@b013.saveAuctionInfo$1");
            return unit;
        }
        C1026403zq c1026403zq = (C1026403zq) obj;
        if (c1026403zq == null || !c1026403zq.isValid()) {
            z = false;
        }
        if (z) {
            auctionAddressPayVM.LLILLL = (UserAuctionInfoData) c1026403zq.data;
            auctionAddressPayVM.vQ2();
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            auctionAddressPayVM.getClass();
            auctionAddressPayVM.setState(new AwS16S0001000_1(3, 18));
            auctionAddressPayVM.setState(new AwS16S0010000_1(false, 15));
            auctionAddressPayVM.withState(new AwS580S0100000_1(auctionAddressPayVM, 382));
            if (c1026403zq != null) {
                str = c1026403zq.message;
            } else {
                str = null;
            }
            C2286608xc.LJ(Log.d("saveAuctionInfo", String.valueOf(str)));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AuctionAddressPayVM@b013.saveAuctionInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
