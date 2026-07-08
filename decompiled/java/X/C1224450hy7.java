package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224450hy7 {
    public static InterfaceC1224420hy4 LIZIZ(String str) {
        InterfaceC1224420hy4 interfaceC1224420hy4 = (InterfaceC1224420hy4) ((LinkedHashMap) AbsContactSelectorFragment.LLJILJIL).get(str);
        if (interfaceC1224420hy4 == null) {
            return new InterfaceC1224420hy4() { // from class: X.0hy8
                public final C1224650hyR LIZ = new C1224650hyR();
                public InterfaceC1226510i1R LIZIZ;

                {
                    new Object() { // from class: X.0hy9
                    };
                }

                @Override // X.InterfaceC1224420hy4
                public final InterfaceC1224270hxp getProtocol() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1224420hy4
                public final void LIZ(InterfaceC1226510i1R interfaceC1226510i1R) {
                    this.LIZIZ = interfaceC1226510i1R;
                }
            };
        }
        return interfaceC1224420hy4;
    }

    public static void LIZ(boolean z, AbsContactSelectorFragment absContactSelectorFragment, C19EG c19eg, AbstractC343940De4 abstractC343940De4, Integer num) {
        if (!z) {
            if (absContactSelectorFragment != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(absContactSelectorFragment, abstractC343940De4);
                return;
            }
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (c19eg == null) {
                return;
            } else {
                C2204961BRm.LLJJJ(c19eg, iIntValue, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baShbtHN0zySrf45VYJsYKArxOuSyOwkU3rspZruYpFfBP76T+sv9jo4Zh9cOnKMegnpcw==", null));
            }
        } else if (c19eg == null) {
            return;
        }
        c19eg.finish();
    }
}
