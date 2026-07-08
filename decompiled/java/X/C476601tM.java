package X;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StorySnapshotProxyComponent$captureVideoFrameAndFuzzySave$1$1", f = "StorySnapshotProxyComponent.kt", l = {75}, m = "invokeSuspend")
public final class C476601tM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ byte[] LLILZ;
    public final /* synthetic */ C19562911gJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C476601tM(int i, int i2, byte[] bArr, C19562911gJ c19562911gJ, InterfaceC1364105Vn<? super C476601tM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = bArr;
        this.LLILZIL = c19562911gJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C476601tM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorySnapshotProxyComponent@a631.captureVideoFrameAndFuzzySave$1$1");
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
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.LLILLJJLI, this.LLILLL, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.LLILZ));
            File file = this.LLILZIL.LLILZ;
            this.LL = 1;
            if (C476101tH.LIZ(bitmapCreateBitmap, file, this) == objLJFF) {
                C1C7U.LIZIZ("StorySnapshotProxyComponent@a631.captureVideoFrameAndFuzzySave$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorySnapshotProxyComponent@a631.captureVideoFrameAndFuzzySave$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
