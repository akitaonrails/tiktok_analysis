package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.util.IShareLinkService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0e4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment$shareToThirdChannel$3", f = "SocialAvatarDownloadShareFragment.kt", l = {380}, m = "invokeSuspend")
public final class C1074920e4w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarDownloadShareFragment LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074920e4w(SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment, InterfaceC1369790lkX interfaceC1369790lkX, Context context, InterfaceC1364105Vn<? super C1074920e4w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarDownloadShareFragment;
        this.LLILLL = interfaceC1369790lkX;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074920e4w(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$3");
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
            IShareLinkService iShareLinkService = (IShareLinkService) this.LLILLJJLI.LLJLLIL.getValue();
            InterfaceC1369790lkX interfaceC1369790lkX = this.LLILLL;
            HashMap mapLJI = C2097608Jq.LJI(new Pair("extra_from_social_avatar_download_page", "1"));
            this.LL = 1;
            obj = iShareLinkService.LIZLLL(interfaceC1369790lkX, mapLJI, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$3");
                return objLJFF;
            }
        }
        C1371430lnB c1371430lnB = (C1371430lnB) obj;
        C1370950lmP c1370950lmP = SharePackage.Companion;
        String str = c1371430lnB.LIZLLL;
        c1370950lmP.getClass();
        if (str.length() > 0) {
            this.LLILLL.LJJIFFI(c1371430lnB, this.LLILZ, null);
            if (Intrinsics.LJFF(this.LLILLL.key(), "copy")) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
                c1389890mGx.LJIIIZ(2131829543);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx2.LJIIIZ(2131848062);
            c1389890mGx2.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
