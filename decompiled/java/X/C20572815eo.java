package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20572815eo extends C09AY implements Function1<C1166730gT1, C1166730gT1> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ HiddenItem LLILLJJLI;
    public final /* synthetic */ HideAccountViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC1392960mLu LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20572815eo(int i, HiddenItem hiddenItem, HideAccountViewModel hideAccountViewModel, String str, EnumC1392960mLu enumC1392960mLu, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = hiddenItem;
        this.LLILLL = hideAccountViewModel;
        this.LLILZ = str;
        this.LLILZIL = enumC1392960mLu;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1166730gT1 invoke(C1166730gT1 c1166730gT1) {
        C1166730gT1 c1166730gT12 = c1166730gT1;
        ArrayList arrayList = new ArrayList(c1166730gT12.LL);
        int i = this.LL;
        HiddenItem hiddenItem = (HiddenItem) ListProtector.get(arrayList, i);
        ListProtector.set(arrayList, i, hiddenItem.copy(hiddenItem.user, hiddenItem.hideStatus, this.LLILLJJLI.generateMuteStatus()));
        return C1166730gT1.LIZ(c1166730gT12, arrayList, null, null, new C291001Au(this.LLILLL.wQ2(this.LLILZIL, this.LLILZ, this.LLILZLL)), 6);
    }
}
