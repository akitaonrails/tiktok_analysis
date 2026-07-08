package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.view.RenderThumbnailView$renderBackground$1", f = "RenderThumbnailView.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C433780Gzg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;
    public final /* synthetic */ C433800Gzi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433780Gzg(Bitmap bitmap, MediaModel mediaModel, C433800Gzi c433800Gzi, InterfaceC1364105Vn<? super C433780Gzg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = mediaModel;
        this.LLILZ = c433800Gzi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433780Gzg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RenderThumbnailView@90ac.renderBackground$1");
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
            Bitmap bitmap = this.LLILLJJLI;
            MediaModel mediaModel = this.LLILLL;
            C433800Gzi c433800Gzi = this.LLILZ;
            Pair pairLIZ = C0L22.LIZ(mediaModel, bitmap);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue()});
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C433790Gzh c433790Gzh = new C433790Gzh(c433800Gzi, gradientDrawable, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c433790Gzh) == objLJFF) {
                C1C7U.LIZIZ("RenderThumbnailView@90ac.renderBackground$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RenderThumbnailView@90ac.renderBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
