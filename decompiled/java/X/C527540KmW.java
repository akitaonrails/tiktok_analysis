package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.performance.AlbumSelectionRestorePerformanceMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelectionRestoreComponent$onCreate$1", f = "AlbumSelectionRestoreComponent.kt", l = {134}, m = "invokeSuspend")
public final class C527540KmW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C527520KmU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527540KmW(C527520KmU c527520KmU, InterfaceC1364105Vn<? super C527540KmW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c527520KmU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C527540KmW c527540KmW = new C527540KmW(this.LLILLL, interfaceC1364105Vn);
        c527540KmW.LLILLJJLI = obj;
        return c527540KmW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Context contextRequireContext = this.LLILLL.G2().requireContext();
            C524780Ki4.LIZ.start(AlbumSelectionRestorePerformanceMonitor.INSTANCE, (String) null);
            C1DFB c1dfb = C0PEM.LIZJ;
            C527530KmV c527530KmV = new C527530KmV(this.LLILLL, contextRequireContext, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c527530KmV);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            ChooseMediaViewModel chooseMediaViewModelT2 = this.LLILLL.T2();
            chooseMediaViewModelT2.getClass();
            chooseMediaViewModelT2.yR2(new AwS587S0100000_8(list, (List<MentionDataItem>) 172));
            Set<String> set = this.LLILLL.LLJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((MediaModel) it2.next()).id);
            }
            set.addAll(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
