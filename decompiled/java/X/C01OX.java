package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01OX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.utils.SearchKeyframeBitmapCompressExtKt$tryCompressWithTargetViewSize$1", f = "SearchKeyframeBitmapCompressExt.kt", l = {}, m = "invokeSuspend")
public final class C01OX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01OX(int i, int i2, Bitmap bitmap, InterfaceC1364105Vn<? super C01OX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01OX(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        C1C7U.LIZ("SearchKeyframeBitmapCompressExtKt@184e.tryCompressWithTargetViewSize$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = true;
        if (this.LL > 0 && this.LLILLJJLI > 0 && this.LLILLL.getWidth() > 0 && this.LLILLL.getHeight() > 0) {
            try {
                float fMin = Math.min(this.LL / this.LLILLL.getWidth(), Math.min(this.LLILLJJLI / this.LLILLL.getHeight(), 1.0f));
                if (fMin >= 1.0f) {
                    bitmapCreateScaledBitmap = this.LLILLL;
                } else {
                    int iLIZIZ = C814420VxA.LIZIZ(this.LLILLL.getWidth() * fMin);
                    if (iLIZIZ < 1) {
                        iLIZIZ = 1;
                    }
                    int iLIZIZ2 = C814420VxA.LIZIZ(this.LLILLL.getHeight() * fMin);
                    if (iLIZIZ2 < 1) {
                        iLIZIZ2 = 1;
                    }
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.LLILLL, iLIZIZ, iLIZIZ2, true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                bitmapCreateScaledBitmap = this.LLILLL;
            }
        } else {
            bitmapCreateScaledBitmap = this.LLILLL;
        }
        if (bitmapCreateScaledBitmap.getByteCount() > 104857600) {
            z = false;
        }
        if (!z) {
            bitmapCreateScaledBitmap = null;
        }
        C1C7U.LIZIZ("SearchKeyframeBitmapCompressExtKt@184e.tryCompressWithTargetViewSize$1");
        return bitmapCreateScaledBitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
