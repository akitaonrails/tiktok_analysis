package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.basic.MatchStartAnimationComponent$loadAnimationResource$1", f = "MatchStartAnimationComponent.kt", l = {463}, m = "invokeSuspend")
public final class C973220bQu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C954460awe> LLILLL;
    public final /* synthetic */ C978020bYe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973220bQu(List<C954460awe> list, C978020bYe c978020bYe, InterfaceC1364105Vn<? super C973220bQu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c978020bYe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C973220bQu c973220bQu = new C973220bQu(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c973220bQu.LLILLJJLI = obj;
        return c973220bQu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        String str;
        String str2;
        Boolean boolValueOf;
        C1C7U.LIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1");
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
            int size = this.LLILLL.size();
            if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1 && size == 2) {
                C20441214yg.LIZIZ("MatchStartAnimationComponent", "error type and num");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1");
                return unit;
            }
            C20488215Ey<C973200bQs> c20488215Ey = this.LLILZ.LLIZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = c20488215Ey.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1");
                return objLJFF;
            }
        }
        C973200bQs c973200bQs = (C973200bQs) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animationExecute.fileName = ");
        if (c973200bQs != null) {
            str = c973200bQs.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", geckoChannel = ");
        if (c973200bQs != null) {
            str2 = c973200bQs.LIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", isTeamMatch = ");
        if (c973200bQs != null) {
            boolValueOf = Boolean.valueOf(c973200bQs.LJFF);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("MatchStartAnimationComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C973210bQt(this.LLILZ, c973200bQs, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
