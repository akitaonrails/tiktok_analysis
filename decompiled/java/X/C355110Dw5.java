package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355110Dw5 extends AbstractC2255721DQs<InterfaceC355120Dw6> implements InterfaceC355120Dw6, InterfaceC379610EuV {
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 752));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 756));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 753));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 754));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 755));

    public InterfaceC355120Dw6 W1() {
        return this;
    }

    public final C0E48 X1() {
        return (C0E48) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC355120Dw6
    public MutableLiveData<C351080Dpa> getSlotSelectChangedEvent() {
        return (MutableLiveData) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC355120Dw6
    public MutableLiveData<C351120Dpe> getTrackSelectChangedEvent() {
        return (MutableLiveData) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC355120Dw6
    public LiveData<C357250DzX> getVolumeKeyframe() {
        return (LiveData) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC355120Dw6
    public MutableLiveData<C350390DoT> getVolumeUpdate() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    private final InterfaceC351350Dq1 LLFII() {
        C0E48 c0e48X1 = X1();
        if (c0e48X1 != null) {
            return c0e48X1.LLFII();
        }
        return null;
    }

    @Override // X.InterfaceC355120Dw6
    public float getCurrentVolumeIntensity() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        float fLJJLJLI;
        NLETrack nLETrackPt;
        Float fLJIIIIZZ;
        NLESegment mainSegment;
        NLEResourceNode resource;
        C0E48 c0e48X1 = X1();
        if (c0e48X1 == null || (nLETrackSlotLLLLLLIL = c0e48X1.LLLLLLIL()) == null) {
            return 0.0f;
        }
        if ((!nLETrackSlotLLLLLLIL.getKeyframes().isEmpty()) || C351220Dpo.LLFF(nLETrackSlotLLLLLLIL, NLEKeyframeType.Volume)) {
            C351220Dpo.LLIFFJFJJ(nLETrackSlotLLLLLLIL);
            fLJJLJLI = C351220Dpo.LJJLJLI(nLETrackSlotLLLLLLIL);
        } else {
            NLESegment mainSegment2 = nLETrackSlotLLLLLLIL.getMainSegment();
            fLJJLJLI = (((mainSegment2 == null || (resource = mainSegment2.getResource()) == null) ? null : resource.getResourceType()) == NLEResType.IMAGE || (mainSegment = nLETrackSlotLLLLLLIL.getMainSegment()) == null) ? 0.0f : C351220Dpo.LJLLLL(mainSegment);
        }
        C0E48 c0e48X12 = X1();
        if (c0e48X12 == null || (nLETrackPt = c0e48X12.Pt()) == null || !C351220Dpo.LLILL(nLETrackPt) || !nLETrackSlotLLLLLLIL.hasExtra("volume_before_enhance")) {
            return fLJJLJLI;
        }
        if (!(!nLETrackSlotLLLLLLIL.getKeyframes().isEmpty()) && !C351220Dpo.LLFF(nLETrackSlotLLLLLLIL, NLEKeyframeType.Volume)) {
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlotLLLLLLIL.getExtra("volume_before_enhance"));
            return fLJIIIIZZ2 != null ? fLJIIIIZZ2.floatValue() : fLJJLJLI;
        }
        if (!nLETrackSlotLLLLLLIL.hasExtra("volume_enhance_rate") || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlotLLLLLLIL.getExtra("volume_enhance_rate"))) == null) {
            return fLJJLJLI;
        }
        float fFloatValue = fLJIIIIZZ.floatValue();
        return fFloatValue != 0.0f ? C351220Dpo.LJJLJLI(nLETrackSlotLLLLLLIL) / fFloatValue : fLJJLJLI;
    }

    @Override // X.InterfaceC355120Dw6
    public float getSaveVolumeIntensity() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String extra;
        Float fLJIIIIZZ;
        C0E48 c0e48X1 = X1();
        if (c0e48X1 == null || (nLETrackSlotLLLLLLIL = c0e48X1.LLLLLLIL()) == null || (extra = nLETrackSlotLLLLLLIL.getExtra("volume_intensity")) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) == null) {
            return 1.0f;
        }
        return fLJIIIIZZ.floatValue();
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

    public C355110Dw5(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC355120Dw6
    public void changeVolume(float f, EnumC356070Dxd enumC356070Dxd) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = LLFII();
        if (interfaceC351350Dq1LLFII != null) {
            interfaceC351350Dq1LLFII.changeVolume(f, enumC356070Dxd);
        }
    }
}
