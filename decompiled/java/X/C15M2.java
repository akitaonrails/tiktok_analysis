package X;

import com.ss.android.ugc.aweme.composer.BasicModelDsl;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15M2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15M2 extends C09AY implements Function1<BasicModelDsl, Unit> {
    public final /* synthetic */ MusicShootAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15M2(MusicShootAssem musicShootAssem, boolean z, boolean z2, String str) {
        super(1);
        this.LL = musicShootAssem;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BasicModelDsl basicModelDsl) {
        BasicModelDsl basicModelDsl2 = basicModelDsl;
        basicModelDsl2.setCreationId(this.LL.LLLFFI);
        basicModelDsl2.track(new C1400480mY2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
