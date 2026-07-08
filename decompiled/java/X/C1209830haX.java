package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;

/* JADX INFO: renamed from: X.0haX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209830haX {
    public static final BrandedContentToolSchema LIZ() {
        try {
            return (BrandedContentToolSchema) SettingsManager.LIZLLL().LJIIIIZZ("branded_content_tool_schema", BrandedContentToolSchema.class, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }
}
