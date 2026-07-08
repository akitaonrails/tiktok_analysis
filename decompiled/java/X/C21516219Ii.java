package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.19Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21516219Ii {
    public static final /* synthetic */ int LJ = 0;
    public final C21516019Ig LIZ;
    public boolean LIZIZ;
    public final C21515719Id LIZJ;
    public float LIZLLL;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.19Ig, java.lang.Object] */
    public C21516219Ii(final View view, final View view2, C21515719Id c21515719Id) {
        this.LIZJ = c21515719Id;
        ?? r2 = new C21515919If() { // from class: X.19Ig
            @Override // X.InterfaceC21515819Ie
            public final void LIZ(int i) {
                C21516219Ii c21516219Ii = this.LIZ;
                View view3 = view;
                View view4 = view2;
                c21516219Ii.getClass();
                C1706630uVp.LIZ("KeyBoardUtils", String.valueOf(i));
                int[] iArr = new int[2];
                view3.getLocationInWindow(iArr);
                int height = iArr[1] + view3.getHeight();
                Rect rect = new Rect();
                view3.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.bottom - height;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("distance bottom: ");
                sbLIZ.append(i2);
                C1706630uVp.LIZ("KeyBoardUtils", C2188811AlT.LIZIZ(sbLIZ));
                C21515719Id c21515719Id2 = c21516219Ii.LIZJ;
                C21516019Ig c21516019Ig = null;
                if (c21515719Id2 == null) {
                    c21515719Id2 = null;
                }
                float f = c21515719Id2.LIZJ - i2;
                float f2 = c21516219Ii.LIZLLL;
                if (f2 + f < 0.0f) {
                    f = 0.0f - f2;
                }
                c21516219Ii.LIZLLL = f2 + f;
                C786410Ut5.ed(view4, view4.getTranslationY() - f);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("translate: ");
                sbLIZ2.append(view4.getTranslationY());
                C1706630uVp.LIZ("KeyBoardUtils", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("offset: ");
                sbLIZ3.append(c21516219Ii.LIZLLL);
                C1706630uVp.LIZ("KeyBoardUtils", C2188811AlT.LIZIZ(sbLIZ3));
                if (Math.abs(c21516219Ii.LIZLLL) < 0.01f && c21516219Ii.LIZIZ) {
                    C1706630uVp.LIZ("KeyBoardUtils", "un observe");
                    C21515719Id c21515719Id3 = c21516219Ii.LIZJ;
                    if (c21515719Id3 == null) {
                        c21515719Id3 = null;
                    }
                    C21516019Ig c21516019Ig2 = c21516219Ii.LIZ;
                    if (c21516019Ig2 != null) {
                        c21516019Ig = c21516019Ig2;
                    }
                    c21515719Id3.LIZLLL.remove(c21516019Ig);
                    c21516219Ii.LIZIZ = false;
                }
            }
        };
        this.LIZ = r2;
        C1706630uVp.LIZ("KeyBoardUtils", "observe");
        c21515719Id.LIZLLL.add((InterfaceC21515819Ie) r2);
    }
}
