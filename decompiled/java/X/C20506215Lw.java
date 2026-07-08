package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20506215Lw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MusicShootAssem LL;
    public final /* synthetic */ Music LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ UrlModel LLILZ = null;
    public final /* synthetic */ int LLILZIL = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20506215Lw(MusicShootAssem musicShootAssem, Music music) {
        super(0);
        this.LL = musicShootAssem;
        this.LLILLJJLI = music;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Throwable {
        this.LL.vq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
