package X;

import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507750Jvh extends C507580JvQ {
    public static final /* synthetic */ int LLJ = 0;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;

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

    public C507750Jvh(GetSubPrivilegeDetailResponse.Data data) {
        super("item_privilege_sub_discord", 60, "discord", data, null);
        this.LLILZLL = "item_privilege_sub_discord";
        this.LLIZ = 60;
        this.LLIZLLLIL = "discord";
    }
}
