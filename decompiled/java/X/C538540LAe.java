package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538540LAe extends i<C0L5P, C0LAO, C0LAQ, C0LAR> {
    public static final C538550LAf LLJJIJIIJIL = new Object() { // from class: X.0LAf
    };
    public static final int LLJJIJIL = 8;
    public static final String LLJJJ = "I2VMagicTaskLoadingComponent";
    public static final int LLJJJIL = 60000;
    public final C1DRG LLJILJILJ;
    public final String LLJILLL;
    public final Function0<C0LAQ> LLJJ;
    public final Function0<C0LAR> LLJJI;
    public VideoPublishEditModel LLJJIII;
    public boolean LLJJIJI;

    private final void Z4() {
        i3(AFwS239S0000000_8.get$arr$(388));
    }

    private final void n5() {
        i3(new AwS587S0100000_8(this, 763));
    }

    private final void v5() {
        i3(new AwS587S0100000_8(this, 764));
    }

    public final void F4() {
        String creationId;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIII;
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return;
        }
        iCreationAsyncTaskManagerLIZ.LJJIL(creationId);
    }

    public final void d5() {
        String creationId;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIII;
        if (videoPublishEditModel != null && (creationId = videoPublishEditModel.getCreationId()) != null && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
            C0LCT.LIZLLL(creationId, true);
        }
        i3(AFwS239S0000000_8.get$arr$(389));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        String creationId;
        super.onCreate();
        this.LLJJIJI = false;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJILJILJ.LJIIL(null, VideoPublishEditModel.class);
        this.LLJJIII = videoPublishEditModel;
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C537350L5p(creationId, this, null), 3);
        v5();
        n5();
        Z4();
        if (Intrinsics.LJFF(this.LLJILLL, "album")) {
            C0LAF c0laf = C0LAF.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = this.LLJJIII;
            c0laf.getClass();
            if (videoPublishEditModel2 != null) {
                C1402520mbK.LIZLLL(videoPublishEditModel2, "async_page", null, false, Boolean.FALSE, "", null, null, null);
            }
        }
    }

    public final void retry() {
        String creationId;
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
        Z4();
        VideoPublishEditModel videoPublishEditModel = this.LLJJIII;
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null || (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) == null) {
            return;
        }
        iCreationAsyncTaskManagerLIZ.LJJJIL(creationId);
    }

    public final void t5() {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJI(LLJJJ, AFwS189S0000000_3.get$arr$(377), false);
        }
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LAQ> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0LAR> w2() {
        return this.LLJJI;
    }

    public final Object H4(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        VideoPublishEditModel videoPublishEditModel = this.LLJJIII;
        if (videoPublishEditModel == null) {
            return Unit.LIZ;
        }
        Object objLIZJ = C0CHQ.LIZ().LJI().LIZIZ().LIZJ(new C570330MYl(C0CHQ.LIZ().LJII().LJI(videoPublishEditModel, new C0M2T(false, "TEMPLATE_SAVE_DRAFT", null, 25, false, 28)), new C560950LzJ("delete template draft", null, 2), false, null, null, 124), interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    public final void P4(List<C0LSZ> list) {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        K4(list, null, new AwS587S0100000_8(this, 761), new AwS587S0100000_8(this, 762));
    }

    public final void T4(String str) {
        i3(new AwS59S1000000_8(str, 22));
    }

    public final void k5(int i) {
        i3(new AwS23S0001000_8(i, 15));
    }

    public C538540LAe(C1DRG c1drg, C19A3 c19a3, String str) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = str;
        this.LLJJ = AFwS194S0000000_8.get$arr$(630);
        this.LLJJI = new AwS552S0100000_8(this, 1121);
    }

    public final void K4(List<C0LSZ> list, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super Integer, Unit> function12) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_TASK size=");
        sbLIZ.append(list.size());
        C201955140j.LJIIIIZZ(c563650M8t, LLJJJ, C2188811AlT.LIZIZ(sbLIZ));
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C0LSZ c0lsz : list) {
            C0LSZ c0lsz2 = c0lsz;
            String str = c0lsz2.LIZLLL;
            C0LQP c0lqp = C0LQP.I2V;
            if (!Intrinsics.LJFF(str, c0lqp.getTypeName()) && !Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TRANSITION_FRAME.getTypeName()) && !Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TEMPLATE_FL2V.getTypeName()) && !Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TEMPLATE_I2I.getTypeName())) {
                C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ASYNC_TASK ");
                sbLIZ2.append(c0lsz2);
                C201955140j.LIZLLL(c563650M8t2, LLJJJ, C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C563650M8t c563650M8t3 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ASYNC_TASK ");
                sbLIZ3.append(c0lsz2);
                C201955140j.LJIIIIZZ(c563650M8t3, LLJJJ, C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (Intrinsics.LJFF(c0lsz2.LIZLLL, c0lqp.getTypeName()) || Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TRANSITION_FRAME.getTypeName()) || Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TEMPLATE_FL2V.getTypeName()) || Intrinsics.LJFF(c0lsz2.LIZLLL, C0LQP.TEMPLATE_I2I.getTypeName())) {
                if (!Intrinsics.LJFF(c0lsz2.LJ, "CANCELED") && !Intrinsics.LJFF(c0lsz2.LJ, "FINISHED")) {
                    arrayList.add(c0lsz);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C201955140j.LIZLLL(C563650M8t.LIZIZ, LLJJJ, "onSuccess");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C0LSZ) next).LJ, "FAILED")) {
                if (next != null) {
                    C201955140j.LIZLLL(C563650M8t.LIZIZ, LLJJJ, "onFail");
                    if (function1 != null) {
                        function1.invoke("");
                        return;
                    }
                    return;
                }
            }
        }
        long j = 0;
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((C0LSZ) it3.next()).LJIL < 0) {
                    if (function12 != null) {
                        function12.invoke(-1);
                        return;
                    }
                    return;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            j += ((C0LSZ) it4.next()).LJIL;
        }
        float f = 1.0f;
        float fCeil = (float) Math.ceil((j * 1.0f) / LLJJJIL);
        if (fCeil >= 1.0f) {
            f = fCeil;
        }
        if (function12 != null) {
            function12.invoke(Integer.valueOf((int) f));
        }
    }
}
