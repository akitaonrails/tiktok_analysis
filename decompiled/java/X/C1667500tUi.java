package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667500tUi {
    public static final C1667500tUi LIZ = new C1667500tUi();
    public static final C1396810mS7 LIZIZ = new LruCache<String, Bitmap>() { // from class: X.0mS7
        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    };

    public static final Bitmap LIZLLL(String str) {
        Bitmap bitmap = LIZIZ.get(str);
        if (bitmap != null && (!bitmap.isRecycled())) {
            return bitmap;
        }
        return null;
    }

    public static final void LIZJ(Bitmap bitmap, String str) {
        if (!a0.LJJJIL(str) && !bitmap.isRecycled()) {
            LIZIZ.put(str, bitmap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r23, kotlin.jvm.functions.Function1<? super java.lang.String, com.ss.android.ugc.aweme.draft.model.AwemeDraft> r24, X.InterfaceC1685750ty9 r25, X.InterfaceC1680500tpg r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1667500tUi.LIZIZ(java.lang.String, kotlin.jvm.functions.Function1, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r26, java.lang.String r27, kotlin.jvm.functions.Function1<? super java.lang.String, com.ss.android.ugc.aweme.draft.model.AwemeDraft> r28, X.InterfaceC1685750ty9 r29, X.InterfaceC1680500tpg r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1667500tUi.LIZ(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, X.0ty9, X.0tpg, int, int):void");
    }
}
