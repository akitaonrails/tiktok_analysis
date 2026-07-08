package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373350lqH {
    public C1373370lqJ LIZ;
    public C1373370lqJ LIZIZ;
    public C1373370lqJ LIZJ;
    public C1373370lqJ LIZLLL;
    public C1373370lqJ LJ;
    public C1373370lqJ LJFF;
    public C1373370lqJ LJI;

    public final Map<String, String> LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1373340lqG.LIZIZ(linkedHashMap, this.LIZ, "title", "title_args");
        C1373340lqG.LIZIZ(linkedHashMap, this.LIZIZ, "subtitle", "subtitle_args");
        C1373340lqG.LIZIZ(linkedHashMap, this.LIZJ, "subtitle_plural_count", "");
        C1373340lqG.LIZIZ(linkedHashMap, this.LIZLLL, "sender_preview", "sender_preview_args");
        C1373340lqG.LIZIZ(linkedHashMap, this.LJ, "receiver_preview", "receiver_preview_args");
        C1373340lqG.LIZIZ(linkedHashMap, this.LJFF, "quote_preview", "quote_preview_args");
        C1373340lqG.LIZIZ(linkedHashMap, this.LJI, "push_preview", "push_preview_args");
        return linkedHashMap;
    }

    public C1373350lqH() {
        C1373370lqJ c1373370lqJ = C1373340lqG.LIZ;
        this.LIZ = c1373370lqJ;
        this.LIZIZ = c1373370lqJ;
        this.LIZJ = c1373370lqJ;
        this.LIZLLL = c1373370lqJ;
        this.LJ = c1373370lqJ;
        this.LJFF = c1373370lqJ;
        this.LJI = c1373370lqJ;
    }

    public final void LIZ(String str, List<? extends Object> list) {
        this.LJFF = new C1373370lqJ(str, list);
    }

    public final void LIZIZ(String str, List<? extends Object> list) {
        this.LJ = new C1373370lqJ(str, list);
    }

    public final void LIZJ(String str, List<? extends Object> list) {
        this.LIZLLL = new C1373370lqJ(str, list);
    }
}
