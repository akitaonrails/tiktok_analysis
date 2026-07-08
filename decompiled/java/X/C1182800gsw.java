package X;

import com.google.gson.n;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0gsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182800gsw implements Serializable {
    public final boolean LL;
    public final C1182810gsx LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;

    public final n toJSONObject() {
        n nVar = new n();
        nVar.LJJII(Boolean.valueOf(this.LL), "location_allowed");
        C1182810gsx c1182810gsx = this.LLILLJJLI;
        nVar.LJJIFFI("location", c1182810gsx != null ? c1182810gsx.toJSONObject() : null);
        nVar.LJJIIJ("uid", this.LLILLL);
        nVar.LJJII(Boolean.valueOf(this.LLILZ), "is_init");
        return nVar;
    }

    public final C1182810gsx getLocation() {
        return this.LLILLJJLI;
    }

    public final boolean getLocationAllowed() {
        return this.LL;
    }

    public final String getUid() {
        return this.LLILLL;
    }

    public final boolean isInit() {
        return this.LLILZ;
    }

    public C1182800gsw(boolean z, C1182810gsx c1182810gsx, String str, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = c1182810gsx;
        this.LLILLL = str;
        this.LLILZ = z2;
    }
}
