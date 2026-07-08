package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822770xX9 extends AbstractC1822720xX4 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public InterfaceC495470Jbt LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJII;
    public final C1822790xXB[] LIZIZ = {new C1822790xXB("PCSForm2Page", 1012, 0), new C1822790xXB("PCSForm2Page", 1012, 0)};
    public final C1822790xXB LIZJ = new C1822790xXB("PCSForm2ResultPage", 1012, 0);
    public Map<String, String> LJI = C2097608Jq.LJ();

    public final void LIZ() {
        int i = this.LJII;
        if (i == 1) {
            C1822790xXB c1822790xXB = this.LIZIZ[0];
            if (c1822790xXB.LIZLLL != 0) {
                c1822790xXB.LIZJ(this.LJI);
                return;
            }
        }
        this.LIZIZ[i].LIZJ(this.LJI);
    }

    public final void LIZJ(C1822330xWR c1822330xWR) {
        String str;
        if (c1822330xWR == null || (str = c1822330xWR.LL) == null) {
            str = "";
        }
        InterfaceC495470Jbt interfaceC495470Jbt = this.LIZLLL;
        if (interfaceC495470Jbt != null) {
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Bc1(interfaceC495470Jbt);
        }
        this.LIZLLL = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).yj0(new C1822760xX8(this, str));
    }

    public final void LIZIZ(String str, boolean z, boolean z2, int i, C1822330xWR c1822330xWR) {
        String str2;
        boolean z3;
        Object obj;
        Object obj2;
        if (c1822330xWR != null) {
            str2 = c1822330xWR.LL;
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        int iHashCode = 0;
        if (c1822330xWR != null) {
            z3 = c1822330xWR.LLILZ;
        } else {
            z3 = false;
        }
        Pair[] pairArr = new Pair[5];
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_single_sku", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_cache", obj2);
        if (str != null) {
            str3 = str;
        }
        pairArr[2] = new Pair("schema", str3);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_anchor", str4);
        pairArr[4] = new Pair("is_service_plus_revamp", CardStruct.IStatusCode.DEFAULT);
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        this.LJI = mapLJIIIIZZ;
        if (i == 1) {
            if (this.LJFF) {
                this.LIZJ.LIZJ(mapLJIIIIZZ);
            } else {
                LIZ();
            }
        }
        this.LJ = str;
        this.LJII = i;
        if (z) {
            return;
        }
        C1822790xXB c1822790xXB = this.LIZIZ[i];
        if (str != null) {
            iHashCode = str.hashCode();
        }
        c1822790xXB.LIZLLL(iHashCode, str2, this.LJI);
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).canOpen(str)) {
            this.LIZIZ[i].LIZIZ(1001, str, this.LJI);
        }
    }
}
