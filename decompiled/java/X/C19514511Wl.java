package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: X.11Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514511Wl {
    public final Cert LIZ;
    public WeakReference<Activity> LIZIZ;
    public final C19514611Wm LIZJ;

    public C19514511Wl(Cert cert) {
        this.LIZ = cert;
        this.LIZJ = new C19514611Wm(cert);
    }

    public final void LIZ(InterfaceC19515111Wr interfaceC19515111Wr) {
        C19514011Wg.LIZIZ(0);
        this.LIZJ.LJFF = interfaceC19515111Wr;
        WeakReference<Activity> weakReference = this.LIZIZ;
        if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                C19514611Wm c19514611Wm = this.LIZJ;
                c19514611Wm.getClass();
                if (!new ArrayList(c19514611Wm.LIZIZ).isEmpty() || !((ArrayList) this.LIZJ.LIZJ).isEmpty()) {
                    ArrayList arrayList = (ArrayList) this.LIZJ.LIZJ;
                    int i = 0;
                    int i2 = -1;
                    for (Object obj : arrayList) {
                        int i3 = i + 1;
                        if (i >= 0) {
                            if ((obj instanceof C19514311Wj) && i2 == -1) {
                                i2 = i;
                            }
                            i = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (i2 >= 0) {
                        Iterator<AbstractC19515011Wq> it2 = C19514711Wn.LIZLLL.iterator();
                        while (it2.hasNext()) {
                            C19514911Wp c19514911Wp = new C19514911Wp(it2.next());
                            c19514911Wp.LIZ = this.LIZJ;
                            ListProtector.add(arrayList, i2, c19514911Wp);
                        }
                        C19514111Wh c19514111Wh = new C19514111Wh(activity, interfaceC19515111Wr);
                        c19514111Wh.LIZ = this.LIZJ;
                        ListProtector.add(arrayList, i2, c19514111Wh);
                        for (AbstractC19515011Wq abstractC19515011Wq : C19514711Wn.LJ) {
                            abstractC19515011Wq.LIZ = this.LIZJ;
                            ListProtector.add(arrayList, 0, abstractC19515011Wq);
                        }
                    }
                    this.LIZJ.LIZJ();
                    C19514011Wg.LIZIZ(2);
                    return;
                }
            }
            C19514011Wg.LIZIZ(1);
            interfaceC19515111Wr.onCanceled();
            return;
        }
        C19514011Wg.LIZIZ(13);
    }

    public final C19514511Wl LIZIZ(String... strArr) {
        C19514611Wm c19514611Wm = this.LIZJ;
        c19514611Wm.LIZIZ.addAll(C13LQ.LJJLL(strArr));
        this.LIZJ.LIZ(new AbstractC19515011Wq() { // from class: X.11Wj
            @Override // X.AbstractC19515011Wq
            public final void LIZ(C19514611Wm c19514611Wm2, String... strArr2) {
                WeakReference<InterfaceC19514411Wk> weakReference;
                InterfaceC19514411Wk interfaceC19514411Wk;
                if (c19514611Wm2 != null && (weakReference = c19514611Wm2.LIZLLL) != null && (interfaceC19514411Wk = weakReference.get()) != null) {
                    interfaceC19514411Wk.Um(C1697810uHb.LJIIJJI(Arrays.copyOf(strArr2, strArr2.length)));
                }
            }
        });
        return this;
    }

    public final void LIZJ(InterfaceC19515111Wr interfaceC19515111Wr) {
        Integer numLIZ;
        Activity activity = this.LIZIZ.get();
        if (activity instanceof C199Y) {
            C19FO c19fo = (C19FO) activity;
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) c19fo.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.IS_FINISHING;
            if ((abstractC1563340qmi.LJI(enumC682280QpW) || ((AbstractC1563340qmi) c19fo.getLifecycle()).LJI(EnumC682280QpW.IS_DESTROY)) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue() | EnumC682280QpW.IS_DESTROY.getValue(), activity)) != null) {
                LIZ(interfaceC19515111Wr);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), activity);
                return;
            }
        }
        LIZ(interfaceC19515111Wr);
    }
}
