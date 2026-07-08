package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0JwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508290JwZ extends C507580JvQ {
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

    public C508290JwZ(GetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_header", 0, "about_me", data, null);
        this.LLILZLL = "item_privilege_header";
        this.LLIZ = 0;
        this.LLIZLLLIL = "about_me";
        this.LLJ = str;
    }
}
