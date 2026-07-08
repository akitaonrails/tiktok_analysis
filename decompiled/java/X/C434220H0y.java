package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0H0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.span.TakoDataCollectionVideoSpan$loadBitmapFromDeferred$1$waitJob$1$1", f = "TakoDataCollectionVideoSpan.kt", l = {209}, m = "invokeSuspend")
public final class C434220H0y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ BaseImage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434220H0y(Context context, BaseImage baseImage, InterfaceC1364105Vn<? super C434220H0y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = baseImage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434220H0y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$waitJob$1$1");
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
            int i2 = C434170H0t.LLJJIJI;
            Context context = this.LLILLJJLI;
            BaseImage baseImage = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1331670kl3 c1331670kl3LIZ = C1856250yP9.LIZ(baseImage);
            c1331670kl3LIZ.LJJIJL(context);
            int i3 = C434170H0t.LLJJIJIIJIL;
            int i4 = C434170H0t.LLJJIJI;
            c1331670kl3LIZ.LJIIIIZZ = i3;
            c1331670kl3LIZ.LJIIIZ = i4;
            c2252611DEt.LJJII(new AwS585S0100000_6(c1331670kl3LIZ.LJJIIJZLJL(new C1769706wR(c2252611DEt, 1)), 289));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$waitJob$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TakoDataCollectionVideoSpan@e534.loadBitmapFromDeferred$1$waitJob$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
