package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.util.IShareLinkService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ltY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment$shareToThirdChannel$1", f = "SocialAvatarDownloadShareFragment.kt", l = {341}, m = "invokeSuspend")
public final class C1375380ltY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarDownloadShareFragment LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;
    public final /* synthetic */ C259800zU<C1374270lrl> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375380ltY(SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment, InterfaceC1369790lkX interfaceC1369790lkX, C259800zU<C1374270lrl> c259800zU, String str, Context context, InterfaceC1364105Vn<? super C1375380ltY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarDownloadShareFragment;
        this.LLILLL = interfaceC1369790lkX;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1375380ltY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.0lrl] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$1");
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
                C1C7U.LIZIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$1");
                return objLJFF;
            }
        }
        C1371430lnB c1371430lnB = (C1371430lnB) obj;
        C1370950lmP c1370950lmP = SharePackage.Companion;
        String str = c1371430lnB.LIZLLL;
        c1370950lmP.getClass();
        if (str.length() > 0) {
            this.LLILZ.element = new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), this.LLILZIL), c1371430lnB.LIZLLL, null, null, 56);
            C1374270lrl c1374270lrl = this.LLILZ.element;
            if (c1374270lrl != null) {
                InterfaceC1369790lkX interfaceC1369790lkX2 = this.LLILLL;
                Context context = this.LLILZLL;
                String str2 = c1374270lrl.LJ;
                if (str2 == null) {
                    str2 = "";
                }
                c1374270lrl.LIZIZ("content_url", str2);
                c1374270lrl.LIZIZ("media_type", "video/*");
                interfaceC1369790lkX2.LJIJ(c1374270lrl, context, null);
            }
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131848062);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarDownloadShareFragment@f3fb.shareToThirdChannel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
