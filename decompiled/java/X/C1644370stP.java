package X;

import Y.ALAdapterS20S0100000_25;
import Y.AObserverS186S0200000_25;
import Y.AUListenerS273S0100000_25;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.LiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0stP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644370stP {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public InterfaceC1461390o8H LIZ;
    public final InterfaceC1455860nzM LIZIZ;
    public final InterfaceC1465710oFF LIZJ;
    public final InterfaceC1639870sm9 LIZLLL;
    public final LiveData<C1453000nuk> LJ;
    public final int LJFF;
    public final InterfaceC1642160spq LJI;
    public final C01GW LJII;
    public C1644120st0 LJIIIIZZ;
    public FilterBean LJIIIZ;
    public FilterBean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public ValueAnimator LJIILIIL;
    public final GestureInteractItem LJIILJJIL;
    public final ALAdapterS20S0100000_25 LJIILL;
    public final AUListenerS273S0100000_25 LJIILLIIL;

    public final void LIZ(float f) {
        boolean z;
        List list;
        int i;
        FilterBean filterBeanLIZIZ;
        int iIntValue = 0;
        byte b = 1;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = 0;
        } else if (f < 0.0f) {
            b = -1;
        }
        InterfaceC1640320sms interfaceC1640320smsLJJI = this.LIZLLL.LJJI();
        FilterBean filterBean = this.LJIIIZ;
        FilterBean filterBeanLIZIZ2 = null;
        if (this.LJI == null) {
            iIntValue = C1453230nv7.LJI(filterBean, interfaceC1640320smsLJJI);
        } else if (filterBean != null && (list = (List) interfaceC1640320smsLJJI.LJFF().getValue()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.LJI.LIZ(((FilterBean) obj).getCategoryKey())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), filterBean)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        if (b != -1) {
            if (b != 0) {
                i = iIntValue + 1;
            } else {
                i = iIntValue;
            }
        } else {
            i = iIntValue;
            iIntValue--;
        }
        if (iIntValue < 0) {
            filterBeanLIZIZ = null;
        } else {
            filterBeanLIZIZ = LIZIZ(interfaceC1640320smsLJJI, iIntValue);
        }
        if (i < LIZJ(interfaceC1640320smsLJJI).size()) {
            filterBeanLIZIZ2 = LIZIZ(interfaceC1640320smsLJJI, i);
        }
        C1644120st0 c1644120st0 = this.LJIIIIZZ;
        if (c1644120st0 != null) {
            c1644120st0.LIZ.LLLIIIIL().rt1(filterBeanLIZIZ, filterBeanLIZIZ2, f);
        }
    }

    public final List<FilterBean> LIZJ(InterfaceC1640320sms interfaceC1640320sms) {
        if (this.LJI == null) {
            return C1453230nv7.LJFF(interfaceC1640320sms);
        }
        List list = (List) interfaceC1640320sms.LJI().getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.LJI.LIZ(((FilterBean) obj).getCategoryKey())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final int LIZLLL(InterfaceC1640320sms interfaceC1640320sms) {
        if (this.LJI == null) {
            return C1453230nv7.LJI(this.LJIIIZ, interfaceC1640320sms);
        }
        List list = (List) interfaceC1640320sms.LJI().getValue();
        int i = 0;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.LJI.LIZ(((FilterBean) obj).getCategoryKey())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next(), this.LJIIIZ)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final FilterBean LIZIZ(InterfaceC1640320sms interfaceC1640320sms, int i) {
        ArrayList arrayList;
        int size;
        FilterBean filterBean;
        if (this.LJI == null) {
            return C1453230nv7.LIZLLL(interfaceC1640320sms, i);
        }
        List list = (List) interfaceC1640320sms.LJI().getValue();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (this.LJI.LIZ(((FilterBean) obj).getCategoryKey())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        int iLIZIZ = C419990GdR.LIZIZ(i, 0, Math.max(size - 1, 0));
        if (arrayList == null || (filterBean = (FilterBean) C13LP.LJJJLZIJ(iLIZIZ, arrayList)) == null) {
            return C1638720skI.LIZLLL();
        }
        return filterBean;
    }

    public final boolean LJ(float f, float f2) {
        boolean z;
        boolean z2;
        ValueAnimator valueAnimatorOfFloat;
        float fAbs;
        float fAbs2;
        if (!this.LJIIJJI) {
            return false;
        }
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C1644120st0 c1644120st0 = this.LJIIIIZZ;
        if (c1644120st0 != null && c1644120st0.LIZ(z)) {
            return true;
        }
        int width = this.LIZ.getRootView().getWidth();
        InterfaceC1640320sms interfaceC1640320smsLJJI = this.LIZLLL.LJJI();
        if (Math.signum(f2) == Math.signum(f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.LJIIJ = this.LJIIIZ;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 0.0f);
            fAbs = (long) (width * Math.abs(f2));
            fAbs2 = Math.abs(f);
        } else {
            if (f >= 1.0E-5f) {
                this.LJIIJ = LIZIZ(interfaceC1640320smsLJJI, Math.max(0, LIZLLL(interfaceC1640320smsLJJI) - 1));
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, -1.0f);
            } else {
                this.LJIIJ = LIZIZ(interfaceC1640320smsLJJI, Math.min(LIZJ(interfaceC1640320smsLJJI).size() - 1, LIZLLL(interfaceC1640320smsLJJI) + 1));
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, 1.0f);
            }
            fAbs = (long) (width * (1 - Math.abs(f2)));
            fAbs2 = Math.abs(f);
        }
        long jMin = Math.min((long) (fAbs / ((fAbs2 / LSPassThroughRecordSizeConfig.DEFAULT) / 2)), 400L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(jMin);
        valueAnimatorOfFloat.addUpdateListener(this.LJIILLIIL);
        valueAnimatorOfFloat.addListener(this.LJIILL);
        this.LJIILIIL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        return true;
    }

    public C1644370stP(C1644140st2 c1644140st2, InterfaceC1461390o8H interfaceC1461390o8H, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC1465710oFF interfaceC1465710oFF, InterfaceC1639870sm9 interfaceC1639870sm9, LiveData liveData, int i, C1644090ssx c1644090ssx, AwS604S0100000_25 awS604S0100000_25) {
        this.LIZ = interfaceC1461390o8H;
        this.LIZIZ = interfaceC1455860nzM;
        this.LIZJ = interfaceC1465710oFF;
        this.LIZLLL = interfaceC1639870sm9;
        this.LJ = liveData;
        this.LJFF = i;
        this.LJI = c1644090ssx;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1059));
        this.LJII = c01gwLIZIZ;
        this.LJIIL = -1;
        GestureInteractItem gestureInteractItem = new GestureInteractItem(0, (C1644390stR) c01gwLIZIZ.getValue());
        this.LJIILJJIL = gestureInteractItem;
        this.LIZ.LIZIZ(gestureInteractItem);
        this.LJ.observe(c1644140st2, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) awS604S0100000_25, (l0) 10));
        this.LJIILL = new ALAdapterS20S0100000_25(this, 11);
        this.LJIILLIIL = new AUListenerS273S0100000_25(this, 9);
    }
}
