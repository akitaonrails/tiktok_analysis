package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.aweme.creation.base.ImportItemModel;

/* JADX INFO: renamed from: X.0MTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tangram.parser.PhotoModeComposerParser", f = "PhotoModeComposerParser.kt", l = {162}, m = "collectEntries")
public final class C568950MTd extends AbstractC23140094w {
    public VideoPublishEditModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public ImportItemModel LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C568940MTc LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C568950MTd(C568940MTc c568940MTc, InterfaceC1364105Vn<? super C568950MTd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c568940MTc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeComposerParser@f772.collectEntries$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("PhotoModeComposerParser@f772.collectEntries$1");
        return objLIZIZ;
    }
}
