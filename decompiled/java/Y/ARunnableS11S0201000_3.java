package Y;

import X.C08GC;
import X.C08GF;
import X.C08GG;
import X.C08GH;
import X.C09MI;
import X.C0VSJ;
import X.C0VSV;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Choreographer;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.result.tab.ECSearchLynxFilterAssem;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS11S0201000_3 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C09MI c09mi = (C09MI) this.l0;
        BigThumb bigThumb = (BigThumb) this.l1;
        int i = this.i2;
        c09mi.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c09mi.LJ);
            sbLIZ.append("/thumbs");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists() || c0vsj.mkdirs()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c0vsj.getPath());
                sbLIZ2.append('/');
                sbLIZ2.append(bigThumb.imgUris.get(i).hashCode());
                sbLIZ2.append('.');
                sbLIZ2.append(c09mi.LIZLLL);
                sbLIZ2.append(".temp");
                C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                c0vsj2.deleteOnExit();
                c0vsj2.createNewFile();
                C0VSV c0vsv = new C0VSV(c0vsj2);
                Bitmap.CompressFormat compressFormatLJFF = c09mi.LJFF();
                if (compressFormatLJFF != null) {
                    Bitmap bitmap = c09mi.LIZJ;
                    if (bitmap == null) {
                        bitmap = null;
                    }
                    bitmap.compress(compressFormatLJFF, 100, c0vsv);
                }
                c0vsv.flush();
                c0vsv.close();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c0vsj.getPath());
                sbLIZ3.append('/');
                sbLIZ3.append(bigThumb.imgUris.get(i).hashCode());
                sbLIZ3.append('.');
                sbLIZ3.append(c09mi.LIZLLL);
                c0vsj2.renameTo(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("saveBitmap2File: ");
                sbLIZ4.append(c0vsj.getPath());
                sbLIZ4.append('/');
                sbLIZ4.append(bigThumb.imgUris.get(i).hashCode());
                sbLIZ4.append('.');
                sbLIZ4.append(c09mi.LIZLLL);
                sbLIZ4.append(",cost:");
                sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$1() {
        Handler handler = (Handler) this.l0;
        if (handler == null) {
            try {
                ((Callable) this.l1).call();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveTaskManager", e.getMessage());
                return;
            }
        }
        Message messageObtainMessage = handler.obtainMessage(this.i2);
        try {
            messageObtainMessage.obj = ((Callable) this.l1).call();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            messageObtainMessage.obj = e2;
        }
        C786410Ut5.LJLJJL((Handler) this.l0, messageObtainMessage);
    }

    public static final void run$0(ARunnableS11S0201000_3 aRunnableS11S0201000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ECSearchLynxFilterAssem@770.updateNativeFilterDynamicWidth$1");
        try {
            if (aRunnableS11S0201000_3.i2 == ((ECSearchLynxFilterAssem) aRunnableS11S0201000_3.l0).LLJJI && ((LinearLayout) aRunnableS11S0201000_3.l1).getParent() != null) {
                ((ECSearchLynxFilterAssem) aRunnableS11S0201000_3.l0).ep();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECSearchLynxFilterAssem@770.updateNativeFilterDynamicWidth$1");
    }

    public static final void run$1(ARunnableS11S0201000_3 aRunnableS11S0201000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FlowableProcessor@b7d3.loadFromUrl$1$onCompleted$1");
        try {
            aRunnableS11S0201000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlowableProcessor@b7d3.loadFromUrl$1$onCompleted$1");
    }

    public static final void run$2(ARunnableS11S0201000_3 aRunnableS11S0201000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTaskManager@ea10.async$1");
        try {
            aRunnableS11S0201000_3.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTaskManager@ea10.async$1");
    }

    public static final void run$3(ARunnableS11S0201000_3 aRunnableS11S0201000_3) {
        C08GH c08gh = (C08GH) aRunnableS11S0201000_3.l0;
        int i = aRunnableS11S0201000_3.i2;
        Choreographer choreographer = (Choreographer) aRunnableS11S0201000_3.l1;
        c08gh.getClass();
        C1C7U.LIZ("AbsPolicy@1dde.doInject$1L");
        Pair<C08GC, Boolean> pairLIZIZ = c08gh.LIZIZ(i, choreographer);
        if (((Boolean) pairLIZIZ.second).booleanValue()) {
            C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS11S0201000_3(i, c08gh, pairLIZIZ, 4));
        }
        C1C7U.LIZIZ("AbsPolicy@1dde.doInject$1L");
    }

    public static final void run$4(ARunnableS11S0201000_3 aRunnableS11S0201000_3) {
        C08GH c08gh = (C08GH) aRunnableS11S0201000_3.l0;
        int i = aRunnableS11S0201000_3.i2;
        Pair pair = (Pair) aRunnableS11S0201000_3.l1;
        c08gh.getClass();
        C1C7U.LIZ("AbsPolicy@1dde.doInject$1L$1L");
        c08gh.LIZ(i, (C08GC) pair.first);
        C1C7U.LIZIZ("AbsPolicy@1dde.doInject$1L$1L");
    }

    public ARunnableS11S0201000_3(Callable callable, int i) {
        this.$t = i;
        this.l0 = null;
        this.l1 = callable;
        this.i2 = 0;
    }

    public ARunnableS11S0201000_3(Choreographer choreographer, C08GG c08gg, int i) {
        this.$t = i;
        this.l0 = c08gg;
        this.i2 = 1;
        this.l1 = choreographer;
    }

    public ARunnableS11S0201000_3(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
