package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13x2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20176213x2 implements InterfaceC20175613ww {
    @Override // X.InterfaceC20175613ww
    public final String getStrategyName() {
        return "VEUtilsCombined";
    }

    @Override // X.InterfaceC20175613ww
    public final long getTimeout() {
        return 30000L;
    }

    @Override // X.InterfaceC20175613ww
    public final boolean LIZIZ(C1457070o1J c1457070o1J) {
        if (c1457070o1J.LIZIZ == null) {
            return true;
        }
        return false;
    }

    public static final Bitmap LIZJ(Bitmap bitmap, C1457070o1J c1457070o1J) {
        EffectTextModel effectTextModel = c1457070o1J.LJIIZILJ;
        if (effectTextModel != null) {
            bitmap = effectTextModel.mergeCoverText(bitmap);
        }
        Function1<Bitmap, Bitmap> function1 = c1457070o1J.LJIILJJIL;
        if (function1 != null) {
            bitmap = function1.invoke(bitmap);
        }
        return bitmap;
    }

    @Override // X.InterfaceC20175613ww
    public final Object LIZ(C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C20176013x0(this, c1457070o1J, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x026a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178 A[Catch: Exception -> 0x01b3, TryCatch #4 {Exception -> 0x01b3, blocks: (B:69:0x0198, B:70:0x019b, B:73:0x01a1, B:74:0x01a9, B:61:0x0155, B:64:0x016f, B:66:0x0178, B:75:0x01aa), top: B:125:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1 A[Catch: Exception -> 0x01b3, TryCatch #4 {Exception -> 0x01b3, blocks: (B:69:0x0198, B:70:0x019b, B:73:0x01a1, B:74:0x01a9, B:61:0x0155, B:64:0x016f, B:66:0x0178, B:75:0x01aa), top: B:125:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa A[Catch: Exception -> 0x01b3, TRY_LEAVE, TryCatch #4 {Exception -> 0x01b3, blocks: (B:69:0x0198, B:70:0x019b, B:73:0x01a1, B:74:0x01a9, B:61:0x0155, B:64:0x016f, B:66:0x0178, B:75:0x01aa), top: B:125:0x0025 }] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, android.graphics.Bitmap, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(final X.C1457070o1J r22, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20176213x2.LIZLLL(X.0o1J, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(final X.C1457070o1J r26, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20176213x2.LJ(X.0o1J, X.05Vn):java.lang.Object");
    }
}
