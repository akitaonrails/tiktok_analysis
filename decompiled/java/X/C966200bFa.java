package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966200bFa extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C966020bFI LLILLJJLI;
    public final /* synthetic */ C967910bIL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966200bFa(int i, C966020bFI c966020bFI, C967910bIL c967910bIL) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c966020bFI;
        this.LLILLL = c967910bIL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        int i;
        InterfaceC965990bFF interfaceC965990bFF2 = interfaceC965990bFF;
        if (LinkMicState.Companion.isFinished(this.LL)) {
            switch (C1CX3.LIZLLL[this.LLILLL.LJFF.ordinal()]) {
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    i = 8;
                    break;
                default:
                    throw new C1954807lC();
            }
            interfaceC965990bFF2.LLII(i);
        }
        interfaceC965990bFF2.LLD(this.LLILLJJLI, this.LL);
        return Unit.LIZ;
    }
}
