package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.154w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.music.vertical.tab.recommend.RecommendMusicTabViewV3$initAIAdapter$2$1", f = "RecommendMusicTabViewV3.kt", l = {370}, m = "invokeSuspend")
public final class C204620154w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C204618154u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C204620154w(C204618154u c204618154u, InterfaceC1364105Vn<? super C204620154w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c204618154u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C204620154w(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List data;
        C1C7U.LIZ("RecommendMusicTabViewV3@7c1b.initAIAdapter$2$1");
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
            this.LL = 1;
            anonymousClass1553LJIIJ.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new AnonymousClass1552(anonymousClass1553LJIIJ, context, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecommendMusicTabViewV3@7c1b.initAIAdapter$2$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        C129G c129g = this.LLILLJJLI.LJIIJ;
        if (c129g != null) {
            c129g.resetLoadMoreState();
        }
        if (this.LLILLJJLI.LJIIIIZZ()) {
            ArrayList arrayList = new ArrayList();
            C129G c129g2 = this.LLILLJJLI.LJIIJ;
            if (c129g2 == null || (data = c129g2.getData()) == null) {
                data = C13BV.INSTANCE;
            }
            arrayList.addAll(data);
            arrayList.addAll(list);
            C129G c129g3 = this.LLILLJJLI.LJIIJ;
            if (c129g3 != null) {
                c129g3.setDataAfterLoadMore(arrayList);
            }
        } else {
            C129G c129g4 = this.LLILLJJLI.LJIIJ;
            if (c129g4 != null) {
                c129g4.addData(list);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendMusicTabViewV3@7c1b.initAIAdapter$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
