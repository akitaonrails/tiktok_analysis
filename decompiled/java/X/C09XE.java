package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.09XE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$3$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
public final class C09XE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XE(VideoPublishEditModel videoPublishEditModel, Activity activity, InterfaceC1364105Vn<? super C09XE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG c19eg;
        IExternalService iExternalService;
        IAVPublishService iAVPublishServicePublishService;
        C1C7U.LIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventBus.LIZLLL().LJIILL(new C09XF(this.LL.creativeModel.creativeInfo.getCreationId()));
        Activity activity = this.LLILLJJLI;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
            iAVPublishServicePublishService.finishAllCreativeActivity(c19eg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
