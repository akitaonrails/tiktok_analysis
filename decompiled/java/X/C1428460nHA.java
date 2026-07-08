package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428460nHA {
    public static final C1428460nHA LIZ = new C1428460nHA();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI(EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag(), EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag(), EnumC1647570syZ.NEW_BOTTOM_STORY.getTag(), EnumC1647570syZ.RECORD_LIGHTENING_QUICK.getTag(), EnumC1647570syZ.RECORD_COMBINE_LIGHTENING.getTag(), EnumC1647570syZ.RECORD_COMBINE_15.getTag(), EnumC1647570syZ.RECORD_COMBINE.getTag(), EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.PHOTO_SHORT.getTag());

    public static final String LIZ(InterfaceC1648020szI interfaceC1648020szI) {
        Object next;
        List<String> prevTabTags = interfaceC1648020szI.getPrevTabTags();
        List<C1653090t7T> existingTabs = interfaceC1648020szI.getExistingTabs();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(existingTabs, 10));
        Iterator<C1653090t7T> it2 = existingTabs.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ.LIZIZ);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (LIZIZ.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = C13LP.LJLJJLL(prevTabTags).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (arrayList2.contains(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            return (String) C13LP.LJJJLL(arrayList2);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [REQUEST, X.0kbR] */
    public static void LIZIZ(SmartImageView smartImageView, final CutsameDataItem cutsameDataItem, final int i, final int i2) {
        final String str;
        String str2;
        if (cutsameDataItem == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C013C c013c = new C013C();
        CutSameVideo cutSameVideo = cutsameDataItem.video;
        if (cutSameVideo != null) {
            str = cutSameVideo.coverUrl;
        } else {
            str = null;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadTemplateCover: template = ");
        sbLIZ.append(cutsameDataItem.title);
        sbLIZ.append(", url = ");
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0n6h
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str3, Throwable th) {
                String strLIZIZ;
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadTemplateCover: onFailure: template = ");
                sbLIZ2.append(cutsameDataItem.title);
                sbLIZ2.append(", url = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", id = ");
                sbLIZ2.append(str3);
                sbLIZ2.append(", throwable: ");
                String strLIZIZ2 = null;
                if (th != null) {
                    strLIZIZ = C13SZ.LIZIZ(th);
                } else {
                    strLIZIZ = null;
                }
                sbLIZ2.append(strLIZIZ);
                C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                c013c2.element = true;
                CutsameDataItem cutsameDataItem2 = cutsameDataItem;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (th != null) {
                    strLIZIZ2 = C13SZ.LIZIZ(th);
                }
                C1419580n2q.LJFF(1, cutsameDataItem2, jCurrentTimeMillis2, 0, strLIZIZ2, str, i, i2);
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str3, Object obj, Animatable animatable) {
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadTemplateCover: onFinalImageSet: template = ");
                sbLIZ2.append(cutsameDataItem.title);
                sbLIZ2.append(", url = ");
                sbLIZ2.append(str);
                C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                C013C c013c2 = c013c;
                if (!c013c2.element) {
                    c013c2.element = true;
                    C1419580n2q.LJFF(0, cutsameDataItem, System.currentTimeMillis() - jCurrentTimeMillis, null, null, str, i, i2);
                }
            }

            @Override // X.C1320700kTM
            public final void LJII(String str3, C1325710kbR c1325710kbR, Throwable th) {
                String str4;
                String strLIZIZ;
                String str5;
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadTemplateCover: onFailure: template = ");
                sbLIZ2.append(cutsameDataItem.title);
                sbLIZ2.append(", url = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", id = ");
                sbLIZ2.append(str3);
                sbLIZ2.append(", error = ");
                String strLIZIZ2 = null;
                if (c1325710kbR != null) {
                    str4 = c1325710kbR.LJJIJL;
                } else {
                    str4 = null;
                }
                sbLIZ2.append(str4);
                sbLIZ2.append(", throwable: ");
                if (th != null) {
                    strLIZIZ = C13SZ.LIZIZ(th);
                } else {
                    strLIZIZ = null;
                }
                sbLIZ2.append(strLIZIZ);
                C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                c013c2.element = true;
                CutsameDataItem cutsameDataItem2 = cutsameDataItem;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                if (c1325710kbR != null) {
                    str5 = c1325710kbR.LJJIJL;
                } else {
                    str5 = null;
                }
                sbLIZ3.append(str5);
                sbLIZ3.append(": ");
                if (th != null) {
                    strLIZIZ2 = C13SZ.LIZIZ(th);
                }
                sbLIZ3.append(strLIZIZ2);
                C1419580n2q.LJFF(1, cutsameDataItem2, jCurrentTimeMillis2, 0, C2188811AlT.LIZIZ(sbLIZ3), str, i, i2);
            }
        };
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (i == 1) {
            str2 = "outer";
        } else {
            str2 = "inner";
        }
        if (smartImageView != null) {
            if (TextUtils.isEmpty(str)) {
                C1324750kZt.LIZIZ(smartImageView, R.drawable.dhr);
                return;
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            }
            c1325700kbQLIZLLL.LJJIJIIJIL = "creation";
            c1325700kbQLIZLLL.LJJIJIL = "template_tab";
            c1325700kbQLIZLLL.LJJIJL = str2;
            C1324750kZt.LJIILL(c1325700kbQLIZLLL);
            ?? LIZ2 = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJIILJJIL = smartImageView.getController();
            c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
            c1320810kTXLIZJ.LIZJ = null;
            c1320810kTXLIZJ.LIZLLL = LIZ2;
            smartImageView.setController(c1320810kTXLIZJ.LIZ());
        }
    }
}
