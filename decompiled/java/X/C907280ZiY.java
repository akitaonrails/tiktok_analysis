package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.IUnavailableMessageCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907280ZiY {
    public static final C907280ZiY LIZ = new C907280ZiY();
    public static final IUnavailableMessageCheck LIZIZ = (IUnavailableMessageCheck) PluggableExtentionKt.pluggableSpiForReal(IUnavailableMessageCheck.class);
    public static final InterfaceC2044707zh<EnumC907290ZiZ> LIZJ;
    public static final List<Integer> LIZLLL;

    static {
        InterfaceC2044707zh<EnumC907290ZiZ> entries = EnumC907290ZiZ.getEntries();
        LIZJ = entries;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(entries, 10));
        Iterator<EnumC907290ZiZ> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getMessageType()));
        }
        LIZLLL = arrayList;
        InterfaceC2044707zh<EnumC907290ZiZ> interfaceC2044707zh = LIZJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(interfaceC2044707zh, 10));
        Iterator<EnumC907290ZiZ> it3 = interfaceC2044707zh.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(it3.next().getImSearchContentType()));
        }
    }

    public static boolean LIZ(C869590Y9l c869590Y9l) {
        boolean z;
        boolean z2;
        if (c869590Y9l.getSvrStatus() == 0) {
            z = true;
        } else {
            z = false;
        }
        IUnavailableMessageCheck iUnavailableMessageCheck = LIZIZ;
        if (iUnavailableMessageCheck != null && iUnavailableMessageCheck.LIZ(c869590Y9l)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        if (!z || !z3) {
            return false;
        }
        return true;
    }
}
