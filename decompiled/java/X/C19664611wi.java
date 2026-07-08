package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.logic.BaseLiveEventStickerDelegate$requestUnsetSticker$1", f = "BaseLiveEventStickerDelegate.kt", l = {78, 79}, m = "invokeSuspend")
public final class C19664611wi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC19664311wf LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ C19663611wY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19664611wi(AbstractC19664311wf abstractC19664311wf, long j, Function0<Unit> function0, Function0<Unit> function02, C19663611wY c19663611wY, InterfaceC1364105Vn<? super C19664611wi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC19664311wf;
        this.LLILLL = j;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = c19663611wY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19664611wi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC500940Jki interfaceC500940JkiUser;
        C1C7U.LIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1117450fBX c1117450fBX = ILiveEventStickerApi.LIZ;
            Long lLIZIZ = this.LLILLJJLI.LIZIZ();
            long j = this.LLILLL;
            int iLIZLLL = this.LLILLJJLI.LIZLLL();
            this.LL = 1;
            long currentUserId = 0;
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            }
            obj = c1117450fBX.LIZ(lLIZIZ, j, currentUserId, null, null, iLIZLLL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C19664811wk c19664811wk = new C19664811wk(zBooleanValue, this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c19664811wk) == objLJFF) {
            C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
