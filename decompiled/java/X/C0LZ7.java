package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.a1;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZ7 extends C09AY implements Function1<C539960LFq, Unit> {
    public final /* synthetic */ C0LZ8 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ AIGCOfflineModel LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZ7(C0LZ8 c0lz8, String str, long j, AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo) {
        super(1);
        this.LL = c0lz8;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = aIGCOfflineModel;
        this.LLILZIL = creativeInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C539960LFq c539960LFq) {
        C539960LFq c539960LFq2 = c539960LFq;
        C0LZ8 c0lz8 = this.LL;
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        AIGCOfflineModel aIGCOfflineModel = this.LLILZ;
        CreativeInfo creativeInfo = this.LLILZIL;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(AIGCGenerationComponent.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC560310LyH.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq2.LIZ.LIZIZ(c539960LFq2.LIZIZ, enumC1642750sqn, null, InterfaceC560310LyH.class, AIGCGenerationComponent.class, a1.class, R.id.tqy, enumC371580EhY, new C0LZ6(new C0ET4(), c539960LFq2, c0lz8, str, j, aIGCOfflineModel, creativeInfo));
        return Unit.LIZ;
    }
}
