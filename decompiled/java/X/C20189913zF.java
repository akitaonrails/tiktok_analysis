package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS274S0000000_30;
import njp.a;

/* JADX INFO: renamed from: X.13zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.photo.picker.TakoPhotoPicker$openGallery$1$1", f = "TakoPhotoPicker.kt", l = {}, m = "invokeSuspend")
public final class C20189913zF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ Function1<List<C1852750yJV>, Unit> LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20189913zF(Activity activity, Function1<? super List<C1852750yJV>, Unit> function1, Intent intent, InterfaceC1364105Vn<? super C20189913zF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = function1;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20189913zF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC836750Ws5 interfaceC836750Ws5;
        C1C7U.LIZ("TakoPhotoPicker@7fa1.openGallery$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isDestroyed() && !this.LL.isFinishing()) {
            Activity activity = this.LL;
            Intent intent = this.LLILLL;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(40003, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6hxTHGwY3EsTE1ymQnkjy8CFhuIfLqntbAV0ilQ==", null));
            C20189513zB.LIZJ = this.LLILLJJLI;
            C1864400ycI.LIZ(C1864400ycI.LIZ, false, C2286608xc.LJ(FriendsTabPreloadTTLSetting.DEFAULT), AFwS274S0000000_30.get$arr$(12), 1);
            final Activity activity2 = this.LL;
            if ((activity2 instanceof InterfaceC836750Ws5) && (interfaceC836750Ws5 = (InterfaceC836750Ws5) activity2) != null) {
                interfaceC836750Ws5.setActivityResultListener(new InterfaceC342470Dbh() { // from class: X.13zG
                    @Override // X.InterfaceC342470Dbh
                    public final boolean onActivityResult(int i, int i2, Intent intent2) {
                        C20189513zB.LIZ.LJII(i, i2, activity2, intent2);
                        return true;
                    }
                });
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoPhotoPicker@7fa1.openGallery$1$1");
            return unit;
        }
        this.LLILLJJLI.invoke(Collections.singletonList(new C1852750yJV(-2, null)));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoPhotoPicker@7fa1.openGallery$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
