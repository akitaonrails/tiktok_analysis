package X;

import Y.AObjectS240S0100000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365620EVc extends AbstractC2255721DQs<C0E4L> implements C0E4L, InterfaceC379610EuV, InterfaceC497601wk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final C0E4L LLILLJJLI = this;
    public final MutableLiveData<List<Effect>> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<List<Effect>> LLILZ = new MutableLiveData<>();
    public boolean LLILZIL;
    public final CoroutineContext LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public C09AE LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C365620EVc.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C365620EVc.class, "downloadApiComponent", "getDownloadApiComponent()Lcom/ss/android/ugc/gamora/editorpro/components/download/EPResDownloadApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILJILJ = 8;
    }

    private final C0EFH G2() {
        return (C0EFH) this.LLIZ.getValue(this, LLJILJIL[0]);
    }

    private final C1427905iP X1() {
        return (C1427905iP) this.LLJIJIL.getValue();
    }

    private final InterfaceC365660EVg w2() {
        return (InterfaceC365660EVg) this.LLIZLLLIL.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1635410sex H2() {
        return (InterfaceC1635410sex) this.LLJI.getValue();
    }

    public final void W2() {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "studio_editor_pro_ai_transition_guide_video_url", "https://p16.tiktokcdn.com/obj/tiktok-obj/Transition_placeholder1.mp4", true);
        String strLJJ2 = C0C64.LJIILLIIL().LJJ(31744, "studio_editor_pro_ai_transition_guide_video_url", "https://p16.tiktokcdn.com/obj/tiktok-obj/Transition_placeholder1.mp4", true);
        C0FGJ c0fgj = new C0FGJ(strLJJ, a0.LJJLJLI(strLJJ2, "/", strLJJ2));
        InterfaceC365660EVg interfaceC365660EVgW2 = w2();
        if (interfaceC365660EVgW2 != null) {
            interfaceC365660EVgW2.Vm0(c0fgj, null);
        }
    }

    public final C09AE i3() {
        return C23250099c.LIZLLL(this, null, null, new C365630EVd(this, null), 3);
    }

    @Override // X.C0E4L
    public void to2() {
        C23250099c.LIZLLL(this, null, null, new C365640EVe(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        G2().J50().LIZ(this, new AObjectS240S0100000_5(this, 120));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this, null);
    }

    public MutableLiveData<List<Effect>> T2() {
        return this.LLILZ;
    }

    @Override // X.C0E4L
    public boolean UV0() {
        return this.LLILZIL;
    }

    public MutableLiveData<List<Effect>> Z1() {
        return this.LLILLL;
    }

    @Override // X.C0E4L
    public /* bridge */ /* synthetic */ LiveData dk0() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0E4L
    public /* bridge */ /* synthetic */ LiveData h52() {
        return this.LLILLL;
    }

    public C0E4L o2() {
        return this.LLILLJJLI;
    }

    public C365620EVc(C1DRG c1drg) {
        this.LL = c1drg;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0EFH.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC365660EVg.class, null);
        this.LLJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(222));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 767));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W1(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C365650EVf
            if (r0 == 0) goto L3e
            r4 = r6
            X.0EVf r4 = (X.C365650EVf) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L44
            androidx.lifecycle.MutableLiveData r1 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r0)
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>> r1 = r5.LLILLL
            X.05iP r0 = r5.X1()
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LIZ(r4)
            if (r0 != r3) goto L24
            return r3
        L3e:
            X.0EVf r4 = new X.0EVf
            r4.<init>(r5, r6)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365620EVc.W1(X.05Vn):java.lang.Object");
    }

    public void c3(boolean z) {
        this.LLILZIL = z;
    }
}
