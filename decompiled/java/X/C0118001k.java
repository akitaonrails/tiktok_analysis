package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.AuctionConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.AuctionGroupLevelOne;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.AuctionGroupLevelTwo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.001k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118001k {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf A[PHI: r1
      0x00cf: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v18 java.lang.String) binds: [B:44:0x00cc, B:29:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard LIZ(com.bytedance.android.livesdk.model.message.Billboard r32) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0118001k.LIZ(com.bytedance.android.livesdk.model.message.Billboard):com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final InterfaceC1891350zJl LIZIZ(ECBillboard eCBillboard, Function0<Unit> function0, int i, int i2, Function0<String> function02) {
        boolean z;
        ?? arrayList;
        List<AuctionGroupLevelOne> list;
        ?? arrayList2;
        String str;
        Integer num = eCBillboard.uiType;
        if (num != null && num.intValue() == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Integer num2 = eCBillboard.uiType;
            if (num2 == null || num2.intValue() != 6) {
                return null;
            }
            AuctionConfig auctionConfig = eCBillboard.auctionConfig;
            if (auctionConfig != null && (list = auctionConfig.groupOneList) != null) {
                arrayList = new ArrayList();
                for (AuctionGroupLevelOne auctionGroupLevelOne : list) {
                    List<AuctionGroupLevelTwo> list2 = auctionGroupLevelOne.groupTwoList;
                    String str2 = "";
                    if (list2 != null) {
                        ArrayList<AuctionGroupLevelTwo> arrayList3 = new ArrayList();
                        for (AuctionGroupLevelTwo auctionGroupLevelTwo : list2) {
                            AuctionGroupLevelTwo auctionGroupLevelTwo2 = auctionGroupLevelTwo;
                            if (Intrinsics.LJFF(auctionGroupLevelTwo2.chosen, Boolean.TRUE) && (str = auctionGroupLevelTwo2.title) != null && !a0.LJJJIL(str)) {
                                arrayList3.add(auctionGroupLevelTwo);
                            }
                        }
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                        for (AuctionGroupLevelTwo auctionGroupLevelTwo3 : arrayList3) {
                            String str3 = auctionGroupLevelTwo3.title;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList2.add(new C0119001l(str3, auctionGroupLevelTwo3.type));
                        }
                    } else {
                        arrayList2 = C13BV.INSTANCE;
                    }
                    if (!arrayList2.isEmpty()) {
                        String str4 = auctionGroupLevelOne.title;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        arrayList.add(new C0130001w(str2, arrayList2));
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            return new C046200Eq(eCBillboard, function0, i, new C0128001u(arrayList, eCBillboard.LIZJ(i2)), function02);
        }
        Integer num3 = eCBillboard.uiType;
        if (num3 != null && num3.intValue() == 1) {
            return new C045900En(eCBillboard, function0, i, function02);
        }
        Integer num4 = eCBillboard.uiType;
        if (num4 != null && num4.intValue() == 7) {
            return new C046000Eo(eCBillboard, function0, i, i2, function02);
        }
        Integer num5 = eCBillboard.uiType;
        if (num5 == null || num5.intValue() != 2) {
            return null;
        }
        return new C046100Ep(eCBillboard, function0, i, i2, function02);
    }
}
