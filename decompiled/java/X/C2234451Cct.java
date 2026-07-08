package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2234451Cct extends C2217421BqW implements Function1<LinkMicCrossLinker, List<? extends C967180bHA>> {
    public static final C2234451Cct LL = new C2234451Cct();

    public C2234451Cct() {
        super(1, LinkMicCrossLinker.class, "groupWillJoinLinkedList", "groupWillJoinLinkedList()Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C967180bHA> invoke(LinkMicCrossLinker linkMicCrossLinker) {
        return linkMicCrossLinker.LLFFF();
    }
}
