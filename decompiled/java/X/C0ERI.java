package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ERI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0ERI implements C0FFP {
    public final InterfaceC386690FEd LIZ;
    public final VESize LIZIZ;
    public final C1664680tQA<BaseStickerModel> LIZJ;
    public final LifecycleOwner LIZLLL;
    public final FrameLayout LJ;
    public final InterfaceC388760FMc LJFF;
    public String LJI;
    public final int LJII;
    public final NLEEditor LJIIIIZZ;
    public final NLEEditor LJIIIZ;
    public boolean LJIIJ;

    @Override // X.C0FFP
    public final Bitmap LIZJ() {
        return null;
    }

    @Override // X.C0FFP
    public void LIZLLL() {
    }

    @Override // X.C0FFP
    public void LIZIZ() {
        NLERectF nLERectF;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        if (this.LJIIJ && LJI()) {
            int left = this.LJ.getLeft();
            int top = this.LJ.getTop();
            int width = this.LJ.getWidth() > 0 ? this.LJ.getWidth() : this.LJ.getLayoutParams().width;
            int height = this.LJ.getHeight() > 0 ? this.LJ.getHeight() : this.LJ.getLayoutParams().height;
            NLETrackSlot nLETrackSlotLJII = LJII();
            if (nLETrackSlotLJII != null) {
                InterfaceC386690FEd interfaceC386690FEd = this.LIZ;
                if (interfaceC386690FEd == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(this.LJI, false)) == null) {
                    nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float scale = this.LIZJ.LIZ.getScale();
                RectF rectF = new RectF();
                rectF.left = C363400EMo.LIZJ(nLERectF.getLeft() / scale);
                rectF.top = C363400EMo.LIZLLL(nLERectF.getTop() / scale);
                rectF.right = C363400EMo.LIZJ(nLERectF.getRight() / scale);
                rectF.bottom = C363400EMo.LIZLLL(nLERectF.getBottom() / scale);
                float f = width;
                float f2 = rectF.left * f;
                float f3 = height;
                float f4 = rectF.top * f3;
                C118300cf c118300cf = new C118300cf();
                c118300cf.element = (int) Math.abs((rectF.right - rectF.left) * f);
                C118300cf c118300cf2 = new C118300cf();
                c118300cf2.element = (int) Math.abs((rectF.bottom - rectF.top) * f3);
                if (this instanceof C0EN5) {
                    c118300cf.element = (int) (((double) width) * 0.9d);
                    c118300cf2.element = (int) (((double) height) * 0.33d);
                }
                this.LIZJ.LIZLLL(new C0ENR(f2, f4, c118300cf, c118300cf2, width, height, nLETrackSlotLJII, left, top), true);
            }
        }
    }

    public final void LJ() {
        if (this.LJIIJ && LJI()) {
            this.LJIIIIZZ.commit();
        }
    }

    public final boolean LJI() {
        return this.LIZJ.LIZ.getEnableNLEChange();
    }

    public NLETrackSlot LJII() {
        Object next;
        VecNLETrackSPtr tracks = this.LJIIIIZZ.getModel().getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.LJFF(((NLENode) next).getUUID(), this.LJI)) {
                break;
            }
        }
        return (NLETrackSlot) next;
    }

    public void LJIIIIZZ() {
        LJIIIZ(this.LIZJ.LIZ(new C2217381BqS() { // from class: X.0ERJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 858));
        LJIIIZ(this.LIZJ.LIZ(new C2217381BqS() { // from class: X.0ERK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 859));
        LJIIIZ(this.LIZJ.LIZ(new C2217381BqS() { // from class: X.0ERL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 860));
        LJIIIZ(this.LIZJ.LIZ(new C2217381BqS() { // from class: X.0ERM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getRotation());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 861));
        LJIIIZ(this.LIZJ.LIZ(new C2217381BqS() { // from class: X.0ERN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 854));
        LJIIIZ(this.LIZJ.LIZ(new C2217371BqR() { // from class: X.0EPA
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setZIndex(((Number) obj2).intValue());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 855));
        LJIIIZ(this.LIZJ.LIZ(new C2217371BqR() { // from class: X.0ERH
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getStartTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setStartTime(((Number) obj2).floatValue());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 856));
        LJIIIZ(this.LIZJ.LIZ(new C2217371BqR() { // from class: X.0EPH
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getEndTime());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setEndTime(((Number) obj2).floatValue());
            }
        }), this.LIZLLL, new AwS584S0100000_5(this, 857));
    }

    public final void LJIIJ() {
        INLEMediaSession iNLEMediaSessionF1;
        this.LJIIIZ.setModel(this.LJIIIIZZ.getModel());
        this.LJIIIZ.commit();
        InterfaceC386690FEd interfaceC386690FEd = this.LIZ;
        if (interfaceC386690FEd == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null) {
            return;
        }
        iNLEMediaSessionF1.setDataSource(this.LJIIIZ.getModel());
    }

    @Override // X.C0FFP
    public void destroy() {
        NLETrackSlot nLETrackSlotLJII;
        if (LJI() && (nLETrackSlotLJII = LJII()) != null) {
            NLETrack trackBySlot = this.LJIIIIZZ.getModel().getTrackBySlot(nLETrackSlotLJII);
            if (trackBySlot != null) {
                trackBySlot.removeSlot(nLETrackSlotLJII);
                if (trackBySlot.getSlots().isEmpty()) {
                    this.LJIIIIZZ.getModel().removeTrack(trackBySlot);
                }
            }
            LJ();
        }
    }

    public int LJFF() {
        return this.LJII;
    }

    @Override // X.C0FFP
    public final void LIZ(Function0<Unit> function0) {
        function0.invoke();
    }

    public final <T> void LJIIIZ(LiveState<T> liveState, LifecycleOwner lifecycleOwner, Function1<? super T, Unit> function1) {
        liveState.LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS371S0200000_5(this, (C0ERI) function1, 208));
    }

    public /* synthetic */ C0ERI(InterfaceC386690FEd interfaceC386690FEd, VESize vESize, C1664680tQA c1664680tQA, LifecycleOwner lifecycleOwner, FrameLayout frameLayout) {
        this(interfaceC386690FEd, vESize, c1664680tQA, lifecycleOwner, frameLayout, null);
    }

    public C0ERI(InterfaceC386690FEd interfaceC386690FEd, VESize vESize, C1664680tQA<BaseStickerModel> c1664680tQA, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc) {
        NLEEditor nLEEditorLJI;
        this.LIZ = interfaceC386690FEd;
        this.LIZIZ = vESize;
        this.LIZJ = c1664680tQA;
        this.LIZLLL = lifecycleOwner;
        this.LJ = frameLayout;
        this.LJFF = interfaceC388760FMc;
        this.LJI = "";
        this.LJII = 2000;
        this.LJIIIIZZ = (interfaceC386690FEd == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) ? C346630DiP.LIZ() : nLEEditorLJI;
        this.LJIIIZ = C346630DiP.LIZ();
        this.LJIIJ = true;
    }
}
