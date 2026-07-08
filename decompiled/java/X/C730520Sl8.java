package X;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730520Sl8 extends C09AY implements Function2<VideoDiggAssem, C731910SnN, Unit> {
    public C730520Sl8() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C731910SnN c731910SnN) {
        Aweme aweme;
        String strMapZeroNumToString;
        DescBottomViewModel descBottomViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C731910SnN c731910SnN2 = c731910SnN;
        videoDiggAssem2.getClass();
        if (c731910SnN2 != null) {
            Object obj = null;
            if (!c731910SnN2.LIZJ) {
                C2180521AVm.LIZLLL(videoDiggAssem2.getContentView().findViewById(R.id.fu0), 4, C1AV3.LIZ(1, "Feed", null, "digg_assem"));
            } else {
                try {
                    C786410Ut5.LLLLZLL((TuxTextView) videoDiggAssem2.getContentView().findViewById(R.id.fu0), 0);
                    ((TextView) videoDiggAssem2.getContentView().findViewById(R.id.fu0)).setText(c731910SnN2.LIZ);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    TextView textView = (TextView) videoDiggAssem2.getContentView().findViewById(R.id.fu0);
                    VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
                    VideoItemParams item = videoDiggVMFp.getItem();
                    if (item != null) {
                        aweme = item.getAweme();
                    } else {
                        aweme = null;
                    }
                    String strZQ2 = videoDiggVMFp.zQ2(aweme, 0L);
                    if (strZQ2 != null) {
                        strMapZeroNumToString = videoDiggVMFp.mapZeroNumToString(strZQ2);
                    } else {
                        strMapZeroNumToString = null;
                    }
                    textView.setText(strMapZeroNumToString);
                    C2276411E8h.LIZIZ.LIZLLL("common_feed", e);
                }
            }
            ((ImageView) videoDiggAssem2.getContentView().findViewById(R.id.ftt)).setSelected(c731910SnN2.LIZIZ);
            if (videoDiggAssem2.getContentView().findViewById(R.id.ftt).isSelected()) {
                videoDiggAssem2.getContentView().findViewById(R.id.fuc).setContentDescription(C20642515q3.LJI(2131823228));
            } else {
                videoDiggAssem2.getContentView().findViewById(R.id.fuc).setContentDescription(C1356620lPI.LIZ(C20642515q3.LJI(2131823204), C2097908Jt.LIZJ(new Pair("number", String.valueOf(c731910SnN2.LIZ)))));
            }
            if (videoDiggAssem2.LLLII && (descBottomViewModel = (DescBottomViewModel) videoDiggAssem2.LLLFFI.getValue()) != null && (mutableLiveData = descBottomViewModel.LL) != null) {
                mutableLiveData.postValue(Boolean.valueOf(c731910SnN2.LIZIZ));
            }
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) videoDiggAssem2.LLLIIII.getValue();
            StringBuilder sb = new StringBuilder("showDiggState containerView: ");
            sb.append(videoDiggAssem2.LJJIJL().getVisibility());
            sb.append(" contentView: ");
            sb.append(videoDiggAssem2.getContentView().getVisibility());
            sb.append(" aid: ");
            C724270Sb3 c724270Sb3 = videoDiggAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            sb.append(aid);
            sb.append(", selected: ");
            sb.append(c731910SnN2.LIZIZ);
            sb.append(", diggCount: ");
            sb.append(c731910SnN2.LIZ);
            abstractC1604130rqV.LJIIIZ(sb.toString());
        }
        return Unit.LIZ;
    }
}
