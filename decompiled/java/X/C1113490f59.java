package X;

import android.content.res.ColorStateList;
import android.view.View;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTagsEventOptSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS146S0400000_17;

/* JADX INFO: renamed from: X.0f59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113490f59 extends AbstractC1113530f5D {
    public final AbstractC1113400f50 LIZJ;
    public final C16F5 LIZLLL;
    public final C16F5 LJ;
    public final C16FS LJFF;
    public final View LJI;
    public final C1113510f5B LJII;
    public final List<Function0<Unit>> LJIIIIZZ;
    public String LJIIIZ;

    @Override // X.AbstractC1113530f5D
    public final void LJIIIIZZ() {
        ((ArrayList) this.LJIIIIZZ).clear();
        C1113510f5B c1113510f5B = this.LJII;
        if (c1113510f5B != null) {
            C1109770ez9 c1109770ez9 = c1113510f5B.LJIJI;
            AbstractC1113400f50 abstractC1113400f50LIZJ = c1109770ez9 != null ? c1109770ez9.LIZJ() : null;
            C1113410f51 c1113410f51 = abstractC1113400f50LIZJ instanceof C1113410f51 ? (C1113410f51) abstractC1113400f50LIZJ : null;
            if ((!c1113510f5B.LJIIJ.isEmpty()) && !c1113510f5B.LJIIJJI && c1113410f51 != null) {
                c1113410f51.LJIILIIL(c1113510f5B.LJIIIZ, c1113510f5B.LJIIJ);
                long j = c1113510f5B.LJIIL;
                if (j != 0) {
                    c1113410f51.LJJ.remove(Long.valueOf(j));
                }
                long j2 = c1113510f5B.LJIIL;
                if (j2 != 0) {
                    c1113410f51.LJJIFFI.remove(Long.valueOf(j2));
                }
            }
            long j3 = c1113510f5B.LJIILIIL;
            if (j3 != 0 && !c1113510f5B.LJIILJJIL) {
                if (c1113410f51 != null) {
                    c1113410f51.LJJI.remove(Long.valueOf(j3));
                    long j4 = c1113510f5B.LJIILIIL;
                    if (j4 != 0) {
                        c1113410f51.LJJIFFI.remove(Long.valueOf(j4));
                    }
                }
                if (c1113510f5B.LJIILLIIL.length() > 0 && c1113410f51 != null) {
                    c1113410f51.LJIILIIL(c1113510f5B.LJIILL, Collections.singletonList(c1113510f5B.LJIILLIIL));
                }
            }
            c1113510f5B.LJIIJ = C13BV.INSTANCE;
            c1113510f5B.LJIIJJI = false;
            c1113510f5B.LJIIL = 0L;
            c1113510f5B.LJIILIIL = 0L;
            c1113510f5B.LJIILJJIL = false;
            c1113510f5B.LJIILL = 0L;
            c1113510f5B.LJIILLIIL = "";
            c1113510f5B.LJIIIIZZ.clear();
        }
    }

    public final List<String> LJIIJ() {
        String str;
        if (!LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled() && !LiveMinusOneScreenTipsInFeedSetting.isPhase3TagsAndGuideEnabled()) {
            return this.LJIIIZ.length() > 0 ? Collections.singletonList(this.LJIIIZ) : C13BV.INSTANCE;
        }
        C1113510f5B c1113510f5B = this.LJII;
        if (c1113510f5B == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C1113610f5L> it2 = c1113510f5B.LJFF.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().LIZJ;
            if (str2.length() > 0) {
                arrayList.add(str2);
            }
        }
        for (String str3 : c1113510f5B.LJII) {
            if (str3.length() > 0) {
                arrayList.add(str3);
            }
        }
        Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it3 = c1113510f5B.LJI.iterator();
        while (it3.hasNext()) {
            Text text = it3.next().tagText;
            if (text != null && (str = text.key) != null && str.length() > 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x038f, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    @Override // X.AbstractC1113530f5D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(X.AbstractC1110800f0o<?> r20, java.util.List<java.lang.Object> r21) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113490f59.LJII(X.0f0o, java.util.List):boolean");
    }

    public final void LJIIIZ(C16FS c16fs, boolean z) {
        if (z) {
            c16fs.setTextColor(C20736316Cj.LIZJ(R.attr.eyv, this.LJFF));
            c16fs.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZJ(R.attr.ey7, this.LJFF)));
        } else {
            c16fs.setTextColor(C20736316Cj.LIZJ(R.attr.ezq, this.LJFF));
            c16fs.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZJ(R.attr.ey_, this.LJFF)));
        }
    }

    public final void LJIIJJI(AbstractC1110800f0o abstractC1110800f0o, PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem) {
        Text text;
        String str;
        String str2;
        String str3;
        Text text2;
        Text text3;
        C1113510f5B c1113510f5B = this.LJII;
        String str4 = "";
        if (c1113510f5B != null) {
            if (tagItem == null || (text3 = tagItem.tagText) == null || (str2 = text3.key) == null) {
                str2 = "";
            }
            if (tagItem == null || (text2 = tagItem.tagText) == null || (str3 = text2.key) == null) {
                str3 = "";
            }
            C1113510f5B.LJIIL(c1113510f5B, abstractC1110800f0o, str2, str3, 1, "", "negative_page_fixed_icon", "tag_none_cta", null, C1113510f5B.LJ(abstractC1110800f0o).size(), c1113510f5B.LJI.size(), null, 1152);
        }
        C1113510f5B c1113510f5B2 = this.LJII;
        if (c1113510f5B2 != null) {
            if (tagItem != null && (text = tagItem.tagText) != null && (str = text.key) != null) {
                str4 = str;
            }
            c1113510f5B2.LJII(abstractC1110800f0o, str4, "negative_page_fixed_icon");
        }
    }

    public final void LJIILIIL(AbstractC1110790f0n abstractC1110790f0n, Function0<Unit> function0) {
        if (abstractC1110790f0n.LJIILJJIL.LIZJ != 1) {
            return;
        }
        if (LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
            ((ArrayList) this.LJIIIIZZ).add(function0);
        } else {
            function0.invoke();
        }
    }

    public final void LJIILJJIL(boolean z, AbstractC1110790f0n abstractC1110790f0n) {
        boolean zEnableUIOptimize = LiveExtendedScreenUiOptimizeSetting.INSTANCE.enableUIOptimize(abstractC1110790f0n.LLIIIILZ().LJIIIZ);
        if (z) {
            C786410Ut5.j5(this.LJFF, 1.0f);
            if (zEnableUIOptimize) {
                LJIIIZ(this.LJFF, true);
                return;
            }
            return;
        }
        C786410Ut5.j5(this.LJFF, 0.4f);
        if (!zEnableUIOptimize) {
            return;
        }
        LJIIIZ(this.LJFF, false);
    }

    public C1113490f59(AbstractC1113400f50 abstractC1113400f50, View view, View view2) {
        C1113510f5B c1113510f5B;
        super(view);
        this.LIZJ = abstractC1113400f50;
        this.LIZLLL = (C16F5) view.findViewById(R.id.m44);
        this.LJ = (C16F5) view.findViewById(R.id.yf6);
        this.LJFF = (C16FS) view.findViewById(R.id.d6g);
        this.LJI = view.findViewById(R.id.m4c);
        if (view2 != null && LiveMinusOneScreenTipsInFeedSetting.isPhase3TagsAndGuideEnabled()) {
            c1113510f5B = new C1113510f5B(view2, this);
        } else {
            c1113510f5B = null;
        }
        this.LJII = c1113510f5B;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = "";
    }

    public final void LJIIL(AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2) {
        C1113510f5B c1113510f5B = this.LJII;
        if (c1113510f5B != null && (abstractC1110800f0o instanceof AbstractC1110790f0n) && abstractC1110800f0o != null) {
            c1113510f5B.LJI = list;
            List listLJLIL = C13LP.LJLIL(list2, list);
            if (!((ArrayList) listLJLIL).isEmpty()) {
                c1113510f5B.LJIILJJIL(new AwS146S0400000_17(c1113510f5B, abstractC1110800f0o, listLJLIL, list, 11));
            }
        }
    }
}
