package X;

import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalBounceView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.keyframe.LynxSearchKeyframeCover;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchcutoff.core.ui.LynxSearchCutoff;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchcutoff.core.ui.LynxSearchCutoffButton;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchdropdown.core.ui.LynxSearchDropdown;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlive.core.ui.LynxSearchLive;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui.LynxSearchMarkdown;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui.LynxSearchMarkdownShadowNode;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchmarkdown.core.ui.LynxSearchMarkdownV2ShadowNode;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchphoto.core.ui.LynxSearchPhoto;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchPlayer;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchvideo.core.ui.LynxSearchVideo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import j27.s;

/* JADX INFO: renamed from: X.0R3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689790R3x extends C1311670kEn {
    public final int $t;

    @Override // X.C1311670kEn
    public final ShadowNode LJ() {
        return 10 - this.$t != 0 ? super.LJ() : LJ$0(this);
    }

    @Override // X.C1311670kEn
    public final LynxUI<?> LJFF(s sVar) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, sVar);
            case 1:
                return LJFF$1(this, sVar);
            case 2:
                return LJFF$2(this, sVar);
            case 3:
                return LJFF$3(this, sVar);
            case 4:
                return LJFF$4(this, sVar);
            case 5:
                return LJFF$5(this, sVar);
            case 6:
                return LJFF$6(this, sVar);
            case 7:
                return LJFF$7(this, sVar);
            case 8:
                return LJFF$8(this, sVar);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LJFF$9(this, sVar);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LJFF$10(this, sVar);
            default:
                return super.LJFF(sVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C689790R3x(int i) {
        super("x-search-player", false, false, false);
        this.$t = i;
    }

    public static final ShadowNode LJ$0(C689790R3x c689790R3x) {
        if (C301250BrP.LIZ()) {
            return new LynxSearchMarkdownV2ShadowNode();
        }
        return new LynxSearchMarkdownShadowNode();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C689790R3x(boolean r5, int r6) {
        /*
            r4 = this;
            r4.$t = r6
            switch(r6) {
                case 0: goto Le;
                case 1: goto L14;
                case 2: goto L5;
                case 3: goto L1a;
                case 4: goto L20;
                case 5: goto L26;
                case 6: goto L2c;
                case 7: goto L32;
                case 8: goto L38;
                case 9: goto L3e;
                default: goto L5;
            }
        L5:
            r0 = r4
            java.lang.String r3 = "search-markdown"
            r2 = 0
            r1 = r2
        La:
            r0.<init>(r3, r2, r5, r1)
            return
        Le:
            r0 = r4
            java.lang.String r3 = "search-cutoff"
            r2 = 0
            r1 = r2
            goto La
        L14:
            r0 = r4
            java.lang.String r3 = "search-cutoff-button"
            r2 = 0
            r1 = r2
            goto La
        L1a:
            r0 = r4
            java.lang.String r3 = "search-video"
            r2 = 0
            r1 = r2
            goto La
        L20:
            r0 = r4
            java.lang.String r3 = "search-photo"
            r2 = 0
            r1 = r2
            goto La
        L26:
            r0 = r4
            java.lang.String r3 = "search-live"
            r2 = 0
            r1 = r2
            goto La
        L2c:
            r0 = r4
            java.lang.String r3 = "search-dropdown"
            r2 = 0
            r1 = r2
            goto La
        L32:
            r0 = r4
            java.lang.String r3 = "search-bounce-view"
            r2 = 0
            r1 = r2
            goto La
        L38:
            r0 = r4
            java.lang.String r3 = "new-search-list"
            r2 = 0
            r1 = r2
            goto La
        L3e:
            r0 = r4
            java.lang.String r3 = "search-keyframe-cover"
            r2 = 0
            r1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C689790R3x.<init>(boolean, int):void");
    }

    public static final LynxUI LJFF$0(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchCutoff(sVar);
    }

    public static final LynxUI LJFF$1(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchCutoffButton(sVar);
    }

    public static final LynxUI LJFF$10(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchMarkdown(sVar);
    }

    public static final LynxUI LJFF$2(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchPlayer(sVar);
    }

    public static final LynxUI LJFF$3(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchVideo(sVar);
    }

    public static final LynxUI LJFF$4(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchPhoto(sVar);
    }

    public static final LynxUI LJFF$5(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchLive(sVar);
    }

    public static final LynxUI LJFF$6(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchDropdown(sVar);
    }

    public static final LynxUI LJFF$7(C689790R3x c689790R3x, s sVar) {
        return new SearchHorizontalBounceView(sVar);
    }

    public static final LynxUI LJFF$8(C689790R3x c689790R3x, s sVar) {
        return new SearchList(sVar);
    }

    public static final LynxUI LJFF$9(C689790R3x c689790R3x, s sVar) {
        return new LynxSearchKeyframeCover(sVar);
    }
}
