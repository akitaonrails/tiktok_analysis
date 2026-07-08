package X;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305040k46 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1305050k47 LL;
    public final /* synthetic */ C1337700kum LLILLJJLI;
    public final /* synthetic */ C1337720kuo LLILLL;
    public final /* synthetic */ DataSource LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1305040k46(C1305050k47 c1305050k47, C1337700kum c1337700kum, C1337720kuo c1337720kuo, DataSource dataSource) {
        super(0);
        this.LL = c1305050k47;
        this.LLILLJJLI = c1337700kum;
        this.LLILLL = c1337720kuo;
        this.LLILZ = dataSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IMediaPlayer defaultSystemPlayer;
        C1305050k47 c1305050k47 = this.LL;
        ComponentActivity componentActivity = this.LLILLJJLI.LIZ;
        C1337720kuo c1337720kuo = this.LLILLL;
        c1305050k47.LIZ();
        Context contextN3 = C786410Ut5.N3(componentActivity);
        if (contextN3 == null) {
            contextN3 = componentActivity;
        }
        Configuration configuration = new Configuration();
        configuration.setContext(contextN3);
        configuration.setLifecycleOwner(componentActivity);
        configuration.setAlphaVideoViewType(1);
        try {
            defaultSystemPlayer = new C1470090oMJ(contextN3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            defaultSystemPlayer = new DefaultSystemPlayer();
        }
        PlayerController playerController = PlayerController.get(configuration, defaultSystemPlayer);
        c1305050k47.LL = playerController;
        if (playerController != null) {
            playerController.withVideoAction(c1337720kuo);
        }
        C1305050k47 c1305050k472 = this.LL;
        PlayerController playerController2 = c1305050k472.LL;
        if (playerController2 != null) {
            playerController2.attachAlphaView(c1305050k472);
        }
        C1305050k47 c1305050k473 = this.LL;
        DataSource dataSource = this.LLILZ;
        PlayerController playerController3 = c1305050k473.LL;
        if (playerController3 != null) {
            playerController3.start(dataSource);
        }
        return Unit.LIZ;
    }
}
