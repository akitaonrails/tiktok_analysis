package X;

import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.BasePreviewWidgetVisibilityChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.013G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C013G extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C13IQ<? extends BasePreviewWidgetVisibilityChannel> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C013G(C13IQ<? extends BasePreviewWidgetVisibilityChannel> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean boolValueOf;
        boolean zBooleanValue = bool.booleanValue();
        Map<C13IQ<? extends PreviewWidget>, Set<C13IQ<? extends BasePreviewWidgetVisibilityChannel>>> map = C770220UJg.LIZLLL;
        C13IQ<? extends BasePreviewWidgetVisibilityChannel> c13iq = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Set set = (Set) ((LinkedHashMap) C770220UJg.LIZLLL).get(entry.getKey());
            if (set != null) {
                boolValueOf = Boolean.valueOf(set.contains(c13iq));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (C13IQ c13iq2 : linkedHashMap.keySet()) {
            if (zBooleanValue) {
                C770220UJg c770220UJg = C770220UJg.LIZ;
                C770220UJg.LJI(c13iq2);
            } else {
                C770220UJg c770220UJg2 = C770220UJg.LIZ;
                C770220UJg.LJFF(c13iq2);
            }
        }
        return Unit.LIZ;
    }
}
