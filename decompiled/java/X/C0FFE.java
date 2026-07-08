package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS0S0000002_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;

/* JADX INFO: renamed from: X.0FFE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0FFE<T extends StickerModel> implements C0FTJ<T> {
    public final Context LIZ;
    public final BaseStickerModel LIZIZ;
    public final C0FFO LIZJ;
    public final LifecycleOwner LIZLLL;
    public final C390420FSm LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 980));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 982));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 987));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 981));
    public C0FFP LJIIIZ;
    public Pair<Float, Float> LJIIJ;
    public boolean LJIIJJI;
    public float LJIIL;

    @Override // X.C0FTJ
    public float LJ() {
        return 1.0f;
    }

    @Override // X.C0FTJ
    public final void LJIIIIZZ() {
    }

    @Override // X.C0FTJ
    public Integer LJJI() {
        return null;
    }

    public void LJJIZ() {
    }

    public abstract void LJJJJIZL(BaseStickerModel baseStickerModel);

    public abstract View LJJJJJ();

    public C1664680tQA<BaseStickerModel> LJJIJ() {
        return (C1664680tQA) this.LJFF.getValue();
    }

    public C388890FMp LJJIJIIJI() {
        return (C388890FMp) this.LJIIIIZZ.getValue();
    }

    public C0FUE LJJIJIIJIL() {
        return (C0FUE) this.LJI.getValue();
    }

    public C1664680tQA<C0FFO> LJJIJL() {
        return (C1664680tQA) this.LJII.getValue();
    }

    public final C0FFP LJJIL() {
        C0FFP c0ffp = this.LJIIIZ;
        if (c0ffp != null) {
            return c0ffp;
        }
        return null;
    }

    public C0FUE LJJJI() {
        return new C0FUE(LJJIJ(), this.LJ);
    }

    public void LJJJIL() {
        Iterator it2 = C1697810uHb.LJ(new C2217371BqR() { // from class: X.0EPC
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setZIndex(((Number) obj2).intValue());
            }
        }, new C2217381BqS() { // from class: X.0FFK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((BaseStickerModel) obj).getType();
            }
        }, new C2217381BqS() { // from class: X.0FAc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getLeft());
            }
        }, new C2217381BqS() { // from class: X.0FAd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getTop());
            }
        }, new C2217381BqS() { // from class: X.0FEh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterX());
            }
        }, new C2217381BqS() { // from class: X.0FFH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterY());
            }
        }, new C2217381BqS() { // from class: X.0FEe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getWidth());
            }
        }, new C2217381BqS() { // from class: X.0FFJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getHeight());
            }
        }, new C2217381BqS() { // from class: X.0FAX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterXInVideo());
            }
        }, new C2217381BqS() { // from class: X.0FAY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getCenterYInVideo());
            }
        }, new C2217381BqS() { // from class: X.0FAZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getWidthInVideo());
            }
        }, new C2217381BqS() { // from class: X.0FAa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getHeightInVideo());
            }
        }, new C2217381BqS() { // from class: X.0ERn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
            }
        }, new C2217381BqS() { // from class: X.0ESG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }, new C2217381BqS() { // from class: X.0ESD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }, new C2217381BqS() { // from class: X.0ERp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getRotation());
            }
        }, new C2217371BqR() { // from class: X.0ERG
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getStartTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setStartTime(((Number) obj2).floatValue());
            }
        }, new C2217371BqR() { // from class: X.0EPG
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getEndTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setEndTime(((Number) obj2).floatValue());
            }
        }, new C2217371BqR() { // from class: X.0F7l
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getUiStartTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setUiStartTime(((Number) obj2).floatValue());
            }
        }, new C2217371BqR() { // from class: X.0F7s
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getUiEndTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setUiEndTime(((Number) obj2).floatValue());
            }
        }, new C2217381BqS() { // from class: X.0FFI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((BaseStickerModel) obj).getVisible());
            }
        }, new C2217381BqS() { // from class: X.0FFG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }, new C2217371BqR() { // from class: X.0FAW
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((BaseStickerModel) obj).isManuallyClipped());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setManuallyClipped(((Boolean) obj2).booleanValue());
            }
        }, new C2217381BqS() { // from class: X.0ERY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((BaseStickerModel) obj).getHighlightState();
            }
        }).iterator();
        while (it2.hasNext()) {
            LJJIJ().LIZ((InterfaceC2217241BqE) it2.next()).LJIIIZ(LJJIJIL(), Lifecycle.State.STARTED, new AwS584S0100000_5(this, 807));
        }
        LJJIJ().LIZ(new C2217381BqS() { // from class: X.0ESC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }).LJIIIZ(LJJIJIL(), Lifecycle.State.STARTED, new AwS584S0100000_5(this, StrategyCenter.ENABLE_SMART_SERVICE));
    }

    public final boolean LJJJJI() {
        return ((C0FTH) this.LJ.LIZIZ(C13LE.LIZ(C0FTH.class))).LIZLLL().LJIILIIL().LIZ.LIZIZ;
    }

    public final void LJJJJLL() {
        if (this.LJIIJJI || LJJJJI()) {
            return;
        }
        Pair<Float, Float> pair = this.LJIIJ;
        if (pair != null) {
            LJJIJ().LIZLLL(new AwS584S0100000_5(pair, (Pair<Integer, Integer>) 809), true);
        }
        this.LJIIJ = null;
    }

    public final void LJJJJZ() {
        if (this.LJIIJ != null || LJJJJI()) {
            return;
        }
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = ((InterfaceC388760FMc) this.LJ.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LIZIZ();
        int duration = interfaceC386690FEdLIZIZ != null ? interfaceC386690FEdLIZIZ.getDuration() : 0;
        this.LJIIJ = new Pair<>(Float.valueOf(LJJIJ().LIZ.getStartTime()), Float.valueOf(LJJIJ().LIZ.getEndTime()));
        LJJIJ().LIZLLL(new AwS20S0001000_5(duration, 30), true);
    }

    @Override // X.C0FTJ
    public final C0FFP LIZIZ() {
        return LJJIL();
    }

    @Override // X.C0FTJ
    public boolean LIZLLL() {
        return LJJIJL().LIZ.LJIILL;
    }

    @Override // X.C0FTJ
    public final boolean LJI() {
        return LJJIJL().LIZ.LJI;
    }

    @Override // X.C0FTJ
    public boolean LJII() {
        return LJJIJL().LIZ.LJ;
    }

    @Override // X.C0FTJ
    public final boolean LJIIIZ() {
        return LJJIJL().LIZ.LJIJI;
    }

    @Override // X.C0FTJ
    public final boolean LJIILIIL() {
        return LJJIJL().LIZ.LIZLLL;
    }

    @Override // X.C0FTJ
    public C0FFO LJIILL() {
        return LJJIJL().LIZ;
    }

    @Override // X.C0FTJ
    public final boolean LJIILLIIL() {
        return LJJIJL().LIZ.LJII;
    }

    @Override // X.C0FTJ
    public final boolean LJIJI() {
        return LJJIJL().LIZ.LJIILJJIL;
    }

    @Override // X.C0FTJ
    public boolean LJIJJLI() {
        return LJJIJL().LIZ.LJIIL;
    }

    @Override // X.C0FTJ
    public final boolean LJJIFFI() {
        return LJJIJL().LIZ.LIZJ;
    }

    @Override // X.C0FTJ
    public final void LJJIIJ() {
        LJJIJ().LIZLLL(AFwS234S0000000_5.get$arr$(395), true);
    }

    @Override // X.C0FTJ
    public final BaseStickerModel LJJIIJZLJL() {
        return LJJIJ().LIZ;
    }

    public void LJJJ() {
        if (LJJIJL().LIZ.LJIILJJIL) {
            if (this.LJIIIZ != null && (LJJIL() instanceof C0ERI)) {
                LIZ(new C0FEP(new AwS549S0100000_5(this, 983), new AwS549S0100000_5(this, 984)));
            } else {
                LIZ(new C0FEP(new AwS549S0100000_5(this, 985), new AwS549S0100000_5(this, 986)));
                LJJJJZI(true);
            }
        }
    }

    @Override // X.C0FTJ
    public final int getStickerId() {
        return LJJIJ().LIZ.getId();
    }

    @Override // X.C0FTJ
    public final EnumC1466150oFx getStickerType() {
        return LJJIJ().LIZ.getType();
    }

    public LifecycleOwner LJJIJIL() {
        return this.LIZLLL;
    }

    public C0FFO LJJIJLIJ() {
        return this.LIZJ;
    }

    public void LIZ(C0FUG c0fug) {
        LJJIJIIJIL().LLILLL.add(c0fug);
        ArrayList<C0FUG> arrayList = LJJIJIIJIL().LLILLL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(49));
        }
    }

    @Override // X.C0FTJ
    public final void LIZJ(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 48), true);
    }

    @Override // X.C0FTJ
    public final void LJFF(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 46), true);
    }

    @Override // X.C0FTJ
    public void LJIIJJI(StickerModel stickerModel) {
        LJJIL().LIZLLL();
        LJJIL().LIZIZ();
    }

    @Override // X.C0FTJ
    public final void LJIIL(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 47), true);
    }

    @Override // X.C0FTJ
    public final void LJIILJJIL(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 49), true);
    }

    @Override // X.C0FTJ
    public final void LJJ(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 45), true);
    }

    @Override // X.C0FTJ
    public final void LJJII(boolean z) {
        this.LJIIJJI = z;
        if (LJJIL() instanceof C0ERI) {
            if (z) {
                LJJJJZ();
                return;
            } else {
                LJJJJLL();
                return;
            }
        }
        if (z) {
            LJJJJZI(false);
        } else {
            LJJJJZI(true);
        }
    }

    @Override // X.C0FTJ
    public final void LJJIII(boolean z) {
        LJJIJL().LIZLLL(new AwS20S0010000_5(z, 50), true);
    }

    public void LJJIIZ(C0FUD c0fud) {
        if (LJJIJIIJIL().LLILZ.contains(c0fud)) {
            return;
        }
        LJJIJIIJIL().LLILZ.add(c0fud);
    }

    public void LJJIIZI(AwS406S0200000_5 awS406S0200000_5) {
        awS406S0200000_5.invoke();
    }

    public final void LJJJJ(FrameLayout frameLayout) {
        View viewLJJJJJ = LJJJJJ();
        if (viewLJJJJJ == null) {
            return;
        }
        this.LJIIIZ = new C386950FFd(this.LIZ, LJJIJ(), viewLJJJJJ, frameLayout, LJJIJIL());
        LJJJIL();
        LJJJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(int r6) {
        /*
            r5 = this;
            X.0FMp r2 = r5.LJJIJIIJI()
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L47
            X.0tQA r0 = r5.LJJIJ()
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r1 = r0.getStartTime()
            X.0tQA r0 = r5.LJJIJ()
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getEndTime()
            boolean r0 = r2.LIZLLL(r1, r0)
            if (r0 != r4) goto L47
        L26:
            r3 = 1
        L27:
            X.0tQA r2 = r5.LJJIJ()
            kotlin.jvm.internal.AwS20S0010000_5 r1 = new kotlin.jvm.internal.AwS20S0010000_5
            r0 = 51
            r1.<init>(r3, r0)
            r2.LIZLLL(r1, r4)
            r5.setVisible(r3)
            X.0FUE r2 = r5.LJJIJIIJIL()
            kotlin.jvm.internal.AwS93S0110000_5 r1 = new kotlin.jvm.internal.AwS93S0110000_5
            r0 = 14
            r1.<init>(r5, r3, r0)
            r2.LJJJJL(r1)
            return
        L47:
            X.0tQA r0 = r5.LJJIJ()
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getStartTime()
            int r1 = (int) r0
            X.0tQA r0 = r5.LJJIJ()
            STATE r0 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel) r0
            float r0 = r0.getEndTime()
            int r0 = (int) r0
            if (r6 > r0) goto L27
            if (r1 > r6) goto L27
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FFE.LJJJJJL(int):void");
    }

    public void LJJJJL(C0FUG c0fug) {
        LJJIJIIJIL().LLILLL.remove(c0fug);
    }

    public void LJJJJLI(C0FUD c0fud) {
        if (!LJJIJIIJIL().LLILZ.contains(c0fud)) {
            return;
        }
        LJJIJIIJIL().LLILZ.remove(c0fud);
    }

    public final void LJJJJZI(boolean z) {
        if (z) {
            C388890FMp c388890FMpLJJIJIIJI = LJJIJIIJI();
            if (c388890FMpLJJIJIIJI != null) {
                c388890FMpLJJIJIIJI.LIZIZ(LJJIJ().LIZ, new AwS584S0100000_5(this, 810));
                return;
            }
            return;
        }
        C388890FMp c388890FMpLJJIJIIJI2 = LJJIJIIJI();
        if (c388890FMpLJJIJIIJI2 != null) {
            c388890FMpLJJIJIIJI2.LIZLLL = false;
        }
        setVisible(true);
    }

    public final void LJJJLIIL(BaseStickerModel baseStickerModel) {
        LJJIJ().LIZLLL(new AwS584S0100000_5(baseStickerModel, 811), true);
    }

    @Override // X.C0FTJ
    public void LLD(boolean z) {
        C388890FMp c388890FMpLJJIJIIJI = LJJIJIIJI();
        if (c388890FMpLJJIJIIJI != null) {
            c388890FMpLJJIJIIJI.LIZJ();
        }
        if (z) {
            LJJIL().destroy();
        }
        LJJIJIIJIL().LLILLL.clear();
    }

    @Override // X.C0FTJ
    public void setVisible(boolean z) {
        LJJIJIIJIL().LJJJJL(new AwS93S0110000_5((C0FFE) this, z, true));
    }

    @Override // X.C0FTJ
    public void LJIIZILJ(EnumC390580FTc enumC390580FTc, float f) {
        setAlpha(f);
    }

    @Override // X.C0FTJ
    public final void LJIJ(BaseStickerModel baseStickerModel, boolean z) {
        if (z) {
            C388890FMp c388890FMpLJJIJIIJI = LJJIJIIJI();
            if (c388890FMpLJJIJIIJI != null) {
                c388890FMpLJJIJIIJI.LIZIZ(baseStickerModel, new AwS584S0100000_5(this, 814));
                return;
            }
            return;
        }
        C388890FMp c388890FMpLJJIJIIJI2 = LJJIJIIJI();
        if (c388890FMpLJJIJIIJI2 != null) {
            c388890FMpLJJIJIIJI2.LIZLLL = false;
        }
        setVisible(true);
    }

    @Override // X.C0FTJ
    public final Object LJIJJ(boolean z, InterfaceC1364105Vn<? super StickerModel> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        View viewLJJJJJ = LJJJJJ();
        if (!(LJJIL() instanceof C0ERI) && !z && viewLJJJJJ != null && viewLJJJJJ.getLeft() == LJJIJ().LIZ.getLeft() && viewLJJJJJ.getTop() == LJJIJ().LIZ.getTop() && viewLJJJJJ.getMeasuredWidth() == LJJIJ().LIZ.getWidth() && viewLJJJJJ.getMeasuredWidth() > 0 && viewLJJJJJ.getMeasuredHeight() == LJJIJ().LIZ.getHeight() && viewLJJJJJ.getMeasuredHeight() > 0) {
            T tLJLI = LJLI();
            C189200o6.m2constructorimpl(tLJLI);
            c23260099m.resumeWith(tLJLI);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0FFU(this, c23260099m, null), 3);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // X.C0FTJ
    public void LJIL(StickerModel stickerModel, boolean z) {
        LJIIJJI(stickerModel);
    }

    @Override // X.C0FTJ
    public void LJIIJ(float f, float f2, C00E4 c00e4) {
        LJJIJ().LIZLLL(new AwS0S0000002_5(f, f2, 0), true);
    }

    public C0FFE(Context context, BaseStickerModel baseStickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        this.LIZ = context;
        this.LIZIZ = baseStickerModel;
        this.LIZJ = c0ffo;
        this.LIZLLL = lifecycleOwner;
        this.LJ = c390420FSm;
    }
}
