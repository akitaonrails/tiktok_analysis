package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.TextLink;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.data.parser.notify.TextLinkViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0zPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895010zPf {
    public static void LIZ(List list) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        try {
            ArrayList arrayList = new ArrayList();
            for (TouchPoint touchPoint : (ArrayList) list) {
                if (touchPoint != null) {
                    TextLink textLink = (TextLink) C20484080s.LIZ(touchPoint.data, TextLink.class);
                    if (textLink != null) {
                        textLink.LIZ = touchPoint.touchPointId;
                        textLink.LIZIZ = touchPoint.touchPointName;
                        int i = touchPoint.launchPlanId;
                        if (i == null) {
                            i = -1;
                        }
                        textLink.LIZJ = i;
                        String str = touchPoint.abVersions;
                        if (str == null) {
                            str = "";
                        }
                        textLink.LIZLLL = str;
                        HashSet hashSet = new HashSet();
                        List<String> list2 = textLink.videoIds;
                        if (list2 != null) {
                            hashSet.addAll(list2);
                        }
                        textLink.LJIIIIZZ = hashSet;
                        HashSet hashSet2 = new HashSet();
                        List<String> list3 = textLink.hashtagIds;
                        if (list3 != null) {
                            hashSet2.addAll(list3);
                        }
                        textLink.LJII = hashSet2;
                    }
                    arrayList.add(textLink);
                }
            }
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C2178808gE.LIZ().LJIIIZ.put(5, arrayList);
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextLinkViewModel.class);
            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(354);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
            if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
                hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
            } else {
                hasDefaultViewModelProviderFactory = null;
            }
            ((TextLinkViewModel) new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS271S0000000_28, null, null, null).getValue()).setState(AFwS271S0000000_28.get$arr$(379));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
