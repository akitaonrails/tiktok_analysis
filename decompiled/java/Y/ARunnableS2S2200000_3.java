package Y;

import X.C0CNO;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C0WW5;
import X.C0WW6;
import X.C0WZX;
import X.C1701330uNH;
import X.C1C7U;
import X.C2106208My;
import X.C2204961BRm;
import X.C2429209fW;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS2S2200000_3 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    public final void LIZ$0() throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2 = null;
        try {
            try {
                try {
                    C0VSJ c0vsj = new C0VSJ(this.s0);
                    File parentFile = c0vsj.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    c0vsv = new C0VSV(c0vsj);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                ((Bitmap) this.l2).compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                c0vsv.flush();
                if (this.s1 != null) {
                    C0VSJ c0vsj2 = new C0VSJ(this.s0);
                    C0VSJ c0vsj3 = new C0VSJ(this.s1);
                    File parentFile2 = c0vsj3.getParentFile();
                    if (!parentFile2.exists()) {
                        parentFile2.mkdirs();
                    }
                    if (c0vsj2.exists()) {
                        C0VSP c0vsp = new C0VSP(c0vsj2);
                        c0vsv2 = new C0VSV(c0vsj3);
                        C2106208My.LIZ(c0vsp, c0vsv2);
                        c0vsp.close();
                        c0vsv = c0vsv2;
                    }
                }
                C0CNO.LIZLLL(0L, new AwS547S0100000_3((Function0) this.l3, (Function0<Unit>) 60));
                c0vsv.close();
            } catch (IOException e2) {
                e = e2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                if (c0vsv2 != null) {
                    c0vsv2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(th);
                if (c0vsv2 != null) {
                    try {
                        c0vsv2.close();
                        throw th;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

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

    public final void LIZ$1() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(this.s0));
            intent.setFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
            Activity activity = ((C0WW6) this.l2).LIZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5CllxapppYolBai/3pKSyBR5l5Oapes=", null));
            C0WW5 c0ww5 = (C0WW5) this.l3;
            C0WW6 c0ww6 = (C0WW6) this.l2;
            String str = this.s1;
            c0ww5.getClass();
            C0WW5.LJIIIZ(c0ww6, str, true, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0WW5 c0ww52 = (C0WW5) this.l3;
            C0WW6 c0ww62 = (C0WW6) this.l2;
            String str2 = this.s1;
            c0ww52.getClass();
            C0WW5.LJIIIZ(c0ww62, str2, false, "open url error");
        }
    }

    public static final void run$0(ARunnableS2S2200000_3 aRunnableS2S2200000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PublishPageUtils@13bc.writeBitmapToFileAndCopy$1");
        try {
            aRunnableS2S2200000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishPageUtils@13bc.writeBitmapToFileAndCopy$1");
    }

    public static final void run$1(ARunnableS2S2200000_3 aRunnableS2S2200000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LoginCustomTabLauncher@5226.onPostMessage$1$1");
        try {
            aRunnableS2S2200000_3.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginCustomTabLauncher@5226.onPostMessage$1$1");
    }

    public ARunnableS2S2200000_3(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
