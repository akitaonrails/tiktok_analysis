package X;

import Y.AfS178S0100000_9;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.guide.api.EditorProGuideTargetUserApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459930o5v {
    public static boolean LJIIL;
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Function0<InterfaceC1460000o62> LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public TuxSheet LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(537));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(538));
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;

    public final void LIZ(Function1<? super Boolean, Unit> function1) {
        C1403010mc7.LIZ.getCommerceService();
        if (C1465270oEX.LIZ() >= 10000) {
            function1.invoke(Boolean.TRUE);
        } else {
            ((C11NJ) this.LJII.getValue()).LIZ(((EditorProGuideTargetUserApi.Api) ((EditorProGuideTargetUserApi) this.LJI.getValue()).LIZ.getValue()).requestIsEpGuideTargetUser(true, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 81), new AfS178S0100000_9(function1, (Function1<? super Throwable, Unit>) 82)));
        }
    }

    public final void LIZIZ(Function1<? super Boolean, Unit> function1) {
        Boolean bool = this.LIZLLL;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            C0CNO.LIZ(C15O7.LJI, new AwS566S0100000_22(new AwS423S0200000_22(this, (C1459930o5v) function1, (Function1<? super Boolean, Unit>) 117), 1127));
        } else {
            function1.invoke(bool2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1459930o5v(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0<? extends InterfaceC1460000o62> function0) {
        boolean z;
        boolean z2;
        boolean z3;
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = function0;
        if (!C291390BbV.LIZ() && !C256100A1w.LIZ() && !C256090A1v.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIIZZ = z;
        if (C291390BbV.LIZ() && !C256100A1w.LIZ() && C256090A1v.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        if (!C291390BbV.LIZ() && C256100A1w.LIZ() && !C256090A1v.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJIIJ = z3;
        this.LJIIJJI = !C291390BbV.LIZ() && C256100A1w.LIZ() && C256090A1v.LIZ();
    }
}
