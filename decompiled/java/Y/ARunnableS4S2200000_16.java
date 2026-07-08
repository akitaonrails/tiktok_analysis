package Y;

import X.C1049260dPY;
import X.C1051290dSp;
import X.C1051410dT1;
import X.C1611120s1m;
import X.C1C7U;
import X.InterfaceC1020440cf4;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridAsyncSparkLoader;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS4S2200000_16 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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
        Bundle bundle;
        InterfaceC1020440cf4 interfaceC1020440cf4;
        C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
        AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = (AdHybridAsyncSparkLoader) this.l2;
        Context context = adHybridAsyncSparkLoader.context;
        if (context == null) {
            context = null;
        }
        String str = this.s0;
        String str2 = this.s1;
        C1049260dPY c1049260dPY = ((C1051290dSp) this.l3).LJFF;
        if (c1049260dPY != null) {
            bundle = c1049260dPY.LIZJ;
            interfaceC1020440cf4 = c1049260dPY.LJ;
        } else {
            bundle = null;
            interfaceC1020440cf4 = null;
        }
        String str3 = adHybridAsyncSparkLoader.scene;
        if (str3 == null) {
            str3 = null;
        }
        c1051410dT1.getClass();
        AdSparkHybridContext adSparkHybridContextLIZ = C1051410dT1.LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, null, null, null, false, null);
        AdHybridAsyncSparkLoader adHybridAsyncSparkLoader2 = (AdHybridAsyncSparkLoader) this.l2;
        String str4 = this.s0;
        C1051290dSp c1051290dSp = (C1051290dSp) this.l3;
        String str5 = c1051290dSp.LIZIZ;
        String str6 = adHybridAsyncSparkLoader2.scene;
        adHybridAsyncSparkLoader2.realLoad(str4, adSparkHybridContextLIZ, str5, str6 != null ? str6 : null, c1051290dSp.LJFF);
    }

    public static final void run$0(ARunnableS4S2200000_16 aRunnableS4S2200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdHybridAsyncSparkLoader@4832.onPreRender$1");
        try {
            aRunnableS4S2200000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdHybridAsyncSparkLoader@4832.onPreRender$1");
    }

    public static final void run$1(ARunnableS4S2200000_16 aRunnableS4S2200000_16) {
        boolean zLIZ;
        C1C7U.LIZ("SearchIconGenerator@a3fd.mobEnterSearchPagesEvent$1");
        try {
            ((C1611120s1m) aRunnableS4S2200000_16.l2).LJIILIIL((Aweme) aRunnableS4S2200000_16.l3, aRunnableS4S2200000_16.s0, aRunnableS4S2200000_16.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchIconGenerator@a3fd.mobEnterSearchPagesEvent$1");
    }

    public ARunnableS4S2200000_16(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
