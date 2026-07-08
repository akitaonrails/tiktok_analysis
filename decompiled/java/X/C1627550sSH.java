package X;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.view.RecordComposeButtonScene$onCreateView$2", f = "RecordComposeButtonScene.kt", l = {56}, m = "invokeSuspend")
public final class C1627550sSH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1664860tQS LLILLJJLI;
    public final /* synthetic */ FrameLayout LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627550sSH(Context context, FrameLayout frameLayout, C1664860tQS c1664860tQS, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1664860tQS;
        this.LLILLL = frameLayout;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1664860tQS c1664860tQS = this.LLILLJJLI;
        return new C1627550sSH(this.LLILZ, this.LLILLL, c1664860tQS, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordComposeButtonScene@29a4.onCreateView$2");
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
            C05YD<InterfaceC1157420gE0> c05ydJ00 = this.LLILLJJLI.LLJI.j00();
            C1628600sTy c1628600sTy = new C1628600sTy(this.LLILZ, this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(c05ydJ00, this, c1628600sTy) == objLJFF) {
                C1C7U.LIZIZ("RecordComposeButtonScene@29a4.onCreateView$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordComposeButtonScene@29a4.onCreateView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
