package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0Ua3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774610Ua3 implements InterfaceC774620Ua4 {
    public static final C774610Ua3 LL = new C774610Ua3();
    public static final ArrayList<InterfaceC774620Ua4> LLILLJJLI = new ArrayList<>();

    @Override // X.InterfaceC774620Ua4
    public final void LLLLZLLLI() {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLZLLLI();
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIL() {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZIL();
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLZ() {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZLZ();
        }
        C500260Jjc.LJJJLIIL(LLILLJJLI, AFwS245S0000000_12.get$arr$(147));
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLZIL() {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLZIL();
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final EnumC773520UVy LLZ() {
        return EnumC773520UVy.LONG_TERM;
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZI(DataChannel dataChannel) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZI(dataChannel);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZIL(boolean z) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZZIL(z);
        }
        ArrayList<InterfaceC774620Ua4> arrayList = LLILLJJLI;
        C500260Jjc.LJJJLIIL(arrayList, AFwS245S0000000_12.get$arr$(149));
        if (!z) {
            C500260Jjc.LJJJLIIL(arrayList, AFwS245S0000000_12.get$arr$(150));
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZIIL(Fragment fragment, DataChannel dataChannel) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZIIL(fragment, dataChannel);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZL(Fragment fragment, DataChannel dataChannel) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZL(fragment, dataChannel);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZLL(Fragment fragment, DataChannel dataChannel) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZLL(fragment, dataChannel);
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZZ(boolean z, boolean z2) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZZ(z, z2);
        }
        if (!z2) {
            C500260Jjc.LJJJLIIL(LLILLJJLI, AFwS245S0000000_12.get$arr$(148));
        }
    }

    @Override // X.InterfaceC774620Ua4
    public final void LLLZ(String str, String str2, Map<String, ? extends Object> map, C0U8C c0u8c) {
        Iterator<InterfaceC774620Ua4> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LLLZ(str, str2, map, c0u8c);
        }
    }
}
