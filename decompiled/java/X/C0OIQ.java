package X;

import android.content.Context;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$subscribeBulletinBoard$1", f = "BulletinProfileViewModel.kt", l = {1432, 1460}, m = "invokeSuspend")
public final class C0OIQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0OIQ(BulletinProfileViewModel bulletinProfileViewModel, Context context, long j, String str, String str2, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C0OIQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = context;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OIQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("BulletinProfileViewModel@3b06.subscribeBulletinBoard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIIIIZZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinProfileViewModel@3b06.subscribeBulletinBoard$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJIIIIZZ);
        } else {
            C155000ia.LIZIZ(objLJIIIIZZ);
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(362));
            C618910OPh c618910OPh = C618910OPh.LIZ;
            Context context = this.LLILLL;
            long j = this.LLILZ;
            BulletinProfileViewModel bulletinProfileViewModel = this.LLILLJJLI;
            String str = bulletinProfileViewModel.LLILZIL;
            boolean z = bulletinProfileViewModel.LLIZLLLIL;
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLILZIL), new Pair("channel_id", String.valueOf(this.LLILZ)), new Pair("entrance_page", this.LLILZLL));
            BulletinProfileViewModel bulletinProfileViewModel2 = this.LLILLJJLI;
            String str2 = bulletinProfileViewModel2.LLILLL;
            String str3 = bulletinProfileViewModel2.LLILZ;
            User user = bulletinProfileViewModel2.LLJILLL;
            this.LL = 1;
            objLJIIIIZZ = c618910OPh.LJIIIIZZ(context, j, str, z, mapLJIIIIZZ, str2, str3, user, null, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.subscribeBulletinBoard$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJIIIIZZ).booleanValue();
        if (zBooleanValue) {
            this.LLILLJJLI.aR2(C2286608xc.LJ(EnumC617010OHz.CHANNEL_SUBSCRIBED.getStatus()));
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(363));
        } else {
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(364));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1324905Gl c1324905Gl = new C1324905Gl(null, this.LLIZ, zBooleanValue);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1324905Gl) == objLJFF) {
            C1C7U.LIZIZ("BulletinProfileViewModel@3b06.subscribeBulletinBoard$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.subscribeBulletinBoard$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
