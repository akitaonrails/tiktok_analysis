package X;

import com.bytedance.android.live.setting.LiveMinusOneScreenTagsEventOptSetting;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS22S0600000_17;

/* JADX INFO: renamed from: X.0f5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113500f5A extends C09AY implements Function1<List<? extends Integer>, Unit> {
    public final /* synthetic */ List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> LL;
    public final /* synthetic */ C1113510f5B LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1113410f51 LLILZ;
    public final /* synthetic */ AbstractC1110790f0n LLILZIL;
    public final /* synthetic */ C1109770ez9 LLILZLL;
    public final /* synthetic */ List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> LLIZ;
    public final /* synthetic */ Map<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113500f5A(List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list, C1113510f5B c1113510f5B, boolean z, C1113410f51 c1113410f51, AbstractC1110790f0n abstractC1110790f0n, C1109770ez9 c1109770ez9, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list2, Map<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, String> map) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c1113510f5B;
        this.LLILLL = z;
        this.LLILZ = c1113410f51;
        this.LLILZIL = abstractC1110790f0n;
        this.LLILZLL = c1109770ez9;
        this.LLIZ = list2;
        this.LLIZLLLIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Integer> list) {
        AbstractC1110790f0n abstractC1110790f0n;
        String str;
        List<? extends Integer> list2 = list;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list3 = this.LL;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (PublicAreaMessageCommon.CreatorSuccessInfo.TagItem tagItem : list3) {
            int i2 = i + 1;
            if (i >= 0) {
                if (!list2.contains(Integer.valueOf(i))) {
                    arrayList.add(tagItem);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLILLJJLI.getClass();
        C1113510f5B.LJI(arrayList);
        if (!this.LLILLL && this.LLILZ != null && (abstractC1110790f0n = this.LLILZIL) != null) {
            long jLLIIJI = abstractC1110790f0n.LLIIJI();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Text text = ((PublicAreaMessageCommon.CreatorSuccessInfo.TagItem) it2.next()).tagText;
                if (text != null && (str = text.key) != null) {
                    arrayList2.add(str);
                }
            }
            List<String> list4 = this.LLILLJJLI.LJIIJ;
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : list4) {
                if (!arrayList2.contains(str2)) {
                    arrayList3.add(str2);
                }
            }
            C1113510f5B c1113510f5B = this.LLILLJJLI;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!c1113510f5B.LJIIJ.contains(obj)) {
                    arrayList4.add(obj);
                }
            }
            this.LLILZ.LJIILIIL(jLLIIJI, arrayList3);
            C1113410f51 c1113410f51 = this.LLILZ;
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                c1113410f51.LJIIL(jLLIIJI, (String) it3.next());
            }
            this.LLILLJJLI.LJIIJ = arrayList2;
        }
        AbstractC1110790f0n abstractC1110790f0n2 = this.LLILZIL;
        if (abstractC1110790f0n2 != null && abstractC1110790f0n2.LJIILJJIL.LIZJ == 1) {
            AwS22S0600000_17 awS22S0600000_17 = new AwS22S0600000_17(this.LLILLJJLI, (C1113510f5B) abstractC1110790f0n2, (AbstractC1110790f0n) this.LLIZ, this.LL, (List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem>) list2, (List<Integer>) this.LLIZLLLIL, (Map<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, String>) 2);
            if (LiveMinusOneScreenTagsEventOptSetting.INSTANCE.getValue()) {
                this.LLILLJJLI.LIZLLL("inline_log", awS22S0600000_17);
                this.LLILLJJLI.LJIILL(this.LLILZLL);
            } else {
                awS22S0600000_17.invoke();
            }
        }
        return Unit.LIZ;
    }
}
