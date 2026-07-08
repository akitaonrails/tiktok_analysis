package X;

import android.graphics.Paint;
import android.graphics.Rect;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator$calStickerLocs$3$1", f = "FeedVideoAdaptionParamsOperator.kt", l = {}, m = "invokeSuspend")
public final class C20479415Bo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedVideoAdaptionParamsOperator LL;
    public final /* synthetic */ List<C20479515Bp> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20479415Bo(FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator, List<C20479515Bp> list, InterfaceC1364105Vn<? super C20479415Bo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedVideoAdaptionParamsOperator;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20479415Bo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("FeedVideoAdaptionParamsOperator@12f6.calStickerLocs$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20556015c6.LIZ.getClass();
        if (!C20556015c6.LIZLLL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedVideoAdaptionParamsOperator@12f6.calStickerLocs$3$1");
            return unit;
        }
        Paint paint = new Paint();
        paint.setColor(-65281);
        paint.setAlpha(128);
        C20479115Bl c20479115Bl = this.LL.effectiveArea;
        if (c20479115Bl != null) {
            List<C20479515Bp> list = this.LLILLJJLI;
            c20479115Bl.LIZ();
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C20479515Bp c20479515Bp : list) {
                    arrayList.add(new C20479215Bm(new Rect((int) (c20479515Bp.LIZ * ((double) c20479115Bl.getWidth())), (int) (c20479515Bp.LIZIZ * ((double) c20479115Bl.getHeight())), (int) (c20479515Bp.LIZJ * ((double) c20479115Bl.getWidth())), (int) (c20479515Bp.LIZLLL * ((double) c20479115Bl.getHeight()))), paint));
                }
            } else {
                arrayList = null;
            }
            c20479115Bl.setAreas(arrayList);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedVideoAdaptionParamsOperator@12f6.calStickerLocs$3$1");
        return unit2;
    }
}
