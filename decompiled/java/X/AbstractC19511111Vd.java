package X;

import android.content.Context;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11Vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19511111Vd extends FrameLayout {
    public boolean LL;

    public void LIZ() {
    }

    public boolean LIZIZ(List<AnchorTransData> list) {
        return false;
    }

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJFF() {
    }

    public void LJI() {
    }

    public void LJII() {
    }

    public void LJIIIIZZ(AnchorTransData anchorTransData, UrlModel urlModel, String str, boolean z, List list, List list2, Function1 function1, SpannedString spannedString, boolean z2, boolean z3, Function0 function0) {
    }

    public boolean LJIIJ() {
        return false;
    }

    public void LJIIJJI() {
    }

    public void LJIIL(boolean z) {
    }

    public void LJIILIIL(int i) {
    }

    public void LJIILJJIL() {
    }

    public void LJIILL() {
    }

    public void LJIILLIIL(Function1<? super View, Unit> function1) {
    }

    public ViewGroup getAnchorListContent() {
        return null;
    }

    public RemoteImageView getLeftIcon() {
        return null;
    }

    public TuxIconView getRightIcon() {
        return null;
    }

    public void setDisableClickListener(Function0<Unit> function0) {
    }

    public void setFromCreateTemplate(boolean z) {
    }

    public void setLeftIcon(int i) {
    }

    public void setLeftIcon(C419910GdJ c419910GdJ) {
    }

    public void setOnAddClickListener(Function1<? super View, Unit> function1) {
    }

    public void setOnClearAnchorListener(Function1<? super View, Unit> function1) {
    }

    public void setRightIcon(C419910GdJ c419910GdJ) {
    }

    public List<C19400610vE> getAddedAnchorList() {
        return C13BV.INSTANCE;
    }

    public AbstractC19511111Vd(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LL = z;
    }
}
