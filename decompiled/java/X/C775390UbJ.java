package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GoLiveManagerOpt", f = "GoLiveManagerOpt.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "init")
public final class C775390UbJ extends AbstractC23140094w {
    public C19EG LL;
    public Object LLILLJJLI;
    public LifecycleOwner LLILLL;
    public Function1 LLILZ;
    public C259800zU LLILZIL;
    public float LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C775380UbI LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775390UbJ(C775380UbI c775380UbI, InterfaceC1364105Vn<? super C775390UbJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c775380UbI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoLiveManagerOpt@1c94.init$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, null, 0.0f, null, null, this);
        C1C7U.LIZIZ("GoLiveManagerOpt@1c94.init$1");
        return objLIZ;
    }
}
