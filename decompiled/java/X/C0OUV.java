package X;

import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OUV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OUV implements C0OU7 {
    public final /* synthetic */ C0OUT LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.C0OU7
    public final void LIZ(C1537720q7O c1537720q7O) {
        C0OOV c0oov;
        C0OUT c0out = this.LIZ;
        if (!c0out.LJIILIIL && Intrinsics.LJFF(c0out.LJII, this.LIZIZ)) {
            C0OUT c0out2 = this.LIZ;
            EnumC1538460q8a enumC1538460q8a = null;
            c0out2.LJII = null;
            if (c0out2.LJIIJJI == null) {
                BulletinHybridAbility bulletinHybridAbility = c0out2.LIZ;
                if (bulletinHybridAbility != null) {
                    bulletinHybridAbility.Aw1(c1537720q7O);
                    return;
                }
                return;
            }
            c0out2.LJIILJJIL(c1537720q7O, c0out2.LJIIL);
            C0OUT c0out3 = this.LIZ;
            C1537720q7O c1537720q7O2 = c0out3.LJI;
            if (c1537720q7O2 != null) {
                enumC1538460q8a = c1537720q7O2.LLJJ;
            }
            if (enumC1538460q8a == EnumC1538460q8a.SUCCESS && (c0oov = c0out3.LJIIIIZZ) != null) {
                c0out3.LIZJ.LIZ(c0oov, true);
            }
            c0out3.LJIILL();
            return;
        }
        BulletinHybridAbility bulletinHybridAbility2 = this.LIZ.LIZ;
        if (bulletinHybridAbility2 != null) {
            bulletinHybridAbility2.Aw1(c1537720q7O);
        }
    }

    public C0OUV(C0OUT c0out, String str) {
        this.LIZ = c0out;
        this.LIZIZ = str;
    }
}
