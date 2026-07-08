package X;

import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816330xMl extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ C1816340xMm LL;
    public final /* synthetic */ C1816270xMf LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816330xMl(C1816340xMm c1816340xMm, C1816270xMf c1816270xMf, String str) {
        super(1);
        this.LL = c1816340xMm;
        this.LLILLJJLI = c1816270xMf;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        if (this.LL.LIZJ) {
            C0KPJ.rf.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        C1816340xMm c1816340xMm = this.LL;
        C1816270xMf c1816270xMf = this.LLILLJJLI;
        c1816340xMm.getClass();
        InterfaceC497601wk interfaceC497601wk = c1816270xMf.LIZLLL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C315601Kg(c1816340xMm, c1816270xMf, null), 2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_popup");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILLL, "decoration_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("aiConfirm", "popup_scene");
        c474500IjALIZ.LJJII("continue", "click_position");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
