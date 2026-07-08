package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348170Dkt implements InterfaceC348530DlT {
    public final INLEMediaSession LIZ;
    public final Function2<AbstractC348060Dki, Boolean, Unit> LIZIZ;
    public C348240Dl0 LIZJ;
    public final C01GW LIZLLL;

    @Override // X.InterfaceC348530DlT
    public final InterfaceC348500DlQ LIZ() {
        return (InterfaceC348500DlQ) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC348530DlT
    public final C348240Dl0 LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC348530DlT
    public final void LJ(C347130DjD c347130DjD) {
        this.LIZIZ.invoke(new C347110DjB(c347130DjD), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    @Override // X.InterfaceC347190DjJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.bytedance.ies.nle.editor_jni.NLEModel r13) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C348170Dkt.LJIIJJI(com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }

    @Override // X.InterfaceC347190DjJ
    public final void LJJIJLIJ(NLEEditor nLEEditor) {
        LJIIJJI(nLEEditor.getModel());
    }

    public C348170Dkt(INLEMediaSession iNLEMediaSession, AwS619S0100000_5 awS619S0100000_5) {
        this.LIZ = iNLEMediaSession;
        this.LIZIZ = awS619S0100000_5;
        new C348240Dl0(EnumC356010DxX.BEAUTY);
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1090));
    }

    @Override // X.InterfaceC348530DlT
    public final void LJIJ(C348240Dl0 c348240Dl0, boolean z, boolean z2) {
        if (c348240Dl0 == null) {
            final C348240Dl0 c348240Dl02 = this.LIZJ;
            if (c348240Dl02 != null) {
                this.LIZIZ.invoke(new AbstractC348060Dki(c348240Dl02) { // from class: X.0Dku
                    public final C348240Dl0 LIZIZ;

                    {
                        this.LIZIZ = c348240Dl02;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(" 0.init ");
                        sbLIZ.append(c348240Dl02);
                        LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.AbstractC348060Dki
                    public final void LIZJ(NLEEditor nLEEditor) {
                        NLETrack next;
                        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(C348350DlB.LJII(next), this.LIZIZ.LIZ.name())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrack nLETrack = next;
                        if (nLETrack != null) {
                            nLEEditor.getModel().removeTrack(nLETrack);
                        }
                    }
                }, Boolean.valueOf(z));
                this.LIZJ = null;
                return;
            }
            return;
        }
        this.LIZIZ.invoke(new C348220Dky(c348240Dl0, z2), Boolean.valueOf(z));
        if (c348240Dl0.LIZ != EnumC356010DxX.COLOR) {
            return;
        }
        this.LIZJ = c348240Dl0;
    }
}
