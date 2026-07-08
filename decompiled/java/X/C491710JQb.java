package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.view.assem.EmotePollEditListAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.view.frgment.EmotePollEditDialog;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491710JQb extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ EmotePollEditListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491710JQb(EmotePollEditListAssem emotePollEditListAssem) {
        super(2);
        this.LL = emotePollEditListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        int size;
        ArrayList<Long> arrayList;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            EmotePollEditListAssem emotePollEditListAssem = this.LL;
            boolValueOf.booleanValue();
            emotePollEditListAssem.getClass();
            Fragment fragmentLJI = C724240Sb0.LJI(emotePollEditListAssem);
            if (fragmentLJI != null && (fragmentLJI instanceof EmotePollEditDialog)) {
                LiveSheetFragment liveSheetFragment = (LiveSheetFragment) fragmentLJI;
                Object[] objArr = new Object[2];
                if (emotePollEditListAssem.LLJJIII == null) {
                    C0JQJ c0jqj = null;
                    InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(emotePollEditListAssem), "source_default_key", C0JQJ.class, null);
                    if (interfaceC1555100qZQLIZIZ != null) {
                        c0jqj = (C0JQJ) interfaceC1555100qZQLIZIZ.getSource();
                    }
                    emotePollEditListAssem.LLJJIII = c0jqj;
                }
                C0JQJ c0jqj2 = emotePollEditListAssem.LLJJIII;
                if (c0jqj2 != null && (arrayList = c0jqj2.LLILZ) != null) {
                    size = arrayList.size();
                } else {
                    size = 0;
                }
                objArr[0] = Integer.valueOf(size);
                objArr[1] = 3;
                liveSheetFragment.LLIZ.setTitle(C497740JfY.LJIJJ(2131852074, objArr));
            }
        }
        return Unit.LIZ;
    }
}
