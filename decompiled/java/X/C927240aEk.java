package X;

import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0aEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927240aEk implements InterfaceC928200aGI {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;
    public String LJ;

    public C927240aEk() {
        throw null;
    }

    public final void LIZ() {
        String str = this.LJ;
        if (str != null) {
            this.LIZJ.put(this.LIZLLL, str);
        }
        InterfaceC927230aEj interfaceC927230aEjYd2 = ((ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class)).yd2();
        if (interfaceC927230aEjYd2 != null) {
            interfaceC927230aEjYd2.LIZIZ(this);
        }
    }

    public C927240aEk(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = linkedHashMap;
        this.LIZLLL = "r_target";
    }
}
