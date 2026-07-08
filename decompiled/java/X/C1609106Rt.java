package X;

import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeMessageManager$sendDynamicMessage$1$1", f = "CollaborativeMessageManager.kt", l = {86}, m = "invokeSuspend")
public final class C1609106Rt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DynamicCardTemplate LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609106Rt(DynamicCardTemplate dynamicCardTemplate, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C1609106Rt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dynamicCardTemplate;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1609106Rt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollaborativeMessageManager@c149.sendDynamicMessage$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("CollaborativeMessageManager@c149.sendDynamicMessage$1$1");
                return objLJFF;
            }
        }
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJIIL = "ci_share_collaborative_collection";
        c874730YTfLIZ.LIZJ(this.LLILLJJLI);
        c874730YTfLIZ.LIZIZ.LJFF = this.LLILLL;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("collection_id", this.LLILZ);
        pairArr[1] = new Pair("panel_source", this.LLILZIL);
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("enter_from", str);
        c874730YTfLIZ.LIZIZ.LJIILIIL = C2097608Jq.LJIIJ(pairArr);
        c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.06Ru
            @Override // X.C0YTK
            public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
            }

            @Override // X.C0YTY
            public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
            }

            @Override // X.C0YTK
            public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTY
            public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
            }

            @Override // X.C0YTK
            public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollaborativeMessageManager@c149.sendDynamicMessage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
