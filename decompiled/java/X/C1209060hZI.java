package X;

import Y.AfS148S0200000_12;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hZI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209060hZI extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209060hZI(C19EG c19eg, ChooseCollectionSheetFragment chooseCollectionSheetFragment, int i) {
        super(5);
        this.$t = i;
        this.l0 = chooseCollectionSheetFragment;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209060hZI(AtomicBoolean atomicBoolean, C1786060wZw c1786060wZw, int i) {
        super(5);
        this.$t = i;
        this.l0 = atomicBoolean;
        this.l1 = c1786060wZw;
    }

    public static final Object invoke$0(C1209060hZI c1209060hZI, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final String str = (String) obj;
        final int iIntValue = ((Number) obj2).intValue();
        final List list = (List) obj3;
        final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(1, null, str, null, null, null, null, null, Integer.valueOf(iIntValue), list, null, null), ((ChooseCollectionSheetFragment) c1209060hZI.l0).RR()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        final ChooseCollectionSheetFragment chooseCollectionSheetFragment = (ChooseCollectionSheetFragment) c1209060hZI.l0;
        ((ChooseCollectionSheetFragment) c1209060hZI.l0).PR().LIZ(c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0gaN
            @Override // X.C09JN
            public final void accept(Object obj6) {
                String string;
                String string2;
                C1C7U.LIZ("ChooseCollectionSheetFragment@36b3.onClickViewHolderToCreateCollection$createCollection$1$1");
                CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj6;
                Bundle arguments = chooseCollectionSheetFragment.getArguments();
                String string3 = null;
                if (arguments != null) {
                    string = arguments.getString("enterMethod");
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(string, "click_bubble_more")) {
                    string = "click_bubble_more_create";
                }
                C1171330gaR c1171330gaR = new C1171330gaR();
                Bundle arguments2 = chooseCollectionSheetFragment.getArguments();
                if (arguments2 != null) {
                    string2 = arguments2.getString("enterFrom");
                } else {
                    string2 = null;
                }
                c1171330gaR.LIZLLL = string2;
                c1171330gaR.LJIIZILJ(0);
                c1171330gaR.LJIJ(iIntValue);
                c1171330gaR.LJIIZILJ = "click_feed_favorite_panel";
                c1171330gaR.LJIJI = collectionManageResponse.collectionId;
                c1171330gaR.LJIILLIIL(Integer.valueOf(iIntValue));
                c1171330gaR.LJIJJLI = zBooleanValue ? 1 : 0;
                c1171330gaR.LJIL = string;
                Bundle arguments3 = chooseCollectionSheetFragment.getArguments();
                if (arguments3 != null) {
                    string3 = arguments3.getString("awemeId");
                }
                c1171330gaR.LJJI = string3;
                c1171330gaR.LJJIFFI = str;
                c1171330gaR.LJJIII = zBooleanValue2;
                c1171330gaR.LJIILJJIL();
                C1609306Rv c1609306Rv = C1609306Rv.LIZ;
                List<String> list2 = list;
                c1609306Rv.getClass();
                C1609306Rv.LIZIZ(list2);
                ChooseCollectionSheetFragment chooseCollectionSheetFragment2 = chooseCollectionSheetFragment;
                chooseCollectionSheetFragment2.LLILLL = true;
                InterfaceC1170630gZJ interfaceC1170630gZJ = chooseCollectionSheetFragment2.LLILZIL;
                if (interfaceC1170630gZJ != null) {
                    interfaceC1170630gZJ.ef(true, new CollectionDetail(collectionManageResponse.collectionId, str, null, new CollectionDetail.Status(Integer.valueOf(iIntValue)), null, null, null, null, null, null, null), list, true);
                }
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(chooseCollectionSheetFragment, C343970De7.LIZ);
                C1C7U.LIZIZ("ChooseCollectionSheetFragment@36b3.onClickViewHolderToCreateCollection$createCollection$1$1");
            }
        }, new AfS148S0200000_12((C19EG) c1209060hZI.l1, chooseCollectionSheetFragment, 43)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1209060hZI c1209060hZI, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj2).longValue();
        long jLongValue2 = ((Number) obj3).longValue();
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        if (((AtomicBoolean) c1209060hZI.l0).compareAndSet(false, true)) {
            ((InterfaceC1685420txc) c1209060hZI.l1).invoke(obj, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2));
        } else {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchWifi: duplicate callback suppressed (triggered=");
            sbLIZ.append(zBooleanValue);
            sbLIZ.append(" succeeded=");
            sbLIZ.append(zBooleanValue2);
            sbLIZ.append(')');
            C1798620wuC.LIZJ("WifiClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        return Unit.LIZ;
    }
}
