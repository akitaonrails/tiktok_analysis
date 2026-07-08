package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.invitation.StreakPetInviteCardUtil$sendInviteMessage$1", f = "StreakPetInviteCardUtil.kt", l = {73}, m = "invokeSuspend")
public final class C06CV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C06CJ LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CV(String str, C06CJ c06cj, String str2, InterfaceC1364105Vn<? super C06CV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c06cj;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06CV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetInviteCardUtil@5b11.sendInviteMessage$1");
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
            C06CX c06cx = C06CX.LIZIZ;
            String str = this.LLILLJJLI;
            C06CJ c06cj = this.LLILLL;
            this.LL = 1;
            obj = c06cx.LIZIZ(str, c06cj, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.sendInviteMessage$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        String str2 = (String) pair.getFirst();
        BaseTemplate baseTemplate = (BaseTemplate) pair.getSecond();
        if (str2 != null && baseTemplate != null) {
            C066L c066l = C066L.LIZIZ;
            String str3 = this.LLILLJJLI;
            c066l.getClass();
            C066L.LIZIZ(str3, false);
            C06CJ c06cj2 = this.LLILLL;
            if (c06cj2 != null) {
                c06cj2.LIZIZ(C2286608xc.LJ(C0YIF.LIZ), "");
            }
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
            c874730YTfLIZ.LIZIZ.LJIIL = str2;
            c874730YTfLIZ.LIZJ(baseTemplate);
            final String str4 = this.LLILLJJLI;
            c874730YTfLIZ.LIZIZ.LJFF = str4;
            final String str5 = this.LLILZ;
            c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.066h
                @Override // X.C0YTK
                public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                }

                @Override // X.C0YTY
                public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                }

                @Override // X.C0YTY
                public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    C066L c066l2 = C066L.LIZIZ;
                    String str6 = str4;
                    c066l2.getClass();
                    C066M c066m = C066L.LJ.get(str6);
                    if (c066m != null) {
                        c066m.LJFF = Long.valueOf(System.currentTimeMillis());
                    }
                }

                @Override // X.C0YTK
                public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    boolean z = C1590806Ks.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StreakPetInviteManager sendInviteMessage ");
                    sbLIZ.append(str4);
                    sbLIZ.append(' ');
                    sbLIZ.append(str5);
                    sbLIZ.append(" success");
                    C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C1500705u9 c1500705u9 = C1500705u9.LIZIZ;
                    String str6 = str5;
                    if (str6 == null) {
                        str6 = "unknown";
                    }
                    C1500705u9.LIZJ(c1500705u9, str6, null, str4, 10);
                }

                @Override // X.C0YTK
                public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                    String statusMsg;
                    boolean z = C1590806Ks.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StreakPetInviteManager sendInviteMessage ");
                    sbLIZ.append(str4);
                    sbLIZ.append(" error ");
                    if (c0ymw != null) {
                        statusMsg = c0ymw.getStatusMsg();
                    } else {
                        statusMsg = null;
                    }
                    sbLIZ.append(statusMsg);
                    C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.sendInviteMessage$1");
            return unit;
        }
        C06CJ c06cj3 = this.LLILLL;
        if (c06cj3 != null) {
            C06CX c06cx2 = C06CX.LIZIZ;
            Integer numLJ = C2286608xc.LJ(C0YIF.LJ);
            c06cx2.getClass();
            C06CX.LIZJ(c06cj3, numLJ, "get template failed");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetInviteCardUtil@5b11.sendInviteMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
