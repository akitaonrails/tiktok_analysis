package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049900dQa extends AbstractC1050010dQl implements C19JG {
    public String LJII;

    @Override // X.C19JG
    public final void LIZ() {
        C1049700dQG c1049700dQG;
        if ((TextUtils.equals(this.LJII, "complete") || TextUtils.isEmpty(this.LJII)) && (c1049700dQG = this.LIZ) != null) {
            c1049700dQG.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
        }
    }

    @Override // X.C19JG
    public final void LIZIZ() {
        C1049700dQG c1049700dQG;
        if ((TextUtils.equals(this.LJII, "start") || TextUtils.isEmpty(this.LJII)) && (c1049700dQG = this.LIZ) != null) {
            c1049700dQG.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
        }
    }

    public C1049900dQa(Context context) {
        super(context);
    }

    @Override // X.AbstractC1050010dQl
    public final boolean LJ(Object... objArr) {
        C19J8 c19j8LIZLLL;
        Map<String, Object> map = this.LIZLLL;
        if (map != null && map.size() > 0) {
            String strValueOf = String.valueOf(this.LIZLLL.get("name"));
            this.LJII = String.valueOf(this.LIZLLL.get("state"));
            if (TextUtils.isEmpty(strValueOf)) {
                return false;
            }
            C19JH c19jh = this.LIZIZ;
            c19jh.getClass();
            C19JH c19jhLJI = C19JH.LJI(c19jh);
            if (c19jhLJI != null && (c19j8LIZLLL = c19jhLJI.LJ(strValueOf).LIZLLL(strValueOf)) != null) {
                c19j8LIZLLL.LLJ = this;
            }
        }
        return false;
    }
}
