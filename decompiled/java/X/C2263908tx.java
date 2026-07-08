package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.08tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.MultiMediaUploadFrameTask$decodeVideoFrame$2", f = "MultiMediaUploadFrameTask.kt", l = {231}, m = "invokeSuspend")
public final class C2263908tx extends C09AX implements Function2<C094D<? super Bitmap>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C2256008sg LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263908tx(String str, C2256008sg c2256008sg, long j, InterfaceC1364105Vn<? super C2263908tx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c2256008sg;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2263908tx c2263908tx = new C2263908tx(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2263908tx.LLILLJJLI = obj;
        return c2263908tx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("MultiMediaUploadFrameTask@fd89.decodeVideoFrame$2");
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
            InterfaceC1286300jZs interfaceC1286300jZs = new InterfaceC1286300jZs() { // from class: X.08tu
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                    if (!C2296808zG.LJI(c094d)) {
                        return false;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    c094d.LJIIIIZZ(bitmapCreateBitmap);
                    c094d.LJIIJJI(null);
                    return false;
                }
            };
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LLILLL);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = this.LLILZ.LIZIZ;
            C118300cf c118300cf2 = new C118300cf();
            c118300cf2.element = this.LLILZ.LIZIZ;
            if (videoFileInfo != null && C2264708u5.LIZ()) {
                Pair pairLIZIZ = C2275108vl.LIZIZ(videoFileInfo, C2264908u7.LIZ());
                c118300cf.element = ((Number) pairLIZIZ.getFirst()).intValue();
                c118300cf2.element = ((Number) pairLIZIZ.getSecond()).intValue();
            }
            if (videoFileInfo != null && Math.min(videoFileInfo.width, videoFileInfo.height) >= 1080) {
                z = true;
            } else {
                z = false;
            }
            if (((Boolean) C2264608u4.LIZ.getValue()).booleanValue()) {
                VEUtils.getVideoFrames(this.LLILLL, new int[]{(int) this.LLILZIL}, c118300cf.element, c118300cf2.element, C2264008ty.LIZ(), true, interfaceC1286300jZs, z);
            } else {
                VEUtils.getVideoFrames(this.LLILLL, new int[]{(int) this.LLILZIL}, c118300cf.element, c118300cf2.element, C2264008ty.LIZ(), interfaceC1286300jZs);
            }
            AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1616);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS189S0000000_3, this) == objLJFF) {
                C1C7U.LIZIZ("MultiMediaUploadFrameTask@fd89.decodeVideoFrame$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiMediaUploadFrameTask@fd89.decodeVideoFrame$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Bitmap> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
