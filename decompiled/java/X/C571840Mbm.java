package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$3$2", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
public final class C571840Mbm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C571840Mbm(Activity activity, VideoPublishEditModel videoPublishEditModel, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C571840Mbm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C571840Mbm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1439030nYD c1439030nYD = C1439030nYD.LIZ;
        Activity activity = this.LL;
        Bundle bundle = new Bundle();
        c1439030nYD.getClass();
        Intent intentLIZ = C1439030nYD.LIZ(activity, bundle);
        C1433240nOs c1433240nOs = C1433240nOs.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        String str = this.LLILLL.element;
        c1433240nOs.getClass();
        if (C571860Mbo.LIZ.enable) {
            intentLIZ.putExtra("multi_publish_id", str);
            intentLIZ.putExtra("enter_from", videoPublishEditModel.getEnterFrom());
            intentLIZ.putExtra("enter_method", videoPublishEditModel.getShootEnterMethod());
        }
        Activity activity2 = this.LL;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intentLIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZ, activity2);
        C2204961BRm.LJIILLIIL(activity2, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmra5rKyT4H/VloXZEU8+FRKq8C8XWGTc+QMuv+YkDPaECDvH+gFu6Zc1ljNnY=", null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStoryGroupTaskPublisher@cdde.startPublish$publishJob$1$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
