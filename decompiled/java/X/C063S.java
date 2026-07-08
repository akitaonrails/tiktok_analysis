package X;

import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.utils.ExternalShareGroupUtils$getExternalShareGroupLink$1$1", f = "ExternalShareGroupUtils.kt", l = {173}, m = "invokeSuspend")
public final class C063S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GroupInviteInfoModel>, Object> {
    public int LL;
    public final /* synthetic */ AwemeSharePackage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063S(AwemeSharePackage awemeSharePackage, InterfaceC1364105Vn<? super C063S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeSharePackage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063S(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$1$1");
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
            String string = this.LLILLJJLI.extras.getString("share_post_and_group_to_chat_id");
            if (string == null) {
                string = "";
            }
            this.LL = 1;
            obj = C1477105qL.LIZIZ(string, 1, this, 4);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.getExternalShareGroupLink$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GroupInviteInfoModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
