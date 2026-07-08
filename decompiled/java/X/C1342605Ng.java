package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$shortUrl$2", f = "FriendsEmptyPageMainSectionVM.kt", l = {149}, m = "invokeSuspend")
public final class C1342605Ng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342605Ng(String str, InterfaceC1364105Vn<? super C1342605Ng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342605Ng(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String url;
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.shortUrl$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C11NZ<ShortenUrlModel> c11nzLIZJ = C1076010e6h.LIZJ.LIZJ(this.LLILLJJLI);
                this.LL = 1;
                obj = C11UD.LIZJ(c11nzLIZJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.shortUrl$2");
                    return objLJFF;
                }
            }
            url = ((ShortenUrlModel) obj).getUrl();
            if (url == null) {
                url = this.LLILLJJLI;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("Friends", "short url error", th);
            url = this.LLILLJJLI;
        }
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.shortUrl$2");
        return url;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
