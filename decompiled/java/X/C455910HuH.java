package X;

import Y.AgS73S0400000_6;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.movinglongpress.IMMovingLongPressReactionPopup$updateAimojiTab$1", f = "IMMovingLongPressReactionPopup.kt", l = {408}, m = "invokeSuspend")
public final class C455910HuH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C455920HuI LLILLJJLI;
    public final /* synthetic */ RecyclerView LLILLL;
    public final /* synthetic */ ViewFlipper LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455910HuH(C455920HuI c455920HuI, RecyclerView recyclerView, ViewFlipper viewFlipper, C19EG c19eg, InterfaceC1364105Vn<? super C455910HuH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c455920HuI;
        this.LLILLL = recyclerView;
        this.LLILZ = viewFlipper;
        this.LLILZIL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455910HuH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMovingLongPressReactionPopup@ddf7.updateAimojiTab$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<IMSocialAvatarStatus> c05ydLJJLI = this.LLILLJJLI.LLJIJIL.LJJLI(null, false);
            AgS73S0400000_6 agS73S0400000_6 = new AgS73S0400000_6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, 4);
            this.LL = 1;
            if (c05ydLJJLI.collect(agS73S0400000_6, this) == objLJFF) {
                C1C7U.LIZIZ("IMMovingLongPressReactionPopup@ddf7.updateAimojiTab$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
