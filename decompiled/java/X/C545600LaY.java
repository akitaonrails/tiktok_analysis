package X;

import android.util.Log;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.draft.ISaveVideoToDraftListener;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: renamed from: X.0LaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545600LaY implements InterfaceC545580LaW {
    public final Map<String, C09AE> LIZ = new LinkedHashMap();

    @Override // X.InterfaceC545580LaW
    public final void LIZ(IAVDraftService.SaveDraftByPathParam saveDraftByPathParam) {
        C0MBE.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : saveDraftByPathParam.urls) {
            C0MBE.LIZ.getClass();
            MediaModel mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL(str);
            mediaModel.date = System.currentTimeMillis();
            mediaModel.type = 4;
            VEUtils.VEVideoFileInfo vEVideoFileInfo = VEUtils.getVEVideoFileInfo(str);
            if (vEVideoFileInfo != null) {
                mediaModel.width = vEVideoFileInfo.width;
                mediaModel.height = vEVideoFileInfo.height;
                mediaModel.duration = vEVideoFileInfo.duration;
                String str2 = vEVideoFileInfo.formatName;
                if (str2 != null) {
                    mediaModel.mimeType = str2;
                }
                mediaModel.speed = 1.0f;
            }
            arrayList.add(mediaModel);
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0MBE.LIZIZ);
            sbLIZ.append(" -> mediaList is null");
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            ISaveVideoToDraftListener.DefaultImpls.onFailed$default(saveDraftByPathParam.listener, null, 1, null);
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C545910Lb3(saveDraftByPathParam, arrayList, null), 3);
    }

    @Override // X.InterfaceC545580LaW
    public final DraftDBSaveResult LJFF(C545640Lac c545640Lac) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, updateDBSync creativeInfo : ");
        sbLIZ.append(c545640Lac.LIZ.LIZIZ());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return C0M2R.LIZ(c545640Lac);
    }

    @Override // X.InterfaceC545580LaW
    public final Object LJIIIIZZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, clear beyond expiry data draft, , trace : ");
        sbLIZ.append(Log.getStackTraceString(new RuntimeException()));
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C499180Jhs c499180Jhs = C499180Jhs.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C545680Lag(null));
        if (objLJI != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC545580LaW
    public final Object LIZIZ(C545640Lac c545640Lac, AbstractC23140094w abstractC23140094w) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, updateDB creativeInfo : ");
        sbLIZ.append(c545640Lac.LIZ.LIZIZ());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C545590LaX(c545640Lac, null));
    }

    @Override // X.InterfaceC545580LaW
    public final Object LIZJ(C570330MYl c570330MYl, InterfaceC1364105Vn<? super C545650Lad> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, delete creativeInfo : ");
        sbLIZ.append(c570330MYl.LIZ.LIZIZ());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return C570340MYm.LIZ(c570330MYl, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC545580LaW
    public final void LJ(C570330MYl c570330MYl, InterfaceC545620Laa interfaceC545620Laa) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, deleteAsync , creativeInfo : ");
        sbLIZ.append(c570330MYl.LIZ.LIZIZ());
        sbLIZ.append(" , trace : ");
        sbLIZ.append(Log.getStackTraceString(new RuntimeException()));
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C545610LaZ(c570330MYl, interfaceC545620Laa, null), 3);
    }

    @Override // X.InterfaceC545580LaW
    public final Object LJII(C542550LPp c542550LPp, InterfaceC1364105Vn<? super C0LBJ> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, restore creativeInfo : ");
        sbLIZ.append(c542550LPp.LIZIZ.LIZIZ());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return C542610LPv.LIZJ(c542550LPp, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC545580LaW
    public final Object LJIIIZ(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C09AE c09aeRemove = this.LIZ.remove(str);
        if (c09aeRemove != null) {
            Object objLJJZ = c09aeRemove.LJJZ(interfaceC1364105Vn);
            if (objLJJZ == C099R.LJFF()) {
                return objLJJZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC545580LaW
    public final void LIZLLL(C538590LAj c538590LAj, InterfaceC540360LHe interfaceC540360LHe, Function1<? super AwemeDraft, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, saveAsync , creativeInfo : ");
        sbLIZ.append(c538590LAj.LIZ.getCreativeInfo());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C545630Lab.LIZ()) {
            ((MusicMonitorTaskQueueService) ServiceManager.get().getService(MusicMonitorTaskQueueService.class)).LIZJ(new C571270Mar(c538590LAj.LIZ, "save_draft", null, null, 12));
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ), null, null, new C540380LHg(this, c538590LAj, function1, interfaceC540360LHe, null), 3);
        anonymousClass0956LIZLLL.LJII(new AwS374S0200000_8(this, c538590LAj, 208));
        this.LIZ.put(c538590LAj.LIZ.getCreativeInfo().getCreationId(), anonymousClass0956LIZLLL);
    }

    @Override // X.InterfaceC545580LaW
    public final Object LJI(C538590LAj c538590LAj, Function1<? super AwemeDraft, Unit> function1, InterfaceC1364105Vn<? super C540340LHc> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeDraftUpdateServiceImpl, save , creativeInfo : ");
        sbLIZ.append(c538590LAj.LIZ.getCreativeInfo());
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return C0MYD.LJI(c538590LAj, function1, interfaceC1364105Vn);
    }
}
