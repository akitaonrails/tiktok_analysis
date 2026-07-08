package X;

import android.content.Context;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;

/* JADX INFO: renamed from: X.0MDW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDW extends C0MFE<AILivePhotoPromptStruct> {
    public AILivePhotoPromptStruct LLJILJIL;
    public AILivePhotoPromptStruct LLJILJILJ;

    @Override // X.C0MFE
    public final void LIZIZ() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(C0MED.LIZ(C0MEB.PANEL_TOAST_CHAR_LIMIT, new Object[0]));
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    @Override // X.C0MFE, X.InterfaceC565110MEj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct getInputResult() {
        /*
            r7 = this;
            java.lang.String r0 = r7.getCurrentContent()
            int r0 = r0.length()
            if (r0 <= 0) goto L44
            r0 = 1
        Lb:
            r2 = 0
            if (r0 == 0) goto L23
            java.lang.String r1 = r7.getCurrentContent()
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct r0 = r7.LLJILJILJ
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.prompt
        L18:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L23
        L1e:
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct r1 = r7.LLJILJILJ
            return r1
        L21:
            r0 = r2
            goto L18
        L23:
            boolean r0 = r7.LLIZLLLIL
            if (r0 == 0) goto L1e
            java.lang.String r0 = r7.getCurrentContent()
            int r0 = r0.length()
            if (r0 <= 0) goto L46
            java.lang.String r1 = r7.getCurrentContent()
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct r0 = r7.LLJILJIL
            if (r0 == 0) goto L3b
            java.lang.String r2 = r0.prompt
        L3b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L46
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct r1 = r7.LLJILJIL
            return r1
        L44:
            r0 = 0
            goto Lb
        L46:
            com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct r1 = new com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct
            java.lang.String r2 = r7.getCurrentContent()
            java.lang.String r3 = r7.getCurrentContent()
            java.lang.String r0 = r7.getCurrentContent()
            int r0 = r0.length()
            if (r0 <= 0) goto L6a
            com.ss.android.ugc.aweme.creative.model.ailive.PromptType r0 = com.ss.android.ugc.aweme.creative.model.ailive.PromptType.INPUT
        L5c:
            java.lang.String r4 = r0.getMobTag()
            java.lang.String r5 = X.C274160Aoo.LIZ()
            java.lang.String r6 = ""
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L6a:
            com.ss.android.ugc.aweme.creative.model.ailive.PromptType r0 = com.ss.android.ugc.aweme.creative.model.ailive.PromptType.NO_PROMPT
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MDW.getInputResult():com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct");
    }

    public final AILivePhotoPromptStruct getInitialPrompt() {
        return this.LLJILJILJ;
    }

    public final AILivePhotoPromptStruct getLastClickStruct() {
        return this.LLJILJIL;
    }

    public C0MDW(Context context) {
        super(context, null, 0);
    }

    public final void setInitialPrompt(AILivePhotoPromptStruct aILivePhotoPromptStruct) {
        this.LLJILJILJ = aILivePhotoPromptStruct;
    }

    public final void setLastClickStruct(AILivePhotoPromptStruct aILivePhotoPromptStruct) {
        this.LLJILJIL = aILivePhotoPromptStruct;
    }
}
