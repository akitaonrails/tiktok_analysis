package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20553115bd extends C21594419fC {
    public static final /* synthetic */ int LLIZ = 0;
    public boolean LLILZIL;
    public final C01GW LLILZLL;

    public C20553115bd() {
        throw null;
    }

    private final C20553015bc getPagerAdapterObserver() {
        return (C20553015bc) this.LLILZLL.getValue();
    }

    public final void LIZLLL(boolean z) {
        PagerAdapter adapter;
        boolean z2 = false;
        if (C07MS.LIZ() && z && (adapter = getAdapter()) != null && adapter.getCount() > 1) {
            z2 = true;
        }
        setSwipeable(z2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        if (!this.LLILZIL) {
            if (pagerAdapter != null) {
                pagerAdapter.LJJII(getPagerAdapterObserver());
            }
            this.LLILZIL = true;
        }
    }

    public C20553115bd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 629));
    }
}
