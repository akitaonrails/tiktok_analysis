package X;

import com.tiktok.strategycenterengineimpl.action.IPSPActionCallBack;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1BkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213681BkU extends AbstractC2213871Bkn {
    public static final IPSPActionCallBack LIZJ = (IPSPActionCallBack) ((LinkedHashMap) C2190161Ane.LIZ).get(EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK);
    public AbstractC830880Wic LIZIZ;

    public C2213681BkU() {
        super(EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK);
        this.LIZIZ = null;
    }

    @Override // X.AbstractC2213871Bkn
    public final void LIZ(C830870Wib c830870Wib, C2213641BkQ c2213641BkQ) {
        IPSPActionCallBack iPSPActionCallBack = LIZJ;
        if (iPSPActionCallBack != null) {
            iPSPActionCallBack.execute(c830870Wib, c2213641BkQ, null);
            return;
        }
        AbstractC830880Wic abstractC830880Wic = this.LIZIZ;
        if (abstractC830880Wic != null) {
            abstractC830880Wic.LIZ(c2213641BkQ, c830870Wib);
        }
    }
}
