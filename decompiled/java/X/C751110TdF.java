package X;

import android.widget.CompoundButton;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment$addPermission$1", f = "ModeratorPermissionEditFragment.kt", l = {486}, m = "invokeSuspend")
public final class C751110TdF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ModeratorPermissionEditFragment LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ CompoundButton LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751110TdF(ModeratorPermissionEditFragment moderatorPermissionEditFragment, Integer num, CompoundButton compoundButton, InterfaceC1364105Vn<? super C751110TdF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = moderatorPermissionEditFragment;
        this.LLILLL = num;
        this.LLILZ = compoundButton;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751110TdF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ModeratorPermissionEditFragment@751f.addPermission$1");
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
            C750740Tce c750740Tce = this.LLILLJJLI.LLILZLL;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            Integer num = this.LLILLL;
            this.LL = 1;
            obj = c750740Tce.LIZ(num, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ModeratorPermissionEditFragment@751f.addPermission$1");
                return objLJFF;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 == null || num2.intValue() != 0) {
            C786410Ut5.w7(this.LLILZ, null);
            this.LLILZ.setChecked(false);
            C786410Ut5.w7(this.LLILZ, new C785990UsP(this.LLILLJJLI, 17));
            if (num2 != null && num2.intValue() == 4002167) {
                C766270U4b.LIZLLL(2131843119);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ModeratorPermissionEditFragment@751f.addPermission$1");
        return unit;
    }
}
