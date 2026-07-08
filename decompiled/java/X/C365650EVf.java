package X;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: renamed from: X.0EVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditorProResPreloadComponent", f = "EditorProResPreloadComponent.kt", l = {106}, m = "fetchAdjustEffect")
public final class C365650EVf extends AbstractC23140094w {
    public MutableLiveData LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C365620EVc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365650EVf(C365620EVc c365620EVc, InterfaceC1364105Vn<? super C365650EVf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c365620EVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProResPreloadComponent@3076.fetchAdjustEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objW1 = this.LLILLL.W1(this);
        C1C7U.LIZIZ("EditorProResPreloadComponent@3076.fetchAdjustEffect$1");
        return objW1;
    }
}
