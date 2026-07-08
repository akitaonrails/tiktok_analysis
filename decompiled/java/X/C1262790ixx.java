package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ixx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262790ixx extends AbstractC1262620ixg {
    public final InterfaceC1262800ixy LL;

    public C1262790ixx(Context context) {
        this(context, null, null, 14);
    }

    public C1262790ixx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 12);
    }

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LL.Eg(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LIZLLL() {
        this.LL.LIZLLL();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262800ixy, X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
        this.LL.LJI(abstractC1264080j02);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        this.LL.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLILLLLZI(boolean z) {
        this.LL.LJLILLLLZI(z);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLJLLL(C19EG c19eg, Fragment fragment, Function1<? super C1262310ixB, Unit> function1) {
        this.LL.LJLJLLL(c19eg, fragment, function1);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        this.LL.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLL(Function1<? super C1261270ivV, C1261270ivV> function1) {
        this.LL.LLL(function1);
    }

    @Override // X.InterfaceC1262810ixz
    public final void destroy() {
        this.LL.destroy();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262810ixz
    public C1075800e6M getCurrentState() {
        return this.LL.getCurrentState();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262810ixz
    public AbstractC21673719rz getItemAnimator() {
        return this.LL.getItemAnimator();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262800ixy
    public AbstractC1262620ixg getLayout() {
        return this;
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262800ixy
    public ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return this.LL.getPowerList();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262800ixy
    public C1749280vcc getStatusView() {
        return this.LL.getStatusView();
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LL.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        this.LL.reset();
    }

    @Override // X.AbstractC1262620ixg, X.InterfaceC1262800ixy
    public void setConfigInner(C1262300ixA c1262300ixA) {
        this.LL.setConfigInner(c1262300ixA);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LLLIIII(AbstractC1262620ixg abstractC1262620ixg) {
        this.LL.LLLIIII(abstractC1262620ixg);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1262790ixx(Context context, AttributeSet attributeSet, InterfaceC1262800ixy interfaceC1262800ixy, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 8) != 0) {
            IRelationUserCardInternalService.LIZ.getClass();
            interfaceC1262800ixy = C1073940e3M.LIZ().LIZ(null, 1);
        }
        super(context, attributeSet, 0);
        this.LL = interfaceC1262800ixy;
        C0JF1.LIZ(getContext(), R.layout.elr, this);
        LLLIIII(this);
    }
}
