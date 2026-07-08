package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067180dsS extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C1067100dsK());

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS560S0100000_16(this, 689), null, null, null, null, 30);
    }

    public final JSONObject LJJIJIIJI() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strOptString = interfaceC1392640mLO.requestId().optString("request_id");
        if (strOptString == null) {
            strOptString = "";
        }
        String strLIZJ = C735370Ssx.LIZJ(LJIIZILJ());
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(strOptString);
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
        Aweme awemeLJIIZILJ = LJIIZILJ();
        c736480Suk.LIZ("author_id", awemeLJIIZILJ != null ? AwemeExtKt.getAuthorUid(awemeLJIIZILJ) : null);
        c736480Suk.LIZ("group_id", strLIZJ);
        c736480Suk.LIZ("impr_type", C735370Ssx.LJI(LJIIZILJ()));
        String strLJIJJLI = LJIJJLI();
        c736480Suk.LIZ("enter_from", strLJIJJLI != null ? strLJIJJLI : "");
        return c736480Suk.LIZIZ();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067180dsS();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.WIKIPEDIA.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        Type type;
        Integer status;
        ArrayList arrayList = new ArrayList();
        String string = "";
        boolean z = false;
        String warningMsg = "";
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String extra = anchorCommonStruct2.getExtra();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(WikipediaExtra.class));
                } else {
                    type = new TypeToken<WikipediaExtra>() { // from class: X.0dsT
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, extra, type);
                if (!(objFromJson instanceof WikipediaExtra)) {
                    objFromJson = null;
                }
                WikipediaExtra wikipediaExtra = (WikipediaExtra) objFromJson;
                if (wikipediaExtra != null) {
                    Integer status2 = wikipediaExtra.getStatus();
                    if (status2 != null && status2.intValue() == 2 && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(LJIIZILJ()), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        String id = anchorCommonStruct2.getId();
                        Keva keva = (Keva) this.LLJ.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(id);
                        sbLIZ.append('@');
                        sbLIZ.append(LJIIZILJ().getAid());
                        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                            String id2 = anchorCommonStruct2.getId();
                            Keva keva2 = (Keva) this.LLJ.getValue();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(id2);
                            sbLIZ2.append('@');
                            sbLIZ2.append(LJIIZILJ().getAid());
                            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                            warningMsg = wikipediaExtra.getWarningMsg();
                            z = true;
                        }
                    }
                    if (anchorCommonStruct2.getType() == type() && ((status = wikipediaExtra.getStatus()) == null || status.intValue() != 2)) {
                        arrayList.add(anchorCommonStruct);
                    }
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (z) {
            Aweme awemeLJIIZILJ = LJIIZILJ();
            if (TextUtils.isEmpty(warningMsg)) {
                C844470XAv.LIZ.getClass();
                string = C844470XAv.LIZ().getString(2131858542);
            } else if (warningMsg != null) {
                string = warningMsg;
            }
            AwemeBizExtKt.setAnchorWikiOfflineText(awemeLJIIZILJ, string);
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            AbstractC1066890drz.LJIILLIIL(c2344009Gk, LJJIJIIJI());
            LJJIIJZLJL(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        LJJIJ(new AwS382S0200000_16(this, c2344009Gk, 63));
    }
}
