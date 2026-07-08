package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335090kqZ extends C09AY implements Function0<Boolean> {
    public C1335090kqZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        if (C1335190kqj.LIZ().enable) {
            EnumC1335310kqv enumC1335310kqvLIZLLL = C1336210ksN.LIZLLL();
            z = (enumC1335310kqvLIZLLL == EnumC1335310kqv.EXTREME_LOW || enumC1335310kqvLIZLLL == EnumC1335310kqv.ULTRA_LOW || enumC1335310kqvLIZLLL == EnumC1335310kqv.LOW) ? Keva.getRepo("photomode_image_repo_v2").getBoolean("has_used_photomode_disk", false) : true;
        }
        return Boolean.valueOf(z);
    }
}
