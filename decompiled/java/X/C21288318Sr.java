package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21288318Sr {
    public C18W2 LIZ;
    public final List<C21295818Vo> LIZIZ;
    public AIChatGenPrompt LIZJ;

    public final C21288318Sr LIZ() {
        String promptType;
        C18W2 c18w2 = this.LIZ;
        List<C21295818Vo> list = this.LIZIZ;
        C18W2 c18w22 = this.LIZ;
        String str = c18w22 != null ? c18w22.LIZIZ : null;
        AIChatGenPrompt aIChatGenPrompt = this.LIZJ;
        if (aIChatGenPrompt == null || (promptType = aIChatGenPrompt.getPromptType()) == null) {
            promptType = "input";
        }
        AIChatGenPrompt aIChatGenPrompt2 = this.LIZJ;
        String promptId = aIChatGenPrompt2 != null ? aIChatGenPrompt2.getPromptId() : null;
        AIChatGenPrompt aIChatGenPrompt3 = this.LIZJ;
        String promptUri = aIChatGenPrompt3 != null ? aIChatGenPrompt3.getPromptUri() : null;
        AIChatGenPrompt aIChatGenPrompt4 = this.LIZJ;
        return new C21288318Sr(c18w2, list, new AIChatGenPrompt(UUID.randomUUID().toString(), str, promptType, promptId, promptUri, aIChatGenPrompt4 != null ? aIChatGenPrompt4.getPromptIconUri() : null));
    }

    public final void LIZIZ() {
        AIChatGenPrompt aIChatGenPrompt;
        String promptText;
        AIChatGenPrompt aIChatGenPrompt2 = this.LIZJ;
        if (aIChatGenPrompt2 != null && (promptText = aIChatGenPrompt2.getPromptText()) != null && promptText.length() != 0) {
            C18W2 c18w2 = this.LIZ;
            String str = c18w2 != null ? c18w2.LIZIZ : null;
            AIChatGenPrompt aIChatGenPrompt3 = this.LIZJ;
            if (Intrinsics.LJFF(str, aIChatGenPrompt3 != null ? aIChatGenPrompt3.getPromptText() : null)) {
                return;
            }
        }
        if (this.LIZJ == null) {
            this.LIZJ = new AIChatGenPrompt(UUID.randomUUID().toString(), null, null, null, null, null);
        }
        AIChatGenPrompt aIChatGenPrompt4 = this.LIZJ;
        if (Intrinsics.LJFF(aIChatGenPrompt4 != null ? aIChatGenPrompt4.getPromptType() : null, "default") || (aIChatGenPrompt = this.LIZJ) == null) {
            return;
        }
        aIChatGenPrompt.setPromptType("input");
    }

    public C21288318Sr(C18W2 c18w2, List<C21295818Vo> list, AIChatGenPrompt aIChatGenPrompt) {
        this.LIZ = c18w2;
        this.LIZIZ = list;
        this.LIZJ = aIChatGenPrompt;
    }
}
