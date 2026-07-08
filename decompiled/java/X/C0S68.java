package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0S68, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S68 extends C09AY implements Function2<VideoDescAssem, Integer, Unit> {
    public C0S68() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDescAssem videoDescAssem, Integer num) {
        VideoDescAssem videoDescAssem2 = videoDescAssem;
        int iIntValue = num.intValue();
        videoDescAssem2.Jp().LLILLL = iIntValue;
        TuxTextView tuxTextViewEp = videoDescAssem2.Ep();
        if (tuxTextViewEp != null) {
            C718770SHj c718770SHj = null;
            if (iIntValue != 0) {
                tuxTextViewEp.setTuxFont(52);
                C718770SHj c718770SHj2 = videoDescAssem2.LLLLII;
                if (c718770SHj2 != null) {
                    c718770SHj = c718770SHj2;
                }
                c718770SHj.LJLIL(52);
            } else {
                tuxTextViewEp.setTuxFont(42);
                C718770SHj c718770SHj3 = videoDescAssem2.LLLLII;
                if (c718770SHj3 != null) {
                    c718770SHj = c718770SHj3;
                }
                c718770SHj.LJLIL(42);
            }
        }
        return Unit.LIZ;
    }
}
