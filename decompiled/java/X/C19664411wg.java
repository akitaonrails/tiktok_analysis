package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.logic.BaseLiveEventStickerDelegate$requestMoveSticker$1", f = "BaseLiveEventStickerDelegate.kt", l = {99}, m = "invokeSuspend")
public final class C19664411wg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC19664311wf LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19664411wg(AbstractC19664311wf abstractC19664311wf, long j, int i, int i2, InterfaceC1364105Vn<? super C19664411wg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC19664311wf;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19664411wg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC500940Jki interfaceC500940JkiUser;
        C1C7U.LIZ("BaseLiveEventStickerDelegate@5929.requestMoveSticker$1");
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
            C1117450fBX c1117450fBX = ILiveEventStickerApi.LIZ;
            Long lLIZIZ = this.LLILLJJLI.LIZIZ();
            long j = this.LLILLL;
            int iLIZ = this.LLILLJJLI.LIZ();
            String strValueOf = String.valueOf(this.LLILZ);
            String strValueOf2 = String.valueOf(this.LLILZIL);
            this.LL = 1;
            long currentUserId = 0;
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            }
            if (c1117450fBX.LIZ(lLIZIZ, j, currentUserId, strValueOf, strValueOf2, iLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestMoveSticker$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestMoveSticker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
