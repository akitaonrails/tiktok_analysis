package Y;

import X.C09JN;
import X.C1143680frq;
import X.C15438062q;
import X.C1AGA;
import X.C1AGN;
import X.C1AHJ;
import X.C1AHK;
import X.C1AHM;
import X.C1C7U;
import X.C2176861AHk;
import X.C2176871AHl;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497740JfY;
import X.C782110Um9;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC20674115v9;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.viewer_picks.model.DeleteOrderResponse;
import com.bytedance.android.livesdk.viewer_picks.model.ListOrdersResponse;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksOrder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AfS119S0300000_33 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        C1C7U.LIZ("MaskPointExpressionHelper@4364.handleAnimation$1");
        C1AGN c1agn = (C1AGN) afS119S0300000_33.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAnimation, PATH_ANIMATION_TYPE error:");
        sbLIZ.append(obj);
        c1agn.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        HandlerHook.viewRemoveCallbacks(((C1AGN) afS119S0300000_33.l0).LIZ, new ARunnableS119S0100000_19((Function0) afS119S0300000_33.l1, 12));
        ((C1AGN) afS119S0300000_33.l0).LJIIIZ = null;
        ((C1AGN) afS119S0300000_33.l0).LJ((C1AGA) afS119S0300000_33.l2);
        C1C7U.LIZIZ("MaskPointExpressionHelper@4364.handleAnimation$1");
    }

    public static final void accept$1(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        C1C7U.LIZ("MaskPointExpressionHelper@4364.handleAnimation$3");
        C1AGN c1agn = (C1AGN) afS119S0300000_33.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAnimation, NORMAL_ANIMATION_TYPE error:");
        sbLIZ.append(obj);
        c1agn.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        HandlerHook.viewRemoveCallbacks(((C1AGN) afS119S0300000_33.l0).LIZ, new ARunnableS119S0100000_19((Function0) afS119S0300000_33.l1, 12));
        ((C1AGN) afS119S0300000_33.l0).LJIIIZ = null;
        ((C1AGN) afS119S0300000_33.l0).LJ((C1AGA) afS119S0300000_33.l2);
        C1C7U.LIZIZ("MaskPointExpressionHelper@4364.handleAnimation$3");
    }

    public static final void accept$2(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        C1C7U.LIZ("MaskPointExpressionHelper@4364.handleAnimation$4");
        ((C1AGN) afS119S0300000_33.l0).LIZLLL("handleAnimation, NORMAL_ANIMATION_TYPE success");
        HandlerHook.viewRemoveCallbacks(((C1AGN) afS119S0300000_33.l0).LIZ, new ARunnableS119S0100000_19((Function0) afS119S0300000_33.l1, 12));
        ((C1AGN) afS119S0300000_33.l0).LJIIIZ = null;
        ((C1AGN) afS119S0300000_33.l0).LJ((C1AGA) afS119S0300000_33.l2);
        C1C7U.LIZIZ("MaskPointExpressionHelper@4364.handleAnimation$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        C1C7U.LIZ("ViewerWishesQueuePagePresenter@3d8.requestOrders$4");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((EnumC20674115v9) afS119S0300000_33.l0) == EnumC20674115v9.POLL && ((C2176871AHl) afS119S0300000_33.l1).LIZIZ.size() > C2176861AHk.LIZ()) {
            ((C2176871AHl) afS119S0300000_33.l1).LJ = false;
        } else {
            ((C2176871AHl) afS119S0300000_33.l1).LIZJ = ((ListOrdersResponse.Data) baseResponse.data).total;
            if (((EnumC20674115v9) afS119S0300000_33.l0) == EnumC20674115v9.LOAD_MORE && r2.orders.size() >= C2176861AHk.LIZ()) {
                ((C2176871AHl) afS119S0300000_33.l1).LIZLLL++;
            }
            List<ViewerPicksOrder> list = ((ListOrdersResponse.Data) baseResponse.data).orders;
            C2176871AHl c2176871AHl = (C2176871AHl) afS119S0300000_33.l1;
            ArrayList arrayList = new ArrayList();
            for (ViewerPicksOrder viewerPicksOrder : list) {
                long j = viewerPicksOrder.id;
                Long l = c2176871AHl.LJFF;
                if (l == null || j != l.longValue()) {
                    arrayList.add(viewerPicksOrder);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (((EnumC20674115v9) afS119S0300000_33.l0) != EnumC20674115v9.LOAD_MORE) {
                ((C2176871AHl) afS119S0300000_33.l1).LIZIZ = arrayList2;
                ((Function1) afS119S0300000_33.l2).invoke(arrayList2);
            } else {
                List<ViewerPicksOrder> list2 = ((C2176871AHl) afS119S0300000_33.l1).LIZIZ;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<ViewerPicksOrder> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(it2.next().id));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!arrayList3.contains(Long.valueOf(((ViewerPicksOrder) obj2).id))) {
                        arrayList4.add(obj2);
                    }
                }
                ((C2176871AHl) afS119S0300000_33.l1).LIZIZ.addAll(arrayList4);
                ((Function1) afS119S0300000_33.l2).invoke(new ArrayList(arrayList4));
            }
            ((C2176871AHl) afS119S0300000_33.l1).LJ = false;
        }
        C1C7U.LIZIZ("ViewerWishesQueuePagePresenter@3d8.requestOrders$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        long j;
        DeleteOrderResponse.Data data;
        C1C7U.LIZ("ViewerWishesQueuePagePresenter@3d8.deleteOrder$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        long jLongValue = 0;
        if (baseResponse != null && (data = (DeleteOrderResponse.Data) baseResponse.data) != null) {
            j = data.viewerPicksOrderId;
        } else {
            j = 0;
        }
        Iterator<ViewerPicksOrder> it2 = ((C2176871AHl) afS119S0300000_33.l0).LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ViewerPicksOrder next = it2.next();
            if (next.id == j) {
                if (next != null) {
                    ((C2176871AHl) afS119S0300000_33.l0).LIZIZ.remove(next);
                    r4.LIZJ--;
                    ((C2176871AHl) afS119S0300000_33.l0).LJFF = Long.valueOf(j);
                    Function1 function1 = (Function1) afS119S0300000_33.l2;
                    Long l = ((C2176871AHl) afS119S0300000_33.l0).LJFF;
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    function1.invoke(Long.valueOf(jLongValue));
                }
            }
        }
        ((Function0) afS119S0300000_33.l1).invoke();
        C1C7U.LIZIZ("ViewerWishesQueuePagePresenter@3d8.deleteOrder$3");
    }

    public static final void accept$5(AfS119S0300000_33 afS119S0300000_33, Object obj) {
        C1C7U.LIZ("LiveCenterPropsCard@c17f.showFlareErrorDialog$2");
        Drawable drawableLIZ = (Drawable) obj;
        C1AHK c1ahk = (C1AHK) afS119S0300000_33.l0;
        String strLJIJI = c1ahk.LJI.get((C1AHM) afS119S0300000_33.l1);
        if (strLJIJI == null) {
            strLJIJI = C497740JfY.LJIJI(2131836738);
        }
        C782110Um9 c782110Um9 = new C782110Um9(((C1AHJ) afS119S0300000_33.l2).LL.getContext());
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIZILJ(2131836745);
        if (drawableLIZ == null) {
            drawableLIZ = C1143680frq.LIZ("tiktok_live_broadcast_demand_2", ((C1AHK) afS119S0300000_33.l0).LIZLLL());
        }
        c782110Um9.LJI(drawableLIZ);
        c782110Um9.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(69));
        c782110Um9.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(65));
        c782110Um9.LJIIIZ(strLJIJI);
        c782110Um9.LJIIJ(2131836734, new AcS357S0200000_33((C1AHJ) afS119S0300000_33.l2, (C1AHK) afS119S0300000_33.l0, 2));
        C786410Ut5.E4(c782110Um9.LIZ());
        C1C7U.LIZIZ("LiveCenterPropsCard@c17f.showFlareErrorDialog$2");
    }

    public AfS119S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
