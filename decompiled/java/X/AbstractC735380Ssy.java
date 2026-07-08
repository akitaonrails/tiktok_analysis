package X;

import X.AbstractC735380Ssy;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Ssy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC735380Ssy<E extends AbstractC735380Ssy<E>> extends AbstractC1386140mAu<E> {
    public String LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public String LJJLIIIJJIZ;

    @Override // X.AbstractC1386140mAu, X.AbstractC1386130mAt
    public final void LJII() {
        super.LJII();
        if (!TextUtils.isEmpty(this.LJJLIIIJ)) {
            LJFF("search_keyword", this.LJJLIIIJ, InterfaceC1210900hcG.LIZ);
        }
        String str = this.LJJLIIIJILLIZJL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("enter_method", str, c2082308Dt);
        int i = this.LJJLIIIJJI;
        if (i != -1) {
            LJFF("is_fullscreen", String.valueOf(i), c2082308Dt);
        }
    }

    public AbstractC735380Ssy(String str) {
        super(str);
        this.LJJLIIIJJI = -1;
        this.LJJLIIIJJIZ = "";
    }

    public final void LJJIJIL(String str) {
        this.LJJLIIIJILLIZJL = str;
    }

    public final void LJJIJL(Context context) {
        if (context == null) {
            return;
        }
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        this.LJJLIIIJ = c2189821An6LIZ.getSearchKeyword();
        String aid = c2189821An6LIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        this.LJJLIIIJJIZ = aid;
    }
}
