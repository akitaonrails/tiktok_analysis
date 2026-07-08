package X;

import Y.ARunnableS110S0100000_10;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648750PcX implements InterfaceC648720PcU {
    public static final /* synthetic */ int LJII = 0;
    public final C647830Pb3 LIZ;
    public RecyclerView LIZIZ;
    public boolean LIZLLL;
    public int LJ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1296));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1295));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1294));

    @Override // X.InterfaceC648720PcU
    public final void LIZ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZIZ(C588600N6s c588600N6s) {
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZJ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void LIZLLL(int i, InterfaceC648120PbW interfaceC648120PbW) {
    }

    @Override // X.InterfaceC648720PcU
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648720PcU
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648720PcU
    public final void LJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isActive", "1");
        C648850Pch c648850Pch = this.LIZ.LJIILL;
        if (c648850Pch != null) {
            c648850Pch.LIZ("updateAutoPlayStatus", jSONObject);
        }
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC648720PcU
    public final void LJFF() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isActive", CardStruct.IStatusCode.DEFAULT);
        C648850Pch c648850Pch = this.LIZ.LJIILL;
        if (c648850Pch != null) {
            c648850Pch.LIZ("updateAutoPlayStatus", jSONObject);
        }
        this.LIZLLL = false;
    }

    @Override // X.InterfaceC648720PcU
    public final Boolean isActive() {
        return Boolean.valueOf(this.LIZLLL);
    }

    public C648750PcX(C647830Pb3 c647830Pb3) {
        this.LIZ = c647830Pb3;
    }

    @Override // X.InterfaceC648720PcU
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", C436190H8n.LIZ(aweme));
        C648850Pch c648850Pch = this.LIZ.LJIILL;
        if (c648850Pch != null) {
            c648850Pch.LIZ("locateVideoByAid", jSONObject);
        }
        c0pbw.LIZIZ();
    }

    @Override // X.InterfaceC648720PcU
    public final void LJI(RecyclerView recyclerView, InterfaceC653000PjO interfaceC653000PjO, int i, boolean z) {
        this.LIZIZ = recyclerView;
        recyclerView.removeOnScrollListener((AbstractC1585810rMx) this.LJFF.getValue());
        recyclerView.addOnScrollListener((AbstractC1585810rMx) this.LJFF.getValue());
        recyclerView.removeOnAttachStateChangeListener((C0R45) this.LJI.getValue());
        recyclerView.addOnAttachStateChangeListener((C0R45) this.LJI.getValue());
        HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 184));
    }
}
