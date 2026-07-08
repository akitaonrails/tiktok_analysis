package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;

/* JADX INFO: renamed from: X.0KvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533100KvU {
    public static final void LIZ(C0L9D c0l9d, String str) {
        InterfaceC533110KvV interfaceC533110KvV = (InterfaceC533110KvV) ServiceManager.get().getService(INLETemplateOfflineService.class);
        if (interfaceC533110KvV != null) {
            interfaceC533110KvV.LJI(c0l9d.getStep(), str);
        }
    }
}
