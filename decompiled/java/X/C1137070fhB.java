package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137070fhB implements InterfaceC1137230fhR {
    @Override // X.InterfaceC1137230fhR
    public final boolean LIZIZ(boolean z, boolean z2) {
        return (z || z2) ? false : true;
    }

    @Override // X.InterfaceC1137230fhR
    public final boolean LIZ(DataChannel dataChannel) {
        C1131800fYg.LIZ.getClass();
        if (!C1131800fYg.LIZIZ && !C1131800fYg.LIZ(dataChannel)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1137230fhR
    public final boolean LIZLLL(DataChannel dataChannel) {
        C1131800fYg.LIZ.getClass();
        return C1131800fYg.LIZ(dataChannel);
    }

    @Override // X.InterfaceC1137230fhR
    public final boolean LIZJ(C1135810ff9 c1135810ff9, DataChannel dataChannel) {
        GiftMessage giftMessage;
        if (!C1132700fa8.LJIIIIZZ(c1135810ff9) && !C1132700fa8.LJIILL(c1135810ff9) && !C1132700fa8.LJIILIIL(c1135810ff9) && !C1132700fa8.LJIIJ(c1135810ff9, dataChannel)) {
            if (c1135810ff9 != null) {
                giftMessage = c1135810ff9.LIZ;
            } else {
                giftMessage = null;
            }
            if (!C1132700fa8.LIZLLL(giftMessage)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1137230fhR
    public final List<EnumC1137110fhF> LJI(C1135810ff9 c1135810ff9, DataChannel dataChannel) {
        if (C1132700fa8.LJIIIIZZ(c1135810ff9) && C1132700fa8.LJIIJ(c1135810ff9, dataChannel)) {
            return C1697810uHb.LJIIJJI(EnumC1137110fhF.FIRST_GIFT, EnumC1137110fhF.FOR_YOU);
        }
        if (C1132700fa8.LJIIIIZZ(c1135810ff9)) {
            return Collections.singletonList(EnumC1137110fhF.FIRST_GIFT);
        }
        if (C1132700fa8.LJIILIIL(c1135810ff9) && C1132700fa8.LJIILL(c1135810ff9)) {
            return Collections.singletonList(EnumC1137110fhF.SPONSORED_VAULT);
        }
        if (C1132700fa8.LJIILL(c1135810ff9)) {
            return Collections.singletonList(EnumC1137110fhF.VAULT);
        }
        if (C1132700fa8.LJIILIIL(c1135810ff9)) {
            return Collections.singletonList(EnumC1137110fhF.SPONSORED);
        }
        if (C1132700fa8.LIZLLL(c1135810ff9.LIZ)) {
            return Collections.singletonList(EnumC1137110fhF.DYNAMIC_TAG);
        }
        if (C1132700fa8.LJIIJ(c1135810ff9, dataChannel)) {
            return Collections.singletonList(EnumC1137110fhF.FOR_YOU);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1137230fhR
    public final EnumC1137180fhM LJ(C1135810ff9 c1135810ff9, C1137100fhE c1137100fhE, boolean z) {
        if (!LIZJ(c1135810ff9, c1137100fhE.LIZIZ)) {
            return EnumC1137180fhM.NONE;
        }
        C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
        EnumC1136790fgj enumC1136790fgj = c1137100fhE.LIZLLL;
        c1137540fhw.getClass();
        if (C1137540fhw.LIZ(enumC1136790fgj) && C1132700fa8.LJIIIIZZ(c1135810ff9) && C1132700fa8.LJIIJ(c1135810ff9, c1137100fhE.LIZIZ)) {
            return EnumC1137180fhM.SMALL_TRAY_NEED_ANIM;
        }
        if (C1137540fhw.LIZ(c1137100fhE.LIZLLL)) {
            return EnumC1137180fhM.SMALL_TRAY_NO_ANIM;
        }
        DataChannel dataChannel = c1137100fhE.LIZIZ;
        C1131800fYg.LIZ.getClass();
        if (LIZIZ(z, C1131800fYg.LIZ(dataChannel))) {
            return EnumC1137180fhM.NORMAL_TRAY_WITH_ANIM;
        }
        return EnumC1137180fhM.NORMAL_TRAY_NO_ANIM;
    }

    @Override // X.InterfaceC1137230fhR
    public final boolean LJFF(C1135810ff9 c1135810ff9, int i, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (C1132700fa8.LJIILIIL(c1135810ff9) && !C1132700fa8.LJIIIIZZ(c1135810ff9) && i >= 1 && z && !Intrinsics.LJFF(charSequence, charSequence2)) {
            return true;
        }
        return false;
    }
}
