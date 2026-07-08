package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.CropImageWindowViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115750f8n extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ CropImageWindowViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C09AJ<Pair<Bitmap, Bitmap>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115750f8n(CropImageWindowViewModel cropImageWindowViewModel, String str, int i, Context context, C19482611Ke c19482611Ke) {
        super(1);
        this.LL = cropImageWindowViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = c19482611Ke;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(android.graphics.Bitmap r12) {
        /*
            r11 = this;
            r4 = r12
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r4 == 0) goto Laa
            com.ss.android.ugc.aweme.ecommerce.search.vision.background.CropImageWindowViewModel r0 = r11.LL
            X.0QmS r0 = r0.LL
            if (r0 == 0) goto L9f
            java.lang.String r2 = r11.LLILLJJLI
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.RectF r2 = X.C680380QmS.LJIIL(r1, r0, r2)
            if (r2 == 0) goto L9f
            float r1 = r2.left
            float r0 = r2.width()
            float r1 = r1 + r0
            float r3 = r2.top
            float r0 = r2.height()
            float r3 = r3 + r0
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3c
            int r0 = r4.getWidth()
            float r1 = (float) r0
            float r0 = r2.left
            float r1 = r1 - r0
            r2.right = r1
        L3c:
            int r0 = r4.getHeight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4f
            int r0 = r4.getHeight()
            float r1 = (float) r0
            float r0 = r2.top
            float r1 = r1 - r0
            r2.bottom = r1
        L4f:
            r4.getWidth()
            r4.getHeight()
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            r0 = 1056964608(0x3f000000, float:0.5)
            r9.postScale(r0, r0)
            float r0 = r2.left
            int r5 = (int) r0
            float r0 = r2.top
            int r6 = (int) r0
            float r0 = r2.width()
            int r7 = (int) r0
            float r0 = r2.height()
            int r8 = (int) r0
            r10 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            if (r5 == 0) goto L9f
            android.content.Context r0 = r11.LLILLL
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5)     // Catch: java.lang.Exception -> Lb5
            android.renderscript.RenderScript r1 = android.renderscript.RenderScript.create(r0)     // Catch: java.lang.Exception -> Lb5
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r1)     // Catch: java.lang.Exception -> Lb5
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r1, r0)     // Catch: java.lang.Exception -> Lb5
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r1, r5)     // Catch: java.lang.Exception -> Lb5
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r1, r4)     // Catch: java.lang.Exception -> Lb5
            r0 = 1092616192(0x41200000, float:10.0)
            r3.setRadius(r0)     // Catch: java.lang.Exception -> Lb5
            r3.setInput(r2)     // Catch: java.lang.Exception -> Lb5
            r3.forEach(r1)     // Catch: java.lang.Exception -> Lb5
            r1.copyTo(r4)     // Catch: java.lang.Exception -> Lb5
            goto Lba
        L9f:
            X.09AJ<kotlin.Pair<android.graphics.Bitmap, android.graphics.Bitmap>> r1 = r11.LLILZ
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.onError(r0)
            goto Lc4
        Laa:
            X.09AJ<kotlin.Pair<android.graphics.Bitmap, android.graphics.Bitmap>> r1 = r11.LLILZ
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.onError(r0)
            goto Lc4
        Lb5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = r5
        Lba:
            X.09AJ<kotlin.Pair<android.graphics.Bitmap, android.graphics.Bitmap>> r1 = r11.LLILZ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r4)
            r1.onNext(r0)
        Lc4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1115750f8n.invoke(java.lang.Object):java.lang.Object");
    }
}
