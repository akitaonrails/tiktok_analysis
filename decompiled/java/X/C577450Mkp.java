package X;

import Y.AObjectS241S0100000_8;
import Y.AfS144S0200000_8;
import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import ge.i;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS96S0110000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577450Mkp extends i<InterfaceC577060MkC, C577530Mkx, C577460Mkq, C577470Mkr> implements InterfaceC577060MkC, InterfaceC379610EuV {
    public static final C577490Mkt LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final ShortVideoContext LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C11NJ LLJJIJIL;
    public final MutableLiveData<Boolean> LLJJJ;
    public final ConcurrentHashSet<EnumC577200MkQ> LLJJJIL;
    public boolean LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Mkt] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C577450Mkp.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C577450Mkp.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C577450Mkp.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0), new C2217381BqS(C577450Mkp.class, "layoutMobComponent", "getLayoutMobComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutMobApiComponent;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0Mkt
        };
        LLJJL = 8;
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJIII.getValue(this, LLJJJJLIIL[1]);
    }

    public final InterfaceC576910Mjx F4() {
        return (InterfaceC576910Mjx) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[3]);
    }

    public final InterfaceC576770Mjj H4() {
        return (InterfaceC576770Mjj) this.LLJJIJI.getValue(this, LLJJJJLIIL[2]);
    }

    public final void LIZLLL() {
        C0CNO.LIZLLL(200L, new AwS552S0100000_8(this, 735));
        i3(AFwS239S0000000_8.get$arr$(215));
        this.LLJJJ.setValue(Boolean.FALSE);
    }

    public final InterfaceC1651080t4E getToolbarApi() {
        return (InterfaceC1651080t4E) this.LLJJ.getValue(this, LLJJJJLIIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C577460Mkq> o2() {
        return AFwS194S0000000_8.get$arr$(312);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C577470Mkr> w2() {
        return new AwS552S0100000_8(this, 736);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            this.LLJJIJIL.LIZ(C576730Mjf.LJIILIIL(H4().r6(), this).LJJJJZI(new AkS472S0100000_8(this, 11)).LJJIFFI().LJJLJLI(new AfS144S0200000_8(this, toolbarApi, 5)));
        }
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS241S0100000_8(this, 69));
        this.LLJJIJIL.LIZ(C576730Mjf.LJIILIIL(H4().r6(), this).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Mk4
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Boolean.valueOf(!(obj instanceof C579250Mnj));
            }
        }).LJJIFFI().LJJLJLI(new AfS177S0100000_8(this, 65)));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIJIL.dispose();
    }

    public MutableLiveData<Boolean> K4() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC577060MkC
    public /* bridge */ /* synthetic */ LiveData V5() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    private final void O4(View view) {
        InterfaceC1651490t4t interfaceC1651490t4tKY1;
        show();
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null && (interfaceC1651490t4tKY1 = toolbarApi.KY1()) != null) {
            interfaceC1651490t4tKY1.LJI(C577560Ml0.LIZ, Boolean.TRUE);
        }
        i3(new AwS96S0110000_8(view, !H4().isEnabled(), 14));
        this.LLJJJ.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC577060MkC
    public void In(View view) {
        LayoutApplyFrom layoutApplyFrom;
        if (!this.LLJJJJ) {
            C576730Mjf.LJIIJ("CameraLayoutToolbarComponent", "onToolbarClicked but the common UI is invisible");
            return;
        }
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null) {
            toolbarApi.LT1(false);
        }
        InterfaceC1651080t4E toolbarApi2 = getToolbarApi();
        if (toolbarApi2 != null) {
            toolbarApi2.JH(false);
        }
        if (Intrinsics.LJFF(this.LLJJJ.getValue(), Boolean.TRUE)) {
            LIZLLL();
        } else {
            O4(view);
        }
        C0L5G c0l5g = C0L5G.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJI;
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        String str = null;
        if (cameraLayoutModel != null) {
            layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
            str = cameraLayoutModel.layoutMode;
        } else {
            layoutApplyFrom = null;
        }
        c0l5g.getClass();
        C0L5G.LJFF(shortVideoContext, layoutApplyFrom, str, true);
    }

    @Override // X.InterfaceC577060MkC
    public void Jm2(EnumC577200MkQ enumC577200MkQ) {
        InterfaceC1651490t4t interfaceC1651490t4tKY1;
        this.LLJJJIL.add(enumC577200MkQ);
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi != null && (interfaceC1651490t4tKY1 = toolbarApi.KY1()) != null) {
            C1651030t49.LIZ(interfaceC1651490t4tKY1, EnumC1651770t5L.LAYOUT, false);
        }
    }

    @Override // X.InterfaceC577060MkC
    public void eK0(AbstractC577050MkB abstractC577050MkB) {
        String str;
        i3(new AwS587S0100000_8(abstractC577050MkB, 469));
        ShortVideoContext shortVideoContext = this.LLJJI;
        if (shortVideoContext.shootMode == 0) {
            C1631530sYh c1631530sYh = C1631530sYh.LIZ;
            String defaultShootTabTag = C0CHQ.LIZ().LJJJJJ().getDefaultShootTabTag(this.LLJJI);
            c1631530sYh.getClass();
            shortVideoContext.shootMode = C1631530sYh.LIZIZ(defaultShootTabTag);
        }
        C0L5G c0l5g = C0L5G.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJI;
        if (shortVideoContext2.mIsFromDraft) {
            str = "draft";
        } else {
            str = "anchor";
        }
        String strLIZLLL = abstractC577050MkB.LIZLLL();
        c0l5g.getClass();
        C0L5G.LJ(shortVideoContext2, null, str, null, strLIZLLL);
    }

    @Override // X.InterfaceC577060MkC
    public void fv(View view) {
        String str;
        LayoutApplyFrom layoutApplyFrom;
        Iterator<EnumC577200MkQ> it2 = this.LLJJJIL.iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            Integer hintTextRes = it2.next().getHintTextRes();
            if (hintTextRes != null) {
                int iIntValue = hintTextRes.intValue();
                Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getResources().getString(iIntValue));
                creativeToastBuilder.duration(1000L);
                C1390380mHk.LIZJ(contextLJIIIZ, 8012, creativeToastBuilder);
                break;
            }
        }
        C0L5G c0l5g = C0L5G.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJI;
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null) {
            layoutApplyFrom = cameraLayoutModel.layoutApplyFrom;
            str = cameraLayoutModel.layoutMode;
        } else {
            layoutApplyFrom = null;
        }
        c0l5g.getClass();
        C0L5G.LJFF(shortVideoContext, layoutApplyFrom, str, false);
    }

    @Override // X.InterfaceC577060MkC
    public void kK(EnumC577200MkQ enumC577200MkQ) {
        InterfaceC1651080t4E toolbarApi;
        InterfaceC1651490t4t interfaceC1651490t4tKY1;
        this.LLJJJIL.remove(enumC577200MkQ);
        if (this.LLJJJIL.isEmpty() && (toolbarApi = getToolbarApi()) != null && (interfaceC1651490t4tKY1 = toolbarApi.KY1()) != null) {
            C1651030t49.LIZ(interfaceC1651490t4tKY1, EnumC1651770t5L.LAYOUT, true);
        }
    }

    public C577450Mkp(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
        this.LLJJI = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576910Mjx.class, null);
        this.LLJJIJIL = new C11NJ();
        this.LLJJJ = new MutableLiveData<>(Boolean.FALSE);
        this.LLJJJIL = new ConcurrentHashSet<>();
        this.LLJJJJ = true;
    }

    public final void P4(InterfaceC1651490t4t interfaceC1651490t4t, boolean z, AbstractC577050MkB abstractC577050MkB) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayout, isLayoutEnabled: ");
        sbLIZ.append(z);
        sbLIZ.append(", currentLayoutType: ");
        sbLIZ.append(abstractC577050MkB);
        C576730Mjf.LJIIIZ("CameraLayoutToolbarComponent", C2188811AlT.LIZIZ(sbLIZ));
        interfaceC1651490t4t.LJ(EnumC1651770t5L.LAYOUT, new AwS96S0110000_8(abstractC577050MkB, z, 15));
        interfaceC1651490t4t.LIZ(new AwS96S0110000_8(z, this, 16));
    }
}
