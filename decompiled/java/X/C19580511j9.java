package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.AwS573S0100000_29;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11j9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19580511j9 extends AbstractC1066890drz {
    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS573S0100000_29(this, 851), null, new AwS573S0100000_29(this, 852), null, null, 26);
    }

    public final String LJJIJIIJI() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String strValueOf = "";
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (!(extra == null || extra.length() == 0)) {
                try {
                    AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null);
                    if (!jSONObject.has("add_from")) {
                        return "";
                    }
                    strValueOf = String.valueOf(jSONObject.optInt("add_from"));
                    return strValueOf;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return strValueOf;
    }

    public final String LJJIJIIJIL() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null) {
            return "";
        }
        String extra = anchorCommonStruct.getExtra();
        if (extra == null || extra.length() == 0) {
            return "";
        }
        try {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            return new JSONObject(anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null).optString("donation_url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String LJJIJIL() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null) {
            return "";
        }
        try {
            return anchorCommonStruct.getKeyword();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String LJJIJL() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null) {
            return "";
        }
        String extra = anchorCommonStruct.getExtra();
        if (extra == null || extra.length() == 0) {
            return "";
        }
        try {
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            String strOptString = new JSONObject(anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null).optString("organization_type");
            return C504670Jqj.LIZIZ(strOptString) ? "TILTIFY" : strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C19580511j9();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.DONATION_STICKER.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String strLJJIJIL = LJJIJIL();
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("ngo_name", strLJJIJIL);
        c2344009Gk.LJIIIIZZ("powered_by", LJJIJL());
        c2344009Gk.LJIIIIZZ("link", LJJIJIIJIL());
        c2344009Gk.LJFF("add_from", LJJIJIIJI());
        super.p1(c2344009Gk);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc  */
    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(android.view.View r14, X.C2344009Gk r15) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580511j9.LJJJLL(android.view.View, X.09Gk):void");
    }
}
