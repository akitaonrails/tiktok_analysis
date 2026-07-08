package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.promote.ui.PromoteBottomButtonConfigProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706710Rnp implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ PromoteBottomButtonConfigProvider LL;

    public C706710Rnp(PromoteBottomButtonConfigProvider promoteBottomButtonConfigProvider) {
        this.LL = promoteBottomButtonConfigProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        StandardComponentStruct standardComponentStruct;
        String str;
        StandardButtonContainerStruct standardButtonContainerStruct;
        List<StandardComponentStruct> list;
        StandardComponentStruct next;
        String str2;
        VideoItemParams videoItemParams2 = videoItemParams;
        PromoteBottomButtonConfigProvider promoteBottomButtonConfigProvider = this.LL;
        promoteBottomButtonConfigProvider.getClass();
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            String str3 = videoItemParams2.mEventType;
            StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
            if (standardComponentInfo != null && (standardButtonContainerStruct = standardComponentInfo.buttonContainer) != null && (list = standardButtonContainerStruct.buttons) != null) {
                Iterator<StandardComponentStruct> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        StandardComponentKey standardComponentKey = next.key;
                        if (standardComponentKey != null) {
                            str2 = standardComponentKey.componentKey;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "bottom_button_promote_bottom_button")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                standardComponentStruct = next;
            } else {
                standardComponentStruct = null;
            }
            ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) promoteBottomButtonConfigProvider.LL.getValue();
            if (iCommercePromoteService != null) {
                if (standardComponentStruct != null) {
                    str = standardComponentStruct.customizedInfo;
                } else {
                    str = null;
                }
                iCommercePromoteService.LJIJ(aweme, str3, str);
            }
        }
        return new C1387205bq(null);
    }
}
