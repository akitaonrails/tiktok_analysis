package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0a31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC919970a31 implements InterfaceC927510aFB {
    public final AbstractC919790a2j LIZ;
    public final C11NJ LIZIZ = new C11NJ();

    @Override // X.InterfaceC927510aFB
    public final void LIZ(PosIdentity posIdentity, boolean z, boolean z2, InterfaceC920110a3F interfaceC920110a3F) {
    }

    @Override // X.InterfaceC927510aFB
    @InterfaceC1294060jmO
    public void LJII(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC927510aFB
    public void LJIIJ(List<String> list) {
    }

    @Override // X.InterfaceC927510aFB
    public void LJIIJJI(InterfaceC920110a3F interfaceC920110a3F, String str) {
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIIIIZZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIIZ() {
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        abstractC919790a2j.LIZIZ = null;
        abstractC919790a2j.LIZLLL = null;
    }

    @Override // X.InterfaceC927510aFB
    public final void LJIIL() {
        final AbstractC919790a2j abstractC919790a2j = this.LIZ;
        abstractC919790a2j.getClass();
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean zLIZJ = C930540aK4.LIZJ();
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(zLIZJ)) {
            return;
        }
        abstractC919790a2j.LJIL(new InterfaceC919760a2g() { // from class: X.0a2f
            @Override // X.InterfaceC919760a2g
            public final void onFail() {
            }

            @Override // X.InterfaceC919760a2g
            public final void LIZ(C470590Icr<EnlargeScreenManageResponse.ResponseData> c470590Icr) {
                String str;
                String str2;
                C930480aJy.LIZ.getClass();
                if (c470590Icr.statusCode == 0) {
                    EnlargeScreenManageResponse.ResponseData responseData = c470590Icr.data;
                    String str3 = null;
                    if (responseData != null) {
                        str = responseData.enlargeLinkmicId;
                        str3 = responseData.enlargePosition;
                    } else {
                        str = null;
                    }
                    String str4 = "";
                    if (str != null) {
                        AbstractC919790a2j abstractC919790a2j2 = abstractC919790a2j;
                        if (responseData != null && (str2 = responseData.enlargeLinkmicId) != null) {
                            str4 = str2;
                        }
                        abstractC919790a2j2.LJJIII(str4, false);
                        return;
                    }
                    if (str3 != null) {
                        InterfaceC937900aVw interfaceC937900aVwLIZ = C920280a3W.LIZ();
                        if (interfaceC937900aVwLIZ == null) {
                            return;
                        }
                        abstractC919790a2j.LJJII(CastIntegerProtector.parseInt(str3), interfaceC937900aVwLIZ);
                        return;
                    }
                    abstractC919790a2j.LJJIII("", false);
                }
            }
        });
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILIIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // X.InterfaceC927510aFB
    public final Integer LJIILJJIL() {
        return this.LIZ.LJFF;
    }

    @Override // X.InterfaceC927510aFB
    public final String LJIILL() {
        this.LIZ.getClass();
        return AbstractC919790a2j.LJIILIIL();
    }

    @Override // X.InterfaceC927510aFB
    public final Layout LJIIZILJ() {
        return this.LIZ.LIZLLL;
    }

    @Override // X.InterfaceC927510aFB
    public void destroy() {
        this.LIZ.LJ();
        this.LIZIZ.dispose();
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJFF() {
        if (TextUtils.isEmpty(LJIILIIL())) {
            return false;
        }
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        String strLJIILIIL = LJIILIIL();
        if (strLJIILIIL == null) {
            strLJIILIIL = "";
        }
        return abstractC919790a2j.LJIIJJI(Boolean.FALSE, strLJIILIIL);
    }

    @Override // X.InterfaceC927510aFB
    public EnumC920250a3T LJIJJLI() {
        return LJIL(LJIILL());
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJJ() {
        if (TextUtils.isEmpty(LJIILIIL())) {
            return false;
        }
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        String strLJIILIIL = LJIILIIL();
        if (strLJIILIIL == null) {
            strLJIILIIL = "";
        }
        return !abstractC919790a2j.LJIIJJI(Boolean.FALSE, strLJIILIIL);
    }

    public AbstractC919970a31(AbstractC919790a2j abstractC919790a2j) {
        this.LIZ = abstractC919790a2j;
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LIZJ(String str) {
        if (!TextUtils.isEmpty(LJIILIIL()) && !Intrinsics.LJFF(str, LJIILIIL())) {
            AbstractC919790a2j abstractC919790a2j = this.LIZ;
            String strLJIILIIL = LJIILIIL();
            if (strLJIILIIL == null) {
                strLJIILIIL = "";
            }
            if (!abstractC919790a2j.LJIIJJI(Boolean.FALSE, strLJIILIIL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJ(String str) {
        if (C500260Jjc.LJJIIZ(this.LIZ.LJJIJIL()) && Intrinsics.LJFF(this.LIZ.LJJIJIL(), str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC927510aFB
    public final boolean LJIJJ(String str) {
        AbstractC919790a2j abstractC919790a2j = this.LIZ;
        if (str == null) {
            str = "";
        }
        return abstractC919790a2j.LJIIJJI(Boolean.FALSE, str);
    }

    @Override // X.InterfaceC927510aFB
    public EnumC920250a3T LJIL(String str) {
        this.LIZ.getClass();
        if (Intrinsics.LJFF(str, AbstractC919790a2j.LJIILIIL()) && Intrinsics.LJFF(str, this.LIZ.LJJIJIL())) {
            return EnumC920250a3T.CAN_ZOOM_TO_MIN;
        }
        return EnumC920250a3T.ZOOM_DISABLED;
    }

    @Override // X.InterfaceC927510aFB
    public void LIZLLL(String str, boolean z) {
        LJIJI(str, z);
    }

    @Override // X.InterfaceC927510aFB
    public void LJIJI(String str, boolean z) {
        this.LIZ.LJJIII(str, z);
    }
}
