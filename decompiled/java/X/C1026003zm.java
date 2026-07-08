package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionInfoSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.UserAuctionInfoData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM$openAddressListPage$2", f = "AuctionAddressPayVM.kt", l = {457}, m = "invokeSuspend")
public final class C1026003zm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuctionAddressPayVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026003zm(AuctionAddressPayVM auctionAddressPayVM, Context context, String str, String str2, String str3, InterfaceC1364105Vn<? super C1026003zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = auctionAddressPayVM;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026003zm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIIIZZ;
        AuctionInfoSchema auctionInfoSchema;
        String str;
        String str2;
        C1C7U.LIZ("AuctionAddressPayVM@b013.openAddressListPage$2");
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
            this.LLILLJJLI.xQ2("add_shipping_info", false);
            AddressPageStarter addressPageStarter = AddressPageStarter.LIZ;
            Context context = this.LLILLL;
            String str3 = this.LLILZ;
            AuctionAddressPayVM auctionAddressPayVM = this.LLILLJJLI;
            HashMap<String, Object> map = auctionAddressPayVM.LLILLJJLI;
            if (map != null) {
                GetAuctionInfoRequest getAuctionInfoRequest = auctionAddressPayVM.LL;
                String str4 = "";
                if (getAuctionInfoRequest == null || (str = getAuctionInfoRequest.skuId) == null) {
                    str = "";
                }
                map.put("sku_id", str);
                GetAuctionInfoRequest getAuctionInfoRequest2 = auctionAddressPayVM.LL;
                if (getAuctionInfoRequest2 != null && (str2 = getAuctionInfoRequest2.roomId) != null) {
                    str4 = str2;
                }
                map.put("room_id", str4);
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
            } else {
                strLJIIIIZZ = null;
            }
            String str5 = this.LLILZIL;
            if (str5 == null) {
                UserAuctionInfoData userAuctionInfoData = this.LLILLJJLI.LLILLL;
                if (userAuctionInfoData != null && (auctionInfoSchema = userAuctionInfoData.schema) != null) {
                    str5 = auctionInfoSchema.addressListSchema;
                } else {
                    str5 = null;
                }
            }
            String str6 = this.LLILZLL;
            Integer numLJ = C2286608xc.LJ(9);
            Integer numLJ2 = C2286608xc.LJ(8);
            this.LL = 1;
            if (AddressPageStarter.LIZLLL(addressPageStarter, context, str3, strLJIIIIZZ, str5, str6, null, false, null, null, numLJ, numLJ2, null, null, null, this, 29632) == objLJFF) {
                C1C7U.LIZIZ("AuctionAddressPayVM@b013.openAddressListPage$2");
                return objLJFF;
            }
        }
        AuctionAddressPayVM auctionAddressPayVM2 = this.LLILLJJLI;
        AddressPageStarter.AddressEvent addressEvent = auctionAddressPayVM2.LLILZLL;
        if (addressEvent != null) {
            auctionAddressPayVM2.wQ2(addressEvent);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuctionAddressPayVM@b013.openAddressListPage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
