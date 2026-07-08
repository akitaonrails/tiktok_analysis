package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchReasonConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchReasonConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.model.live.WatchReason;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AAG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.PreviewSubTitleHelper$startShowSubTitle$1", f = "PreviewSubTitleHelper.kt", l = {92, 100}, m = "invokeSuspend")
public final class C1AAG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public WatchReasonConfig LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1AAF LLILZ;
    public final /* synthetic */ C1ACA LLILZIL;
    public final /* synthetic */ TuxTextView LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AAG(boolean z, C1AAF c1aaf, C1ACA c1aca, TuxTextView tuxTextView, InterfaceC1364105Vn<? super C1AAG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c1aaf;
        this.LLILZIL = c1aca;
        this.LLILZLL = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1AAG(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WatchReasonConfig watchReasonConfigConfig;
        String str;
        Long lLJFF;
        Long lLJFF2;
        LiveRoomStruct liveRoomStruct;
        Text text;
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct2;
        WatchReason watchReason;
        C1C7U.LIZ("PreviewSubTitleHelper@e317.startShowSubTitle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C786410Ut5.B5(this.LLILZLL, 0.0f);
                    this.LLILZ.LIZLLL = EnumC1779530wPP.DONE;
                    c1aca = this.LLILZIL;
                    if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null && (watchReason = liveRoomStruct2.fypWatchReason) != null) {
                        watchReason.isShowed = true;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PreviewSubTitleHelper@e317.startShowSubTitle$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            watchReasonConfigConfig = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            watchReasonConfigConfig = LiveWatchReasonConfigSetting.config();
            if (this.LLILLL) {
                long j = watchReasonConfigConfig.subTitleDelay;
                this.LL = watchReasonConfigConfig;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("PreviewSubTitleHelper@e317.startShowSubTitle$1");
                    return objLJFF;
                }
            }
        }
        C1088200eQM c1088200eQM = C1088200eQM.LIZ;
        WatchReasonItem watchReasonItem = this.LLILZ.LJ;
        if (watchReasonItem != null && (text = watchReasonItem.content) != null) {
            str = text.key;
        } else {
            str = null;
        }
        C1ACA c1aca2 = this.LLILZIL;
        if (c1aca2 != null && (liveRoomStruct = c1aca2.LIZJ) != null) {
            lLJFF = C2286608xc.LJFF(liveRoomStruct.id);
        } else {
            lLJFF = null;
        }
        c1088200eQM.getClass();
        C1088200eQM.LIZJ(lLJFF, str, true);
        C1AC7 c1ac7 = C1AC7.LIZ;
        C1ACA c1aca3 = this.LLILZIL;
        WatchReasonItem watchReasonItem2 = this.LLILZ.LJ;
        if (watchReasonItem2 != null) {
            lLJFF2 = C2286608xc.LJFF(watchReasonItem2.reasonId);
        } else {
            lLJFF2 = null;
        }
        String strValueOf = String.valueOf(lLJFF2);
        c1ac7.getClass();
        C1AC7.LJIJ(c1aca3, "cta", strValueOf);
        C1ACA c1aca4 = this.LLILZIL;
        if (c1aca4 != null) {
            c1aca4.LJZ = this.LLILZ.LJ;
            c1aca4.LJZL = null;
        }
        C786410Ut5.B5(this.LLILZLL, 1.0f);
        this.LLILZ.LIZLLL = EnumC1779530wPP.SHOWING;
        long j2 = watchReasonConfigConfig.subTitleDuration;
        this.LL = null;
        this.LLILLJJLI = 2;
        if (AnonymousClass0958.LIZIZ(j2, this) == objLJFF) {
            C1C7U.LIZIZ("PreviewSubTitleHelper@e317.startShowSubTitle$1");
            return objLJFF;
        }
        C786410Ut5.B5(this.LLILZLL, 0.0f);
        this.LLILZ.LIZLLL = EnumC1779530wPP.DONE;
        c1aca = this.LLILZIL;
        if (c1aca != null) {
            watchReason.isShowed = true;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreviewSubTitleHelper@e317.startShowSubTitle$1");
        return unit2;
    }
}
