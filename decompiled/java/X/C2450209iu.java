package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.user.UserStoryRepoImplV2$1", f = "UserStoryRepo.kt", l = {}, m = "invokeSuspend")
public final class C2450209iu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2450209iu(InterfaceC1364105Vn<? super C2450209iu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2450209iu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserStoryRepoImplV2@ecf4.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observeForever(new Observer() { // from class: X.09iv
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                C728130ShH.LIZ.LJFF((FollowStatus) obj2);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserStoryRepoImplV2@ecf4.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2450209iu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
