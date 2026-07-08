package X;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.ui.list.container.ListContainerProxy;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import j27.s;

/* JADX INFO: renamed from: X.0kF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311840kF4 extends AbstractC1311850kF5 {
    public int LIZ = -1;
    public boolean LIZIZ;
    public final /* synthetic */ UIListContainer LIZJ;

    @Override // X.AbstractC1311850kF5
    public final void LIZ() {
        C1311860kF6 c1311860kF6;
        UIListContainer uIListContainer = this.LIZJ;
        s sVar = uIListContainer.mContext;
        ListContainerProxy listContainerProxy = uIListContainer.LLJLILLLLZIIL;
        if (listContainerProxy != null) {
            listContainerProxy.LIZJ(uIListContainer.getSign());
            return;
        }
        if (sVar == null || (c1311860kF6 = sVar.LLJ) == null) {
            return;
        }
        int sign = uIListContainer.getSign();
        LynxTemplateRender lynxTemplateRender = c1311860kF6.LIZ;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJLIIJ(sign);
        }
    }

    public C1311840kF4(UIListContainer uIListContainer) {
        this.LIZJ = uIListContainer;
    }
}
