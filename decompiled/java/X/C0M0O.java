package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0M0O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$updateDraft$1", f = "DraftFragment.kt", l = {783}, m = "invokeSuspend")
public final class C0M0O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ DraftFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M0O(DraftFragment draftFragment, InterfaceC1364105Vn<? super C0M0O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M0O(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<C561950M2f> list;
        C0M0P c0m0p;
        String str;
        String str2;
        Object objLJI = obj;
        C1C7U.LIZ("DraftFragment@975a.updateDraft$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        C562020M2m c562020M2m = null;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftFragment -> updateDraft: operatedDraftCreationId = ");
            sbLIZ.append(this.LLILLL.LLJLLL);
            C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
            ((HashMap) this.LLILLL.PR().LLJIJIL.LIZ).remove(this.LLILLL.LLJLLL);
            list = this.LLILLL.PR().LLILZ;
            C0M45 c0m45 = C0M45.LIZ;
            String str3 = this.LLILLL.LLJLLL;
            this.LL = list;
            this.LLILLJJLI = 1;
            c0m45.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0M47(str3, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftFragment@975a.updateDraft$1");
                return objLJFF;
            }
        }
        DraftViewInfo draftViewInfo = (DraftViewInfo) objLJI;
        if (draftViewInfo != null) {
            Context context = this.LLILLL.getContext();
            String str4 = draftViewInfo.creationId;
            DraftShowInfo draftShowInfo = draftViewInfo.draftShowInfo;
            String str5 = draftShowInfo.coverPath;
            long j = draftViewInfo.draftOperationInfo.freeUpSpace;
            if (draftShowInfo.musicName.length() == 0) {
                str2 = "";
            } else {
                str2 = draftViewInfo.draftShowInfo.musicName;
            }
            String strLJII = C562270M3l.LJII(draftViewInfo, context);
            DraftShowInfo draftShowInfo2 = draftViewInfo.draftShowInfo;
            c0m0p = new C0M0P(106, str4, str5, j, str2, strLJII, draftShowInfo2.saveTime, draftShowInfo2.time, false, null, 0.0f, null, draftShowInfo2.mentionUserAvatars, draftShowInfo2.isFirstAISelfAutoCast, null, null, null, null, null, false, false, draftViewInfo.draftOperationInfo.hasAigcNewFrameworkTask, 33529600);
        } else {
            c0m0p = null;
            if (C1466090oFr.LJIILJJIL(list, new AwS587S0100000_8(this.LLILLL, 320))) {
                C562020M2m c562020M2m2 = this.LLILLL.LLJJL;
                if (c562020M2m2 != null) {
                    c562020M2m = c562020M2m2;
                }
                c562020M2m.setData(list);
                DraftFragment draftFragment = this.LLILLL;
                draftFragment.LLJLLL = "";
                if (draftFragment.PR().DQ2()) {
                    this.LLILLL.fM();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftFragment@975a.updateDraft$1");
                return unit;
            }
        }
        Iterator<C561950M2f> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C561950M2f next = it2.next();
            if (next instanceof C0M0P) {
                String str6 = ((C0M0P) next).LJ;
                if (c0m0p != null) {
                    str = c0m0p.LJ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str6, str)) {
                    int iIndexOf = list.indexOf(next);
                    C0M0P c0m0p2 = (C0M0P) ListProtector.get(list, iIndexOf);
                    ListProtector.set(list, iIndexOf, new C0M0P(c0m0p.LIZLLL, c0m0p.LJ, c0m0p.LJFF, c0m0p.LJI, c0m0p.LJII, c0m0p.LJIIIIZZ, c0m0p.LJIIIZ, c0m0p.LJIIJ, c0m0p.LJIIJJI, c0m0p.LJIIL, c0m0p2.LJIILIIL, c0m0p2.LJIILJJIL, c0m0p2.LJIILL, c0m0p.LJIILLIIL, c0m0p.LJIIZILJ, c0m0p.LJIJ, c0m0p.LJIJI, c0m0p.LJIJJ, c0m0p.LJIJJLI, c0m0p.LJIL, c0m0p.LJJ, c0m0p.LJJI, c0m0p.LJJIFFI, c0m0p.LJJII, c0m0p.LJJIII, c0m0p.LJJIIJ));
                    C562020M2m c562020M2m3 = this.LLILLL.LLJJL;
                    if (c562020M2m3 != null) {
                        c562020M2m = c562020M2m3;
                    }
                    c562020M2m.setData(list);
                    this.LLILLL.LLJLLL = "";
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftFragment@975a.updateDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
