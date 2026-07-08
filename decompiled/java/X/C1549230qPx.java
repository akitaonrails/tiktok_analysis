package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549230qPx extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1549230qPx(String str, String str2, String str3, long j, String str4, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign(Scene.SCENE_SERVICE, this.LL);
        laneParams2.plusAssign("path", this.LLILLJJLI);
        laneParams2.plusAssign("type", this.LLILLL);
        laneParams2.plusAssign("cost_time", Long.valueOf(this.LLILZ));
        laneParams2.plusAssign("success", Boolean.valueOf(this.LLILZIL));
        laneParams2.plusAssign("reason", this.LLILZLL);
        return Unit.LIZ;
    }
}
