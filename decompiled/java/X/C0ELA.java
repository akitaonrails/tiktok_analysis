package X;

import Y.AObserverS170S0200000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.List;
import jg5.AvS179S0000000_5;
import jg5.AvS539S0100000_5;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ELA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELA extends AbstractC381020Ewm<C0EY2> implements C0EY2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLILLL;
    public final C0EY2 LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final CoroutineExceptionHandler LLIZLLLIL;
    public InterfaceC497601wk LLJ;
    public final C01GW LLJI;
    public InterfaceC497601wk LLJIJIL;
    public final MutableLiveData<C0EHI> LLJILJIL;
    public C0EHI LLJILJILJ;
    public final MutableLiveData<Unit> LLJILLL;
    public C09AE LLJJ;
    public C09AE LLJJI;
    public C09AE LLJJIII;
    public AnonymousClass0957<C0EHI> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ELA.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ELA.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ELA.class, "videoEditContainerScene", "getVideoEditContainerScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIJIL = 8;
    }

    @Override // X.C0EY2
    public void Fh1() {
    }

    private final InterfaceC1452360nti H2() {
        return (InterfaceC1452360nti) this.LLILZLL.getValue(this, LLJJIJIIJIL[1]);
    }

    private final VideoEditContainerScene T2() {
        return (VideoEditContainerScene) this.LLIZ.getValue(this, LLJJIJIIJIL[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJJIJIIJIL[0]);
    }

    public final InterfaceC497601wk o2() {
        return (InterfaceC497601wk) this.LLJI.getValue();
    }

    @Override // X.C0EY2
    public void oM0() {
        C0EHI value = this.LLJILJIL.getValue();
        if (value != null) {
            this.LLJILJILJ = value;
        }
        this.LLJILJIL.setValue(null);
        InterfaceC497601wk interfaceC497601wk = this.LLJIJIL;
        if (interfaceC497601wk != null) {
            C2296808zG.LIZJ(interfaceC497601wk, null);
        }
        C09AE c09ae = this.LLJJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJIII;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
    }

    @Override // X.C0EY2
    public VideoPublishEditModel TZ0() {
        C0EHJ c0ehj;
        C0EHI c0ehi = (C0EHI) zu2().getValue();
        if (c0ehi == null || (c0ehj = c0ehi.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZJ;
    }

    @Override // X.C0EY2
    public VideoPublishEditModel getEditModel() {
        C0EHJ c0ehj;
        C0EHI c0ehi = (C0EHI) zu2().getValue();
        if (c0ehi == null || (c0ehj = c0ehi.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        oM0();
        C2296808zG.LIZJ(this.LLJ, null);
    }

    public final boolean sg() {
        return (H2() == null || T2() == null) ? false : true;
    }

    @Override // X.C0EY2
    @InterfaceC1294060jmO
    public void AY0() {
        Fh1();
    }

    public MutableLiveData<Unit> G2() {
        return this.LLJILLL;
    }

    @Override // X.C0EY2
    public /* bridge */ /* synthetic */ LiveData Tl0() {
        return this.LLJILLL;
    }

    public C0EY2 Z1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public MutableLiveData<C0EHI> w2() {
        return this.LLJILJIL;
    }

    @Override // X.C0EY2
    public /* bridge */ /* synthetic */ LiveData zu2() {
        return this.LLJILJIL;
    }

    public C0ELA(C1DRG c1drg) {
        CoroutineContext coroutineContext;
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = this;
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), VideoEditContainerScene.class, null);
        C364880ESg c364880ESg = new C364880ESg(CoroutineExceptionHandler.LJJLIL);
        this.LLIZLLLIL = c364880ESg;
        if (C370920EgU.LLJJI) {
            coroutineContext = C0PEM.LIZJ;
        } else {
            coroutineContext = C0PEM.LIZ;
        }
        this.LLJ = C2296808zG.LIZ(coroutineContext.plus(C2296908zH.LIZ()).plus(c364880ESg));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 938));
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
    }

    @Override // X.C0EY2
    public void FJ1(Function0<Unit> function0) {
        this.LLJJ = C23250099c.LIZLLL(this.LLJ, null, null, new C0EL9(this, function0, null), 3);
    }

    @Override // X.C0EY2
    public void Lr1(long j) {
        InterfaceC497601wk interfaceC497601wk = this.LLJ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C05PP(j, this, null), 2);
    }

    public final void X1(C0EHI c0ehi) {
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setEditModel(c0ehi.LIZ.LIZ);
        this.LLJILJIL.setValue(c0ehi);
        C0EHK.LJIIJ(JY0().ww2(), this, new AObserverS170S0200000_5(c0ehi, this, 18));
    }

    private final void i3(C0ELH c0elh, C0EL6 c0el6) {
        C09AE c09ae = this.LLJJIII;
        if (c09ae != null && c09ae.isActive()) {
            return;
        }
        this.LLJJIII = C23250099c.LIZLLL(this.LLJ, null, null, new C0ELB(this, c0elh, c0el6, null, this.LLJJIII), 3);
    }

    @Override // X.C0EY2
    public void Ew1(C0ELH c0elh, C0EL6 c0el6) {
        m3(c0elh, c0el6, EnumC1364705Vt.START_LOAD_WITHOUT_NOTIFY);
        if (this.LLJJ == null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
            if (c19egLIZIZ != null) {
                C0EHK.LJII(c19egLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLJJIJI = C23250099c.LIZIZ(this.LLJ, null, null, new C1364305Vp(this, c0elh, c0el6, null), 3);
        C23250099c.LIZLLL(this.LLJ, C2107308Nj.LIZ, null, new C1364505Vr(this, null), 2);
    }

    @Override // X.C0EY2
    public void I11(C0ELH c0elh, C0EL6 c0el6) {
        C09AE c09ae;
        m3(c0elh, c0el6, EnumC1364705Vt.START_LOAD);
        if (this.LLJILLL.getValue() != null || ((c09ae = this.LLJJI) != null && c09ae.isActive())) {
            i3(c0elh, c0el6);
            return;
        }
        C09AE c09ae2 = this.LLJJI;
        if (this.LLJJ == null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
            if (c19egLIZIZ != null) {
                C0EHK.LJII(c19egLIZIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLJJI = C23250099c.LIZLLL(this.LLJ, null, null, new C1365105Vx(this, c0elh, c0el6, null, c09ae2), 3);
    }

    public final void q3(C0ELJ c0elj, VideoPublishEditModel videoPublishEditModel) {
        long jLongValue;
        c0elj.setEditModel(videoPublishEditModel);
        if (videoPublishEditModel.isRetakeVideo()) {
            C363500EMy.LIZ.getClass();
            c0elj.setRetakeCommitId(C363500EMy.LJII);
        }
        if (!u4.LJLJLLL(videoPublishEditModel)) {
            c0elj.setInlineCaptionCaches(null);
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        c363500EMy.getClass();
        c0elj.setEffectMultiTrackMode(C363500EMy.LJIIIZ);
        c363500EMy.getClass();
        c0elj.setRetouchMultiTrackMode(C363500EMy.LJIIJ);
        c363500EMy.getClass();
        C363500EMy.LJIIIZ = false;
        c363500EMy.getClass();
        String str = C363500EMy.LJIIL;
        if (str != null && !a0.LJJJIL(str)) {
            c363500EMy.getClass();
            c0elj.setEnterSelectSlotId(C363500EMy.LJIIL);
            c363500EMy.getClass();
            C363500EMy.LJIIL = null;
        }
        c363500EMy.getClass();
        String str2 = C363500EMy.LJIILIIL;
        if (str2 != null && !a0.LJJJIL(str2)) {
            c363500EMy.getClass();
            c0elj.setEnterSelectedFuncType(C363500EMy.LJIILIIL);
            c363500EMy.getClass();
            C363500EMy.LJIILIIL = null;
        }
        c363500EMy.getClass();
        if (C363500EMy.LJIILL != null) {
            c363500EMy.getClass();
            Long l = C363500EMy.LJIILL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c0elj.setEnterMovePos(jLongValue);
            c363500EMy.getClass();
            C363500EMy.LJIILL = null;
        }
        c363500EMy.getClass();
        c0elj.setFromCompatibleKeyFrame(C363500EMy.LJIILJJIL);
        c363500EMy.getClass();
        C363500EMy.LJI = false;
    }

    private final void m3(C0ELH c0elh, C0EL6 c0el6, EnumC1364705Vt enumC1364705Vt) {
        if (C370920EgU.LLJJI) {
            return;
        }
        InterfaceC497601wk interfaceC497601wk = this.LLJIJIL;
        if (interfaceC497601wk != null) {
            C2296808zG.LIZJ(interfaceC497601wk, null);
        }
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLJIJIL = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C1364205Vo(this, enumC1364705Vt, c0elh, c0el6, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(X.C0ELH r25, X.C0EL6 r26, X.InterfaceC1364105Vn<? super X.C0EHI> r27) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ELA.c3(X.0ELH, X.0EL6, X.05Vn):java.lang.Object");
    }

    private final Pair<List<AbstractC371450EhL<?>>, C1DRG> W2(final NLEModel nLEModel, final String str, final VideoPublishEditModel videoPublishEditModel, C0EL6 c0el6, C0ELI c0eli) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1DRF c1drf = new C1DRF();
        c1drf.LJ(C0EL6.class, null, c0el6);
        c1drf.LJ(C0ELI.class, null, c0eli);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
        if (c19egLIZIZ != null) {
            c1drf.LJ(C19EG.class, null, c19egLIZIZ);
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                c1drf.LJ(C0E48.class, null, c0e48W1);
            }
            c1drf.LJFF(C362170EHv.class, null, new AvS179S0000000_5(1));
            c1drf.LJFF(C365910EWf.class, null, new AbstractC20611515l3<C365910EWf>() { // from class: X.0ELD
                @Override // X.AbstractC20611515l3
                public final C365910EWf LIZIZ(C1DRG c1drg) {
                    return new C365910EWf(new C0EI6(c1drg), videoPublishEditModel, nLEModel, str);
                }
            });
            c1drf.LJFF(C362910EKr.class, null, new AvS179S0000000_5(2));
            c1drf.LJFF(C0ELF.class, null, new AvS179S0000000_5(3));
            c1drf.LJFF(C0EL3.class, null, new AvS539S0100000_5(this, 23));
            c1drf.LJFF(C362980EKy.class, null, new AvS179S0000000_5(4));
            if (C1416310mxZ.LJJJJZI(videoPublishEditModel)) {
                c1drf.LJFF(C358100E2e.class, null, new AvS179S0000000_5(5));
            }
            c1drf.LJFF(C351770Dqh.class, null, new AvS179S0000000_5(6));
            C1DRG c1drgLIZIZ = c1drf.LIZIZ();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c1drgLIZIZ.LJII(C362170EHv.class, null));
            arrayList.add(c1drgLIZIZ.LJII(C365910EWf.class, null));
            arrayList.add(c1drgLIZIZ.LJII(C362910EKr.class, null));
            arrayList.add(c1drgLIZIZ.LJII(C0ELF.class, null));
            arrayList.add(c1drgLIZIZ.LJII(C0EL3.class, null));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTask: cost ");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            sbLIZ.append(' ');
            C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
            return new Pair<>(arrayList, c1drgLIZIZ);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
