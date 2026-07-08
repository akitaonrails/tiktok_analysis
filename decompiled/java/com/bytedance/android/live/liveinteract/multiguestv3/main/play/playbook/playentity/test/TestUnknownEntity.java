package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.test;

import X.AbstractC20356314kz;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20424814w2;
import X.InterfaceC20354714kj;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes32.dex */
public final class TestUnknownEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("test_unknown", 0, 0, 0, null, null, 32760);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        return new C20361314ln("XXX(mock unknown)", "XXX(mock unknown)", R.attr.e11, R.attr.e11, Collections.singletonList("Info: [This is a mock unknown feature]"), null, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LIZIZ(c20361214lm.LIZIZ, null, true);
        }
        LJJLIIIIJ(0);
    }
}
