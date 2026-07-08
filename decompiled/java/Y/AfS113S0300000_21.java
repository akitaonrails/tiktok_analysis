package Y;

import X.C09JN;
import X.C11NJ;
import X.C1233040iBy;
import X.C1366550lfJ;
import X.C1374630lsL;
import X.C1374740lsW;
import X.C1375970luV;
import X.C1392890mLn;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C571830Mbl;
import X.C7740030o;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1364105Vn;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.share.model.MultiShortenModel;
import com.ss.android.ugc.aweme.share.model.ShareURLInfo;
import com.ss.android.ugc.aweme.share.model.ShortenURLInfo;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AfS113S0300000_21 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static final void accept$0(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        Object obj2;
        C1C7U.LIZ("UrlShorterViewModel@545e.fetchMultiShortenApiData$2");
        MultiShortenModel multiShortenModel = (MultiShortenModel) obj;
        ((C1374740lsW) afS113S0300000_21.l0).LJFF = System.currentTimeMillis();
        ((C259800zU) afS113S0300000_21.l1).element = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), multiShortenModel);
        C1374740lsW c1374740lsW = (C1374740lsW) afS113S0300000_21.l0;
        List list = (List) afS113S0300000_21.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = ((ShareURLInfo) it2.next()).shareUrl;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        if (multiShortenModel != null) {
            List<ShortenURLInfo> list2 = multiShortenModel.shortenUrls;
            int i = 0;
            if (list2 != null && !list2.isEmpty() && arrayList.size() == list2.size()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (ShortenURLInfo shortenURLInfo : list2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ShortenURLInfo shortenURLInfo2 = shortenURLInfo;
                        if (shortenURLInfo2.status == 0) {
                            obj2 = shortenURLInfo2.shareUrl;
                        } else {
                            obj2 = ListProtector.get(arrayList, i);
                        }
                        arrayList2.add(obj2);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                arrayList = arrayList2;
            }
        }
        c1374740lsW.LIZLLL = arrayList;
        C1374740lsW c1374740lsW2 = (C1374740lsW) afS113S0300000_21.l0;
        c1374740lsW2.LIZIZ.onNext(new C1374630lsL(c1374740lsW2.LIZLLL));
        C1C7U.LIZIZ("UrlShorterViewModel@545e.fetchMultiShortenApiData$2");
    }

    public static final void accept$1(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("UpvotePublishVM@b134.deleteUpvote$2");
        ((Function1) afS113S0300000_21.l0).invoke(obj);
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS113S0300000_21.l1;
        C11NJ c11nj = (C11NJ) afS113S0300000_21.l2;
        upvotePublishVM.getClass();
        c11nj.LJ();
        C1C7U.LIZIZ("UpvotePublishVM@b134.deleteUpvote$2");
    }

    public static final void accept$2(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("VideoViewerListVM@1c66.config$1$onRefresh$2");
        ((VideoViewerListVM) afS113S0300000_21.l0).AQ2((ViewerListResponse) obj, (InterfaceC1364105Vn) afS113S0300000_21.l1, (List) ((C259800zU) afS113S0300000_21.l2).element);
        C1C7U.LIZIZ("VideoViewerListVM@1c66.config$1$onRefresh$2");
    }

    public static final void accept$3(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("LiveSharePackage@54c.selectContentAsync$2");
        super/*com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage*/.LJIJ((InterfaceC1369790lkX) afS113S0300000_21.l1, (Function2) afS113S0300000_21.l2);
        C1C7U.LIZIZ("LiveSharePackage@54c.selectContentAsync$2");
    }

    public static final void accept$4(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("TTShareDefaultHandler@fd4a.getShareLink$2$2");
        if (C1366550lfJ.LIZ(((InterfaceC1369790lkX) afS113S0300000_21.l0).key())) {
            C571830Mbl.LIZ((DialogC1389620mGW) afS113S0300000_21.l1);
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS113S0300000_21.l2;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("TTShareDefaultHandler@fd4a.getShareLink$2$2");
    }

    public static final void accept$5(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("CopyAwemeAction@bfc7.execute$disposable$2");
        String strLIZIZ = (String) obj;
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS113S0300000_21.l0);
        if (((C1375970luV) afS113S0300000_21.l1).LLILZIL.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C1375970luV) afS113S0300000_21.l1).LLILZIL);
            sbLIZ.append(' ');
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1375970luV c1375970luV = (C1375970luV) afS113S0300000_21.l1;
        c1375970luV.LIZ(strLIZIZ, (Context) afS113S0300000_21.l2, c1375970luV.LLIZLLLIL, null);
        if (!((C1375970luV) afS113S0300000_21.l1).LLILZLL) {
            C1233040iBy c1233040iBy = new C1233040iBy((Context) afS113S0300000_21.l2);
            c1233040iBy.LIZIZ(((C1375970luV) afS113S0300000_21.l1).LLIZ);
            c1233040iBy.LIZLLL();
        }
        C1C7U.LIZIZ("CopyAwemeAction@bfc7.execute$disposable$2");
    }

    public static final void accept$6(AfS113S0300000_21 afS113S0300000_21, Object obj) {
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.realMutePosts$d$3");
        ((Function1) afS113S0300000_21.l0).invoke(Boolean.FALSE);
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        Fragment fragment = (Fragment) afS113S0300000_21.l1;
        Activity activity = (Activity) afS113S0300000_21.l2;
        c1392890mLn.getClass();
        C1392890mLn.LJFF(activity, fragment);
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.realMutePosts$d$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS113S0300000_21(Object obj, C1374740lsW c1374740lsW, C259800zU<String> c259800zU, List<ShareURLInfo> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = c1374740lsW;
        this.l2 = c259800zU;
    }
}
