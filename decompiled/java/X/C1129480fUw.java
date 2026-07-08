package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0fUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129480fUw extends C0DXR {
    public final RecyclerView LL;
    public final C01AG LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 649));
    public final C01GW LLILZIL = C292401Bi.LIZ(AFwS192S0000000_6.get$arr$(609));
    public final C01GW LLILZLL = C292401Bi.LIZ(AFwS192S0000000_6.get$arr$(610));
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public IntRange LLJI;
    public final Map<Integer, Float> LLJIJIL;
    public final C01GW LLJILJIL;

    public C1129480fUw(RunnableC781530UlD runnableC781530UlD, C01AG c01ag) {
        this.LL = runnableC781530UlD;
        this.LLILLJJLI = c01ag;
        int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
        this.LLIZ = iLIZIZ;
        this.LLIZLLLIL = iLIZIZ;
        this.LLJ = (int) C497740JfY.LIZIZ(8.0f);
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 648));
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[EDGE_INSN: B:157:0x0033->B:15:0x0033 BREAK  A[LOOP:0: B:9:0x001b->B:69:0x0108], PHI: r9
      0x0033: PHI (r9v12 int) = (r9v0 int), (r9v14 int) binds: [B:71:0x010d, B:157:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111 A[PHI: r9
      0x0111: PHI (r9v1 int) = (r9v0 int), (r9v12 int), (r9v12 int) binds: [B:71:0x010d, B:16:0x0035, B:160:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    @Override // X.C0DXR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.graphics.Canvas r18, androidx.recyclerview.widget.RecyclerView r19, X.C21673919s1 r20) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1129480fUw.LIZJ(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C1126990fQv c1126990fQv;
        int iNextIndex;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter instanceof C1127050fR1) {
            c1126990fQv = (C1126990fQv) adapter;
        } else {
            c1126990fQv = null;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (c1126990fQv != null && (linkedList = c1126990fQv.LL) != null) {
            ListIterator<AbstractC1126600fQI<? extends AnonymousClass0054>> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQIPrevious = listIterator.previous();
                if (abstractC1126600fQIPrevious != null && C01AT.LIZ(abstractC1126600fQIPrevious, this.LLILLJJLI)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            iNextIndex = -1;
        } else {
            iNextIndex = -1;
        }
        if (childAdapterPosition == iNextIndex) {
            rect.bottom = this.LLJ;
        }
    }

    public final void LJ(Canvas canvas, Path path, RectF rectF, ImageModel imageModel) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            Bitmap bitmapLIZ = ((C1131000fXO) this.LLJILJIL.getValue()).LIZ(imageModel);
            if (bitmapLIZ != null && !bitmapLIZ.isRecycled()) {
                canvas.drawBitmap(bitmapLIZ, (Rect) null, rectF, (Paint) this.LLILZIL.getValue());
            } else {
                GradientDrawable gradientDrawable = (GradientDrawable) this.LLILZ.getValue();
                if (gradientDrawable != null) {
                    gradientDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                }
                GradientDrawable gradientDrawable2 = (GradientDrawable) this.LLILZ.getValue();
                if (gradientDrawable2 != null) {
                    gradientDrawable2.draw(canvas);
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
