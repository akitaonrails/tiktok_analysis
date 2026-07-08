package Y;

import X.C1166970gTP;
import X.C1172290gbz;
import X.C1402640mbW;
import X.InterfaceC1441305kZ;
import X.InterfaceC1628590sTx;
import X.InterfaceC1650230t2r;
import X.InterfaceC2173471A4j;
import Y.ARunnableS106S0100000_6;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AObjectS304S0200000_18 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS304S0200000_18 aObjectS304S0200000_18, Object obj) {
        String musicId;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        CreativeModel creativeModel2;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2;
        ArrayList<String> arrayList;
        CreativeModel creativeModel3;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel3;
        CreativeModel creativeModel4;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel4;
        AVMusic aVMusicMr0 = ((InterfaceC1628590sTx) aObjectS304S0200000_18.l0).mr0();
        ArrayList<String> arrayList2 = null;
        if (aVMusicMr0 != null) {
            musicId = aVMusicMr0.getMusicId();
        } else {
            musicId = null;
        }
        if (Intrinsics.LJFF(musicId, ((C1172290gbz) aObjectS304S0200000_18.l1).LLILZ)) {
            ShortVideoContext shortVideoContext = ((C1172290gbz) aObjectS304S0200000_18.l1).getShortVideoContext();
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel2 = creativeModel2.reuseAwemeTTSAndVCRefIDsModel) != null) {
                C1402640mbW c1402640mbW = ReuseAwemeTTSAndVCRefIDsModel.Companion;
                ShortVideoContext shortVideoContext2 = ((C1172290gbz) aObjectS304S0200000_18.l1).getShortVideoContext();
                if (shortVideoContext2 != null && (creativeModel4 = shortVideoContext2.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel4 = creativeModel4.reuseAwemeTTSAndVCRefIDsModel) != null) {
                    arrayList = reuseAwemeTTSAndVCRefIDsModel4.ttsVoiceIDs;
                } else {
                    arrayList = null;
                }
                ShortVideoContext shortVideoContext3 = ((C1172290gbz) aObjectS304S0200000_18.l1).getShortVideoContext();
                if (shortVideoContext3 != null && (creativeModel3 = shortVideoContext3.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel3 = creativeModel3.reuseAwemeTTSAndVCRefIDsModel) != null) {
                    arrayList2 = reuseAwemeTTSAndVCRefIDsModel3.ttsVoiceRefIDs;
                }
                c1402640mbW.getClass();
                ArrayList<String> arrayList3 = new ArrayList<>();
                if (arrayList != null) {
                    arrayList3.addAll(arrayList);
                }
                if (arrayList2 != null) {
                    arrayList3.addAll(arrayList2);
                }
                reuseAwemeTTSAndVCRefIDsModel2.curMusicTTSRedIDs = arrayList3;
                return;
            }
            return;
        }
        ShortVideoContext shortVideoContext4 = ((C1172290gbz) aObjectS304S0200000_18.l1).getShortVideoContext();
        if (shortVideoContext4 == null || (creativeModel = shortVideoContext4.creativeModel) == null || (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) == null) {
            return;
        }
        reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs = new ArrayList<>();
    }

    public static final void onChanged$1(AObjectS304S0200000_18 aObjectS304S0200000_18, Object obj) {
        int width;
        InterfaceC1650230t2r interfaceC1650230t2r = ((C1166970gTP) aObjectS304S0200000_18.l0).LLJI;
        ImageView imageView = (ImageView) aObjectS304S0200000_18.l1;
        int width2 = 0;
        if (imageView != null) {
            width = imageView.getWidth();
        } else {
            width = 0;
        }
        ImageView imageView2 = (ImageView) aObjectS304S0200000_18.l1;
        if (imageView2 != null) {
            width2 = imageView2.getWidth();
        }
        final ImageView imageView3 = (ImageView) aObjectS304S0200000_18.l1;
        interfaceC1650230t2r.qf0(width, (width2 * 16) / 9, false, false, new InterfaceC2173471A4j() { // from class: X.0HMY
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i, Bitmap bitmap) {
                ImageView imageView4;
                if (i == 0 && bitmap != null && (imageView4 = imageView3) != null) {
                    HandlerHook.viewPost(imageView4, new ARunnableS106S0100000_6(bitmap, 323));
                }
            }
        }, false);
    }

    public AObjectS304S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
