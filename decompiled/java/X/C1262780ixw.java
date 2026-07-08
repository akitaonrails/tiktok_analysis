package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ixw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262780ixw extends AbstractC1262620ixg {
    public final InterfaceC1262800ixy LL;
    public final C01GW LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;

    public C1262780ixw(Context context, AttributeSet attributeSet) {
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
        return this.LL.getLayout();
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

    private final ViewOnAttachStateChangeListenerC20604515jv getHorizontalPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1262800ixy
    public final void LLLIIII(AbstractC1262620ixg abstractC1262620ixg) {
        this.LL.LLLIIII(abstractC1262620ixg);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[PHI: r7
      0x0063: PHI (r7v5 boolean) = (r7v2 boolean), (r7v6 boolean) binds: [B:55:0x00d2, B:32:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5 A[PHI: r7
      0x00d5: PHI (r7v3 boolean) = (r7v2 boolean), (r7v6 boolean) binds: [B:55:0x00d2, B:32:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262780ixw.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            boolean r0 = r3.LLILZ
            if (r0 == 0) goto L15
            int r1 = r4.getAction()
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L1a
        L15:
            boolean r0 = super.onTouchEvent(r4)
            return r0
        L1a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.LLILZIL = r0
            r3.LLILZLL = r0
            r3.LLILZ = r2
            goto L15
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262780ixw.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setSeeAllStyle(View.OnClickListener onClickListener) {
        C786410Ut5.I7(onClickListener, findViewById(R.id.user_card_horizontal_right_widget));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1262780ixw(Context context, AttributeSet attributeSet, InterfaceC1262800ixy interfaceC1262800ixy, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 8) != 0) {
            IRelationUserCardInternalService.LIZ.getClass();
            interfaceC1262800ixy = C1073940e3M.LIZ().LIZ(null, 0);
        }
        super(context, attributeSet, 0);
        this.LL = interfaceC1262800ixy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2956));
        this.LLILLL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILZIL = -1.0f;
        this.LLILZLL = -1.0f;
        C0JF1.LIZ(getContext(), R.layout.elq, this);
        LLLIIII(this);
        C428150Gqb.LIZ(findViewById(R.id.user_card_horizontal_right_widget), EnumC428940Grs.ALPHA, 0.0f);
    }
}
