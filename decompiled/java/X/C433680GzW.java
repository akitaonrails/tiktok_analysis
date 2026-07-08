package X;

import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageVideoSeparateModeSwitchedTipsComponent$showGuide$2", f = "ImageVideoSeparateModeSwitchedTipsApi.kt", l = {113}, m = "invokeSuspend")
public final class C433680GzW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LGD LLILLJJLI;
    public final /* synthetic */ PopupWindow LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433680GzW(C0LGD c0lgd, PopupWindow popupWindow, InterfaceC1364105Vn<? super C433680GzW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lgd;
        this.LLILLL = popupWindow;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433680GzW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageVideoSeparateModeSwitchedTipsComponent@1737.showGuide$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("ImageVideoSeparateModeSwitchedTipsComponent@1737.showGuide$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.w2(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchedTipsComponent@1737.showGuide$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
