package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.FusedMusic;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14DM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceDownloadHelper", f = "ReplaceDownloadHelper.kt", l = {499, 501}, m = "fusionToMusicBuzModel")
public final class C14DM extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public FusedMusic LLILZIL;
    public AVMusic LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C14DL LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14DM(C14DL c14dl, InterfaceC1364105Vn<? super C14DM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c14dl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceDownloadHelper@3470.fusionToMusicBuzModel$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLIZLLLIL.LJFF(null, null, null, this);
        C1C7U.LIZIZ("ReplaceDownloadHelper@3470.fusionToMusicBuzModel$1");
        return objLJFF;
    }
}
