package X;

import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment$initCaptionToggle$2", f = "CaptionsPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C20697715yx extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CaptionsPanelFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20697715yx(CaptionsPanelFragment captionsPanelFragment, InterfaceC1364105Vn<? super C20697715yx> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = captionsPanelFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        InterfaceC20698115z1 interfaceC20698115z1;
        C1C7U.LIZ("CaptionsPanelFragment@ac5.initCaptionToggle$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        Object obj3 = this.LLILLJJLI;
        C20703515zt c20703515zt = C20703515zt.LIZ;
        C20698415z4 c20698415z4 = this.LLILLL.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z1 = c20698415z4.LIZ) != null) {
            aweme = interfaceC20698115z1.getAweme();
        } else {
            aweme = null;
        }
        c20703515zt.getClass();
        if (!C20703515zt.LJJIII(aweme)) {
            obj2 = obj3;
        }
        C1C7U.LIZIZ("CaptionsPanelFragment@ac5.initCaptionToggle$2");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C20697715yx c20697715yx = new C20697715yx(this.LLILLL, interfaceC1364105Vn);
        c20697715yx.LL = bool;
        c20697715yx.LLILLJJLI = bool2;
        return c20697715yx.invokeSuspend(Unit.LIZ);
    }
}
