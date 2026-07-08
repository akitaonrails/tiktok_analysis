package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetectorViewModel;
import com.bytedance.android.livesdk.model.DateFrequencyModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122450fJb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122450fJb(HighIntentCommentDetector highIntentCommentDetector, Room room, String str, String str2, Map<String, String> map) {
        super(0);
        this.LL = highIntentCommentDetector;
        this.LLILLJJLI = room;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ("DM_guidance", "showDmCreatorTooltip onShow");
        HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModelY1 = this.LL.y1();
        highIntentCommentDetectorViewModelY1.getClass();
        C20337914i1<DateFrequencyModel> c20337914i1 = InterfaceC1106030et7.W7;
        DateFrequencyModel dateFrequencyModelLIZIZ = c20337914i1.LIZIZ();
        if (dateFrequencyModelLIZIZ == null) {
            dateFrequencyModelLIZIZ = new DateFrequencyModel(0L, 0);
        }
        int iWQ2 = highIntentCommentDetectorViewModelY1.wQ2();
        C20337914i1<Map<String, Long>> c20337914i12 = InterfaceC1106030et7.X7;
        Map<String, Long> mapLIZIZ = c20337914i12.LIZIZ();
        if (mapLIZIZ == null) {
            mapLIZIZ = new LinkedHashMap<>();
        }
        Room room = highIntentCommentDetectorViewModelY1.LLILZIL;
        mapLIZIZ.put((room != null ? Long.valueOf(room.getId()) : "").toString(), Long.valueOf(((long) iWQ2) + 1));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("latest map = ");
        sbLIZ.append(mapLIZIZ);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        c20337914i12.LJFF(mapLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updated map = ");
        sbLIZ2.append(c20337914i12.LIZIZ());
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ2));
        dateFrequencyModelLIZIZ.frequencyCount++;
        c20337914i1.LJFF(dateFrequencyModelLIZIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("update record: roomShownCount=");
        sbLIZ3.append(highIntentCommentDetectorViewModelY1.wQ2());
        sbLIZ3.append(" dailyFrequencyControl.frequencyCount =");
        sbLIZ3.append(dateFrequencyModelLIZIZ.frequencyCount);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ3));
        C206200qq.LIZIZ(this.LLILLJJLI, "show", this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
