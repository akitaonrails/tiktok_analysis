package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Pf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650350Pf7 implements InterfaceC648070PbR {
    public final View LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public final C650380PfA LLILLL;

    @Override // X.InterfaceC648070PbR
    public final void H1() {
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final SearchServiceCenter$AutoPlayAbility LIZ() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if (interfaceC665370Q7z != null) {
            return (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        Context contextLIZ;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
        boolean z = C659080PtC.LIZ;
        View view = this.LL;
        if (view == null || (contextLIZ = view.getContext()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        return C659080PtC.LIZLLL(contextLIZ) && (searchServiceCenter$AutoPlayAbilityLIZ = LIZ()) != null && searchServiceCenter$AutoPlayAbilityLIZ.N1();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            searchServiceCenter$AutoPlayAbilityLIZ.LLZZZZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            searchServiceCenter$AutoPlayAbilityLIZ.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        View detectView;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        return (searchServiceCenter$AutoPlayAbilityLIZ == null || (detectView = searchServiceCenter$AutoPlayAbilityLIZ.getDetectView()) == null) ? this.LL : detectView;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            return searchServiceCenter$AutoPlayAbilityLIZ.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        return searchServiceCenter$AutoPlayAbilityLIZ != null && searchServiceCenter$AutoPlayAbilityLIZ.mm();
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0PfA] */
    public C650350Pf7(View view) {
        this.LL = view;
        if (view != null) {
            view.setTag(R.id.u74, Unit.LIZ);
        }
        this.LLILLL = new C0PCQ() { // from class: X.0PfA
            @Override // X.C0PCQ
            public final double LLFZ() {
                View viewVt;
                Context contextLIZ;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = this.LL.LIZ();
                if (searchServiceCenter$AutoPlayAbilityLIZ == null || (viewVt = searchServiceCenter$AutoPlayAbilityLIZ.Vt()) == null) {
                    return 0.0d;
                }
                int[] iArr = new int[2];
                viewVt.getLocationOnScreen(iArr);
                int height = viewVt.getHeight();
                View view2 = this.LL.LL;
                if (view2 == null || (contextLIZ = view2.getContext()) == null) {
                    C844470XAv.LIZ.getClass();
                    contextLIZ = C844470XAv.LIZ();
                }
                double dLJIIIIZZ = ((double) (C12ES.LJIIIIZZ(contextLIZ) - iArr[1])) / ((double) height);
                if (dLJIIIIZZ > 1.0d) {
                    return 1.0d;
                }
                return dLJIIIIZZ;
            }

            @Override // X.C0PCQ
            public final boolean R1() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = this.LL.LIZ();
                return (searchServiceCenter$AutoPlayAbilityLIZ == null || searchServiceCenter$AutoPlayAbilityLIZ.Vt() == null) ? false : true;
            }
        };
    }

    @Override // X.InterfaceC648070PbR
    public final void LLILLIZIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            searchServiceCenter$AutoPlayAbilityLIZ.Mu(c650630PfZ);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            searchServiceCenter$AutoPlayAbilityLIZ.wp(c650630PfZ);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = LIZ();
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            searchServiceCenter$AutoPlayAbilityLIZ.J0();
        }
    }
}
