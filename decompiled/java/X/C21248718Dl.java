package X;

import com.bytedance.android.btm.impl.page.model.PageInfoStack;

/* JADX INFO: renamed from: X.18Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21248718Dl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C21248718Dl.class, "pageInfoFactory", "getPageInfoFactory()Lcom/bytedance/android/btm/impl/page/model/PageInfoFactory;", 0);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final InterfaceC21247718Db LIZ() {
        return PageInfoStack.pageInfoFactory$delegate.getValue(this, LIZ[0]);
    }

    public static PageInfoStack LIZIZ(boolean z) {
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStack = C21248618Dk.LJIJJ;
        if (pageInfoStack != null && pageInfoStack.isContainer() == z) {
            PageInfoStack pageInfoStack2 = C21248618Dk.LJIJJ;
            C21248618Dk.LJIJJ = null;
            return pageInfoStack2;
        }
        PageInfoStack pageInfoStack3 = new PageInfoStack();
        pageInfoStack3.setContainer(z);
        return pageInfoStack3;
    }
}
