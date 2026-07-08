package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.08u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LayoutModeUploadFrameTask$decodeFrameFlow$1", f = "LayoutModeUploadFrameTask.kt", l = {192}, m = "invokeSuspend")
public final class C2264508u3 extends C09AX implements Function2<C094D<? super Pair<? extends Bitmap, ? extends Integer>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2276108vv LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2264508u3(C2276108vv c2276108vv, long j, int i, String str, int i2, InterfaceC1364105Vn<? super C2264508u3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2276108vv;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2264508u3 c2264508u3 = new C2264508u3(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2264508u3.LLILLJJLI = obj;
        return c2264508u3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final int[] iArr;
        boolean z;
        C1C7U.LIZ("LayoutModeUploadFrameTask@89de.decodeFrameFlow$1");
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
            C2276108vv c2276108vv = this.LLILLL;
            int i2 = (int) this.LLILZ;
            int i3 = this.LLILZIL;
            c2276108vv.getClass();
            if (i3 <= 1) {
                iArr = new int[]{i2 / 2};
            } else {
                int i4 = i3 - 1;
                int i5 = i2 / i4;
                iArr = new int[i3];
                iArr[0] = 0;
                iArr[i4] = i2;
                int i6 = i3 - 2;
                if (1 <= i6) {
                    int i7 = 1;
                    while (true) {
                        int i8 = i7 * i5;
                        if (i8 > i2) {
                            i8 = i2;
                        }
                        iArr[i7] = i8;
                        if (i7 == i6) {
                            break;
                        }
                        i7++;
                    }
                }
            }
            final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            InterfaceC1286300jZs interfaceC1286300jZs = new InterfaceC1286300jZs() { // from class: X.08u2
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i9, int i10, int i11) {
                    boolean z2 = false;
                    if (!C2296808zG.LJI(c094d)) {
                        return false;
                    }
                    C2265108u9.LIZJ();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    int size = copyOnWriteArrayList.size();
                    copyOnWriteArrayList.add(Integer.valueOf(i11));
                    c094d.LJIIIIZZ(new Pair<>(bitmapCreateBitmap, Integer.valueOf(size)));
                    if (copyOnWriteArrayList.size() >= iArr.length) {
                        z2 = true;
                        c094d.LJIIJJI(null);
                    }
                    return !z2;
                }
            };
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LLILZLL);
            if (videoFileInfo != null) {
                C2276108vv c2276108vv2 = this.LLILLL;
                int i9 = videoFileInfo.width;
                int i10 = videoFileInfo.height;
                int i11 = this.LLIZ;
                c2276108vv2.getClass();
                Pair pairLJJI = C2276108vv.LJJI(i9, i10, i11);
                int iIntValue = ((Number) pairLJJI.getFirst()).intValue();
                int iIntValue2 = ((Number) pairLJJI.getSecond()).intValue();
                if (Math.min(videoFileInfo.width, videoFileInfo.height) >= 1080) {
                    z = true;
                } else {
                    z = false;
                }
                VEUtils.getVideoFrames(this.LLILZLL, iArr, iIntValue, iIntValue2, true, true, interfaceC1286300jZs, z);
            }
            AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1614);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS189S0000000_3, this) == objLJFF) {
                C1C7U.LIZIZ("LayoutModeUploadFrameTask@89de.decodeFrameFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayoutModeUploadFrameTask@89de.decodeFrameFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Bitmap, ? extends Integer>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
