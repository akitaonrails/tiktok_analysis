package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Rqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.statemachine.aweme.TranslationStateMachine$subscribeToIndividualSettingsChanges$4$1", f = "TranslationStateMachine.kt", l = {}, m = "invokeSuspend")
public final class C708660Rqy extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708660Rqy(C207118162y c207118162y, InterfaceC1364105Vn<? super C708660Rqy> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c207118162y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        C1C7U.LIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20703515zt c20703515zt = C20703515zt.LIZ;
        VideoItemParams videoItemParams = this.LL.LJI;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        c20703515zt.getClass();
        Boolean boolValueOf = Boolean.valueOf(C20703515zt.LJIL(aweme));
        C1C7U.LIZIZ("TranslationStateMachine@b563.subscribeToIndividualSettingsChanges$4$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C708660Rqy(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
