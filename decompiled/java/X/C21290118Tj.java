package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetBotPictureComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetTnsComponent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21290118Tj {
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095 A[PHI: r5
      0x0095: PHI (r5v1 com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent) = 
      (r5v0 com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent)
      (r5v6 com.ss.android.ugc.aweme.im.message.template.component.VisualPoetErrorInfoComponent)
     binds: [B:46:0x0092, B:30:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C21291018Ts LIZ(X.C869590Y9l r8) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21290118Tj.LIZ(X.0Y9l):X.18Ts");
    }

    public static final C18TL LIZIZ(C869590Y9l c869590Y9l) {
        EnumC21290318Tl enumC21290318Tl;
        String str;
        VisualPoetBotPictureComponent visualPoetBotPictureComponent;
        VisualPoetErrorInfoComponent visualPoetErrorInfoComponent;
        String str2;
        VisualPoetTnsComponent visualPoetTnsComponent;
        Map<String, String> map;
        String str3 = null;
        String str4 = "1001";
        if (c869590Y9l.getMsgType() == 1821 && TextUtils.equals(c869590Y9l.getScene(), "visual_poet_tns")) {
            VisualPoetErrorCardTemplate visualPoetErrorCardTemplate = (VisualPoetErrorCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetErrorCardTemplate.class);
            if (!((Boolean) C268640Afu.LIZ.getValue()).booleanValue() ? !(visualPoetErrorCardTemplate == null || (visualPoetErrorInfoComponent = visualPoetErrorCardTemplate.errorInfoComponent) == null || (str2 = visualPoetErrorInfoComponent.code) == null) : !(visualPoetErrorCardTemplate == null || (map = visualPoetErrorCardTemplate.extra) == null || (str2 = map.get("tns_code")) == null)) {
                str4 = str2;
            }
            if (visualPoetErrorCardTemplate != null && (visualPoetTnsComponent = visualPoetErrorCardTemplate.tnsComponent) != null) {
                str3 = visualPoetTnsComponent.text;
            }
            return new C18TL(str4, str3);
        }
        if (c869590Y9l.getMsgType() == 1820 && TextUtils.equals(c869590Y9l.getScene(), "visual_poet_bot_picture")) {
            VisualPoetBotCardTemplate visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class);
            if (visualPoetBotCardTemplate != null && (visualPoetBotPictureComponent = visualPoetBotCardTemplate.botPictureComponent) != null) {
                enumC21290318Tl = visualPoetBotPictureComponent.taskStatusComponent;
            } else {
                enumC21290318Tl = null;
            }
            if (enumC21290318Tl == EnumC21290318Tl.FAILED) {
                VisualPoetErrorInfoComponent visualPoetErrorInfoComponent2 = visualPoetBotCardTemplate.botPictureComponent.errorInfoComponent;
                if (Intrinsics.LJFF(visualPoetErrorInfoComponent2.code, "1001")) {
                    if (((Boolean) C268640Afu.LIZ.getValue()).booleanValue()) {
                        Map<String, String> map2 = visualPoetBotCardTemplate.extra;
                        if (map2 != null && (str = map2.get("tns_code")) != null) {
                            str4 = str;
                        }
                    } else {
                        str4 = visualPoetErrorInfoComponent2.code;
                    }
                    return new C18TL(str4, visualPoetErrorInfoComponent2.message);
                }
            }
        }
        return null;
    }
}
