package X;

import com.ss.android.ugc.gamora.editorpro.creationflow.album.EditorProAlbumService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LJN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EditorProAlbumService LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0LJQ LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LJN(EditorProAlbumService editorProAlbumService, C19EG c19eg, C0E48 c0e48, int i, C0LJQ c0ljq, Integer num, Function0<Unit> function0) {
        super(0);
        this.LL = editorProAlbumService;
        this.LLILLJJLI = c19eg;
        this.LLILLL = c0e48;
        this.LLILZ = i;
        this.LLILZIL = c0ljq;
        this.LLILZLL = num;
        this.LLIZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.afterAllow(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
