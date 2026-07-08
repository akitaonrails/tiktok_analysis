package X;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: X.0ECc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360680ECc extends AbstractC360710ECf {
    public C0ECT LLJJI;
    public C0ECW LLJJIII;

    public final C0ECT getMultiPageViewProvider() {
        return this.LLJJI;
    }

    public final C0ECW getPageAdapter() {
        return this.LLJJIII;
    }

    public C360680ECc(Context context) {
        super(context, null, 0);
    }

    @Override // X.AbstractC360710ECf
    public final void LJFF(List<C357590E0f> list) {
        C0ECT c0ect;
        C362490EJb multiPageConfig = getMultiPageConfig();
        if (multiPageConfig != null && (c0ect = this.LLJJI) != null) {
            getContext();
            C0ECW c0ecw = new C0ECW(c0ect, list);
            this.LLJJIII = c0ecw;
            C527320KmA resourceViewPagerFromXml = getResourceViewPagerFromXml();
            resourceViewPagerFromXml.setAdapter(c0ecw);
            resourceViewPagerFromXml.setNoScroll(multiPageConfig.LJJIFFI);
            C0EJZ resourceMultiTab = getResourceMultiTab();
            if (resourceMultiTab != null) {
                resourceMultiTab.LIZ(multiPageConfig);
            }
            C0EJZ resourceMultiTab2 = getResourceMultiTab();
            if (resourceMultiTab2 != null) {
                resourceMultiTab2.LJII(getResourceViewPagerFromXml(), list);
            }
        }
    }

    public final void setMultiPageViewProvider(C0ECT c0ect) {
        this.LLJJI = c0ect;
    }

    public final void setPageAdapter(C0ECW c0ecw) {
        this.LLJJIII = c0ecw;
    }
}
