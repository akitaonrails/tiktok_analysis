package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.preview.B2CAwemeIdProvider$refresh$1", f = "B2CAwemeIdProvider.kt", l = {78, 94}, m = "invokeSuspend")
public final class C597240Nbe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C597210Nbb LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597240Nbe(C597210Nbb c597210Nbb, String str, InterfaceC1364105Vn<? super C597240Nbe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c597210Nbb;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597240Nbe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listSingletonList;
        C1C7U.LIZ("B2CAwemeIdProvider@522f.refresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("B2CAwemeIdProvider@522f.refresh$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C597210Nbb c597210Nbb = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = c597210Nbb.LLILZ;
            this.LL = 1;
            obj = c597210Nbb.LJII(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("B2CAwemeIdProvider@522f.refresh$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Aweme aweme = new Aweme();
            aweme.setAid("invalid_aid");
            AwemeStatus awemeStatus = new AwemeStatus();
            aweme.setCanPlay(false);
            awemeStatus.setDelete(true);
            aweme.setStatus(awemeStatus);
            User user = new User();
            user.setAdFake(false);
            aweme.setAuthor(user);
            listSingletonList = Collections.singletonList(new C912500Zqy(-1L, "123", aweme));
        } else {
            listSingletonList = Collections.singletonList(new C912500Zqy(-1L, this.LLILLL, this.LLILLJJLI.LL));
        }
        C2238608ps c2238608ps = C2108208Ns.LIZ;
        C597230Nbd c597230Nbd = new C597230Nbd(this.LLILLJJLI, listSingletonList, null);
        this.LL = 2;
        if (C23250099c.LJI(this, c2238608ps, c597230Nbd) == objLJFF) {
            C1C7U.LIZIZ("B2CAwemeIdProvider@522f.refresh$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("B2CAwemeIdProvider@522f.refresh$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
