package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0CqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM$unfavoriteItem$1", f = "MovieFavoriteListVM.kt", l = {114}, m = "invokeSuspend")
public final class C326110CqP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MovieFavoriteListVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EnumC326120CqQ LLILZ;
    public final /* synthetic */ C0OAT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326110CqP(MovieFavoriteListVM movieFavoriteListVM, String str, EnumC326120CqQ enumC326120CqQ, C0OAT c0oat, InterfaceC1364105Vn<? super C326110CqP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = movieFavoriteListVM;
        this.LLILLL = str;
        this.LLILZ = enumC326120CqQ;
        this.LLILZIL = c0oat;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326110CqP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieFavoriteListVM@8c6a.unfavoriteItem$1");
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
                InterfaceC326090CqN interfaceC326090CqN = (InterfaceC326090CqN) this.LLILLJJLI.LL.getValue().getOperator();
                String str = this.LLILLL;
                int collectionItemType = this.LLILZ.getCollectionItemType();
                this.LL = 1;
                if (interfaceC326090CqN.LLLLIIL(collectionItemType, str, this) == objLJFF) {
                    C1C7U.LIZIZ("MovieFavoriteListVM@8c6a.unfavoriteItem$1");
                    return objLJFF;
                }
            }
            EventBus.LIZLLL().LJIILL(new C613490O4l(TopicRawInfo.LIZ(this.LLILZIL.LL, C2286608xc.LJ(C0O4X.MOVIE.getType())), false));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LJ(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieFavoriteListVM@8c6a.unfavoriteItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
