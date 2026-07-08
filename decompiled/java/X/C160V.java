package X;

import android.content.Context;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.160V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160V extends C09AY implements Function0<AnonymousClass1601> {
    public final /* synthetic */ CLACaptionAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160V(CLACaptionAssemV2 cLACaptionAssemV2) {
        super(0);
        this.LL = cLACaptionAssemV2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1601] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1601 invoke() {
        final CLACaptionAssemV2 cLACaptionAssemV2 = this.LL;
        return new AnonymousClass1615() { // from class: X.1601
            @Override // X.AnonymousClass1615
            public final void LIZ() {
                CLACaptionAssemV2 cLACaptionAssemV22 = cLACaptionAssemV2;
                cLACaptionAssemV22.getClass();
                CLACaptionViewModelV2 cLACaptionViewModelV2Bp = cLACaptionAssemV22.Bp();
                cLACaptionViewModelV2Bp.getClass();
                String strLIZ = AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp);
                VideoItemParams item = cLACaptionAssemV22.Bp().getItem();
                String str = item != null ? item.mEventType : null;
                EnumC1390800mIQ enumC1390800mIQ = EnumC1390800mIQ.CLICK_SUBTITLE;
                Context context = cLACaptionAssemV22.getContext();
                C1440005kM.LIZ(new C715480S4s(strLIZ, str, enumC1390800mIQ, System.identityHashCode(context != null ? C1388190mED.LIZ(context) : null)));
                Context context2 = cLACaptionAssemV2.getContext();
                if (context2 != null) {
                    AnonymousClass1607 anonymousClass1607 = cLACaptionAssemV2.Bp().wQ2().LL;
                    AnonymousClass1600 anonymousClass1600 = (AnonymousClass1600) anonymousClass1607.LLILLJJLI.getValue();
                    boolean zW1 = anonymousClass1607.LL.w1();
                    anonymousClass1600.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    anonymousClass1600.LIZ(c2344009Gk, null);
                    anonymousClass1600.LJIIJ(c2344009Gk);
                    anonymousClass1600.LJIIIZ(c2344009Gk, zW1);
                    anonymousClass1600.LIZLLL(c2344009Gk);
                    anonymousClass1600.LIZJ(c2344009Gk);
                    anonymousClass1600.LJ(c2344009Gk);
                    anonymousClass1600.LIZIZ(c2344009Gk);
                    c2344009Gk.LIZJ(0, "have_tts");
                    c2344009Gk.LIZJ(0, "use_tts");
                    anonymousClass1600.LJII(c2344009Gk, zW1);
                    AnonymousClass1600.LJIIIIZZ(c2344009Gk);
                    anonymousClass1600.LJI(c2344009Gk);
                    c2344009Gk.LIZJ(!zW1, "use_transl");
                    c2344009Gk.LIZJ(C0SXF.LJJIII(context2, anonymousClass1600.LIZ), "is_landscape_screen");
                    C207069161b.LJFF(new AnonymousClass0174(), "click_subtitle", c2344009Gk.LIZ);
                }
            }

            @Override // X.AnonymousClass1615
            public final void LIZIZ() {
                AnonymousClass1602 anonymousClass1602 = cLACaptionAssemV2.Bp().wQ2().LLILLL;
                anonymousClass1602.LIZ(false);
                C746760TRa.LIZ().LJIILLIIL(true);
                if (anonymousClass1602.LL.YF0()) {
                    C746760TRa.LIZ().LJIIJ(true);
                } else {
                    C746760TRa.LIZ().LJJJI(true);
                }
                C1440005kM.LIZ(new C160R(anonymousClass1602.LL.getAwemeId(), EnumC1390800mIQ.CLICK_SUBTITLE));
                CLACaptionViewModelV2 cLACaptionViewModelV2Bp = cLACaptionAssemV2.Bp();
                EnumC1390800mIQ enumC1390800mIQ = EnumC1390800mIQ.CLICK_ICON;
                Context context = cLACaptionAssemV2.getContext();
                AnonymousClass1607 anonymousClass1607 = cLACaptionViewModelV2Bp.wQ2().LL;
                if (anonymousClass1607.LL.rK()) {
                    AnonymousClass1600 anonymousClass1600 = (AnonymousClass1600) anonymousClass1607.LLILLJJLI.getValue();
                    boolean zW1 = anonymousClass1607.LL.w1();
                    VideoItemParams videoItemParams = anonymousClass1607.LL.getVideoItemParams();
                    int iLJJIII = C0SXF.LJJIII(context, videoItemParams != null ? videoItemParams.getAweme() : null);
                    double dLF1 = anonymousClass1607.LL.LF1();
                    anonymousClass1600.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    anonymousClass1600.LIZ(c2344009Gk, null);
                    c2344009Gk.LJIIIIZZ("enter_method", enumC1390800mIQ.getValue());
                    anonymousClass1600.LJ(c2344009Gk);
                    anonymousClass1600.LJIIJ(c2344009Gk);
                    anonymousClass1600.LIZJ(c2344009Gk);
                    anonymousClass1600.LJIIIZ(c2344009Gk, zW1);
                    anonymousClass1600.LIZLLL(c2344009Gk);
                    c2344009Gk.LIZJ(0, "have_tts");
                    c2344009Gk.LIZJ(0, "use_tts");
                    anonymousClass1600.LJII(c2344009Gk, zW1);
                    anonymousClass1600.LJI(c2344009Gk);
                    c2344009Gk.LIZJ(iLJJIII, "is_landscape_screen");
                    c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                    anonymousClass1600.LIZIZ(c2344009Gk);
                    AnonymousClass1600.LJIIIIZZ(c2344009Gk);
                    anonymousClass1600.LJ(c2344009Gk);
                    c2344009Gk.LIZJ(1, "is_captions_intro_show");
                    c2344009Gk.LIZ(dLF1, "launch_volume_pct");
                    C207069161b.LJFF(new AnonymousClass0174(), "expand_subtitle", c2344009Gk.LIZ);
                }
            }
        };
    }
}
