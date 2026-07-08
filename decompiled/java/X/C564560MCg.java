package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager$requestPresetPrompt$2", f = "AILivePhotoPromptManager.kt", l = {325}, m = "invokeSuspend")
public final class C564560MCg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ AILivePhotoPromptManager LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564560MCg(AILivePhotoPromptManager aILivePhotoPromptManager, C013C c013c, String str, InterfaceC1364105Vn<? super C564560MCg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aILivePhotoPromptManager;
        this.LLILZ = c013c;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564560MCg(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objLIZ;
        Object obj2;
        C1C7U.LIZ("AILivePhotoPromptManager@57e8.requestPresetPrompt$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            C564650MCp c564650MCp = (C564650MCp) this.LLILLL.LIZIZ.getValue();
            int source = EnumC564600MCk.PRESET.getSource();
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            String str = C564650MCp.LIZIZ;
            objLIZ = c564650MCp.LIZ(source, null, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestPresetPrompt$2");
                return objLJFF;
            }
        }
        AILivePhotoPromptManager aILivePhotoPromptManager = this.LLILLL;
        Object obj3 = objLIZ;
        aILivePhotoPromptManager.LJFF(obj3, this.LLILZIL, jCurrentTimeMillis, 0, new AwS587S0100000_8(aILivePhotoPromptManager, 369));
        if (!this.LLILZ.element) {
            AILivePhotoPromptManager aILivePhotoPromptManager2 = this.LLILLL;
            String str2 = this.LLILZIL;
            aILivePhotoPromptManager2.getClass();
            if (C189200o6.m8isSuccessimpl(objLIZ)) {
                List<AILivePhotoPromptStruct> list = ((AILivePhotoPromptsResponse) objLIZ).prompts;
                ArrayList arrayList = new ArrayList();
                for (AILivePhotoPromptStruct aILivePhotoPromptStruct : list) {
                    if (aILivePhotoPromptStruct.prompt.length() > 0) {
                        arrayList.add(aILivePhotoPromptStruct);
                    }
                }
                C189200o6.m2constructorimpl(arrayList);
                obj2 = arrayList;
            } else {
                C189200o6.m2constructorimpl(objLIZ);
                obj2 = objLIZ;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
            if (thM5exceptionOrNullimpl == null) {
                List list2 = (List) obj2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request ");
                sbLIZ.append(str2);
                sbLIZ.append(':');
                sbLIZ.append(list2);
                C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
                C11PQ<PromptRequestState> c11pq = aILivePhotoPromptManager2.LJII;
                PromptRequestStateType promptRequestStateType = PromptRequestStateType.SUCCESS;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((AILivePhotoPromptStruct) it2.next()).LIZ(false));
                }
                c11pq.onNext(new PromptRequestState(promptRequestStateType, arrayList2, false, null, 8, null));
                ArrayList arrayList3 = (ArrayList) C564540MCe.LIZ;
                arrayList3.clear();
                arrayList3.addAll(list2);
            } else {
                aILivePhotoPromptManager2.LJII.onNext(new PromptRequestState(PromptRequestStateType.FAIL, null, false, thM5exceptionOrNullimpl, 6, null));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("request ");
                sbLIZ2.append(str2);
                sbLIZ2.append(" fail:");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                C559010LwB.LIZ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        AILivePhotoPromptManager aILivePhotoPromptManager3 = this.LLILLL;
        if (aILivePhotoPromptManager3.LJIIIZ) {
            if (C189200o6.m8isSuccessimpl(objLIZ)) {
                objLIZ = ((AILivePhotoPromptsResponse) objLIZ).defaultPrompt;
            }
            C189200o6.m2constructorimpl(objLIZ);
            if (C189200o6.m5exceptionOrNullimpl(objLIZ) == null) {
                AILivePhotoPromptStruct aILivePhotoPromptStruct2 = (AILivePhotoPromptStruct) objLIZ;
                if (aILivePhotoPromptStruct2 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("request default prompt:");
                    sbLIZ3.append(aILivePhotoPromptStruct2);
                    C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ3));
                    aILivePhotoPromptManager3.LJIIIIZZ.onNext(aILivePhotoPromptStruct2.LIZ(true));
                    aILivePhotoPromptManager3.LJIIIZ = false;
                } else {
                    C559010LwB.LIZ("AILivePhotoPromptManager", "request default prompt fail, null");
                }
            } else {
                C559010LwB.LIZ("AILivePhotoPromptManager", "request default prompt fail");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestPresetPrompt$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
