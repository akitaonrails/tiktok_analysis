package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import avg.f;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.router.AdUnifyJumpModel;
import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.component.comment.PromoCodeApi;
import com.ss.android.ugc.aweme.component.comment.model.PromoCodeAddNoticeRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.AnoleCommentTopBarModel;
import com.ss.android.ugc.aweme.model.CommentTopBarUIModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0cS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1012390cS5 extends AbstractC1014240cV4 implements View.OnClickListener {
    public final AnoleCommentTopBarModel LLJLIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        View view = this.LLJJIJIL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 41));
        }
        LJIIJ().logAd(C1012550cSL.LIZ, new AwS595S0100000_16(this, 85));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Aweme aweme;
        AdUnifyJumpModel jumpModel;
        boolean z;
        String str;
        String str2;
        String aid;
        String promoCode;
        String promoCode2;
        Context contextLIZIZ;
        CommentTopBarUIModel uiModel;
        String promoCodeCopiedText;
        String promoId;
        String promoCodeNoticeMsg;
        CommentTopBarUIModel uiModel2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        String promoCodeCopiedText2;
        CommentTopBarUIModel uiModel3;
        CommentTopBarUIModel uiModel4;
        CommentTopBarUIModel uiModel5;
        Context context;
        String aid2;
        GMTBaseModel gMTBaseModelLIZ;
        InterfaceC1014340cVE interfaceC1014340cVE = this.LLJJJJ;
        if (interfaceC1014340cVE != null) {
            interfaceC1014340cVE.LJII();
        }
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1009340cNA c1009340cNA = this.LLILLJJLI;
        Object obj = c1009340cNA.LIZJ;
        String promoCodeNoticeMsg2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        AwemeRawAd awemeRawAd = c1009340cNA.LIZLLL;
        AnoleCommentTopBarModel anoleCommentTopBarModel = this.LLJLIL;
        if (anoleCommentTopBarModel != null) {
            jumpModel = anoleCommentTopBarModel.getJumpModel();
        } else {
            jumpModel = null;
        }
        boolean z2 = false;
        if (aweme != null && AwemeExtKt.isTextMoreAd(aweme)) {
            C0SWD.LIZ = 1;
        }
        AnoleCommentTopBarModel anoleCommentTopBarModel2 = this.LLJLIL;
        if (anoleCommentTopBarModel2 != null && anoleCommentTopBarModel2.getAiBotEnable()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (z) {
            ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
            if (iCRouterManager != null) {
                View view2 = this.LLJJIJIL;
                if (view2 == null || (context = view2.getContext()) == null) {
                    context = this.LLILZ;
                }
                if (aweme == null || (aid2 = aweme.getAid()) == null) {
                    aid2 = "";
                }
                AwemeRawAd awemeRawAd2 = this.LLILLJJLI.LIZLLL;
                ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
                if (iCRouterModelTransform != null) {
                    gMTBaseModelLIZ = iCRouterModelTransform.LIZ(this.LLILLJJLI.LIZLLL);
                } else {
                    gMTBaseModelLIZ = null;
                }
                C1025880cnq c1025880cnq = new C1025880cnq(context, aid2, aweme, awemeRawAd2, gMTBaseModelLIZ);
                String tag = this.LL.getTag();
                if (tag == null) {
                    tag = "anole_ad";
                }
                String refer = this.LL.getRefer();
                if (refer != null) {
                    str3 = refer;
                }
                C1025520cnG c1025520cnG = new C1025520cnG(null, "ai_agent_feed_entrance", null, str3, tag, -1, null, null, 965);
                CRouterCoreModel cRouterCoreModel = new CRouterCoreModel(null, 0, null, new CRouterWebModel(awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle(), false, false, 0, null), null, null, null);
                if (this.LLJLIL.getQuestion() != null) {
                    z2 = true;
                }
                CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(c1025880cnq, c1025520cnG, new C1021060cg4(cRouterCoreModel, new C1025430cn7(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, new AiAgentConfig(z2, this.LLJLIL.getQuestion(), awemeRawAd.getBotConfig()), 95), 4), true);
                if (cRouterManagerLIZLLL != null) {
                    cRouterManagerLIZLLL.LJI();
                }
            }
        } else if (jumpModel != null) {
            ICommerceNavigateService iCommerceNavigateService = (ICommerceNavigateService) ServiceManager.get().getService(ICommerceNavigateService.class);
            Context context2 = this.LLILZ;
            AnoleLogInfo logInfo = this.LL.getLogInfo();
            if (logInfo == null || (str = logInfo.tag) == null) {
                str = "";
            }
            AnoleLogInfo logInfo2 = this.LL.getLogInfo();
            if (logInfo2 == null || (str2 = logInfo2.refer) == null) {
                str2 = "";
            }
            if (aweme != null && (aid = aweme.getAid()) != null) {
                str3 = aid;
            }
            iCommerceNavigateService.LIZIZ(context2, aweme, jumpModel, new C1027520cqU(str, str2, str3, (String) null, 24));
        } else {
            this.LLILLL.LJIJ(new C991670buf(C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.REPORT_CLICK.getRName(), Boolean.FALSE))), this);
        }
        AnoleCommentTopBarModel anoleCommentTopBarModel3 = this.LLJLIL;
        if (anoleCommentTopBarModel3 != null && (uiModel5 = anoleCommentTopBarModel3.getUiModel()) != null) {
            promoCode = uiModel5.getPromoCode();
        } else {
            promoCode = null;
        }
        if (!TextUtils.isEmpty(promoCode)) {
            try {
                AnoleCommentTopBarModel anoleCommentTopBarModel4 = this.LLJLIL;
                if (anoleCommentTopBarModel4 != null && (uiModel = anoleCommentTopBarModel4.getUiModel()) != null) {
                    promoCode2 = uiModel.getPromoCode();
                } else {
                    promoCode2 = null;
                }
                AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ2 == null || (contextLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) == null) {
                    contextLIZIZ = this.LLILZ;
                }
                C20145813s8.LIZ("label", promoCode2, contextLIZIZ, CertProviderManagerKt.findCert("bpea-ad_comment_top_bar_copy_promo_code", 1476399155));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C805380Via.LIZJ(th, "comment top bar copy promo code fail");
            }
        }
        AnoleCommentTopBarModel anoleCommentTopBarModel5 = this.LLJLIL;
        if (anoleCommentTopBarModel5 != null && (uiModel4 = anoleCommentTopBarModel5.getUiModel()) != null) {
            promoCodeCopiedText = uiModel4.getPromoCodeCopiedText();
        } else {
            promoCodeCopiedText = null;
        }
        if (!TextUtils.isEmpty(promoCodeCopiedText) && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.zi);
            AnoleCommentTopBarModel anoleCommentTopBarModel6 = this.LLJLIL;
            if (anoleCommentTopBarModel6 != null && (uiModel3 = anoleCommentTopBarModel6.getUiModel()) != null) {
                promoCodeCopiedText2 = uiModel3.getPromoCodeCopiedText();
            } else {
                promoCodeCopiedText2 = null;
            }
            c1389890mGx.LJIIJ(promoCodeCopiedText2);
            c1389890mGx.LJIIJJI();
        }
        LJIIJ().logAd(C1012410cS7.LIZ, new AwS595S0100000_16(this, 86));
        AnoleCommentTopBarModel anoleCommentTopBarModel7 = this.LLJLIL;
        if (anoleCommentTopBarModel7 != null && (uiModel2 = anoleCommentTopBarModel7.getUiModel()) != null) {
            promoId = uiModel2.getPromoId();
        } else {
            promoId = null;
        }
        if (C123100dR.LIZ(promoId)) {
            LJIIJ().logAd(C1012440cSA.LIZ, new AwS595S0100000_16(this, 87));
        }
        AnoleCommentTopBarModel anoleCommentTopBarModel8 = this.LLJLIL;
        if (anoleCommentTopBarModel8 != null) {
            promoCodeNoticeMsg = anoleCommentTopBarModel8.getPromoCodeNoticeMsg();
        } else {
            promoCodeNoticeMsg = null;
        }
        if (C123100dR.LIZ(promoCodeNoticeMsg)) {
            PromoCodeApi.LIZ.getClass();
            PromoCodeApi promoCodeApiLIZ = C1012420cS8.LIZ();
            if (promoCodeApiLIZ != null) {
                AnoleCommentTopBarModel anoleCommentTopBarModel9 = this.LLJLIL;
                if (anoleCommentTopBarModel9 != null) {
                    promoCodeNoticeMsg2 = anoleCommentTopBarModel9.getPromoCodeNoticeMsg();
                }
                C0X9S<BaseResponse> c0x9sAddNotice = promoCodeApiLIZ.addNotice(new PromoCodeAddNoticeRequest(promoCodeNoticeMsg2));
                if (c0x9sAddNotice != null) {
                    c0x9sAddNotice.enqueue(new C09SL());
                }
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        boolean zLJFF;
        boolean z;
        boolean z2;
        String avatar;
        String title;
        int i;
        int i2;
        View.OnClickListener fVar;
        CommentTopBarUIModel uiModel;
        CommentTopBarUIModel uiModel2;
        Integer numLIZJ;
        int i3;
        CommentTopBarUIModel uiModel3;
        CommentTopBarUIModel uiModel4;
        String avatar2;
        CommentTopBarUIModel uiModel5;
        super.Fk(viewGroup, interfaceC1014340cVE);
        Context context = viewGroup.getContext();
        if (context != null) {
            C06ZF c06zf = new C06ZF(context);
            AnoleCommentTopBarModel anoleCommentTopBarModel = this.LLJLIL;
            int i4 = 0;
            if (anoleCommentTopBarModel != null && (uiModel5 = anoleCommentTopBarModel.getUiModel()) != null) {
                zLJFF = Intrinsics.LJFF(uiModel5.isDefaultICon(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            boolean z3 = !zLJFF;
            AnoleCommentTopBarModel anoleCommentTopBarModel2 = this.LLJLIL;
            if (anoleCommentTopBarModel2 != null && anoleCommentTopBarModel2.getAiBotEnable()) {
                z = true;
            } else {
                z = false;
            }
            String information = null;
            if (z && ((uiModel4 = this.LLJLIL.getUiModel()) == null || (avatar2 = uiModel4.getAvatar()) == null || avatar2.length() == 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            AnoleCommentTopBarModel anoleCommentTopBarModel3 = this.LLJLIL;
            if (anoleCommentTopBarModel3 == null || (uiModel3 = anoleCommentTopBarModel3.getUiModel()) == null || (avatar = uiModel3.getAvatar()) == null) {
                avatar = "";
            }
            View slotLayoutFromXml = c06zf.getSlotLayoutFromXml();
            if (slotLayoutFromXml != null) {
                if (!z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, slotLayoutFromXml);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZB(avatar, c06zf, null), 3);
            c06zf.getAvatarContainerFromXml().setCardBackgroundColor(0);
            if (z3 && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, c06zf.getContext())) != null) {
                c06zf.getAvatarContainerFromXml().setStrokeColor(numLIZJ.intValue());
                c06zf.getAvatarContainerFromXml().setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
            }
            AnoleCommentTopBarModel anoleCommentTopBarModel4 = this.LLJLIL;
            if (anoleCommentTopBarModel4 != null && (uiModel2 = anoleCommentTopBarModel4.getUiModel()) != null) {
                title = uiModel2.getTitle();
            } else {
                title = null;
            }
            AnoleCommentTopBarModel anoleCommentTopBarModel5 = this.LLJLIL;
            if (anoleCommentTopBarModel5 != null && (uiModel = anoleCommentTopBarModel5.getUiModel()) != null) {
                information = uiModel.getInformation();
            }
            c06zf.getTitleTvFromXml().setText(title);
            c06zf.getDescriptionTvFromXml().setText(information);
            TuxTextView titleTvFromXml = c06zf.getTitleTvFromXml();
            if (C123100dR.LIZ(title)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, titleTvFromXml);
            TuxTextView descriptionTvFromXml = c06zf.getDescriptionTvFromXml();
            if (C123100dR.LIZ(information)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, descriptionTvFromXml);
            View spaceViewFromXml = c06zf.getSpaceViewFromXml();
            if (!C123100dR.LIZ(title) || !C123100dR.LIZ(information)) {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, spaceViewFromXml);
            if (C1848410yCV.LIZ) {
                fVar = new f(this);
            } else {
                fVar = this;
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c06zf);
            }
            c06zf.setOnClickListener(aVar);
            this.LLJJIJIL = c06zf;
        }
    }

    public ViewOnClickListenerC1012390cS5(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleCommentTopBarModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleCommentTopBarModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("multiVideoCardData parse failed, reason = ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LLJLIL = (AnoleCommentTopBarModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
