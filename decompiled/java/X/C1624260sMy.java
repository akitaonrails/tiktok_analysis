package X;

import Y.AComparatorS44S0000000_25;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624260sMy implements InterfaceC1622080sJS, InterfaceC1159800gHq {
    public C1627370sRz LL;
    public final List<InterfaceC1624270sMz> LLILLJJLI = new ArrayList();
    public final C2252321DDq LLILLL = C1BNE.LIZ(Boolean.FALSE);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(216));

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    public final void LIZIZ() {
        Iterator<InterfaceC1624270sMz> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public final void LIZ(InterfaceC1624270sMz interfaceC1624270sMz) {
        if (!((ArrayList) this.LLILLJJLI).contains(interfaceC1624270sMz)) {
            ((ArrayList) this.LLILLJJLI).add(interfaceC1624270sMz);
        }
        ArrayList arrayList = (ArrayList) this.LLILLJJLI;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS44S0000000_25(0));
        }
    }

    public final void LIZJ(C1627370sRz c1627370sRz) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("fix_designer_info_flicker_on_panel_reopen", true) || c1627370sRz != this.LL) {
            LIZIZ();
        }
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext() && !((InterfaceC1624270sMz) it2.next()).LIZJ(c1627370sRz)) {
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        C1627370sRz c1627370sRz;
        if (enumC1155090gAF == EnumC1155090gAF.BEFORE_ANIMATE) {
            for (InterfaceC1624270sMz interfaceC1624270sMz : (ArrayList) this.LLILLJJLI) {
                if (interfaceC1624270sMz instanceof ViewOnClickListenerC1638020sjA) {
                    ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = (ViewOnClickListenerC1638020sjA) interfaceC1624270sMz;
                    if (viewOnClickListenerC1638020sjA.LLLII) {
                        viewOnClickListenerC1638020sjA.LLJ.LJIIIZ();
                    }
                }
            }
        }
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE) {
            this.LLILLL.setValue(Boolean.TRUE);
            if (((Boolean) this.LLILZ.getValue()).booleanValue() && (c1627370sRz = this.LL) != null) {
                LIZJ(c1627370sRz);
            }
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        C1627370sRz c1627370sRz;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1624270sMz) it2.next()).LIZIZ(view);
        }
        if (!((Boolean) this.LLILZ.getValue()).booleanValue() && (c1627370sRz = this.LL) != null) {
            LIZJ(c1627370sRz);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        if (enumC1155090gAF == EnumC1155090gAF.AFTER_ANIMATE) {
            this.LLILLL.setValue(Boolean.FALSE);
            for (InterfaceC1624270sMz interfaceC1624270sMz : (ArrayList) this.LLILLJJLI) {
                if (interfaceC1624270sMz instanceof ViewOnClickListenerC1638020sjA) {
                    ViewOnClickListenerC1638020sjA viewOnClickListenerC1638020sjA = (ViewOnClickListenerC1638020sjA) interfaceC1624270sMz;
                    if (viewOnClickListenerC1638020sjA.LLLII) {
                        viewOnClickListenerC1638020sjA.LLJ.LIZLLL();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            if (!((Boolean) this.LLILZ.getValue()).booleanValue() || ((Boolean) this.LLILLL.getValue()).booleanValue()) {
                LIZJ((C1627370sRz) abstractC1627380sS0);
            }
            this.LL = (C1627370sRz) abstractC1627380sS0;
            return c1623370sLXLIZ;
        }
        this.LL = null;
        LIZIZ();
        return c1623370sLXLIZ;
    }
}
