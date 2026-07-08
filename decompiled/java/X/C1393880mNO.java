package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393880mNO implements InterfaceC1066840dru {
    public Aweme LIZ;
    public AnchorCommonStruct LIZIZ;
    public String LIZJ;

    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        return R.raw.icon_effect_fill;
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LIZIZ;
        return (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) ? "" : keyword;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getResources().getString(2131835941);
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1393880mNO c1393880mNO = new C1393880mNO();
        c1393880mNO.LIZJ = this.LIZJ;
        c1393880mNO.LIZ = this.LIZ;
        c1393880mNO.LIZIZ = this.LIZIZ;
        return c1393880mNO;
    }

    public static Fragment LJIIJ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZ = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
        return C343710Ddh.LIZ(activityLIZ instanceof C19EG ? (C19EG) activityLIZ : null).BQ2();
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0166, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    @Override // X.InterfaceC1066840dru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C2344009Gk r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393880mNO.LIZJ(X.09Gk):void");
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZJ, this.LIZ, c2344009Gk);
    }

    public static final C2344009Gk LJIIIZ(C2344009Gk c2344009Gk, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next, "");
            if (C703302op.LIZ(strOptString)) {
                c2344009Gk.LJFF(next, strOptString);
            }
        }
        return c2344009Gk;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJIIJJI(java.lang.String r12, X.C736480Suk r13) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393880mNO.LJIIJJI(java.lang.String, X.0Suk):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[EDGE_INSN: B:61:0x008a->B:40:0x008a BREAK  A[LOOP:1: B:34:0x006e->B:63:?]] */
    @Override // X.InterfaceC1066840dru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r6, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393880mNO.LJFF(int, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):boolean");
    }
}
