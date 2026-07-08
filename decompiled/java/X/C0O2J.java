package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0O2J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger$onViewCreated$1", f = "EditCaptionBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0O2J extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditCaptionBottomBarAssemTrigger LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2J(EditCaptionBottomBarAssemTrigger editCaptionBottomBarAssemTrigger, InterfaceC1364105Vn<? super C0O2J> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = editCaptionBottomBarAssemTrigger;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        C1C7U.LIZ("EditCaptionBottomBarAssemTrigger@fe8b.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Object obj3 = this.LLILLJJLI;
        C20703515zt c20703515zt = C20703515zt.LIZ;
        VideoItemParams videoItemParams = this.LLILLL.LLJL;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        c20703515zt.getClass();
        if (!C20703515zt.LJJIII(aweme)) {
            obj2 = obj3;
        }
        C1C7U.LIZIZ("EditCaptionBottomBarAssemTrigger@fe8b.onViewCreated$1");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C0O2J c0o2j = new C0O2J(this.LLILLL, interfaceC1364105Vn);
        c0o2j.LL = bool;
        c0o2j.LLILLJJLI = bool2;
        return c0o2j.invokeSuspend(Unit.LIZ);
    }
}
