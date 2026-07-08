package X;

import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS160S1100000_11;

/* JADX INFO: renamed from: X.0RdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700310RdV extends C09AY implements Function2<String, C699980Rcy, Boolean> {
    public final /* synthetic */ C701480RfO LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700310RdV(C701480RfO c701480RfO, String str) {
        super(2);
        this.LL = c701480RfO;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, C699980Rcy c699980Rcy) {
        ConditionData conditionData;
        boolean z;
        Map<String, ConditionData> map;
        C701480RfO c701480RfO = this.LL;
        ClientStandardModel clientStandardModelKn = c701480RfO.LJ.kn(c701480RfO.LIZ);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsConditionMap) != null) {
            conditionData = map.get(this.LLILLJJLI);
            if (conditionData != null) {
                z = true;
                if (!conditionData.canApplySlot) {
                }
            }
            this.LL.LIZLLL.LJLI();
            new AwS160S1100000_11(this.LLILLJJLI, conditionData, 6);
            C0T6L.LIZLLL();
            return Boolean.valueOf(z);
        }
        conditionData = null;
        z = false;
        this.LL.LIZLLL.LJLI();
        new AwS160S1100000_11(this.LLILLJJLI, conditionData, 6);
        C0T6L.LIZLLL();
        return Boolean.valueOf(z);
    }
}
