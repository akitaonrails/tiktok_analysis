package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem.SendSpacePostAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501940JmK extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SendSpacePostAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501940JmK(SendSpacePostAssem sendSpacePostAssem) {
        super(2);
        this.LL = sendSpacePostAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C501820Jm8 c501820Jm8;
        SpaceTopicCategory spaceTopicCategory;
        C16FS c16fs;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            SendSpacePostAssem sendSpacePostAssem = this.LL;
            boolValueOf.booleanValue();
            C501810Jm7 c501810Jm7XQ2 = sendSpacePostAssem.Go().xQ2();
            boolean z = true;
            if (c501810Jm7XQ2 != null && (c501820Jm8 = c501810Jm7XQ2.LL) != null && (spaceTopicCategory = c501820Jm8.LIZIZ) != null && spaceTopicCategory.topicCategoryId == -1211 && (c16fs = sendSpacePostAssem.LLJI) != null) {
                if (sendSpacePostAssem.Go().wQ2() == null) {
                    z = false;
                }
                c16fs.setEnabled(z);
            }
        }
        return Unit.LIZ;
    }
}
