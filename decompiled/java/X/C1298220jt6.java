package X;

import android.graphics.RectF;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298220jt6 {
    public final int LIZ;
    public final WeakReference<C1298340jtI> LIZIZ;
    public final LynxBaseUI LIZJ;
    public final LynxBaseUI LIZLLL;
    public LynxBaseUI LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final ArrayList<Float> LJIIIZ;
    public final float LJIIJ;
    public boolean LJIIJJI;
    public final ArrayList<C1298230jt7> LJIIL;
    public final boolean LJIILIIL;

    public final s LIZIZ() {
        C1298340jtI c1298340jtI = this.LIZIZ.get();
        if (c1298340jtI != null) {
            return c1298340jtI.LJIIL();
        }
        LynxLog.e("LynxIntersectionObserver", "getContext failed because mManager is null");
        return null;
    }

    public final RectF LIZJ() {
        RectF rectF = new RectF();
        C1298340jtI c1298340jtI = this.LIZIZ.get();
        if (c1298340jtI == null) {
            return rectF;
        }
        LynxBaseUI lynxBaseUI = this.LJ;
        RectF rectFLIZLLL = lynxBaseUI != null ? c1298340jtI.LIZLLL(lynxBaseUI) : this.LJIIJJI ? c1298340jtI.LJI(LIZIZ()) : c1298340jtI.LIZLLL(c1298340jtI.LJIIL().LLJILJILJ);
        rectFLIZLLL.left -= this.LJFF;
        rectFLIZLLL.right += this.LJI;
        rectFLIZLLL.top -= this.LJII;
        rectFLIZLLL.bottom += this.LJIIIIZZ;
        return rectFLIZLLL;
    }

    public final C1311720kEs LIZLLL() {
        s sVarLIZIZ = LIZIZ();
        if (sVarLIZIZ != null) {
            return sVarLIZIZ.LJIILIIL();
        }
        LynxLog.e("LynxIntersectionObserver", "getRootUIOwner failed because context is null");
        return null;
    }

    public final void LJ(ReadableMap readableMap) {
        this.LJFF = C1312920kGo.LIZ(readableMap.getString("left", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJI = C1312920kGo.LIZ(readableMap.getString("right", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJII = C1312920kGo.LIZ(readableMap.getString("top", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJIIIIZZ = C1312920kGo.LIZ(readableMap.getString("bottom", CardStruct.IStatusCode.DEFAULT), 0.0f);
    }

    public C1298220jt6(C1298340jtI c1298340jtI, ReadableMap readableMap, LynxBaseUI lynxBaseUI) {
        this(c1298340jtI, -1, "-1", readableMap);
        this.LIZJ = lynxBaseUI;
        String string = readableMap.getString("relativeToIdSelector", null);
        this.LJIIJJI = readableMap.getBoolean("relativeToScreen", false);
        this.LJFF = C1312920kGo.LIZ(readableMap.getString("marginLeft", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJI = C1312920kGo.LIZ(readableMap.getString("marginRight", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJII = C1312920kGo.LIZ(readableMap.getString("marginTop", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJIIIIZZ = C1312920kGo.LIZ(readableMap.getString("marginBottom", CardStruct.IStatusCode.DEFAULT), 0.0f);
        if (string != null && string.startsWith("#")) {
            C1311720kEs c1311720kEsLJIILIIL = this.LIZIZ.get().LJIIL().LJIILIIL();
            String strSubstring = string.substring(1);
            c1311720kEsLJIILIIL.getClass();
            this.LJ = C1311720kEs.LJIILJJIL(strSubstring, lynxBaseUI);
        }
        this.LJIILIIL = true;
        C1298230jt7 c1298230jt7 = new C1298230jt7();
        c1298230jt7.LIZ = lynxBaseUI;
        this.LJIIL.add(c1298230jt7);
        LIZ(c1298230jt7, LIZJ(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ba A[EDGE_INSN: B:107:0x00ba->B:44:0x00ba BREAK  A[LOOP:0: B:20:0x004f->B:112:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ba A[EDGE_INSN: B:108:0x00ba->B:44:0x00ba BREAK  A[LOOP:0: B:20:0x004f->B:112:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[LOOP:0: B:20:0x004f->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[PHI: r12 r14
      0x0098: PHI (r12v5 android.graphics.RectF) = (r12v3 android.graphics.RectF), (r12v7 android.graphics.RectF) binds: [B:40:0x00ae, B:31:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r14v4 boolean) = (r14v3 boolean), (r14v5 boolean) binds: [B:40:0x00ae, B:31:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2 A[EDGE_INSN: B:110:0x00e2->B:50:0x00e2 BREAK  A[LOOP:0: B:20:0x004f->B:112:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1298230jt7 r21, android.graphics.RectF r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1298220jt6.LIZ(X.0jt7, android.graphics.RectF, boolean):void");
    }

    public C1298220jt6(C1298340jtI c1298340jtI, int i, String str, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUILJIIJJI;
        WeakReference<C1298340jtI> weakReference = new WeakReference<>(c1298340jtI);
        this.LIZIZ = weakReference;
        this.LIZ = i;
        if ("-1".equals(str)) {
            this.LIZLLL = weakReference.get().LJIIL().LLJILJILJ;
        } else {
            C1311720kEs c1311720kEs = weakReference.get().LJIIL().LLJJ.get();
            if (c1311720kEs != null) {
                lynxBaseUILJIIJJI = c1311720kEs.LJIIJJI(str);
            } else {
                lynxBaseUILJIIJJI = null;
            }
            this.LIZLLL = lynxBaseUILJIIJJI;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        this.LJIIIZ = arrayList;
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i2 = 0; i2 < array.size(); i2++) {
                this.LJIIIZ.add(Float.valueOf((float) array.getDouble(i2)));
            }
        } else {
            arrayList.add(Float.valueOf(0.0f));
        }
        this.LJIIJ = (float) readableMap.getDouble("initialRatio", 0.0d);
        readableMap.getBoolean("observeAll", false);
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = false;
    }
}
