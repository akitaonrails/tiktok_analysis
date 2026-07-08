package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ccp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2234411Ccp extends C2217421BqW implements Function1<LinkMicCrossLinker, List<? extends C967180bHA>> {
    public static final C2234411Ccp LL = new C2234411Ccp();

    public C2234411Ccp() {
        super(1, LinkMicCrossLinker.class, "groupAppliedList", "groupAppliedList()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C967180bHA> invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return linkMicCrossLinker.LJLJJLL();
    }
}
