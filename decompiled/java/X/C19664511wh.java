package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.logic.BaseLiveEventStickerDelegate$requestSetSticker$1", f = "BaseLiveEventStickerDelegate.kt", l = {48, 56}, m = "invokeSuspend")
public final class C19664511wh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC19664311wf LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<C19663611wY, Unit> LLILZLL;
    public final /* synthetic */ C19663611wY LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19664511wh(AbstractC19664311wf abstractC19664311wf, long j, String str, String str2, Function1<? super C19663611wY, Unit> function1, C19663611wY c19663611wY, Function0<Unit> function0, InterfaceC1364105Vn<? super C19664511wh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC19664311wf;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = function1;
        this.LLIZ = c19663611wY;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19664511wh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC500940Jki interfaceC500940JkiUser;
        C1C7U.LIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1");
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
            int iLIZJ = this.LLILLJJLI.LIZJ();
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            long currentUserId = 0;
            UserService userService = UserService.getInstance();
            if (userService != null && (interfaceC500940JkiUser = userService.user()) != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            }
            obj = c1117450fBX.LIZ(lLIZIZ, j, currentUserId, str, str2, iLIZJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C19664711wj c19664711wj = new C19664711wj(zBooleanValue, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c19664711wj) == objLJFF) {
            C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
