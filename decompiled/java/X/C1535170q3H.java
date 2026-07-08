package X;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveSubResourceMemoryCacheSettingSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0q3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535170q3H implements InterfaceC1535230q3N {
    public static final C1535170q3H LIZIZ = new C1535170q3H();

    @Override // X.InterfaceC1535230q3N
    public final void LIZ() {
    }

    @Override // X.InterfaceC1535230q3N
    public final void LIZJ(C1533490q0Z c1533490q0Z) {
        String str;
        InterfaceC1535370q3b interfaceC1535370q3b;
        String strLIZ;
        if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            return;
        }
        Object obj = c1533490q0Z.LJFF.get("rl_container_uuid");
        if ((obj instanceof String) && (str = (String) obj) != null) {
            C1537480q70.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529830puf.LIZIZ(str);
            if (c1537480q70LIZIZ == null || (interfaceC1535370q3b = (InterfaceC1535370q3b) c1537480q70LIZIZ.LJFF(InterfaceC1535370q3b.class)) == null || (strLIZ = interfaceC1535370q3b.LIZ()) == null || !LiveSubResourceMemoryCacheSettingSetting.INSTANCE.inAllowList(strLIZ)) {
                return;
            }
            c1533490q0Z.LJIIZILJ = Boolean.TRUE;
        }
    }
}
