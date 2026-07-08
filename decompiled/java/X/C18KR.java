package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18KR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public interface C18KR {
    void doLoop(Function1<? super FcpPageNode, Boolean> function1);

    FcpPageNode peek();

    FcpPageNode pop();

    void push(FcpPageNode fcpPageNode);

    int size();
}
