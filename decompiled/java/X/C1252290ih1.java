package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ih1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM$follow$1$2", f = "UserProfileFollowVM.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C1252290ih1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1252380ihA LLILLJJLI;
    public final /* synthetic */ UserProfileFollowVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1252290ih1(C1252380ihA c1252380ihA, UserProfileFollowVM userProfileFollowVM, InterfaceC1364105Vn<? super C1252290ih1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1252380ihA;
        this.LLILLL = userProfileFollowVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1252290ih1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1252280ih0 c1252280ih0;
        C1252610ihX c1252610ihX;
        Integer followFrom;
        C1C7U.LIZ("UserProfileFollowVM@2122.follow$1$2");
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
            C1252380ihA c1252380ihA = this.LLILLJJLI;
            final Aweme aweme = c1252380ihA.LJIIIIZZ;
            final String str = c1252380ihA.LJIIIZ;
            C1252230igv c1252230igvWQ2 = this.LLILLL.wQ2();
            if (c1252230igvWQ2 != null && (c1252280ih0 = c1252230igvWQ2.LLIZLLLIL) != null && (c1252610ihX = c1252280ih0.LJFF) != null && (followFrom = c1252610ihX.getFollowFrom()) != null && followFrom.intValue() != 0) {
                this.LLILLJJLI.LJ = followFrom.intValue();
            }
            C1252650ihb c1252650ihbLIZLLL = C1076010e6h.LIZJ.LIZIZ().LIZLLL(this.LLILLJJLI);
            final C1252380ihA c1252380ihA2 = this.LLILLJJLI;
            final UserProfileFollowVM userProfileFollowVM = this.LLILLL;
            InterfaceC346701Wf<? super C1252340ih6> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ih5
                /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r26, X.InterfaceC1364105Vn r27) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 662
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1252330ih5.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (c1252650ihbLIZLLL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("UserProfileFollowVM@2122.follow$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserProfileFollowVM@2122.follow$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
