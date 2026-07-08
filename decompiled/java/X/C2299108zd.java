package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.playground.EPActivityResultHandler$changeVideoCanvasBg$2", f = "EPActivityResultHandler.kt", l = {308}, m = "invokeSuspend")
public final class C2299108zd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0E5K LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Intent LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299108zd(C0E5K c0e5k, String str, String str2, Intent intent, InterfaceC1364105Vn<? super C2299108zd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e5k;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2299108zd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2");
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
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(this.LLILLJJLI.LIZ.getContentResolver(), UriProtector.parse(this.LLILLL)));
            C2243308qd.LIZ(bitmapDecodeBitmap, this.LLILZ);
            C786410Ut5.LJJJJ(bitmapDecodeBitmap);
            if (!C23118094a.LJIIIIZZ(this.LLILLJJLI.LJIILJJIL.getCoroutineContext())) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2299208ze c2299208ze = new C2299208ze(this.LLILZ, this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2299208ze) == objLJFF) {
                C1C7U.LIZIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2");
        return unit2;
    }
}
