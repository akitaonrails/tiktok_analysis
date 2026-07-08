package X;

import Y.ARunnableS119S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base.SingleOptionSelectionSheet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0if6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.sticker.view.LiveEventCountDownStickerEditView$openSelectionPage$6", f = "LiveEventCountDownStickerEditView.kt", l = {}, m = "invokeSuspend")
public final class C1251100if6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19635211ry LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251100if6(C19635211ry c19635211ry, InterfaceC1364105Vn<? super C1251100if6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19635211ry;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1251100if6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        View view2;
        Object obj2;
        View view3;
        ViewGroup viewGroup;
        C1C7U.LIZ("LiveEventCountDownStickerEditView@519b.openSelectionPage$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19635211ry c19635211ry = this.LL;
        SingleOptionSelectionSheet singleOptionSelectionSheet = c19635211ry.LLJJIJI;
        if (singleOptionSelectionSheet != null && (view2 = singleOptionSelectionSheet.getView()) != null) {
            do {
                Object parent = view2.getParent();
                obj2 = null;
                if (parent instanceof C16G0) {
                    view3 = (View) parent;
                    break;
                }
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
            } while (view2 != null);
            view3 = null;
            if ((view3 instanceof C16G0) && (viewGroup = (ViewGroup) view3) != null) {
                Iterator<View> it2 = new C09RD(viewGroup).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    Object next = c09re.next();
                    if (((View) next).getLayoutParams().height == -1) {
                        obj2 = next;
                    }
                }
                View view4 = (View) obj2;
                if (view4 != null) {
                    view4.setOnTouchListener(new ATListenerS452S0100000_19(c19635211ry, 12));
                }
            }
        }
        SingleOptionSelectionSheet singleOptionSelectionSheet2 = this.LL.LLJJIJI;
        if (singleOptionSelectionSheet2 != null && (view = singleOptionSelectionSheet2.getView()) != null) {
            Boolean.valueOf(HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this.LL, 192)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventCountDownStickerEditView@519b.openSelectionPage$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
