package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0eLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085000eLC extends C1114480f6k {
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final ISendCommentEvent.Sender LJIILJJIL;
    public final Map<String, Object> LJIILL;
    public final C1114670f73 LJIILLIIL;
    public final Long LJIIZILJ;
    public final String LJIJ;

    @Override // X.C1114480f6k
    public final Map<String, Object> LIZ() {
        return this.LJIILL;
    }

    @Override // X.C1114480f6k
    public final String LIZIZ() {
        return this.LJIIJ;
    }

    @Override // X.C1114480f6k
    public final C1114670f73 LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C1114480f6k
    public final int LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // X.C1114480f6k
    public final boolean LJ() {
        return this.LJIIL;
    }

    @Override // X.C1114480f6k
    public final ISendCommentEvent.Sender LJFF() {
        return this.LJIILJJIL;
    }

    @Override // X.C1114480f6k
    public final String LJI() {
        return this.LJIIJJI;
    }

    public C1085000eLC(String str, String str2, String str3, boolean z, int i, ISendCommentEvent.Sender sender, Map<String, ? extends Object> map, C1114670f73 c1114670f73, Long l, String str4) {
        super(str2, str3, z, i, sender, map);
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIJJI = str3;
        this.LJIIL = z;
        this.LJIILIIL = i;
        this.LJIILJJIL = sender;
        this.LJIILL = map;
        this.LJIILLIIL = c1114670f73;
        this.LJIIZILJ = l;
        this.LJIJ = str4;
    }
}
