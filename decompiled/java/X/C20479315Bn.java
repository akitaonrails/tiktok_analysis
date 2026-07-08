package X;

import android.graphics.Paint;
import android.graphics.Rect;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator$calOcclusions$1", f = "FeedVideoAdaptionParamsOperator.kt", l = {}, m = "invokeSuspend")
public final class C20479315Bn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedVideoAdaptionParamsOperator LL;
    public final /* synthetic */ Rect LLILLJJLI;
    public final /* synthetic */ Rect LLILLL;
    public final /* synthetic */ Rect LLILZ;
    public final /* synthetic */ Rect LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ Rect LLIZ;
    public final /* synthetic */ C013C LLIZLLLIL;
    public final /* synthetic */ Rect LLJ;
    public final /* synthetic */ C013C LLJI;
    public final /* synthetic */ Rect LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20479315Bn(FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator, Rect rect, Rect rect2, Rect rect3, Rect rect4, C013C c013c, Rect rect5, C013C c013c2, Rect rect6, C013C c013c3, Rect rect7, InterfaceC1364105Vn<? super C20479315Bn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedVideoAdaptionParamsOperator;
        this.LLILLJJLI = rect;
        this.LLILLL = rect2;
        this.LLILZ = rect3;
        this.LLILZIL = rect4;
        this.LLILZLL = c013c;
        this.LLIZ = rect5;
        this.LLIZLLLIL = c013c2;
        this.LLJ = rect6;
        this.LLJI = c013c3;
        this.LLJIJIL = rect7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20479315Bn(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        C1C7U.LIZ("FeedVideoAdaptionParamsOperator@12f6.calOcclusions$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20556015c6.LIZ.getClass();
        if (!C20556015c6.LIZLLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedVideoAdaptionParamsOperator@12f6.calOcclusions$1");
            return unit;
        }
        Paint paint4 = new Paint();
        paint4.setColor(-16776961);
        paint4.setAlpha(128);
        Paint paint5 = new Paint();
        paint5.setColor(-16711936);
        paint5.setAlpha(128);
        Paint paint6 = new Paint();
        paint6.setColor(-65536);
        paint6.setAlpha(128);
        C20479115Bl c20479115Bl = this.LL.obstructedArea;
        if (c20479115Bl != null) {
            c20479115Bl.LIZ();
        }
        C20479115Bl c20479115Bl2 = this.LL.obstructedArea;
        if (c20479115Bl2 != null) {
            C20479215Bm[] c20479215BmArr = new C20479215Bm[7];
            c20479215BmArr[0] = new C20479215Bm(this.LLILLJJLI, paint6);
            c20479215BmArr[1] = new C20479215Bm(this.LLILLL, paint6);
            c20479215BmArr[2] = new C20479215Bm(this.LLILZ, paint6);
            Rect rect = this.LLILZIL;
            if (this.LLILZLL.element) {
                paint = paint4;
            } else {
                paint = paint5;
            }
            c20479215BmArr[3] = new C20479215Bm(rect, paint);
            Rect rect2 = this.LLIZ;
            if (this.LLIZLLLIL.element) {
                paint2 = paint4;
            } else {
                paint2 = paint5;
            }
            c20479215BmArr[4] = new C20479215Bm(rect2, paint2);
            Rect rect3 = this.LLJ;
            boolean z = this.LLJI.element;
            if (z) {
                paint3 = paint4;
            } else {
                paint3 = paint5;
            }
            c20479215BmArr[5] = new C20479215Bm(rect3, paint3);
            Rect rect4 = this.LLJIJIL;
            if (!z) {
                paint4 = paint5;
            }
            c20479215BmArr[6] = new C20479215Bm(rect4, paint4);
            c20479115Bl2.setAreas(C1697810uHb.LJIIJJI(c20479215BmArr));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedVideoAdaptionParamsOperator@12f6.calOcclusions$1");
        return unit2;
    }
}
