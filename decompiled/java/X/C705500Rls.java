package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705500Rls extends FrameLayout implements InterfaceC705550Rlx {
    public final InterfaceC704770Rkh LL;
    public boolean LLILLJJLI;
    public Drawable LLILLL;

    @Override // X.InterfaceC1393670mN3
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1393670mN3
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        return false;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJ() {
        return null;
    }

    @Override // X.InterfaceC1393670mN3
    public final void LJFF() {
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJI(int i) {
    }

    @Override // X.InterfaceC1393670mN3
    public final void LJII(AbstractC707180Roa abstractC707180Roa) {
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC704780Rki
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIIL() {
        return this;
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIIZILJ(InterfaceC704770Rkh interfaceC704770Rkh) {
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIJI(IStandardModelProvider iStandardModelProvider) {
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJIJJLI(double d) {
    }

    @Override // X.InterfaceC704780Rki
    public final void LJJI(AwS555S0100000_11 awS555S0100000_11) {
    }

    @Override // X.InterfaceC705550Rlx
    public Map<String, String> getStayTimeBizExtraMap() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public final void onBind() {
    }

    @Override // X.InterfaceC704780Rki
    public final void onCreated() {
    }

    @Override // X.InterfaceC705550Rlx
    public void setAnimationBundle(C705850RmR c705850RmR) {
    }

    @Override // X.InterfaceC705550Rlx
    public void setCommodityCard(C0R5I c0r5i) {
    }

    @Override // X.InterfaceC705550Rlx
    public void setInteceptorTouchAction(Function0<Unit> function0) {
    }

    @Override // X.InterfaceC705550Rlx
    public void setLegacyContentClickListener(Function1<? super View, Unit> function1) {
    }

    @Override // X.InterfaceC704780Rki
    public final void unBind() {
    }

    @Override // X.InterfaceC704780Rki
    public final void LIZ() {
        this.LL.LIZ();
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIIJ() {
        this.LL.LJJL(this);
    }

    public final void LJJIFFI() {
        if (this.LLILLJJLI) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            TextView textViewLJIIJJI = LJIIJJI();
            textViewLJIIJJI.setText("");
            ViewGroup.LayoutParams layoutParams = textViewLJIIJJI.getLayoutParams();
            layoutParams.width = -2;
            C786410Ut5.g6(textViewLJIIJJI, layoutParams);
            C786410Ut5.LLIL(LJIILLIIL(), 8);
            TextView textViewLJIL = LJIL();
            C786410Ut5.LLIL(textViewLJIL, 8);
            textViewLJIL.setText("");
            ViewGroup.LayoutParams layoutParams2 = textViewLJIL.getLayoutParams();
            layoutParams2.width = -2;
            C786410Ut5.g6(textViewLJIL, layoutParams2);
            C786410Ut5.LLLLLLZZ(LJIILL(), 8);
            LJJ().setImageResource(R.color.dr);
        }
    }

    @Override // X.InterfaceC704780Rki
    public final void onDestroy() {
        this.LL.onDestroy();
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIIJJI() {
        return (TextView) findViewById(R.id.b2n);
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIILIIL() {
        return (TextView) findViewById(R.id.b37);
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIILJJIL() {
        return findViewById(R.id.azq);
    }

    @Override // X.InterfaceC705550Rlx
    public final TuxIconView LJIILL() {
        return (TuxIconView) findViewById(R.id.b2i);
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIILLIIL() {
        return (TextView) findViewById(R.id.b2r);
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIJ() {
        return (TextView) findViewById(R.id.b2q);
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIJJ() {
        return findViewById(R.id.ms_);
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIL() {
        return (TextView) findViewById(R.id.b2l);
    }

    @Override // X.InterfaceC705550Rlx
    public final SmartImageView LJJ() {
        return (SmartImageView) findViewById(R.id.b2h);
    }

    @Override // X.InterfaceC705550Rlx
    public final View rootView() {
        return findViewById(R.id.b2j);
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.LLILLL = drawable;
        if (!this.LLILLJJLI) {
            C20673215v0.LIZLLL(R.layout.a1g, C1388190mED.LIZ(getContext()), this, true);
            this.LLILLJJLI = true;
        }
        findViewById(R.id.b2j).setBackground(this.LLILLL);
    }

    public C705500Rls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = (InterfaceC704770Rkh) C1393420mMe.LIZIZ().LIZJ(InterfaceC704770Rkh.class);
    }
}
