package Y;

import X.AnonymousClass0634;
import X.C1231470i9R;
import X.C1311205Be;
import X.C1388205c0;
import X.C15447062z;
import X.C1C7U;
import X.C23250099c;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS4S0310000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (!this.z3) {
            C786410Ut5.J4((DialogC1389620mGW) this.l0);
        }
        C1311205Be c1311205Be = C1311205Be.LIZ;
        AnonymousClass0634 anonymousClass0634 = new AnonymousClass0634((DialogC1389620mGW) this.l0);
        DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.l0;
        boolean z = this.z3;
        Function1 function1 = (Function1) this.l1;
        C1231470i9R c1231470i9R = (C1231470i9R) this.l2;
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(dialogC1389620mGW, 4);
        C15447062z c15447062z = new C15447062z("com.ss.android.ugc.aweme.openplatform.GroupChatOpenPlatformServiceFactory", null, dialogC1389620mGW, z, function1, c1231470i9R);
        c1311205Be.getClass();
        C1311205Be.LIZJ(anonymousClass0634, c15447062z, awS546S0100000_2);
    }

    public static final void run$0(ARunnableS4S0310000_2 aRunnableS4S0310000_2) {
        boolean zLIZ;
        C1C7U.LIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1");
        try {
            aRunnableS4S0310000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupChatOpenPlatformServiceWrapper@ce08.onDFDownloadedWithOpenPlatformTo$1");
    }

    public static final void run$1(ARunnableS4S0310000_2 aRunnableS4S0310000_2) {
        boolean zLIZ;
        C1C7U.LIZ("IMGroupChatApi$Internal@4fc.downloadDFTo$1");
        try {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS4S0310000_2.l0;
            if (lifecycleOwner == null) {
                lifecycleOwner = ProcessLifecycleOwner.Companion.get();
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1388205c0((Function1) aRunnableS4S0310000_2.l1, (Function0) aRunnableS4S0310000_2.l2, aRunnableS4S0310000_2.z3, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.downloadDFTo$1");
    }

    public ARunnableS4S0310000_2(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
        this.z3 = z;
    }
}
