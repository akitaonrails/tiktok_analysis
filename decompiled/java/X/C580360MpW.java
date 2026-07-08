package X;

import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import kotlin.jvm.internal.AwS1S2200100_8;

/* JADX INFO: renamed from: X.0MpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl", f = "EditServiceImpl.kt", l = {293, 296, 354}, m = "startEditorProChangeBanMusic")
public final class C580360MpW extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public ChangeBanMusicConfig LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public AwS1S2200100_8 LLILZLL;
    public AwS1S2200100_8 LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C580340MpU LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580360MpW(C580340MpU c580340MpU, InterfaceC1364105Vn<? super C580360MpW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c580340MpU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objStartEditorProChangeBanMusic = this.LLJI.startEditorProChangeBanMusic(null, null, 0L, null, null, null, null, this);
        C1C7U.LIZIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$1");
        return objStartEditorProChangeBanMusic;
    }
}
