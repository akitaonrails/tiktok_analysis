package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.0RUE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUE extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RUE(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        boolean z;
        String strT1;
        boolean zM8;
        Object c098200Yq;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        Assembler assembler2 = assembler;
        C0S78.LJ(true, new C1161104gT(assembler2, this.LL));
        if (C1157604fu.LIZ()) {
            MainPageFragment mainPageFragment = this.LL;
            C1160904gR c1160904gR = new C1160904gR(mainPageFragment);
            C696590RUb c696590RUb = new C696590RUb();
            c1160904gR.invoke(c696590RUb);
            UIContentAssem uIContentAssem = (UIContentAssem) C13LP.LJJJJZI(c696590RUb.LIZIZ(c696590RUb.LLILZIL.LL));
            boolean z2 = uIContentAssem instanceof C0RUJ;
            Object obj = null;
            if (z2 && (c0ruj2 = (C0RUJ) uIContentAssem) != null) {
                strT1 = c0ruj2.T1();
            } else {
                strT1 = null;
            }
            if (z2 && (c0ruj = (C0RUJ) uIContentAssem) != null) {
                zM8 = c0ruj.m8();
            } else {
                zM8 = false;
            }
            C0RUB c0rubLIZJ = C0RUC.LIZJ("homepage_hot", strT1, 0, 0, zM8);
            EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
            int i = C695680RQo.LIZ[enumC695670RQn.ordinal()];
            if (i != 1) {
                if (i != 8) {
                    try {
                        c098200Yq = C724240Sb0.LIZ(mainPageFragment);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    C0RUC.LIZLLL((C19EG) obj, enumC695670RQn, c0rubLIZJ, uIContentAssem, new C0RUH(assembler2, mainPageFragment, c696590RUb, uIContentAssem));
                } else {
                    assembler2.QQ2(mainPageFragment, new AwS377S0200000_11(c696590RUb, uIContentAssem, 154));
                }
            }
        }
        if (C1157804fw.LIZ()) {
            C0RUC.LIZ(this.LL, assembler2, AFwS229S0000000_2.get$arr$(401));
        }
        if ((((Number) C1157404fs.LIZ.getValue()).intValue() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        C0S78.LJ(z, new AwS403S0200000_2(assembler2, this.LL, 26));
        C696580RUa.LIZ.getClass();
        if (C696580RUa.LIZ() > 0) {
            C0S78.LJ(true, new C1156504fj(assembler2, this.LL));
        }
        return Unit.LIZ;
    }
}
