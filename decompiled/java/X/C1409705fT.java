package X;

import android.os.Handler;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.ui.doframe.impl.DefaultDoFrameMessageProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05fT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1409705fT extends C09AY implements Function0<AbstractC20683088j> {
    public C1409705fT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC20683088j invoke() {
        final Handler handler = DoFrameController.LIZLLL;
        return handler == null ? new DefaultDoFrameMessageProcessor() : new AbstractC20683088j(handler) { // from class: X.05fS
        };
    }
}
