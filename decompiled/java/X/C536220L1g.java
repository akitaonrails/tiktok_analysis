package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0L1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$getToNextI2VLoadingPageDelegate$4$1", f = "CutOptimizedVideoChosenHandler.kt", l = {1538}, m = "invokeSuspend")
public final class C536220L1g extends C09AX implements InterfaceC1631620sYq<Intent, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public VideoPublishEditModel LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C0L7R LLILZLL;
    public final /* synthetic */ Intent LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536220L1g(Intent intent, C0L7R c0l7r, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c0l7r;
        this.LLIZ = intent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Intent intent;
        Bundle extras;
        VideoPublishEditModel videoPublishEditModelLJII;
        String resourceFile;
        String stringExtra;
        NLESegment mainSegment;
        NLEResourceNode resource;
        IPublishGuideDraftService iPublishGuideDraftService;
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
        IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ2;
        Object objLJI = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.getToNextI2VLoadingPageDelegate$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = false;
        Bundle bundle = null;
        if (i != 0) {
            if (i == 1) {
                videoPublishEditModelLJII = this.LL;
                intent = (Intent) this.LLILLL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            intent = (Intent) this.LLILLL;
            boolean z2 = this.LLILZ;
            new C1438570nXT("TEMPLATE_SAVE_DRAFT");
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            videoPublishEditModelLJII = C1438570nXT.LJII(extras, null);
            videoPublishEditModelLJII.creativeModel.draftInfoModel.saveDraftScene = "template_save_draft";
            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(this.LLILZIL);
            String strLIZIZ = "";
            if (nLETrackSlot == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                resourceFile = "";
            }
            C0L7R c0l7r = this.LLILZLL;
            CreativeInfo creativeInfoLIZ = C537520L6g.LIZ(intent);
            c0l7r.getClass();
            if (C2286708xd.LIZJ(resourceFile)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfoLIZ, EnumC20228214Cy.TEMPLATE, null, false, 12);
                if (!new C0VSJ(strLIZLLL).exists()) {
                    new C0VSJ(strLIZLLL).mkdirs();
                }
                sbLIZ.append(strLIZLLL);
                sbLIZ.append(new C0VSJ(resourceFile).getName());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2471909mP.LIZJ(resourceFile, strLIZIZ);
            }
            videoPublishEditModelLJII.setVideoCoverPath(strLIZIZ);
            if (z2) {
                videoPublishEditModelLJII.creativeModel.mvModel.templateType = this.LLIZ.getIntExtra("template_type", -1);
                MvModel mvModel = videoPublishEditModelLJII.creativeModel.mvModel;
                try {
                    stringExtra = this.LLIZ.getStringExtra("template_name");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra = null;
                }
                mvModel.templateName = stringExtra;
            }
            List<NLETrackSlot> list = this.LLILZIL;
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot2 : list) {
                C354260Dui.LIZ.getClass();
                Object objLJJJLL = C13LP.LJJJLL(C354260Dui.LJIIIIZZ(nLETrackSlot2));
                if (objLJJJLL != null) {
                    arrayList.add(objLJJJLL);
                }
            }
            videoPublishEditModelLJII.creativeModel.asyncFuncList = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS239S0000000_8.get$arr$(73), 30);
            videoPublishEditModelLJII.creativeModel.asyncTaskCount = C2286608xc.LJ(arrayList.size());
            videoPublishEditModelLJII.creativeModel.pugcTemplateData.hasI2V = true;
            videoPublishEditModelLJII.setTemplateId(this.LLILZLL.LJIJI);
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            z = false;
            C538590LAj c538590LAj = new C538590LAj(videoPublishEditModelLJII, new C0M2T(false, "TEMPLATE_SAVE_DRAFT", null, 25, false, 28), false);
            this.LLILLL = intent;
            this.LL = videoPublishEditModelLJII;
            this.LLILLJJLI = 1;
            objLJI = interfaceC545580LaWLIZIZ.LJI(c538590LAj, null, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.getToNextI2VLoadingPageDelegate$4$1");
                return objLJFF;
            }
        }
        if (((C540340LHc) objLJI).LIZ.isSuc()) {
            Activity activity = this.LLILZLL.LJIIJ.get();
            if (activity != null) {
                C1428470nHB.LLIIZ(intent, videoPublishEditModelLJII);
                intent.putExtra("template_consume_loading_source", "album");
                try {
                    bundle = intent.getExtras();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                C0MWH.LJFF(activity, bundle);
            }
            IPublishGuideDraftService iPublishGuideDraftService2 = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, z, z, z, 14, null);
            if (iPublishGuideDraftService2 != null && (iInternalDraftSizeCalculatorLIZIZ2 = iPublishGuideDraftService2.LIZIZ()) != null && iInternalDraftSizeCalculatorLIZIZ2.LJIIIIZZ()) {
                z = true;
            }
            if (z && (iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null)) != null && (iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService.LIZIZ()) != null) {
                iInternalDraftSizeCalculatorLIZIZ.LJFF(videoPublishEditModelLJII);
            }
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.getToNextI2VLoadingPageDelegate$4$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Intent intent, Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        List<NLETrackSlot> list = this.LLILZIL;
        C0L7R c0l7r = this.LLILZLL;
        C536220L1g c536220L1g = new C536220L1g(this.LLIZ, c0l7r, list, interfaceC1364105Vn);
        c536220L1g.LLILLL = intent;
        c536220L1g.LLILZ = zBooleanValue;
        return c536220L1g.invokeSuspend(Unit.LIZ);
    }
}
