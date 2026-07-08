package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20251714Lz extends C09AY implements Function0<JSONObject> {
    public C20251714Lz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        ITtmockService iTtmockService = (ITtmockService) ServiceManager.get().getService(ITtmockService.class, false, false);
        return (iTtmockService == null || iTtmockService.getPopupAllowList() == null) ? new JSONObject() : iTtmockService.getPopupAllowList();
    }
}
