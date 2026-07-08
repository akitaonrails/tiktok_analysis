package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEK extends C1BEL {
    public int LJIIIZ;
    public final String LJIIJ;
    public final Map<String, String> LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("C2STrackEvent{adid:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",non_std_adid:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",usize:");
        List<String> list = this.LJFF;
        sbLIZ.append(list == null ? 0 : list.size());
        sbLIZ.append(",key:");
        sbLIZ.append(TextUtils.isEmpty(this.LIZIZ) ? "empty" : this.LIZIZ);
        sbLIZ.append(",label:");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(",create_time:");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(",retry_when_network_available:");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(",expire_seconds:");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1BEK(long j, List list, String str, boolean z, long j2, String str2, JSONObject jSONObject) {
        this(UUID.randomUUID().toString(), "c2s", j, list, str, z, j2, str2, jSONObject, 0, null);
    }

    public C1BEK(String str, String str2, long j, List<String> list, String str3, boolean z, long j2, String str4, JSONObject jSONObject, int i, Map<String, String> map) {
        super(str, str2, j, list, z, j2, str4, jSONObject);
        this.LJIIJ = "";
        this.LJIILIIL = -1L;
        this.LJIIJ = str3;
        this.LJIIIZ = i;
        this.LJIIJJI = map;
    }
}
