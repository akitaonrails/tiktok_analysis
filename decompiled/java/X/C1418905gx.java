package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.CoverExtKt$loadCoverImageFormCache$2", f = "CoverExt.kt", l = {100, 110}, m = "invokeSuspend")
public final class C1418905gx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C1322110kVd LLILLL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1418905gx(C259800zU<String> c259800zU, C1322110kVd c1322110kVd, Function1<? super Bitmap, Unit> function1, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1418905gx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c1322110kVd;
        this.LLILZ = function1;
        this.LLILZIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1418905gx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap.Config config;
        C1C7U.LIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Bitmap bitmapLJ = C1331660kl2.LIZJ().LJ(C2471909mP.LJIILIIL(this.LLILLJJLI.element));
            if (bitmapLJ != null && (config = bitmapLJ.getConfig()) != null && !bitmapLJ.isRecycled()) {
                Bitmap bitmapCopy = bitmapLJ.copy(config, true);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1419005gy c1419005gy = new C1419005gy(bitmapCopy, this.LLILLL, this.LLILZ, this.LLILZIL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1419005gy) == objLJFF) {
                    C1C7U.LIZIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2");
                    return objLJFF;
                }
            } else {
                C1DFH c1dfh2 = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
                C05E0 c05e0 = new C05E0(this.LLILZ, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq2, c05e0) == objLJFF) {
                    C1C7U.LIZIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
