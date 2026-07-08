package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11GZ {
    public static final C11GZ LIZ = new C11GZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(464));
    public static final Set<String> LIZJ = new LinkedHashSet();

    public static boolean LIZ(String str) {
        if (C123100dR.LIZ(str)) {
            String anywhereChannelPath = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAnywhereChannelPath("story_thought_bg_res");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anywhereChannelPath);
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists();
        }
        return false;
    }

    public static int LIZJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        return ((Number) c098200Yq).intValue();
    }

    public static void LIZIZ(User user, BackgroundModel backgroundModel, InterfaceC1631620sYq interfaceC1631620sYq) {
        Integer numValueOf;
        C1533790q13 c1533790q13LIZIZ;
        String strLIZLLL;
        int[] iArrLLII;
        float[] fArrLLI;
        Integer numValueOf2;
        List<Float> list;
        List<String> list2;
        Object c098200Yq;
        if (backgroundModel != null && (numValueOf = Integer.valueOf(backgroundModel.backgroundType)) != null) {
            if (numValueOf.intValue() == 1) {
                if (user == null) {
                    interfaceC1631620sYq.invoke(null, null, null);
                    return;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarMedium()));
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ.LJJIIJ(new C19772512Xr(interfaceC1631620sYq, 9));
                return;
            }
            if (numValueOf.intValue() == 2) {
                BackgroundModel.GradientImageData gradientImageData = backgroundModel.gradientImgData;
                if (gradientImageData != null && (list2 = gradientImageData.colors) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        try {
                            c098200Yq = Integer.valueOf(Color.parseColor(it2.next()));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = -16777216;
                        }
                        arrayList.add(Integer.valueOf(((Number) c098200Yq).intValue()));
                    }
                    iArrLLII = C13LP.LLII(arrayList);
                } else {
                    iArrLLII = null;
                }
                BackgroundModel.GradientImageData gradientImageData2 = backgroundModel.gradientImgData;
                if (gradientImageData2 != null && (list = gradientImageData2.locations) != null) {
                    fArrLLI = C13LP.LLI(list);
                } else {
                    fArrLLI = null;
                }
                if (iArrLLII != null && fArrLLI != null && iArrLLII.length == fArrLLI.length && iArrLLII.length != 0) {
                    C415650GRn c415650GRn = new C415650GRn(fArrLLI, iArrLLII);
                    String str = backgroundModel.switchColor;
                    if (str != null) {
                        numValueOf2 = Integer.valueOf(LIZJ(str));
                    } else {
                        numValueOf2 = null;
                    }
                    interfaceC1631620sYq.invoke(c415650GRn, null, numValueOf2);
                    return;
                }
                interfaceC1631620sYq.invoke(null, null, null);
                return;
            }
            if (numValueOf.intValue() != 3) {
                return;
            }
            Forest forestLIZ = C0T1N.LIZ();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = "story_thought_bg_res";
            requestParams.bundle = backgroundModel.backgroundGeckoId;
            C1533910q1F c1533910q1FCreateSyncRequest = forestLIZ.createSyncRequest("", requestParams);
            if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && c1533790q13LIZIZ.LIZIZ && (strLIZLLL = c1533790q13LIZIZ.LIZLLL()) != null && strLIZLLL.length() != 0) {
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(c1533790q13LIZIZ.LIZLLL()));
                c1331670kl3LJII.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJII.LJJIIJ(new C19772412Xq(interfaceC1631620sYq, backgroundModel, 3));
                return;
            }
            String str2 = backgroundModel.backgroundImgUrl;
            if (str2 != null) {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str2));
                c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJI.LJJIIJ(new C19772412Xq(interfaceC1631620sYq, backgroundModel, 4));
                return;
            }
            interfaceC1631620sYq.invoke(null, null, null);
        }
    }
}
