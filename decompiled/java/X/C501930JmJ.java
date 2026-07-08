package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.assem.SendSpacePostAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501930JmJ extends C09AY implements Function2<UIAssem, SpaceTopicContent, Unit> {
    public final /* synthetic */ SendSpacePostAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501930JmJ(SendSpacePostAssem sendSpacePostAssem) {
        super(2);
        this.LL = sendSpacePostAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SpaceTopicContent spaceTopicContent) {
        C501820Jm8 c501820Jm8;
        C501810Jm7 c501810Jm7;
        SendSpacePostAssem sendSpacePostAssem = this.LL;
        SpaceTopicContent spaceTopicContent2 = null;
        if (sendSpacePostAssem.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(sendSpacePostAssem), "source_default_key", C501810Jm7.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                c501810Jm7 = (C501810Jm7) interfaceC1555100qZQLIZIZ.getSource();
            } else {
                c501810Jm7 = null;
            }
            sendSpacePostAssem.LLJ = c501810Jm7;
        }
        C501810Jm7 c501810Jm72 = sendSpacePostAssem.LLJ;
        if (c501810Jm72 != null && (c501820Jm8 = c501810Jm72.LL) != null) {
            spaceTopicContent2 = c501820Jm8.LIZLLL;
        }
        boolean z = true;
        if (spaceTopicContent2 != null) {
            C16FS c16fs = this.LL.LLJI;
            if (c16fs != null) {
                c16fs.setEnabled(true);
            }
        } else {
            C16FS c16fs2 = this.LL.LLJI;
            if (c16fs2 != null) {
                if (spaceTopicContent == null) {
                    z = false;
                }
                c16fs2.setEnabled(z);
            }
        }
        return Unit.LIZ;
    }
}
