package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS4S3400000_6;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS7S3400000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387580mDE extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C0HTT<C737030Svd> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387580mDE(Context context, C0HTT c0htt, Aweme aweme, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, Function0 function03) {
        super(1);
        this.LL = function0;
        this.LLILLJJLI = context;
        this.LLILLL = aweme;
        this.LLILZ = c0htt;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = function02;
        this.LLJI = function03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int i;
        AwemeStatus statusSafety;
        int i2;
        int i3;
        boolean zBooleanValue = bool.booleanValue();
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this.LLILLJJLI;
        final Aweme aweme = this.LLILLL;
        C0HTT<C737030Svd> c0htt = this.LLILZ;
        final String str = this.LLILZIL;
        final String str2 = this.LLILZLL;
        final String str3 = this.LLIZ;
        String str4 = this.LLIZLLLIL;
        final Function0<Unit> function02 = this.LLJ;
        Function0<Unit> function03 = this.LLJI;
        C013C c013c = new C013C();
        c013c.element = zBooleanValue;
        C21566919al c21566919al = new C21566919al(context);
        if (aweme.getStarAtlasOrderId() > 0) {
            c21566919al.LIZ(2131830539);
            c013c.element = false;
        } else {
            c0htt = c0htt;
            if (!((ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class)).LJI(context).LIZ(aweme, c013c.element, new AwS7S3400000_6(c0htt, aweme, c013c, str2, str, str3, function02, 0))) {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.isAdvPromotable()) {
                    if (c013c.element) {
                        i3 = 2131844935;
                    } else {
                        i3 = 2131845628;
                    }
                    c21566919al.LIZ(i3);
                    c013c = c013c;
                } else {
                    AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
                    if (statusSafety2 != null && statusSafety2.isInReviewing() && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.isSelfSee()) {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        c1397580mTM.LJFF(2131844907);
                        if (c013c.element) {
                            i2 = 2131844938;
                        } else {
                            i2 = 2131844906;
                        }
                        c1397580mTM.LIZ(i2);
                        C985403tE.LIZ(c1397580mTM, new AwS4S3400000_6(c0htt, aweme, c013c, str2, str, str3, function02, 1));
                        c1397580mTM.LIZJ(new AwS598S0100000_19(function03, (Function0<Unit>) 603));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    } else if (C729510SjV.LJJ(aweme)) {
                        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
                        if (iExternalService.configService().avsettingsConfig().enableReeditPostedDraftAfterDelete()) {
                            if (AwemeExtKt.isProhibited(aweme)) {
                                ComplianceServiceProvider.LJI().LJJIIJ(context, c0htt, aweme, false);
                            } else {
                                if (Intrinsics.LJFF(str, "story_views_list_panel")) {
                                    C1387490mD5.LJ(aweme, str2, str4, str3, str);
                                }
                                C1387490mD5.LJIIIZ(context, c0htt, aweme, str2, str, str3, false, null, function03);
                            }
                        } else {
                            c0htt = c0htt;
                            if (!iExternalService.configService().avsettingsConfig().enableSharePanelTuxDialogRefactor() && !C281310B0v.LIZ()) {
                                c21566919al.LIZ(2131830546);
                                c013c = c013c;
                            } else if (AwemeExtKt.isProhibited(aweme)) {
                                ComplianceServiceProvider.LJI().LJJIIJ(context, c0htt, aweme, false);
                            } else {
                                if (Intrinsics.LJFF(str, "story_views_list_panel")) {
                                    C1387490mD5.LJ(aweme, str2, str4, str3, str);
                                }
                                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0HIM(context, c0htt, aweme, str2, str, str3, null), 3);
                            }
                        }
                    } else {
                        c0htt = c0htt;
                        if (C591970NJr.LIZIZ().LIZIZ(aweme)) {
                            c21566919al.LIZ(2131838385);
                            c013c.element = false;
                            c013c = c013c;
                        } else {
                            IExternalService iExternalService2 = (IExternalService) ServiceManager.get().getService(IExternalService.class);
                            if (Intrinsics.LJFF(str, "story_views_list_panel")) {
                                C1387490mD5.LJ(aweme, str2, str4, str3, str);
                            }
                            if (iExternalService2.configService().avsettingsConfig().enableReeditPostedDraftAfterDelete()) {
                                C1387490mD5.LJIIIZ(context, c0htt, aweme, str2, str, str3, c013c.element, function02, function03);
                            } else if (iExternalService2.configService().avsettingsConfig().enableSharePanelTuxDialogRefactor()) {
                                C23250099c.LIZLLL(C2296808zG.LIZIZ(), null, null, new C0HIL(context, c0htt, aweme, str2, str, str3, c013c, function02, null), 3);
                            } else {
                                c013c = c013c;
                                if (c013c.element) {
                                    c21566919al.LJFF(2131844940);
                                }
                                if (c013c.element) {
                                    i = 2131844933;
                                } else {
                                    i = 2131830531;
                                }
                                c21566919al.LIZ(i);
                            }
                        }
                    }
                }
            }
            return Unit.LIZ;
        }
        c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.0mDD
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C1387490mD5.LJFF(false, aweme, str2, str, str3, null, 224);
            }
        }, false);
        final C0HTT<C737030Svd> c0htt2 = c0htt;
        final C013C c013c2 = c013c;
        c21566919al.LJIIJ(2131830529, new DialogInterface.OnClickListener() { // from class: X.0HXl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C0HTT<C737030Svd> c0htt3 = c0htt2;
                if (c0htt3 != null) {
                    C737030Svd c737030Svd = new C737030Svd(2, aweme);
                    c737030Svd.LJIJ = Boolean.valueOf(c013c2.element);
                    c0htt3.LLIIL(c737030Svd);
                }
                C1387490mD5.LJFF(true, aweme, str2, str, str3, null, 224);
                Function0<Unit> function04 = function02;
                if (function04 != null) {
                    function04.invoke();
                }
                dialogInterface.dismiss();
            }
        }, false);
        c21566919al.LIZLLL(AFwS259S0000000_21.get$arr$(338));
        c21566919al.LJ(AFwS259S0000000_21.get$arr$(337));
        new C21566519ah(c21566919al).LIZLLL();
        return Unit.LIZ;
    }
}
