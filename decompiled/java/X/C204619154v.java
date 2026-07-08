package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.recommend.RecommendMusicTabViewV3$loadMusicList$3", f = "RecommendMusicTabViewV3.kt", l = {205}, m = "invokeSuspend")
public final class C204619154v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C204618154u LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204619154v(C204618154u c204618154u, boolean z, boolean z2, InterfaceC1364105Vn<? super C204619154v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c204618154u;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204619154v(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RecommendMusicTabViewV3@7c1b.loadMusicList$3");
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
            AnonymousClass1553 anonymousClass1553LJIIJ = this.LLILLJJLI.LJIIJ();
            Context context = this.LLILLJJLI.LJ;
            boolean z = this.LLILLL;
            boolean z2 = this.LLILZ;
            this.LL = 1;
            anonymousClass1553LJIIJ.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new AnonymousClass1551(anonymousClass1553LJIIJ, z2, context, z, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecommendMusicTabViewV3@7c1b.loadMusicList$3");
                return objLJFF;
            }
        }
        List<MusicModel> list = (List) obj;
        boolean zBooleanValue = this.LLILLJJLI.LIZJ().LJIJ.invoke().booleanValue();
        C129G c129g = this.LLILLJJLI.LJIIJ;
        if (c129g != null) {
            c129g.LLJI = zBooleanValue;
        }
        this.LLILLJJLI.LJIILIIL(list);
        this.LLILLJJLI.LJII();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendMusicTabViewV3@7c1b.loadMusicList$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
