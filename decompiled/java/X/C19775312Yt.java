package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.12Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775312Yt implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C19775312Yt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C19775312Yt c19775312Yt, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        View view2 = (View) c19775312Yt.l0;
        if (view2 != null) {
            view2.setPadding(0, c20244914JjLIZ.LIZIZ, 0, c20244914JjLIZ.LIZLLL);
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C19775312Yt c19775312Yt, View view, C20246014Ju c20246014Ju) {
        if (((C19659811vw) c19775312Yt.l0).getVisibility() == 8) {
            ((C19659811vw) c19775312Yt.l0).LL = null;
            return c20246014Ju;
        }
        if (!new C20246014Ju(c20246014Ju).equals(((C19659811vw) c19775312Yt.l0).LL)) {
            ((C19659811vw) c19775312Yt.l0).LL = new C20246014Ju(c20246014Ju);
            C19659811vw c19659811vw = (C19659811vw) c19775312Yt.l0;
            HandlerHook.viewPost(c19659811vw, c19659811vw.LLILZ);
        }
        return new C20246014Ju(c20246014Ju).LJIIIZ(c20246014Ju.LIZLLL(), 0, c20246014Ju.LJ(), c20246014Ju.LIZJ());
    }
}
