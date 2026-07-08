package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* JADX INFO: renamed from: X.0fnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141110fnh implements InterfaceC1137750fiH {
    public static final C1141110fnh LL = new C1141110fnh();
    public static final ConcurrentHashSet<C1141180fno> LLILLJJLI = new ConcurrentHashSet<>();

    @Override // X.InterfaceC1137750fiH
    public final void LJJIJIIJI(String str) {
        for (C1141180fno c1141180fno : LLILLJJLI) {
            if (c1141180fno.LL.get() != null) {
                c1141180fno.LJJIJIIJI(str);
            }
        }
    }

    @Override // X.InterfaceC1137750fiH
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        InterfaceC1141550foP interfaceC1141550foP;
        InterfaceC1141550foP interfaceC1141550foP2;
        if (i == 57) {
            if (i2 == 2) {
                if (str == null) {
                    C1AF0.LJFF(new C1140990fnV(), "EffectSDK event msg; extra is null");
                    return;
                }
                C1140900fnM c1140900fnM = C1140960fnS.LIZ;
                if (c1140900fnM == null || (interfaceC1141550foP2 = c1140900fnM.LJIIJ) == null) {
                    return;
                }
                interfaceC1141550foP2.LIZ(str);
                return;
            }
            if (i2 == 11) {
                C1140900fnM c1140900fnM2 = C1140960fnS.LIZ;
                if (c1140900fnM2 == null || (interfaceC1141550foP = c1140900fnM2.LJIIJ) == null) {
                    return;
                }
                interfaceC1141550foP.LIZIZ(str);
                return;
            }
        }
        for (C1141180fno c1141180fno : LLILLJJLI) {
            if (c1141180fno.LL.get() != null) {
                c1141180fno.onMessageReceived(i, i2, i3, str);
            }
        }
    }
}
