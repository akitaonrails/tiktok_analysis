package X;

import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet$addPermission$1", f = "ModeratorPermissionEditFragmentSheet.kt", l = {473}, m = "invokeSuspend")
public final class C751120TdG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ModeratorPermissionEditFragmentSheet LLILLJJLI;
    public final /* synthetic */ CompoundButton LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751120TdG(ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet, CompoundButton compoundButton, InterfaceC1364105Vn<? super C751120TdG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = moderatorPermissionEditFragmentSheet;
        this.LLILLL = compoundButton;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751120TdG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ModeratorPermissionEditFragmentSheet@bb7d.addPermission$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Integer num = (Integer) ((HashMap) this.LLILLJJLI.LLLIIII).get(this.LLILLL);
            C750740Tce c750740Tce = this.LLILLJJLI.LLJLLL;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            this.LL = 1;
            obj = c750740Tce.LIZ(num, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ModeratorPermissionEditFragmentSheet@bb7d.addPermission$1");
                return objLJFF;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 == null || num2.intValue() != 0) {
            C786410Ut5.w7(this.LLILLL, null);
            this.LLILLL.setChecked(false);
            C786410Ut5.w7(this.LLILLL, new C785990UsP(this.LLILLJJLI, 18));
            if (num2 != null && num2.intValue() == 4002167) {
                C766270U4b.LIZLLL(2131843119);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ModeratorPermissionEditFragmentSheet@bb7d.addPermission$1");
        return unit;
    }
}
