package X;

import Y.ACListenerS165S0100000_31;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItemDisplay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20695315yZ extends C20696315yj {
    public final PushItem LLILZIL;
    public final InterfaceC1245230iVd LLILZLL;
    public final ACListenerS165S0100000_31 LLIZ = new ACListenerS165S0100000_31(this, 9);

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        C20695015yW c20695015yW = new C20695015yW(this.LLILZIL.itemId);
        boolean z = c20695015yW.LIZIZ && c20695015yW.LIZJ;
        PushItemDisplay pushItemDisplay = this.LLILZIL.display;
        String str = pushItemDisplay.title;
        C419910GdJ c419910GdJLIZJ = pushItemDisplay.LIZ() ? C824420WVs.LIZJ(this.LLILZIL.display.icon) : null;
        String str2 = this.LLILZIL.display.description;
        ACListenerS165S0100000_31 aCListenerS165S0100000_31 = this.LLIZ;
        HashMap<String, Map<String, Integer>> map = C19296910eV.LIZ;
        ACListenerS165S0100000_31 aCListenerS165S0100000_312 = (map.isEmpty() || !map.containsKey(this.LLILZIL.itemId) || C19296910eV.LIZ(this.LLILZIL, false, 6)) ? this.LLIZ : null;
        boolean zLIZ = C19296910eV.LIZ(this.LLILZIL, false, 6);
        C19279610bi c19279610bi = C19279610bi.LIZ;
        PushItem pushItem = this.LLILZIL;
        c19279610bi.getClass();
        return new C19319810iC(z, str, aCListenerS165S0100000_31, C19279610bi.LIZ(pushItem), c20695015yW, aCListenerS165S0100000_312, c419910GdJLIZJ, str2, zLIZ, false, false, null, 127632);
    }

    public C20695315yZ(PushItem pushItem, C1245210iVb c1245210iVb) {
        this.LLILZIL = pushItem;
        this.LLILZLL = c1245210iVb;
    }
}
