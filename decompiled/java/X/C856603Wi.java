package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.03Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C856603Wi extends C041O {
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("is_success", this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT);
        map.put("user_id", this.LIZLLL);
        map.put("error_code", this.LJ);
        return map;
    }

    public C856603Wi(boolean z, String str, String str2) {
        super("rd_tiktokec_fetch_error");
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
