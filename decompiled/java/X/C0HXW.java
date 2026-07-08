package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.share.ShareService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HXW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.entrances.SocialAvatarShareToDMPopTask$showPopup$1", f = "SocialAvatarShareToDMPopTask.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C0HXW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0HXX LLILLJJLI;
    public final /* synthetic */ C20656615sK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HXW(C0HXX c0hxx, C20656615sK c20656615sK, InterfaceC1364105Vn<? super C0HXW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hxx;
        this.LLILLL = c20656615sK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HXW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarShareToDMPopTask@262a.showPopup$1");
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
            ShareService shareService = (ShareService) this.LLILLJJLI.LLILLL.getValue();
            C19EG c19eg = this.LLILLJJLI.LL;
            Bundle bundle = new Bundle();
            this.LL = 1;
            if (shareService.LJJII(c19eg, bundle, this) == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarShareToDMPopTask@262a.showPopup$1");
                return objLJFF;
            }
        }
        this.LLILLL.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarShareToDMPopTask@262a.showPopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
