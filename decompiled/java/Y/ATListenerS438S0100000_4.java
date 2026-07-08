package Y;

import X.C0DSV;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C557050Lt1;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallTouchDownPreconnectConfig;
import com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightAssem;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public class ATListenerS438S0100000_4 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS438S0100000_4(int i) {
        this.$t = i;
        this.l0 = new C557050Lt1(false);
    }

    public ATListenerS438S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS438S0100000_4 aTListenerS438S0100000_4, View view, MotionEvent motionEvent) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((FollowingInnerSkylightAssem) aTListenerS438S0100000_4.l0).LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.dispatchTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$1(ATListenerS438S0100000_4 aTListenerS438S0100000_4, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    if (motionEvent.getRawY() - ((SkuBottomSheetFragment) aTListenerS438S0100000_4.l0).LLIZLLLIL <= ViewConfiguration.get(r1.requireContext()).getScaledTouchSlop()) {
                        return true;
                    }
                    ((SkuBottomSheetFragment) aTListenerS438S0100000_4.l0).dismiss();
                    return true;
                }
            }
            ((SkuBottomSheetFragment) aTListenerS438S0100000_4.l0).LLIZLLLIL = 0.0f;
            return true;
        }
        ((SkuBottomSheetFragment) aTListenerS438S0100000_4.l0).LLIZLLLIL = motionEvent.getRawY();
        return true;
    }

    public static final boolean onTouch$2(ATListenerS438S0100000_4 aTListenerS438S0100000_4, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0 && ((C557050Lt1) aTListenerS438S0100000_4.l0).LIZ(false, true)) {
            try {
                EcMixMallTouchDownPreconnectConfig.LIZ.getClass();
                List listLIZIZ = EcMixMallTouchDownPreconnectConfig.LIZIZ();
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("touchdown_preconnect,preconnectImageUrls: ");
                sbLIZ.append(listLIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ);
                Iterator it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    TTNetInit.preconnectUrl((String) it2.next());
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS438S0100000_4 aTListenerS438S0100000_4, View view, MotionEvent motionEvent) {
        ViewParent parent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && (parent = ((C0DSV) aTListenerS438S0100000_4.l0).getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        } else {
            ViewParent parent2 = ((C0DSV) aTListenerS438S0100000_4.l0).getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
                return false;
            }
        }
        return false;
    }
}
