package X;

import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982840bgQ implements InterfaceC983700bho {
    public final EnumC983000bgg LIZ;
    public final EnumC962960bAM LIZIZ;
    public final EnumC982850bgR LIZJ;
    public final long LIZLLL;
    public final TimeUnit LJ;
    public long LJFF;
    public final long LJI;
    public final Function1<? super C983460bhQ, Unit> LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final boolean LJIIIZ;
    public C983460bhQ LJIIJ = LJFF();

    @Override // X.InterfaceC983700bho
    public final void LIZ() {
        Function0<Unit> function0 = this.LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC983700bho
    public final boolean LIZIZ() {
        return this.LJFF >= this.LJI;
    }

    public final C983460bhQ LJFF() {
        EnumC983000bgg enumC983000bgg = this.LIZ;
        return new C983460bhQ(enumC983000bgg, this.LIZIZ, this.LIZJ, this.LIZLLL, enumC983000bgg == EnumC983000bgg.COUNT_UP ? this.LJFF : this.LJI - this.LJFF, this.LJ);
    }

    @Override // X.InterfaceC983810bhz
    public final String getName() {
        return this.LIZJ.name();
    }

    @Override // X.InterfaceC983700bho
    public final boolean LIZLLL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC983700bho
    public final void LIZJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zW(CompetitionCountTimeEvent.class, this.LJIIJ);
        }
    }

    @Override // X.InterfaceC983810bhz
    public final void LJ(long j, long j2, TimeUnit timeUnit) {
        this.LJFF += j;
        C983460bhQ c983460bhQLJFF = LJFF();
        this.LJIIJ = c983460bhQLJFF;
        Function1<? super C983460bhQ, Unit> function1 = this.LJII;
        if (function1 != null) {
            function1.invoke(c983460bhQLJFF);
        }
    }

    public C982840bgQ(EnumC983000bgg enumC983000bgg, EnumC962960bAM enumC962960bAM, EnumC982850bgR enumC982850bgR, long j, TimeUnit timeUnit, long j2, long j3, boolean z, Function1<? super C983460bhQ, Unit> function1, Function0<Unit> function0) {
        this.LIZ = EnumC983000bgg.COUNT_DOWN;
        this.LIZIZ = EnumC962960bAM.UNKNOWN;
        this.LIZJ = EnumC982850bgR.COUNT_DOWN;
        this.LJ = TimeUnit.SECONDS;
        this.LIZ = enumC983000bgg;
        this.LIZIZ = enumC962960bAM;
        this.LIZJ = enumC982850bgR;
        this.LIZLLL = j;
        this.LJ = timeUnit;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJIIIZ = z;
        this.LJII = function1;
        this.LJIIIIZZ = function0;
    }
}
