package X;

import Y.ACListenerS156S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS109S0100000_9;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.TemplateSchemaData;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425770nCp extends AbstractC2255721DQs<InterfaceC1425510nCP> implements InterfaceC1425510nCP, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C19A3 LL;
    public final C21580119ct LLILLJJLI;
    public final C1DRG LLILLL;
    public final EditorTabViewModel LLILZ;
    public View LLJJI;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public h0<Integer> LLILZLL = new h0<>(0);
    public final C560530Lyd<Unit> LLIZ = new C560530Lyd<>();
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJIJIL = new MutableLiveData<>(Boolean.TRUE);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0MGL.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC569720MWc.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public boolean LLJJIII = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1425770nCp.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1425770nCp.class, "recordExitComponent", "getRecordExitComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1425770nCp.class, "lightRecordExitApi", "getLightRecordExitApi()Lcom/ss/android/ugc/gamora/recorder/exit/LightRecordExitApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1425770nCp.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public InterfaceC1425510nCP X1() {
        return this;
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLJILJIL.getValue(this, LLJJJ[0]);
    }

    private final C0MGL c3() {
        return (C0MGL) this.LLJILJILJ.getValue(this, LLJJJ[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJ.getValue(this, LLJJJ[3]);
    }

    private final void m3() {
        View viewFindViewById = this.LL.findViewById(R.id.gu4);
        this.LLJJI = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 5), viewFindViewById);
        }
        this.LLJIJIL.observe(this, new AObserverS225S0100000_22(this, 14));
        C21580119ct c21580119ct = this.LLILLJJLI;
        if (c21580119ct != null) {
            ((ArrayList) c21580119ct.LL).add(new InterfaceC21580219cu() { // from class: X.0nCq
                @Override // X.InterfaceC21580219cu
                public final void LJI() {
                }

                @Override // X.InterfaceC21580219cu
                public final void b3() {
                }

                @Override // X.InterfaceC21580219cu
                public final void c3() {
                }

                @Override // X.InterfaceC21580219cu
                public final void d3(int i) {
                }

                @Override // X.InterfaceC21580219cu
                public final void a3(int i) {
                    String creationId;
                    String str;
                    CreativeModel creativeModel;
                    LandingModel landingModel;
                    C1425770nCp c1425770nCp = this.LIZ;
                    if (!c1425770nCp.LLJJIJIL) {
                        C0MWG c0mwg = C0MWG.LIZ;
                        ShortVideoContext shortVideoContext = c1425770nCp.LLILZ.LLILZIL;
                        c0mwg.getClass();
                        C0LAB c0lab = new C0LAB();
                        CreativeModel creativeModel2 = null;
                        if (shortVideoContext != null) {
                            creationId = shortVideoContext.getCreationId();
                        } else {
                            creationId = null;
                        }
                        c0lab.LJ("creation_id", creationId);
                        if (shortVideoContext != null) {
                            str = shortVideoContext.shootWay;
                        } else {
                            str = null;
                        }
                        c0lab.LJ("shoot_way", str);
                        c0lab.LJ("enter_from", "shoot_page_edit_tab");
                        if (shortVideoContext != null) {
                            creativeModel2 = shortVideoContext.creativeModel;
                        }
                        C0MJO.LIZIZ(creativeModel2, c0lab);
                        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (landingModel = creativeModel.landingModel) != null && landingModel.defaultLandingCreateTab) {
                            c0lab.LJ("createtab_landing_type", "default");
                        }
                        C20684815ws.LJIILLIIL("slide_on_editor_tab", c0lab.LIZ);
                        this.LIZ.LLJJIJIL = true;
                    }
                    Boolean boolI3 = this.LIZ.i3();
                    if (this.LIZ.LLJJIII) {
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.LJFF(boolI3, bool) && !Intrinsics.LJFF(this.LIZ.LLJ.getValue(), bool)) {
                            this.LIZ.LLJ.setValue(bool);
                        } else {
                            Boolean bool2 = Boolean.FALSE;
                            if (Intrinsics.LJFF(boolI3, bool2) && !Intrinsics.LJFF(this.LIZ.LLJ.getValue(), bool2)) {
                                this.LIZ.LLJ.setValue(bool2);
                            }
                        }
                    }
                    if (!this.LIZ.LLILLJJLI.canScrollVertically(1)) {
                        C1425770nCp c1425770nCp2 = this.LIZ;
                        if (c1425770nCp2.LLJJIII) {
                            View view = c1425770nCp2.LLJJI;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                                view.animate().alpha(1.0f).setDuration(250L).setInterpolator(C1619980sG4.LIZLLL()).start();
                            }
                            MutableLiveData<Boolean> mutableLiveData = this.LIZ.LLJ;
                            Boolean bool3 = Boolean.TRUE;
                            mutableLiveData.setValue(bool3);
                            this.LIZ.LLJI.setValue(bool3);
                        }
                        this.LIZ.LLJJIII = false;
                        return;
                    }
                    C1425770nCp c1425770nCp3 = this.LIZ;
                    if (c1425770nCp3.LLJJIII) {
                        return;
                    }
                    View view2 = c1425770nCp3.LLJJI;
                    if (view2 != null) {
                        view2.animate().alpha(0.0f).setDuration(250L).setInterpolator(C1619980sG4.LIZLLL()).withEndAction(new ARunnableS109S0100000_9(view2, 36)).start();
                    }
                    this.LIZ.LLJI.setValue(Boolean.FALSE);
                    this.LIZ.LLJJIII = true;
                }
            });
        }
    }

    private final InterfaceC569720MWc w2() {
        return (InterfaceC569720MWc) this.LLJILLL.getValue(this, LLJJJ[2]);
    }

    public final void LJJJJLI() {
        this.LLIZ.LJIIJ(Unit.LIZ);
        C21580119ct c21580119ct = this.LLILLJJLI;
        if (c21580119ct != null) {
            c21580119ct.smoothScrollTo(0, 0);
        }
    }

    @Override // X.InterfaceC1425510nCP
    public void O7() {
        this.LLILZIL.setValue(Boolean.FALSE);
    }

    @Override // X.InterfaceC1425510nCP
    public void cc() {
        this.LLILZIL.setValue(Boolean.TRUE);
    }

    public final Boolean i3() {
        C21580119ct c21580119ct;
        if (!this.LLJJIJIIJIL || (c21580119ct = this.LLILLJJLI) == null) {
            return null;
        }
        return Boolean.valueOf(this.LLJJIJI <= ((float) c21580119ct.computeVerticalScrollOffset()));
    }

    @Override // X.InterfaceC1425510nCP
    public void vz0() {
        C21580119ct c21580119ct = this.LLILLJJLI;
        int iMax = c21580119ct != null ? Math.max(0, c21580119ct.getChildAt(0).getHeight() - c21580119ct.getHeight()) : 0;
        C21580119ct c21580119ct2 = this.LLILLJJLI;
        if (c21580119ct2 != null) {
            c21580119ct2.scrollTo(0, iMax);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        m3();
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveData EI0() {
        return this.LLJ;
    }

    public C560530Lyd<Unit> G2() {
        return this.LLIZ;
    }

    public MutableLiveData<Boolean> H2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ C385670FAf LLJJJJLIIL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveData P31() {
        return this.LLJI;
    }

    public MutableLiveData<Boolean> T2() {
        return this.LLILZIL;
    }

    public MutableLiveData<Boolean> W1() {
        return this.LLIZLLLIL;
    }

    public MutableLiveData<Boolean> W2() {
        return this.LLJ;
    }

    public h0<Integer> Z1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveData ns2() {
        return this.LLIZLLLIL;
    }

    public MutableLiveData<Boolean> o2() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveData vO2() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveEvent zL2() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1425510nCP
    public /* bridge */ /* synthetic */ LiveData zT() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1425510nCP
    public void AT1(boolean z) {
        this.LLIZLLLIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1425510nCP
    public void LLLIIL(int i) {
        this.LLILZLL.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1425510nCP
    public void Ra1(float f) {
        this.LLJJIJI = f;
        boolean z = true;
        this.LLJJIJIIJIL = true;
        if (this.LLILLJJLI != null) {
            MutableLiveData<Boolean> mutableLiveData = this.LLJ;
            if (f > r0.computeVerticalScrollOffset()) {
                z = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1425510nCP
    public void Ts0(String str) {
        String str2;
        CreativeModel creativeModel;
        TemplateSchemaData templateSchemaData;
        String strLIZ = C1428460nHA.LIZ(Op());
        if (strLIZ != null) {
            ShortVideoContext shortVideoContext = this.LLILZ.LLILZIL;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (templateSchemaData = creativeModel.templateSchemaData) != null) {
                str2 = templateSchemaData.templateBackCamera;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "1")) {
                Op().setCurrentTab(strLIZ, true, 0, true);
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C539900LFk.LJII(getShortVideoContext())) {
            InterfaceC569720MWc interfaceC569720MWcW2 = w2();
            if (interfaceC569720MWcW2 != null) {
                interfaceC569720MWcW2.MH(str, jCurrentTimeMillis);
                return;
            }
            return;
        }
        C0MGL c0mglC3 = c3();
        if (c0mglC3 == null) {
            return;
        }
        c0mglC3.yp0(str, jCurrentTimeMillis);
    }

    @Override // X.InterfaceC1425510nCP
    public void ey1(InterfaceC21580219cu interfaceC21580219cu) {
        C21580119ct c21580119ct = this.LLILLJJLI;
        if (c21580119ct != null) {
            ((ArrayList) c21580119ct.LL).add(interfaceC21580219cu);
        }
    }

    public void q3(h0<Integer> h0Var) {
        this.LLILZLL = h0Var;
    }

    @Override // X.InterfaceC1425510nCP
    public void wE2(boolean z) {
        this.LLJIJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1425510nCP
    public void Gt1(int i, int i2) {
        C21580119ct c21580119ct = this.LLILLJJLI;
        if (c21580119ct != null) {
            c21580119ct.LIZ(i);
        }
    }

    public C1425770nCp(C19A3 c19a3, C21580119ct c21580119ct, C1DRG c1drg, EditorTabViewModel editorTabViewModel) {
        this.LL = c19a3;
        this.LLILLJJLI = c21580119ct;
        this.LLILLL = c1drg;
        this.LLILZ = editorTabViewModel;
    }
}
