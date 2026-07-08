package X;

import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592180rXE extends C09AY implements InterfaceC1685420txc<Boolean, Pair<? extends Integer, ? extends Integer>, String, String, C0NLT, Unit> {
    public final /* synthetic */ C1592940rYS LL;
    public final /* synthetic */ C592330NLb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592180rXE(C1592940rYS c1592940rYS, C592330NLb c592330NLb) {
        super(5);
        this.LL = c1592940rYS;
        this.LLILLJJLI = c592330NLb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1685420txc
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Pair<? extends Integer, ? extends Integer> pair, String str, String str2, C0NLT c0nlt) {
        boolean zBooleanValue = bool.booleanValue();
        Pair<? extends Integer, ? extends Integer> pair2 = pair;
        String str3 = str;
        String str4 = str2;
        C0NLT c0nlt2 = c0nlt;
        if (!zBooleanValue) {
            this.LL.LJJII();
        } else {
            ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
            if (iTabIconService != 0 && iTabIconService.LJ(this.LLILLJJLI.LJFF, pair2)) {
                ImageView tabIcon = this.LL.LL.getTabIcon();
                if (tabIcon != null) {
                    C786410Ut5.LJZI(8, tabIcon);
                }
                SmartImageView customIconViewV2 = this.LL.LL.getCustomIconViewV2();
                if (customIconViewV2 != null) {
                    C786410Ut5.LLFF(0, customIconViewV2);
                }
            } else {
                this.LL.LJJII();
                str4 = "icon_size_invalid";
                zBooleanValue = false;
            }
        }
        ITabIconService iTabIconService2 = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService2 != null) {
            iTabIconService2.LIZIZ(this.LLILLJJLI, c0nlt2, str3, zBooleanValue, str4);
        }
        return Unit.LIZ;
    }
}
