package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.CommercialCustomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0eTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090030eTJ implements InterfaceC1111870f2X, InterfaceC1113750f5Z {
    public final CommercialCustomMessage LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        throw null;
    }

    @Override // X.InterfaceC1109570eyp
    public final C234900vT LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC1109570eyp
    public final void LJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1113750f5Z
    public final Integer LJJZ() {
        throw null;
    }

    @Override // X.InterfaceC1113750f5Z
    public final ImageModel LJLLLLLL() {
        throw null;
    }

    @Override // X.InterfaceC1109570eyp
    public final void onAttach() {
    }

    @Override // X.InterfaceC1111870f2X
    public final long getMessageId() {
        return this.LIZ.customMessageId;
    }

    public static String LIZ(Text text) {
        if (text != null) {
            String str = text.defaultPattern;
            String str2 = text.key;
            if (str2 != null && str2.length() != 0) {
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                String str3 = text.key;
                c1124870fNVLIZJ.getClass();
                String strLIZIZ = C1124870fNV.LIZIZ(str3);
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    return strLIZIZ;
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public C1090030eTJ(CommercialCustomMessage commercialCustomMessage, String str, String str2, String str3) {
        this.LIZ = commercialCustomMessage;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
