package X;

import android.content.Context;
import android.util.Pair;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0m57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1382550m57 extends AbstractC21169117sn {
    public final Aweme LJFF;
    public final String LJI;
    public final String LJII;
    public final Pair<Boolean, List<String>> LJIIIIZZ;
    public final String LJIIIZ;

    public void LJ() {
    }

    public boolean LJFF() {
        return false;
    }

    public boolean LJI() {
        return false;
    }

    public boolean LJII() {
        return false;
    }

    public abstract boolean LJIIIIZZ();

    public abstract boolean LJIIIZ();

    public abstract boolean LJIIJ();

    public Pair<Boolean, List<String>> LIZJ() {
        return this.LJIIIIZZ;
    }

    public String LIZLLL() {
        return this.LJIIIZ;
    }

    public AbstractC1382550m57(Context context, String str, int i, InterfaceC21168717sj interfaceC21168717sj, Aweme aweme, String str2, String str3) {
        super(context, str, i, interfaceC21168717sj);
        this.LJFF = aweme;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = new Pair<>(Boolean.FALSE, C13BV.INSTANCE);
        this.LJIIIZ = "";
    }
}
