package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol;
import com.ss.android.ugc.feed.platform.panel.DefaultPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.IPanelConfigurationProtocol;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qe0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557940qe0 extends C09AY implements Function0<IPanelConfigurationProtocol> {
    public final /* synthetic */ RootPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557940qe0(RootPanelComponent rootPanelComponent) {
        super(0);
        this.LL = rootPanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.feed.platform.panel.IPanelConfigurationProtocol, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPanelConfigurationProtocol invoke() {
        int size;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LL), IPanelConfigurationProtocol.class, false);
        if (listLIZIZ != null) {
            RootPanelComponent rootPanelComponent = this.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (((ConfigurationProtocol) obj).Tl2(rootPanelComponent.getPanelContext())) {
                    arrayList.add(obj);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null && (size = listLLIIII.size()) != 0) {
                if (size != 1) {
                    throw new IllegalStateException("Only one configuration per scene is allowed!!!");
                }
                if (listLLIIII != null) {
                    return ListProtector.get(listLLIIII, 0);
                }
                return null;
            }
        }
        return new DefaultPanelConfiguration();
    }
}
