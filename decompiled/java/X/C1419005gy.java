package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.CoverExtKt$loadCoverImageFormCache$2$1", f = "CoverExt.kt", l = {}, m = "invokeSuspend")
public final class C1419005gy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C1322110kVd LLILLJJLI;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1419005gy(Bitmap bitmap, C1322110kVd c1322110kVd, Function1<? super Bitmap, Unit> function1, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1419005gy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c1322110kVd;
        this.LLILLL = function1;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1419005gy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.LLILLJJLI.setImageBitmap(this.LL);
            this.LLILLL.invoke(this.LL);
            C565950MHp.LIZ(this.LLILZ);
        } else {
            this.LLILLL.invoke(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoverExtKt@ad6c.loadCoverImageFormCache$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
