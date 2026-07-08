package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.spi.AlbumSharpImagePreloadCache$preload$2", f = "AlbumSharpImagePreloadCache.kt", l = {}, m = "invokeSuspend")
public final class C2490309pN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C2490509pP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2490309pN(Context context, String str, int i, C2490509pP c2490509pP, InterfaceC1364105Vn<? super C2490309pN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = c2490509pP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2490309pN c2490309pN = new C2490309pN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2490309pN.LL = obj;
        return c2490309pN;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit>] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumSharpImagePreloadCache@10cd.preload$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Context context = this.LLILLJJLI;
            String str = this.LLILLL;
            int i = this.LLILZ;
            Bitmap bitmapLIZ = C2473709mh.LIZ(context, str, i, i, Bitmap.Config.RGB_565, true);
            if (bitmapLIZ != null) {
                C01GW c01gw = C0L22.LIZ;
                if (C0L22.LIZIZ(this.LLILLL) == null) {
                    String str2 = this.LLILLL;
                    try {
                        C2490409pO.LIZ.getClass();
                        Bitmap bitmapLIZ2 = C2490409pO.LIZ(bitmapLIZ);
                        try {
                            C0L23 c0l23LIZJ = C0L22.LIZJ(bitmapLIZ2, str2);
                            if (bitmapLIZ2 != bitmapLIZ && !bitmapLIZ2.isRecycled()) {
                                bitmapLIZ2.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ2);
                            }
                            C189200o6.m2constructorimpl(c0l23LIZJ);
                        } catch (Throwable th) {
                            if (bitmapLIZ2 != bitmapLIZ && !bitmapLIZ2.isRecycled()) {
                                bitmapLIZ2.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZ2);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
            }
            C259800zU c259800zU = new C259800zU();
            C013C c013c = new C013C();
            C2490509pP c2490509pP = this.LLILZIL;
            synchronized (c2490509pP) {
                try {
                    c2490509pP.LIZIZ = bitmapLIZ;
                    c2490509pP.LIZJ = true;
                    ?? r0 = c2490509pP.LJ;
                    c259800zU.element = r0;
                    if (r0 != 0) {
                        c2490509pP.LJ = null;
                        c2490509pP.LIZLLL = true;
                        c2490509pP.LIZIZ = null;
                        c013c.element = true;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (c013c.element) {
                C2490409pO.LIZIZ.remove(this.LLILLL);
                Function1 function1 = (Function1) c259800zU.element;
                if (function1 != null) {
                    function1.invoke(bitmapLIZ);
                }
            }
            this.LLILZIL.LIZ.countDown();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AlbumSharpImagePreloadCache@10cd.preload$2");
            return unit;
        } catch (Throwable th3) {
            this.LLILZIL.LIZ.countDown();
            throw th3;
        }
    }
}
