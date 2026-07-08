package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.UserAuctionInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS16S0001000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM$queryAuctionInfo$2", f = "AuctionAddressPayVM.kt", l = {180}, m = "invokeSuspend")
public final class C1026603zs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AuctionAddressPayVM LL;
    public int LLILLJJLI;
    public final /* synthetic */ AuctionAddressPayVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026603zs(AuctionAddressPayVM auctionAddressPayVM, InterfaceC1364105Vn<? super C1026603zs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = auctionAddressPayVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026603zs(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AuctionAddressPayVM auctionAddressPayVM;
        String str;
        C1C7U.LIZ("AuctionAddressPayVM@b013.queryAuctionInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (i != 0) {
            if (i == 1) {
                auctionAddressPayVM = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            auctionAddressPayVM = this.LLILLL;
            GetAuctionInfoRequest getAuctionInfoRequest = auctionAddressPayVM.LL;
            if (getAuctionInfoRequest != null) {
                C10291040r c10291040r = InterfaceC10295040v.LIZ;
                this.LL = auctionAddressPayVM;
                this.LLILLJJLI = 1;
                obj = c10291040r.LIZIZ(getAuctionInfoRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AuctionAddressPayVM@b013.queryAuctionInfo$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AuctionAddressPayVM@b013.queryAuctionInfo$2");
            return unit;
        }
        C1026503zr c1026503zr = (C1026503zr) obj;
        if (c1026503zr == null || !c1026503zr.isValid()) {
            z = false;
        }
        if (z) {
            auctionAddressPayVM.LLILLL = (UserAuctionInfoData) c1026503zr.data;
            auctionAddressPayVM.vQ2();
        } else {
            auctionAddressPayVM.getClass();
            auctionAddressPayVM.setState(new AwS16S0001000_1(2, 18));
            auctionAddressPayVM.setState(new AwS16S0010000_1(false, 15));
            auctionAddressPayVM.withState(new AwS580S0100000_1(auctionAddressPayVM, 382));
            if (c1026503zr != null) {
                str = c1026503zr.message;
            } else {
                str = null;
            }
            C2286608xc.LJ(Log.d("queryAuctionInfo", String.valueOf(str)));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AuctionAddressPayVM@b013.queryAuctionInfo$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
