package X;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21208217z6 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final InterfaceC21208317z7 LJI;
    public final AbstractC21191617wQ LJII;
    public final JSONObject LJIIIIZZ;
    public final C1563990qnl LJIIIZ;

    public C21208217z6(Context context, String str, String str2, int i, String str3, Long l, InterfaceC21208317z7 interfaceC21208317z7, AbstractC21191617wQ abstractC21191617wQ, JSONObject jSONObject, C1563990qnl c1563990qnl, int i2) {
        str3 = (i2 & 16) != 0 ? null : str3;
        l = (i2 & 32) != 0 ? 0L : l;
        interfaceC21208317z7 = (i2 & 64) != 0 ? null : interfaceC21208317z7;
        abstractC21191617wQ = (i2 & 128) != 0 ? null : abstractC21191617wQ;
        jSONObject = (i2 & 256) != 0 ? null : jSONObject;
        c1563990qnl = (i2 & 512) != 0 ? null : c1563990qnl;
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = l;
        this.LJI = interfaceC21208317z7;
        this.LJII = abstractC21191617wQ;
        this.LJIIIIZZ = jSONObject;
        this.LJIIIZ = c1563990qnl;
    }
}
