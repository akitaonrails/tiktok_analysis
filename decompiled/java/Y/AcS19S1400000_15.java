package Y;

import X.C01EY;
import X.EnumC941710ac5;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AcS19S1400000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS19S1400000_15 acS19S1400000_15, LiveDialog liveDialog) {
        C01EY.LIZ("confirm", acS19S1400000_15.s0, (List) acS19S1400000_15.l1);
        LinkMicAbilityManager.LJJII((LinkMicAbilityManager) acS19S1400000_15.l2, acS19S1400000_15.s0, (Function1) acS19S1400000_15.l3, (Function0) acS19S1400000_15.l4);
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS19S1400000_15 acS19S1400000_15, LiveDialog liveDialog) {
        C01EY.LIZ("cancel", acS19S1400000_15.s0, (List) acS19S1400000_15.l1);
        LinkMicAbilityManager linkMicAbilityManager = (LinkMicAbilityManager) acS19S1400000_15.l2;
        String str = acS19S1400000_15.s0;
        Function1 function1 = (Function1) acS19S1400000_15.l3;
        Function0 function0 = (Function0) acS19S1400000_15.l4;
        EnumC941710ac5 enumC941710ac5 = EnumC941710ac5.USER_CANCEL;
        ArrayList arrayList = new ArrayList((List) acS19S1400000_15.l1);
        linkMicAbilityManager.getClass();
        LinkMicAbilityManager.LJJI(str, function1, function0, enumC941710ac5, arrayList);
        liveDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcS19S1400000_15(List list, List<String> list2, String str, LinkMicAbilityManager linkMicAbilityManager, Function1<? super EnumC941710ac5, Unit> function1, Function0<Unit> function0) {
        this.$t = function0;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
        this.l3 = linkMicAbilityManager;
        this.l4 = function1;
    }
}
