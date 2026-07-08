package X;

import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C698320RaI extends C2217421BqW implements Function1<String, C699090RbX<ComponentPriorityProtocol>> {
    public C698320RaI(C699060RbU c699060RbU) {
        super(1, c699060RbU, C699060RbU.class, "findSlotProtocolData", "findSlotProtocolData(Ljava/lang/String;)Lcom/ss/android/ugc/feed/platform/componentmanager/PriorityProtocolData;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C699090RbX<ComponentPriorityProtocol> invoke(String str) {
        return ((C699060RbU) this.receiver).LJIJJLI().get(str);
    }
}
