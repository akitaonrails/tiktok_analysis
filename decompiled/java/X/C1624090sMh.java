package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624090sMh extends AbstractC1622390sJx {
    public final C1DHX LLILLJJLI;
    public final InterfaceC1624480sNK LLILLL;
    public final InterfaceC2254081DKk LLILZ;
    public final Function0<Cert> LLILZIL;
    public final Function0<Cert> LLILZLL;

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        this.LLILLJJLI.r4(this.LLILZLL.invoke());
        this.LLILZ.J0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIJ() {
        Effect effect;
        Effect effect2;
        C1624110sMj c1624110sMj = (C1624110sMj) this.LLILLL.LJII().LIZ().getValue();
        Boolean bool = null;
        if (c1624110sMj != null) {
            effect = c1624110sMj.LIZ;
            effect2 = c1624110sMj.LIZIZ;
        } else {
            effect = null;
            effect2 = null;
        }
        if (C1624200sMs.LJIIJJI(effect) == C1624200sMs.LJIIJJI(effect2)) {
            if (!Intrinsics.LJFF(effect != null ? effect.getEffectId() : null, effect2 != null ? effect2.getEffectId() : null)) {
                return;
            }
        }
        C1DHX c1dhx = this.LLILLJJLI;
        List<String> tags = effect2.getTags();
        if (tags.contains("camera_front")) {
            bool = Boolean.TRUE;
        } else if (tags.contains("camera_back")) {
            bool = Boolean.FALSE;
        }
        c1dhx.F4(true, bool, this.LLILZIL.invoke());
        this.LLILZ.J0(false);
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        return C1624200sMs.LJIIJJI(c1627370sRz.LIZ);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        if (this.LLILLJJLI.M3() == 0) {
            this.LLILLJJLI.m4(new InterfaceC2253331DHn() { // from class: X.0sMi
                @Override // X.InterfaceC2253331DHn
                public final void LIZIZ(int i) {
                    this.LIZ.LJJIIJ();
                    this.LIZ.LLILLJJLI.t4(this);
                }

                @Override // X.InterfaceC2253331DHn
                public final void LIZ(int i, int i2, String str) {
                    this.LIZ.LLILLJJLI.t4(this);
                }
            });
        } else {
            LJJIIJ();
        }
    }

    public C1624090sMh(C1DHX c1dhx, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC2254081DKk interfaceC2254081DKk, AFwS214S0000000_25 aFwS214S0000000_25, AFwS214S0000000_25 aFwS214S0000000_252) {
        this.LLILLJJLI = c1dhx;
        this.LLILLL = interfaceC1624480sNK;
        this.LLILZ = interfaceC2254081DKk;
        this.LLILZIL = aFwS214S0000000_25;
        this.LLILZLL = aFwS214S0000000_252;
    }
}
