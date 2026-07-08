package X;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AEF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEF extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC2176021AEe LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1AEE LLILZ;
    public final /* synthetic */ C1ACD LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AEF(String str, EnumC2176021AEe enumC2176021AEe, String str2, C1AEE c1aee, C1ACD c1acd, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC2176021AEe;
        this.LLILLL = str2;
        this.LLILZ = c1aee;
        this.LLILZIL = c1acd;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = this.LL;
        EnumC2176021AEe enumC2176021AEe = this.LLILLJJLI;
        String str2 = this.LLILLL;
        C1AEE c1aee = this.LLILZ;
        C1ACD c1acd = this.LLILZIL;
        String str3 = this.LLILZLL;
        StringBuilder sb = new StringBuilder("event=");
        sb.append(str);
        if (enumC2176021AEe != null) {
            sb.append(",scene=");
            sb.append(enumC2176021AEe);
        }
        sb.append(",decision=");
        sb.append(str2);
        sb.append(",container=");
        sb.append(c1aee.hashCode());
        sb.append(",helper=");
        sb.append(c1acd != null ? Integer.valueOf(c1acd.hashCode()) : null);
        sb.append(",room=");
        sb.append(c1aee.LLILLL);
        sb.append(",jumpRoom=");
        sb.append(c1aee.LLILZ);
        sb.append(",sameRoom=");
        sb.append(c1aee.LLILLL == null ? false : Intrinsics.LJFF(c1aee.LLILLL, c1aee.LLILZ));
        sb.append(",group=");
        sb.append(((Number) C1AEJ.LIZ.getValue()).intValue());
        sb.append(",fixRelease=");
        sb.append(C1AEJ.LIZIZ().LIZIZ);
        sb.append(",destroyPageInvisible=");
        sb.append(C1AEJ.LIZIZ().LIZJ);
        sb.append(",destroyPlaySelection=");
        sb.append(C1AEJ.LIZIZ().LIZLLL);
        sb.append(",destroyEnterInner=");
        sb.append(C1AEJ.LIZIZ().LJ);
        sb.append(",destroyViewDetach=");
        sb.append(C1AEJ.LIZIZ().LJFF);
        sb.append(",surfaceView=");
        sb.append(C1AEJ.LIZ());
        sb.append(",dedupReuse=");
        sb.append(C1AEJ.LIZIZ().LJII != C1AEI.LL);
        sb.append(",strictReuseDedup=");
        sb.append(C1AEJ.LIZIZ().LJII == C1AEI.LLILLL);
        EnumC2176021AEe enumC2176021AEe2 = c1aee.LLILZIL;
        if (enumC2176021AEe2 != null) {
            sb.append(",lastClearScene=");
            sb.append(enumC2176021AEe2);
            sb.append(",lastClearReason=");
            sb.append(c1aee.LLILZLL);
            sb.append(",lastClearHelper=");
            sb.append(c1aee.LLIZ);
            Long l = c1aee.LLIZLLLIL;
            if (l != null) {
                long jLongValue = l.longValue();
                sb.append(",lastClearAgoMs=");
                sb.append(SystemClock.elapsedRealtime() - jLongValue);
            }
        }
        if (str3 != null) {
            sb.append(',');
            sb.append(str3);
        }
        return sb.toString();
    }
}
