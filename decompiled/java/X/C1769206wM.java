package X;

import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769206wM implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    public static final void onFailure$1(C1769206wM c1769206wM, C0X9S c0x9s, Throwable th) {
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<Object> c0x9s, Throwable th) {
        switch (this.$t) {
            case 0:
                onFailure$0(this, c0x9s, th);
                break;
            case 1:
                onFailure$1(this, c0x9s, th);
                break;
            case 2:
                onFailure$2(this, c0x9s, th);
                break;
            case 3:
                onFailure$3(this, c0x9s, th);
                break;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<Object> c0x9s, C0X52<Object> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
            case 2:
                onResponse$2(this, c0x9s, c0x52);
                break;
            case 3:
                onResponse$3(this, c0x9s, c0x52);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1769206wM(Object obj, Function1<? super n, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
    }

    public static final void onFailure$0(C1769206wM c1769206wM, C0X9S c0x9s, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769206wM.l0;
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onFailure$2(C1769206wM c1769206wM, C0X9S c0x9s, Throwable th) {
        if (((InterfaceC20236714Gf) c1769206wM.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769206wM.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }

    public static final void onFailure$3(C1769206wM c1769206wM, C0X9S c0x9s, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report3PConsentPromptConsent failed: ");
        sbLIZ.append(th.getMessage());
        C1022620cia.LIZ("ThirdPartyAdReConsentPrompt", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onResponse$0(C1769206wM c1769206wM, C0X9S c0x9s, C0X52 c0x52) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769206wM.l0;
        C189200o6.m2constructorimpl(c0x52);
        interfaceC20236714Gf.resumeWith(c0x52);
    }

    public static final void onResponse$1(C1769206wM c1769206wM, C0X9S c0x9s, C0X52 c0x52) {
        ((Function1) c1769206wM.l0).invoke(c0x52.LIZIZ);
    }

    public static final void onResponse$2(C1769206wM c1769206wM, C0X9S c0x9s, C0X52 c0x52) {
        if (((InterfaceC20236714Gf) c1769206wM.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769206wM.l0;
            C189200o6.m2constructorimpl(c0x52);
            interfaceC20236714Gf.resumeWith(c0x52);
        }
    }

    public static final void onResponse$3(C1769206wM c1769206wM, C0X9S c0x9s, C0X52 c0x52) {
        Function0 function0;
        if (c0x52.LIZJ() && (function0 = (Function0) c1769206wM.l0) != null) {
            function0.invoke();
        }
    }
}
