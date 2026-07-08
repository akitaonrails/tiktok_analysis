package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392560mLG extends C09AY implements Function1<InterfaceC1393560mMs, CharSequence> {
    public C1392560mLG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(InterfaceC1393560mMs interfaceC1393560mMs) {
        String componentKey;
        AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
        if (anchorCommonStructData != null && (componentKey = anchorCommonStructData.getComponentKey()) != null) {
            return componentKey;
        }
        return "";
    }
}
