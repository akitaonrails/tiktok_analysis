package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS411S0200000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC655570PnX extends RecyclerView.ViewHolder implements InterfaceC655600Pna, InterfaceC645410PTf {
    public final InterfaceC641090PCp LL;
    public final C652990PjN LLILLJJLI;
    public final InterfaceC652950PjJ LLILLL;
    public final C01GW LLILZ;
    public final C655590PnZ LLILZIL;
    public final C01GW LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;

    public abstract ImageView I5();

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC655620Pnc
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    public abstract C661470Px3 N5();

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public InterfaceC655600Pna L5() {
        return (InterfaceC655600Pna) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC655600Pna
    public final C661490Px5 I1() {
        return L5().I1();
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLJJJ() {
        L5().LLJJJ();
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLLLLILLIL() {
        L5().LLLLLILLIL();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return L5().isPlaying();
    }

    @Override // X.InterfaceC655620Pnc
    public final void onDestroy() {
        L5().onDestroy();
    }

    @InterfaceC1294060jmO
    public View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC655600Pna
    public final C655670Pnh u() {
        return L5().u();
    }

    public void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC645410PTf
    public final void LLLJIL(String str) {
        this.LLIZLLLIL = str;
    }

    @Override // X.InterfaceC655620Pnc
    public final void u4(long j) {
        L5().u4(j);
    }

    public void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0PnZ] */
    public AbstractC655570PnX(View view, InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, InterfaceC652950PjJ interfaceC652950PjJ) {
        super(view);
        this.LL = interfaceC641090PCp;
        this.LLILLJJLI = c652990PjN;
        this.LLILLL = interfaceC652950PjJ;
        this.LLILZ = C452501pT.LIZIZ(new AwS411S0200000_10(this, view, 118));
        this.LLILZIL = new InterfaceC658750Psf() { // from class: X.0PnZ
            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
            }
        };
        this.LLILZLL = C452501pT.LIZIZ(new AwS411S0200000_10(this, view, 117));
        view.setOutlineProvider(new C663220Pzs(view.getResources().getDimensionPixelOffset(R.dimen.aeq)));
        view.setClipToOutline(true);
    }
}
