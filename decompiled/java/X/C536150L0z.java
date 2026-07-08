package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.viewholder.AILivePhotoShootViewHolder$clickListener$1$1$onLoad$1$1", f = "AILivePhotoShootViewHolder.kt", l = {45}, m = "invokeSuspend")
public final class C536150L0z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C535990L0j LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536150L0z(C535990L0j c535990L0j, View view, InterfaceC1364105Vn<? super C536150L0z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c535990L0j;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C536150L0z(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IAILiveService aiLiveService = IAILiveServiceKt.getAiLiveService();
            if (aiLiveService != null) {
                ShortVideoContext shortVideoContext = this.LLILLJJLI.getShortVideoContext();
                Context context = this.LLILLL.getContext();
                this.LL = 1;
                if (aiLiveService.processMusicFollowingCreation(shortVideoContext, context, this) == objLJFF) {
                    C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoShootViewHolder@8c86.clickListener$1$1$onLoad$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
