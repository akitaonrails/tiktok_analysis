package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS255S0300000_11;

/* JADX INFO: renamed from: X.0SIM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIM {
    public static final void LIZ(C718840SHq c718840SHq, String str, C21415018rM c21415018rM) {
        AwS125S1100000_11 awS125S1100000_11 = new AwS125S1100000_11(c21415018rM, str, 11);
        List<C0SIR> list = c718840SHq.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C0SIR> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) awS125S1100000_11.invoke(it2.next()), arrayList);
        }
        c718840SHq.LIZ = arrayList;
    }

    public static final C718840SHq LIZIZ(C718840SHq c718840SHq, Context context, Aweme aweme, VideoItemParams videoItemParams, Integer num) {
        PlayListInfo playListInfo;
        BaseFeedPageParams baseFeedPageParams;
        if (aweme != null) {
            PlayListInfo playListInfo2 = aweme.playlist_info;
            Fragment fragment = null;
            if (playListInfo2 != null && playListInfo2.getMixId() != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getIndex() != null) {
                C0S4N c0s4n = C0S4N.LIZ;
                if (videoItemParams != null) {
                    baseFeedPageParams = videoItemParams.baseFeedPageParams;
                } else {
                    baseFeedPageParams = null;
                }
                C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
                if (videoItemParams != null) {
                    fragment = videoItemParams.fragment;
                }
                boolean zPu = c1599640rjG.Pu(fragment);
                c0s4n.getClass();
                if (C0S4N.LIZ(aweme, baseFeedPageParams, zPu)) {
                    AwS255S0300000_11 awS255S0300000_11 = new AwS255S0300000_11(context, aweme, num, 13);
                    ArrayList arrayList = new ArrayList(c718840SHq.LIZ);
                    arrayList.addAll(0, (Collection) awS255S0300000_11.invoke());
                    c718840SHq.LIZ = arrayList;
                    return c718840SHq;
                }
            }
        }
        return c718840SHq;
    }

    public static final C428830Grh LIZJ(Context context, float f, TextExtraStruct textExtraStruct, String str, Integer num) {
        int i;
        int iLIZ;
        int iIntValue;
        float f2;
        float fLIZIZ;
        Integer numLIZJ;
        float fLIZIZ2 = C814420VxA.LIZIZ(f);
        if (C722510SVt.LIZJ()) {
            iLIZ = 0;
        } else {
            if (((Boolean) C722510SVt.LIZIZ.getValue()).booleanValue()) {
                i = R.attr.dy;
            } else {
                i = R.attr.e8;
            }
            iLIZ = C960203pA.LIZ(i, context);
        }
        if (num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        C428830Grh c428830Grh = new C428830Grh(context, fLIZIZ2, iLIZ, iIntValue, textExtraStruct, false, num, true, C722510SVt.LIZJ(), null, 1056);
        c428830Grh.LLJJIII = true;
        if (C722510SVt.LIZJ()) {
            f2 = 8.0f;
        } else {
            f2 = 12.0f;
        }
        c428830Grh.LLJILLL = C12ES.LIZJ(f2, context);
        c428830Grh.LLJJ = C418440Gaw.LIZIZ(2);
        if (C722510SVt.LIZJ()) {
            fLIZIZ = C418440Gaw.LIZIZ(14);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(13.0f));
        }
        c428830Grh.LLJILJIL = fLIZIZ;
        c428830Grh.LLJILJILJ = C418440Gaw.LIZIZ(15);
        c428830Grh.LLJJL = true;
        c428830Grh.LLJJJJLIIL = str;
        return c428830Grh;
    }
}
