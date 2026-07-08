package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974020bSC extends C09AY implements InterfaceC1631620sYq<Boolean, Boolean, EnumC919170a1j, Unit> {
    public final /* synthetic */ MultiMatchAnchorWidget LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C974020bSC(MultiMatchAnchorWidget multiMatchAnchorWidget, int i, C013C c013c) {
        super(3);
        this.LL = multiMatchAnchorWidget;
        this.LLILLJJLI = i;
        this.LLILLL = c013c;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Boolean bool2, EnumC919170a1j enumC919170a1j) {
        EnumC964170bCJ enumC964170bCJ;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureCallback, isCompetition = ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", isFromModeGuidePage = ");
        sbLIZ.append(zBooleanValue2);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            C976020bVQ c976020bVQ = this.LL.LLJIJIL;
            if (c976020bVQ != null) {
                int i = this.LLILLJJLI;
                EnumC962960bAM.Companion.getClass();
                c976020bVQ.LJ(C962950bAL.LJ(enumC919170a1j2), i);
            }
        } else {
            C975500bUa c975500bUa = this.LL.LLJI;
            if (c975500bUa != null) {
                int i2 = this.LLILLJJLI;
                boolean z = this.LLILLL.element;
                C975680bUs c975680bUs = c975500bUa.LJFF;
                if (c975680bUs == null || (enumC964170bCJ = c975680bUs.LJIIJJI) == null) {
                    enumC964170bCJ = EnumC964170bCJ.NONE;
                }
                if (enumC964170bCJ.compareTo(EnumC964170bCJ.NONE) > 0) {
                    C975680bUs c975680bUs2 = c975500bUa.LJFF;
                    if (c975680bUs2 != null) {
                        c975680bUs2.f3(i2, z);
                    }
                } else {
                    InterfaceC975520bUc interfaceC975520bUc = c975500bUa.LJ;
                    if (interfaceC975520bUc != null) {
                        interfaceC975520bUc.f3(i2, z);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
