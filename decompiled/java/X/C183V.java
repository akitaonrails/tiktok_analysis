package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LiveTaskCardData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

/* JADX INFO: renamed from: X.183V, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C183V implements C188K {
    public final ViewGroup LL;
    public C183F LLILLJJLI;
    public EnumC994480bzC LLILLL = EnumC994480bzC.HIDE;
    public String LLILZ;
    public String LLILZIL;
    public Animator LLILZLL;
    public C212210182u LLIZ;
    public boolean LLIZLLLIL;
    public LiveTaskCardData LLJ;
    public final C054G LLJI;

    @Override // X.C188K
    public final String LIZ() {
        return "";
    }

    @Override // X.C188K
    public final Integer LIZJ(View view) {
        return null;
    }

    @Override // X.C188K
    public final String LIZLLL() {
        return "";
    }

    @Override // X.C188K
    public final /* bridge */ /* synthetic */ Boolean LJ() {
        return null;
    }

    @Override // X.C188K
    public final void LJI(Context context) {
    }

    @Override // X.C188K
    public final boolean LJII() {
        return false;
    }

    @Override // X.C188K
    public final String LJIIIIZZ() {
        return "";
    }

    @Override // X.C188K
    public final Integer LJIIIZ() {
        return 0;
    }

    @Override // X.C188K
    public final void LJFF() throws JSONException {
        C212210182u c212210182u;
        EnumC994480bzC enumC994480bzC = this.LLILLL;
        if ((enumC994480bzC == EnumC994480bzC.SHOW || enumC994480bzC == EnumC994480bzC.SHOW_ANIM) && (c212210182u = this.LLIZ) != null) {
            c212210182u.LIZIZ("enter_room", LJIIJ());
        }
    }

    public final Map<String, String> LJIIJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LiveTaskCardData liveTaskCardData = this.LLJ;
        if (liveTaskCardData != null) {
            String str = liveTaskCardData.taskId;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("live_task_id", str);
        }
        return linkedHashMap;
    }

    @Override // X.C188K
    public final void destroy() throws JSONException {
        C212210182u c212210182u;
        if (this.LLIZLLLIL) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("has destroyed, repeat useless operation");
            return;
        }
        this.LLIZLLLIL = true;
        C212210182u c212210182u2 = this.LLIZ;
        if (c212210182u2 != null) {
            c212210182u2.LIZJ("quit");
        }
        this.LLILLJJLI = null;
        C2296808zG.LIZJ(this.LLJI, new CancellationException("destroy"));
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.LLILZLL = null;
        EnumC994480bzC enumC994480bzC = this.LLILLL;
        if ((enumC994480bzC == EnumC994480bzC.SHOW || enumC994480bzC == EnumC994480bzC.SHOW_ANIM) && (c212210182u = this.LLIZ) != null) {
            c212210182u.LIZIZ("leave", LJIIJ());
        }
        this.LLILLL = EnumC994480bzC.HIDE;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // X.C188K
    public final boolean isDestroyed() {
        return this.LLIZLLLIL;
    }

    public final void LJIIJJI(EnumC1779100wOi enumC1779100wOi) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C1851090yGp(this, enumC1779100wOi, null), 3);
    }

    public C183V(ViewGroup viewGroup, C188M c188m) {
        this.LL = viewGroup;
        this.LLILLJJLI = c188m;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJI = C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    @Override // X.C188K
    public final void LIZIZ(LiveRoomStruct liveRoomStruct, Context context, boolean z, Map map, String str, long j, boolean z2, boolean z3, Long l, String str2) {
        if (z2) {
            return;
        }
        C23250099c.LIZLLL(this.LLJI, null, null, new C183U(this, liveRoomStruct, context, map, str2, null), 3);
    }
}
