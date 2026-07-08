package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2790016e implements InterfaceC0241006d {
    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2790016e)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_length", null);
        linkedHashMap.put("title_without_hashtag_length", null);
        linkedHashMap.put("text_sticker_length", null);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CLAContentLengthParams(subtitleLength=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", titleWithoutHashtagLength=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", textStickerLength=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }
}
