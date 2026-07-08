package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0LDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.UpdateAutoCutDraftAbsTask", f = "UpdateAutoCutDraftAbsTask.kt", l = {27, 28, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 43, 45, 55, 61}, m = "run")
public final class C539390LDl extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C539380LDk LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539390LDl(C539380LDk c539380LDk, InterfaceC1364105Vn<? super C539390LDl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c539380LDk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateAutoCutDraftAbsTask@4bed.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("UpdateAutoCutDraftAbsTask@4bed.run$1");
        return objLJFF;
    }
}
