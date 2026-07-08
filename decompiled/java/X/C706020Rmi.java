package X;

import com.ss.android.ugc.aweme.feed.assem.collab.CollabInvitedButtonTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706020Rmi extends C09AY implements Function0<PriorityAbility> {
    public final /* synthetic */ CollabInvitedButtonTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C706020Rmi(CollabInvitedButtonTrigger collabInvitedButtonTrigger) {
        super(0);
        this.LL = collabInvitedButtonTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PriorityAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), PriorityAbility.class, null);
    }
}
