package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS91S0500000_8;

/* JADX INFO: renamed from: X.0MAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564080MAk extends C10GR {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String[] LLILLJJLI;
    public final /* synthetic */ C0LH5 LLILLL;
    public final /* synthetic */ TokenCert LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        if (!(c19eg instanceof C19EG) || c19eg == null) {
            return null;
        }
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C540290LGx c540290LGx = C540290LGx.LIZ;
        C19EG c19eg = this.LL;
        C540290LGx.LJFF(c540290LGx, c19eg, this.LLILLJJLI, new AwS91S0500000_8((Function0) this.LLILZIL, (Function0<Unit>) c19eg, (C19EG) this.LLILZLL, (Function0<Unit>) c20656615sK, (C20656615sK) this.LLIZ, (Function0<Unit>) 0), this.LLILLL, this.LLILZ, new AwS552S0100000_8(c20656615sK, 356), 80);
    }

    public C564080MAk(C19EG c19eg, String[] strArr, C0LH5 c0lh5, TokenCert tokenCert, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LL = c19eg;
        this.LLILLJJLI = strArr;
        this.LLILLL = c0lh5;
        this.LLILZ = tokenCert;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = function03;
    }
}
