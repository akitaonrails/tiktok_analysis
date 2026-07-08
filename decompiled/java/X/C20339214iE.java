package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20339214iE extends C09AY implements Function0<Keva> {
    public C20339214iE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Keva invoke() {
        return Keva.getRepo("ttlive_preview_repo");
    }
}
