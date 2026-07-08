package X;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.invite.BulletinInviteButtonViewConfigManager$subscribeBulletin$1", f = "BulletinInviteButtonViewConfigManager.kt", l = {63}, m = "invokeSuspend")
public final class C604800Nnq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C604810Nnr LLILLL;
    public final /* synthetic */ C604870Nnx LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C604800Nnq(Context context, C604810Nnr c604810Nnr, C604870Nnx c604870Nnx, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C604800Nnq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c604810Nnr;
        this.LLILZ = c604870Nnx;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604800Nnq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Long lLJFF;
        String str2;
        C1C7U.LIZ("BulletinInviteButtonViewConfigManager@8829.subscribeBulletin$1");
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
            C214824195i c214824195i = C214824195i.LIZIZ;
            Context context = this.LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILLL.LIZ);
            C604810Nnr c604810Nnr = this.LLILLL;
            String str3 = c604810Nnr.LJ;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            boolean z = c604810Nnr.LIZLLL;
            Pair[] pairArr = new Pair[3];
            C604870Nnx c604870Nnx = this.LLILZ;
            if (c604870Nnx == null || (str = c604870Nnx.LIZIZ) == null) {
                str = "";
            }
            pairArr[0] = new Pair("enter_from", str);
            C604870Nnx c604870Nnx2 = this.LLILZ;
            if (c604870Nnx2 != null) {
                lLJFF = C2286608xc.LJFF(c604870Nnx2.LIZ);
            } else {
                lLJFF = null;
            }
            pairArr[1] = new Pair("channel_id", String.valueOf(lLJFF));
            C604870Nnx c604870Nnx3 = this.LLILZ;
            if (c604870Nnx3 != null && (str2 = c604870Nnx3.LIZJ) != null) {
                str4 = str2;
            }
            pairArr[2] = new Pair("entrance_page", str4);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            this.LL = 1;
            obj = c214824195i.LJIIJ(context, strValueOf, str3, mapLJIIIIZZ, this, z);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinInviteButtonViewConfigManager@8829.subscribeBulletin$1");
                return objLJFF;
            }
        }
        this.LLILZIL.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinInviteButtonViewConfigManager@8829.subscribeBulletin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
