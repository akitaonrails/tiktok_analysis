package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;

/* JADX INFO: renamed from: X.0F8W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8W {
    public static final C0F8W LIZ = new C0F8W();

    public static TextTemplateParams LIZ(String str, C1EQC c1eqc) {
        String infoStickerTemplateParams;
        Object c098200Yq;
        if (c1eqc != null) {
            infoStickerTemplateParams = c1eqc.getInfoStickerTemplateParams(str);
        } else {
            infoStickerTemplateParams = null;
        }
        TextTemplateParams textTemplateParams = new TextTemplateParams(null, 0.0d, null, 0, 0.0f, 0.0d, null, null, 255, null);
        if (!TextUtils.isEmpty(infoStickerTemplateParams)) {
            try {
                c098200Yq = (TextTemplateParams) C7740030o.LIZ().getGson().LJII(infoStickerTemplateParams, TextTemplateParams.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            TextTemplateParams textTemplateParams2 = new TextTemplateParams(null, 0.0d, null, 0, 0.0f, 0.0d, null, null, 255, null);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = textTemplateParams2;
            }
            return (TextTemplateParams) c098200Yq;
        }
        return textTemplateParams;
    }
}
