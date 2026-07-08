package X;

import Y.AObjectS247S0100000_29;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19678011ys extends i<InterfaceC1451870nsv, C19679111z3, C19678511yx, C19679011z2> implements InterfaceC1451870nsv, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public int LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public NLETrackSlot LLJJIJIIJIL;
    public NLETrackSlot LLJJIJIL;
    public Map<EnumC1705190uTV, C1705150uTR> LLJJJ;
    public InterfaceC19678211yu LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C1705250uTb LLJLIL;
    public EnumC356110Dxh LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final MutableLiveData<Boolean> LLJLLIL;
    public final MutableLiveData<Boolean> LLJLLL;
    public final C19678111yt LLJZ;
    public GestureInteractItem LLJZIJLIL;
    public final Function0<C19678511yx> LLL;
    public final Function0<C19679011z2> LLLF;

    private final float R5(int i) {
        return (i * 0.0019191919f) + 0.008080808f;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
    }

    @Override // X.InterfaceC1451870nsv
    public void zD(float f) {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19678011ys.class, "editPreviewLogicApi", "getEditPreviewLogicApi()Lcom/ss/android/ugc/aweme/comment/image/preview/CommentImageEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19678011ys.class, "stickerTextComponent", "getStickerTextComponent()Lcom/ss/android/ugc/aweme/comment/image/textsticker/CommentImageEditStickerTextApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19678011ys.class, "commentImageEditModel", "getCommentImageEditModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19678011ys.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/comment/image/bottombar/CommentImageEditBottomBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19678011ys.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/comment/image/topbar/CommentImageEditTopBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19678011ys.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19678011ys.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C19678011ys.class, "editProFileConfigManger", "getEditProFileConfigManger()Lcom/ss/android/ugc/aweme/comment/image/brush/editor/EditProFileConfigManger;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLLFFI = 8;
    }

    private final InterfaceC1451640nsY C5() {
        return (InterfaceC1451640nsY) this.LLJJJJJIL.getValue(this, LLLFF[4]);
    }

    private final InterfaceC524950KiL O4() {
        return (InterfaceC524950KiL) this.LLJL.getValue(this, LLLFF[6]);
    }

    private final InterfaceC1451690nsd P4() {
        return (InterfaceC1451690nsd) this.LLJJJJ.getValue(this, LLLFF[3]);
    }

    private final C19571411hg n5() {
        return (C19571411hg) this.LLJLL.getValue(this, LLLFF[7]);
    }

    private final InterfaceC1461390o8H v5() {
        return (InterfaceC1461390o8H) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFF[5]);
    }

    private final InterfaceC1450620nqu x5() {
        return (InterfaceC1450620nqu) this.LLJJIII.getValue(this, LLLFF[1]);
    }

    public final void H5() {
        InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
        if (interfaceC19678211yu != null) {
            interfaceC19678211yu.LJII(this.LLJJIJIIJIL);
        }
    }

    public final void M5() {
        InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
        if (interfaceC19678211yu != null) {
            interfaceC19678211yu.LJIILJJIL(this.LLJJIJIIJIL);
        }
    }

    public final C1450600nqs d5() {
        return (C1450600nqs) this.LLJJIJI.getValue(this, LLLFF[2]);
    }

    public final void exit() {
        if (this.LLJJJJLIIL) {
            this.LLJJJJLIIL = false;
            super.hide();
            i3(AFwS273S0000000_29.get$arr$(28));
            x5().H50(true);
            InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
            if (interfaceC19678211yu != null) {
                interfaceC19678211yu.LJIIJ(this.LLJJIJIIJIL);
            }
            P4().show();
            C5().show();
        }
    }

    public final InterfaceC1451590nsT k5() {
        return (InterfaceC1451590nsT) this.LLJJI.getValue(this, LLLFF[0]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        if (this.LLJJJJLIIL) {
            return;
        }
        x5().H50(false);
        super.show();
        i3(new AwS608S0100000_29(this, 63));
        EnumC356110Dxh enumC356110Dxh = this.LLJLILLLLZIIL;
        if (enumC356110Dxh == null) {
            enumC356110Dxh = EnumC356110Dxh.NORMAL;
        }
        H4(enumC356110Dxh);
        P4().hide();
        C5().hide();
        this.LLJJJJLIIL = true;
    }

    private final void D5() {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        String unzipPath;
        MutableLiveData mutableLiveDataLJIIIZ;
        MutableLiveData mutableLiveDataLJIILLIIL;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt canvasSize;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi2;
        PairIntInt canvasSize2;
        String unzipPath2;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        NLETrack next;
        LiveData<InterfaceC1452170ntP> liveDataG = k5().g();
        if (liveDataG != null) {
            value = liveDataG.getValue();
            if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
                Iterator<NLETrack> it2 = tracks.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.LJFF(C351220Dpo.LJLLJ(next), "track_brush_sticker")) {
                            break;
                        }
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null) {
                    this.LLJJIJIIJIL = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
                    return;
                }
            }
        } else {
            value = null;
        }
        this.LLJJJIL = new C354740DvU(k5().g(), n5());
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null) {
            return;
        }
        int second = 0;
        NLETrackSlot slotByIndex = mainTrack.getSlotByIndex(0);
        if (slotByIndex != null) {
            this.LLJLIL.getClass();
            Effect effectLIZIZ = C1705250uTb.LIZIZ(2);
            String str = "";
            if (effectLIZIZ == null || (unzipPath = effectLIZIZ.getUnzipPath()) == null) {
                unzipPath = "";
            }
            this.LLJLIL.getClass();
            Effect effectLIZIZ2 = C1705250uTb.LIZIZ(3);
            if (effectLIZIZ2 != null && (unzipPath2 = effectLIZIZ2.getUnzipPath()) != null) {
                str = unzipPath2;
            }
            EnumC356110Dxh enumC356110Dxh = C19678311yv.LIZ[T2().LIZJ.ordinal()] == 1 ? EnumC356110Dxh.ERASER : EnumC356110Dxh.NORMAL;
            String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.COMMENT_IMAGE_EDIT, "", true).getPath();
            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
            int first = (c348100DkmLIZIZ2 == null || (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) == null || (mediaRuntimeApi2 = iNLEMediaSession2.getMediaRuntimeApi()) == null || (canvasSize2 = mediaRuntimeApi2.getCanvasSize()) == null) ? 0 : canvasSize2.getFirst();
            C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ3 != null && (iNLEMediaSession = c348100DkmLIZIZ3.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null && (canvasSize = mediaRuntimeApi.getCanvasSize()) != null) {
                second = canvasSize.getSecond();
            }
            InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
            NLETrackSlot nLETrackSlotLJI = interfaceC19678211yu != null ? interfaceC19678211yu.LJI(new C354810Dvb(slotByIndex, new Size(first, second), enumC356110Dxh, path, unzipPath, str), EnumC356070Dxd.COMMIT) : null;
            InterfaceC19678211yu interfaceC19678211yu2 = this.LLJJJIL;
            if (interfaceC19678211yu2 != null && (mutableLiveDataLJIILLIIL = interfaceC19678211yu2.LJIILLIIL()) != null) {
                mutableLiveDataLJIILLIIL.observe(this, new AObjectS247S0100000_29(this, 41));
            }
            InterfaceC19678211yu interfaceC19678211yu3 = this.LLJJJIL;
            if (interfaceC19678211yu3 != null && (mutableLiveDataLJIIIZ = interfaceC19678211yu3.LJIIIZ()) != null) {
                mutableLiveDataLJIIIZ.observe(this, new AObjectS247S0100000_29(this, 42));
            }
            this.LLJJIJIIJIL = nLETrackSlotLJI;
        }
    }

    private final void E5() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1705300uTg(this, null), 3);
    }

    private final void F4() {
        InterfaceC1452170ntP value;
        INLEMediaSession iNLEMediaSession;
        NLEMediaConfig mediaConfig;
        LiveData<InterfaceC1452170ntP> liveDataG = k5().g();
        if (liveDataG != null && (value = liveDataG.getValue()) != null) {
            NLEModel nLEModelLIZ = C352130DrH.LIZ(value);
            if (nLEModelLIZ != null) {
                if (nLEModelLIZ.getSetting() == null) {
                    nLEModelLIZ.setSetting(new NLESetting());
                }
                NLESetting setting = nLEModelLIZ.getSetting();
                if (setting != null) {
                    setting.setEffectSegmentUpper(true);
                }
            }
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaConfig = iNLEMediaSession.getMediaConfig()) != null) {
                this.LLJJL = mediaConfig.getEnableCoexistGlobalEffect();
                mediaConfig.setEnableCoexistGlobalEffect(true);
            }
        }
        if (this.LLJJJ.isEmpty()) {
            this.LLJLLL.setValue(Boolean.FALSE);
        }
        E5();
    }

    @Override // X.InterfaceC1451870nsv
    public C19571411hg NX0() {
        return n5();
    }

    public final void cancel() {
        exit();
        InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
        if (interfaceC19678211yu != null) {
            interfaceC19678211yu.LJIIJ(this.LLJJIJIIJIL);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        O4().kF(this);
        F4();
        GestureInteractItem gestureInteractItem = new GestureInteractItem(0, this.LLJZ);
        this.LLJZIJLIL = gestureInteractItem;
        v5().LIZIZ(gestureInteractItem);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        O4().b8(this);
        GestureInteractItem gestureInteractItem = this.LLJZIJLIL;
        if (gestureInteractItem != null) {
            v5().LIZ(gestureInteractItem);
        }
        this.LLJZIJLIL = null;
        this.LLJJJIL = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void save() {
        /*
            r3 = this;
            X.0nsT r0 = r3.k5()
            if (r0 == 0) goto L21
            androidx.lifecycle.LiveData r0 = r0.g()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L21
            X.0Dkm r0 = X.C352130DrH.LIZIZ(r0)
            if (r0 == 0) goto L21
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LIZ
            if (r0 == 0) goto L21
            r0.commit()
        L21:
            X.0nsT r0 = r3.k5()
            if (r0 == 0) goto L42
            androidx.lifecycle.LiveData r0 = r0.g()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L42
            X.0Dkm r0 = X.C352130DrH.LIZIZ(r0)
            if (r0 == 0) goto L42
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LIZ
            if (r0 == 0) goto L42
            r0.done()
        L42:
            X.11yu r0 = r3.LLJJJIL
            if (r0 == 0) goto L49
            r0.LJIILL()
        L49:
            r3.exit()
            X.11yu r0 = r3.LLJJJIL
            if (r0 == 0) goto L63
            boolean r1 = r0.Q2()
            r0 = 1
            if (r1 != r0) goto L63
        L57:
            java.lang.String r2 = "brush"
            if (r0 == 0) goto L65
            X.0nqs r0 = r3.d5()
            X.C1451610nsV.LIZ(r0, r2)
            return
        L63:
            r0 = 0
            goto L57
        L65:
            X.0nqs r1 = r3.d5()
            java.util.Set<java.lang.String> r0 = r1.editList
            r0.remove(r2)
            java.util.Set<java.lang.String> r0 = r1.sessionEditList
            r0.remove(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19678011ys.save():void");
    }

    public MutableLiveData<Boolean> T4() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19678511yx> o2() {
        return this.LLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19679011z2> w2() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1451870nsv
    public /* bridge */ /* synthetic */ LiveData xk2() {
        return this.LLJLLL;
    }

    private final void H4(EnumC356110Dxh enumC356110Dxh) {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        int i;
        String strJ4;
        InterfaceC19678211yu interfaceC19678211yu;
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment;
        NLEEditor nLEEditor2;
        LiveData<InterfaceC1452170ntP> liveDataG = k5().g();
        if (liveDataG != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null) {
            if (slotByIndex.getAIMatting() != null && (aIMatting = slotByIndex.getAIMatting()) != null && (segment = aIMatting.getSegment()) != null) {
                segment.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModePreview);
                segment.setBlendColor(Z4(R.attr.a06));
                C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
                if (c348100DkmLIZIZ2 != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
                    nLEEditor2.commit();
                }
            }
            D5();
            long jZ4 = Z4(R.attr.zd);
            if (enumC356110Dxh == EnumC356110Dxh.ERASER) {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(jZ4 & 4294967295L)}, 1));
                i = 36;
            } else {
                i = 6;
                if (enumC356110Dxh == EnumC356110Dxh.HIGHLIGHT) {
                    strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf((this.LLJJ & 16777215) | Integer.MIN_VALUE)}, 1));
                } else {
                    strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(4294967295L & ((long) this.LLJJ))}, 1));
                }
            }
            this.LLJLILLLLZIIL = enumC356110Dxh;
            NLETrackSlot nLETrackSlot = this.LLJJIJIIJIL;
            if (nLETrackSlot != null && (interfaceC19678211yu = this.LLJJJIL) != null) {
                interfaceC19678211yu.LJIIIIZZ(nLETrackSlot, strJ4, enumC356110Dxh, EnumC356070Dxd.COMMIT);
            }
            K4(i);
        }
    }

    private final void K4(int i) {
        NLETrackSlot nLETrackSlot;
        InterfaceC19678211yu interfaceC19678211yu;
        NLETrackSlot nLETrackSlot2 = this.LLJJIJIIJIL;
        if (nLETrackSlot2 != null && (nLETrackSlot = this.LLJJIJIL) != null && (interfaceC19678211yu = this.LLJJJIL) != null) {
            interfaceC19678211yu.LJFF(nLETrackSlot2, nLETrackSlot, R5(i), EnumC356070Dxd.COMMIT);
        }
    }

    public final void N5(EnumC19678411yw enumC19678411yw) {
        EnumC356110Dxh enumC356110Dxh;
        if (enumC19678411yw != EnumC19678411yw.NULL) {
            int i = C19678311yv.LIZ[enumC19678411yw.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC356110Dxh = EnumC356110Dxh.NORMAL;
                    } else {
                        enumC356110Dxh = EnumC356110Dxh.HIGHLIGHT;
                    }
                } else {
                    enumC356110Dxh = EnumC356110Dxh.CHANGE_COLOR;
                }
            } else {
                enumC356110Dxh = EnumC356110Dxh.ERASER;
            }
            if (this.LLJJJ.get(EnumC1705190uTV.PAINTER) != null) {
                H4(enumC356110Dxh);
            }
        }
    }

    public final int Z4(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, C1664590tQ1.LJIIIZ(this));
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC1451870nsv
    public void Za(boolean z) {
        InterfaceC19678211yu interfaceC19678211yu = this.LLJJJIL;
        if (interfaceC19678211yu != null) {
            interfaceC19678211yu.Za(z);
        }
    }

    @Override // X.InterfaceC1451870nsv
    public void dK1(EnumC19678411yw enumC19678411yw) {
        EnumC356110Dxh enumC356110Dxh;
        if (!this.LLJJJ.isEmpty() && enumC19678411yw != EnumC19678411yw.NULL) {
            int i = C19678311yv.LIZ[enumC19678411yw.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC356110Dxh = EnumC356110Dxh.NORMAL;
                    } else {
                        enumC356110Dxh = EnumC356110Dxh.HIGHLIGHT;
                    }
                } else {
                    enumC356110Dxh = EnumC356110Dxh.CHANGE_COLOR;
                }
            } else {
                enumC356110Dxh = EnumC356110Dxh.ERASER;
            }
            if (this.LLJJJ.get(EnumC1705190uTV.PAINTER) != null) {
                H4(enumC356110Dxh);
            }
        }
    }

    @Override // X.InterfaceC1451870nsv
    public void em2(int i) {
        EnumC356110Dxh enumC356110Dxh;
        String strJ4;
        InterfaceC19678211yu interfaceC19678211yu;
        this.LLJJ = i;
        if (T2().LIZJ != EnumC19678411yw.NULL) {
            EnumC356110Dxh enumC356110Dxh2 = this.LLJLILLLLZIIL;
            if (enumC356110Dxh2 == null) {
                enumC356110Dxh = EnumC356110Dxh.NORMAL;
            } else {
                enumC356110Dxh = enumC356110Dxh2;
            }
            if (enumC356110Dxh2 == EnumC356110Dxh.ERASER) {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(((long) Z4(R.attr.zd)) & 4294967295L)}, 1));
            } else if (enumC356110Dxh == EnumC356110Dxh.HIGHLIGHT) {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf((i & 16777215) | Integer.MIN_VALUE)}, 1));
            } else {
                strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(((long) i) & 4294967295L)}, 1));
            }
            NLETrackSlot nLETrackSlot = this.LLJJIJIIJIL;
            if (nLETrackSlot != null && (interfaceC19678211yu = this.LLJJJIL) != null) {
                interfaceC19678211yu.LJIIIIZZ(nLETrackSlot, strJ4, enumC356110Dxh, EnumC356070Dxd.COMMIT);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.11yt] */
    public C19678011ys(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = Z4(R.attr.a1q);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451590nsT.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1450620nqu.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451690nsd.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451640nsY.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC524950KiL.class, null);
        C1705270uTd c1705270uTd = C1705250uTb.LIZ;
        C1705250uTb c1705250uTb = C1705250uTb.LIZIZ;
        if (c1705250uTb == null) {
            synchronized (c1705270uTd) {
                try {
                    c1705250uTb = C1705250uTb.LIZIZ;
                    if (c1705250uTb == null) {
                        c1705250uTb = new C1705250uTb();
                        C1705250uTb.LIZIZ = c1705250uTb;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLJLIL = c1705250uTb;
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), C19571411hg.class, null);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJLLIL = mutableLiveData;
        this.LLJLLL = mutableLiveData;
        this.LLJZ = new C0FUM() { // from class: X.11yt
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void onTouchEvent(MotionEvent motionEvent) {
                int width;
                int height;
                LiveData<InterfaceC1452170ntP> liveDataG;
                InterfaceC1452170ntP value;
                C348100Dkm c348100DkmLIZIZ;
                NLEEditor nLEEditor;
                NLEModel model;
                NLETrack mainTrack;
                NLETrackSlot slotByIndex;
                InterfaceC19678211yu interfaceC19678211yu;
                Pair<Integer, Integer> canvasSize;
                if (motionEvent.getPointerCount() < 2) {
                    C19678011ys c19678011ys = this.LL;
                    if (c19678011ys.LLJJJJLIIL) {
                        SurfaceView value2 = c19678011ys.k5().ge().getValue();
                        if (value2 != null) {
                            width = value2.getWidth();
                        } else {
                            width = 0;
                        }
                        SurfaceView value3 = this.LL.k5().ge().getValue();
                        if (value3 != null) {
                            height = value3.getHeight();
                        } else {
                            height = 1;
                        }
                        float f = width / height;
                        if (this.LL.T2().LIZJ != EnumC19678411yw.NULL && (liveDataG = this.LL.k5().g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null && (interfaceC19678211yu = this.LL.LLJJJIL) != null && (canvasSize = interfaceC19678211yu.getCanvasSize()) != null) {
                            C354800Dva c354800Dva = new C354800Dva(slotByIndex, this.LL.LLJJIJIIJIL, motionEvent, new Size(width, height), f, canvasSize.getFirst().floatValue() / canvasSize.getSecond().intValue());
                            InterfaceC19678211yu interfaceC19678211yu2 = this.LL.LLJJJIL;
                            if (interfaceC19678211yu2 != null) {
                                interfaceC19678211yu2.LJIIJJI(c354800Dva);
                            }
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1 && action != 3) {
                                    return;
                                }
                                this.LL.i3(AFwS273S0000000_29.get$arr$(30));
                                C19678011ys c19678011ys2 = this.LL;
                                C354820Dvc c354820Dvc = new C354820Dvc(slotByIndex, c19678011ys2.LLJJIJIIJIL, c19678011ys2.Z4(R.attr.a06));
                                InterfaceC19678211yu interfaceC19678211yu3 = this.LL.LLJJJIL;
                                if (interfaceC19678211yu3 != null) {
                                    interfaceC19678211yu3.LJIILIIL(c354820Dvc, EnumC356070Dxd.COMMIT);
                                }
                                InterfaceC19678211yu interfaceC19678211yu4 = this.LL.LLJJJIL;
                                if (interfaceC19678211yu4 != null) {
                                    interfaceC19678211yu4.LJIIL();
                                    return;
                                }
                                return;
                            }
                            this.LL.i3(AFwS273S0000000_29.get$arr$(29));
                        }
                    }
                }
            }
        };
        this.LLL = AFwS218S0000000_29.get$arr$(44);
        this.LLLF = new AwS573S0100000_29(this, 67);
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        String aid;
        if (i == 4 && this.LLJJJJLIIL) {
            C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
            Aweme aweme = d5().aweme;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            C1451970nt5.LIZ(c1451970nt5, "crop", null, "cancel", aid, false, 18);
            exit();
            return true;
        }
        return false;
    }

    public final List<Pair<EnumC19678411yw, Boolean>> t5(boolean z, boolean z2) {
        return C1697810uHb.LJIIJJI(new Pair(EnumC19678411yw.CHANGE_COLOR, Boolean.valueOf(z)), new Pair(EnumC19678411yw.NORMAL_BRUSH, Boolean.valueOf(z)), new Pair(EnumC19678411yw.ERASER, Boolean.valueOf(z2)), new Pair(EnumC19678411yw.HIGHLIGHT_BRUSH, Boolean.valueOf(z)));
    }
}
