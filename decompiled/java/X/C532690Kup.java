package X;

import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AlbumAIGCComponentImpl$observeEffectClear$1", f = "AlbumAIGCComponentImpl.kt", l = {}, m = "invokeSuspend")
public final class C532690Kup extends C09AX implements Function2<Effect, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C532700Kuq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532690Kup(C532700Kuq c532700Kuq, InterfaceC1364105Vn<? super C532690Kup> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532700Kuq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532690Kup c532690Kup = new C532690Kup(this.LLILLJJLI, interfaceC1364105Vn);
        c532690Kup.LL = obj;
        return c532690Kup;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ApplyRecordEffectInfo applyRecordEffectInfoLIZLLL;
        C1C7U.LIZ("AlbumAIGCComponentImpl@49d8.observeEffectClear$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ApplyRecordEffectInfo applyRecordEffectInfoLIZ = null;
        if (this.LL == null) {
            ShortVideoContext shortVideoContext = this.LLILLJJLI.getShortVideoContext();
            if (shortVideoContext != null) {
                shortVideoContext.creativeModel.recordEffectModel.applyRecordEffectInfo = null;
            }
        } else {
            ShortVideoContext shortVideoContext2 = this.LLILLJJLI.getShortVideoContext();
            if (shortVideoContext2 != null) {
                applyRecordEffectInfoLIZLLL = shortVideoContext2.LIZLLL();
            } else {
                applyRecordEffectInfoLIZLLL = null;
            }
            ShortVideoContext shortVideoContext3 = this.LLILLJJLI.getShortVideoContext();
            if (shortVideoContext3 != null) {
                if (applyRecordEffectInfoLIZLLL != null) {
                    applyRecordEffectInfoLIZ = ApplyRecordEffectInfo.LIZ(applyRecordEffectInfoLIZLLL, true);
                }
                shortVideoContext3.creativeModel.recordEffectModel.applyRecordEffectInfo = applyRecordEffectInfoLIZ;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumAIGCComponentImpl@49d8.observeEffectClear$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Effect effect, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(effect, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
