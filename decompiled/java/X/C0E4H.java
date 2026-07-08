package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E4H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4H extends C0ETX<C0E4I, C0EEZ, C0EEO, InterfaceC361200EEc> implements C0E4I {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E4H.class, "resPreloadApi", "getResPreloadApi()Lcom/ss/android/ugc/gamora/editorpro/components/IEditorProResPreloadApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E4H.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJLLL = 8;
    }

    @Override // X.C0ETX
    public void n5() {
    }

    private final C0E4L R5() {
        return (C0E4L) this.LLJJL.getValue(this, LLJLLIL[0]);
    }

    @Override // ge.i
    public Function0<C0EEZ> E3() {
        return new AwS549S0100000_5(this, 443);
    }

    public final C0EEZ E5() {
        return (C0EEZ) this.LLJL.getValue();
    }

    public final C0E4G H5() {
        return (C0E4G) this.LLJLIL.getValue();
    }

    public final C0EFH M5() {
        return (C0EFH) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EEO> o2() {
        return AFwS191S0000000_5.get$arr$(138);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC361200EEc> w2() {
        return new AwS549S0100000_5(this, 442);
    }

    private final void U5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F4 = F4();
        i3(new AwS56S1000000_5((c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) ? null : nLETrackSlotLLLLLLIL.getExtra("last_hsl_item"), 11));
    }

    public final void S5() {
        H5().LIZ();
        C0EEV c0eevLLLFZ = E5().LLLLLJLJLL().LLLFZ();
        if (c0eevLLLFZ != null) {
            i3(new AwS584S0100000_5(c0eevLLLFZ, 379));
        }
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventGs1;
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        MutableLiveData mutableLiveDataLIZ;
        LiveData<List<Effect>> liveDataH52;
        super.onCreate();
        C0E4L c0e4lR5 = R5();
        if (c0e4lR5 != null && (liveDataH52 = c0e4lR5.h52()) != null) {
            liveDataH52.observe(this, new AObserverS209S0100000_5(this, 50));
        }
        H5().LIZ();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (mutableLiveDataLIZ = c0e48F4.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 51));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 68));
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventGs1 = c0etqP4.Gs1()) != null) {
            liveEventGs1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 69));
        }
        U5();
    }

    @Override // X.C0ETX
    public void x5() {
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    public C0E4H(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C0E4L.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EFH.class, null);
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 440));
        this.LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 441));
    }

    public final C351280Dpu N5(C0E4K c0e4k, double d, NLEHSLColorType nLEHSLColorType) {
        int i = C0E4J.LIZ[c0e4k.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C351280Dpu(nLEHSLColorType, null, null, Double.valueOf(d), 6);
                }
                throw new C1954807lC();
            }
            return new C351280Dpu(nLEHSLColorType, null, Double.valueOf(d), null, 10);
        }
        return new C351280Dpu(nLEHSLColorType, Double.valueOf(d), null, null, 12);
    }
}
