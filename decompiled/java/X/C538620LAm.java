package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: renamed from: X.0LAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.UpdateAutoCutDraftTask", f = "UpdateAutoCutDraftTask.kt", l = {85, 100, 156}, m = "execute")
public final class C538620LAm extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public NLEEditor LLIZ;
    public NLEModel LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C538610LAl LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538620LAm(C538610LAl c538610LAl, InterfaceC1364105Vn<? super C538620LAm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c538610LAl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateAutoCutDraftTask@ae7b.execute$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJI.LIZ(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("UpdateAutoCutDraftTask@ae7b.execute$1");
        return objLIZ;
    }
}
