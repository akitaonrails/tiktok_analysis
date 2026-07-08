package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.contentlanguage.ContentLangDialogContent;

/* JADX INFO: renamed from: X.0BvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303790BvV {
    public static final ContentLangDialogContent LIZ() {
        ContentLangDialogContent contentLangDialogContent;
        try {
            SettingsManager.LIZLLL().getClass();
            contentLangDialogContent = (ContentLangDialogContent) SettingsManager.LJII("content_lang_dialog", ContentLangDialogContent.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (contentLangDialogContent != null) {
            return contentLangDialogContent;
        }
        C844470XAv.LIZ.getClass();
        return new ContentLangDialogContent(C844470XAv.LIZ().getString(2131829517), C844470XAv.LIZ().getString(2131829516));
    }
}
