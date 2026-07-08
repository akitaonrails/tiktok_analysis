package X;

import Y.ACallableS243S0200000_11;
import Y.AfS147S0200000_11;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFQ extends C09AY implements Function2<C03H5, C291001Au<? extends SpannableStringBuilder>, Unit> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFQ(C718770SHj c718770SHj) {
        super(2);
        this.LL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends SpannableStringBuilder> c291001Au) {
        List<TextExtraStruct> textExtra;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        String desc;
        if (c291001Au != null) {
            VideoDescVM videoDescVM = this.LL.LLILLJJLI;
            videoDescVM.LLIZLLLIL = 0;
            String str = "";
            videoDescVM.LLJJ = "";
            VideoItemParams item = videoDescVM.getItem();
            if (item != null && (aweme3 = item.getAweme()) != null && (desc = aweme3.getDesc()) != null) {
                str = desc;
            }
            VideoItemParams item2 = videoDescVM.getItem();
            Aweme aweme4 = null;
            if (item2 != null && (aweme2 = item2.getAweme()) != null) {
                textExtra = aweme2.getTextExtra();
            } else {
                textExtra = null;
            }
            videoDescVM.LLJILLL = C461740I8u.LIZ(str, textExtra);
            videoDescVM.LLJJJJLIIL = null;
            videoDescVM.LLJJJ = true;
            C0SFO c0sfo = C0SFR.LIZ;
            VideoItemParams item3 = this.LL.LLILLJJLI.getItem();
            if (item3 != null && (aweme = item3.getAweme()) != null && AwemeBizExtKt.getDescWithHashTagTruncation(aweme) == null && AwemeExtKt.isPhotoMode(aweme) && !aweme.isAd() && C04W9.LIZIZ) {
                C718770SHj c718770SHj = this.LL;
                VideoItemParams item4 = c718770SHj.LLILLJJLI.getItem();
                if (item4 != null) {
                    aweme4 = item4.getAweme();
                }
                c718770SHj.LJZ(aweme4);
                if (aweme4 != null) {
                    C11NJ c11nj = c718770SHj.LLLLII;
                    if (c11nj != null) {
                        c11nj.LJ();
                    } else {
                        c11nj = new C11NJ();
                        c718770SHj.LLLLII = c11nj;
                    }
                    c718770SHj.LLLLLIL = true;
                    c11nj.LIZ(AbstractC19484711Kz.LJIJI(new ACallableS243S0200000_11(c718770SHj, aweme4, 3)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS147S0200000_11(c718770SHj, aweme4, 10), new AfS147S0200000_11(c718770SHj, aweme4, 11)));
                }
            } else {
                C718770SHj c718770SHj2 = this.LL;
                VideoItemParams item5 = c718770SHj2.LLILLJJLI.getItem();
                if (item5 != null) {
                    aweme4 = item5.getAweme();
                }
                c718770SHj2.LJLLLL(aweme4);
            }
        }
        return Unit.LIZ;
    }
}
