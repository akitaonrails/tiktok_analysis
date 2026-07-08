package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724860Sc0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC725510Sd3 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ReusedUIAssem LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724860Sc0(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, ReusedUIAssem reusedUIAssem, C013C c013c) {
        super(0);
        this.LL = abstractC725510Sd3;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = reusedUIAssem;
        this.LLILZLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1(this.LL, this.LLILLJJLI));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ(this.LL)) {
                long j = this.LLILLL - jLongValue;
                C724880Sc2 c724880Sc2 = new C724880Sc2(this.LLILZIL, this.LLILZLL.element, EnumC724870Sc1.REUSED_UIASSEM);
                boolean z = this.LLILZ;
                c724880Sc2.LIZ = j;
                c724880Sc2.LIZIZ = z;
                C725480Sd0.LIZIZ(this.LL, c724880Sc2);
            }
        }
        return Unit.LIZ;
    }
}
