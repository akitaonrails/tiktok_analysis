package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0fTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128810fTr {
    public static final void LIZIZ(LinkedHashMap<Long, Gift> linkedHashMap, Gift gift) {
        Gift.MusicGiftInfo musicGiftInfo;
        long j = gift.id;
        if (j > 0 && (musicGiftInfo = gift.musicInfo) != null && musicGiftInfo.resource != null) {
            linkedHashMap.put(Long.valueOf(j), gift);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C1128710fTh r25, X.C1129140fUO r26, X.C1128950fU5 r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128810fTr.LIZ(X.0fTh, X.0fUO, X.0fU5):boolean");
    }
}
