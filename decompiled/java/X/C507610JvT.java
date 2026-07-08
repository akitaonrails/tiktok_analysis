package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507610JvT extends C507580JvQ {
    public static final /* synthetic */ int LLJI = 0;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    @Override // X.C507580JvQ
    public final String LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C507580JvQ
    public final int LIZLLL() {
        return this.LLIZ;
    }

    @Override // X.C507580JvQ, X.InterfaceC515600KJy
    public final String LJJJ() {
        return this.LLILZLL;
    }

    public C507610JvT(GetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_customized_perks", 30, "perks", data, null);
        this.LLILZLL = "item_privilege_customized_perks";
        this.LLIZ = 30;
        this.LLIZLLLIL = "perks";
        this.LLJ = str;
    }
}
