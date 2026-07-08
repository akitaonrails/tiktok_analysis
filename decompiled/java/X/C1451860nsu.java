package X;

import Y.AObserverS225S0100000_22;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentBrushSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0nsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451860nsu extends i<InterfaceC1451690nsd, C1E96, C1451880nsw, C1451960nt4> implements InterfaceC1451690nsd, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final C1451900nsy LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC497601wk LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final Function0<C1451880nsw> LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final SafeHandler LLJJJJLIIL;
    public Runnable LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final Function0<C1451960nt4> LLJLL;
    public final C560530Lyd<Boolean> LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0nsy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1451860nsu.class, "cropApi", "getCropApi()Lcom/ss/android/ugc/aweme/comment/image/crop/CropApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1451860nsu.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/comment/image/textsticker/CommentImageEditStickerTextApi;", 0), new C2217381BqS(C1451860nsu.class, "editPreviewLogicAPi", "getEditPreviewLogicAPi()Lcom/ss/android/ugc/aweme/comment/image/preview/CommentImageEditPreviewApi;", 0), new C2217381BqS(C1451860nsu.class, "brushApi", "getBrushApi()Lcom/ss/android/ugc/aweme/comment/image/brush/CommentImageBrushApi;", 0), new C2217381BqS(C1451860nsu.class, "aiImageEditComponent", "getAiImageEditComponent()Lcom/ss/android/ugc/aweme/comment/image/aiimage/CommentImageEditAiComponent;", 0), new C2217381BqS(C1451860nsu.class, "model", "getModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0), new C2217381BqS(C1451860nsu.class, "activity", "getActivity()Landroid/app/Activity;", 0), new C2217381BqS(C1451860nsu.class, "editProFileConfigManger", "getEditProFileConfigManger()Lcom/ss/android/ugc/aweme/comment/image/brush/editor/EditProFileConfigManger;", 0), new C2217381BqS(C1451860nsu.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0), new C2217381BqS(C1451860nsu.class, "isLivePhoto", "isLivePhoto()Z", 0), new C2217381BqS(C1451860nsu.class, "imageModeData", "getImageModeData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0)};
        LLJLLL = new Object() { // from class: X.0nsy
        };
        LLJZIJLIL = 8;
    }

    private final C1450590nqr K4() {
        return (C1450590nqr) this.LLJJIJI.getValue(this, LLJZ[4]);
    }

    private final InterfaceC524950KiL O4() {
        return (InterfaceC524950KiL) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZ[8]);
    }

    private final InterfaceC1451870nsv P4() {
        return (InterfaceC1451870nsv) this.LLJJIII.getValue(this, LLJZ[3]);
    }

    private final InterfaceC1451890nsx T4() {
        return (InterfaceC1451890nsx) this.LLJILLL.getValue(this, LLJZ[0]);
    }

    private final InterfaceC1451590nsT Z4() {
        return (InterfaceC1451590nsT) this.LLJJI.getValue(this, LLJZ[2]);
    }

    private final C19571411hg d5() {
        return (C19571411hg) this.LLJJJJ.getValue(this, LLJZ[7]);
    }

    private final SingleImageData k5() {
        return (SingleImageData) this.LLJLIL.getValue();
    }

    public final boolean E5() {
        return ((Boolean) this.LLJL.getValue(this, LLJZ[9])).booleanValue();
    }

    public final void K6() throws Throwable {
        String aid;
        C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
        Aweme aweme = v5().aweme;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1451970nt5.LIZ(c1451970nt5, "crop", null, "entry", aid, false, 18);
        Z4().x7(false, false, false, false);
        if (!C276180As4.LIZ()) {
            T4().show();
            return;
        }
        C0FNV.LIZJ(t5());
        if (C5()) {
            U5(false);
        } else {
            C0FNV.LIZ(t5());
            T4().show();
        }
        InterfaceC1451870nsv interfaceC1451870nsvP4 = P4();
        if (interfaceC1451870nsvP4 != null) {
            interfaceC1451870nsvP4.Za(true);
        }
        Ps2(true);
    }

    public final void L6() {
        String aid;
        C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
        Aweme aweme = v5().aweme;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1451970nt5.LIZ(c1451970nt5, "brush", null, "entry", aid, false, 18);
        InterfaceC1451870nsv interfaceC1451870nsvP4 = P4();
        if (interfaceC1451870nsvP4 != null) {
            interfaceC1451870nsvP4.show();
        }
        Z4().x7(false, false, false, false);
    }

    @Override // X.InterfaceC1451690nsd
    public void Lj() {
        Runnable runnable = this.LLJJL;
        if (runnable != null) {
            this.LLJJJJLIIL.post(runnable);
        }
    }

    public final Activity getActivity() {
        return (Activity) this.LLJJJ.getValue(this, LLJZ[6]);
    }

    @Override // X.InterfaceC1451690nsd
    public void ha() {
        Runnable runnable = this.LLJJL;
        if (runnable != null) {
            this.LLJJJJLIIL.removeCallbacks(runnable);
        }
    }

    public final ImageAlbumData n5() {
        return (ImageAlbumData) this.LLJLILLLLZIIL.getValue(this, LLJZ[10]);
    }

    public final DialogC1389620mGW t5() {
        return (DialogC1389620mGW) this.LLJJJJJIL.getValue();
    }

    public final C1450600nqs v5() {
        return (C1450600nqs) this.LLJJIJIL.getValue(this, LLJZ[5]);
    }

    public final InterfaceC1450620nqu x5() {
        return (InterfaceC1450620nqu) this.LLJJ.getValue(this, LLJZ[1]);
    }

    private final boolean C5() {
        List<TextStickerModel> listC1;
        InterfaceC1450620nqu interfaceC1450620nquX5 = x5();
        if ((interfaceC1450620nquX5 == null || (listC1 = interfaceC1450620nquX5.c1()) == null || !(listC1.isEmpty() ^ true)) ? false : true) {
            C1451610nsV.LIZ(v5(), "text");
        } else {
            C1450600nqs c1450600nqsV5 = v5();
            c1450600nqsV5.editList.remove("text");
            c1450600nqsV5.sessionEditList.remove("text");
        }
        return !v5().sessionEditList.isEmpty();
    }

    private final boolean H4() {
        if (!v5().isOnlyCrop()) {
            if (!(!v5().editList.isEmpty())) {
                return false;
            }
            Set<String> set = v5().editList;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!TextUtils.equals((String) it2.next(), "crop")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final void M5() {
        C0FNV.LIZ(t5());
    }

    private final void S5() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value = Z4().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        NLEModel model = nLEEditor.getModel();
        VecNLETrackSPtr tracks = model.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (!(slots instanceof Collection) || !slots.isEmpty()) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (NLESegmentBrushSticker.dynamicCast((NLENode) it2.next().getMainSegment()) != null) {
                            arrayList.add(nLETrack);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            model.removeTrack((NLETrack) it3.next());
        }
        nLEEditor.commit();
        InterfaceC1452170ntP value2 = Z4().g().getValue();
        if (value2 != null) {
            value2.refreshCurrentFrame();
        }
    }

    public final void J6() {
        String aid;
        Aweme aweme;
        C1450600nqs c1450600nqsV5 = v5();
        Boolean boolValueOf = null;
        if (c1450600nqsV5 != null && (aweme = c1450600nqsV5.aweme) != null) {
            boolValueOf = Boolean.valueOf(C1354660lM8.LIZJ(aweme));
        }
        if (C1346420l8q.LIZIZ(boolValueOf)) {
            return;
        }
        C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
        Aweme aweme2 = v5().aweme;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        C1451970nt5.LIZ(c1451970nt5, "visual_poet", null, "entry", aid, true, 2);
        C1450590nqr c1450590nqrK4 = K4();
        if (c1450590nqrK4 != null) {
            c1450590nqrK4.jV0();
        }
    }

    public final void N6() {
        String aid;
        InterfaceC1450620nqu interfaceC1450620nquX5 = x5();
        if (interfaceC1450620nquX5 == null || !interfaceC1450620nquX5.Qf()) {
            return;
        }
        C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
        Aweme aweme = v5().aweme;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C1451970nt5.LIZ(c1451970nt5, "text", null, "entry", aid, false, 18);
        Z4().x7(false, false, false, false);
    }

    @Override // X.InterfaceC1451690nsd
    public boolean dl1() {
        List<TextStickerModel> listC1;
        InterfaceC1450620nqu interfaceC1450620nquX5 = x5();
        if (interfaceC1450620nquX5 != null && (listC1 = interfaceC1450620nquX5.c1()) != null && (!listC1.isEmpty())) {
            C1451610nsV.LIZ(v5(), "text");
        }
        return (v5().editList.isEmpty() ^ true) || v5().createByAi;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        i3(AFwS261S0000000_22.get$arr$(34));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Boolean> liveDataXk2;
        super.onCreate();
        O4().kF(this);
        Z4().g().observe(this, new AObserverS225S0100000_22(this, 5));
        i3(AFwS261S0000000_22.get$arr$(35));
        InterfaceC1451870nsv interfaceC1451870nsvP4 = P4();
        if (interfaceC1451870nsvP4 == null || (liveDataXk2 = interfaceC1451870nsvP4.xk2()) == null) {
            return;
        }
        liveDataXk2.observe(this, new AObserverS225S0100000_22(this, 6));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLJJIJIIJIL, null);
        O4().b8(this);
        ha();
    }

    public final void save() throws Throwable {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value2;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        LiveData<InterfaceC1452170ntP> liveDataG = Z4().g();
        if (liveDataG != null && (value2 = liveDataG.getValue()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
            nLEEditor2.commit();
        }
        LiveData<InterfaceC1452170ntP> liveDataG2 = Z4().g();
        if (liveDataG2 != null && (value = liveDataG2.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            nLEEditor.done();
        }
        C0FNV.LIZJ(t5());
        C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
        boolean zDl1 = dl1();
        c1451970nt5.getClass();
        C1451970nt5.LIZIZ("done_button", "exit_saved", zDl1);
        if (dl1()) {
            U5(true);
        } else {
            C0FNV.LIZ(t5());
            getActivity().finish();
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        i3(new AwS601S0100000_22(this, 41));
    }

    @Override // X.InterfaceC1451690nsd
    public C560530Lyd<Boolean> Ui() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451880nsw> o2() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451960nt4> w2() {
        return this.LLJLL;
    }

    private final void P6(String str) {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        if (str != null && str.length() != 0 && (value = Z4().g().getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(0)) != null) {
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceFile(str);
            nLESegmentVideo.setAVFile(nLEResourceAV);
            slotByIndex.setMainSegment(nLESegmentVideo);
            nLEEditor.commit();
            InterfaceC1452170ntP value2 = Z4().g().getValue();
            if (value2 != null) {
                value2.refreshCurrentFrame();
            }
        }
    }

    private final void U5(boolean z) throws Throwable {
        if (v5().editList.isEmpty() && v5().createByAi && z) {
            Intent intent = new Intent();
            AIChatGenNode aIChatGenNode = v5().imageAIChatGenNode;
            if (!(aIChatGenNode instanceof Parcelable)) {
                aIChatGenNode = null;
            }
            intent.putExtra("key_ai_chat_callback_data", (Parcelable) aIChatGenNode);
            intent.putExtra("edited_image_width", v5().imageAiWidth);
            intent.putExtra("edited_image_height", v5().imageAiHeight);
            intent.putExtra("image_path", v5().imageAiPath);
            intent.putExtra("edited_image_create_by_ai", true);
            C2204961BRm.LJIIL(102, getActivity(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaK77FbTRy1eSuimOIk1XJLsyEYLiN7Ri/NKtwvLkoqPaer8ZUY6tw4LFjquq6x9XC+Q8=", null));
            C0FNV.LIZ(t5());
            getActivity().finish();
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), new C639070P4v(CoroutineExceptionHandler.LJJLIL, this, 0), null, new C0NTG(this, z, null), 2);
    }

    public final void D5(InterfaceC1452170ntP interfaceC1452170ntP) {
        interfaceC1452170ntP.uf(0, interfaceC1452170ntP.getDuration());
    }

    public final boolean F4(Context context) {
        InterfaceC1519705xD.LIZ.getClass();
        return C0XF1.LIZLLL(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H5(X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0NTM
            if (r0 == 0) goto L48
            r5 = r7
            X.0NTM r5 = (X.C0NTM) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            android.app.Activity r0 = r6.getActivity()
            boolean r0 = r6.F4(r0)
            if (r0 != 0) goto L56
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0NTO r1 = new X.0NTO
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r4) goto L22
            return r4
        L48:
            X.0NTM r5 = new X.0NTM
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451860nsu.H5(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1451690nsd
    public void Ps2(boolean z) {
        i3(new AwS35S0010000_22(z, 4));
    }

    public C1451860nsu(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451890nsx.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450620nqu.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451590nsT.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451870nsv.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C1450590nqr.class, null);
        this.LLJJIJIIJIL = C2296808zG.LIZIZ();
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
        this.LLJJJIL = new AwS566S0100000_22(this, 43);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C19571411hg.class, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 45));
        this.LLJJJJLIIL = new SafeHandler(this);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC524950KiL.class, null);
        this.LLJL = C1664770tQJ.LIZ(getDiContainer(), Boolean.class, null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 44));
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.LLJLL = new AwS566S0100000_22(this, 47);
        this.LLJLLIL = new C560530Lyd<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6(boolean r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451860nsu.m6(boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (T4().isShowing()) {
            return false;
        }
        if (i == 4 && dl1()) {
            C1347740lAy.LJ(getActivity(), new AwS566S0100000_22(this, 46), AFwS210S0000000_22.get$arr$(39));
            return true;
        }
        C1451970nt5.LIZ.getClass();
        C1451970nt5.LIZIZ("back_button", "exit_discarded", false);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N5(android.app.Activity r23, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r24, boolean r25, X.InterfaceC1364105Vn<? super X.InterfaceC1155720gBG> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1451860nsu.N5(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, X.05Vn):java.lang.Object");
    }
}
