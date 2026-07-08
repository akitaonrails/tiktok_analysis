package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelOperationLayout$addEmojiPanel$1$1", f = "SharePanelOperationLayout.kt", l = {}, m = "invokeSuspend")
public final class C459780I1g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1362990lZZ LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459780I1g(C1362990lZZ c1362990lZZ, List<String> list, int i, InterfaceC1364105Vn<? super C459780I1g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1362990lZZ;
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459780I1g(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        View view2;
        View viewFindViewById;
        C1C7U.LIZ("SharePanelOperationLayout@4f5f.addEmojiPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1362990lZZ c1362990lZZ = this.LL;
        C0I7D multiShareEt = this.LL.getMultiShareEt();
        C1362990lZZ c1362990lZZ2 = this.LL;
        c1362990lZZ.LLILZIL = new C0I1X(multiShareEt, c1362990lZZ2.LLJL, c1362990lZZ2.getShareMiniEmojiContainer(), this.LLILLJJLI, this.LLILLL, 16);
        C0I1X c0i1x = this.LL.LLILZIL;
        if (c0i1x != null && (view2 = c0i1x.LJIIJ.LL) != null && (viewFindViewById = view2.findViewById(R.id.f715h0b)) != null) {
            C426750GoL.LJIIL(viewFindViewById, C2286608xc.LJ(0), null, C2286608xc.LJ(0), null, 26);
        }
        C1362990lZZ c1362990lZZ3 = this.LL;
        C0I1X c0i1x2 = c1362990lZZ3.LLILZIL;
        if (c0i1x2 != null) {
            view = c0i1x2.LJIIJ.LL;
        } else {
            view = null;
        }
        c1362990lZZ3.LLJIJIL = view;
        c1362990lZZ3.getShareMiniEmojiContainer().addView(this.LL.LLJIJIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelOperationLayout@4f5f.addEmojiPanel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
