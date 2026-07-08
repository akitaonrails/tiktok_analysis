package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.08tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$decodeFrameFlow$1", f = "LocalVideoUploadFrameTask.kt", l = {269}, m = "invokeSuspend")
public final class C2264108tz extends C09AX implements Function2<C094D<? super Pair<? extends Bitmap, ? extends Integer>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C2274008va LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264108tz(long j, long j2, C2274008va c2274008va, String str, InterfaceC1364105Vn<? super C2264108tz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = c2274008va;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2264108tz c2264108tz = new C2264108tz(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c2264108tz.LLILLJJLI = obj;
        return c2264108tz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("LocalVideoUploadFrameTask@4ac4.decodeFrameFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            int i2 = (int) this.LLILLL;
            int i3 = (int) this.LLILZ;
            this.LLILZIL.getClass();
            final int[] iArrLIZ = C2274408ve.LIZ(i2, i3, C2275008vk.LIZ());
            if (iArrLIZ == null) {
                this.LLILZIL.LJIILL(-4, "no time is available", "");
                C2296808zG.LIZJ(c094d, new CancellationException("no time is available"));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LocalVideoUploadFrameTask@4ac4.decodeFrameFlow$1");
                return unit;
            }
            final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            InterfaceC1286300jZs interfaceC1286300jZs = new InterfaceC1286300jZs() { // from class: X.08u0
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i4, int i5, int i6) {
                    boolean z2 = false;
                    if (!C2296808zG.LJI(c094d)) {
                        return false;
                    }
                    C2265108u9.LIZJ();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    int size = copyOnWriteArrayList.size();
                    copyOnWriteArrayList.add(Integer.valueOf(i6));
                    c094d.LJIIIIZZ(new Pair<>(bitmapCreateBitmap, Integer.valueOf(size)));
                    if (copyOnWriteArrayList.size() >= iArrLIZ.length) {
                        z2 = true;
                        c094d.LJIIJJI(null);
                    }
                    return !z2;
                }
            };
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LLILZLL);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = this.LLILZIL.LIZIZ;
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = this.LLILZIL.LIZIZ;
            if (videoFileInfo != null && C2264708u5.LIZ()) {
                Pair pairLIZIZ = C2275108vl.LIZIZ(videoFileInfo, C2264908u7.LIZ());
                c118300cf.element = ((Number) pairLIZIZ.getFirst()).intValue();
                c118300cf2.element = ((Number) pairLIZIZ.getSecond()).intValue();
            }
            if (((Boolean) C2264608u4.LIZ.getValue()).booleanValue()) {
                if (videoFileInfo != null && Math.min(videoFileInfo.width, videoFileInfo.height) >= 1080) {
                    z = true;
                } else {
                    z = false;
                }
                VEUtils.getVideoFrames(this.LLILZLL, iArrLIZ, c118300cf.element, c118300cf2.element, C2264008ty.LIZ(), true, interfaceC1286300jZs, z);
            } else {
                VEUtils.getVideoFrames(this.LLILZLL, iArrLIZ, c118300cf.element, c118300cf2.element, C2264008ty.LIZ(), interfaceC1286300jZs);
            }
            AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1615);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS189S0000000_3, this) == objLJFF) {
                C1C7U.LIZIZ("LocalVideoUploadFrameTask@4ac4.decodeFrameFlow$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LocalVideoUploadFrameTask@4ac4.decodeFrameFlow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Bitmap, ? extends Integer>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
