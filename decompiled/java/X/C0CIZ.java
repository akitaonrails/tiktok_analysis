package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.internal.s;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIZ extends C09AY implements Function0<HashMap<String, s<String, Object>>> {
    public C0CIZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.HashMap<java.lang.String, com.google.gson.internal.s<java.lang.String, java.lang.Object>>] */
    @Override // kotlin.jvm.functions.Function0
    public final HashMap<String, s<String, Object>> invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("tiktok_search", HashMap.class, SearchSecurityControlConfig.LIZIZ);
    }
}
