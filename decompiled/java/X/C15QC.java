package X;

import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS432S0200000_31;
import wh6.AbS516S0200000_31;

/* JADX INFO: renamed from: X.15QC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QC extends RecyclerView.ViewHolder {
    public final HashMap<String, C1323050kX9<AbstractC1327750kej>> LL;
    public final C1322110kVd LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C0HZQ LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxIconView LLILZLL;
    public final C371560EhW LLIZ;
    public boolean LLIZLLLIL;
    public PUgcSlotData LLJ;
    public String LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;

    public static void L5(View view, float f) {
        if (view.getAlpha() != f) {
            C786410Ut5.T4(view, f);
        }
    }

    public C15QC(View view, HashMap<String, C1323050kX9<AbstractC1327750kej>> map, Function2<? super Integer, ? super Boolean, ? extends Object> function2) {
        super(view);
        this.LL = map;
        this.LLJIJIL = (int) C11VU.LIZIZ(113.0f, view.getContext());
        this.LLJILJIL = (int) C11VU.LIZIZ(64.0f, view.getContext());
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.vkz);
        this.LLILLJJLI = (C1322110kVd) view.findViewById(R.id.vky);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.vl3);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.uic);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.ao6);
        this.LLIZ = (C371560EhW) view.findViewById(R.id.tyv);
        C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.l1d);
        this.LLILZ = c0hzq;
        Float fValueOf = Float.valueOf(10.0f);
        C1097070eef.LIZ(c0hzq, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
        c0hzq.setInterceptToggleListener(new AwS432S0200000_31(this, view, 69));
        C786410Ut5.D7(c0hzq, new C1864630ycf(function2, this, 4));
        if (roundedFrameLayout != null) {
            roundedFrameLayout.setRadius((int) C418440Gaw.LIZIZ(6));
        }
        C786410Ut5.I7(new AbS516S0200000_31(this, function2, 3), view);
    }

    public static Object I5(PUgcSlotData pUgcSlotData, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        VEUtils.getVideoFrames(pUgcSlotData.videoPath, new int[]{(int) pUgcSlotData.startTime}, 0, i, false, new InterfaceC1286300jZs() { // from class: X.08tv
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    byteBuffer.rewind();
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer);
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(bitmapCreateBitmap);
                    interfaceC20236714Gf.resumeWith(bitmapCreateBitmap);
                    return false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf2 = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(e);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf2.resumeWith(c098200Yq);
                    return false;
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
