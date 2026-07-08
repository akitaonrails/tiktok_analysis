package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;

/* JADX INFO: renamed from: X.07MP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MP {
    public static final ContentLanguage[] LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (ContentLanguage[]) SettingsManager.LIZLLL().LJIIIIZZ("predicted_content_languages", ContentLanguage[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ContentLanguage[] contentLanguageArr = (ContentLanguage[]) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return contentLanguageArr == null ? new ContentLanguage[0] : contentLanguageArr;
    }
}
