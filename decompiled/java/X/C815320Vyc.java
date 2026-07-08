package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.manager.PushImageLoadManager$getPushImageBitmapParallel$commonJob1$1", f = "PushImageLoadManager.kt", l = {}, m = "invokeSuspend")
public final class C815320Vyc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ C814730Vxf LL;
    public final /* synthetic */ Bitmap[] LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C815320Vyc(C814730Vxf c814730Vxf, Bitmap[] bitmapArr, InterfaceC1364105Vn<? super C815320Vyc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c814730Vxf;
        this.LLILLJJLI = bitmapArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C815320Vyc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("PushImageLoadManager@c8dc.getPushImageBitmapParallel$commonJob1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = null;
        String str = null;
        if (C703302op.LIZ(this.LL.imageUrl)) {
            this.LL.latencyAnalytics.startDownloadCommonImagePhase();
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicReference atomicReference = new AtomicReference();
            C814730Vxf c814730Vxf = this.LL;
            List listSingletonList = Collections.singletonList(c814730Vxf.imageUrl);
            EnumC815370Vyh enumC815370Vyh = EnumC815370Vyh.COMMON;
            Bitmap bitmapLJ = C815340Vye.LJ(c814730Vxf, listSingletonList, enumC815370Vyh, atomicReference);
            Bitmap[] bitmapArr = this.LLILLJJLI;
            C814730Vxf c814730Vxf2 = this.LL;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            boolean z = false;
            bitmapArr[0] = bitmapLJ;
            c814730Vxf2.latencyAnalytics.endDownloadCommonImagePhase();
            if (bitmapLJ == null) {
                if (!C289650BWx.LIZ()) {
                }
                bitmap = bitmapLJ;
            } else {
                z = true;
            }
            if (z) {
                lLJFF = C2286608xc.LJFF(jCurrentTimeMillis2);
            } else {
                lLJFF = null;
                str = (String) atomicReference.get();
            }
            MessageShowHandler.LJI(enumC815370Vyh, c814730Vxf2, lLJFF, "push_image_load", str, z, z, false);
            bitmap = bitmapLJ;
        }
        C1C7U.LIZIZ("PushImageLoadManager@c8dc.getPushImageBitmapParallel$commonJob1$1");
        return bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
