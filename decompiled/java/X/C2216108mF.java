package X;

import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$actualBlockUser$2", f = "UserCardListAbility.kt", l = {421}, m = "invokeSuspend")
public final class C2216108mF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BlockStruct>, Object> {
    public BlockStruct LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216108mF(int i, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216108mF(this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BlockStruct blockStruct;
        C1C7U.LIZ("UserCardListAbility@7b48.actualBlockUser$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                blockStruct = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            blockStruct = BlockApi.LIZ.block(this.LLILLL, this.LLILZ, 1, this.LLILZIL).execute().LIZIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2216008mE c2216008mE = new C2216008mE(this.LLILZIL, null);
            this.LL = blockStruct;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2216008mE) == objLJFF) {
                C1C7U.LIZIZ("UserCardListAbility@7b48.actualBlockUser$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UserCardListAbility@7b48.actualBlockUser$2");
        return blockStruct;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BlockStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
