package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC697230RWn extends InterfaceC697190RWj<FcpNodeProtocol> {
    ViewGroup LJJIJL();

    List<String> is();

    void js(PriorityProtocol priorityProtocol, boolean z, boolean z2);

    void ks(PriorityProtocol priorityProtocol, boolean z, boolean z2, boolean z3);

    void ls(PriorityProtocol priorityProtocol, Function2<? super PriorityProtocol, ? super Boolean, Unit> function2, Boolean bool);

    void ms(PriorityProtocol priorityProtocol, boolean z);

    String ns();

    void os(PriorityProtocol priorityProtocol, C0RKR c0rkr, Boolean bool);

    C0RYB ps();

    void qs();

    void reset();

    InterfaceC697220RWm rs();

    void ss(boolean z);

    void ts(ViewGroup viewGroup, C0RY9 c0ry9, Function2<? super View, ? super String, Unit> function2);
}
