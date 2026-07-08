package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
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

/* JADX INFO: renamed from: X.0MCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager$requestGptPrompt$1", f = "AILivePhotoPromptManager.kt", l = {419}, m = "invokeSuspend")
public final class C564550MCf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ AILivePhotoPromptManager LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564550MCf(AILivePhotoPromptManager aILivePhotoPromptManager, String str, String str2, InterfaceC1364105Vn<? super C564550MCf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aILivePhotoPromptManager;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564550MCf(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        int source;
        ?? arrayList;
        C1C7U.LIZ("AILivePhotoPromptManager@57e8.requestGptPrompt$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
                arrayList = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            C564650MCp c564650MCp = (C564650MCp) this.LLILLL.LIZIZ.getValue();
            if (C564500MCa.LIZ()) {
                source = EnumC564600MCk.GPT.getSource();
            } else {
                source = EnumC564600MCk.DEFAULT_MIX.getSource();
            }
            String str = this.LLILZ;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            Object objLIZ = c564650MCp.LIZ(source, str, this);
            arrayList = objLIZ;
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestGptPrompt$1");
                return objLJFF;
            }
        }
        ?? r12 = this.LLILLL;
        r12.LJFF(arrayList, this.LLILZIL, jCurrentTimeMillis, 0, new AwS587S0100000_8((AILivePhotoPromptManager) r12, 368));
        if (C189200o6.m8isSuccessimpl(arrayList)) {
            List<AILivePhotoPromptStruct> list = ((AILivePhotoPromptsResponse) arrayList).prompts;
            arrayList = new ArrayList();
            for (AILivePhotoPromptStruct aILivePhotoPromptStruct : list) {
                if (aILivePhotoPromptStruct.prompt.length() > 0) {
                    arrayList.add(aILivePhotoPromptStruct);
                }
            }
        }
        C189200o6.m2constructorimpl(arrayList);
        String str2 = this.LLILZIL;
        AILivePhotoPromptManager aILivePhotoPromptManager = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(arrayList);
        if (thM5exceptionOrNullimpl == null) {
            List list2 = (List) arrayList;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request ");
            sbLIZ.append(str2);
            sbLIZ.append(':');
            sbLIZ.append(list2);
            C559010LwB.LIZJ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ));
            C11PQ<PromptRequestState> c11pq = aILivePhotoPromptManager.LJI;
            PromptRequestStateType promptRequestStateType = PromptRequestStateType.SUCCESS;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AILivePhotoPromptStruct) it2.next()).LIZ(false));
            }
            c11pq.onNext(new PromptRequestState(promptRequestStateType, arrayList2, false, null, 8, null));
            C554440Loo c554440Loo = C554440Loo.LIZ;
            String source2 = Source.EDIT_AI_LIVE_PHOTO.getSource();
            long j = aILivePhotoPromptManager.LIZIZ().LIZIZ + aILivePhotoPromptManager.LIZIZ().LIZ;
            c554440Loo.getClass();
            C554440Loo.LIZLLL(1, 0, j, source2, 0, "Whole", "");
        } else {
            aILivePhotoPromptManager.LJI.onNext(new PromptRequestState(PromptRequestStateType.FAIL, null, false, thM5exceptionOrNullimpl, 6, null));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("request ");
            sbLIZ2.append(str2);
            sbLIZ2.append(" fail:");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C559010LwB.LIZ("AILivePhotoPromptManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoPromptManager@57e8.requestGptPrompt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
