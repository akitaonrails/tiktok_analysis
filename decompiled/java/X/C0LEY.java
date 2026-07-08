package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LEY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildRecordReturnArguments$1$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
public final class C0LEY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ReturnEcommerceCommentModel LLILLJJLI;
    public final /* synthetic */ C539580LEe LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LEY(ReturnEcommerceCommentModel returnEcommerceCommentModel, C539580LEe c539580LEe, boolean z, String str, InterfaceC1364105Vn<? super C0LEY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = returnEcommerceCommentModel;
        this.LLILLL = c539580LEe;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LEY c0ley = new C0LEY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0ley.LL = obj;
        return c0ley;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIJI;
        C1C7U.LIZ("ExteriorMediaProcess@c447.buildRecordReturnArguments$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = "video";
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            ReturnEcommerceCommentModel returnEcommerceCommentModel = this.LLILLJJLI;
            if (returnEcommerceCommentModel != null) {
                ((ArrayList) this.LLILLL.LIZLLL).add(returnEcommerceCommentModel);
            } else {
                boolean z = this.LLILZ;
                if (!z) {
                    str = "photo";
                }
                String str2 = "";
                if (z) {
                    strLJIJI = "";
                } else {
                    str2 = this.LLILZIL;
                    strLJIJI = C2471909mP.LJIJI(this.LLILZIL);
                    if (strLJIJI == null) {
                        strLJIJI = "image/jpeg";
                    }
                }
                long jLJIIIZ = C2471909mP.LJIIIZ(this.LLILZIL);
                long jLJIIIZ2 = C2471909mP.LJIIIZ(this.LLILZIL);
                String str3 = this.LLILZIL;
                ((ArrayList) this.LLILLL.LIZLLL).add(new ReturnEcommerceCommentModel(-1, str3, str3, C2286608xc.LJFF(jLJIIIZ), jLJIIIZ2, str, str2, strLJIJI));
            }
            C539580LEe c539580LEe = this.LLILLL;
            c539580LEe.LIZJ.invoke("shoot", new C539570LEd(true, false, false), c539580LEe.LIZLLL);
        } else {
            if (!this.LLILZ) {
                str = "photo";
            }
            C539580LEe c539580LEe2 = this.LLILLL;
            C539630LEj.LIZJ(c539580LEe2.LIZIZ, this.LLILZIL, str, EnumC539610LEh.RECORD_COROUTINE_SCOPE_INACTIVE, "shoot", System.currentTimeMillis() - c539580LEe2.LJIIL, "");
            this.LLILLL.LIZJ.invoke("shoot", new C539570LEd(false, false, true), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildRecordReturnArguments$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
