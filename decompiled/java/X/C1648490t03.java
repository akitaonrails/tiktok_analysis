package X;

import a6n.a;
import android.content.Context;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648490t03 implements InterfaceC1653190t7d {
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 294));

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return new C529410KpX(this.LL);
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(a aVar) {
        String string;
        if (((Boolean) C300030BpR.LIZ.getValue()).booleanValue()) {
            string = ((Context) this.LLILLL.getValue()).getString(2131829656);
        } else {
            string = ((Context) this.LLILLL.getValue()).getString(2131828281);
        }
        return new C1653330t7r(string, "RecordAlbumTab", "album_tab", this.LLILLJJLI, new InterfaceC1653360t7u() { // from class: X.0t04
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return true;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return false;
            }
        }, null, false, null, null, 480);
    }

    public C1648490t03(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }
}
