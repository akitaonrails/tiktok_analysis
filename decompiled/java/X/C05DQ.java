package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet$onViewCreated$6$1", f = "ShareToUserSheet.kt", l = {}, m = "invokeSuspend")
public final class C05DQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ ShareToUserSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DQ(View view, ShareToUserSheet shareToUserSheet, InterfaceC1364105Vn<? super C05DQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = shareToUserSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C1C7U.LIZ("ShareToUserSheet@b46a.onViewCreated$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL;
        if (view != null) {
            ShareToUserSheet shareToUserSheet = this.LLILLJJLI;
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            FrameLayout frameLayout = shareToUserSheet.LLILLL;
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareToUserSheet@b46a.onViewCreated$6$1");
        return unit;
    }
}
