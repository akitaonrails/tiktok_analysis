package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Q9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665860Q9w extends C09AY implements InterfaceC1631620sYq<Map<String, ? extends Object>, Integer, Integer, Unit> {
    public final /* synthetic */ C665840Q9u LL;
    public final /* synthetic */ CompletionBlock<InterfaceC665890Q9z> LLILLJJLI;
    public final /* synthetic */ InterfaceC665880Q9y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665860Q9w(C665840Q9u c665840Q9u, CompletionBlock<InterfaceC665890Q9z> completionBlock, InterfaceC665880Q9y interfaceC665880Q9y) {
        super(3);
        this.LL = c665840Q9u;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = interfaceC665880Q9y;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Map<String, ? extends Object> map, Integer num, Integer num2) {
        String containerID;
        Map<String, ? extends Object> map2 = map;
        Integer num3 = num;
        Integer num4 = num2;
        InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC665890Q9z.class, containerID);
        InterfaceC665880Q9y interfaceC665880Q9y = this.LLILLL;
        InterfaceC665890Q9z interfaceC665890Q9z = (InterfaceC665890Q9z) xBaseModelLIZJ;
        interfaceC665890Q9z.setStatusCode(0);
        interfaceC665890Q9z.setReviewAggregation(map2);
        if (C0BQF.LIZ() && interfaceC665880Q9y.getType().intValue() == 51) {
            interfaceC665890Q9z.setCursor(num3);
            interfaceC665890Q9z.setHasMore(num4);
        }
        this.LLILLJJLI.onSuccess(interfaceC665890Q9z, "");
        return Unit.LIZ;
    }
}
