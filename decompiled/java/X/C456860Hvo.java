package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMStackingViewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0700000_6;
import kotlin.jvm.internal.AwS438S0200000_2;

/* JADX INFO: renamed from: X.0Hvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456860Hvo {
    public static final AwS0S0700000_6 LIZIZ(UIAssem uIAssem, Function1 function1, Function1 function12) {
        return new AwS0S0700000_6(C13LE.LIZ(IMStackingViewAssem.class), uIAssem, C1163440gNi.LIZ, C1BNE.LIZ(C0HV8.LIZ), C442000HUw.LIZ, (C0HV9) null, new AwS438S0200000_2(function1, (Function1<? super C0SZ5, Unit>) function12, (Function1<? super C0SZ5, Unit>) 24), 18);
    }

    public static final C456870Hvp LIZ(IMInputAssem iMInputAssem, Function1 function1, Function1 function12, InterfaceC456880Hvq interfaceC456880Hvq, InterfaceC456880Hvq interfaceC456880Hvq2) {
        Function1<C0SZ5, Unit> function13;
        C456850Hvn c456850Hvn;
        C456850Hvn c456850Hvn2;
        boolean z = interfaceC456880Hvq instanceof C456850Hvn;
        Function1<C0SZ5, Unit> function14 = null;
        if (z && (c456850Hvn2 = (C456850Hvn) interfaceC456880Hvq) != null) {
            function13 = c456850Hvn2.LIZ;
        } else {
            function13 = null;
        }
        boolean z2 = interfaceC456880Hvq2 instanceof C456850Hvn;
        if (z2 && (c456850Hvn = (C456850Hvn) interfaceC456880Hvq2) != null) {
            function14 = c456850Hvn.LIZ;
        }
        return new C456870Hvp(z, z2, function13, function12, function1, iMInputAssem, function14);
    }
}
