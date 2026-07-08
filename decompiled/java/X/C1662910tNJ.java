package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS227S0100000_25;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0tNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662910tNJ extends i<InterfaceC1454640nxO, C0F2A, C0F2E, C0F2H> implements InterfaceC1454640nxO, InterfaceC379610EuV {
    public static final C1662920tNK LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LLJILJILJ;
    public final Function0<C0F2E> LLJILLL;
    public final Function0<C0F2H> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public C09AE LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final C01GW LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0tNK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1662910tNJ.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1662910tNJ.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0), new C2217381BqS(C1662910tNJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1662910tNJ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C1662910tNJ.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLJJJJ = new Object() { // from class: X.0tNK
        };
        LLJJJJLIIL = 8;
    }

    private final InterfaceC1455610nyx K4() {
        return (InterfaceC1455610nyx) this.LLJJIJIL.getValue(this, LLJJJJJIL[3]);
    }

    private final InterfaceC1452360nti O4() {
        return (InterfaceC1452360nti) this.LLJJIJI.getValue(this, LLJJJJJIL[1]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJJJ.getValue(this, LLJJJJJIL[4]);
    }

    public final WeakReference<Bitmap> H4() {
        return (WeakReference) this.LLJJJIL.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[2]);
    }

    @Override // X.InterfaceC1454640nxO
    public void b80() {
        i3(AFwS266S0000000_25.get$arr$(178));
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJJJJJIL[0]);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K4().ww().observe(this, new AObserverS227S0100000_25(this, 28));
        JY0().Yh().observe(this, new AObjectS240S0100000_5(this, 13));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F2E> o2() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F2H> w2() {
        return this.LLJJ;
    }

    private final void T4(boolean z) {
        String str;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("creation_id", getEditModel().getCreationId());
        pairArr[1] = new Pair("shoot_way", "story");
        pairArr[2] = new Pair("enter_from", getEditModel().getEnterFrom());
        pairArr[3] = new Pair("shoot_tab_name", C1428470nHB.LJJIIZI(getEditModel()));
        pairArr[4] = new Pair("shoot_enter_from", C1428470nHB.LJJIIJ(getEditModel(), true));
        pairArr[5] = new Pair("shoot_enter_method", getEditModel().getShootEnterMethod());
        if (z) {
            str = "show";
        } else {
            str = "hide";
        }
        pairArr[6] = new Pair("to_status", str);
        C20684815ws.LJIILLIIL("ttsocial_story_reveal_blur_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final Bitmap F4(Bitmap bitmap) {
        return C1100070ejV.LIZ(bitmap, (390.0f / bitmap.getWidth()) * 0.41666666f, 25.0f, false);
    }

    public final void P4(View view) {
        FrameLayout.LayoutParams layoutParamsLIZ;
        Float f;
        Float f2;
        SurfaceView surfaceViewLJIJJLI = O4().LJIJJLI();
        ViewGroup.LayoutParams layoutParams = surfaceViewLJIJJLI.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams) || (layoutParamsLIZ = (FrameLayout.LayoutParams) layoutParams) == null) {
            layoutParamsLIZ = C1658600tGM.LIZ(view.getContext());
        }
        ViewOutlineProvider outlineProvider = surfaceViewLJIJJLI.getOutlineProvider();
        float fFloatValue = 0.0f;
        if (outlineProvider != null) {
            if (outlineProvider instanceof C1447460nlo) {
                Float f3 = ((C1447460nlo) outlineProvider).LIZ;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                }
            } else if (outlineProvider instanceof C0MRE) {
                Field[] fields = C0MRE.class.getFields();
                int length = fields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field = fields[i];
                    if (!Intrinsics.LJFF(field.getType(), Float.TYPE)) {
                        i++;
                    } else {
                        try {
                            field.setAccessible(true);
                            Object obj = field.get(outlineProvider);
                            if ((obj instanceof Float) && (f2 = (Float) obj) != null) {
                                fFloatValue = f2.floatValue();
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } else {
                Outline outline = new Outline();
                outlineProvider.getOutline(surfaceViewLJIJJLI, outline);
                try {
                    Field declaredField = outline.getClass().getDeclaredField("mRadius");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(outline);
                    if ((obj2 instanceof Float) && (f = (Float) obj2) != null) {
                        fFloatValue = f.floatValue();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(layoutParamsLIZ));
        C1447470nlp.LIZIZ(view, fFloatValue);
    }

    public final void Z4(boolean z) {
        T4(z);
        C09AE c09ae = this.LLJJIII;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        if (!z) {
            i3(new AwS20S0010000_5(z, 3));
            this.LLJJIII = null;
        } else {
            this.LLJJIII = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C1662930tNL(this, z, null), 2);
        }
    }

    public C1662910tNJ(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = AFwS191S0000000_5.get$arr$(65);
        this.LLJJ = new AwS549S0100000_5(this, 118);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 354));
    }
}
