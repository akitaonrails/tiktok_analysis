package X;

import android.graphics.Rect;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298170jt1 {
    public final WeakReference<C1298370jtL> LIZ;
    public final SDUIBaseUI LIZIZ;
    public final SDUIBaseUI LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final ArrayList<Float> LJII;
    public final float LJIIIIZZ;
    public final ArrayList<C1298190jt3> LJIIIZ;
    public final boolean LJIIJ;

    public final Rect LIZIZ() {
        SDUIBaseUI sDUIBaseUI = this.LIZJ;
        Rect rectLJIILIIL = sDUIBaseUI != null ? sDUIBaseUI.LJIILIIL() : this.LIZ.get().LIZIZ().LLILZIL.LJIILIIL();
        rectLJIILIIL.left = (int) (rectLJIILIIL.left - this.LIZLLL);
        rectLJIILIIL.right = (int) (rectLJIILIIL.right + this.LJ);
        rectLJIILIIL.top = (int) (rectLJIILIIL.top - this.LJFF);
        rectLJIILIIL.bottom = (int) (rectLJIILIIL.bottom + this.LJI);
        return rectLJIILIIL;
    }

    public C1298170jt1(C1298370jtL c1298370jtL, ReadableMap readableMap, SDUIBaseUI sDUIBaseUI) {
        WeakReference<C1298370jtL> weakReference = new WeakReference<>(c1298370jtL);
        this.LIZ = weakReference;
        weakReference.get().LIZIZ();
        ArrayList<Float> arrayList = new ArrayList<>();
        this.LJII = arrayList;
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i = 0; i < array.size(); i++) {
                this.LJII.add(Float.valueOf((float) array.getDouble(i)));
            }
        } else {
            arrayList.add(Float.valueOf(0.0f));
        }
        this.LJIIIIZZ = (float) readableMap.getDouble("initialRatio", 0.0d);
        readableMap.getBoolean("observeAll", false);
        ArrayList<C1298190jt3> arrayList2 = new ArrayList<>();
        this.LJIIIZ = arrayList2;
        this.LJIIJ = false;
        this.LIZIZ = sDUIBaseUI;
        String string = readableMap.getString("relativeToIdSelector", null);
        this.LIZLLL = C1312930kGp.LIZ(readableMap.getString("marginLeft", CardStruct.IStatusCode.DEFAULT));
        this.LJ = C1312930kGp.LIZ(readableMap.getString("marginRight", CardStruct.IStatusCode.DEFAULT));
        this.LJFF = C1312930kGp.LIZ(readableMap.getString("marginTop", CardStruct.IStatusCode.DEFAULT));
        this.LJI = C1312930kGp.LIZ(readableMap.getString("marginBottom", CardStruct.IStatusCode.DEFAULT));
        if (string != null && string.startsWith("#")) {
            C1313470kHh c1313470kHhLIZIZ = this.LIZ.get().LIZIZ().LIZIZ();
            String strSubstring = string.substring(1);
            c1313470kHhLIZIZ.getClass();
            this.LIZJ = C1313470kHh.LJ(strSubstring, sDUIBaseUI);
        }
        this.LJIIJ = true;
        C1298190jt3 c1298190jt3 = new C1298190jt3();
        c1298190jt3.LIZ = sDUIBaseUI;
        arrayList2.add(c1298190jt3);
        LIZ(c1298190jt3, LIZIZ(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[PHI: r11 r12
      0x00a2: PHI (r11v3 android.graphics.Rect) = (r11v1 android.graphics.Rect), (r11v5 android.graphics.Rect) binds: [B:32:0x00b2, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r12v3 boolean) = (r12v2 boolean), (r12v4 boolean) binds: [B:32:0x00b2, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b6 A[EDGE_INSN: B:87:0x00b6->B:35:0x00b6 BREAK  A[LOOP:0: B:17:0x0060->B:92:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b6 A[EDGE_INSN: B:91:0x00b6->B:35:0x00b6 BREAK  A[LOOP:0: B:17:0x0060->B:92:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[LOOP:0: B:17:0x0060->B:92:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1298190jt3 r14, android.graphics.Rect r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1298170jt1.LIZ(X.0jt3, android.graphics.Rect, boolean):void");
    }
}
