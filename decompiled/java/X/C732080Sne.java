package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Sne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732080Sne extends C09AY implements InterfaceC1631620sYq<VideoCommentAssem, Integer, Boolean, Unit> {
    public C732080Sne() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(VideoCommentAssem videoCommentAssem, Integer num, Boolean bool) {
        C732070Snd c732070Snd;
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        C732050Snb c732050Snb = videoCommentAssem.LLLILZ;
        if (c732050Snb != null && (c732070Snd = c732050Snb.LJIIIZ) != null) {
            if (!zBooleanValue) {
                iIntValue = 0;
            }
            c732070Snd.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }
}
