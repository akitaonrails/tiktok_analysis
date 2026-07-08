package X;

import com.bytedance.im.core.client.configs.DbQueryOptConfig;
import com.bytedance.im.core.client.configs.DeferredMigrationConfig;
import com.bytedance.im.core.client.configs.SendMessageRefactorConfig;
import com.bytedance.im.core.client.configs.SessionScopeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YB1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YB1 {
    public final Function0<SessionScopeConfig> LIZ;
    public final C863770XuZ LIZIZ;
    public final Function0<DeferredMigrationConfig> LIZJ;
    public final Function0<DbQueryOptConfig> LIZLLL;
    public final boolean LJ;
    public final Function0<SendMessageRefactorConfig> LJFF;

    public C0YB1(Function0<SessionScopeConfig> function0, C863770XuZ c863770XuZ, Function0<DeferredMigrationConfig> function02, Function0<DbQueryOptConfig> function03, boolean z, Function0<SendMessageRefactorConfig> function04) {
        this.LIZ = function0;
        this.LIZIZ = c863770XuZ;
        this.LIZJ = function02;
        this.LIZLLL = function03;
        this.LJ = z;
        this.LJFF = function04;
    }
}
