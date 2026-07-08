package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.settings.LiveHostReplayEnableUseSprites;
import com.bytedance.android.live.settings.LiveHostReplayUISettings;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.SpriteImageScrollLinearLayoutManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AFwS336S0000000_12;
import kotlin.jvm.internal.AFwS349S0000000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS51S0200100_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS641S0100000_27;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;

/* JADX INFO: renamed from: X.0xsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836150xsj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJJJ;
    public final Activity LIZ;
    public final C1836130xsh<Long> LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public long LJ;
    public int LJFF;
    public final List<IHostSubscription.SpriteImage> LJI;
    public final int LJII;
    public boolean LJIIIIZZ;
    public C1835970xsR LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public C1836290xsx LJIIL;
    public C1290330jgN LJIILIIL;
    public int LJIILJJIL = LiveHostReplayUISettings.getValue().picNumInScreen;
    public boolean LJIILL = true;
    public final C1836130xsh<Float> LJIILLIIL = new C1836130xsh<>(Float.valueOf(0.0f));
    public final AwS606S0100000_27 LJIIZILJ = new AwS606S0100000_27(this, 159);
    public final BPEAHandler LJIJ = new BPEAHandler(Looper.getMainLooper());
    public final C1836130xsh<C1836200xso> LJIJI;
    public final C1836130xsh<Integer> LJIJJ;
    public final C1836130xsh<List<String>> LJIJJLI;
    public final C1836130xsh<List<String>> LJIL;
    public final Map<Long, Integer> LJJ;
    public C1836210xsp LJJI;
    public C1836160xsk LJJIFFI;
    public RecyclerView LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public final C1836130xsh<Float> LJJIIJZLJL;
    public final AwS556S0100000_12 LJJIIZ;
    public final AwS571S0100000_27 LJJIIZI;
    public final AwS571S0100000_27 LJJIJ;
    public final AwS571S0100000_27 LJJIJIIJI;
    public final AwS571S0100000_27 LJJIJIIJIL;
    public final AwS606S0100000_27 LJJIJIL;
    public final C1836130xsh LJJIJL;
    public float LJJIJLIJ;
    public final C1836130xsh LJJIL;
    public final AwS556S0100000_12 LJJIZ;
    public final AwS591S0100000_12 LJJJ;
    public final AwS626S0100000_12 LJJJI;
    public AnonymousClass0956 LJJJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1836150xsj.class, "blockCount", "getBlockCount()I", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C1836150xsj.class, "moveCount", "getMoveCount()I", 0);
        c09r3.getClass();
        LJJJJ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2};
    }

    public final void LIZ() {
        FrameLayout frameLayout = (FrameLayout) this.LIZ.findViewById(R.id.xv4);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        float f = (int) this.LJIJI.LIZIZ.LJIIL;
        C1836160xsk c1836160xsk = this.LJJIFFI;
        if (c1836160xsk == null) {
            c1836160xsk = null;
        }
        float f2 = 2;
        float handleVerticalExtraLength = f + (c1836160xsk.getHandleVerticalExtraLength() * f2);
        C1836160xsk c1836160xsk2 = this.LJJIFFI;
        layoutParams.height = (int) (handleVerticalExtraLength + ((c1836160xsk2 != null ? c1836160xsk2 : null).getVerticalHandleHeight() * f2));
        C786410Ut5.a6(frameLayout, layoutParams);
    }

    public final boolean LIZIZ() {
        List<IHostSubscription.SpriteImage> list = this.LJI;
        return (list == null || list.isEmpty() || !LiveHostReplayEnableUseSprites.getValue()) ? false : true;
    }

    public final void LIZJ() {
        if (this.LJIILL) {
            this.LJIJ.removeCallbacks(new ARunnableS112S0100000_12(this.LJJIIZ, 205));
            C786410Ut5.LJJZZIII(this.LJIJ, new ARunnableS112S0100000_12(this.LJJIIZ, 205));
        }
        C1836210xsp c1836210xsp = this.LJJI;
        if (c1836210xsp == null) {
            c1836210xsp = null;
        }
        C1836280xsw.LIZIZ(c1836210xsp.LL, new AwS591S0100000_12(this, 625));
        C1836290xsx c1836290xsx = this.LJIIL;
        C1836280xsw.LIZIZ((c1836290xsx != null ? c1836290xsx : null).getScrolling(), new AwS591S0100000_12(this, 626));
    }

    public final void LJFF() {
        C1836160xsk c1836160xsk = this.LJJIFFI;
        if (c1836160xsk == null) {
            c1836160xsk = null;
        }
        C1836130xsh<C1836200xso> c1836130xsh = this.LJIJI;
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 160);
        AwS606S0100000_27 awS606S0100000_272 = new AwS606S0100000_27(this, 161);
        AwS626S0100000_12 awS626S0100000_12 = new AwS626S0100000_12(this, 29);
        c1836160xsk.setPlayerPause(awS606S0100000_27);
        c1836160xsk.setPlayOffset(awS606S0100000_272);
        c1836160xsk.LLJJ = c1836130xsh;
        c1836160xsk.setCalculateSelectedTimeSpan(awS626S0100000_12);
        float f = ((View) c1836160xsk.getParent()).getLayoutParams().height;
        C1836200xso c1836200xso = c1836130xsh.LIZIZ;
        C1836130xsh<Float> c1836130xsh2 = c1836160xsk.LLILZIL;
        int i = c1836200xso.LJIIIIZZ;
        Float fValueOf = Float.valueOf(c1836200xso.LJFF);
        Float fValueOf2 = Float.valueOf((c1836200xso.LIZ - c1836200xso.LJI) - (c1836200xso.LJIIJ * c1836200xso.LJII));
        if (i != 0) {
            fValueOf = fValueOf2;
        }
        c1836130xsh2.LIZJ(fValueOf);
        C1836130xsh<Float> c1836130xsh3 = c1836160xsk.LLILZLL;
        int i2 = c1836130xsh.LIZIZ.LJIIIIZZ;
        Float fValueOf3 = Float.valueOf(c1836160xsk.LLILZIL.LIZIZ.floatValue() + (c1836200xso.LJIIJ * c1836200xso.LJII));
        Float fValueOf4 = Float.valueOf(c1836200xso.LIZ - c1836200xso.LJI);
        if (i2 != 0) {
            fValueOf3 = fValueOf4;
        }
        c1836130xsh3.LIZJ(fValueOf3);
        c1836160xsk.LLJJI = new RectF(c1836160xsk.LLILZIL.LIZIZ.floatValue() - c1836160xsk.LLJ, c1836160xsk.LLJILJILJ, c1836160xsk.LLILZIL.LIZIZ.floatValue(), f - c1836160xsk.LLJILJILJ);
        c1836160xsk.LLJJIII = new RectF(c1836160xsk.LLILZLL.LIZIZ.floatValue(), c1836160xsk.LLJJI.top, c1836160xsk.LLILZLL.LIZIZ.floatValue() + c1836160xsk.LLJ, c1836160xsk.LLJJI.bottom);
        c1836160xsk.LLJJIJI = new RectF(c1836160xsk.LLILZIL.LIZIZ.floatValue(), c1836160xsk.LLJJI.top, c1836160xsk.LLILZLL.LIZIZ.floatValue(), c1836160xsk.LLJJI.top + c1836160xsk.LLJILJIL);
        c1836160xsk.LLJJIJIIJIL = new RectF(c1836160xsk.LLILZIL.LIZIZ.floatValue(), c1836160xsk.LLJJI.bottom - c1836160xsk.LLJILJIL, c1836160xsk.LLILZLL.LIZIZ.floatValue(), c1836160xsk.LLJJI.bottom);
        RectF rectF = c1836160xsk.LLJJIJIL;
        float f2 = c1836160xsk.LLJJIJI.bottom;
        float f3 = c1836160xsk.LLLIIIIL;
        float f4 = f2 + f3;
        rectF.top = f4;
        rectF.bottom = f4 + c1836160xsk.LLLIIII;
        if (c1836130xsh.LIZIZ.LJIIIIZZ == 0) {
            float f5 = c1836160xsk.LLJJI.right + f3;
            rectF.left = f5;
            rectF.right = f5 + c1836160xsk.LLLII;
        } else {
            float f6 = c1836160xsk.LLJJIII.left - f3;
            rectF.right = f6;
            rectF.left = f6 - c1836160xsk.LLLII;
        }
        RectF rectF2 = c1836160xsk.LLJJI;
        c1836160xsk.LLJJJ = new RectF(0.0f, rectF2.top, rectF2.left, rectF2.bottom);
        RectF rectF3 = c1836160xsk.LLJJIII;
        c1836160xsk.LLJJJIL = new RectF(rectF3.right, rectF3.top, c1836130xsh.LIZIZ.LIZ, rectF3.bottom);
        RectF rectF4 = c1836160xsk.LLJJLIIIJLLLLLLLZ.LIZIZ;
        rectF4.top = 0.0f;
        rectF4.bottom = f;
        C1836160xsk c1836160xsk2 = this.LJJIFFI;
        if (c1836160xsk2 == null) {
            c1836160xsk2 = null;
        }
        c1836160xsk2.getLeftPosition().LIZ();
        C1836210xsp c1836210xsp = new C1836210xsp(this.LJIJI.LIZIZ.LJFF);
        this.LJJI = c1836210xsp;
        RecyclerView recyclerView = this.LJJII;
        (recyclerView != null ? recyclerView : null).addOnScrollListener(c1836210xsp);
    }

    public final void LJI() {
        RecyclerView recyclerView = this.LJJII;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(this.LJIJI.LIZIZ.LJIIL);
        C1836160xsk c1836160xsk = this.LJJIFFI;
        C1836160xsk c1836160xsk2 = c1836160xsk != null ? c1836160xsk : null;
        C500260Jjc.LJLJL((int) Float.valueOf(c1836160xsk2.getVerticalHandleHeight() + c1836160xsk2.getHandleVerticalExtraLength()).floatValue(), recyclerView);
        C786410Ut5.p6(recyclerView, layoutParams);
        Context context = recyclerView.getContext();
        C1836130xsh<C1836200xso> c1836130xsh = this.LJIJI;
        C1836200xso c1836200xso = c1836130xsh.LIZIZ;
        recyclerView.setLayoutManager(new SpriteImageScrollLinearLayoutManager(context, c1836200xso.LJFF, c1836200xso.LJIIJJI, c1836130xsh));
        long jLongValue = this.LIZIZ.LIZIZ.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        float f = (jLongValue % ((long) r5.LIZLLL)) * this.LJIJI.LIZIZ.LJIIJ;
        Context context2 = recyclerView.getContext();
        C1836130xsh<List<String>> c1836130xsh2 = this.LJIL;
        C1836200xso c1836200xso2 = this.LJIJI.LIZIZ;
        recyclerView.setAdapter(new C0KXY(context2, c1836130xsh2, c1836200xso2, c1836200xso2.LJFF, c1836200xso2.LJI, (int) f, this.LJIILIIL));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r9 <= r10) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003a -> B:35:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0048 -> B:35:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007e -> B:35:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r9, int r10, boolean r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C757930ToF
            if (r0 == 0) goto La7
            r3 = r12
            X.0ToF r3 = (X.C757930ToF) r3
            int r2 = r3.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r3.LLILZIL = r2
        L12:
            java.lang.Object r1 = r3.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZIL
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L29
            if (r0 == r6) goto L83
            if (r0 != r5) goto Lae
            X.C155000ia.LIZIZ(r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            if (r11 == 0) goto L8f
            if (r9 > r10) goto Lb6
        L30:
            X.0xsh<java.util.List<java.lang.String>> r0 = r8.LJIJJLI
            T r0 = r0.LIZIZ
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r9 >= r0) goto L8a
            int r7 = r9 + 1
            X.0xsh<java.util.List<java.lang.String>> r0 = r8.LJIL
            T r0 = r0.LIZIZ
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r7 >= r0) goto L8a
            X.0jgN r0 = r8.LJIILIIL
            if (r0 == 0) goto L81
            int r5 = r0.LIZJ
        L50:
            float r1 = (float) r9
            X.0xsh<X.0xso> r0 = r8.LJIJI
            T r0 = r0.LIZIZ
            X.0xso r0 = (X.C1836200xso) r0
            int r0 = r0.LIZLLL
            float r0 = (float) r0
            float r1 = r1 * r0
            float r0 = (float) r5
            float r1 = r1 / r0
            int r5 = X.C814420VxA.LIZIZ(r1)
            if (r5 >= 0) goto L64
            r5 = 0
        L64:
            X.0jgN r0 = r8.LJIILIIL
            if (r0 == 0) goto L6b
            r0.LIZ(r5)
        L6b:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0ToD r0 = new X.0ToD
            r0.<init>(r8, r7, r5, r4)
            r3.LL = r10
            r3.LLILLJJLI = r9
            r3.LLILZIL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r3, r1, r0)
            if (r0 != r2) goto L8a
            return r2
        L81:
            r5 = 5
            goto L50
        L83:
            int r9 = r3.LLILLJJLI
            int r10 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L8a:
            if (r9 == r10) goto Lb6
            int r9 = r9 + 1
            goto L30
        L8f:
            boolean r0 = com.bytedance.android.live.settings.LiveHostReplayEnableOptQueryThumbnails.getValue()
            if (r0 == 0) goto Lb6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0ToG r0 = new X.0ToG
            r0.<init>(r8, r9, r10, r4)
            r3.LLILZIL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r3, r1, r0)
            if (r0 != r2) goto L26
            return r2
        La7:
            X.0ToF r3 = new X.0ToF
            r3.<init>(r8, r12)
            goto L12
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1836150xsj.LIZLLL(int, int, boolean, X.05Vn):java.lang.Object");
    }

    public final void LJ(List list, long j, long j2, boolean z) {
        AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 1148);
        if (list != null && !list.isEmpty()) {
            awS591S0100000_12.invoke(list);
            return;
        }
        C0THP.LIZ.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        long j3 = this.LJIJI.LIZIZ.LIZLLL;
        AwS51S0200100_12 awS51S0200100_12 = new AwS51S0200100_12(awS591S0100000_12, j, this, 2);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LIZJ);
        if (lLJIILIIL == null) {
            return;
        }
        C11NZ<C470590Icr<AnchorLiveReplayFrameResponse.ResponseData>> liveReplayFrame = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveReplayFrame(lLJIILIIL.longValue(), j, j2, z, j3, this.LJII);
        if (liveReplayFrame == null) {
            return;
        }
        liveReplayFrame.LJJLJLI(new C516201zk(awS51S0200100_12, 304));
    }

    public C1836150xsj(Activity activity, C1488060opI c1488060opI, C1836130xsh<Long> c1836130xsh, C1836130xsh<Boolean> c1836130xsh2, String str, long j, long j2, int i, List<IHostSubscription.SpriteImage> list, int i2) {
        this.LIZ = activity;
        this.LIZIZ = c1836130xsh;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = i;
        this.LJI = list;
        this.LJII = i2;
        C1836200xso c1836200xso = C1836310xsz.LIZ;
        AwS641S0100000_27 awS641S0100000_27 = new AwS641S0100000_27(this, 25);
        C1836130xsh<C1836200xso> c1836130xsh3 = new C1836130xsh<>(c1836200xso);
        c1836130xsh2.LIZIZ().add(new AwS606S0100000_27(new AwS271S0300000_27((Function2) awS641S0100000_27, (Function2<Object, Object, Object>) c1836130xsh3, (C1836130xsh<Object>) c1836130xsh2, (C1836130xsh<Object>) 3), 155));
        this.LJIJI = c1836130xsh3;
        this.LJIJJ = C1836280xsw.LIZ(0, c1836130xsh3, c1836130xsh, AFwS349S0000000_27.get$arr$(1));
        C1836130xsh<List<String>> c1836130xshLIZ = C1836280xsw.LIZ(new ArrayList(0), c1836130xsh, c1836130xsh3, AFwS336S0000000_12.get$arr$(0));
        this.LJIJJLI = c1836130xshLIZ;
        ArrayList arrayList = new ArrayList(0);
        AFwS314S0000000_27 aFwS314S0000000_27 = AFwS314S0000000_27.get$arr$(14);
        C1836130xsh<List<String>> c1836130xsh4 = new C1836130xsh<>(arrayList);
        c1836130xshLIZ.LIZIZ().add(new AwS606S0100000_27(new AwS271S0300000_27((Function2) aFwS314S0000000_27, (Function2<Object, Object, Object>) c1836130xsh4, (C1836130xsh<Object>) c1836130xshLIZ, (C1836130xsh<Object>) 3), 155));
        this.LJIL = c1836130xsh4;
        this.LJJ = new LinkedHashMap();
        this.LJJIIJZLJL = C1836280xsw.LIZ(Float.valueOf(1.0f), c1836130xsh3, c1836130xsh, AFwS336S0000000_12.get$arr$(1));
        this.LJJIIZ = new AwS556S0100000_12(this, 510);
        this.LJJIIZI = new AwS571S0100000_27(this, 589);
        this.LJJIJ = new AwS571S0100000_27(this, 591);
        this.LJJIJIIJI = new AwS571S0100000_27(this, 588);
        this.LJJIJIIJIL = new AwS571S0100000_27(this, 590);
        this.LJJIJIL = new AwS606S0100000_27(this, 158);
        this.LJJIJL = new C1836130xsh(0);
        this.LJJIL = new C1836130xsh(0);
        this.LJJIZ = new AwS556S0100000_12(this, 509);
        this.LJJJ = new AwS591S0100000_12(this, 624);
        this.LJJJI = new AwS626S0100000_12(this, 28);
    }
}
