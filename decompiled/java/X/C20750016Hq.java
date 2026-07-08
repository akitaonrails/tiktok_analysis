package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.16Hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750016Hq implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onProgress$0(C20750016Hq c20750016Hq, float f) {
    }

    public static final void onProgress$1(C20750016Hq c20750016Hq, float f) {
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
        }
    }

    public static final void onCanceled$0(C20750016Hq c20750016Hq) {
        C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "load bitmap canceled", null, 4);
    }

    public static final void onCanceled$1(C20750016Hq c20750016Hq) {
        C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "load bitmap canceled", null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x0028, B:15:0x0054, B:18:0x005a, B:20:0x0076, B:22:0x0081, B:23:0x0085, B:25:0x008f, B:26:0x0093, B:28:0x009d, B:29:0x00a1, B:31:0x00ab, B:32:0x00af, B:34:0x00b9, B:35:0x00bd, B:37:0x00ca, B:38:0x00ce, B:40:0x00db, B:41:0x00df, B:43:0x00e8, B:45:0x00f8, B:46:0x00fc, B:55:0x0141, B:19:0x006b), top: B:60:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(X.C20750016Hq r12, android.graphics.Bitmap r13) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20750016Hq.LIZ$0(X.16Hq, android.graphics.Bitmap):void");
    }

    public static final void LIZ$1(C20750016Hq c20750016Hq, Bitmap bitmap) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        String containerID;
        try {
            if (bitmap == null) {
                C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "load bitmap failed", null, 4);
                return;
            }
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
            Number chromaForm = ((InterfaceC204675156z) c20750016Hq.l1).getChromaForm();
            float fFloatValue7 = 0.0f;
            if (chromaForm != null) {
                fFloatValue = chromaForm.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            Number chromaTo = ((InterfaceC204675156z) c20750016Hq.l1).getChromaTo();
            if (chromaTo != null) {
                fFloatValue2 = chromaTo.floatValue();
            } else {
                fFloatValue2 = 0.4f;
            }
            Number lightnessFrom = ((InterfaceC204675156z) c20750016Hq.l1).getLightnessFrom();
            if (lightnessFrom != null) {
                fFloatValue3 = lightnessFrom.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            Number lightnessTo = ((InterfaceC204675156z) c20750016Hq.l1).getLightnessTo();
            if (lightnessTo != null) {
                fFloatValue4 = lightnessTo.floatValue();
            } else {
                fFloatValue4 = 1.0f;
            }
            Number strategyThreshold = ((InterfaceC204675156z) c20750016Hq.l1).getStrategyThreshold();
            if (strategyThreshold != null) {
                fFloatValue5 = strategyThreshold.floatValue();
            } else {
                fFloatValue5 = 1.0f;
            }
            c204674156yLIZ.LJ(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5);
            Number colorMergingTolerance = ((InterfaceC204675156z) c20750016Hq.l1).getColorMergingTolerance();
            if (colorMergingTolerance != null) {
                fFloatValue6 = colorMergingTolerance.floatValue();
            } else {
                fFloatValue6 = 4.0f;
            }
            c204674156yLIZ.LJFF(fFloatValue6);
            Number lightnessAddition = ((InterfaceC204675156z) c20750016Hq.l1).getLightnessAddition();
            if (lightnessAddition != null) {
                fFloatValue7 = lightnessAddition.floatValue();
            }
            c204674156yLIZ.LJI(fFloatValue7);
            int[] iArrLIZ = c204674156yLIZ.LIZ();
            ArrayList arrayList = new ArrayList(iArrLIZ.length);
            for (int i : iArrLIZ) {
                arrayList.add(C786410Ut5.j4("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
            }
            if (!arrayList.isEmpty()) {
                AnonymousClass1573 anonymousClass1573 = (AnonymousClass1573) c20750016Hq.l2;
                CompletionBlock completionBlock = (CompletionBlock) c20750016Hq.l0;
                InterfaceC634840OvC interfaceC634840OvC = anonymousClass1573.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, C13LE.LIZ(AnonymousClass1571.class));
                ((AnonymousClass1571) xBaseModelLIZJ).setColors(arrayList);
                completionBlock.onSuccess((AnonymousClass1571) xBaseModelLIZJ, "");
                return;
            }
            C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "got no colors", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CompletionBlock completionBlock2 = (CompletionBlock) c20750016Hq.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get color error, ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock2, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }

    public static final void onFailed$0(C20750016Hq c20750016Hq, Throwable th) {
        C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "load bitmap failed", null, 4);
    }

    public static final void onFailed$1(C20750016Hq c20750016Hq, Throwable th) {
        C2382909Vj.LIZ((CompletionBlock) c20750016Hq.l0, 0, "load bitmap failed", null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20750016Hq(Object obj, CompletionBlock<AnonymousClass1579> completionBlock, AnonymousClass1577 anonymousClass1577, AnonymousClass1576 anonymousClass1576) {
        this.$t = anonymousClass1576;
        this.l0 = obj;
        this.l1 = completionBlock;
        this.l2 = anonymousClass1577;
    }
}
