package X;

import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.button.MusicDetailHeaderBtnsAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0Olo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629020Olo extends C09AY implements Function1<C628830OlV, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ MusicDetailFragment LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629020Olo(boolean z, boolean z2, C013C c013c, boolean z3, boolean z4, MusicDetailFragment musicDetailFragment) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c013c;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = musicDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C628830OlV c628830OlV) {
        C628830OlV c628830OlV2 = c628830OlV;
        c628830OlV2.LL = C13LE.LIZ(MusicDetailHeaderBtnsAssem.class);
        if (this.LL) {
            c628830OlV2.LJII("pre_save_to_dsp", AFwS240S0000000_9.get$arr$(759));
        } else if (this.LLILLJJLI) {
            c628830OlV2.LJII("add_song_to_dsp", AFwS240S0000000_9.get$arr$(763));
            this.LLILLL.element = true;
        } else if (this.LLILZ) {
            c628830OlV2.LJII("play_full_song", AFwS240S0000000_9.get$arr$(766));
        }
        if (this.LLILZIL) {
            c628830OlV2.LJII("favorite", new AwS588S0100000_9(this.LLILZLL, 461));
        }
        return Unit.LIZ;
    }
}
