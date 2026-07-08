package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ebg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367940Ebg extends AbstractC367990Ebl {
    public final C19EG LJIILLIIL;
    public Function0<? extends InterfaceC367710EbJ> LJIIZILJ;

    @Override // X.InterfaceC369090EdX
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
    }

    @Override // X.InterfaceC369090EdX
    public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn) {
        InterfaceC367710EbJ interfaceC367710EbJInvoke;
        C367800EbS c367800EbS = new C367800EbS(this.LJIILLIIL, this.LIZ);
        Function0<? extends InterfaceC367710EbJ> function0 = this.LJIIZILJ;
        if (function0 != null && (interfaceC367710EbJInvoke = function0.invoke()) != null) {
            c367800EbS.LLILLL.setTtsWavePainter(interfaceC367710EbJInvoke);
        }
        return c367800EbS;
    }

    public C367940Ebg(C19EG c19eg, C368630Ecn c368630Ecn, C368680Ecs c368680Ecs, C369220Edk c369220Edk, C368450EcV c368450EcV) {
        super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIILLIIL = c19eg;
    }
}
