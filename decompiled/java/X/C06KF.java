package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.PreviewConfig;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06KF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06KF {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static C830490Whz LIZ(SessionInfo sessionInfo) {
        Map<String, String> mapLJ;
        PreviewConfig previewConfig = sessionInfo.getPreviewConfig();
        if (previewConfig == null || (mapLJ = previewConfig.previewMobParams) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C830490Whz c830490Whz = new C830490Whz();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapLJ.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), "enter_from")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c830490Whz.putAll(linkedHashMap);
        String str = mapLJ.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c830490Whz.put("previous_page", str);
        String str3 = mapLJ.get("enter_method");
        if (str3 != null) {
            str2 = str3;
        }
        c830490Whz.put("enter_method", str2);
        return c830490Whz;
    }

    public static void LIZIZ(String str, C830490Whz c830490Whz) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str, c830490Whz);
    }
}
