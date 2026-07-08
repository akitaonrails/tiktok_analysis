package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountdownIconOnClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.CountDownSingleEntityConfig;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS171S0400000_15;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownConfig;

/* JADX INFO: renamed from: X.0baX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979190baX extends C09AY implements Function1<List<? extends C935770aSV>, Unit> {
    public final /* synthetic */ CountDownSingleEntity LL;
    public final /* synthetic */ C20361214lm LLILLJJLI;
    public final /* synthetic */ C259800zU<InterfaceC20354714kj> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C979190baX(CountDownSingleEntity countDownSingleEntity, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, String str, Long l, String str2, String str3) {
        super(1);
        this.LL = countDownSingleEntity;
        this.LLILLJJLI = c20361214lm;
        this.LLILLL = c259800zU;
        this.LLILZ = str;
        this.LLILZIL = l;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C935770aSV> list) {
        CountdownConfig countdownConfig;
        List<? extends C935770aSV> list2 = list;
        C01EB c01ebLJIJJLI = null;
        if (list2.size() != 1) {
            String strLIZ = C01EI.LIZ(91, this.LL.LLJJJJJIL.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTaskStart error, right size is 1, but size=");
            sbLIZ.append(list2.size());
            C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            PlayEntityUtilKt.LJ(this.LL, 2, this.LLILLJJLI, this.LLILLL.element);
        } else {
            String str = this.LLILLJJLI.LJI;
            if (str != null) {
                CountDownSingleEntity countDownSingleEntity = this.LL;
                if (a0.LJJJIL(str)) {
                    countdownConfig = null;
                } else {
                    countDownSingleEntity.getClass();
                    CountDownSingleEntityConfig countDownSingleEntityConfig = (CountDownSingleEntityConfig) C937280aUw.LIZJ(CountDownSingleEntityConfig.class, str, new CountDownSingleEntityConfig(0L, false, 0L));
                    countdownConfig = new CountdownConfig();
                    countdownConfig.duration = countDownSingleEntityConfig.duration;
                    countdownConfig.autoExpand = countDownSingleEntityConfig.autoExpand;
                    countdownConfig.targetScore = countDownSingleEntityConfig.targetScore;
                }
            } else {
                countdownConfig = null;
            }
            long j = ((C935770aSV) ListProtector.get(list2, 0)).LIZ;
            String str2 = ((C935770aSV) ListProtector.get(list2, 0)).LIZIZ;
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ != null) {
                c01ebLJIJJLI = interfaceC421301kRLIZIZ.LJIJJLI(str2);
            }
            EnumC422101kZ enumC422101kZ = EnumC422101kZ.START;
            if (c01ebLJIJJLI == C01EB.ONGOING) {
                enumC422101kZ = EnumC422101kZ.END;
            }
            C422301kb c422301kb = new C422301kb(j, str2, enumC422101kZ, countdownConfig);
            C013C c013c = new C013C();
            c013c.element = true;
            CountDownSingleEntity countDownSingleEntity2 = this.LL;
            DataChannel dataChannel = countDownSingleEntity2.LLJ;
            if (dataChannel != null) {
                dataChannel.LC0(CountdownIconOnClickEvent.class, new C946060aj6(c422301kb, this.LLIZ, new AwS171S0400000_15(this.LL, (CountDownSingleEntity) this.LLILLJJLI, (C20361214lm) this.LLILLL, (C259800zU<InterfaceC20354714kj>) c013c, (C013C) 1), null, new AwS559S0100000_15(this.LL, 337), new AwS224S0300000_15(this.LL, (CountDownSingleEntity) this.LLILLJJLI, (C20361214lm) this.LLILLL, (C259800zU<InterfaceC20354714kj>) 27), null, null, true, countDownSingleEntity2.LLIZ, null, new C334801Rq(this.LLILZ, this.LLILZIL, this.LLILZLL), 5016));
            }
        }
        return Unit.LIZ;
    }
}
