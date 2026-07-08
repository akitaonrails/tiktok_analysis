package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: X.18u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21431718u3 extends AbstractC21434518uV {
    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return Collections.singleton("a");
    }

    @Override // X.AbstractC21434518uV
    public Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        InterfaceC21446318wP interfaceC21446318wPLIZ;
        String str = interfaceC21435018ua.LIZLLL().get("href");
        if (!TextUtils.isEmpty(str) && (interfaceC21446318wPLIZ = ((C21435218uc) c21432118u7.LJFF).LIZ(C21436418uo.class)) != null) {
            c14s7.LIZ(AbstractC20267814Se.LJ, str);
            return interfaceC21446318wPLIZ.LIZ(c21432118u7, c14s7);
        }
        return null;
    }
}
