package X;

import Y.ACallableS28S0100100_8;
import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.IStoryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;
import rlf.a;

/* JADX INFO: renamed from: X.0M5N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5N extends C0L18 {
    public static final C0M5N LIZ = new C0M5N();

    public static void LIZ(final C0M5O c0m5o) {
        InterfaceC1593650rZb interfaceC1593650rZbLJJIFFI;
        String creationId;
        BaseShortVideoContext baseShortVideoContext;
        if (c0m5o instanceof C0M5P) {
            C0M5P c0m5p = (C0M5P) c0m5o;
            C19EG c19eg = c0m5p.LIZ;
            Bundle bundle = c0m5p.LIZIZ;
            InterfaceC1439500nYy interfaceC1439500nYyLIZ = C1439210nYV.LIZ();
            interfaceC1439500nYyLIZ.LJII();
            interfaceC1439500nYyLIZ.LJI("after_click_publish", true);
            interfaceC1439500nYyLIZ.LJ(1);
            Object serializable = bundle.getSerializable("extra_video_publish_args");
            InterfaceC566960MLm storyService = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService();
            if (!(serializable instanceof VideoPublishEditModel) || (baseShortVideoContext = (BaseShortVideoContext) serializable) == null || (creationId = baseShortVideoContext.getCreationId()) == null) {
                creationId = "";
            }
            storyService.LJII(creationId);
            if (serializable != null) {
                a.LIZ.LIZJ(serializable, "publish");
            }
            C1439030nYD.LIZ.getClass();
            C1439030nYD.LJIIIIZZ(c19eg, bundle);
            return;
        }
        if (c0m5o instanceof C540370LHf) {
            C540370LHf c540370LHf = (C540370LHf) c0m5o;
            a.LIZ.LIZJ(c540370LHf.LIZ.LIZ, "save_draft");
            String creationId2 = c540370LHf.LIZ.LIZ.getCreationId();
            if (!c540370LHf.LIZ.LIZIZ.LJ) {
                if (C1206004ni.LIZ(1)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0CWP(creationId2, null), 3);
                } else {
                    IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
                    if (iStoryService != null && (interfaceC1593650rZbLJJIFFI = iStoryService.LJJIFFI()) != null) {
                        interfaceC1593650rZbLJJIFFI.LJI(creationId2, true);
                    }
                }
            }
            C538590LAj c538590LAj = c540370LHf.LIZ;
            if (c538590LAj.LIZIZ.LIZIZ == 0) {
                C1428470nHB.LIZJ(c538590LAj.LIZ.creativeModel.draftInfoModel);
            }
            c540370LHf.LIZ.LIZ.creativeModel.ugcTemplateData.ugcTemplateVersion = 1;
            if (c540370LHf.LIZ.LIZ.getAILivePhotoModel().initialDraftSaveType == null) {
                c540370LHf.LIZ.LIZ.getAILivePhotoModel().initialDraftSaveType = Integer.valueOf(C562560M4o.LIZLLL(c540370LHf.LIZ.LIZ));
            }
            if (c540370LHf.LIZ.LIZJ) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0L74(c0m5o, null), 3);
                return;
            } else {
                C0CHQ.LIZ().LJI().LIZIZ().LIZLLL(c540370LHf.LIZ, new InterfaceC540360LHe() { // from class: X.0LHd
                    @Override // X.InterfaceC540360LHe
                    public final Function1<AwemeDraft, Unit> LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC540360LHe
                    public final void LIZIZ(C540340LHc c540340LHc) {
                        ((C540370LHf) c0m5o).LIZIZ.LIZIZ(c540340LHc);
                    }

                    @Override // X.InterfaceC540360LHe
                    public final void LIZJ(C540340LHc c540340LHc) {
                        C1439190nYT.LIZJ();
                        AwemeDraft awemeDraft = c540340LHc.LIZIZ;
                        C15O7.LIZJ(new ACallableS28S0100100_8(System.currentTimeMillis() - awemeDraft.lastEditTime, awemeDraft, 1));
                        ((C540370LHf) c0m5o).LIZIZ.LIZJ(c540340LHc);
                    }
                }, new AwS587S0100000_8(c0m5o, (C0M5O<Object>) 673));
                return;
            }
        }
        if (c0m5o instanceof C0M5R) {
            C0M5R c0m5r = (C0M5R) c0m5o;
            AbstractC214814194y abstractC214814194y = c0m5r.LIZIZ;
            if (abstractC214814194y != null) {
                abstractC214814194y.finish();
                return;
            } else {
                c0m5r.LIZ.finish();
                return;
            }
        }
        throw new C1954807lC();
    }
}
