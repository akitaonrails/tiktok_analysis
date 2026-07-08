package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository$preload$1", f = "FriendsV3FeedRepository.kt", l = {237}, m = "invokeSuspend")
public final class C1587010rOt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC1587000rOs LLILZIL;
    public final /* synthetic */ EnumC1586970rOp LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587010rOt(String str, String str2, String str3, EnumC1587000rOs enumC1587000rOs, EnumC1586970rOp enumC1586970rOp, int i, InterfaceC1364105Vn<? super C1587010rOt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = enumC1587000rOs;
        this.LLILZLL = enumC1586970rOp;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1587010rOt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedRepository@1744.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            FriendsV3FeedRepository friendsV3FeedRepository = FriendsV3FeedRepository.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            EnumC1587000rOs enumC1587000rOs = this.LLILZIL;
            EnumC1586970rOp enumC1586970rOp = this.LLILZLL;
            int i2 = this.LLIZ;
            this.LL = 1;
            if (friendsV3FeedRepository.LIZ(str, str2, str3, enumC1587000rOs, true, enumC1586970rOp, i2, this) == objLJFF) {
                C1C7U.LIZIZ("FriendsV3FeedRepository@1744.preload$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
