package Y;

import X.C054G;
import X.C0PEM;
import X.C1179560gni;
import X.C1179580gnk;
import X.C1179600gnm;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS19S0210000_18 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
        View view = (View) this.l0;
        C054G c054gLIZ = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        PoiStaticMapAssem poiStaticMapAssem = (PoiStaticMapAssem) this.l1;
        String str = (String) poiStaticMapAssem.withState(poiStaticMapAssem.Go(), AFwS256S0000000_18.get$arr$(1007));
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1361);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1362);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1363);
        if (this.z2) {
            C1DFH c1dfh = C0PEM.LIZ;
            c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(((PoiStaticMapAssem) this.l1).LLJILLL));
        }
        C1179600gnm.LIZLLL(viewGroup, str, awS562S0100000_18, awS562S0100000_182, awS562S0100000_183, c054gLIZ);
        ((View) this.l0).setClickable(true);
        ((View) this.l0).setFocusable(true);
        ((View) this.l0).setOnTouchListener(new ATListenerS451S0100000_18((PoiStaticMapAssem) this.l1, 9));
    }

    public final void LIZ$1() {
        View view = (View) this.l0;
        C054G c054gLIZ = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        PoiStaticMapAssem poiStaticMapAssem = (PoiStaticMapAssem) this.l1;
        String str = (String) poiStaticMapAssem.withState(poiStaticMapAssem.Go(), AFwS256S0000000_18.get$arr$(1007));
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1364);
        AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1365);
        AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((PoiStaticMapAssem) this.l1, 1366);
        if (this.z2) {
            C1DFH c1dfh = C0PEM.LIZ;
            c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(((PoiStaticMapAssem) this.l1).LLJILLL));
        }
        C1179600gnm.LIZLLL(viewGroup, str, awS562S0100000_18, awS562S0100000_182, awS562S0100000_183, c054gLIZ);
    }

    public static final void run$0(ARunnableS19S0210000_18 aRunnableS19S0210000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiStaticMapAssem@1d3b.onViewCreated$1");
        try {
            aRunnableS19S0210000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiStaticMapAssem@1d3b.onViewCreated$1");
    }

    public static final void run$1(ARunnableS19S0210000_18 aRunnableS19S0210000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiStaticMapAssem@1d3b.onViewCreated$3$1");
        try {
            aRunnableS19S0210000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiStaticMapAssem@1d3b.onViewCreated$3$1");
    }

    public static final void run$2(ARunnableS19S0210000_18 aRunnableS19S0210000_18) {
        boolean zLIZ;
        C054G c054gLIZ;
        C1C7U.LIZ("LynxMapView@6fbb.tryShowStaticMap$1");
        try {
            C1179560gni c1179560gni = (C1179560gni) aRunnableS19S0210000_18.l0;
            ViewGroup viewGroup = c1179560gni.LL;
            String str = ((C1179580gnk) aRunnableS19S0210000_18.l1).address;
            AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(803);
            AFwS206S0000000_18 aFwS206S0000000_182 = AFwS206S0000000_18.get$arr$(804);
            AFwS206S0000000_18 aFwS206S0000000_183 = AFwS206S0000000_18.get$arr$(805);
            if (aRunnableS19S0210000_18.z2) {
                C1DFH c1dfh = C0PEM.LIZ;
                c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c1179560gni.LLILZ));
            } else {
                c054gLIZ = null;
            }
            C1179600gnm.LIZLLL(viewGroup, str, aFwS206S0000000_18, aFwS206S0000000_182, aFwS206S0000000_183, c054gLIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxMapView@6fbb.tryShowStaticMap$1");
    }

    public ARunnableS19S0210000_18(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
