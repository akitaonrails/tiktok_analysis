package Y;

import X.AbstractC1585810rMx;
import X.C21383018mC;
import X.C21384318mP;
import X.C21673919s1;
import X.RunnableC204701157z;
import X.RunnableC21383618mI;
import X.RunnableC21383718mJ;
import X.RunnableC21384618mS;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditFragment;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class AsS0S0120000_32 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    public AsS0S0120000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS0S0120000_32 asS0S0120000_32, RecyclerView recyclerView, int i) {
        int startTime;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        if (!((Boolean) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLLZLL().LLILZ.getValue()).booleanValue()) {
            C21383018mC c21383018mC = null;
            if (i != 0) {
                if (i == 1) {
                    if (((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLZLZ().LJFF()) {
                        asS0S0120000_32.z1 = true;
                    }
                    ((Handler) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJJ.getValue()).removeCallbacksAndMessages(null);
                    ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLZLZ().pause();
                    asS0S0120000_32.z2 = true;
                    ((Handler) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJIL.getValue()).post((RunnableC21383618mI) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJJJIL.getValue());
                    return;
                }
                return;
            }
            if (!asS0S0120000_32.z2) {
                return;
            }
            asS0S0120000_32.z2 = false;
            ((Handler) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJIL.getValue()).removeCallbacksAndMessages(null);
            CreatorCaptionEditActivity creatorCaptionEditActivity = (CreatorCaptionEditActivity) asS0S0120000_32.l0;
            C21383018mC c21383018mC2 = creatorCaptionEditActivity.LLILLJJLI;
            if (c21383018mC2 == null) {
                c21383018mC2 = null;
            }
            int i2 = c21383018mC2.LLILZ;
            if (i2 != -1) {
                CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager = creatorCaptionEditActivity.LL;
                if (highLightLayoutManager == null) {
                    highLightLayoutManager = null;
                }
                highLightLayoutManager.smoothScrollToPosition(recyclerView, new C21673919s1(), i2);
                VideoViewComponent videoViewComponentLLLZLZ = ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLZLZ();
                C21383018mC c21383018mC3 = ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLILLJJLI;
                if (c21383018mC3 != null) {
                    c21383018mC = c21383018mC3;
                }
                CreatorCaptionEditItem creatorCaptionEditItem = c21383018mC.LL.LLIZ;
                if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i2)) != null) {
                    startTime = creatorCaptionEditData.getStartTime();
                } else {
                    startTime = 0;
                }
                videoViewComponentLLLZLZ.LJIIIZ((startTime * 100.0f) / ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLZLZ().LJ());
            }
            if (asS0S0120000_32.z1) {
                asS0S0120000_32.z1 = false;
                ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLLZLZ().resume();
            }
            ((Handler) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJJ.getValue()).post((RunnableC21383718mJ) ((CreatorCaptionEditActivity) asS0S0120000_32.l0).LLJJJJLIIL.getValue());
        }
    }

    public static final void LJJIIJ$1(AsS0S0120000_32 asS0S0120000_32, RecyclerView recyclerView, int i) {
        Integer numValueOf;
        float f;
        int startTime;
        CreatorCaptionEditData creatorCaptionEditData;
        MutableLiveData<Boolean> mutableLiveData;
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLILZ;
        if (newCreatorCaptionEditViewModel != null && (mutableLiveData = newCreatorCaptionEditViewModel.LLJIJIL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                if (((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).VR().LJFF()) {
                    asS0S0120000_32.z1 = true;
                }
                ((Handler) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLL.getValue()).removeCallbacksAndMessages(null);
                ((Handler) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLILLLLZIIL.getValue()).removeCallbacksAndMessages(null);
                ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).VR().pause();
                asS0S0120000_32.z2 = true;
                ((Handler) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLILLLLZIIL.getValue()).post((RunnableC204701157z) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLLIL.getValue());
                return;
            }
            return;
        }
        if (!asS0S0120000_32.z2) {
            return;
        }
        asS0S0120000_32.z2 = false;
        ((Handler) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLILLLLZIIL.getValue()).removeCallbacksAndMessages(null);
        C21384318mP c21384318mP = ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLILZIL;
        if (c21384318mP != null && (numValueOf = Integer.valueOf(c21384318mP.LLILZIL)) != null && numValueOf.intValue() != -1) {
            NewCreatorCaptionEditFragment.HighLightLayoutManager highLightLayoutManager = ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJJIJI;
            if (highLightLayoutManager != null) {
                highLightLayoutManager.smoothScrollToPosition(recyclerView, new C21673919s1(), numValueOf.intValue());
            }
            VideoViewComponent videoViewComponentVR = ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).VR();
            C21384318mP c21384318mP2 = ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLILZIL;
            if (c21384318mP2 != null) {
                int iIntValue = numValueOf.intValue();
                List<CreatorCaptionEditData> listLLLI = c21384318mP2.LLLI();
                if (listLLLI != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(listLLLI, iIntValue)) != null) {
                    startTime = creatorCaptionEditData.getStartTime();
                } else {
                    startTime = 0;
                }
                f = startTime * 100.0f;
            } else {
                f = 0.0f;
            }
            videoViewComponentVR.LJIIIZ(f / ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).VR().LJ());
        }
        if (asS0S0120000_32.z1) {
            asS0S0120000_32.z1 = false;
            ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).VR().resume();
        }
        ((Handler) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLILLLLZIIL.getValue()).post((RunnableC21384618mS) ((NewCreatorCaptionEditFragment) asS0S0120000_32.l0).LLJLLL.getValue());
    }
}
