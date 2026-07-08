package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HJV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarCreationStatusDataSource$1", f = "SocialAvatarCreationStatusServiceImpl.kt", l = {169}, m = "invokeSuspend")
public final class C0HJV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0HJW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HJV(C0HJW c0hjw, InterfaceC1364105Vn<? super C0HJV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0hjw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HJV c0hjv = new C0HJV(this.LLILLL, interfaceC1364105Vn);
        c0hjv.LLILLJJLI = obj;
        return c0hjv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair<Boolean, C437560HDu> pairLIZJ;
        C1C7U.LIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) this.LLILLL.LJIIIIZZ.getValue();
            if (iSocialAvatarDebugService != null && (pairLIZJ = iSocialAvatarDebugService.LIZJ()) != null) {
                if (pairLIZJ.getFirst().booleanValue()) {
                    C437560HDu second = pairLIZJ.getSecond();
                    C1910890zpH c1910890zpHLIZ = this.LLILLL.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("enable Local Mock Data, get generationStatus as ");
                    sbLIZ.append(second.LIZ);
                    sbLIZ.append(", waitQueueEstTimeMills as ");
                    sbLIZ.append(second.LIZJ.LIZ);
                    sbLIZ.append(", inGeneratingProgress as ");
                    sbLIZ.append(second.LIZJ.LIZIZ);
                    c1910890zpHLIZ.LIZ("SocialAvatarCreationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILLL.LIZIZ.setValue(second);
                    if (second.LIZ == EnumC437540HDs.FAILED) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C0HJY(this.LLILLL, null), 2);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1");
                    return unit;
                }
                AnonymousClass0951 anonymousClass0951 = this.LLILLL.LIZIZ().LIZIZ;
                AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, interfaceC497601wk, 26);
                this.LL = 1;
                if (anonymousClass0951.collect(agS197S0200000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SocialAvatarCreationStatusDataSource@6cd2.<init>$1");
                return unit2;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
