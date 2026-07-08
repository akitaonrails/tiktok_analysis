package X;

import com.bytedance.keva.Keva;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2470109m7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Keva LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470109m7(Keva keva, String str, int i, long j) {
        super(0);
        this.LL = keva;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Keva keva = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("im_key_new_guide_count");
        sbLIZ.append(this.LLILLJJLI);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), this.LLILLL + 1);
        Keva keva2 = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("im_key_new_guide_ts");
        sbLIZ2.append(this.LLILLJJLI);
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), this.LLILZ);
        C0I0B.LJFF.LIZIZ().sendEvent("show_start_group_chat_tooltip", C2097908Jt.LIZJ(new Pair("lifetime_show", String.valueOf(this.LLILLL + 1))));
        return Unit.LIZ;
    }
}
