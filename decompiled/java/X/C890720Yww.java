package X;

/* JADX INFO: renamed from: X.0Yww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890720Yww extends AbstractC895380ZAq {
    public final int LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC887560Yrq
    public final long getTimestampInInbox() {
        return 0L;
    }

    @Override // X.AbstractC895380ZAq
    public final boolean isUnread() {
        return false;
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "dm_push_guide";
    }

    @Override // X.AbstractC895380ZAq
    public final C890610Ywl convertToInboxEntranceWrapper$awemenotice_release() {
        return new C890610Ywl(549, 0L, this.type, false, this, null, 96);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C890710Ywv.LIZIZ;
    }

    @Override // X.InterfaceC887560Yrq
    public final int getPriorityInInbox() {
        return this.LLILLL;
    }

    public C890720Yww(int i) {
        super(201);
        this.LLILLJJLI = i;
        this.LLILLL = 549;
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C890720Yww)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }
}
