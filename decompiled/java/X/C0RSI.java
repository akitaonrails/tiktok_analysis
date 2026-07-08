package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RSI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSI extends C09AY implements Function2<EmojiAnimAssem, C291001Au<? extends C693070RGn>, Unit> {
    public C0RSI() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(EmojiAnimAssem emojiAnimAssem, C291001Au<? extends C693070RGn> c291001Au) {
        Object obj;
        boolean z;
        EmojiAnimAssem emojiAnimAssem2 = emojiAnimAssem;
        if (!C300900Bqq.LIZ() || c291001Au != null) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C724270Sb3 c724270Sb3 = emojiAnimAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL(((VideoItemParams) obj).fragment);
            C1351250lGd c1351250lGd = C1351250lGd.LIZ;
            Aweme aweme = ((VideoItemParams) emojiAnimAssem2.bo()).getAweme();
            c1351250lGd.getClass();
            int i = 0;
            if (!C1351250lGd.LIZIZ(aweme) && !zLJJIIJZLJL) {
                z = false;
            } else {
                z = true;
            }
            View contentView = emojiAnimAssem2.getContentView();
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, contentView);
        }
        return Unit.LIZ;
    }
}
