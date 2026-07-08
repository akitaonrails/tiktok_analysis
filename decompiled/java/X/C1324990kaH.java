package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.inbox.skylight.template.SkylightTemplateCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0kaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324990kaH extends C09AY implements Function2<View, AccessibilityNodeInfoCompat, Unit> {
    public final /* synthetic */ SkylightTemplateCell LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324990kaH(SkylightTemplateCell skylightTemplateCell, Object obj) {
        super(2);
        this.LL = skylightTemplateCell;
        this.LLILLJJLI = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setContentDescription(this.LL.itemView.getContext().getString(((Number) this.LLILLJJLI).intValue()));
        return Unit.LIZ;
    }
}
