package X;

import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.00dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C126400dy extends C09AY implements Function1<Playbook, Boolean> {
    public final /* synthetic */ Playbook LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126400dy(Playbook playbook) {
        super(1);
        this.LL = playbook;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Playbook playbook) {
        boolean z;
        if (playbook.playbookId == this.LL.playbookId) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
