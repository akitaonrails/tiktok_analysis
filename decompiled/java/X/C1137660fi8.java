package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0fi8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137660fi8 implements InterfaceC1140810fnD, InterfaceC1141520foM, InterfaceC769900UIa {
    public static final C1137660fi8 LL = new C1137660fi8();
    public static WeakReference<InterfaceC1137650fi7> LLILLJJLI;

    @Override // X.InterfaceC1140810fnD
    public final C1137660fi8 LIZJ() {
        return this;
    }

    public static final InterfaceC1268640j7O LJ() {
        InterfaceC1137650fi7 interfaceC1137650fi7;
        WeakReference<InterfaceC1137650fi7> weakReference = LLILLJJLI;
        if (weakReference == null || (interfaceC1137650fi7 = weakReference.get()) == null) {
            return null;
        }
        return interfaceC1137650fi7.getFilterManager();
    }

    public static void LIZLLL(String str) {
        String str2;
        WeakReference<InterfaceC1137650fi7> weakReference = LLILLJJLI;
        if (weakReference == null || weakReference.get() == null) {
            if (C1135800ff8.LJJII()) {
                str2 = "_anchor";
            } else {
                str2 = "_guest";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            C1136500fgG.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null, 14);
        }
    }

    @Override // X.InterfaceC1141520foM
    public final void LIZ(LiveEffect liveEffect) {
        InterfaceC1137650fi7 interfaceC1137650fi7;
        LIZLLL("finishPlayStickerGift");
        WeakReference<InterfaceC1137650fi7> weakReference = LLILLJJLI;
        if (weakReference != null && (interfaceC1137650fi7 = weakReference.get()) != null) {
            interfaceC1137650fi7.LIZ(liveEffect);
        }
    }

    @Override // X.InterfaceC1141520foM
    public final void LIZIZ(LiveEffect liveEffect) {
        InterfaceC1137650fi7 interfaceC1137650fi7;
        LIZLLL("startPlayStickerGift");
        WeakReference<InterfaceC1137650fi7> weakReference = LLILLJJLI;
        if (weakReference != null && (interfaceC1137650fi7 = weakReference.get()) != null) {
            interfaceC1137650fi7.LIZIZ(liveEffect);
        }
    }

    @Override // X.InterfaceC769900UIa
    public final void LJJIJIIJI(String str) {
        C1140890fnL.LIZJ();
        InterfaceC1137750fiH interfaceC1137750fiH = (InterfaceC1137750fiH) C2043807zY.LIZ(InterfaceC1137750fiH.class);
        if (interfaceC1137750fiH != null) {
            interfaceC1137750fiH.LJJIJIIJI(str);
        }
    }

    @Override // X.C0UHE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C1140890fnL.LIZJ();
        InterfaceC1137750fiH interfaceC1137750fiH = (InterfaceC1137750fiH) C2043807zY.LIZ(InterfaceC1137750fiH.class);
        if (interfaceC1137750fiH != null) {
            interfaceC1137750fiH.onMessageReceived(i, i2, i3, str);
        }
    }
}
