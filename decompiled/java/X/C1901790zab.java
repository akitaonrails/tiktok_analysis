package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.open.component.viewmodel.NoticeViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.open.component.viewmodel.NoticeViewModel$request$1", f = "NoticeViewModel.kt", l = {89}, m = "invokeSuspend")
public final class C1901790zab extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public NoticeViewModel LL;
    public InterfaceC1364105Vn LLILLJJLI;
    public AbstractC1901900zam LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ NoticeViewModel LLILZLL;
    public final /* synthetic */ C1901780zaa LLIZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLIZLLLIL;
    public final /* synthetic */ AbstractC1901900zam LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1901790zab(NoticeViewModel noticeViewModel, C1901780zaa c1901780zaa, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, AbstractC1901900zam abstractC1901900zam, InterfaceC1364105Vn<? super C1901790zab> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILZLL = noticeViewModel;
        this.LLIZ = c1901780zaa;
        this.LLIZLLLIL = interfaceC1364105Vn;
        this.LLJ = abstractC1901900zam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1901790zab c1901790zab = new C1901790zab(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1901790zab.LLILZIL = obj;
        return c1901790zab;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        NoticeViewModel noticeViewModel;
        InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> interfaceC1364105Vn;
        AbstractC1901900zam abstractC1901900zam;
        NoticeItems noticeItems;
        List<InterfaceC1891350zJl> value;
        List<? extends MusNotice> list;
        boolean z;
        int i;
        boolean z2;
        Object objLIZ = obj;
        C1C7U.LIZ("NoticeViewModel@a89a.request$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    abstractC1901900zam = this.LLILLL;
                    interfaceC1364105Vn = this.LLILLJJLI;
                    noticeViewModel = this.LL;
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZ);
                Object obj2 = this.LLILZIL;
                noticeViewModel = this.LLILZLL;
                C1901780zaa c1901780zaa = this.LLIZ;
                interfaceC1364105Vn = this.LLIZLLLIL;
                abstractC1901900zam = this.LLJ;
                C1901760zaY c1901760zaY = C1901760zaY.LIZ;
                int i3 = noticeViewModel.LLJILLL;
                this.LLILZIL = obj2;
                this.LL = noticeViewModel;
                this.LLILLJJLI = interfaceC1364105Vn;
                this.LLILLL = abstractC1901900zam;
                this.LLILZ = 1;
                objLIZ = c1901760zaY.LIZ(i3, true, c1901780zaa, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("NoticeViewModel@a89a.request$1");
                    return objLJFF;
                }
            }
            noticeItems = (NoticeItems) objLIZ;
            if (noticeItems != null) {
                if (Intrinsics.LJFF(abstractC1901900zam, C1901940zaq.LIZ)) {
                    noticeViewModel.LLJIJIL = noticeItems.commonLastReadTime;
                    noticeViewModel.LLJILJIL = noticeItems.commonLastReadTimeForFriends;
                }
                long j = noticeItems.minTime;
                long j2 = noticeItems.maxTime;
                boolean z3 = noticeItems.hasMore;
                String str = noticeItems.cursor;
                long j3 = noticeViewModel.LLJIJIL;
                try {
                    long j4 = noticeViewModel.LLJILJIL;
                    if (z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    noticeViewModel.LLJJIII = new C1901780zaa(j2, j, j3, j4, str, z2);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            }
            value = noticeViewModel.LLJI.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (noticeItems != null && (list = noticeItems.items) != null) {
            for (final MusNotice musNotice : list) {
                if (musNotice.templateNotice == null) {
                    i = musNotice.type;
                } else {
                    i = -10000;
                }
                if (i == -10000) {
                    Boolean.valueOf(value.add(new C1901810zad(musNotice) { // from class: X.0zac
                    }));
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("itemType:");
                    sbLIZ.append(i);
                    sbLIZ.append(" is not support");
                    C2286608xc.LJ(Log.w("NoticeViewModel", C2188811AlT.LIZIZ(sbLIZ)));
                }
            }
            C1901780zaa c1901780zaa2 = noticeViewModel.LLJJIII;
            if (c1901780zaa2 != null && c1901780zaa2.LIZ) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, true, null, 5);
                C189200o6.m2constructorimpl(c323380Cm0LJ);
                interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
            } else {
                C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
                C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
                interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
            }
            noticeViewModel.LLJI.postValue(value);
            noticeViewModel.yQ2(abstractC1901900zam, C1901970zat.LIZ);
            if (Intrinsics.LJFF(abstractC1901900zam, C1901940zaq.LIZ)) {
                noticeViewModel.wQ2();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            NoticeViewModel noticeViewModel2 = this.LLILZLL;
            AbstractC1901900zam abstractC1901900zam2 = this.LLJ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i4 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("NoticeViewModel", "fetch notice data error", thM5exceptionOrNullimpl);
                noticeViewModel2.yQ2(abstractC1901900zam2, C1901820zae.LIZ);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NoticeViewModel@a89a.request$1");
            return unit;
        }
        noticeViewModel.yQ2(abstractC1901900zam, C1901830zaf.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NoticeViewModel@a89a.request$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
