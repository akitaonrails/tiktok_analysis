package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0e1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072950e1l implements InterfaceC1073770e35 {
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1072950e1l LIZJ;
    public final Keva LIZ;

    @Override // X.InterfaceC1073770e35
    public final void LIZIZ() {
        this.LIZ.erase("click_delete_icon_times");
    }

    @Override // X.InterfaceC1073770e35
    public final void LIZJ() {
        this.LIZ.storeInt("click_delete_icon_times", this.LIZ.getInt("click_delete_icon_times", 0) + 1);
    }

    public C1072950e1l() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind_phone_pop_");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1073770e35
    public final void LIZ(long j) {
        this.LIZ.storeLong("last_unbind_time", j);
    }
}
