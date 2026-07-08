package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AwS119S1000000_35;

/* JADX INFO: renamed from: X.1D1X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D1X extends C1D1U<String> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        String string;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        Keva keva = (Keva) new AwS119S1000000_35(str, 6).invoke();
        if (keva != null && (string = keva.getString(str2, str3)) != null) {
            return string;
        }
        return str3;
    }

    public C1D1X(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
        String str = (String) obj2;
        String str2 = this.LL;
        String str3 = this.LLILLJJLI;
        Keva keva = (Keva) new AwS119S1000000_35(str2, 7).invoke();
        if (keva != null) {
            keva.storeString(str3, str);
        }
    }
}
