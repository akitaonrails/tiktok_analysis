package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394020mNc extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ C1400390mXt LL;
    public final /* synthetic */ AnchorCommonStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394020mNc(C1400390mXt c1400390mXt, AnchorCommonStruct anchorCommonStruct) {
        super(0);
        this.LL = c1400390mXt;
        this.LLILLJJLI = anchorCommonStruct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        Map<String, String> mapInvoke = this.LL.LIZ.invoke();
        LinkedHashMap linkedHashMap = mapInvoke != null ? new LinkedHashMap(mapInvoke) : new LinkedHashMap();
        C1394230mNx c1394230mNx = C1394230mNx.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LLILLJJLI;
        c1394230mNx.getClass();
        C1394230mNx.LIZIZ(linkedHashMap, anchorCommonStruct);
        return linkedHashMap;
    }
}
