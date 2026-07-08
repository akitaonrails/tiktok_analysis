package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507720Jve extends C507580JvQ {
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;

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

    public C507720Jve(GetSubPrivilegeDetailResponse.Data data) {
        super("item_privilege_price_info", 1, "multi_tier", data, null);
        this.LLILZLL = "item_privilege_price_info";
        this.LLIZ = 1;
        this.LLIZLLLIL = "multi_tier";
        this.LLJ = true;
    }
}
