package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.longpressanim.LongPressEmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSQ extends C09AY implements Function2<LongPressEmojiAnimAssem, C0RSR, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RSQ(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LongPressEmojiAnimAssem longPressEmojiAnimAssem, C0RSR c0rsr) {
        Object obj;
        String aid;
        C0HIT c0hit;
        Rect rectMt2;
        Object obj2;
        LongPressEmojiAnimAssem longPressEmojiAnimAssem2 = longPressEmojiAnimAssem;
        C0RSR c0rsr2 = c0rsr;
        if (c0rsr2 != null) {
            String str = c0rsr2.LIZJ;
            C724270Sb3 c724270Sb3 = longPressEmojiAnimAssem2.LLJI;
            Aweme aweme = null;
            Rect rectMt22 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj).getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid) && c0rsr2.LIZLLL.length() != 0 && c0rsr2.LIZ == 4) {
                View view = this.LL;
                if ((view instanceof C0HIT) && (c0hit = (C0HIT) view) != null) {
                    int visibility = c0hit.getVisibility();
                    c0hit.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c0hit);
                    if (C2176211AEx.LIZJ()) {
                        IVideoCommentAbility iVideoCommentAbility = (IVideoCommentAbility) longPressEmojiAnimAssem2.LLJLIL.getValue();
                        if (iVideoCommentAbility != null) {
                            iVideoCommentAbility.vX1(c0rsr2.LIZLLL);
                        }
                    } else if (C2176211AEx.LIZIZ()) {
                        String str2 = c0rsr2.LIZLLL;
                        PointF pointF = c0rsr2.LJ;
                        IVideoCommentAbility iVideoCommentAbility2 = (IVideoCommentAbility) longPressEmojiAnimAssem2.LLJLIL.getValue();
                        if (iVideoCommentAbility2 != null) {
                            rectMt22 = iVideoCommentAbility2.mt2();
                        }
                        c0hit.LIZJ(str2, pointF, rectMt22, new AwS412S0200000_11(longPressEmojiAnimAssem2, c0rsr2, 15));
                    } else {
                        String str3 = c0rsr2.LIZLLL;
                        PointF pointF2 = c0rsr2.LJ;
                        IVideoCommentAbility iVideoCommentAbility3 = (IVideoCommentAbility) longPressEmojiAnimAssem2.LLJLIL.getValue();
                        if (iVideoCommentAbility3 != null) {
                            rectMt2 = iVideoCommentAbility3.mt2();
                        } else {
                            rectMt2 = null;
                        }
                        C724270Sb3 c724270Sb32 = longPressEmojiAnimAssem2.LLJI;
                        if (c724270Sb32 != null) {
                            obj2 = c724270Sb32.LL;
                        } else {
                            obj2 = null;
                        }
                        VideoItemParams videoItemParams = (VideoItemParams) obj2;
                        if (videoItemParams != null) {
                            aweme = videoItemParams.getAweme();
                        }
                        C729510SjV.LJJ(aweme);
                        c0hit.LIZIZ(str3, pointF2, rectMt2, new AwS412S0200000_11(longPressEmojiAnimAssem2, c0rsr2, 16));
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
