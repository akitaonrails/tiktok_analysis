package X;

import com.ss.android.ugc.aweme.story.reveal.StoryRevealServiceImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717460SCi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC717440SCg LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ StoryRevealServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717460SCi(String str, EnumC717440SCg enumC717440SCg, boolean z, StoryRevealServiceImpl storyRevealServiceImpl) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = enumC717440SCg;
        this.LLILLL = z;
        this.LLILZ = storyRevealServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String str = this.LL;
        String mobValue = this.LLILLJJLI.getMobValue();
        c735840Sti.getClass();
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_notification_popup_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", mobValue)));
        if (this.LLILLL) {
            StoryRevealServiceImpl storyRevealServiceImpl = this.LLILZ;
            EnumC717440SCg enumC717440SCg = this.LLILLJJLI;
            synchronized (storyRevealServiceImpl) {
                int i = C717450SCh.LIZ[enumC717440SCg.ordinal()];
                if (i == 1) {
                    storyRevealServiceImpl.LJIIIZ = false;
                } else if (i == 2) {
                    String strLJJI = StoryRevealServiceImpl.LJJI("phase_out_popup_ever_shown_");
                    if (strLJJI.length() > 0) {
                        storyRevealServiceImpl.LJIJ().storeBoolean(strLJJI, true);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
