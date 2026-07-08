package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855960Xhy extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C907110ZiH LL;
    public final /* synthetic */ Map<Integer, PreCheckResult> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C855960Xhy(C907110ZiH c907110ZiH, Map<Integer, PreCheckResult> map, int i) {
        super(0);
        this.LL = c907110ZiH;
        this.LLILLJJLI = map;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PreCheckResult preCheckResult;
        PreCheckResultModel preCheckResultModel;
        AbstractC856710XjB next;
        ArrayList<UnavailableReason> arrayList;
        Integer num;
        AbstractC856750XjF abstractC856750XjF = this.LL.LLILLJJLI;
        Map<Integer, PreCheckResult> map = this.LLILLJJLI;
        int i = this.LLILLL;
        abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.setDetectResults(new HashMap<>());
        abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.setLastDetectResults(new HashMap<>());
        if (map != null) {
            for (Map.Entry<Integer, PreCheckResult> entry : map.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                PreCheckResult value = entry.getValue();
                if (value != null) {
                    value.materialHash = i;
                }
                Iterator<AbstractC856710XjB> it2 = abstractC856750XjF.LJ().iterator();
                while (true) {
                    preCheckResultModel = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.LIZ() == iIntValue) {
                        break;
                    }
                }
                AbstractC856710XjB abstractC856710XjB = next;
                if (abstractC856710XjB != null) {
                    abstractC856710XjB.LIZ = value;
                }
                if (value != null) {
                    preCheckResultModel = new PreCheckResultModel(value.musicInfos, value.matchDetails, value.matchDetailsV1, value.unavailableReasons, Integer.valueOf(value.unavailableReasonsV1), value.preCheckId, false, false);
                    ArrayList<UnavailableReason> arrayList2 = preCheckResultModel.unavailableReasons;
                    preCheckResultModel.detectPass = (arrayList2 == null || arrayList2.isEmpty()) && (num = preCheckResultModel.unavailableReasonsV1) != null && num.intValue() == 0;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BaseEditAudioCopyrightHandler -> updateDetectResult -> scene = ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(", detectPass = ");
                    sbLIZ.append(preCheckResultModel.detectPass);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap<Integer, PreCheckResultModel> detectResults = abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.getDetectResults();
                if (detectResults != null) {
                    detectResults.put(Integer.valueOf(iIntValue), preCheckResultModel);
                }
                HashMap<Integer, PreCheckResultModel> lastDetectResults = abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.getLastDetectResults();
                if (lastDetectResults != null) {
                    lastDetectResults.put(Integer.valueOf(iIntValue), preCheckResultModel);
                }
                C856790XjJ c856790XjJ = C856790XjJ.LIZ;
                String creationId = abstractC856750XjF.LJI().getCreationId();
                String str = abstractC856750XjF.LJI().mShootWay;
                if (str == null) {
                    str = "";
                }
                String strValueOf = String.valueOf(abstractC856750XjF.LJI().getDraftId());
                String strLJIILL = C1428470nHB.LJIILL(abstractC856750XjF.LJI());
                String strLJIILIIL = C1428470nHB.LJIILIIL(abstractC856750XjF.LJI());
                String musicId = abstractC856750XjF.LJI().getMusicId();
                int i2 = (value == null || !(((arrayList = value.unavailableReasons) == null || arrayList.isEmpty()) && value != null && value.unavailableReasonsV1 == 0)) ? 1 : 0;
                long jCurrentTimeMillis = System.currentTimeMillis() - abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.getDetectStart();
                int videoLength = abstractC856750XjF.LJI().getVideoLength();
                boolean zLIZIZ = C857680Xkk.LIZIZ(abstractC856750XjF.LJI());
                c856790XjJ.getClass();
                C856790XjJ.LJIIIZ(creationId, str, iIntValue, strValueOf, i2, "video_edit_page", strLJIILL, strLJIILIIL, musicId, videoLength, zLIZIZ ? 1 : 0, jCurrentTimeMillis);
            }
        }
        AbstractC856710XjB abstractC856710XjBLIZJ = this.LL.LLILLJJLI.LIZJ();
        if (abstractC856710XjBLIZJ != null && (preCheckResult = abstractC856710XjBLIZJ.LIZ) != null) {
            C907110ZiH c907110ZiH = this.LL;
            ArrayList<UnavailableReason> arrayList3 = preCheckResult.unavailableReasons;
            if ((arrayList3 == null || arrayList3.isEmpty()) && preCheckResult.unavailableReasonsV1 == 0) {
                c907110ZiH.i3().creativeModel.audioCopyrightDetectModel.setOperation(0);
                AbstractC856750XjF abstractC856750XjF2 = c907110ZiH.LLILLJJLI;
                VideoPublishEditModel videoPublishEditModelI3 = c907110ZiH.i3();
                AbstractC856710XjB abstractC856710XjBLIZJ2 = abstractC856750XjF2.LIZJ();
                if (abstractC856710XjBLIZJ2 != null && abstractC856710XjBLIZJ2.LIZLLL(videoPublishEditModelI3)) {
                    AbstractC856710XjB abstractC856710XjBLIZJ3 = c907110ZiH.LLILLJJLI.LIZJ();
                    if (!C362370EIp.LIZ(abstractC856710XjBLIZJ3 != null ? abstractC856710XjBLIZJ3.LIZ() : -1) && !C856830XjN.LIZ()) {
                        C855900Xhs.LIZIZ(C1664590tQ1.LJII(c907110ZiH));
                    }
                }
                C895680ZBu.LIZ.getClass();
                if ((!C895680ZBu.LJFF) && C856830XjN.LIZ()) {
                    C895680ZBu.LJFF = true;
                    C1664590tQ1.LJII(c907110ZiH);
                    c907110ZiH.i3();
                }
            } else {
                c907110ZiH.i3().creativeModel.audioCopyrightDetectModel.setOperation(2);
                c907110ZiH.F4();
            }
        }
        return Unit.LIZ;
    }
}
