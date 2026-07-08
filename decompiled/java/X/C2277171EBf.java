package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277171EBf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C2277251EBn LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Exception LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277171EBf(int i, C2277251EBn c2277251EBn, long j, long j2, Exception exc) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c2277251EBn;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String message;
        String message2;
        String message3;
        InterfaceC2277241EBm interfaceC2277241EBm;
        String message4;
        int i = this.LL;
        String str = "";
        if (i == -3) {
            InterfaceC2277241EBm interfaceC2277241EBm2 = this.LLILLJJLI.LIZ;
            if (interfaceC2277241EBm2 != null) {
                int i2 = (int) this.LLILLL;
                long j = this.LLILZ;
                Exception exc = this.LLILZIL;
                if (exc != null && (message = exc.getMessage()) != null) {
                    str = message;
                }
                interfaceC2277241EBm2.LIZ(i2, j, this.LLILZIL, str);
            }
        } else if (i == -2) {
            InterfaceC2277241EBm interfaceC2277241EBm3 = this.LLILLJJLI.LIZ;
            if (interfaceC2277241EBm3 != null) {
                int i3 = (int) this.LLILLL;
                long j2 = this.LLILZ;
                Exception exc2 = this.LLILZIL;
                if (exc2 != null && (message2 = exc2.getMessage()) != null) {
                    str = message2;
                }
                interfaceC2277241EBm3.LJFF(i3, j2, this.LLILZIL, str);
            }
        } else if (i == -1) {
            InterfaceC2277241EBm interfaceC2277241EBm4 = this.LLILLJJLI.LIZ;
            if (interfaceC2277241EBm4 != null) {
                int i4 = (int) this.LLILLL;
                long j3 = this.LLILZ;
                Exception exc3 = this.LLILZIL;
                if (exc3 != null && (message3 = exc3.getMessage()) != null) {
                    str = message3;
                }
                interfaceC2277241EBm4.LJIILL(i4, j3, this.LLILZIL, str);
            }
        } else if (i == 405 && (interfaceC2277241EBm = this.LLILLJJLI.LIZ) != null) {
            int i5 = (int) this.LLILLL;
            long j4 = this.LLILZ;
            Exception exc4 = this.LLILZIL;
            if (exc4 != null && (message4 = exc4.getMessage()) != null) {
                str = message4;
            }
            interfaceC2277241EBm.LIZ(i5, j4, this.LLILZIL, str);
        }
        return Unit.LIZ;
    }
}
