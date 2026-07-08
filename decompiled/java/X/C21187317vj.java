package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187317vj extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C21187417vk LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21187317vj(String str, C21187417vk c21187417vk, String str2, String str3, int i, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c21187417vk;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign(Scene.SCENE_SERVICE, this.LL);
        laneParams2.plusAssign("rule", this.LLILLJJLI.LJIIJJI);
        String str = this.LLILLL;
        if (str != null) {
            laneParams2.plusAssign("source", str);
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            laneParams2.plusAssign("path", str2);
        }
        laneParams2.plusAssign("type", Integer.valueOf(this.LLILZIL));
        laneParams2.plusAssign("app_channel", C1547310qMr.LIZ());
        laneParams2.plusAssign("error_msg", this.LLILZLL);
        return Unit.LIZ;
    }
}
