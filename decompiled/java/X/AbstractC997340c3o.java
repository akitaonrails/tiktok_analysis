package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC997340c3o implements InterfaceC998100c52<InterfaceC997350c3p>, InterfaceC1051190dSf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public AbstractC1028360crq LLILLL;
    public boolean LLILZ;
    public View LLILZIL;
    public final C997320c3m LL = new C997320c3m(AFwS252S0000000_16.get$arr$(681));
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(682));
    public String LLILZLL = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC997340c3o.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC997340c3o.class, "container", "getContainer()Landroid/view/ViewGroup;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public abstract C1028380crs LIZIZ(Context context, Aweme aweme);

    public abstract C1051290dSp LIZJ(Context context, Aweme aweme);

    public abstract String LJ();

    public final ViewGroup LIZLLL() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (ViewGroup) c997320c3m.LIZ(this);
    }

    public final AbstractC996990c3F LIZ() {
        int iLIZ = C997400c3u.LIZ(LJ());
        return (iLIZ == 1 && this.LLILZ) ? C997020c3I.LIZIZ : !this.LLILZ ? new C997010c3H(this.LLILZLL) : new C997000c3G(iLIZ);
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        IAdHybridContainerManager iAdHybridContainerManager = (IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class);
        Context context = LIZLLL().getContext();
        C997320c3m c997320c3m = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        AbstractC1028360crq abstractC1028360crqLIZLLL = iAdHybridContainerManager.LIZLLL(LIZIZ(context, (Aweme) c997320c3m.LIZ(this)), LIZJ(LIZLLL().getContext(), (Aweme) this.LL.LIZ(this)));
        this.LLILLL = abstractC1028360crqLIZLLL;
        if (abstractC1028360crqLIZLLL == null) {
            abstractC1028360crqLIZLLL = null;
        }
        abstractC1028360crqLIZLLL.LJJ(LIZJ(LIZLLL().getContext(), (Aweme) this.LL.LIZ(this)), this, null);
    }

    @Override // X.InterfaceC1051190dSf
    public final void A9(C1014910cW9 c1014910cW9) {
        ViewParent parent;
        this.LLILZ = true;
        View view = c1014910cW9.LIZ;
        this.LLILZIL = view;
        ViewGroup viewGroup = null;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != LIZLLL()) {
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(this.LLILZIL, viewGroup);
            }
            C786410Ut5.LJJJJI(LIZLLL());
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, -1));
            }
            LIZLLL().addView(this.LLILZIL);
        }
    }

    @Override // X.InterfaceC998100c52
    public final void LLLIIL(int i) {
        C997370c3r.LIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void XV1(int i) {
        C997370c3r.LIZIZ(this, i);
    }

    @Override // X.InterfaceC998100c52
    public final void m61(float f) {
        ViewGroup viewGroupLJIJI = ((InterfaceC997360c3q) Mh()).LJIJI();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroupLJIJI);
        viewGroupLJIJI.setRotation(f);
    }

    @Override // X.InterfaceC998100c52
    public final void setBackgroundColor(int i) {
        ((InterfaceC997360c3q) Mh()).LJIJI().setBackgroundColor(i);
    }

    @Override // X.InterfaceC998100c52
    public final void setVisibility(int i) {
        C997370c3r.LIZJ(this, 0);
    }

    public final void LJFF(String str, Pair<String, ? extends Object>... pairArr) {
        boolean z;
        JSONObject jSONObject;
        try {
            if (pairArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC1028360crq abstractC1028360crq = null;
            if (z) {
                jSONObject = null;
            } else {
                jSONObject = new JSONObject();
                C089E c089e = new C089E(pairArr);
                while (c089e.hasNext()) {
                    Pair pair = (Pair) c089e.next();
                    jSONObject.put((String) pair.getFirst(), pair.getSecond());
                }
            }
            AbstractC1028360crq abstractC1028360crq2 = this.LLILLL;
            if (abstractC1028360crq2 != null) {
                abstractC1028360crq = abstractC1028360crq2;
            }
            abstractC1028360crq.LJIIJJI(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1051190dSf
    public final void k3(String str, String str2) {
        this.LLILZ = false;
        this.LLILZLL = str2;
    }
}
