package X;

import Y.ARunnableS121S0100000_21;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356000lOI {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public boolean LIZLLL;
    public Aweme LJ;
    public int LJII;
    public long LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public boolean LIZJ = true;
    public String LJFF = "";
    public String LJI = "";

    public final void LIZ() {
        if (this.LIZJ && this.LIZLLL && !C1906580ziK.LJI()) {
            long j = this.LJIIIIZZ;
            Aweme aweme = this.LJ;
            if (aweme == null || C0HXG.LIZ(aweme) != 1 || j / ((long) LSPassThroughRecordSizeConfig.DEFAULT) > C1823607Cg.LIZ()) {
                this.LIZJ = false;
                C823050WQl.LIZIZ().execute(new ARunnableS121S0100000_21(this, 150));
            }
        }
    }

    public C1356000lOI(AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212) {
        this.LIZ = awS565S0100000_21;
        this.LIZIZ = awS565S0100000_212;
    }
}
