package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC497830Jfh implements InterfaceC955780aym {
    public long LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public final Map<Long, Long> LIZLLL;
    public String LJ;
    public String LJFF;
    public long LJI;
    public String LJII;
    public String LJIIIIZZ;

    @Override // X.InterfaceC955780aym
    public final void LJJZZIII() {
    }

    @Override // X.InterfaceC955780aym
    public final C497860Jfk LJIIJJI() {
        C497860Jfk c497860Jfk = new C497860Jfk();
        c497860Jfk.LIZ = this.LIZ;
        c497860Jfk.LIZIZ = this.LIZJ;
        c497860Jfk.LIZJ = 0;
        c497860Jfk.LIZLLL = "anchor";
        c497860Jfk.LJ = "theme";
        c497860Jfk.LJFF = CardStruct.IStatusCode.DEFAULT;
        return c497860Jfk;
    }

    public AbstractC497830Jfh() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initialChannelId=");
        sbLIZ.append(0L);
        C20441214yg.LJIIIZ("MultiHostDataHolderCommonImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = new HashMap();
        this.LJ = "";
        this.LJFF = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        new LinkedHashMap();
    }

    @Override // X.InterfaceC955780aym
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC955780aym
    public final String LJIJJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC955780aym
    public final String LJJIJIIJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC955780aym
    public final String LJJL() {
        return this.LJ;
    }

    @Override // X.InterfaceC955780aym
    public final String LLIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC955780aym
    public final long LLJJJIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC955780aym
    public final Map<Long, Long> LLJJL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC955780aym
    public final long getBattleId() {
        return this.LJI;
    }

    @Override // X.InterfaceC955780aym
    public final long getChannelId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC955780aym
    public final void LJ(String str) {
        this.LJII = str;
        this.LJIIIIZZ = "";
    }

    @Override // X.InterfaceC955780aym
    public final void LJJIIZ(String str) {
        this.LJFF = str;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJJJ(String str) {
        this.LJIIIIZZ = str;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJJZ(long j) {
        this.LIZJ = j;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJJLL(long j) {
        this.LJI = j;
    }

    @Override // X.InterfaceC955780aym
    public final void LJJLL(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC955780aym
    public void LLLI(boolean z) {
        this.LIZIZ = z;
        C497700JfU.LIZ.LIZJ(z, EnumC768840UDy.CO_HOST);
    }

    @Override // X.InterfaceC955780aym
    public final void LLLIIII(long j) {
        this.LIZ = j;
    }

    public void LLLIIIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiHostDataHolderCommonImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = 0L;
        this.LIZIZ = false;
        this.LIZJ = 0L;
        ((HashMap) this.LIZLLL).clear();
        this.LJ = "";
        this.LJFF = "";
        this.LJI = 0L;
        this.LJII = "";
        this.LJIIIIZZ = "";
    }
}
