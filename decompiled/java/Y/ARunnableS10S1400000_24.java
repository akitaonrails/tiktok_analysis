package Y;

import X.C145100gz;
import X.C1605720rt4;
import X.C1617740sCS;
import X.C19EG;
import X.C1C7U;
import X.C727780Sgi;
import X.InterfaceC1575850r6t;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS10S1400000_24 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final InterfaceC1575850r6t interfaceC1575850r6t = (InterfaceC1575850r6t) this.l4;
        final String str = this.s0;
        ((MutableLiveData) this.l1).observe((LifecycleOwner) this.l2, new Observer() { // from class: X.0r7r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EnumC1576350r7h enumC1576350r7h;
                C727780Sgi c727780Sgi = (C727780Sgi) obj;
                InterfaceC1575850r6t interfaceC1575850r6t2 = interfaceC1575850r6t;
                String str2 = str;
                int i = c727780Sgi.LIZ;
                Integer num = c727780Sgi.LIZIZ;
                if (Intrinsics.LJFF(c727780Sgi.LIZJ, Boolean.TRUE)) {
                    enumC1576350r7h = EnumC1576350r7h.FROM_LOCAL_CONSUME;
                } else {
                    enumC1576350r7h = EnumC1576350r7h.FROM_SERVER;
                }
                interfaceC1575850r6t2.Wn(str2, i, num, enumC1576350r7h);
            }
        });
        if (((Boolean) C145100gz.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1605720rt4 c1605720rt4 = (C1605720rt4) this.l3;
            if (jCurrentTimeMillis - c1605720rt4.LJ >= 60000) {
                c1605720rt4.LIZ("inner_clean_interval");
                ((C1605720rt4) this.l3).LJ = System.currentTimeMillis();
            }
        }
    }

    public static final void run$0(ARunnableS10S1400000_24 aRunnableS10S1400000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SocPubStatusCache@d9ef.observeWithLc$1$3");
        try {
            aRunnableS10S1400000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocPubStatusCache@d9ef.observeWithLc$1$3");
    }

    public static final void run$1(ARunnableS10S1400000_24 aRunnableS10S1400000_24) {
        C1617740sCS c1617740sCS = (C1617740sCS) aRunnableS10S1400000_24.l1;
        PublishFailureReason publishFailureReason = (PublishFailureReason) aRunnableS10S1400000_24.l2;
        C19EG c19eg = (C19EG) aRunnableS10S1400000_24.l3;
        PublishModel publishModel = (PublishModel) aRunnableS10S1400000_24.l4;
        String str = aRunnableS10S1400000_24.s0;
        c1617740sCS.getClass();
        C1C7U.LIZ("AvApiFragmentObserver@e080.doShowUploadRecoverIfNeed$1L");
        c1617740sCS.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, c19eg, publishModel, str, false, true);
        C1C7U.LIZIZ("AvApiFragmentObserver@e080.doShowUploadRecoverIfNeed$1L");
    }

    public static final void run$2(ARunnableS10S1400000_24 aRunnableS10S1400000_24) {
        C1617740sCS c1617740sCS = (C1617740sCS) aRunnableS10S1400000_24.l1;
        PublishFailureReason publishFailureReason = (PublishFailureReason) aRunnableS10S1400000_24.l2;
        C19EG c19eg = (C19EG) aRunnableS10S1400000_24.l3;
        PublishModel publishModel = (PublishModel) aRunnableS10S1400000_24.l4;
        String str = aRunnableS10S1400000_24.s0;
        c1617740sCS.getClass();
        C1C7U.LIZ("AvApiFragmentObserver@e080.doShowUploadRecoverIfNeed$2L");
        c1617740sCS.LIZIZ.showUploadRecoverIfNeed(publishFailureReason, c19eg, publishModel, str, false, false);
        C1C7U.LIZIZ("AvApiFragmentObserver@e080.doShowUploadRecoverIfNeed$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S1400000_24(Object obj, MutableLiveData<C727780Sgi> mutableLiveData, LifecycleOwner lifecycleOwner, C1605720rt4 c1605720rt4, InterfaceC1575850r6t interfaceC1575850r6t, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = mutableLiveData;
        this.l3 = lifecycleOwner;
        this.l4 = c1605720rt4;
        this.s0 = interfaceC1575850r6t;
    }
}
