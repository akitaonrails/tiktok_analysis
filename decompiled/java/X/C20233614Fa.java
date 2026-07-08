package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14Fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20233614Fa extends C09AY implements Function1<C20234214Fg, Unit> {
    public final /* synthetic */ String LL = "session_list_chat_sug";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233614Fa(String str, boolean z, Map map) {
        super(1);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20234214Fg c20234214Fg) {
        C20234214Fg c20234214Fg2 = c20234214Fg;
        c20234214Fg2.LJFF(EnumC1864410ycJ.FULL_SCREEN, AFwS274S0000000_30.get$arr$(29));
        c20234214Fg2.LJI(new C20234014Fe(this.LL, this.LLILLJJLI, this.LLILLL));
        c20234214Fg2.LIZLLL(new AwS609S0100000_30(this.LLILZ, (Map<String, String>) 37));
        return Unit.LIZ;
    }
}
