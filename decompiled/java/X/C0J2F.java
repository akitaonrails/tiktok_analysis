package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J2F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J2F extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0J2B LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J2F(C0J2B c0j2b) {
        super(0);
        this.LL = c0j2b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroup;
        C0J2B c0j2b = this.LL;
        FrameLayout frameLayout = c0j2b.LJFF;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
            }
            c0j2b.LJFF = null;
            c0j2b.LJI = null;
        }
        return Unit.LIZ;
    }
}
