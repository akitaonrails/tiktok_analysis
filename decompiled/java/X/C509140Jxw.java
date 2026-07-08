package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509140Jxw extends C507580JvQ {
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

    public C509140Jxw(GetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_sub_banner", -10, "sub_banner", data, null);
        this.LLILZLL = "item_privilege_sub_banner";
        this.LLIZ = -10;
        this.LLIZLLLIL = "sub_banner";
        this.LLJ = str;
    }
}
