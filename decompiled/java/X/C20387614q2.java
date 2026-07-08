package X;

import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20387614q2 extends C09AY implements Function1<Playbook, Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20387614q2(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Playbook playbook) {
        boolean z;
        if (playbook.playbookId == this.LL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
