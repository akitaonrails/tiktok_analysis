package X;

import com.ss.android.ugc.aweme.shortvideo.ui.task.RecordTaskManager;
import jgp.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryTaskManager$trimLowMemoryTask$1", f = "StoryTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C563790M9h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C563780M9g LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563790M9h(C563780M9g c563780M9g, InterfaceC1364105Vn<? super C563790M9h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c563780M9g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563790M9h(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryTaskManager@c977.trimLowMemoryTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        if (C298010BmB.LIZ()) {
            RecordTaskManager.LIZ(new x(), true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryTaskManager@c977.trimLowMemoryTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
