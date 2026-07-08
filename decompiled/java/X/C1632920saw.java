package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0saw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632920saw extends AbstractC1632560saM<InfoStickerEffect, String, Unit> implements InterfaceC1632800sak {
    public final InterfaceC1632930sax LJIIJJI;
    public final Function0<InterfaceC1632790saj> LJIIL;

    @Override // X.AbstractC1632560saM
    public final Void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1632560saM
    public final String LJII(InfoStickerEffect infoStickerEffect) {
        return infoStickerEffect.getId();
    }

    public C1632920saw(C1633030sb7 c1633030sb7, AwS569S0100000_25 awS569S0100000_25) {
        super(3);
        this.LJIIJJI = c1633030sb7;
        this.LJIIL = awS569S0100000_25;
    }

    @Override // X.AbstractC1632560saM
    public final void LJFF(Object obj, final C1632710sab c1632710sab) {
        InfoStickerEffect infoStickerEffect = (InfoStickerEffect) obj;
        final String strLIZ = this.LJIIJJI.LIZ(infoStickerEffect);
        if (this.LJIIJJI.LIZIZ(infoStickerEffect)) {
            c1632710sab.LIZLLL(infoStickerEffect, strLIZ);
        } else {
            this.LJIIL.invoke().LIZIZ(infoStickerEffect, new InterfaceC1632620saS<InfoStickerEffect, String, Unit>() { // from class: X.0sag
                @Override // X.InterfaceC1632620saS
                public final void LIZJ(int i, Object obj2) {
                    c1632710sab.LIZJ(i, obj2);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZLLL(InfoStickerEffect infoStickerEffect2, String str) {
                    InterfaceC1632620saS<InfoStickerEffect, String, Unit> interfaceC1632620saS = c1632710sab;
                    if (str == null) {
                        str = strLIZ;
                    }
                    interfaceC1632620saS.LIZLLL(infoStickerEffect2, str);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZ(InfoStickerEffect infoStickerEffect2, String str, Unit unit, long j) {
                    String str2 = str;
                    InterfaceC1632620saS<InfoStickerEffect, String, Unit> interfaceC1632620saS = c1632710sab;
                    if (str2 == null) {
                        str2 = strLIZ;
                    }
                    interfaceC1632620saS.LIZ(infoStickerEffect2, str2, unit, j);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZIZ(InfoStickerEffect infoStickerEffect2, Exception exc, Unit unit, long j) {
                    c1632710sab.LIZIZ(infoStickerEffect2, exc, unit, j);
                }
            });
        }
    }
}
