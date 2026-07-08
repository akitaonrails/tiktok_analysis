package X;

import com.ss.android.ugc.aweme.im.common.setting.IMTemplateConfigurationSetting;
import com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Z84, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z84 implements IMessageRefreshManager {
    public final ConcurrentHashMap<String, C0Z83> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager
    public final void LIZIZ(String str) {
        if (!IMTemplateConfigurationSetting.LIZ.isRefreshEnabled) {
            return;
        }
        if (((Number) C270100AiG.LIZ.getValue()).intValue() == 1) {
            C0Z83 c0z83Remove = this.LIZ.remove(str);
            if (c0z83Remove != null) {
                c0z83Remove.LIZ();
                return;
            }
            return;
        }
        C0Z83 c0z83 = this.LIZ.get(str);
        if (c0z83 == null) {
            return;
        }
        c0z83.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager
    public final void LIZLLL(C869590Y9l c869590Y9l) {
        C0Z83 c0z83LJ = LJ(c869590Y9l.getConversationId());
        C901060ZWm.LIZLLL(c869590Y9l, true);
        C875230YVd.LIZJ(new C0Y3I("update message via force refresh"), Collections.singletonList(c869590Y9l));
        c0z83LJ.LJ(c869590Y9l);
    }

    public final C0Z83 LJ(String str) {
        C0Z83 c912330Zqh;
        C0Z83 c0z83 = this.LIZ.get(str);
        if (c0z83 != null) {
            return c0z83;
        }
        if (((Number) C270100AiG.LIZ.getValue()).intValue() == 1) {
            c912330Zqh = new C912320Zqg(str);
        } else {
            c912330Zqh = new C912330Zqh(str);
        }
        C0Z83 c0z83PutIfAbsent = this.LIZ.putIfAbsent(str, c912330Zqh);
        if (c0z83PutIfAbsent != null) {
            return c0z83PutIfAbsent;
        }
        return c912330Zqh;
    }

    @Override // com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager
    public final void LIZ(String str, List<? extends C869590Y9l> list) {
        LJ(str).LIZIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.im.service.refresh.IMessageRefreshManager
    public final void LIZJ(String str, List<? extends C869590Y9l> list) {
        IMTemplateConfigurationSetting.TemplateConfigurationModel templateConfigurationModel = IMTemplateConfigurationSetting.LIZ;
        if (!IMTemplateConfigurationSetting.LIZ.isRefreshEnabled) {
            return;
        }
        LJ(str).LIZLLL(list);
    }
}
