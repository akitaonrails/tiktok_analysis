package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0wph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795830wph {
    public String LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public final C1795980wpw LIZ() {
        boolean z = (TextUtils.isEmpty(this.LIZ) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = true ^ TextUtils.isEmpty(this.LIZIZ);
        if (z && zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!this.LIZJ && !z && !zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C1795980wpw c1795980wpw = new C1795980wpw();
        c1795980wpw.LIZ = this.LIZ;
        c1795980wpw.LIZJ = this.LIZLLL;
        c1795980wpw.LIZIZ = this.LIZIZ;
        return c1795980wpw;
    }
}
