package Y;

import X.C08A4;
import X.C0CB0;
import X.C0CB1;
import X.C0CBI;
import X.C1C7U;
import X.C2119708Sd;
import X.C2119908Sf;
import X.C2120008Sg;
import X.C309220CAe;
import X.C309410CAx;
import X.C309420CAy;
import X.C341910Dan;
import X.C418440Gaw;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC309240CAg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2119808Se;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.keva.Keva;
import com.bytedance.otis.art.ArtLogVerbosity;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListAssem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS23S0110000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
        if (((C0CBI) this.l0).LLILLL) {
            C0CB0 c0cb0 = C309410CAx.LIZ;
            boolean z = this.z1;
            c0cb0.getClass();
            EnumC309240CAg enumC309240CAg = EnumC309240CAg.AB;
            C309220CAe.LIZIZ(enumC309240CAg, "bootfinish_ab");
            if (z) {
                C309220CAe.LJFF(enumC309240CAg, "bootfinish_ab");
            }
        }
        if (((C0CBI) this.l0).LLILZ) {
            C0CB1 c0cb1 = C309420CAy.LIZ;
            boolean z2 = this.z1;
            c0cb1.getClass();
            EnumC309240CAg enumC309240CAg2 = EnumC309240CAg.KV;
            C309220CAe.LIZIZ(enumC309240CAg2, "bootfinish_kv");
            if (z2) {
                C309220CAe.LJFF(enumC309240CAg2, "bootfinish_kv");
            }
        }
        C0CBI c0cbi = (C0CBI) this.l0;
        if (c0cbi.LLILZIL) {
            C2120008Sg c2120008Sg = c0cbi.LLILZLL;
            boolean z3 = !this.z1;
            if (Build.VERSION.SDK_INT <= 29) {
                c2120008Sg.getClass();
            } else if (c2120008Sg.LIZ) {
                c2120008Sg.LIZ = false;
                c2120008Sg.LIZIZ = z3;
                C2119708Sd c2119708Sd = c2120008Sg.LIZJ;
                if (c2119708Sd.LIZIZ.getAndSet(false)) {
                    if (C2119708Sd.LJI.decrementAndGet() == 0) {
                        ArtLogVerbosity.disableClassLinkerLog();
                    }
                    ArrayList arrayList = new ArrayList(c2119708Sd.LJ);
                    boolean z4 = !arrayList.isEmpty();
                    InterfaceC2119808Se interfaceC2119808Se = c2119708Sd.LIZ;
                    if (interfaceC2119808Se != null) {
                        ((C2119908Sf) interfaceC2119808Se).LIZ(arrayList, z4);
                    }
                }
            }
        }
        if (this.z1) {
            Keva keva = ((C0CBI) this.l0).LLIZ;
            C844470XAv.LIZ.getClass();
            keva.storeLong("tracked_version", C844470XAv.LJ());
        }
    }

    public final void LIZ$1() {
        C341910Dan c341910Dan;
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) ((LandscapeProfileListAssem) this.l0).Go().getState().LJII()) {
            if ((interfaceC1891350zJl instanceof C341910Dan) && (c341910Dan = (C341910Dan) interfaceC1891350zJl) != null && c341910Dan.LLILLJJLI) {
                if (i < 0 || i >= ((ArrayList) ((LandscapeProfileListAssem) this.l0).Go().getState().LJII()).size()) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((LandscapeProfileListAssem) this.l0).Go().getLayoutManager();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                int top = viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0;
                if (this.z1) {
                    if (C08A4.LIZ(Integer.valueOf(top))) {
                        linearLayoutManager.scrollToPositionWithOffset(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75)));
                        return;
                    } else {
                        ((LandscapeProfileListAssem) this.l0).Go().scrollToPosition(i);
                        linearLayoutManager.scrollToPositionWithOffset(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75)));
                        return;
                    }
                }
                if (C08A4.LIZ(Integer.valueOf(top))) {
                    ((LandscapeProfileListAssem) this.l0).Go().smoothScrollToPosition(i);
                    return;
                } else {
                    ((LandscapeProfileListAssem) this.l0).Go().scrollToPosition(i);
                    linearLayoutManager.scrollToPositionWithOffset(i, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75)));
                    return;
                }
            }
            i++;
        }
    }

    public static final void run$0(ARunnableS23S0110000_4 aRunnableS23S0110000_4) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadBootFinishABValueTask@ccc.run$1$1$1");
        try {
            aRunnableS23S0110000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadBootFinishABValueTask@ccc.run$1$1$1");
    }

    public static final void run$1(ARunnableS23S0110000_4 aRunnableS23S0110000_4) {
        boolean zLIZ;
        C1C7U.LIZ("LandscapeProfileListAssem@f127.scrollToSelected$1");
        try {
            aRunnableS23S0110000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeProfileListAssem@f127.scrollToSelected$1");
    }

    public ARunnableS23S0110000_4(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
