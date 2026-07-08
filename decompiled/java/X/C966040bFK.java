package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicTaskCallback;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966040bFK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C966210bFb LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ LinkMicTaskCallback LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966040bFK(C966020bFI c966020bFI, C966210bFb c966210bFb, int i, LinkMicTaskCallback linkMicTaskCallback) {
        super(0);
        this.LL = c966020bFI;
        this.LLILLJJLI = c966210bFb;
        this.LLILLL = i;
        this.LLILZ = linkMicTaskCallback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C965350bED c965350bED = this.LL.LJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleAdvanceJoinRtcChannel onCompletion by task: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", linkerMode: ");
        sbLIZ.append(this.LLILLL);
        C1AZW.LJIIIZ(c965350bED, "RustLinker", C2188811AlT.LIZIZ(sbLIZ), null, null);
        LinkMicTaskCallback linkMicTaskCallback = this.LLILZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLILLJJLI.LIZIZ);
        linkedHashMap.put("success", "1");
        linkMicTaskCallback.LIZIZ(linkedHashMap);
        return Unit.LIZ;
    }
}
