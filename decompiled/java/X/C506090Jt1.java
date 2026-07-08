package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506090Jt1 extends C09AY implements Function2<UIAssem, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ TextView LL;
    public final /* synthetic */ SpaceFeedTitleAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506090Jt1(TextView textView, SpaceFeedTitleAssem spaceFeedTitleAssem) {
        super(2);
        this.LL = textView;
        this.LLILLJJLI = spaceFeedTitleAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Integer> c291001Au) {
        C504510JqT c504510JqTGo;
        String str;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            int iIntValue = ((Number) c291001Au2.LIZ).intValue();
            TextView textView = this.LL;
            SpaceFeedTitleAssem spaceFeedTitleAssem = this.LLILLJJLI;
            if (iIntValue != 0) {
                C786410Ut5.LLIL(textView, 0);
            } else {
                C504510JqT c504510JqTGo2 = spaceFeedTitleAssem.Go();
                if (c504510JqTGo2 != null && !c504510JqTGo2.LLJILLL && (c504510JqTGo = spaceFeedTitleAssem.Go()) != null && (str = c504510JqTGo.LLJJL) != null && str.length() == 0) {
                    C786410Ut5.LLIL(textView, 8);
                }
            }
        }
        return Unit.LIZ;
    }
}
