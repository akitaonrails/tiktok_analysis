package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.mute.MuteTheirPostsManager$increaseUnmuteTimes$2", f = "MuteTheirPostsManager.kt", l = {}, m = "invokeSuspend")
public final class C1323305Fv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1323305Fv(InterfaceC1364105Vn<? super C1323305Fv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1323305Fv(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.increaseUnmuteTimes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tt_mute_their_posts_");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        repo.storeInt("key_unmute_times", repo.getInt("key_unmute_times", 0) + 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.increaseUnmuteTimes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1323305Fv(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
