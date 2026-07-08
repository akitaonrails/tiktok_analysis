package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389000FNa implements C114C {
    public final /* synthetic */ C194431114z LIZ;

    @Override // X.C114C
    public final void onBind() {
    }

    public C389000FNa(C194431114z c194431114z) {
        this.LIZ = c194431114z;
    }

    @Override // X.C114C
    public final void LIZ(Pair<Integer, Integer> pair, C114D c114d) {
        this.LIZ.u6(pair, c114d, false, false, false);
    }

    @Override // X.C114C
    public final void LIZIZ(int i, C114D c114d) {
        ArrayList<C114D> arrayList;
        String textStr;
        if (i == 0) {
            this.LIZ.LLLFFI = true;
        }
        C194431114z c194431114z = this.LIZ;
        if (c194431114z.LLLFF) {
            if (i == 0) {
                c194431114z.LLLFF = false;
                TextStickerModel textStickerModelT4 = c194431114z.T4();
                if (textStickerModelT4 != null) {
                    textStr = textStickerModelT4.getTextStr();
                } else {
                    textStr = null;
                }
                if (C123100dR.LIZ(textStr)) {
                    this.LIZ.u6(new Pair<>(0, 0), c114d, false, false, true);
                } else {
                    this.LIZ.u6(new Pair<>(0, 0), c114d, true, false, true);
                }
            } else {
                return;
            }
        } else if (i != 0) {
            return;
        }
        C194431114z c194431114z2 = this.LIZ;
        AnonymousClass1150 anonymousClass1150 = c194431114z2.LLJJI;
        if (anonymousClass1150 != null && anonymousClass1150.LIZLLL && (arrayList = c194431114z2.LLJJJJJIL.LIZJ.get(0)) != null) {
            C194431114z c194431114z3 = this.LIZ;
            int i2 = 0;
            for (C114D c114d2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (Intrinsics.LJFF(c114d2.LIZ.getEffectId(), c194431114z3.LLJJJJJIL.LIZ)) {
                        c194431114z3.LLLF = new Pair<>(0, Integer.valueOf(i2));
                        c194431114z3.i3(new AwS20S0001000_5(i2, 3));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
