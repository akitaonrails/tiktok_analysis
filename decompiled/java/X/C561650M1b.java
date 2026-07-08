package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxOrganizerComponent$openManageSheet$2", f = "DraftBoxOrganizerComponent.kt", l = {312}, m = "invokeSuspend")
public final class C561650M1b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0M26 LLILLL;
    public final /* synthetic */ EnumC561670M1d LLILZ;
    public final /* synthetic */ C0M22 LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ DraftBoxFragment LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561650M1b(C0M26 c0m26, EnumC561670M1d enumC561670M1d, C0M22 c0m22, boolean z, String str, DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561650M1b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0m26;
        this.LLILZ = enumC561670M1d;
        this.LLILZIL = c0m22;
        this.LLILZLL = z;
        this.LLIZ = str;
        this.LLIZLLLIL = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C561650M1b c561650M1b = new C561650M1b(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c561650M1b.LLILLJJLI = obj;
        return c561650M1b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<C561950M2f> list;
        List listLIZ;
        boolean z;
        C1C7U.LIZ("DraftBoxOrganizerComponent@6d25.openManageSheet$2");
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
                DraftBoxFragment draftBoxFragment = this.LLIZLLLIL;
                this.LL = 1;
                if (draftBoxFragment.RR(true, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.openManageSheet$2");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIJ(C0MAY.LIZIZ, "DraftBoxOrganizer", thM5exceptionOrNullimpl);
        }
        C561900M2a c561900M2a = this.LLILLL.LJIIJJI;
        if (c561900M2a != null) {
            list = c561900M2a.LLILLJJLI;
        } else {
            list = null;
        }
        if (list == null) {
            C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxOrganizer", "openManageSheet: abort — adapter items=null after ensureAllDraftsLoaded");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.openManageSheet$2");
            return unit;
        }
        ArrayList arrayList = new ArrayList();
        for (C561950M2f c561950M2f : list) {
            if (c561950M2f instanceof C0M0P) {
                arrayList.add(c561950M2f);
            }
        }
        int i2 = C561660M1c.LIZ[this.LLILZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                listLIZ = C561750M1l.LIZIZ(((long) C561710M1h.LIZ().topBannerSizeSectionMB) * 1024 * 1024, arrayList);
            } else {
                throw new C1954807lC();
            }
        } else {
            listLIZ = C561750M1l.LIZ(arrayList, this.LLILZIL);
        }
        if (listLIZ.isEmpty()) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sb = new StringBuilder("openManageSheet: skip — no eligible drafts after bucketing (rawItems=");
            sb.append(list.size());
            sb.append(", drafts=");
            sb.append(arrayList.size());
            sb.append(", eligibleAfterStatusFilter=");
            int i3 = 0;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    if (((C0M0P) it2.next()).LJIILIIL == EnumC545550LaT.NONE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i3 = i3 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            sb.append(i3);
            sb.append(')');
            C201955140j.LIZLLL(c0may, "DraftBoxOrganizer", sb.toString());
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.openManageSheet$2");
            return unit2;
        }
        C0MAY c0may2 = C0MAY.LIZIZ;
        C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", "openManageSheet: open — drafts=" + arrayList.size() + ", sections=" + listLIZ.size() + ", enterFrom=" + this.LLILLL.LJFF + ", fromExposure=" + this.LLILZLL + ", source=" + this.LLIZ + ", mode=" + this.LLILZ);
        C561700M1g c561700M1g = C561700M1g.LIZ;
        String str = this.LLIZ;
        EnumC561670M1d enumC561670M1d = this.LLILZ;
        C0M22 c0m22 = this.LLILZIL;
        String str2 = this.LLILLL.LJFF;
        c561700M1g.getClass();
        C0M16.LJ(C0M16.LIZ, str2, C2097608Jq.LJ(), false, str, "popup", C561700M1g.LIZJ(enumC561670M1d, c0m22), "no_filter", 4);
        this.LLILLL.LJIILLIIL(new C561880M1y(listLIZ, this.LLILZ));
        if (this.LLILZLL) {
            C0M26 c0m26 = this.LLILLL;
            c0m26.LJI = true;
            IDraftOrganizerPostTracker iDraftOrganizerPostTracker = (IDraftOrganizerPostTracker) c0m26.LJIILL.getValue();
            if (iDraftOrganizerPostTracker != null) {
                iDraftOrganizerPostTracker.LIZ();
            }
            C201955140j.LIZLLL(c0may2, "DraftBoxOrganizer", "openManageSheet: window opened (source=" + this.LLIZ + ')');
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.openManageSheet$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
