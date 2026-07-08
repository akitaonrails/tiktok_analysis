package X;

import Y.AObjectS245S0100000_22;
import android.app.Activity;
import com.bytedance.als.LiveEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457350o1l extends AbstractC2255721DQs<InterfaceC1417120mys> implements InterfaceC1417120mys, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C560530Lyd<Boolean> LLILZ = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(120));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457350o1l.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457350o1l.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1457350o1l.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1457350o1l.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public InterfaceC1417120mys W1() {
        return this;
    }

    private final IMusicEditService G2() {
        return (IMusicEditService) this.LLIZ.getValue();
    }

    private final InterfaceC377540ErA o2() {
        return (InterfaceC377540ErA) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final InterfaceC1460000o62 Z1() {
        return (InterfaceC1460000o62) this.LLILZLL.getValue(this, LLIZLLLIL[3]);
    }

    @Override // X.InterfaceC1417120mys
    public void oC() {
        this.LLILZ.LJIIJ(Boolean.TRUE);
    }

    public final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC377540ErA interfaceC377540ErAO2;
        LiveEvent<Unit> liveEventWz;
        C19EG c19eg;
        boolean zLJI = MethodIDManager.LJI(71971);
        super.onCreate();
        boolean z = !C1416310mxZ.LJJJJIZL(w2());
        boolean z2 = !w2().getEditorProModel().getFromEditorProEntranceInAlbum();
        boolean z3 = !w2().creativeModel.pugcTemplateData.isFromCreateTemplate;
        if (G2().LIZLLL() == null) {
            Activity activityLJII = C1664590tQ1.LJII(this);
            if ((activityLJII instanceof C19EG) && (c19eg = (C19EG) activityLJII) != null) {
                G2().LIZ(c19eg, w2(), new AwS566S0100000_22(this, 247)).LJ = Boolean.valueOf(!C363750ENx.LIZLLL(C0CHQ.LIZ().getAccountService().getCurrentUserID()));
            }
        }
        C1459930o5v c1459930o5vLIZLLL = G2().LIZLLL();
        if (c1459930o5vLIZLLL != null) {
            c1459930o5vLIZLLL.LIZIZ(new C1457380o1o(this, z, z2, z3));
        }
        if (!z && (interfaceC377540ErAO2 = o2()) != null && (liveEventWz = interfaceC377540ErAO2.Wz()) != null) {
            liveEventWz.LIZ(this, new AObjectS245S0100000_22(this, 44));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1417120mys
    public LiveEvent<Boolean> dw2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1457350o1l(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1417120mys
    public void lx1(boolean z) {
        this.LLILZ.LJIIJ(Boolean.valueOf(z));
    }
}
