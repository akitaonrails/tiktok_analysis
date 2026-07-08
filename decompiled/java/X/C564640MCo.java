package X;

import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptsResponse;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestApi;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoRequestRepository$getAILivePhotoPrompts$2$1", f = "AILivePhotoRequestRepository.kt", l = {65}, m = "invokeSuspend")
public final class C564640MCo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AILivePhotoPromptsResponse>, Object> {
    public int LL;
    public final /* synthetic */ C564650MCp LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C564640MCo(C564650MCp c564650MCp, int i, String str, InterfaceC1364105Vn<? super C564640MCo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c564650MCp;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C564640MCo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C564690MCt {
        C1C7U.LIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$2$1");
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
            AILivePhotoRequestApi aILivePhotoRequestApi = (AILivePhotoRequestApi) this.LLILLJJLI.LIZ.getValue();
            int i2 = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = aILivePhotoRequestApi.getAILivePhotoPrompts(i2, str, 2, 20, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$2$1");
                return objLJFF;
            }
        }
        AILivePhotoPromptsResponse aILivePhotoPromptsResponse = (AILivePhotoPromptsResponse) obj;
        if (aILivePhotoPromptsResponse != null && (!aILivePhotoPromptsResponse.prompts.isEmpty())) {
            Iterator<AILivePhotoPromptStruct> it2 = aILivePhotoPromptsResponse.prompts.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AILivePhotoPromptStruct next = it2.next();
                if (next.prompt.length() > 0) {
                    if (next != null) {
                        if (aILivePhotoPromptsResponse.statusCode == 0) {
                            C1C7U.LIZIZ("AILivePhotoRequestRepository@baaa.getAILivePhotoPrompts$2$1");
                            return aILivePhotoPromptsResponse;
                        }
                        int i3 = aILivePhotoPromptsResponse.statusCode;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(aILivePhotoPromptsResponse.statusMessage);
                        sbLIZ.append(" response: ");
                        sbLIZ.append(aILivePhotoPromptsResponse);
                        throw new C564690MCt(i3, C2188811AlT.LIZIZ(sbLIZ), "", null);
                    }
                }
            }
        }
        throw new C564690MCt(10002, "response is null", "", null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AILivePhotoPromptsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
