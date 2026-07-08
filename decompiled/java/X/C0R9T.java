package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;
import com.ss.android.ugc.feed.platform.cell.ICellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R9T, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9T extends C09AY implements Function0<ICellConfigurationProtocol> {
    public final /* synthetic */ RootCellComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R9T(RootCellComponent rootCellComponent) {
        super(0);
        this.LL = rootCellComponent;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.feed.platform.cell.ICellConfigurationProtocol, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICellConfigurationProtocol invoke() {
        int size;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LL), ICellConfigurationProtocol.class, false);
        if (listLIZIZ != null) {
            RootCellComponent rootCellComponent = this.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZIZ) {
                if (((CellConfigurationProtocol) obj).Jg(rootCellComponent.LLJJJJLIIL.LL)) {
                    arrayList.add(obj);
                }
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null && (size = listLLIIII.size()) != 0) {
                if (size != 1) {
                    throw new IllegalStateException("Only one configuration per CellScene is allowed!!!");
                }
                if (listLLIIII != null) {
                    return ListProtector.get(listLLIIII, 0);
                }
                return null;
            }
        }
        return new DefaultCellConfig();
    }
}
