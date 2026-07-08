package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollDetailAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JRO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRO extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ EmotePollDetailAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRO(EmotePollDetailAssem emotePollDetailAssem) {
        super(2);
        this.LL = emotePollDetailAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C492040JRi c492040JRi;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            EmotePollDetailAssem emotePollDetailAssem = this.LL;
            boolValueOf.booleanValue();
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if (fragmentLJI != null && (fragmentLJI instanceof EmotePollDetailDialog)) {
                EmotePollDetailDialog emotePollDetailDialog = (EmotePollDetailDialog) fragmentLJI;
                C0JRE c0jreHp = emotePollDetailAssem.hp();
                if (c0jreHp != null && (c492040JRi = c0jreHp.LLJILLL) != null) {
                    if (C500260Jjc.LJJIIZ(c492040JRi.LIZ)) {
                        ((C1119170fEJ) emotePollDetailDialog.LLL.getValue()).LIZ(c492040JRi.LIZ);
                        emotePollDetailDialog.RR((C1119170fEJ) emotePollDetailDialog.LLL.getValue());
                    } else {
                        emotePollDetailDialog.RR(null);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
