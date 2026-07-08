package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory;
import com.ss.android.ugc.aweme.im.service.impl.StoryIMService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZGU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGU extends C09AY implements Function1<C0I0H, InterfaceC457250HwR> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ StoryIMService LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ QuickDMEventParam LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;
    public final /* synthetic */ C0SZG LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZGU(User user, String str, C19EG c19eg, boolean z, StoryIMService storyIMService, Aweme aweme, String str2, QuickDMEventParam quickDMEventParam, Map map, String str3, Function0 function0, C19600211mK c19600211mK) {
        super(1);
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = c19eg;
        this.LLILZ = z;
        this.LLILZIL = storyIMService;
        this.LLILZLL = aweme;
        this.LLIZ = str2;
        this.LLIZLLLIL = quickDMEventParam;
        this.LLJ = map;
        this.LLJI = str3;
        this.LLJIJIL = function0;
        this.LLJILJIL = c19600211mK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC457250HwR invoke(C0I0H c0i0h) {
        C0I0H c0i0h2 = c0i0h;
        final User user = this.LL;
        final String str = this.LLILLJJLI;
        Activity activity = this.LLILLL;
        final boolean z = this.LLILZ;
        final StoryIMService storyIMService = this.LLILZIL;
        final Aweme aweme = this.LLILZLL;
        final String str2 = this.LLIZ;
        final QuickDMEventParam quickDMEventParam = this.LLIZLLLIL;
        final Map<String, String> map = this.LLJ;
        final String str3 = this.LLJI;
        final Function0<Unit> function0 = this.LLJIJIL;
        final C0SZG c0szg = this.LLJILJIL;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C896720ZFu(user, str, activity, z, storyIMService, aweme, str2, quickDMEventParam, map, str3));
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(InputViewDelegateFactory.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            final C0ZGL c0zglLIZ = ((InputViewDelegateFactory) objPluggableSpi$default).LIZ(c01gwLIZIZ, c0i0h2, null);
            return new InterfaceC457250HwR(function0, storyIMService, user, aweme, str, str3, z, c0szg, str2, quickDMEventParam, map) { // from class: X.0ZGd
                public final /* synthetic */ InterfaceC457250HwR LIZ;
                public final /* synthetic */ Function0<Unit> LIZJ;
                public final /* synthetic */ StoryIMService LIZLLL;
                public final /* synthetic */ User LJ;
                public final /* synthetic */ Aweme LJFF;
                public final /* synthetic */ String LJI;
                public final /* synthetic */ String LJII;
                public final /* synthetic */ boolean LJIIIIZZ;
                public final /* synthetic */ C0SZG LJIIIZ;
                public final /* synthetic */ String LJIIJ;
                public final /* synthetic */ QuickDMEventParam LJIIJJI;
                public final /* synthetic */ Map<String, String> LJIIL;

                @Override // X.InterfaceC457250HwR
                public final void LIZ(C0ZGS c0zgs, String str4) {
                    this.LIZ.LIZ(c0zgs, str4);
                }

                @Override // X.InterfaceC457250HwR
                public final void LIZIZ(C458370HyF c458370HyF, C0HVB c0hvb) {
                    this.LIZ.LIZIZ(c458370HyF, c0hvb);
                }

                @Override // X.InterfaceC457250HwR
                @InterfaceC1294060jmO
                public final void LIZJ(VideoSticker videoSticker) {
                    this.LIZ.LIZJ(videoSticker);
                }

                @Override // X.InterfaceC457250HwR
                public final void LIZLLL(StickerItem stickerItem, boolean z2) {
                    this.LIZ.LIZLLL(stickerItem, z2);
                }

                @Override // X.InterfaceC457250HwR
                public final boolean LJ() {
                    return this.LIZ.LJ();
                }

                @Override // X.InterfaceC457250HwR
                public final void LJI() {
                    this.LIZ.LJI();
                }

                @Override // X.InterfaceC457250HwR
                public final void LJII(boolean z2) {
                    this.LIZ.LJII(z2);
                }

                @Override // X.InterfaceC457250HwR
                public final void LJIIIIZZ(DMCreativeStickerFontData dMCreativeStickerFontData) {
                    this.LIZ.LJIIIIZZ(dMCreativeStickerFontData);
                }

                @Override // X.InterfaceC457250HwR
                public final void LJIIIZ(SetSticker setSticker) {
                    this.LIZIZ.LJIIIZ(setSticker);
                }

                @Override // X.InterfaceC457250HwR
                public final void LJFF(CharSequence charSequence, boolean z2) {
                    C0ZGS c0zgs;
                    String str4;
                    C0ZGS c0zgs2;
                    C0SZG c0szg2;
                    if (charSequence == null) {
                        return;
                    }
                    Function0<Unit> function02 = this.LIZJ;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    if (z2) {
                        c0zgs = C0ZGS.EMOJI;
                    } else {
                        c0zgs = C0ZGS.NONE;
                    }
                    ((InterfaceC1365380ldQ) this.LIZLLL.LIZLLL.getValue()).LJIJJ(charSequence.toString(), null, this.LJ, this.LJFF, this.LJI, StoryIMService.LJIIJJI(c0zgs, this.LJIIJ), this.LJII, Boolean.valueOf(this.LJIIIIZZ), true, null, null, null, StoryIMService.LJIIL(this.LJFF, this.LJIIJJI, this.LJIIL, this.LIZLLL, this.LJI, this.LJII, this.LJIIJ, c0zgs), new InterfaceC1361990lXx() { // from class: X.0ZGk
                        @Override // X.InterfaceC1361990lXx
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1361990lXx
                        public final /* synthetic */ void LIZIZ(HashMap map2) {
                        }
                    });
                    InterfaceC457250HwR interfaceC457250HwR = this.LIZIZ;
                    if (z2) {
                        str4 = "quick_reply_emoji_reply_panel";
                        c0zgs2 = C0ZGS.EMOJI;
                    } else {
                        str4 = "quick_reply_text";
                        c0zgs2 = C0ZGS.NONE;
                    }
                    interfaceC457250HwR.LIZ(c0zgs2, str4);
                    if (z2 && (c0szg2 = this.LJIIIZ) != null) {
                        c0szg2.LIZIZ(null, charSequence);
                    }
                }

                {
                    this.LIZJ = function0;
                    this.LIZLLL = storyIMService;
                    this.LJ = user;
                    this.LJFF = aweme;
                    this.LJI = str;
                    this.LJII = str3;
                    this.LJIIIIZZ = z;
                    this.LJIIIZ = c0szg;
                    this.LJIIJ = str2;
                    this.LJIIJJI = quickDMEventParam;
                    this.LJIIL = map;
                    this.LIZ = this.LIZIZ;
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
