package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15XE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15XE extends C09AY implements Function0<Keva> {
    public C15XE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepoSync("repo_parental_platform", 0);
    }
}
