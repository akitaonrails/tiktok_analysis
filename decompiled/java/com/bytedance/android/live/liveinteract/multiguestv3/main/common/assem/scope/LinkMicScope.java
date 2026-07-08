package com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope;

import X.C1338270kvh;
import X.C1558360qeg;
import X.C946803n0;
import X.ViewOnAttachStateChangeListenerC1555570qaB;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicScope extends ViewOnAttachStateChangeListenerC1555570qaB {
    public final String LLIZLLLIL;

    @Override // X.ViewOnAttachStateChangeListenerC1555570qaB, X.InterfaceC665370Q7z
    public final String getKey() {
        return this.LLIZLLLIL;
    }

    public LinkMicScope(View view) {
        super(view);
        this.LLIZLLLIL = "link_mic_scope";
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null) {
            getTree().LIZIZ(C1558360qeg.LJFF(fragmentLIZ, "linkMicScope"));
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }
}
