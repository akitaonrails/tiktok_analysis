package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E43, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E43 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SmartTrimFragment LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E43(SmartTrimFragment smartTrimFragment, C0E48 c0e48, long j, long j2) {
        super(0);
        this.LL = smartTrimFragment;
        this.LLILLJJLI = c0e48;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NLETrack nLETrackRn;
        this.LL.jT();
        SmartTrimFragment smartTrimFragment = this.LL;
        C368870EdB c368870EdB = smartTrimFragment.LLLFZ;
        if (c368870EdB != null) {
            ((SmartTrimViewModel) smartTrimFragment.wS()).CQ2(c368870EdB.LIZIZ(), smartTrimFragment.LLLII);
        }
        C350870DpF.LJIIIZ(this.LLILLJJLI, "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
        long jLongValue = 0;
        for (Pair<Long, Long> pair : this.LL.LLLIZZ) {
            jLongValue += pair.getSecond().longValue() - pair.getFirst().longValue();
        }
        boolean z = C352310DrZ.LIZLLL(jLongValue) - this.LLILLL != 0;
        C0E48 c0e48 = this.LL.LL;
        if (c0e48 != null && (nLETrackRn = c0e48.Rn()) != null) {
            nLETrackRn.setExtra("is_editor_pro_smart_trim", String.valueOf(z));
        }
        VideoPublishEditModel videoPublishEditModelZS = this.LL.ZS();
        if (videoPublishEditModelZS != null) {
            C361680EFy.LJJLJ(videoPublishEditModelZS, this.LL.LL, z);
        }
        C350410DoV.LIZLLL(C350870DpF.LJFF(this.LLILLJJLI), true, this.LL.hS(), false, true);
        SmartTrimFragment smartTrimFragment2 = this.LL;
        smartTrimFragment2.LLLIIIL = true;
        smartTrimFragment2.NR();
        this.LL.nT(this.LLILZ);
        C0E5S c0e5s = this.LL.LLLL;
        if (c0e5s != null) {
            c0e5s.pl(1.0f);
        }
        return Unit.LIZ;
    }
}
