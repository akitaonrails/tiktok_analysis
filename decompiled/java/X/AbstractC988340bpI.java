package X;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0bpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC988340bpI implements InterfaceC1051190dSf {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final Context LL;
    public boolean LLILLJJLI;
    public Aweme LLILLL;
    public AbstractC1028360crq LLILZLL;
    public boolean LLIZLLLIL;
    public View LLJ;
    public String LLILZ = "unspecified_reason";
    public String LLILZIL = "";
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper());
    public EnumC2008907tv LLJI = EnumC2008907tv.STATUS_LOAD_LOADING;

    public abstract C1028380crs LIZIZ(Context context, Aweme aweme);

    public abstract C1051290dSp LIZJ(Context context, Aweme aweme);

    public abstract int LIZLLL();

    public abstract boolean LJFF();

    public abstract void LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ();

    public abstract boolean LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL(String str, boolean z);

    public abstract void LJIILIIL(DataCenter dataCenter);

    public abstract boolean LJIILJJIL(Aweme aweme);

    public final void LIZ() {
        if (this.LLILZLL == null) {
            Aweme aweme = this.LLILLL;
            if (aweme != null) {
                this.LLILZLL = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(LIZIZ(this.LL, aweme), LIZJ(this.LL, aweme));
            }
            C811103Ev.LIZ("IAdHybridBaseStyle");
        }
    }

    public final void LJ() {
        AbstractC1028360crq abstractC1028360crq = this.LLILZLL;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIIL();
        }
        LJIIIIZZ();
        this.LLILLJJLI = false;
        this.LLIZ.removeCallbacksAndMessages(null);
    }

    public AbstractC988340bpI(Context context) {
        this.LL = context;
    }

    @Override // X.InterfaceC1051190dSf
    public final void A9(C1014910cW9 c1014910cW9) {
        C811103Ev.LIZ("IAdHybridBaseStyle");
        this.LLIZLLLIL = true;
        this.LLJI = c1014910cW9.LIZIZ;
        this.LLJ = c1014910cW9.LIZ;
    }

    @Override // X.InterfaceC1051190dSf
    public final void k3(String str, String str2) {
        this.LLIZLLLIL = false;
        this.LLILZIL = str;
        C811103Ev.LIZ("IAdHybridBaseStyle");
    }
}
