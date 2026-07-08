package X;

import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget$onLoad$5$2", f = "CaptionTextWidget.kt", l = {247}, m = "invokeSuspend")
public final class C327820CtA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CaptionTextWidget LLILLJJLI;
    public final /* synthetic */ C327810Ct9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327820CtA(CaptionTextWidget captionTextWidget, C327810Ct9 c327810Ct9, InterfaceC1364105Vn<? super C327820CtA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = captionTextWidget;
        this.LLILLL = c327810Ct9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327820CtA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTextWidget@eb36.onLoad$5$2");
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
            CaptionTextWidget captionTextWidget = this.LLILLJJLI;
            C327810Ct9 c327810Ct9 = this.LLILLL;
            captionTextWidget.LLJJIJIL = c327810Ct9;
            ArrayList<TextView> arrayList = captionTextWidget.LLJJIII;
            this.LL = 1;
            if (captionTextWidget.A1(c327810Ct9, arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("CaptionTextWidget@eb36.onLoad$5$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTextWidget@eb36.onLoad$5$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
