package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260851DeN extends AbstractC495800JcQ<Unit> {
    public int LLILZIL;
    public final EnumC495780JcO LLILZLL;
    public final boolean LLIZ;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.bv0;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
    }

    public final String LJIJI() {
        return this.LL.LJIIIZ.LIZJ;
    }

    public final boolean LJIJJ() {
        return this.LL.LIZJ.LIZLLL;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLIZ;
    }

    public C2260851DeN(C495920Jcc c495920Jcc) {
        boolean z;
        super(c495920Jcc);
        this.LLILZIL = -1;
        this.LLILZLL = EnumC495780JcO.ECOM;
        C495950Jcf c495950Jcf = c495920Jcc.LIZJ;
        if (!c495950Jcf.LJII && !c495950Jcf.LJIIIIZZ && !c495920Jcc.LJIIIIZZ.coHostEnable) {
            z = false;
        } else {
            z = true;
        }
        this.LLIZ = z;
    }

    public static void LJIJJLI(C495980Jci c495980Jci) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", c495980Jci.LJIIIZ.LIZ);
        c495980Jci.LJIIIZ.getClass();
        linkedHashMap.put("enter_from", "");
        linkedHashMap.put("enter_from_merge", c495980Jci.LJIIIZ.LIZJ);
        linkedHashMap.put("enter_method", c495980Jci.LJIIIZ.LIZIZ);
        linkedHashMap.put("click_module", c495980Jci.LJIIIIZZ.clickModule);
        linkedHashMap.put("card_click_view", c495980Jci.LIZJ.LIZ());
        linkedHashMap.put("actual_room_id", String.valueOf(c495980Jci.LJFF.getId()));
        linkedHashMap.put("actual_anchor_id", String.valueOf(c495980Jci.LJFF.getOwnerUserId()));
        linkedHashMap.put("user_id", String.valueOf(c495980Jci.LJI.getId()));
        linkedHashMap.put("to_user_id", String.valueOf(c495980Jci.LJII));
        linkedHashMap.put("module_name", "vertical_party");
        linkedHashMap.put("function_name", "ecom");
        linkedHashMap.put("follow_status", String.valueOf(c495980Jci.LJFF.getOwner().getFollowInfo().getFollowStatus()));
        C20684815ws.LJIILLIIL("livesdk_live_profile_card_module_click", linkedHashMap);
    }

    public static List LJIJ(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EcommerceEntrance.SellingPoint) obj).sellingPointType != 1 || !z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0889, code lost:
    
        if (r9 != null) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0252  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 2633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2260851DeN.LJIIIZ(com.bytedance.android.live.base.model.user.User, java.lang.Object):boolean");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0HAP, X.1828, X.185J] */
    public static void LJIIZILJ(final C18L9 c18l9, List list, boolean z) {
        List listLJIJ = LJIJ(list, z);
        ?? r3 = new AnonymousClass1828<C18L9>(c18l9) { // from class: X.0HAP
            public final void LJIIL(C0HAQ c0haq) {
                String str;
                boolean z2 = true;
                this.LJI = true;
                ((LinkedHashMap) this.LJFF).clear();
                this.LIZLLL.clear();
                C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
                int i = c0haq.LIZIZ;
                if (i > 0) {
                    ((C18L9) this.LIZ).setMaxTagCount(i);
                }
                for (SellingItem sellingItem : c0haq.LIZ) {
                    if (sellingItem.sellingItemType != 0 && (str = sellingItem.showText) != null) {
                        this.LIZLLL.add(sellingItem);
                        if (sellingItem.sellingItemType == 1) {
                            LJIIJ(C0HAH.LIZIZ(this.LIZJ, str, this.LJ));
                        } else {
                            LJIIJ(C0HAH.LIZ(this.LIZJ, str, this.LJ, sellingItem.icon));
                        }
                    }
                }
                if (((ViewGroup) this.LIZ).getChildCount() <= 0) {
                    z2 = false;
                }
                LJIIIZ(z2);
            }
        };
        C0GSD c0gsd = new C0GSD();
        r3.LJ = c0gsd;
        if (c0gsd.LJIIL) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c18l9.LLIZ = iLIZIZ;
            c18l9.LLILZLL = iLIZIZ2;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e6);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c18l9.LIZ(c384050F3z.LIZ(r3.LIZJ), 0);
        } else {
            c18l9.LLIZ = 0;
            c18l9.LLILZLL = 0;
            c18l9.LIZ(null, 0);
            c18l9.setChildHorizontalMargin(0);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIJ, 10));
        for (EcommerceEntrance.SellingPoint sellingPoint : (ArrayList) listLJIJ) {
            arrayList.add(new SellingItem(sellingPoint.showText, sellingPoint.sellingPointType, null, null, null));
        }
        r3.LJIIL(new C0HAQ(arrayList));
    }
}
