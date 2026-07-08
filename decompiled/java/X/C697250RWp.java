package X;

import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697250RWp extends C09AY implements Function1<FcpNodeProtocol, Boolean> {
    public final /* synthetic */ C697210RWl LL;
    public final /* synthetic */ C259800zU<EnumC697700RYi> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697250RWp(C697210RWl c697210RWl, C259800zU<EnumC697700RYi> c259800zU) {
        super(1);
        this.LL = c697210RWl;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FcpNodeProtocol fcpNodeProtocol) {
        String strLLLII;
        boolean z;
        Map<String, GlobalComponentData> map;
        Map<String, ComponentContainerData> map2;
        ComponentContainerData componentContainerData;
        FcpNodeProtocol fcpNodeProtocol2 = fcpNodeProtocol;
        String parentKey = null;
        if (fcpNodeProtocol2 != null) {
            strLLLII = fcpNodeProtocol2.LLLII();
        } else {
            strLLLII = null;
        }
        FeedComponentPriorityData feedComponentPriorityDataInvoke = this.LL.LLILLJJLI.invoke();
        if (feedComponentPriorityDataInvoke != null) {
            Map<String, String> map3 = C700080Rd8.LIZ;
            if (strLLLII != null && (((map = feedComponentPriorityDataInvoke.globalComponentMap) != null && (componentContainerData = map.get(strLLLII)) != null) || ((map2 = feedComponentPriorityDataInvoke.containerMap) != null && (componentContainerData = map2.get(strLLLII)) != null))) {
                parentKey = componentContainerData.getParentKey();
            }
        }
        if (!Intrinsics.LJFF(this.LLILLJJLI.element.getKey(), parentKey) && !Intrinsics.LJFF(this.LLILLJJLI.element.getKey(), strLLLII)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
