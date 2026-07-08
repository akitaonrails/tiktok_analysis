package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.interactive.task.game.card.GameChallengeCardReusedUISlot$openResultPage$1", f = "GameChallengeCardProtocol.kt", l = {443, 450}, m = "invokeSuspend")
public final class C900190ZTd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C900210ZTf LLILLJJLI;
    public final /* synthetic */ GameChallengeCardReusedUISlot LLILLL;
    public final /* synthetic */ GameChallengeCardTemplate LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C900190ZTd(C900210ZTf c900210ZTf, GameChallengeCardReusedUISlot gameChallengeCardReusedUISlot, GameChallengeCardTemplate gameChallengeCardTemplate, InterfaceC1364105Vn<? super C900190ZTd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c900210ZTf;
        this.LLILLL = gameChallengeCardReusedUISlot;
        this.LLILZ = gameChallengeCardTemplate;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C900190ZTd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIIJ = obj;
        C1C7U.LIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIIJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJIIJ);
        } else {
            C155000ia.LIZIZ(objLJIIJ);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LLILLJJLI.LIZ);
            InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
            Context context = this.LLILLL.zp().getContext();
            this.LL = 1;
            objLJIIJ = interfaceC911530ZpPLJJIFFI.LJIIJ(context, arrayList, this);
            if (objLJIIJ == objLJFF) {
                C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
                return objLJFF;
            }
        }
        List list = (List) objLJIIJ;
        if (list.isEmpty()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
            return unit2;
        }
        C900210ZTf c900210ZTf = this.LLILLJJLI;
        if (c900210ZTf.LJ == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
            return unit3;
        }
        if (c900210ZTf.LJFF == null) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
            return unit4;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C900200ZTe c900200ZTe = new C900200ZTe(this.LLILLL, c900210ZTf, list, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c900200ZTe) == objLJFF) {
            C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
            return objLJFF;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("GameChallengeCardReusedUISlot@f879.openResultPage$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
