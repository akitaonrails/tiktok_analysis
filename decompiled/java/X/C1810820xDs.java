package X;

import android.text.TextPaint;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.bulletin.BulletinView$startDisplay$1", f = "BulletinView.kt", l = {}, m = "invokeSuspend")
public final class C1810820xDs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1810810xDr LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810820xDs(C1810810xDr c1810810xDr, String str, InterfaceC1364105Vn<? super C1810820xDs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1810810xDr;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1810820xDs c1810820xDs = new C1810820xDs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1810820xDs.LL = obj;
        return c1810820xDs;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float fMeasureText;
        C1C7U.LIZ("BulletinView@89c6.startDisplay$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C1810810xDr c1810810xDr = this.LLILLJJLI;
        c1810810xDr.LLILLL.setScrollX(c1810810xDr.LIZIZ());
        C786410Ut5.LJLLLLLL(8, this.LLILLJJLI.LLILZ);
        TextPaint paint = this.LLILLJJLI.LLILLL.getPaint();
        if (paint != null) {
            fMeasureText = paint.measureText(this.LLILLL);
        } else {
            fMeasureText = 0.0f;
        }
        if (fMeasureText > this.LLILLJJLI.LLILLL.getWidth()) {
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI.LLILZIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI.LLILZIL);
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1810830xDt(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinView@89c6.startDisplay$1");
        return unit;
    }
}
