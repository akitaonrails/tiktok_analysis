package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183681AdC extends AbstractC1585810rMx implements InterfaceC791210V1z, C0V22 {
    public final SessionInfo LL;
    public final RecyclerView LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC497601wk LLILZ;
    public final Function1<Map<String, String>, Unit> LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;
    public final Queue<C2183701AdE> LLIZLLLIL;
    public final Map<String, String> LLJ;

    public static List LJJIJIIJIL(RecyclerView recyclerView) {
        String str;
        int iIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0) {
                Object tag = childAt.getTag(R.id.k_u);
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                Object tag2 = childAt.getTag(R.id.k_t);
                if ((tag2 instanceof Integer) && (num = (Integer) tag2) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Object tag3 = childAt.getTag(R.id.k_q);
                if ((tag3 instanceof Boolean) && (bool3 = (Boolean) tag3) != null) {
                    zBooleanValue = bool3.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Object tag4 = childAt.getTag(R.id.k_s);
                if ((tag4 instanceof Boolean) && (bool2 = (Boolean) tag4) != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                Object tag5 = childAt.getTag(R.id.k_r);
                if ((tag5 instanceof Boolean) && (bool = (Boolean) tag5) != null) {
                    zBooleanValue3 = bool.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                Object tag6 = childAt.getTag(R.id.k_v);
                if ((tag6 instanceof String) && (str2 = (String) tag6) != null) {
                    str3 = str2;
                }
                c13dvLIZIZ.add(new C2183721AdG(iIntValue, str, str3, zBooleanValue, zBooleanValue2, zBooleanValue3));
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    @Override // X.C0V22
    public final void LIZIZ(double d) {
        LJJIL(new C2183691AdD(d, this));
    }

    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(JSONObject jSONObject) {
        LJJIL(new AwS399S0200000_33(jSONObject, this, 28));
    }

    public final void LJJIL(Function1<? super C2183701AdE, Unit> function1) {
        Unit unit;
        try {
            C2183701AdE c2183701AdE = (C2183701AdE) ((LinkedList) this.LLIZLLLIL).peek();
            if (c2183701AdE != null) {
                function1.invoke(c2183701AdE);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C2183681AdC(SessionInfo sessionInfo, RecyclerView recyclerView) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message-list");
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(556);
        this.LL = sessionInfo;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = strLIZIZ;
        this.LLILZ = c054gLIZ;
        this.LLILZIL = aFwS229S0000000_2;
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3800));
        this.LLIZLLLIL = new LinkedList();
        this.LLJ = new LinkedHashMap();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.LLILZLL) {
                this.LLILZLL = false;
                LJJIL(AFwS279S0000000_33.get$arr$(295));
                ((C0V2A) this.LLIZ.getValue()).LJI();
                return;
            }
            return;
        }
        if (AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) >= C2276251E7r.LIZJ || this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        C314640CVa.LIZ(this.LLILLL);
        ((C0V2A) this.LLIZ.getValue()).LJFF();
        ((LinkedList) this.LLIZLLLIL).offer(new C2183701AdE(System.currentTimeMillis(), LJJIJIIJIL(recyclerView)));
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (this.LLILZLL) {
            LJJIL(new AwS612S0100000_33(LJJIJIIJIL(recyclerView), (List<C2183721AdG>) 129));
        }
    }
}
