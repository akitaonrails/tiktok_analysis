package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1187110gzt implements InterfaceC713360RyY, InterfaceC1187170gzz {
    public final String LL;
    public final InterfaceC1181010gq3 LLILLJJLI;
    public final LifecycleRegistry LLILLL = new LifecycleRegistry(this);

    public abstract void LIZLLL(C1181580gqy c1181580gqy, InterfaceC1181010gq3 interfaceC1181010gq3, C20656615sK c20656615sK);

    public abstract void LJ();

    @Override // X.InterfaceC1187170gzz
    public final C19EG LIZ() {
        return C724240Sb0.LIZ(this.LLILLJJLI.S8());
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLILLJJLI.S8();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJFF(this.LLILLJJLI.S8(), null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    public final void LIZIZ(Lifecycle.Event event) {
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(event, 2680));
        this.LLILLL.handleLifecycleEvent(event);
    }

    public AbstractC1187110gzt(InterfaceC1181010gq3 interfaceC1181010gq3, String str) {
        this.LL = str;
        this.LLILLJJLI = interfaceC1181010gq3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0gzw] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0gzu] */
    public final void LIZJ(final C1181580gqy c1181580gqy, final InterfaceC1181010gq3 interfaceC1181010gq3) {
        final PoiDetailSlashFragment poiDetailSlashFragmentLIZ;
        InterfaceC1187100gzs interfaceC1187100gzsZ92 = interfaceC1181010gq3.z92();
        if (interfaceC1187100gzsZ92 != 0 && (poiDetailSlashFragmentLIZ = interfaceC1187100gzsZ92.LIZ()) != null) {
            final ?? r0 = new InterfaceC1187160gzy() { // from class: X.0gzw
                @Override // X.InterfaceC1187160gzy
                public final void LIZ(C20656615sK c20656615sK) {
                    this.LIZ.LIZLLL(c1181580gqy, interfaceC1181010gq3, c20656615sK);
                }
            };
            ?? r2 = new AbstractC20660815t0(poiDetailSlashFragmentLIZ, r0) { // from class: X.0gzu
                public final InterfaceC1187160gzy LL;
                public final int LLILLJJLI = 10;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILLJJLI;
                }

                {
                    this.LL = r0;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LL.LIZ(c20656615sK);
                }
            };
            LJ();
            interfaceC1187100gzsZ92.LIZIZ(r2, new C1668306g5("localservices_slashsparkpopup_slashsparkpopup"));
            return;
        }
        C1180170goh.LIZLLL().LIZIZ("slash_popup", AFwS206S0000000_18.get$arr$(763));
        LIZLLL(c1181580gqy, interfaceC1181010gq3, null);
    }
}
