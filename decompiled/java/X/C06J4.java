package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.start.view.assem.EmotePollDescriptionAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: renamed from: X.06J4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06J4 extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ EmotePollDescriptionAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06J4(EmotePollDescriptionAssem emotePollDescriptionAssem) {
        super(2);
        this.LL = emotePollDescriptionAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        String str;
        UserEmotePollOptionsResponse.Data data;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            EmotePollDescriptionAssem emotePollDescriptionAssem = this.LL;
            boolValueOf.booleanValue();
            C500260Jjc.LLFFF(uIAssem2.LJJIJL());
            if (emotePollDescriptionAssem.LLJJIII == null) {
                C0JQJ c0jqj = null;
                InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(emotePollDescriptionAssem), "source_default_key", C0JQJ.class, null);
                if (interfaceC1555100qZQLIZIZ != null) {
                    c0jqj = (C0JQJ) interfaceC1555100qZQLIZIZ.getSource();
                }
                emotePollDescriptionAssem.LLJJIII = c0jqj;
            }
            C0JQJ c0jqj2 = emotePollDescriptionAssem.LLJJIII;
            if (c0jqj2 == null || (data = c0jqj2.LLILLL) == null || (str = data.defaultPackageName) == null) {
                str = "";
            }
            TextView textView = emotePollDescriptionAssem.LLJJIJI;
            if (textView != null) {
                textView.setText(C497740JfY.LJIJJ(2131852066, str));
            }
            TextView textView2 = emotePollDescriptionAssem.LLJJIJIIJIL;
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIIL(2131755826, 5, 5));
            }
        }
        return Unit.LIZ;
    }
}
