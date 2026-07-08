package X;

import Y.ARunnableS108S0100000_8;
import Y.ARunnableS14S0400000_5;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceView;
import androidx.activity.ComponentActivity;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.cut_ui.IBinderWrapper;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC559670LxF extends AnonymousClass1476 implements InterfaceC497601wk {
    public AbstractBinderC539770LEx LLILLJJLI;
    public C1463860oCG LLILZIL;
    public INLEPlayer LLILZLL;
    public NLETemplateSource LLIZ;
    public NLETemplateModel LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public CutSource LLJJIII;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public ArrayList<MediaItem> LLJJJIL;
    public ArrayList<TextItem> LLJJJJ;
    public ArrayList<MediaItem> LLJJJJJIL;
    public long LLJJJJLIIL;
    public Intent LLJJL;
    public final CoroutineContext LL = C2107808No.LIZ.plus(C23118094a.LIZ());
    public final C559690LxH LLILLL = new NLEEditorListener() { // from class: X.0LxH
        @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
        public final void onChanged() {
            AbstractActivityC559670LxF abstractActivityC559670LxF;
            C1463860oCG c1463860oCG;
            try {
                if (this.LIZ.LLILZ.getModel() == null || (c1463860oCG = (abstractActivityC559670LxF = this.LIZ).LLILZIL) == null) {
                    return;
                }
                c1463860oCG.setDataSource(abstractActivityC559670LxF.LLILZ.getModel());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                C559870LxZ.LIZIZ("cutui.CutPlayerActivity", "NLEEditor callback ", th);
            }
        }
    };
    public final NLEEditor LLILZ = new NLEEditor();
    public String LLJJIJI = "";
    public boolean LLJJLIIIJLLLLLLLZ = true;

    public abstract SurfaceView LLLLZIL();

    public void LLLZIL(float f) {
    }

    public void LLZLI() {
    }

    public void g(long j) {
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        this.LLJJLIIIJLLLLLLLZ = false;
        super.onPause();
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPause");
        INLEPlayer iNLEPlayer = this.LLILZLL;
        if ((iNLEPlayer != null ? iNLEPlayer.state() : null) != NLEPlayerState.STARTED) {
            this.LLJI = false;
            return;
        }
        this.LLJI = true;
        INLEPlayer iNLEPlayer2 = this.LLILZLL;
        if (iNLEPlayer2 != null) {
            iNLEPlayer2.pause();
        }
    }

    static {
        C2169008ee.LIZ.LIZ();
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, false, false, 7, null);
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZLLL();
    }

    public final void LLLLZI() {
        ArrayList<MediaItem> arrayList = this.LLJJJIL;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (MediaItem mediaItem : arrayList) {
                if (Intrinsics.LJFF(mediaItem.LIZIZ(), Uri.EMPTY)) {
                    arrayList2.add(mediaItem);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (LLLLZLLIL(new ArrayList<>(arrayList2))) {
                    C786410Ut5.LJLIIL(400L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS108S0100000_8(this, 116));
                    return;
                }
                return;
            }
        }
        CutSource cutSource = this.LLJJIII;
        final ArrayList<MediaItem> arrayList3 = this.LLJJJIL;
        final ArrayList<TextItem> arrayList4 = this.LLJJJJ;
        if (this.LLILZLL == null) {
            LLZ();
            LLLLZIL();
            InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTemplateData : nleTemplateSource = ");
            sbLIZ.append(this.LLIZ);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLIZ != null) {
                this.LLJILJIL = SystemClock.uptimeMillis();
                this.LLJILJILJ = SystemClock.uptimeMillis();
                LLLLZLL();
            } else {
                NLETemplateSource nLETemplateSource = new NLETemplateSource(this, cutSource, this.LLJJIJI);
                this.LLIZ = nLETemplateSource;
                nLETemplateSource.LJIIIZ(this.LLILLJJLI);
                nLETemplateSource.LJIIIIZZ(new C19859212n0(new C19858912mx(this)));
                nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.0LxG
                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onProgress(float f, String str) {
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        this.LIZ.LLJILJIL = SystemClock.uptimeMillis();
                        AbstractActivityC559670LxF abstractActivityC559670LxF = this.LIZ;
                        AbstractBinderC539770LEx abstractBinderC539770LEx = abstractActivityC559670LxF.LLILLJJLI;
                        if (abstractBinderC539770LEx != null) {
                            abstractBinderC539770LEx.report(1025, String.valueOf(abstractActivityC559670LxF.LLJILJIL - abstractActivityC559670LxF.LLJIJIL), null, null, null, null, null);
                        }
                        this.LIZ.runOnUiThread(new ARunnableS14S0400000_5(nLETemplateModel, this, arrayList3, arrayList4, 7));
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onSuccess(NLETemplateModel nLETemplateModel) {
                        this.LIZ.LLJILJILJ = SystemClock.uptimeMillis();
                        AbstractActivityC559670LxF abstractActivityC559670LxF = this.LIZ;
                        abstractActivityC559670LxF.LLIZLLLIL = nLETemplateModel;
                        abstractActivityC559670LxF.LLLLZLL();
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onError(int i, String str) {
                        InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("initTemplateData onError, code=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", message=");
                        sbLIZ2.append(str);
                        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.LLJILLL = SystemClock.uptimeMillis();
                        AbstractActivityC559670LxF abstractActivityC559670LxF = this.LIZ;
                        AbstractBinderC539770LEx abstractBinderC539770LEx = abstractActivityC559670LxF.LLILLJJLI;
                        if (abstractBinderC539770LEx != null) {
                            abstractBinderC539770LEx.report(1026, String.valueOf(abstractActivityC559670LxF.LLJILLL - abstractActivityC559670LxF.LLJIJIL), String.valueOf(i), str, null, null, null);
                        }
                    }
                });
                nLETemplateSource.LIZJ();
            }
            C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPlayerInitOk");
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
    }

    public void LLLZLZ() {
        CutSourceType cutSourceType;
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPlayerCompileStart");
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            CutSource cutSource = this.LLJJIII;
            String desc = (cutSource == null || (cutSourceType = cutSource.type) == null) ? null : cutSourceType.getDesc();
            CutSource cutSource2 = this.LLJJIII;
            abstractBinderC539770LEx.report(1002, desc, cutSource2 != null ? cutSource2.value : null, null, null, null, null);
        }
        this.LLJJJJLIIL = SystemClock.uptimeMillis();
    }

    public void LLZ() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPlayerDataOk");
        this.LLJIJIL = SystemClock.uptimeMillis();
    }

    public void LLZZ() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPlayerFirstFrameOk");
        this.LLJJI = SystemClock.uptimeMillis();
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            abstractBinderC539770LEx.report(1007, String.valueOf(this.LLJILJIL - this.LLJIJIL), String.valueOf(this.LLJILJILJ - this.LLJIJIL), String.valueOf(this.LLJJ - this.LLJIJIL), String.valueOf(this.LLJJI - this.LLJIJIL), null, null);
        }
    }

    public void f() {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onPlayerPrepareOk");
        this.LLJJ = SystemClock.uptimeMillis();
    }

    public final void LLLLZLL() {
        AbstractBinderC539770LEx abstractBinderC539770LEx;
        IBinderWrapper iBinderWrapper = (IBinderWrapper) getIntent().getParcelableExtra("reporter");
        IBinder iBinder = iBinderWrapper != null ? iBinderWrapper.iBinder : null;
        if ((iBinder instanceof AbstractBinderC539770LEx) && (abstractBinderC539770LEx = (AbstractBinderC539770LEx) iBinder) != null) {
            abstractBinderC539770LEx.report(1009, null, null, null, null, null, null);
        }
        C1463860oCG c1463860oCGLIZIZ = C0F9X.LIZIZ(new C0VSJ(getCacheDir(), "VEEditor").getAbsolutePath(), LLLLZIL());
        this.LLILZIL = c1463860oCGLIZIZ;
        INLEPlayer playerApi = c1463860oCGLIZIZ.getPlayerApi();
        if (playerApi != null) {
            this.LLILZLL = playerApi;
            INLEPlayer.DefaultImpls.addOnInfoListener$default(playerApi, new INLEListenerCommon() { // from class: X.0LxI
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
                public final void onCallback(int i, int i2, float f, String str) {
                    INLEMediaSettings mediaSettingApi;
                    AbstractActivityC559670LxF abstractActivityC559670LxF = this.LIZ;
                    if (i == 4116) {
                        INLEPlayer iNLEPlayer = abstractActivityC559670LxF.LLILZLL;
                        if (iNLEPlayer != null) {
                            iNLEPlayer.play();
                        }
                        C1463860oCG c1463860oCG = abstractActivityC559670LxF.LLILZIL;
                        if (c1463860oCG != null && (mediaSettingApi = c1463860oCG.getMediaSettingApi()) != null) {
                            ((C1463880oCI) mediaSettingApi).setLoopPlay(true);
                        }
                        abstractActivityC559670LxF.f();
                    }
                }
            }, false, 2, null);
            C389960FQs c389960FQs = (C389960FQs) playerApi;
            c389960FQs.setFirstFrameListener(new INLEListenerFirstFrame() { // from class: X.0LxM
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
                public final void onRendered() {
                    this.LIZ.LLZZ();
                }
            });
            c389960FQs.setVideoOutputListener(new INLEListenerVideoOutput() { // from class: X.0LxN
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
                public final void onRefresh(int i, long j) {
                    this.LL.g(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
            });
            c389960FQs.setOnErrorListener(new INLEListenerCommon() { // from class: X.0LxL
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
                public final void onCallback(int i, int i2, float f, String str) {
                    this.LIZ.LLZLLLL(i, str);
                }
            });
            c389960FQs.LJIJ = new INLEListenerPlayerStatus() { // from class: X.0LxK
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onDestroy() {
                    this.LIZ.LLZLI();
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onPause() {
                    this.LIZ.LLZZZIL(false);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onPlay() {
                    this.LIZ.LLZZZIL(true);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onStop() {
                    this.LIZ.LLZZZIL(false);
                }
            };
        }
        runOnUiThread(new ARunnableS108S0100000_8(this, 117));
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onDestroy");
        NLETemplateSource nLETemplateSource = this.LLIZ;
        if (nLETemplateSource != null) {
            nLETemplateSource.LIZLLL();
        }
        this.LLIZ = null;
        INLEPlayer iNLEPlayer = this.LLILZLL;
        if (iNLEPlayer != null) {
            iNLEPlayer.destroy();
        }
        this.LLILZLL = null;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public void onResume() throws Throwable {
        INLEPlayer iNLEPlayer;
        super.onResume();
        this.LLJJLIIIJLLLLLLLZ = true;
        Intent intent = this.LLJJL;
        if (intent != null) {
            this.LLJJJ = true;
            LLLLLZL(this, intent, 1002);
            INLEPlayer iNLEPlayer2 = this.LLILZLL;
            if (iNLEPlayer2 != null) {
                iNLEPlayer2.destroy();
            }
            this.LLILZLL = null;
        }
        this.LLJJL = null;
        if (!this.LLJI || (iNLEPlayer = this.LLILZLL) == null) {
            return;
        }
        iNLEPlayer.play();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onStop");
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public final boolean LLLLZLLIL(ArrayList<MediaItem> arrayList) throws Throwable {
        C537930L7v c537930L7v = new C537930L7v(arrayList, null, null, 6);
        Intent intent = new Intent("com.ss.android.ugc.cut_ui.process.PICKER");
        intent.setPackage(getPackageName());
        c537930L7v.LIZ(intent);
        if (C2204961BRm.LJJJJZ(getPackageManager(), intent, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb6S4cZDN2SE73dSUcMkYsFghsfec8Elv9he1Qjo=", null)).size() > 0) {
            intent.setPackage(getPackageName());
            intent.putExtra("picker_mode", "MULTI");
            intent.putExtra("zip_md5", this.LLJJIJI);
            intent.putExtras(getIntent());
            intent.addFlags(536870912);
            int size = C2204961BRm.LJJJJZ(getPackageManager(), intent, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yq2dNri75Q/b+B+1YP+jjy72wkXVcc9ONvA==", null)).size();
            if (size > 0) {
                if (size != 1) {
                    Intent intent2 = new Intent("com.bytedance.ies.nle.ui_base.CHOOSE");
                    intent2.setPackage(getPackageName());
                    intent2.putExtra("extra_intent", intent);
                    intent2.putExtra("extra_title", (CharSequence) null);
                    if (C2204961BRm.LJJJJZ(getPackageManager(), intent2, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yq2dNri75Q/b+B+1YP+jjy72wkXVcc9ONvA==", null)).size() > 0) {
                        intent = intent2;
                    }
                }
                this.LLJJIJIL = true;
                LLLLLZL(this, intent, LSPassThroughRecordSizeConfig.DEFAULT);
                return true;
            }
        }
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "can not launchPicker");
        return false;
    }

    public Intent LLLZZIL(String str) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerCompileSuccess : ");
        sbLIZ.append(str);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJJJJLIIL;
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            abstractBinderC539770LEx.report(1004, str, String.valueOf(jUptimeMillis), null, null, null, null);
        }
        AbstractBinderC539770LEx abstractBinderC539770LEx2 = this.LLILLJJLI;
        if (abstractBinderC539770LEx2 != null) {
            abstractBinderC539770LEx2.report(1003, null, null, null, null, null, null);
        }
        return new Intent();
    }

    public void LLZZLLIL(MediaItem mediaItem) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerMediaItemUpdate : ");
        sbLIZ.append(mediaItem);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LLZZZIL(boolean z) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerPlaying : ");
        sbLIZ.append(z);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        IBinder iBinder;
        AbstractBinderC539770LEx abstractBinderC539770LEx;
        String stringExtra;
        ArrayList<MediaItem> arrayListLIZ;
        super.onCreate(bundle);
        this.LLILZ.addConsumer(this.LLILLL);
        C786410Ut5.me(this, 0);
        C19W7 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        IBinderWrapper iBinderWrapper = (IBinderWrapper) getIntent().getParcelableExtra("reporter");
        if (iBinderWrapper != null) {
            iBinder = iBinderWrapper.iBinder;
        } else {
            iBinder = null;
        }
        if (iBinder instanceof AbstractBinderC539770LEx) {
            abstractBinderC539770LEx = (AbstractBinderC539770LEx) iBinder;
        } else {
            abstractBinderC539770LEx = null;
        }
        this.LLILLJJLI = abstractBinderC539770LEx;
        CutSource cutSource = (CutSource) getIntent().getParcelableExtra("arg_cut_source");
        this.LLJJIII = cutSource;
        try {
            stringExtra = getIntent().getStringExtra("zip_md5");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LLJJIJI = stringExtra;
        if (cutSource == null) {
            finish();
            return;
        }
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate start : ");
        sbLIZ.append(cutSource);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
        if (bundle != null) {
            ArrayList<MediaItem> parcelableArrayList = bundle.getParcelableArrayList("media_item_list");
            this.LLJJJIL = parcelableArrayList;
            ArrayList<TextItem> parcelableArrayList2 = bundle.getParcelableArrayList("text_item_list");
            this.LLJJJJ = parcelableArrayList2;
            this.LLJJIJIL = bundle.getBoolean("hasLaunchPicker", false);
            this.LLJJJ = bundle.getBoolean("hasLaunchNext", false);
            this.LLJJIJIIJIL = bundle.getBoolean("hasLaunchClip", false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCreate restore mediaItemList=");
            sbLIZ2.append(parcelableArrayList);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onCreate restore textItemList=");
            sbLIZ3.append(parcelableArrayList2);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onCreate restore hasLaunchPicker=");
            sbLIZ4.append(this.LLJJIJIL);
            sbLIZ4.append(", hasLaunchNext=");
            sbLIZ4.append(this.LLJJJ);
            sbLIZ4.append(", hasLaunchClip=");
            sbLIZ4.append(this.LLJJIJIIJIL);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ4));
        } else {
            if (abstractBinderC539770LEx != null) {
                abstractBinderC539770LEx.report(1001, cutSource.type.getDesc(), cutSource.value, null, null, null, null);
            }
            ArrayList<MediaItem> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("media_item_list");
            this.LLJJJIL = parcelableArrayListExtra;
            ArrayList<TextItem> parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("text_item_list");
            this.LLJJJJ = parcelableArrayListExtra2;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("onCreate init mediaItemList=");
            sbLIZ5.append(parcelableArrayListExtra);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("onCreate init textItemList=");
            sbLIZ6.append(parcelableArrayListExtra2);
            C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ6));
            try {
                String stringExtra2 = getIntent().getStringExtra("extra_opt");
                if (stringExtra2 != null && (arrayListLIZ = C0L8G.LIZ(stringExtra2)) != null && !arrayListLIZ.isEmpty()) {
                    LLLLZLLIL(arrayListLIZ);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C23250099c.LIZLLL(this, null, null, new C538430L9t(this, cutSource, stringExtra, abstractBinderC539770LEx, null), 3);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", "onCreate done");
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public static void LLLLZLLLI(List list, List list2) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i >= 0) {
                MediaItem mediaItem = (MediaItem) obj;
                if (mediaItem.isMutable) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.LJFF(((MediaItem) next).materialId, mediaItem.materialId)) {
                            obj2 = next;
                            break;
                        }
                    }
                    MediaItem mediaItem2 = (MediaItem) obj2;
                    if (mediaItem2 != null) {
                        MediaItem mediaItem3 = (MediaItem) ListProtector.get(list, i);
                        String str = mediaItem2.source;
                        String str2 = mediaItem2.mediaSrcPath;
                        ListProtector.set(list, i, MediaItem.LIZ(mediaItem3, null, 0L, 0L, false, 0.0f, 0, 0, 0L, str, mediaItem2.sourceStartTime, 0.0f, mediaItem2.crop, mediaItem2.type, str2, 0.0f, 565247));
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public void LLLZ(int i, String str) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerCompileError : ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJJJJLIIL;
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            abstractBinderC539770LEx.report(1005, String.valueOf(i), str, String.valueOf(jUptimeMillis), null, null, null);
        }
        AbstractBinderC539770LEx abstractBinderC539770LEx2 = this.LLILLJJLI;
        if (abstractBinderC539770LEx2 != null) {
            abstractBinderC539770LEx2.report(1003, null, null, null, null, null, null);
        }
    }

    public void LLZLLLL(int i, String str) {
        InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initPlayer onError, code=");
        sbLIZ.append(i);
        sbLIZ.append(", message=");
        sbLIZ.append(str);
        C559870LxZ.LIZIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLJ = i;
        AbstractBinderC539770LEx abstractBinderC539770LEx = this.LLILLJJLI;
        if (abstractBinderC539770LEx != null) {
            abstractBinderC539770LEx.report(1008, String.valueOf(i), str, null, null, null, null);
        }
    }

    public static void LLLLLZL(AbstractActivityC559670LxF abstractActivityC559670LxF, Intent intent, int i) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        int iIntValue = i;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(abstractActivityC559670LxF, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, abstractActivityC559670LxF);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/Ckjzj8ywdoXobgP7UczuHHlToSKdiEhB0A/UJyg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent, Integer.valueOf(iIntValue)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "startActivityForResult", abstractActivityC559670LxF, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "startActivityForResult", null, objArr, abstractActivityC559670LxF, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = abstractActivityC559670LxF;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = abstractActivityC559670LxF;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "com/ss/android/ugc/cut_ui_impl/newplayer/CutPlayerActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        long j;
        C537930L7v c537930L7vLIZ;
        super.onActivityResult(i, i2, intent);
        ArrayList<MediaItem> arrayList = null;
        mediaItem = null;
        mediaItem = null;
        mediaItem = null;
        MediaItem mediaItem = null;
        switch (i) {
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                this.LLJJIJIL = false;
                if (i2 == -1 && intent != null) {
                    C537930L7v c537930L7vLIZ2 = C537920L7u.LIZ(intent);
                    if (c537930L7vLIZ2 != null) {
                        arrayList = c537930L7vLIZ2.LIZ;
                    }
                    ArrayList<MediaItem> arrayList2 = this.LLJJJIL;
                    if (arrayList != null && arrayList2 != null) {
                        LLLLZLLLI(arrayList2, arrayList);
                        ArrayList<MediaItem> arrayList3 = this.LLJJJJJIL;
                        if (arrayList3 == null || arrayList3.isEmpty()) {
                            this.LLJJJJJIL = new ArrayList<>(arrayList2);
                        }
                        LLLLZI();
                    } else {
                        C786410Ut5.me(this, 0);
                        finish();
                    }
                } else {
                    C786410Ut5.me(this, R.anim.o);
                    finish();
                }
                break;
            case 1001:
                this.LLJJIJIIJIL = false;
                if (i2 == -1) {
                    if (intent != null && (c537930L7vLIZ = C537920L7u.LIZ(intent)) != null && (!c537930L7vLIZ.LIZ.isEmpty()) && (mediaItem = (MediaItem) ListProtector.get(c537930L7vLIZ.LIZ, 0)) != null) {
                        ArrayList<MediaItem> arrayList4 = this.LLJJJIL;
                        if (arrayList4 != null) {
                            Iterator<MediaItem> it2 = arrayList4.iterator();
                            int i3 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (Intrinsics.LJFF(it2.next().materialId, mediaItem.materialId)) {
                                        if (i3 != -1) {
                                            ListProtector.set(arrayList4, i3, MediaItem.LIZ((MediaItem) ListProtector.get(arrayList4, i3), null, 0L, 0L, false, 0.0f, 0, 0, 0L, mediaItem.source, mediaItem.sourceStartTime, 0.0f, mediaItem.crop, mediaItem.type, mediaItem.mediaSrcPath, 0.0f, 565247));
                                            NLETemplateModel nLETemplateModel = this.LLIZLLLIL;
                                            if (nLETemplateModel != null) {
                                                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("updateMediaItem: ");
                                                sbLIZ.append(mediaItem);
                                                C559870LxZ.LIZ("NLETemplateUtils", C2188811AlT.LIZIZ(sbLIZ));
                                                C0FQ1.LIZJ(nLETemplateModel, this, C1697810uHb.LJ(mediaItem));
                                            }
                                            this.LLILZ.setModel(this.LLIZLLLIL);
                                            this.LLILZ.commit();
                                            INLEPlayer iNLEPlayer = this.LLILZLL;
                                            if (iNLEPlayer != null) {
                                                iNLEPlayer.prepare();
                                            }
                                            LLZZLLIL(mediaItem);
                                            LLLLZI();
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                            C559870LxZ.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : invalid processItem");
                        } else {
                            InterfaceC559900Lxc interfaceC559900Lxc3 = C559870LxZ.LIZ;
                            C559870LxZ.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : currentList is null");
                        }
                    } else {
                        InterfaceC559900Lxc interfaceC559900Lxc4 = C559870LxZ.LIZ;
                        C559870LxZ.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : processItem is null");
                    }
                } else {
                    InterfaceC559900Lxc interfaceC559900Lxc5 = C559870LxZ.LIZ;
                    C559870LxZ.LJFF("cutui.CutPlayerActivity", "onActivityResult clip : cancel");
                }
                InterfaceC559900Lxc interfaceC559900Lxc6 = C559870LxZ.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onClipFinish : ");
                sbLIZ2.append(mediaItem);
                C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ2));
                if (mediaItem != null) {
                    j = mediaItem.targetStartTime;
                } else {
                    j = 0;
                }
                INLEPlayer iNLEPlayer2 = this.LLILZLL;
                if (iNLEPlayer2 != null) {
                    iNLEPlayer2.seekTime(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT), NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new INLEListenerSeek() { // from class: X.0LxJ
                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                        public final void onSeekDone(int i4) {
                            INLEPlayer iNLEPlayer3;
                            AbstractActivityC559670LxF abstractActivityC559670LxF = this.LIZ;
                            if (i4 == 0 && (iNLEPlayer3 = abstractActivityC559670LxF.LLILZLL) != null) {
                                iNLEPlayer3.play();
                            }
                        }
                    });
                }
                break;
            case 1002:
                this.LLJJJ = false;
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra("arg_finish_template_player", false)) {
                        C2204961BRm.P(intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/Ckjzj8ywdoXobgP7UczuHHlToSKdiEhB0A/UJyg==", null), this);
                        finish();
                    } else {
                        InterfaceC559900Lxc interfaceC559900Lxc7 = C559870LxZ.LIZ;
                        C559870LxZ.LIZJ("cutui.CutPlayerActivity", "onActivityResult next : cancel");
                        LLLLZI();
                    }
                } else {
                    InterfaceC559900Lxc interfaceC559900Lxc8 = C559870LxZ.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onActivityResult next : ");
                    sbLIZ3.append(i2);
                    C559870LxZ.LIZJ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ3));
                    finish();
                }
                break;
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }
}
