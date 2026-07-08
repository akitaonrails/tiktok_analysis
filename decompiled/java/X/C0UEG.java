package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UEG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEG extends C09AY implements Function1<LiveEffect, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;
    public final /* synthetic */ InterfaceC769000UEo LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0UEG(boolean z, LiveEffect liveEffect, InterfaceC769000UEo interfaceC769000UEo, String str, Function1<? super LiveEffect, Unit> function1) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = liveEffect;
        this.LLILLL = interfaceC769000UEo;
        this.LLILZ = str;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LiveEffect liveEffect) {
        String resourceId;
        LiveEffect liveEffect2 = liveEffect;
        if (this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceResumeEffect is true, need resume resourceId is ");
            sbLIZ.append(liveEffect2.getResourceId());
            C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
            C0UEH.LJ = liveEffect2;
        } else if (C0UEH.LJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cache need resume resourceId is ");
            LiveEffect liveEffect3 = C0UEH.LIZLLL;
            if (liveEffect3 != null) {
                resourceId = liveEffect3.getResourceId();
            } else {
                resourceId = null;
            }
            sbLIZ2.append(resourceId);
            C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ2));
            C0UEH.LJ = C0UEH.LIZLLL;
        }
        if (this.LLILLJJLI != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("current sticker is ");
            sbLIZ3.append(this.LLILLJJLI.getResourceId());
            sbLIZ3.append(", apply sticker is ");
            sbLIZ3.append(liveEffect2.getResourceId());
            C20441214yg.LIZIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLILLL.Gr(C0UD4.LJ, this.LLILLJJLI, liveEffect2);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("apply sticker is ");
            sbLIZ4.append(liveEffect2.getResourceId());
            C20441214yg.LIZIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ4));
            this.LLILLL.kr(liveEffect2, C0UD4.LJ);
        }
        C0UC5 c0uc5 = C0UC5.LIZ;
        c0uc5.LIZJ(liveEffect2, C0UEH.LIZIZ, 0, false, this.LLILZ);
        c0uc5.LJIIJ(this.LLILLJJLI, C0UEH.LIZIZ);
        this.LLILZIL.invoke(liveEffect2);
        return Unit.LIZ;
    }
}
