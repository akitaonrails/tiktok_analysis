package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ClientAiEventDrivenConfig;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClientAiEventDrivenConfigSetting;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0efI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097460efI extends C09AY implements Function0<List<? extends String>> {
    public C1097460efI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List<String> list;
        List<? extends String> listLJLJJLL;
        ClientAiEventDrivenConfig value = LivePcsClientAiEventDrivenConfigSetting.INSTANCE.getValue();
        return (value == null || (list = value.enabledStrategies) == null || (listLJLJJLL = C13LP.LJLJJLL(list)) == null) ? C13BV.INSTANCE : listLJLJJLL;
    }
}
