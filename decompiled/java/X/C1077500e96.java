package X;

import Y.ARunnableS9S1000000_16;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0e96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077500e96 implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C1077500e96 c1077500e96) {
    }

    public static final void onCanceled$1(C1077500e96 c1077500e96) {
    }

    public static final void onCanceled$2(C1077500e96 c1077500e96) {
    }

    public static final void onProgress$0(C1077500e96 c1077500e96, float f) {
    }

    public static final void onProgress$1(C1077500e96 c1077500e96, float f) {
    }

    public static final void onProgress$2(C1077500e96 c1077500e96, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
            case 2:
                onProgress$2(this, f);
                break;
        }
    }

    public static final void LIZ$0(C1077500e96 c1077500e96, Bitmap bitmap) {
        C1018910ccb c1018910ccb = new C1018910ccb();
        C1023960ckk c1023960ckk = C1018930ccd.LIZ;
        C1029740cu4 c1029740cu4 = (C1029740cu4) c1077500e96.l1;
        String str = c1029740cu4.LIZ;
        if (str == null) {
            str = "";
        }
        c1018910ccb.logAd(c1023960ckk, str, c1029740cu4.LIZIZ, null, new AwS595S0100000_16((Map.Entry) c1077500e96.l0, (Map.Entry<String, String>) 75));
    }

    public static final void LIZ$1(C1077500e96 c1077500e96, Bitmap bitmap) {
        if (a0.LJJJIL(((C1066160dqo) c1077500e96.l0).LIZIZ)) {
            return;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            C1066160dqo c1066160dqo = (C1066160dqo) c1077500e96.l0;
            c1066160dqo.LJI = bitmapDrawable;
            c1066160dqo.LIZ(bitmapDrawable);
            ((C1066100dqi) c1077500e96.l1).LIZLLL(new C428600GrK(bitmap.getWidth(), bitmap.getHeight()));
        }
        C01GW c01gw = C1066190dqr.LIZ;
        String str = ((C1066160dqo) c1077500e96.l0).LIZ;
        ARunnableS9S1000000_16 aRunnableS9S1000000_16 = new ARunnableS9S1000000_16(str, 1);
        ConcurrentHashMap<String, Runnable> concurrentHashMap = C1066190dqr.LIZJ;
        Runnable runnable = concurrentHashMap.get(str);
        if (runnable != null) {
            ((Handler) C1066190dqr.LIZLLL.getValue()).removeCallbacks(runnable);
        }
        concurrentHashMap.put(str, aRunnableS9S1000000_16);
        C786410Ut5.LJLIIL(10000L, (Handler) C1066190dqr.LIZLLL.getValue(), aRunnableS9S1000000_16);
    }

    public static final void LIZ$2(C1077500e96 c1077500e96, Bitmap bitmap) {
        String containerID;
        try {
            if (bitmap == null) {
                C2382909Vj.LIZ((CompletionBlock) c1077500e96.l0, -1, "load bitmap failed", null, 4);
                return;
            }
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 1.0f, 0.0f);
            c204674156yLIZ.LJFF(0.0f);
            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
            if (numLIZIZ != null) {
                C1057770ddH c1057770ddH = (C1057770ddH) c1077500e96.l1;
                CompletionBlock completionBlock = (CompletionBlock) c1077500e96.l0;
                int iIntValue = numLIZIZ.intValue();
                InterfaceC634840OvC interfaceC634840OvC = c1057770ddH.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, C13LE.LIZ(InterfaceC1057750ddF.class));
                ((InterfaceC1057750ddF) xBaseModelLIZJ).setMainColor(C786410Ut5.j4("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue & 16777215)}, 1)));
                completionBlock.onSuccess((InterfaceC1057750ddF) xBaseModelLIZJ, "");
                return;
            }
            C2382909Vj.LIZ((CompletionBlock) c1077500e96.l0, 0, "get no color", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ((CompletionBlock) c1077500e96.l0, 0, "get color error", null, 4);
        }
    }

    public static final void onFailed$0(C1077500e96 c1077500e96, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed ");
        sbLIZ.append((String) ((Map.Entry) c1077500e96.l0).getValue());
        sbLIZ.append(' ');
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        C1018910ccb c1018910ccb = new C1018910ccb();
        C1023960ckk c1023960ckk = C1018930ccd.LIZ;
        C1029740cu4 c1029740cu4 = (C1029740cu4) c1077500e96.l1;
        String str = c1029740cu4.LIZ;
        if (str == null) {
            str = "";
        }
        c1018910ccb.logAd(c1023960ckk, str, c1029740cu4.LIZIZ, null, new AwS382S0200000_16((Map.Entry) c1077500e96.l0, (Map.Entry<String, String>) th, (Throwable) 16));
    }

    public static final void onFailed$1(C1077500e96 c1077500e96, Throwable th) {
        ((C1066100dqi) c1077500e96.l1).LJ(th);
    }

    public static final void onFailed$2(C1077500e96 c1077500e96, Throwable th) {
        C2382909Vj.LIZ((CompletionBlock) c1077500e96.l0, 0, "load bitmap failed", null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1077500e96(Object obj, CompletionBlock<InterfaceC1057750ddF> completionBlock, C1057770ddH c1057770ddH) {
        this.$t = c1057770ddH;
        this.l0 = obj;
        this.l1 = completionBlock;
    }
}
