package X;

import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634130sct extends AbstractC1634120scs<String, Unit> implements InterfaceC1632790saj {
    public C1634130sct(final Function0<? extends InterfaceC1635390sev> function0) {
        new InterfaceC1632640saU<InfoStickerEffect, RESULT, INFO>(function0) { // from class: X.0scs
            public final Function0<InterfaceC1635390sev> LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = function0;
            }

            @Override // X.InterfaceC1632640saU
            public final void LIZIZ(InfoStickerEffect infoStickerEffect, InterfaceC1632620saS interfaceC1632620saS) {
                InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
                this.LIZ.invoke().LJIL(new C1634110scr((C1632760sag) interfaceC1632620saS, infoStickerEffect2, this), infoStickerEffect2);
            }
        };
    }
}
