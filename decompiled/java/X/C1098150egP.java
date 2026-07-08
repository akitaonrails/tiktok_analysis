package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget;
import com.bytedance.android.livesdk.livesetting.banner.LiveGoalIndicatorDestroyOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalIndicatorWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.0egP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget$showIndicator$2", f = "LiveGoalsWidget.kt", l = {485, 498}, m = "invokeSuspend")
public final class C1098150egP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveGoalsWidget LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1098150egP(LiveGoalsWidget liveGoalsWidget, boolean z, InterfaceC1364105Vn<? super C1098150egP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveGoalsWidget;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1098150egP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iYy2;
        InterfaceC1541990qEH interfaceC1541990qEH;
        Fragment fragment;
        C19EG activity;
        C1C7U.LIZ("LiveGoalsWidget@b41.showIndicator$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI.LLJ && !this.LLILLL) {
                IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
                if (iRankService != null) {
                    iYy2 = iRankService.yy2();
                } else {
                    iYy2 = 0;
                }
                int i2 = iYy2 / LivePreCreateNextRoomPlayer.ENABLE;
                if (i2 != 0) {
                    long jLJIIJ = ((long) C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, i2))) * 1000;
                    if (jLJIIJ > 0) {
                        this.LL = 1;
                        if (AnonymousClass0958.LIZIZ(jLJIIJ, this) == objLJFF) {
                            C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                            return objLJFF;
                        }
                    }
                }
            }
        }
        LiveGoalsWidget liveGoalsWidget = this.LLILLJJLI;
        liveGoalsWidget.LLIZLLLIL = null;
        String value = LiveStreamGoalIndicatorWebLinkSetting.INSTANCE.getValue();
        Context context = liveGoalsWidget.context;
        if (context != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1098060egG c1098060egG = C1098060egG.LIZ;
            C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
            c1098020egCLIZIZ.LJII = jCurrentTimeMillis;
            c1098020egCLIZIZ.LIZLLL = value;
            C1098170egR c1098170egR = new C1098170egR();
            c1098170egR.LJIIIIZZ(value);
            c1098170egR.LIZIZ.authority("lynxview_card");
            c1098170egR.LJFF(true);
            C1098160egQ c1098160egQ = new C1098160egQ(context, c1098170egR.LIZ().toString(), liveGoalsWidget, jCurrentTimeMillis, value);
            InterfaceC1097170eep interfaceC1097170eep = liveGoalsWidget.widgetCallback;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (activity = fragment.getActivity()) != null) {
                interfaceC1541990qEH = (InterfaceC1541990qEH) C1563370qml.LIZ(activity, EnumC682280QpW.MAIN, new AwS561S0100000_17(c1098160egQ, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            } else {
                interfaceC1541990qEH = (InterfaceC1541990qEH) c1098160egQ.invoke();
            }
            C1098060egG.LIZIZ().LJIIIIZZ = System.currentTimeMillis();
            c1098060egG.LJ();
            liveGoalsWidget.LLILLL = interfaceC1541990qEH;
            if (interfaceC1541990qEH != null) {
                View viewE1 = interfaceC1541990qEH.e1();
                if (viewE1 == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                    return unit2;
                }
                LiveGoalsWidget liveGoalsWidget2 = this.LLILLJJLI;
                liveGoalsWidget2.getClass();
                InterfaceC520720KbW interfaceC520720KbW = (InterfaceC520720KbW) interfaceC1541990qEH.getHybridContext().LJFF(InterfaceC520720KbW.class);
                if (interfaceC520720KbW != null) {
                    long roomId = interfaceC520720KbW.getRoomId();
                    DataChannel dataChannel = liveGoalsWidget2.dataChannel;
                    if (dataChannel != null && C500260Jjc.LJJLIIIJ(dataChannel) != roomId) {
                        C1098060egG.LIZ.LJII();
                        if (LiveGoalIndicatorDestroyOptimizeSetting.INSTANCE.getValue()) {
                            interfaceC1541990qEH.LLD(true);
                            Unit unit3 = Unit.LIZ;
                            C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                            return unit3;
                        }
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C472960Igg c472960Igg = new C472960Igg(this.LLILLJJLI, viewE1, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c472960Igg) == objLJFF) {
                    C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                    return objLJFF;
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
                return unit4;
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("LiveGoalsWidget@b41.showIndicator$2");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
