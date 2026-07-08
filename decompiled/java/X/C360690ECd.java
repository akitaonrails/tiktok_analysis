package X;

import android.content.Context;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0ECd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360690ECd extends AbstractC360710ECf {
    public final C19A3 LLJJI;
    public InterfaceC360550EBp LLJJIII;
    public C360700ECe LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final boolean getInterceptAllEvent() {
        return this.LLJJIJIIJIL;
    }

    public final InterfaceC360550EBp getMultiPageViewProvider() {
        return this.LLJJIII;
    }

    public final C360700ECe getPageAdapter() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC360710ECf
    public final void LJFF(List<C357590E0f> list) {
        InterfaceC360550EBp interfaceC360550EBp;
        C19A3 c19a3 = this.LLJJI;
        if (c19a3 != null) {
            C362490EJb multiPageConfig = getMultiPageConfig();
            if (multiPageConfig != null && (interfaceC360550EBp = this.LLJJIII) != null) {
                C360700ECe c360700ECe = new C360700ECe(c19a3, interfaceC360550EBp, list);
                this.LLJJIJI = c360700ECe;
                C527320KmA resourceViewPagerFromXml = getResourceViewPagerFromXml();
                resourceViewPagerFromXml.setAdapter(c360700ECe);
                resourceViewPagerFromXml.setNoScroll(multiPageConfig.LJJIFFI);
                if (getSelectIndex() != resourceViewPagerFromXml.getCurrentItem()) {
                    resourceViewPagerFromXml.setCurrentItem(getSelectIndex(), false);
                }
                C0EJZ resourceMultiTab = getResourceMultiTab();
                if (resourceMultiTab != null) {
                    resourceMultiTab.LIZ(multiPageConfig);
                }
                C0EJZ resourceMultiTab2 = getResourceMultiTab();
                if (resourceMultiTab2 != null) {
                    resourceMultiTab2.LJII(getResourceViewPagerFromXml(), list);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("GroupScene must not be null");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIJIIJIL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptAllEvent(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setMultiPageViewProvider(InterfaceC360550EBp interfaceC360550EBp) {
        this.LLJJIII = interfaceC360550EBp;
    }

    public final void setPageAdapter(C360700ECe c360700ECe) {
        this.LLJJIJI = c360700ECe;
    }

    public C360690ECd(Context context, C19A3 c19a3) {
        super(context, null, 0);
        this.LLJJI = c19a3;
    }
}
