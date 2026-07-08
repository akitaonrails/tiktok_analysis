package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507650JvX extends C507580JvQ {
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

    public C507650JvX(GetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_combined_perk", 1, "combined_perk", data, null);
        this.LLILZLL = "item_privilege_combined_perk";
        this.LLIZ = 1;
        this.LLIZLLLIL = "combined_perk";
        this.LLJ = str;
    }
}
