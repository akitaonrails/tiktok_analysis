package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl.GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.GamePreregisterResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882070z4n extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1882050z4l LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882070z4n(C1882050z4l c1882050z4l, C013C c013c, C013C c013c2, String str) {
        super(1);
        this.LL = c1882050z4l;
        this.LLILLJJLI = c013c;
        this.LLILLL = c013c2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle2;
        boolean zBooleanValue = bool.booleanValue();
        C1882050z4l c1882050z4l = this.LL;
        GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 = c1882050z4l.LLILLJJLI;
        if (gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 != null && (lifecycleOwner = c1882050z4l.LL.getPage().getLifecycleOwner()) != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
            lifecycle2.removeObserver(gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2);
        }
        C1882050z4l c1882050z4l2 = this.LL;
        c1882050z4l2.LLILLJJLI = null;
        if (this.LLILLJJLI.element) {
            GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 gamePreregisterService$handlePreregisterForEvent$notifyTask$1$22 = new GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2(this.LLILLL, c1882050z4l2, this.LLILZ, zBooleanValue);
            LifecycleOwner lifecycleOwner2 = c1882050z4l2.LL.getPage().getLifecycleOwner();
            if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                lifecycle.addObserver(gamePreregisterService$handlePreregisterForEvent$notifyTask$1$22);
            }
            c1882050z4l2.LLILLJJLI = gamePreregisterService$handlePreregisterForEvent$notifyTask$1$22;
        } else {
            GamePreregisterResultParam gamePreregisterResultParam = new GamePreregisterResultParam();
            String str = this.LLILZ;
            C1882050z4l c1882050z4l3 = this.LL;
            gamePreregisterResultParam.isRegister = true;
            gamePreregisterResultParam.gameId = str;
            gamePreregisterResultParam.result = zBooleanValue;
            gamePreregisterResultParam.from = c1882050z4l3.LL.getPage().LIZLLL();
            C1882650z5j.LIZIZ("gamePartnershipMixViewReserveAndOpenCompletion", gamePreregisterResultParam);
        }
        return Unit.LIZ;
    }
}
