package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20393514qz extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ Playbook LLILLJJLI;
    public final /* synthetic */ C20406514t5 LLILLL;
    public final /* synthetic */ PlaybookAnchorViewModel LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20393514qz(PlaybookAnchorViewModel playbookAnchorViewModel, C20406514t5 c20406514t5, DataChannel dataChannel, String str, Map map, Function0 function0, Playbook playbook) {
        super(1);
        this.LL = dataChannel;
        this.LLILLJJLI = playbook;
        this.LLILLL = c20406514t5;
        this.LLILZ = playbookAnchorViewModel;
        this.LLILZIL = map;
        this.LLILZLL = str;
        this.LLIZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C20394714rB c20394714rB = C20394714rB.LIZ;
        DataChannel dataChannel = this.LL;
        Playbook playbook = this.LLILLJJLI;
        C20406514t5 c20406514t5 = this.LLILLL;
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILZ;
        Map<String, String> map = this.LLILZIL;
        String str = this.LLILZLL;
        Function0<Unit> function0 = this.LLIZ;
        c20394714rB.getClass();
        C20394714rB.LIZLLL(dataChannel, "use_confirm", playbook, c20406514t5, playbookAnchorViewModel);
        C20394714rB.LJII(playbookAnchorViewModel, playbook, map, str, function0);
        return Unit.LIZ;
    }
}
