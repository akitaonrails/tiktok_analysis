package X;

import Y.ARunnableS13S1100000_8;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0McD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$publishWithEditModel$1", f = "TextImageForwardResolver.kt", l = {298}, m = "invokeSuspend")
public final class C572110McD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;
    public final /* synthetic */ C572370Mcd LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C572110McD(Context context, VideoPublishEditModel videoPublishEditModel, C572370Mcd c572370Mcd, long j, CreativeInfo creativeInfo, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C572110McD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = c572370Mcd;
        this.LLILZIL = j;
        this.LLILZLL = creativeInfo;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572110McD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strStartPublish;
        String strLIZ;
        final AwemeDraft awemeDraft;
        final C572660Md6 c572660Md6;
        IAVPublishService iAVPublishServicePublishService;
        Object objLJI = obj;
        C1C7U.LIZ("TextImageForwardResolver@7aa9.publishWithEditModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
                strStartPublish = null;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            if (C572160McI.LJ() && !C572160McI.LJI()) {
                C572350Mcb c572350Mcb = C572350Mcb.LIZ;
                Context context = this.LLILLJJLI;
                VideoPublishEditModel videoPublishEditModel = this.LLILLL;
                C572370Mcd c572370Mcd = this.LLILZ;
                c572350Mcb.getClass();
                if (Intrinsics.LJFF(c572370Mcd.getShootWay(), "mt_help_post_card_search")) {
                    strLIZ = "";
                    if (videoPublishEditModel.creativeModel.text2ImageModel.isHelpText) {
                        String inputText = c572370Mcd.getInputText();
                        if (inputText != null) {
                            strLIZ = inputText;
                        }
                        strLIZ = C572160McI.LIZ(strLIZ);
                    } else {
                        String inputText2 = c572370Mcd.getInputText();
                        if (inputText2 != null) {
                            strLIZ = inputText2;
                        }
                    }
                } else {
                    strLIZ = (String) C857780Xku.LIZ(context, videoPublishEditModel, true).getSecond();
                }
                if (!a0.LJJJIL(strLIZ)) {
                    C572150McH c572150McH = C572150McH.LIZ;
                    EnumC572120McE enumC572120McE = EnumC572120McE.ENTER_PUBLISH_PAGE;
                    c572150McH.getClass();
                    C572150McH.LIZIZ(videoPublishEditModel, enumC572120McE, C572150McH.LIZ(strLIZ));
                }
            }
            this.LLILLL.creativeModel.draftInfoModel.saveDraftScene = "saveBeforePublish";
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            C538590LAj c538590LAj = new C538590LAj(this.LLILLL, new C0M2T(true, "TextImageForwardResolver", null, 1, false, 24), false);
            this.LL = 1;
            strStartPublish = null;
            objLJI = interfaceC545580LaWLIZIZ.LJI(c538590LAj, null, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("TextImageForwardResolver@7aa9.publishWithEditModel$1");
                return objLJFF;
            }
        }
        C540340LHc c540340LHc = (C540340LHc) objLJI;
        if (c540340LHc.LIZ.isSuc()) {
            awemeDraft = c540340LHc.LIZIZ;
        } else {
            awemeDraft = strStartPublish;
        }
        C572350Mcb c572350Mcb2 = C572350Mcb.LIZ;
        c572350Mcb2.getClass();
        C572340Mca c572340Mca = C572350Mcb.LJ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = C572350Mcb.LIZIZ;
        ArrayList arrayList = (ArrayList) C13LQ.LJLI((Object[]) c572340Mca.getValue(c572350Mcb2, interfaceC2217461BqaArr[0]));
        arrayList.add(this.LLILZLL.getCreationId());
        c572340Mca.setValue(c572350Mcb2, interfaceC2217461BqaArr[0], arrayList.toArray(new String[0]));
        ((ArrayList) C572350Mcb.LIZLLL).add(this.LLILZLL.getCreationId());
        String draftPrimaryKey = this.LLILLL.getDraftPrimaryKey();
        if (draftPrimaryKey != null && draftPrimaryKey.length() > 0) {
            C572660Md6 c572660Md62 = new C572660Md6(draftPrimaryKey, false);
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJII(c572660Md62);
            c572660Md6 = c572660Md62;
        } else {
            c572660Md6 = strStartPublish;
        }
        Bundle bundleLIZIZ = C1436250nTj.LIZIZ(this.LLILLL);
        bundleLIZIZ.putBoolean("directly_publish_only", true);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILLJJLI);
        if (c19egLIZIZ != null) {
            Function1<String, Unit> function1 = this.LLIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLILLL;
            final CreativeInfo creativeInfo = this.LLILZLL;
            C572370Mcd c572370Mcd2 = this.LLILZ;
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, strStartPublish);
            if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null) {
                strStartPublish = iAVPublishServicePublishService.startPublish(c19egLIZIZ, bundleLIZIZ);
            }
            if (function1 != null) {
                c19egLIZIZ.runOnUiThread(new ARunnableS13S1100000_8(function1, strStartPublish, 3));
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().addPublishCallback(new C0MNL() { // from class: X.0MNI
                @Override // X.C0MNL, X.InterfaceC1433360nP4
                public final void LIZIZ(C1434650nR9 c1434650nR9, PublishModel publishModel) {
                    ((ArrayList) C572350Mcb.LIZLLL).remove(creativeInfo.getCreationId());
                    C572660Md6 c572660Md63 = c572660Md6;
                    if (c572660Md63 != null) {
                        C0CHQ.LIZ().getPublishService().LJIIL();
                        C1436830nUf.LJIJI(c572660Md63);
                    }
                    AwemeDraft awemeDraft2 = awemeDraft;
                    if (awemeDraft2 != null) {
                        C0CHQ.LIZ().LJI().LIZIZ().LJ(new C570330MYl(awemeDraft2, new C560950LzJ("auto_delete_text_image_forward_draft_on_failed", null, 2), false, null, null, 124), null);
                    }
                }

                @Override // X.InterfaceC1433360nP4
                public final void LIZJ(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
                    ((ArrayList) C572350Mcb.LIZLLL).remove(creativeInfo.getCreationId());
                    C572660Md6 c572660Md63 = c572660Md6;
                    if (c572660Md63 != null) {
                        C0CHQ.LIZ().getPublishService().LJIIL();
                        C1436830nUf.LJIJI(c572660Md63);
                    }
                }
            }, strStartPublish);
            C557270LtN.LIZ(C0CHQ.LIZ().getPublishService().LJJJLL(), c19egLIZIZ, videoPublishEditModel2, -1, false, false, new AwS587S0100000_8(c572370Mcd2, 306), null, null, 208);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextImageForwardResolver@7aa9.publishWithEditModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
