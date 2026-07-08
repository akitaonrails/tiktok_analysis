package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12HP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HP {
    public static final List<ComposerBeauty> LIZJ(List<BeautyCategory> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator<BeautyCategory> it2 = list.iterator();
        while (it2.hasNext()) {
            for (ComposerBeauty composerBeauty : it2.next().getBeautyList()) {
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null && !childList.isEmpty()) {
                        arrayList.addAll(childList);
                    }
                } else {
                    arrayList.add(composerBeauty);
                }
            }
        }
        return arrayList;
    }

    public static final boolean LIZLLL(ComposerBeauty composerBeauty) {
        boolean z;
        String parentId = composerBeauty.getParentId();
        if (parentId != null && parentId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJ(ComposerBeauty composerBeauty) {
        if (LJII(composerBeauty) && composerBeauty.getEnable()) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(ComposerBeauty composerBeauty) {
        if (!LIZLLL(composerBeauty) && composerBeauty.getCategoryExclusive()) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(ComposerBeauty composerBeauty) {
        if (!LIZLLL(composerBeauty) && !LJFF(composerBeauty) && !composerBeauty.isBeautyMode()) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(ComposerBeauty composerBeauty) {
        List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
        if (((items == null || items.isEmpty()) && !composerBeauty.getExtra().isNone()) || composerBeauty.getEffect().getUnzipPath().length() <= 0) {
            return false;
        }
        return true;
    }

    public static final int LJIIIIZZ(String str) {
        Integer numLJIIJJI;
        if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ae, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.beauty.ComposerBeauty LIZIZ(com.ss.android.ugc.aweme.beauty.ComposerBeauty r8, java.util.List<com.ss.android.ugc.aweme.tools.beauty.BeautyCategory> r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12HP.LIZIZ(com.ss.android.ugc.aweme.beauty.ComposerBeauty, java.util.List):com.ss.android.ugc.aweme.beauty.ComposerBeauty");
    }

    public static final void LIZ(ComposerBeauty composerBeauty, Function1<? super ComposerBeauty, Boolean> function1, Function2<? super String, ? super String, int[]> function2) {
        if (function1.invoke(composerBeauty).booleanValue() && LJ(composerBeauty)) {
            if (composerBeauty.getExtra().isNone()) {
                int[] iArrInvoke = function2.invoke(composerBeauty.getEffect().getUnzipPath(), "");
                if (iArrInvoke != null && iArrInvoke.length == 2 && iArrInvoke[0] == 0 && iArrInvoke[1] == EnumC992680bwI.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                    return;
                }
                return;
            }
            List<ComposerBeautyExtraBeautify.ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items == null) {
                return;
            }
            Iterator<ComposerBeautyExtraBeautify.ItemsBean> it2 = items.iterator();
            while (it2.hasNext()) {
                int[] iArrInvoke2 = function2.invoke(composerBeauty.getEffect().getUnzipPath(), it2.next().tag);
                if (iArrInvoke2 != null && iArrInvoke2.length == 2 && iArrInvoke2[0] == 0 && iArrInvoke2[1] == EnumC992680bwI.EXCLUDE.getFlag()) {
                    composerBeauty.setEnable(false);
                }
            }
        }
    }
}
