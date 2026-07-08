package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS569S0100000_25;
import mn3.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624790sNp implements InterfaceC1626180sQ4 {
    public final C19EG LIZ;
    public final InterfaceC1650230t2r LIZIZ;
    public final InterfaceC1648570t0B LIZJ;
    public final C1DRG LIZLLL;
    public Effect LJIIIIZZ;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 21));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(215));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(11));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 22));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 24));
    public final MutableLiveData<Integer> LJIIJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJIIJJI = new MutableLiveData<>();

    @Override // X.InterfaceC1626180sQ4
    public final void LIZIZ() {
        ((C1624800sNq) this.LJIIIZ.getValue()).LIZ(16385, 10L, 0L, null);
    }

    @Override // X.InterfaceC1626180sQ4
    public final MutableLiveData LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1626180sQ4
    public final void LIZLLL(Effect effect) {
        this.LJIIIIZZ = effect;
    }

    @Override // X.InterfaceC1626180sQ4
    public final void LIZJ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_url", str);
        jSONObject.put("invitee_name", str2);
        ((C1624800sNq) this.LJIIIZ.getValue()).LIZ(16385, 6L, 0L, C786410Ut5.J3(jSONObject));
    }

    public C1624790sNp(C19GS c19gs, e0 e0Var, InterfaceC1648570t0B interfaceC1648570t0B, C1DRG c1drg) {
        this.LIZ = c19gs;
        this.LIZIZ = e0Var;
        this.LIZJ = interfaceC1648570t0B;
        this.LIZLLL = c1drg;
    }

    @Override // X.InterfaceC1626180sQ4
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C1624800sNq c1624800sNq = (C1624800sNq) this.LJIIIZ.getValue();
        long j = i;
        long j2 = i2;
        long j3 = i3;
        if (c1624800sNq.LIZJ.invoke().booleanValue()) {
            for (AbstractC1396270mRF abstractC1396270mRF : (List) c1624800sNq.LIZLLL.getValue()) {
                abstractC1396270mRF.getClass();
                long j4 = 16385;
                if (j4 == -1 || j4 == j) {
                    long jLIZ = abstractC1396270mRF.LIZ();
                    if (jLIZ == -1 || jLIZ == j2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[Effect --> Client]: msgID(");
                        sbLIZ.append(j);
                        sbLIZ.append("), arg1(");
                        sbLIZ.append(j2);
                        sbLIZ.append("), arg2(");
                        sbLIZ.append(j3);
                        sbLIZ.append("), arg3(");
                        sbLIZ.append(str);
                        sbLIZ.append("), match handler=");
                        sbLIZ.append(abstractC1396270mRF.getClass().getSimpleName());
                        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
                        abstractC1396270mRF.LIZIZ((int) j, j3, str);
                    }
                }
            }
        }
    }
}
