package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110530f0N {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public User LIZLLL;
    public String LJ;
    public final String LJFF;
    public final List<EmoteWithIndex> LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public String LJIIIZ;
    public ISendCommentEvent.Sender LJIIJ;
    public EmoteModel LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public final JSONObject LJIILJJIL;
    public final String LJIILL;
    public String LJIILLIIL;
    public boolean LJIIZILJ;

    public C1110530f0N() {
        this(0, "");
    }

    public C1110530f0N(int i, String str) {
        this(i, str, "", false);
    }

    public C1110530f0N(int i, String str, String str2, boolean z) {
        this.LJIIIIZZ = true;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LJII = str2;
        this.LIZJ = z;
    }

    public C1110530f0N(int i, String str, String str2, String str3, List list) {
        this.LJIIIIZZ = true;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LJII = str2;
        this.LIZJ = false;
        this.LJFF = str3;
        this.LJI = list;
    }

    public C1110530f0N(int i, String str, String str2, String str3, JSONObject jSONObject) {
        this.LJIIIIZZ = true;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LJII = str2;
        this.LIZJ = false;
        this.LJIILJJIL = jSONObject;
        this.LJIILL = str3;
    }

    public C1110530f0N(String str, String str2, JSONObject jSONObject, List list, int i) {
        this.LJIIIIZZ = true;
        this.LIZ = i;
        this.LJFF = str;
        this.LJII = str2;
        this.LIZJ = false;
        this.LJIILJJIL = jSONObject;
        this.LJI = list;
    }
}
