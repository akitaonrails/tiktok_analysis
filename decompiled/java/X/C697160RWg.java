package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardSignalStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS255S0300000_11;

/* JADX INFO: renamed from: X.0RWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697160RWg extends C09AY implements Function1<C698680Ras, C698680Ras> {
    public final /* synthetic */ C697210RWl LL;
    public final /* synthetic */ InterfaceC697220RWm LLILLJJLI;
    public final /* synthetic */ Map.Entry<String, InterfaceC697230RWn> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C697160RWg(C697210RWl c697210RWl, InterfaceC697220RWm interfaceC697220RWm, Map.Entry<String, ? extends InterfaceC697230RWn> entry) {
        super(1);
        this.LL = c697210RWl;
        this.LLILLJJLI = interfaceC697220RWm;
        this.LLILLL = entry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C698680Ras invoke(C698680Ras c698680Ras) {
        VideoItemParams videoItemParamsLIZJ;
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardTagContainerStruct standardTagContainerStruct;
        Set setLJJL;
        List<String> list;
        C698680Ras c698680Ras2 = c698680Ras;
        InterfaceC697120RWc interfaceC697120RWc = this.LL.LLIZ;
        if (interfaceC697120RWc != null && (videoItemParamsLIZJ = interfaceC697120RWc.LIZJ()) != null && (aweme = videoItemParamsLIZJ.getAweme()) != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null && (standardTagContainerStruct = standardComponentInfo.highTag) != null) {
            List<StandardTagStruct> list2 = standardTagContainerStruct.tags;
            boolean z = false;
            if (list2 != null && !list2.isEmpty()) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<StandardTagStruct> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        StandardSignalStruct standardSignalStruct = it2.next().signal;
                        if (standardSignalStruct != null && (list = standardSignalStruct.timingKeys) != null) {
                            Iterable iterable = c698680Ras2.LIZ;
                            if (iterable == null) {
                                iterable = C13BV.INSTANCE;
                            }
                            setLJJL = C13LP.LJJL(list, iterable);
                        } else {
                            setLJJL = null;
                        }
                        if (C866950Xzh.LIZIZ(setLJJL)) {
                            z = true;
                            break;
                        }
                    }
                }
                new AwS255S0300000_11((Map.Entry) this.LLILLL, (Map.Entry<String, ? extends InterfaceC697230RWn>) c698680Ras2, (C698680Ras) this.LL, (C697210RWl) 14);
                C0T6L.LIZLLL();
                if (C1203404nI.LIZ()) {
                    if (z) {
                        this.LLILLJJLI.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
                    }
                } else {
                    this.LLILLJJLI.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
                    return c698680Ras2;
                }
            }
        }
        return c698680Ras2;
    }
}
