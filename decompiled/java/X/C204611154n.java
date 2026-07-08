package X;

/* JADX INFO: renamed from: X.154n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C204611154n extends AbstractC204610154m {
    @Override // X.InterfaceC204626155c
    public final int LLZLLIL() {
        return 2131845459;
    }

    @Override // X.InterfaceC204626155c
    public final String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC204626155c
    public void z3() {
    }

    @Override // X.InterfaceC204626155c
    public final boolean LLZLLLL() {
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            return false;
        }
        C155H c155hLIZJ = LIZJ();
        C0XPD.LIZIZ(c155hLIZJ != null ? c155hLIZJ.LJFF : null, "video_edit_page", "edit_page_recent", null, null);
        return true;
    }

    @Override // X.InterfaceC204626155c
    public final EnumC1654750tA9 getTabKey() {
        return EnumC1654750tA9.TAB_COLLECT;
    }
}
