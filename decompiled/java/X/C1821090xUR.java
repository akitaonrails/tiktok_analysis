package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0xUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821090xUR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OneStopPageVM LL;
    public final /* synthetic */ Playbook LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821090xUR(OneStopPageVM oneStopPageVM, Playbook playbook) {
        super(0);
        this.LL = oneStopPageVM;
        this.LLILLJJLI = playbook;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OneStopPageVM oneStopPageVM = this.LL;
        Playbook playbook = this.LLILLJJLI;
        oneStopPageVM.getClass();
        oneStopPageVM.setState(new C1821100xUS(playbook));
        oneStopPageVM.yQ2(3, 2);
        return Unit.LIZ;
    }
}
