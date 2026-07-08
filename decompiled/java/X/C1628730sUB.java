package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.navi.DynamicSelectorHandler;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628730sUB extends l0 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f214k0;
    public final InterfaceC1731706qJ g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final InterfaceC1731706qJ f215h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C01GW f216i0;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628730sUB.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1628730sUB.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        j0 = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        f214k0 = 8;
    }

    private final InterfaceC1650930t3z Cp() {
        return (InterfaceC1650930t3z) this.f216i0.getValue();
    }

    private final C1631190sY9 zg() {
        return (C1631190sY9) this.f215h0.getValue(this, j0[1]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.g0.getValue(this, j0[0]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public Function0<Boolean> ie() {
        return new AwS569S0100000_25(this, 395);
    }

    private final InterfaceC1630630sXF Cg() {
        return getRecordAdapterApi().NV().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public InterfaceC1628590sTx Ba() {
        return getRecordAdapterApi().NL1().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Ee() {
        InterfaceC1648020szI interfaceC1648020szILIZJ = getRecordAdapterApi().VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.setTabSwitchEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Je() {
        super.Je();
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        a aVarLIZJ = recordAdapterApi.pi2().LIZJ();
        if (aVarLIZJ != null) {
            aVarLIZJ.eP2(false);
        }
        InterfaceC1648020szI interfaceC1648020szILIZJ = recordAdapterApi.VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.showBottomTab(false);
        }
        InterfaceC1630630sXF interfaceC1630630sXFLIZJ = recordAdapterApi.NV().LIZJ();
        if (interfaceC1630630sXFLIZJ != null) {
            interfaceC1630630sXFLIZJ.W9(false);
        }
        C0MGL c0mglLIZJ = recordAdapterApi.Vt2().LIZJ();
        if (c0mglLIZJ != null) {
            c0mglLIZJ.GN2(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Re() {
        super.Re();
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        a aVarLIZJ = recordAdapterApi.pi2().LIZJ();
        if (aVarLIZJ != null) {
            aVarLIZJ.eP2(true);
        }
        InterfaceC1648020szI interfaceC1648020szILIZJ = recordAdapterApi.VK0().LIZJ();
        if (interfaceC1648020szILIZJ != null) {
            interfaceC1648020szILIZJ.showBottomTab(true);
        }
        InterfaceC1630630sXF interfaceC1630630sXFLIZJ = recordAdapterApi.NV().LIZJ();
        if (interfaceC1630630sXFLIZJ != null) {
            interfaceC1630630sXFLIZJ.W9(true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public InterfaceC1652470t6T oc() {
        return getRecordAdapterApi().O80().LIZJ();
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public boolean ug() {
        return super.ug() && !C539900LFk.LJIIIIZZ(getShortVideoContext());
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0, X.AbstractC1622910sKn
    public void G2(InterfaceC1621520sIY interfaceC1621520sIY) {
        super.G2(interfaceC1621520sIY);
        C1623490sLj c1623490sLj = C1623490sLj.LIZ;
        if (C539900LFk.LJIIIIZZ(getShortVideoContext())) {
            interfaceC1621520sIY.LIZ(c1623490sLj);
        }
        interfaceC1621520sIY.LIZ(new AbstractC23051091l() { // from class: X.0sLk
            @Override // X.AbstractC23051091l
            public final boolean LIZ(Effect effect, String str) {
                return C1449600npG.LJIIIIZZ(effect);
            }
        });
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Te(boolean z) {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            if (C1631200sYA.LIZ(zg())) {
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS265S0000000_25(14));
                return;
            }
            InterfaceC1630630sXF interfaceC1630630sXFCg = Cg();
            if (interfaceC1630630sXFCg == null) {
                return;
            }
            interfaceC1630630sXFCg.Y60(false);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0
    public void Ve(String str) {
        super.Ve(str);
        InterfaceC1650930t3z interfaceC1650930t3zCp = Cp();
        if (interfaceC1650930t3zCp != null) {
            interfaceC1650930t3zCp.uC(str);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.l0, X.AbstractC1622910sKn
    public void T2(FrameLayout frameLayout, InterfaceC1622330sJr interfaceC1622330sJr) {
        super.T2(frameLayout, interfaceC1622330sJr);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C111U(this.LLILLJJLI, getCameraApiComponent().St2(), (InterfaceC1635390sev) getDiContainer().LJII(InterfaceC1635390sev.class, null), getShortVideoContext(), new AwS569S0100000_25(this, 394), this));
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.f;
        if (uploadPicStickerARPresenter != null) {
            listLJIILJJIL.add(uploadPicStickerARPresenter);
        }
        sk(new DynamicSelectorHandler(this.LLILLJJLI, listLJIILJJIL));
    }

    public C1628730sUB(C1DRG c1drg, InterfaceC1621070sHp interfaceC1621070sHp, C1621430sIP c1621430sIP, Function1<? super C1622920sKo, Unit> function1) {
        super(c1drg, interfaceC1621070sHp, c1621430sIP, function1);
        this.g0 = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.f215h0 = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.f216i0 = C452501pT.LIZIZ(new AwS569S0100000_25(this, 396));
        C19GS c19gs = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        da();
        new C1624310sN3(c1drg, c19gs, this, shortVideoContext, this);
    }
}
