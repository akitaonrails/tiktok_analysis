package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986790bmn extends C09AY implements Function1<EnumC964170bCJ, Unit> {
    public final /* synthetic */ ViewOnClickListenerC986770bml LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986790bmn(ViewOnClickListenerC986770bml viewOnClickListenerC986770bml) {
        super(1);
        this.LL = viewOnClickListenerC986770bml;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EnumC964170bCJ enumC964170bCJ) {
        Pair<? extends SparkContext, Integer> pair;
        boolean z;
        boolean z2;
        this.LL.getMatchLayoutCoordinator().LIZ(C986680bmc.LIZ());
        this.LL.setBattleState(enumC964170bCJ);
        if (this.LL.getBattleState() != EnumC964170bCJ.MATCH_START) {
            ViewOnClickListenerC986770bml viewOnClickListenerC986770bml = this.LL;
            for (int childCount = viewOnClickListenerC986770bml.LLJJLIIIJLLLLLLLZ.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewOnClickListenerC986770bml.LLJJLIIIJLLLLLLLZ.getChildAt(childCount);
                if (Intrinsics.LJFF(childAt.getTag(), "special_effect_debuff") || Intrinsics.LJFF(childAt.getTag(), "team_mate_special_effect_buff")) {
                    z = true;
                    break;
                }
            }
            z = false;
            ViewOnClickListenerC986770bml viewOnClickListenerC986770bml2 = this.LL;
            int childCount2 = viewOnClickListenerC986770bml2.LLJJLIIIJLLLLLLLZ.getChildCount() - 1;
            while (true) {
                if (-1 < childCount2) {
                    if (Intrinsics.LJFF(viewOnClickListenerC986770bml2.LLJJLIIIJLLLLLLLZ.getChildAt(childCount2).getTag(), "virtual_ticket_cross_room")) {
                        z2 = true;
                        break;
                    }
                    childCount2--;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z && !z2) {
                C786410Ut5.LJZL(8, this.LL.getRivalDebuffContainer());
            }
            this.LL.o1(C1697810uHb.LJIIJJI("special_effect_debuff", "team_mate_special_effect_buff", "virtual_ticket_cross_room"));
            C20441214yg.LIZIZ("RemoveContainer", "state is not start ,remove ");
            this.LL.i2();
            this.LL.getCriticalDebuffList().clear();
            this.LL.getExtraTimeDebuffList().clear();
            this.LL.getTop2DebuffList().clear();
            this.LL.getTop3DebuffList().clear();
            this.LL.getTeamMateSmokeBuffList().clear();
            this.LL.getTeamMateCriticalBuffList().clear();
            this.LL.getTeamMateExtraTimeBuffList().clear();
            this.LL.getTeamMateTop2BuffList().clear();
            this.LL.getTeamMateTop3BuffList().clear();
            if (!this.LL.LLLIIII.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) this.LL.LLLIIII).entrySet()) {
                    ValueAnimator valueAnimator = (ValueAnimator) entry.getKey();
                    if (!Intrinsics.LJFF(entry.getValue(), "4")) {
                        valueAnimator.cancel();
                    }
                }
            }
            C786410Ut5.h5((C1324720kZq) this.LL.getHostScoreLayout().findViewById(R.id.u22), 1.0f);
            C786410Ut5.LLJJJJ((C16F5) this.LL.getHostScoreLayout().findViewById(R.id.u23), 0);
        } else {
            ViewOnClickListenerC986770bml viewOnClickListenerC986770bml3 = this.LL;
            C786410Ut5.LLIZ(viewOnClickListenerC986770bml3.getRivalPowerUpScrollNew(), 0);
            LinearLayout lnRivalPowerUpsNew = viewOnClickListenerC986770bml3.getLnRivalPowerUpsNew();
            viewOnClickListenerC986770bml3.LLJJLIIIJLLLLLLLZ = lnRivalPowerUpsNew;
            C786410Ut5.LJJJJJL(lnRivalPowerUpsNew);
        }
        if (this.LL.getBattleState() == EnumC964170bCJ.SETTLE_START && ((pair = this.LL.LLLIIIL) == null || pair.getSecond().intValue() != 4)) {
            this.LL.z0();
        }
        if (this.LL.getBattleState() == EnumC964170bCJ.MATCH_END) {
            this.LL.z0();
            C786410Ut5.LJJJJJL(this.LL.getRivalDebuffContainer());
            C786410Ut5.LJZL(8, this.LL.getRivalDebuffContainer());
            C786410Ut5.LLIZ(this.LL.getRivalPowerUpScrollNew(), 8);
            ((LinkedHashMap) this.LL.LLLIIII).clear();
            ((ArrayList) this.LL.LLL).clear();
            ((ArrayList) this.LL.LLLII).clear();
        }
        return Unit.LIZ;
    }
}
