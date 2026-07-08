package X;

import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget$onLoad$6$1", f = "CaptionTextWidget.kt", l = {262}, m = "invokeSuspend")
public final class C327830CtB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CaptionTextWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327830CtB(CaptionTextWidget captionTextWidget, InterfaceC1364105Vn<? super C327830CtB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = captionTextWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327830CtB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C327810Ct9 c327810Ct9;
        C1C7U.LIZ("CaptionTextWidget@eb36.onLoad$6$1");
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
            C327810Ct9 c327810Ct92 = captionTextWidget.LLJJIJIL;
            if (c327810Ct92 != null && (!c327810Ct92.LJ.isEmpty()) && Intrinsics.LJFF(ListProtector.get(c327810Ct92.LJ, 0), captionTextWidget.LLJJJJ) && (c327810Ct9 = captionTextWidget.LLJJIJIL) != null) {
                ArrayList<TextView> arrayList = captionTextWidget.LLJJIII;
                this.LL = 1;
                if (captionTextWidget.A1(c327810Ct9, arrayList, this) == objLJFF) {
                    C1C7U.LIZIZ("CaptionTextWidget@eb36.onLoad$6$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionTextWidget@eb36.onLoad$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
