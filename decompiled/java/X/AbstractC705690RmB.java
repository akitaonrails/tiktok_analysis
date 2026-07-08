package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC705690RmB extends FrameLayout implements InterfaceC705570Rlz {
    public Set<InterfaceC705580Rm0> LL;

    @Override // X.InterfaceC704780Rki
    public void LIZ() {
    }

    @Override // X.InterfaceC1393670mN3
    public boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC705550Rlx
    public View LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public View LJ() {
        return null;
    }

    @Override // X.InterfaceC1393670mN3
    public void LJFF() {
    }

    @Override // X.InterfaceC705550Rlx
    public void LJI(int i) {
    }

    @Override // X.InterfaceC705550Rlx
    public void LJIIIIZZ() {
    }

    @Override // X.InterfaceC704780Rki
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC704780Rki
    public void LJIIJ() {
    }

    @Override // X.InterfaceC705550Rlx
    public TextView LJIIJJI() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public View LJIIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public TextView LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public View LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public TuxIconView LJIILL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public TextView LJIILLIIL() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public void LJIIZILJ(InterfaceC704770Rkh interfaceC704770Rkh) {
    }

    @Override // X.InterfaceC705550Rlx
    public TextView LJIJ() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIJI(IStandardModelProvider iStandardModelProvider) {
    }

    @Override // X.InterfaceC705550Rlx
    public View LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public void LJIJJLI(double d) {
    }

    @Override // X.InterfaceC705550Rlx
    public TextView LJIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public SmartImageView LJJ() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public void LJJI(AwS555S0100000_11 awS555S0100000_11) {
    }

    @Override // X.InterfaceC705570Rlz
    public abstract /* synthetic */ String getAwemeId();

    @Override // X.InterfaceC705550Rlx
    public Map<String, String> getStayTimeBizExtraMap() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public void onBind() {
    }

    @Override // X.InterfaceC704780Rki
    public void onCreated() {
    }

    @Override // X.InterfaceC704780Rki
    public void onDestroy() {
    }

    @Override // X.InterfaceC705550Rlx
    public View rootView() {
        return null;
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
    public void unBind() {
    }

    @Override // X.InterfaceC705570Rlz
    public Set<InterfaceC705580Rm0> getAnchorShowListeners() {
        return this.LL;
    }

    @Override // X.InterfaceC1393670mN3
    public boolean LIZJ(C2344009Gk c2344009Gk) {
        C705560Rly.LIZIZ(this);
        return false;
    }

    @Override // X.InterfaceC1393670mN3
    public void LJII(AbstractC707180Roa abstractC707180Roa) {
        C705560Rly.LIZ(this, abstractC707180Roa);
    }

    public final void LJJIFFI(InterfaceC705580Rm0 interfaceC705580Rm0) {
        if (getAnchorShowListeners() == null) {
            setAnchorShowListeners(new LinkedHashSet());
        }
        interfaceC705580Rm0.LJIIZILJ(LJIIL(), LIZLLL(), getAwemeId());
        Set<InterfaceC705580Rm0> anchorShowListeners = getAnchorShowListeners();
        if (anchorShowListeners != null) {
            anchorShowListeners.add(interfaceC705580Rm0);
        }
    }

    @Override // X.InterfaceC705570Rlz
    public void setAnchorShowListeners(Set<InterfaceC705580Rm0> set) {
        this.LL = set;
    }

    public AbstractC705690RmB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AbstractC705690RmB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
