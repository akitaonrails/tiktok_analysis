package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0Svy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737240Svy implements InterfaceC730270Skj {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(357));
    public Function1<? super List<C730370Skt>, Unit> LIZIZ;

    public final C737280Sw2 LJFF() {
        return (C737280Sw2) this.LIZ.getValue();
    }

    @Override // X.InterfaceC730270Skj
    public final int LJ() {
        Integer value = LJFF().LIZIZ.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC730270Skj
    public final void LIZJ(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C737270Sw1(this, str, null), 3);
    }

    @Override // X.InterfaceC730270Skj
    public final void LIZLLL(Function1<? super List<C730370Skt>, Unit> function1) {
        this.LIZIZ = function1;
    }

    @Override // X.InterfaceC730270Skj
    public final void LIZ(Aweme aweme, AwS377S0200000_11 awS377S0200000_11) {
        List<InteractStickerStruct> interactStickerStructs;
        if (C0BWN.LIZ() && aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 108) {
                    if (interactStickerStruct != null) {
                        String aid = aweme.getAid();
                        if (aid == null) {
                            Function1<? super List<C730370Skt>, Unit> function1 = this.LIZIZ;
                            if (function1 != null) {
                                function1.invoke(new ArrayList());
                                return;
                            }
                            return;
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C737250Svz(aid, this, aweme, awS377S0200000_11, null), 3);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC730270Skj
    public final void LIZIZ(Aweme aweme, View view, String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C737260Sw0(aweme, this, str, view, null), 3);
    }
}
