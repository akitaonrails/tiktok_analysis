package X;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539020LCa extends AbstractC1452680nuE {
    public NLEModel LJJIJIIJIL;
    public NLEEditor LJJIJIL;
    public TemplateDynamicSlotModel LJJIJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539020LCa(C1441900ncq c1441900ncq) {
        super(c1441900ncq);
        C823050WQl.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[Catch: all -> 0x0131, PHI: r1
      0x002f: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v14 java.lang.String) binds: [B:8:0x002d, B:6:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0131, blocks: (B:3:0x000f, B:5:0x0027, B:9:0x002f, B:11:0x0047, B:12:0x004d, B:17:0x005b, B:20:0x0063, B:21:0x0070, B:23:0x0076, B:24:0x0084, B:25:0x008d, B:27:0x0093, B:29:0x00a4, B:30:0x00a8, B:31:0x00ac, B:33:0x00b2, B:34:0x00c4, B:36:0x00ca, B:38:0x00d7, B:39:0x00db, B:41:0x00e3, B:44:0x00ec, B:46:0x00f0, B:48:0x00f5, B:50:0x00fd, B:52:0x0105, B:53:0x010c, B:56:0x0116, B:60:0x0123, B:63:0x0128, B:64:0x012b), top: B:71:0x000f }] */
    @Override // X.AbstractC1452680nuE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r18) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C539020LCa.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
    }

    public final void LJJIJIIJIL(CutSource cutSource, CutsameDataItem cutsameDataItem, ArrayList<MediaItem> arrayList, long j, LifecycleOwner lifecycleOwner) throws InterruptedException {
        String str;
        NLETemplateModel nLETemplateModelLJJI;
        C0CHQ.LIZ().LJFF().LIZLLL();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Application application = C0CHQ.LIZ;
        final C0FQ3 c0fq3 = new C0FQ3(this, arrayList, application, cutsameDataItem, countDownLatch);
        ITemplateService iTemplateService = (ITemplateService) ServiceManager.get().getService(ITemplateService.class);
        String str2 = null;
        if (iTemplateService != null && (nLETemplateModelLJJI = iTemplateService.LJJI(Long.valueOf(j))) != null) {
            NLETemplateModel nLETemplateModelDynamicCast = NLETemplateModel.dynamicCast(nLETemplateModelLJJI.deepClone());
            c0fq3.onPreSuccess(nLETemplateModelDynamicCast);
            c0fq3.onSuccess(nLETemplateModelDynamicCast);
        } else {
            String str3 = cutsameDataItem.templateId;
            if (str3 == null) {
                str3 = "";
            }
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.CUT_SAME;
            BinderC532620Kui binderC532620Kui = new BinderC532620Kui("VEVideoEditorCutSameImpl_", str3, enumC1412640mre.getValue());
            BinderC532620Kui.LIZIZ(binderC532620Kui, enumC1412640mre.getValue(), "", Boolean.FALSE, 56);
            if (!C0C0A.LIZ()) {
                C0LB9.LIZ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class), application, cutSource, new C1428840nHm(cutsameDataItem.md5, (Boolean) null, false, (NLEModelDownloader) null, EnumC539100LCi.CUTSAME, (ICutReporter) binderC532620Kui, false, false, (NLEPrepareListener) c0fq3, 410), lifecycleOwner, 16);
            } else {
                ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
                String str4 = cutsameDataItem.templateId;
                ArrayList<String> arrayList2 = cutsameDataItem.musicIds;
                if (arrayList2 != null) {
                    str = (String) C13LP.LJJJLL(arrayList2);
                } else {
                    str = null;
                }
                String str5 = cutsameDataItem.musicUrl;
                Boolean bool = cutsameDataItem.musicPostUnavailable;
                C1432940nOO.LIZ.getClass();
                TemplateSourceConfig templateSourceConfigLIZLLL = C1432940nOO.LIZLLL();
                EnumC539100LCi enumC539100LCi = EnumC539100LCi.CUTSAME;
                Pair pair = new Pair("", "");
                Boolean bool2 = cutsameDataItem.musicPostUnavailable;
                ArrayList<String> arrayList3 = cutsameDataItem.musicIds;
                if (arrayList3 != null) {
                    str2 = (String) C13LP.LJJJLL(arrayList3);
                }
                iTemplateResourceService.LIZLLL(application, str4, enumC1412640mre, cutsameDataItem, str, str5, bool, new C573920Mf8(binderC532620Kui, enumC539100LCi, C0LCZ.LIZ(enumC1412640mre, bool2, str2, cutsameDataItem.musicUrl), -1, pair), templateSourceConfigLIZLLL, new C1418100n0S("cc_template", cutsameDataItem.templateId, enumC1412640mre), false, new C0L7K() { // from class: X.0LCb
                    @Override // X.C0L7K
                    public final void LJ(String str6, String str7, boolean z) {
                    }

                    @Override // X.C0L7K
                    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        c0fq3.onPreSuccess(nLETemplateModel);
                    }

                    @Override // X.C0L7K
                    public final void LIZLLL(C0L7B c0l7b, boolean z) {
                        NLETemplateModel nLETemplateModel;
                        C0FQ3 c0fq32 = c0fq3;
                        if (c0l7b != null) {
                            nLETemplateModel = c0l7b.LIZ;
                        } else {
                            nLETemplateModel = null;
                        }
                        c0fq32.onSuccess(nLETemplateModel);
                    }

                    @Override // X.C0L7K
                    public final void LJFF(C0L7F c0l7f, boolean z) {
                        c0fq3.getClass();
                    }

                    @Override // X.C0L7K
                    public final void LIZJ(int i, String str6, boolean z) {
                        c0fq3.onError(i, str6);
                    }
                });
            }
        }
        countDownLatch.await();
    }
}
