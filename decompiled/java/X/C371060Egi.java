package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Egi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C371060Egi extends C2217421BqW implements InterfaceC1631620sYq<NLETrackSlot, Float, Integer, Unit> {
    public C371060Egi(C371020Ege c371020Ege) {
        super(3, c371020Ege, C371020Ege.class, "loadNoCachedVideoFrames", "loadNoCachedVideoFrames(Lcom/bytedance/ies/nle/editor_jni/NLETrackSlot;FI)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(NLETrackSlot nLETrackSlot, Float f, Integer num) {
        float fFloatValue = f.floatValue();
        int iIntValue = num.intValue();
        ((C371020Ege) this.receiver).O4(nLETrackSlot, fFloatValue, iIntValue);
        return Unit.LIZ;
    }
}
