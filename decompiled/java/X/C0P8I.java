package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P8I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8I implements InterfaceC1618170sD9<C0P8I> {
    public final long LL;

    public C0P8I() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0P8I) && this.LL == ((C0P8I) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("music_search_session_id", Long.valueOf(this.LL));
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicSearchSessionState(musicSearchSessionId=");
        sbLIZ.append(this.LL);
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

    public C0P8I(long j) {
        this.LL = j;
        C0P8T.LIZ();
    }

    public /* synthetic */ C0P8I(int i) {
        this(0L);
    }
}
