package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardSignalStruct;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0RWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697170RWh extends C09AY implements Function1<C698680Ras, C698680Ras> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697170RWh(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(1);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C698680Ras invoke(C698680Ras c698680Ras) {
        StandardButtonContainerStruct standardButtonContainerStruct;
        Set setLJJL;
        List<String> list;
        C698680Ras c698680Ras2 = c698680Ras;
        StandardComponentInfo standardComponentInfo = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme().getStandardComponentInfo();
        if (standardComponentInfo != null && (standardButtonContainerStruct = standardComponentInfo.buttonContainer) != null) {
            List<StandardComponentStruct> list2 = standardButtonContainerStruct.buttons;
            boolean z = false;
            if (list2 != null && !list2.isEmpty()) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<StandardComponentStruct> it2 = list2.iterator();
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
                new AwS412S0200000_11(c698680Ras2, this.LL, 79);
                C0T6L.LIZLLL();
                if (C1203404nI.LIZ()) {
                    if (z) {
                        this.LL.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
                    }
                } else {
                    this.LL.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
                    return c698680Ras2;
                }
            }
        }
        return c698680Ras2;
    }
}
