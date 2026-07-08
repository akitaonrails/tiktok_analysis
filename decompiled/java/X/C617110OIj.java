package X;

import android.content.Context;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$unSubscribeBulletinBoard$1", f = "BulletinProfileViewModel.kt", l = {1469}, m = "invokeSuspend")
public final class C617110OIj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ BulletinProfileViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617110OIj(Context context, long j, BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C617110OIj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = j;
        this.LLILZ = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C617110OIj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.unSubscribeBulletinBoard$1");
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
            C618910OPh c618910OPh = C618910OPh.LIZ;
            Context context = this.LLILLJJLI;
            long j = this.LLILLL;
            BulletinProfileViewModel bulletinProfileViewModel = this.LLILZ;
            String str = bulletinProfileViewModel.LLILLL;
            String str2 = bulletinProfileViewModel.LLILZ;
            this.LL = 1;
            obj = c618910OPh.LJIILIIL(context, j, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.unSubscribeBulletinBoard$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILZ.aR2(C2286608xc.LJ(EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED.getStatus()));
            this.LLILZ.setState(AFwS240S0000000_9.get$arr$(366));
            C1440005kM.LIZ(new C1902940zcS(15, C0ORP.DELETE.getType(), 0, String.valueOf(this.LLILLL)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.unSubscribeBulletinBoard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
