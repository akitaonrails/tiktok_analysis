package X;

import java.lang.ref.WeakReference;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20356414l0 implements InterfaceC953350aur {
    public final /* synthetic */ AbstractC20356314kz LIZ;
    public final /* synthetic */ C20361214lm LIZIZ;

    @Override // X.InterfaceC953350aur
    public final void LIZIZ() {
        this.LIZ.getClass();
    }

    public C20356414l0(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm) {
        this.LIZ = abstractC20356314kz;
        this.LIZIZ = c20361214lm;
    }

    @Override // X.InterfaceC953350aur
    public final void LIZ(boolean z, boolean z2) {
        Long lValueOf;
        if (z2) {
            InterfaceC20357214l8 interfaceC20357214l8 = this.LIZ.LLJJIJIIJIL;
            if (interfaceC20357214l8 != null) {
                interfaceC20357214l8.LIZLLL(new WeakReference<>(this.LIZIZ));
            }
            InterfaceC20357214l8 interfaceC20357214l82 = this.LIZ.LLJJIJIIJIL;
            if (interfaceC20357214l82 != null) {
                interfaceC20357214l82.LJIIIZ(System.currentTimeMillis());
            }
            AbstractC20356314kz abstractC20356314kz = this.LIZ;
            C20361214lm c20361214lm = this.LIZIZ;
            InterfaceC20357214l8 interfaceC20357214l83 = abstractC20356314kz.LLJJIJIIJIL;
            C20354214ke c20354214keLJJJJ = abstractC20356314kz.LJJJJ();
            Playbook playbook = this.LIZ.LLJJ;
            if (playbook != null) {
                lValueOf = Long.valueOf(playbook.playbookId);
            } else {
                lValueOf = null;
            }
            abstractC20356314kz.LJJ(c20361214lm, interfaceC20357214l83, c20354214keLJJJJ, "playbook", lValueOf, "", "playbook_entity");
        }
        this.LIZ.getClass();
    }
}
