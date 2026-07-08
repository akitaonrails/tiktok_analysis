package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18V3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18V3 extends C0H94 {
    public static final C18WD LLILZLL = new C18WD(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(324)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), 0.8f);
    public static final C18WD LLIZ = new C18WD(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(81)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(162)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(81)), 1.0f);
    public final String LL;
    public final List<C18V6> LLILLJJLI;
    public final C18WD LLILLL;
    public final boolean LLILZ;
    public final C1622006Ws<AIChatGenNode> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18V3)) {
            return false;
        }
        C18V3 c18v3 = (C18V3) obj;
        return Intrinsics.LJFF(this.LL, c18v3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c18v3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c18v3.LLILLL) && this.LLILZ == c18v3.LLILZ && Intrinsics.LJFF(this.LLILZIL, c18v3.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        C1622006Ws<AIChatGenNode> c1622006Ws = this.LLILZIL;
        if (c1622006Ws != null) {
            c1622006Ws.getClass();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagesContentSlotItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", images=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dimensionRuleSet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isSendSelf=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aiChatGenNode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C18V3) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C18V3 c18v3 = (C18V3) interfaceC1891350zJl;
        if (this.LLILLJJLI.size() != c18v3.LLILLJJLI.size() || !Intrinsics.LJFF(this.LLILLL, c18v3.LLILLL)) {
            return false;
        }
        int size = this.LLILLJJLI.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(ListProtector.get(this.LLILLJJLI, i), ListProtector.get(c18v3.LLILLJJLI, i))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C18V3) {
            return Intrinsics.LJFF(this.LL, ((C18V3) interfaceC1891350zJl).LL);
        }
        return false;
    }

    public C18V3(String str, List<C18V6> list, C18WD c18wd, boolean z, C1622006Ws<AIChatGenNode> c1622006Ws) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = c18wd;
        this.LLILZ = z;
        this.LLILZIL = c1622006Ws;
    }
}
