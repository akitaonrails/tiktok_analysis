package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$showDMNewStickersPopup$1$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C437450HDj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C0HXZ LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437450HDj(SocialAvatarServiceImpl socialAvatarServiceImpl, String str, boolean z, C19EG c19eg, String str2, String str3, C0HXZ c0hxz, InterfaceC1364105Vn<? super C437450HDj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c19eg;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = c0hxz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437450HDj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.showDMNewStickersPopup$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = ((C437560HDu) ((ISocialAvatarCreationStatusService) this.LL.LIZ.getValue()).LIZ(this.LLILLJJLI).getValue()).LJI;
        C1910890zpH c1910890zpHLJIJJ = this.LL.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sa_dm_stickers_sheet isAISelfSideTask = ");
        sbLIZ.append(z);
        c1910890zpHLJIJJ.LIZ("SocialAvatarService", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL || z) {
            this.LL.LJIJJ().LIZ("SocialAvatarService", "sa_dm_stickers_sheet has been triggered");
            C0HYP.LIZ.getClass();
            C0HYP.LJ().storeBoolean("has_shown_dm_new_stickers_popup", true);
            PopupManager.LJIIZILJ(new C0HXY(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ), new C1668306g5("social_sa_dm_stickers_sheet"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.showDMNewStickersPopup$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
