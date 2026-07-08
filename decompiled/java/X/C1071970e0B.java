package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e0B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl$requestContactActualPermission$2$interceptor$1$intercept$1", f = "RelationAuthDialogControl.kt", l = {177}, m = "invokeSuspend")
public final class C1071970e0B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RelationAuthDialogControl LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ C19514611Wm LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1071970e0B(RelationAuthDialogControl relationAuthDialogControl, boolean z, Function1<? super Boolean, Unit> function1, C19514611Wm c19514611Wm, InterfaceC1364105Vn<? super C1071970e0B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = relationAuthDialogControl;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZIL = c19514611Wm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1071970e0B(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("RelationAuthDialogControl@8c10.requestContactActualPermission$2$interceptor$1$intercept$1");
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
            RelationAuthDialogControl relationAuthDialogControl = this.LLILLJJLI;
            boolean z = this.LLILLL;
            relationAuthDialogControl.getClass();
            if (z && !C2209401Bda.LIZIZ.LIZIZ("access_facebook_email_dialog")) {
                C2209401Bda.LIZIZ.LIZ("access_facebook_email_dialog");
                this.LLILZ.invoke(true);
                C19514611Wm c19514611Wm = this.LLILZIL;
                if (c19514611Wm != null) {
                    c19514611Wm.LIZIZ();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RelationAuthDialogControl@8c10.requestContactActualPermission$2$interceptor$1$intercept$1");
                return unit;
            }
            ((C1910890zpH) this.LLILLJJLI.LLILLL.getValue()).LIZ("auth_dialog_control", "update auth show time");
            this.LLILLJJLI.LLJILJIL.storeInt("last_permission_pop_up_type", 1);
            this.LLILLJJLI.LLJILJIL.storeLong("last_show_contact_time", System.currentTimeMillis());
            RelationAuthDialogControl relationAuthDialogControl2 = this.LLILLJJLI;
            Context context = relationAuthDialogControl2.LL;
            EnumC1070340dxY enumC1070340dxY = EnumC1070340dxY.CONTACT;
            this.LL = 1;
            obj = relationAuthDialogControl2.LJFF(context, enumC1070340dxY, "authorize", null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RelationAuthDialogControl@8c10.requestContactActualPermission$2$interceptor$1$intercept$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C19514611Wm c19514611Wm2 = this.LLILZIL;
            if (c19514611Wm2 != null) {
                c19514611Wm2.LIZJ();
            }
        } else {
            C19514611Wm c19514611Wm3 = this.LLILZIL;
            if (c19514611Wm3 != null) {
                c19514611Wm3.LIZIZ();
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RelationAuthDialogControl@8c10.requestContactActualPermission$2$interceptor$1$intercept$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
