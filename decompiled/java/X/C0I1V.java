package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelEditRootAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I1V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelEditRootAssem$addEmojiPanel$1$1", f = "SharePanelEditRootAssem.kt", l = {}, m = "invokeSuspend")
public final class C0I1V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SharePanelEditRootAssem LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I1V(SharePanelEditRootAssem sharePanelEditRootAssem, List<String> list, int i, InterfaceC1364105Vn<? super C0I1V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sharePanelEditRootAssem;
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I1V(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        View view2;
        View viewFindViewById;
        C1C7U.LIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SharePanelEditRootAssem sharePanelEditRootAssem = this.LL;
        C0I7E c0i7e = sharePanelEditRootAssem.LLJI;
        if (c0i7e == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1$1");
            return unit;
        }
        FrameLayout frameLayout = sharePanelEditRootAssem.LLJILJIL;
        if (frameLayout == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1$1");
            return unit2;
        }
        sharePanelEditRootAssem.LLJILJILJ = new C0I1X(c0i7e, this.LL.LLJJI, frameLayout, this.LLILLJJLI, this.LLILLL, 16);
        C0I1X c0i1x = this.LL.LLJILJILJ;
        if (c0i1x != null && (view2 = c0i1x.LJIIJ.LL) != null && (viewFindViewById = view2.findViewById(R.id.f715h0b)) != null) {
            C426750GoL.LJIIL(viewFindViewById, C2286608xc.LJ(0), null, C2286608xc.LJ(0), null, 26);
        }
        SharePanelEditRootAssem sharePanelEditRootAssem2 = this.LL;
        C0I1X c0i1x2 = sharePanelEditRootAssem2.LLJILJILJ;
        if (c0i1x2 != null) {
            view = c0i1x2.LJIIJ.LL;
        } else {
            view = null;
        }
        sharePanelEditRootAssem2.LLJILLL = view;
        frameLayout.addView(view);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelEditRootAssem@14d7.addEmojiPanel$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
