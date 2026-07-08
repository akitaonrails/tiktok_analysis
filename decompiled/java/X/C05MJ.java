package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.thoughtbubble.ChatListThoughtBubbleUpdater$observeDataChangeAfterFilter$5$job$1", f = "ChatListThoughtBubbleUpdater.kt", l = {169}, m = "invokeSuspend")
public final class C05MJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YD<ThoughtInfo> LLILLJJLI;
    public final /* synthetic */ C1490205sS LLILLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MJ(C05YD<ThoughtInfo> c05yd, C1490205sS c1490205sS, InterfaceC879010Ye3 interfaceC879010Ye3, String str, InterfaceC1364105Vn<? super C05MJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yd;
        this.LLILLL = c1490205sS;
        this.LLILZ = interfaceC879010Ye3;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05MJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListThoughtBubbleUpdater@3b3c.observeDataChangeAfterFilter$5$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final C05YD<ThoughtInfo> c05yd = this.LLILLJJLI;
            final C1490205sS c1490205sS = this.LLILLL;
            final InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZ;
            final String str = this.LLILZIL;
            InterfaceC346701Wf<? super ThoughtInfo> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.05rE
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    boolean z;
                    C1482705rF c1482705rF = c1490205sS.LJIJJ().get(interfaceC879010Ye3);
                    if (c1482705rF == null) {
                        return Unit.LIZ;
                    }
                    AnonymousClass0617 anonymousClass0617 = c1482705rF.LIZ.get(str);
                    if (anonymousClass0617 == null) {
                        return Unit.LIZ;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("thoughtUpdate userId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", hasThought=");
                    if (c05yd.getValue() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", page=");
                    sbLIZ.append(interfaceC879010Ye3);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C309160C9y.LIZ();
                    CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJLI = c1490205sS.LJIJJLI();
                    InterfaceC879010Ye3 interfaceC879010Ye32 = interfaceC879010Ye3;
                    C1490205sS c1490205sS2 = c1490205sS;
                    Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJIJJLI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(interfaceC879010Ye32, Collections.singletonList(anonymousClass0617), c1490205sS2.LIZIZ(), c1490205sS2.LLILLJJLI);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c05yd.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("ChatListThoughtBubbleUpdater@3b3c.observeDataChangeAfterFilter$5$job$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
