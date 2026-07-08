package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.viewbinder.RankListItemViewBinder$RankListItemViewHolder$loadUserDescriptionImageAsync$1", f = "RankCommonItemsVB.kt", l = {620, 661, 671}, m = "invokeSuspend")
public final class C474260Iim extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099G LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RankListV2Response.TeamRankExtra LLILZ;
    public final /* synthetic */ C1811270xEb LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474260Iim(RankListV2Response.TeamRankExtra teamRankExtra, C1811270xEb c1811270xEb, InterfaceC1364105Vn<? super C474260Iim> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = teamRankExtra;
        this.LLILZIL = c1811270xEb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C474260Iim c474260Iim = new C474260Iim(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c474260Iim.LLILLL = obj;
        return c474260Iim;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ba  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C474260Iim.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
