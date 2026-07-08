package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0nO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1432780nO8 implements InterfaceC1432810nOB {
    public final C2298108zT LIZIZ;
    public ExtractFramesModel LIZ = new ExtractFramesModel(LIZ());
    public String LIZJ = UUID.randomUUID().toString();

    public abstract List<C1429800nJK> LIZIZ();

    public boolean LIZLLL() {
        return !(this instanceof C1432770nO7);
    }

    public void LJ() {
        this.LIZ = new ExtractFramesModel(LIZ());
        this.LIZJ = UUID.randomUUID().toString();
    }

    public static boolean LIZJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("close_vframe_upload", 0) == 0;
    }

    public AbstractC1432780nO8(CreativeInfo creativeInfo) {
        this.LIZIZ = new C2298108zT(creativeInfo);
    }

    public void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start extract frame for ");
        sbLIZ.append(LIZ());
        c1437510nVlLJJLIIIJ.LIZ("extract_frame", C2188811AlT.LIZIZ(sbLIZ));
        C2265108u9.LIZ(LIZ(), "extracting_frame");
        if (!LIZJ()) {
            interfaceC1432820nOC.onFinish(false);
            return;
        }
        this.LIZIZ.LJ(LIZ(), this.LIZJ);
        this.LIZ.setExtractFramesDir(this.LIZIZ.LIZIZ);
        C1403010mc7.LIZ.LJII().getFrameVerificationService().onExtractFrameContextActive(LIZ(), this.LIZJ, this.LIZIZ.LIZIZ, "creationId not available currently.");
        this.LIZ.addFrameSegment(new ArrayList<>(), null, new ArrayList<>());
    }
}
