package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FZ extends C09AY implements Function1<C20234214Fg, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI = "session_list_chat_sug";
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14FZ(String str, String str2, Map map) {
        super(1);
        this.LL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20234214Fg c20234214Fg) {
        C20234214Fg c20234214Fg2 = c20234214Fg;
        c20234214Fg2.LJFF(EnumC1864410ycJ.FULL_SCREEN, AFwS274S0000000_30.get$arr$(26));
        c20234214Fg2.LJI(new C20233914Fd(this.LLILLJJLI, this.LLILLL));
        String str = this.LL;
        if (str != null) {
            c20234214Fg2.LIZJ(str, this.LLILZ, null);
        }
        c20234214Fg2.LIZLLL(new AwS609S0100000_30(this.LLILZIL, (Map<String, String>) 36));
        return Unit.LIZ;
    }
}
