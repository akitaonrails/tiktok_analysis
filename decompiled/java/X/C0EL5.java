package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0EL5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.EditorProContextInitTask", f = "EditorProContextInitTask.kt", l = {35, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 67}, m = "run")
public final class C0EL5 extends AbstractC23140094w {
    public C351780Dqi LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0EL3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EL5(C0EL3 c0el3, InterfaceC1364105Vn<? super C0EL5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0el3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProContextInitTask@3541.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(this);
        C1C7U.LIZIZ("EditorProContextInitTask@3541.run$1");
        return objLIZJ;
    }
}
