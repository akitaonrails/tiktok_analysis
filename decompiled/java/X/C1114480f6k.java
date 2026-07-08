package X;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0f6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1114480f6k implements ISendCommentEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final ISendCommentEvent.Sender LJ;
    public final Map<String, Object> LJFF;
    public final String LJI;
    public final C520890Kbn LJII;
    public final C1114670f73 LJIIIIZZ;

    public Map<String, Object> LIZ() {
        return this.LJFF;
    }

    public String LIZIZ() {
        return this.LIZ;
    }

    public C1114670f73 LIZJ() {
        return this.LJIIIIZZ;
    }

    public int LIZLLL() {
        return this.LIZLLL;
    }

    public boolean LJ() {
        return this.LIZJ;
    }

    public ISendCommentEvent.Sender LJFF() {
        return this.LJ;
    }

    public String LJI() {
        return this.LIZIZ;
    }

    public /* synthetic */ C1114480f6k(String str, String str2, boolean z, int i, ISendCommentEvent.Sender sender, Map map) {
        this(str, str2, z, i, sender, map, null, null, null);
    }

    public C1114480f6k(String str, String str2, boolean z, int i, ISendCommentEvent.Sender sender, Map<String, ? extends Object> map, String str3, C520890Kbn c520890Kbn, C1114670f73 c1114670f73) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = sender;
        this.LJFF = map;
        this.LJI = str3;
        this.LJII = c520890Kbn;
        this.LJIIIIZZ = c1114670f73;
    }
}
