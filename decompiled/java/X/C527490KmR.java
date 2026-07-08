package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelectionRestoreComponent$onCreate$1$list$1$aiContentDeferred$1", f = "AlbumSelectionRestoreComponent.kt", l = {359}, m = "invokeSuspend")
public final class C527490KmR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public InterfaceC383701eN LLILLJJLI;
    public C527520KmU LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ C527520KmU LLIZ;
    public final /* synthetic */ InterfaceC383701eN LLIZLLLIL;
    public final /* synthetic */ List<TikTokMediaModel> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527490KmR(List<String> list, C527520KmU c527520KmU, InterfaceC383701eN interfaceC383701eN, List<TikTokMediaModel> list2, InterfaceC1364105Vn<? super C527490KmR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = c527520KmU;
        this.LLIZLLLIL = interfaceC383701eN;
        this.LLJ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C527490KmR(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        InterfaceC383701eN interfaceC383701eN;
        C527520KmU c527520KmU;
        List list;
        C11NZ<List<C535020Kya>> c11nzLIZ;
        List list2;
        ?? r7;
        C1C7U.LIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$aiContentDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LLILZ;
                c527520KmU = this.LLILLL;
                interfaceC383701eN = this.LLILLJJLI;
                List list3 = (List) this.LL;
                C155000ia.LIZIZ(obj);
                r7 = list3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILZLL.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$aiContentDeferred$1");
                return unit;
            }
            C527460KmO c527460KmOW1 = this.LLIZ.W1();
            List<String> list4 = this.LLILZLL;
            c527460KmOW1.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                AlbumAiContentRepository albumAiContentRepositoryLIZIZ = C530200Kqo.LIZIZ();
                if (albumAiContentRepositoryLIZIZ != null && (c11nzLIZ = albumAiContentRepositoryLIZIZ.LIZ(new C534820KyG(0, true, false, 3, list4, null, 33))) != null && (list2 = (List) C530200Kqo.LIZ(c11nzLIZ.LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.00Dj
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj2) {
                        return C13BV.INSTANCE;
                    }
                }), C13BV.INSTANCE)) != null) {
                    arrayList = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        TikTokMediaModel tikTokMediaModelLIZ = c527460KmOW1.LIZ.LIZ((C535020Kya) it2.next());
                        if (tikTokMediaModelLIZ != null) {
                            arrayList.add(tikTokMediaModelLIZ);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadLocalAiContentDataSync with local media cost: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C201955140j.LIZLLL(c552700Lm0, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ));
                interfaceC383701eN = this.LLIZLLLIL;
                c527520KmU = this.LLIZ;
                list = this.LLJ;
                this.LL = arrayList;
                this.LLILLJJLI = interfaceC383701eN;
                this.LLILLL = c527520KmU;
                this.LLILZ = list;
                this.LLILZIL = 1;
                r7 = arrayList;
                if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$aiContentDeferred$1");
                    return objLJFF;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadLocalAiContentDataSync with local media cost: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C201955140j.LIZLLL(c552700Lm02, "AiContentDataManager", C2188811AlT.LIZIZ(sbLIZ2));
                throw th;
            }
        }
        try {
            c527520KmU.LLJI += r7.size();
            list.addAll(r7);
            interfaceC383701eN.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1$aiContentDeferred$1");
            return unit2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            interfaceC383701eN.LIZIZ(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
