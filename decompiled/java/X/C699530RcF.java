package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699530RcF extends C09AY implements Function0<List<C699090RbX<ComponentPriorityProtocol>>> {
    public C699530RcF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<C699090RbX<ComponentPriorityProtocol>> invoke() {
        return Collections.synchronizedList(new ArrayList());
    }
}
