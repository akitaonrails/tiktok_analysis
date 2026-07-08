package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907120zjC extends AbstractViewOnClickListenerC1907000zj0 {
    public C426770GoN LLIZ;
    public TuxIconView LLIZLLLIL;
    public C424560Gko LLJ;
    public ConstraintLayout LLJI;
    public C197039127h LLJIJIL;
    public RelationButton LLJILJIL;
    public C637570Ozb LLJILJILJ;
    public FrameLayout LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    private final FrameLayout getMultiImageContainer() {
        return (FrameLayout) this.LLJJIII.getValue();
    }

    private final C424560Gko getMultiImageCover1() {
        return (C424560Gko) this.LLJJ.getValue();
    }

    private final C424560Gko getMultiImageCover2() {
        return (C424560Gko) this.LLJJI.getValue();
    }

    public final C426770GoN getIvNotificationRedDotFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lq3);
            this.LLIZ = (C426770GoN) callbackFindViewById;
        }
        return (C426770GoN) callbackFindViewById;
    }

    public final TuxIconView getNotificationArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdk);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ConstraintLayout getNotificationArrowRootFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pdl);
            this.LLJI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C197039127h getNotificationButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pds);
            this.LLJIJIL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final FrameLayout getNudgeContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pgk);
            this.LLJILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final RelationButton getRelationBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t4f);
            this.LLJILJIL = (RelationButton) callbackFindViewById;
        }
        return (RelationButton) callbackFindViewById;
    }

    public final C424560Gko getRightNotificationCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tlt);
            this.LLJ = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final C637570Ozb getRightNotificationCoverWithIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tlu);
            this.LLJILJILJ = (C637570Ozb) callbackFindViewById;
        }
        return (C637570Ozb) callbackFindViewById;
    }

    private final ILightInteractionPlatformService getLightInteractionService() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    public final void LJI() {
        Drawable drawable;
        getRightNotificationCoverFromXml().setBackground(null);
        C1905050zfr viewHolderConfig = getViewHolderConfig();
        if (viewHolderConfig == null || (drawable = viewHolderConfig.LIZJ) == null) {
            getRightNotificationCoverFromXml().setImageDrawable(C1308910kAL.LJ(R.attr.br, getContext()));
        } else {
            getRightNotificationCoverFromXml().setScaleType(ImageView.ScaleType.CENTER);
            getRightNotificationCoverFromXml().setImageDrawable(drawable);
        }
        C424560Gko rightNotificationCoverFromXml = getRightNotificationCoverFromXml();
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        if (rightNotificationCoverFromXml != null) {
            rightNotificationCoverFromXml.setOutlineProvider(new C0IDA(fLIZIZ, 8));
            rightNotificationCoverFromXml.setClipToOutline(true);
        }
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public EnumC1907390zjd getTemplatePosition() {
        return EnumC1907390zjd.Right;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final String LIZJ(View view) {
        Integer numValueOf;
        GeneralTemplateNotice templateNotice;
        NoticeUITemplate noticeUITemplate;
        if (view == null || (numValueOf = Integer.valueOf(view.getId())) == null || ((numValueOf.intValue() != R.id.pds && numValueOf.intValue() != R.id.tlt && numValueOf.intValue() != R.id.pdl && numValueOf.intValue() != R.id.pei && numValueOf.intValue() != R.id.pej) || (templateNotice = getTemplateNotice()) == null || (noticeUITemplate = templateNotice.uiTemplate) == null)) {
            return null;
        }
        return noticeUITemplate.rightSchemaUrl;
    }

    @Override // X.AbstractViewOnClickListenerC1907000zj0
    public final boolean LIZLLL(View view) {
        Integer numValueOf;
        String strLIZJ;
        Function1<String, Unit> function1;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri uriBuild;
        String string;
        boolean zLJI = MethodIDManager.LJI(72001);
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null && ((numValueOf.intValue() == R.id.pds || numValueOf.intValue() == R.id.tlt || numValueOf.intValue() == R.id.pdl || numValueOf.intValue() == R.id.pei || numValueOf.intValue() == R.id.pej) && (strLIZJ = LIZJ(view)) != null)) {
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c32144.d60868", PageFinder.via(view), null);
            Uri uriLIZLLL = C1907940zkW.LIZLLL(strLIZJ);
            if (uriLIZLLL != null && (builderBuildUpon = uriLIZLLL.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("source_btm_token", strCreateJumpSourceBtmToken)) != null && (uriBuild = builderAppendQueryParameter.build()) != null && (string = uriBuild.toString()) != null) {
                strLIZJ = string;
            }
            C1242270iQr searchTemplateInfo = getSearchTemplateInfo();
            if (searchTemplateInfo != null && (function1 = searchTemplateInfo.LIZLLL) != null) {
                function1.invoke(null);
            }
            LJ(EnumC1905950zhJ.RIGHT, strLIZJ);
            if (zLJI) {
                MethodIDManager.LJ();
                return true;
            }
            return true;
        }
        if (zLJI) {
            MethodIDManager.LJ();
            return false;
        }
        return false;
    }

    public final void LJFF(boolean z) {
        int i;
        View view = (View) getParent();
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        Resources resources = view.getContext().getResources();
        if (z) {
            i = R.dimen.kr;
        } else {
            i = R.dimen.kq;
        }
        view.setPaddingRelative(paddingStart, paddingTop, resources.getDimensionPixelSize(i), view.getPaddingBottom());
    }

    public final void setIvNotificationRedDotFromXml(C426770GoN c426770GoN) {
        this.LLIZ = c426770GoN;
    }

    public final void setNotificationArrowFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setNotificationArrowRootFromXml(ConstraintLayout constraintLayout) {
        this.LLJI = constraintLayout;
    }

    public final void setNotificationButtonFromXml(C197039127h c197039127h) {
        this.LLJIJIL = c197039127h;
    }

    public final void setNudgeContainerFromXml(FrameLayout frameLayout) {
        this.LLJILLL = frameLayout;
    }

    public final void setRelationBtnFromXml(RelationButton relationButton) {
        this.LLJILJIL = relationButton;
    }

    public final void setRightNotificationCoverFromXml(C424560Gko c424560Gko) {
        this.LLJ = c424560Gko;
    }

    public final void setRightNotificationCoverWithIconFromXml(C637570Ozb c637570Ozb) {
        this.LLJILJILJ = c637570Ozb;
    }

    public C1907120zjC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1105));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1106));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1104));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aap, this, true);
        getNotificationButtonFromXml().getLayoutParams().width = C1905460zgW.LIZIZ(context);
        C10VP.LIZIZ(getRelationBtnFromXml());
        C786410Ut5.U8(getNotificationButtonFromXml(), this);
        C786410Ut5.H9(getRightNotificationCoverFromXml(), this);
        getRightNotificationCoverFromXml().setCornerRadius(C418440Gaw.LIZIZ(4));
        C786410Ut5.Y7(getNotificationArrowRootFromXml(), this);
        C424560Gko multiImageCover1 = getMultiImageCover1();
        if (multiImageCover1 != null) {
            C786410Ut5.H9(multiImageCover1, this);
        }
        C424560Gko multiImageCover2 = getMultiImageCover2();
        if (multiImageCover2 != null) {
            C786410Ut5.H9(multiImageCover2, this);
        }
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        C424560Gko rightNotificationCoverFromXml = getRightNotificationCoverFromXml();
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.AVATAR;
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        c1906140zhc.getClass();
        C1906140zhc.LIZ(rightNotificationCoverFromXml, enumC1906160zhe, fLIZIZ);
        getRelationBtnFromXml().setTuxFont(62);
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044f  */
    @Override // X.AbstractViewOnClickListenerC1907000zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r23, X.InterfaceC1907020zj2 r24, X.C1242270iQr r25) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907120zjC.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, X.0zj2, X.0iQr):void");
    }
}
