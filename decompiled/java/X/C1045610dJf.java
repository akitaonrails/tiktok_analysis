package X;

import android.content.IntentFilter;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: X.0dJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045610dJf extends AbstractC1045600dJe {
    public final InterfaceC1046010dKJ LIZ;
    public WeakReference<View> LIZIZ;
    public final ArrayList<WeakReference<View>> LIZJ = new ArrayList<>();
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;
    public final String LJI = UUID.randomUUID().toString();
    public long LJII;

    @Override // X.AbstractC1045600dJe
    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        LJI();
        this.LJ = true;
        this.LIZIZ.clear();
        LIZLLL();
        C1045820dK0 c1045820dK0 = C1045820dK0.LIZLLL;
        boolean zIsEmpty = true ^ c1045820dK0.LIZIZ.isEmpty();
        c1045820dK0.LIZ.remove(this);
        c1045820dK0.LIZIZ.remove(this);
        if (zIsEmpty && c1045820dK0.LIZIZ.isEmpty()) {
            C1046040dKM.LJ.LIZIZ();
            C1045550dJZ c1045550dJZ = C1045550dJZ.LJ;
            if (c1045550dJZ.LIZ.get() != null && c1045550dJZ.LIZIZ != null) {
                C786410Ut5.LJJIFFI(c1045550dJZ.LIZ.get(), c1045550dJZ.LIZIZ);
                c1045550dJZ.LIZIZ = null;
            }
            c1045550dJZ.LIZJ = false;
            c1045550dJZ.LIZLLL = false;
        }
    }

    @Override // X.AbstractC1045600dJe
    public final void LIZLLL() {
        if (this.LJ) {
            return;
        }
        this.LIZJ.clear();
    }

    @Override // X.AbstractC1045600dJe
    public final void LJFF() throws Exception {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LJFF = false;
        this.LJII = System.nanoTime();
        C1045820dK0 c1045820dK0 = C1045820dK0.LIZLLL;
        boolean z = !c1045820dK0.LIZIZ.isEmpty();
        c1045820dK0.LIZIZ.add(this);
        if (z) {
            return;
        }
        C1046040dKM.LJ.LIZ();
        C1045550dJZ c1045550dJZ = C1045550dJZ.LJ;
        c1045550dJZ.LIZIZ = new C854540Xfg(7);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (c1045550dJZ.LIZ.get() != null) {
            C786410Ut5.LJIJJ(c1045550dJZ.LIZ.get(), c1045550dJZ.LIZIZ, intentFilter);
        }
        c1045550dJZ.LIZJ = true;
    }

    public final void LJI() {
        if (!this.LJFF) {
            C1045810dJz c1045810dJz = C1045810dJz.LIZIZ;
            String str = this.LJI;
            long j = this.LJII;
            ArrayList<C1045840dK2> arrayList = c1045810dJz.LIZ.get(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                long jMax = Math.max(j, ((C1045840dK2) ListProtector.get(arrayList, 0)).LIZ);
                Iterator<C1045840dK2> it2 = arrayList.iterator();
                loop0: while (true) {
                    long j2 = 0;
                    boolean z = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop0;
                        }
                        C1045840dK2 next = it2.next();
                        long j3 = next.LIZ;
                        if (jMax <= j3) {
                            if (next.LIZIZ >= 0.5f) {
                                if (z) {
                                    z = false;
                                    jMax = j3;
                                }
                                j2 += j3 - jMax;
                                if (j2 < 2000000000) {
                                    jMax = j3;
                                } else if (!this.LJFF) {
                                    this.LJFF = true;
                                    this.LIZ.LIZ();
                                }
                            }
                        }
                    }
                }
            }
        }
        this.LJII = Long.MAX_VALUE;
    }

    public C1045610dJf(InterfaceC1046010dKJ interfaceC1046010dKJ) {
        this.LIZIZ = new WeakReference<>(null);
        this.LIZ = interfaceC1046010dKJ;
        this.LIZIZ = new WeakReference<>(null);
        C1045820dK0.LIZLLL.LIZ.add(this);
    }

    @Override // X.AbstractC1045600dJe
    public final void LIZ(View view) {
        if (!this.LJ && view != null) {
            Iterator<WeakReference<View>> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                if (it2.next().get() == view) {
                    return;
                }
            }
            this.LIZJ.add(new WeakReference<>(view));
        }
    }

    @Override // X.AbstractC1045600dJe
    public final void LIZJ(View view) {
        if (!this.LJ && view != null && this.LIZIZ.get() != view) {
            this.LIZIZ = new WeakReference<>(view);
            for (C1045610dJf c1045610dJf : C1045820dK0.LIZLLL.LIZ) {
                if (c1045610dJf != this && c1045610dJf.LIZIZ.get() == view) {
                    c1045610dJf.LIZIZ.clear();
                }
            }
        }
    }

    @Override // X.AbstractC1045600dJe
    public final void LJ(View view) {
        if (!this.LJ && view != null) {
            WeakReference<View> weakReference = null;
            for (WeakReference<View> weakReference2 : this.LIZJ) {
                if (weakReference2.get() == view) {
                    weakReference = weakReference2;
                }
            }
            this.LIZJ.remove(weakReference);
        }
    }
}
