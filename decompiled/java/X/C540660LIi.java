package X;

import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540660LIi extends AbstractC2255721DQs<C0L0V> implements C0L0V, InterfaceC379610EuV {
    public static final C540700LIm LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1DRG LL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public CreativeLoadingDialog LLJ;
    public int LLJI;
    public C09AE LLJILJIL;
    public final C0L0V LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), Bundle.class, null);
    public final Handler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public int LLJIJIL = 95;
    public final ARunnableS108S0100000_8 LLJILJILJ = new ARunnableS108S0100000_8(this, 43);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0LIm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C540660LIi.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C540660LIi.class, "arguments", "getArguments()Landroid/os/Bundle;", 0)};
        LLJILLL = new Object() { // from class: X.0LIm
        };
        LLJJI = 8;
    }

    private final void B3() {
        String str;
        String str2 = this.LLILZLL;
        if (str2 == null || (str = this.LLIZ) == null) {
            return;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRELOAD-FIRED key=");
        sbLIZ.append(str2);
        sbLIZ.append('#');
        sbLIZ.append(str);
        sbLIZ.append(" hasService=");
        sbLIZ.append(H2() != null);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Album.Init", C2188811AlT.LIZIZ(sbLIZ));
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadServiceH2 = H2();
        if (iLyricsRuleTemplatePreloadServiceH2 != null) {
            iLyricsRuleTemplatePreloadServiceH2.LJ(C786410Ut5.L3(getActivity()), str2, str, Z1(), null);
        }
    }

    private final Bundle G2() {
        return (Bundle) this.LLILZ.getValue(this, LLJJ[1]);
    }

    private final ILyricsRuleTemplatePreloadService H2() {
        return (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
    }

    private final void X1() {
        this.LLILZIL.removeCallbacks(this.LLJILJILJ);
        this.LLJI = 0;
        this.LLJIJIL = 95;
    }

    private final InterfaceC1437705jz<AVMusic> Z1() {
        return new InterfaceC1437705jz<AVMusic>() { // from class: X.0LIl
            @Override // X.InterfaceC1437705jz
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1437705jz
            public final void LIZ(Exception exc) {
                C540660LIi c540660LIi = this.LIZ;
                C786410Ut5.LJJZZIII(c540660LIi.LLILZIL, new ARunnableS108S0100000_8(c540660LIi, 42));
            }

            @Override // X.InterfaceC1437705jz
            public final void LIZIZ(AVMusic aVMusic, boolean z) {
                C540660LIi c540660LIi = this.LIZ;
                C786410Ut5.LJJZZIII(c540660LIi.LLILZIL, new ARunnableS108S0100000_8(c540660LIi, 44));
            }
        };
    }

    private final Activity getActivity() {
        return (Activity) this.LLILLL.getValue(this, LLJJ[0]);
    }

    public final void T2() {
        String str;
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadServiceH2;
        String str2 = this.LLILZLL;
        if (str2 == null || (str = this.LLIZ) == null || (iLyricsRuleTemplatePreloadServiceH2 = H2()) == null || !iLyricsRuleTemplatePreloadServiceH2.LJII(str2, str)) {
            return;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TOAST key=");
        sbLIZ.append(str2);
        sbLIZ.append('#');
        sbLIZ.append(str);
        C1426005i6.LIZJ(c1398350mUb, "Anchor.Album.EffectNotSupported", C2188811AlT.LIZIZ(sbLIZ));
        Activity activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131830633);
        C1390380mHk.LIZ(activity, 1076, creativeToastBuilder);
    }

    public final void W2() {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CANCELLED key=");
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('#');
        String str2 = this.LLIZ;
        sbLIZ.append(str2 != null ? str2 : "");
        C1426005i6.LIZJ(c1398350mUb, "Anchor.Album.UserCancel", C2188811AlT.LIZIZ(sbLIZ));
        C09AE c09ae = this.LLJILJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        CreativeLoadingDialog creativeLoadingDialog = this.LLJ;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
    }

    @Override // X.C0L0V
    public Pair<AVMusic, String> bh2() {
        String str;
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadServiceH2;
        AVMusic aVMusicLIZ;
        String str2;
        String str3 = this.LLILZLL;
        if (str3 == null || (str = this.LLIZ) == null || (iLyricsRuleTemplatePreloadServiceH2 = H2()) == null || (aVMusicLIZ = iLyricsRuleTemplatePreloadServiceH2.LIZ(str3, str)) == null || (str2 = aVMusicLIZ.path) == null || str2.length() <= 0) {
            return null;
        }
        return new Pair<>(aVMusicLIZ, str2);
    }

    private final void c3() {
        Object c098200Yq;
        if (!G2().getBoolean("from_lyric_effect_anchor", false)) {
            C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Album.Init", "PARSE-SKIP no-flag");
            return;
        }
        String string = G2().getString("lyric_effect_anchor_info");
        if (string == null) {
            C1426005i6.LIZJ(C1398350mUb.LIZIZ, "Anchor.Album.Init", "PARSE-FAIL-MISSING-INFO");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("music_id");
            String strOptString2 = jSONObject.optString("resource_id");
            if (strOptString.length() != 0 && strOptString2.length() != 0) {
                this.LLILZLL = strOptString;
                this.LLIZ = strOptString2;
                this.LLIZLLLIL = true;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PARSE-FAIL-JSON cls=");
            sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
            sbLIZ.append(" msg=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1426005i6.LIZJ(c1398350mUb, "Anchor.Album.Init", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (ii0()) {
            C1426005i6.LIZ(C1398350mUb.LIZIZ, "Anchor.Album.Init", "PARSE-OK key=" + this.LLILZLL + '#' + this.LLIZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        c3();
        if (ii0()) {
            B3();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        X1();
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0L0V
    public boolean ii0() {
        return this.LLIZLLLIL;
    }

    public C0L0V w2() {
        return this.LLILLJJLI;
    }

    public C540660LIi(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final CreativeLoadingDialog o2(Activity activity) {
        CreativeLoadingDialog creativeLoadingDialog = this.LLJ;
        if (creativeLoadingDialog != null) {
            return creativeLoadingDialog;
        }
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.loadingMessage(activity.getString(R.string.txr));
        creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(this, 169));
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, 1027, creativeLoadingDialogBuilder);
        this.LLJ = creativeLoadingDialogCreateLoadingDialog;
        return creativeLoadingDialogCreateLoadingDialog;
    }

    private final void v3(Activity activity) {
        o2(activity).show();
        this.LLJI = 0;
        this.LLILZIL.removeCallbacks(this.LLJILJILJ);
        C786410Ut5.LJLIIL(200L, this.LLILZIL, this.LLJILJILJ);
    }

    private final void q3(Activity activity, boolean z) {
        int i;
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadServiceH2;
        String str = this.LLILZLL;
        String str2 = this.LLIZ;
        if (z && str != null && str2 != null && (iLyricsRuleTemplatePreloadServiceH2 = H2()) != null && iLyricsRuleTemplatePreloadServiceH2.LJII(str, str2)) {
            i = 2131830633;
        } else {
            i = 2131829438;
        }
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(i);
        C1390380mHk.LIZ(activity, 1076, creativeToastBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    @Override // X.C0L0V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O01(android.app.Activity r22, X.InterfaceC1364105Vn<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540660LIi.O01(android.app.Activity, X.05Vn):java.lang.Object");
    }

    public final void W1(EditorProRecordVideoContext editorProRecordVideoContext, AVMusic aVMusic, String str) {
        MusicBuzModel musicBuzModel;
        editorProRecordVideoContext.musicPath = str;
        editorProRecordVideoContext.musicOrigin = "lyric_effect_anchor";
        editorProRecordVideoContext.disableBGM = false;
        CreativeModel creativeModel = editorProRecordVideoContext.creativeModel;
        if (creativeModel != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            C1452640nuA.LJII(aVMusic, false, musicBuzModel);
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("APPLIED musicId=");
        sbLIZ.append(aVMusic.id);
        sbLIZ.append(" localPath=");
        sbLIZ.append(str);
        C1426005i6.LIZ(c1398350mUb, "Anchor.Album.ApplyMusic", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0L0V
    public void mD2(Activity activity, EditorProRecordVideoContext editorProRecordVideoContext, Function0<Unit> function0) {
        String str;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ENTRY isFromLyricEffectAnchor=");
        sbLIZ.append(ii0());
        C1426005i6.LIZ(c1398350mUb, "Anchor.Album.GateRecord", C2188811AlT.LIZIZ(sbLIZ));
        if (!ii0()) {
            C1426005i6.LIZ(c1398350mUb, "Anchor.Album.GateRecord", "BYPASS not-anchor");
            function0.invoke();
            return;
        }
        String str2 = this.LLILZLL;
        String str3 = this.LLIZ;
        ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadServiceH2 = H2();
        boolean z = false;
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0 && iLyricsRuleTemplatePreloadServiceH2 != null) {
            AVMusic aVMusicLIZ = iLyricsRuleTemplatePreloadServiceH2.LIZ(str2, str3);
            if (aVMusicLIZ != null && (str = aVMusicLIZ.path) != null && str.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FAST-PATH key=");
                sbLIZ2.append(str2);
                sbLIZ2.append('#');
                sbLIZ2.append(str3);
                C1426005i6.LIZ(c1398350mUb, "Anchor.Album.GateRecord", C2188811AlT.LIZIZ(sbLIZ2));
                W1(editorProRecordVideoContext, aVMusicLIZ, str);
                function0.invoke();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SLOW-PATH-START key=");
            sbLIZ3.append(str2);
            sbLIZ3.append('#');
            sbLIZ3.append(str3);
            sbLIZ3.append(" isPreloading=");
            sbLIZ3.append(iLyricsRuleTemplatePreloadServiceH2.LIZJ(str2, str3));
            C1426005i6.LIZ(c1398350mUb, "Anchor.Album.GateRecord", C2188811AlT.LIZIZ(sbLIZ3));
            iLyricsRuleTemplatePreloadServiceH2.LJ(C786410Ut5.L3(activity), str2, str3, null, null);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C540620LIe(this, activity, str2, str3, function0, iLyricsRuleTemplatePreloadServiceH2, editorProRecordVideoContext, null), 2);
            this.LLJILJIL = anonymousClass0956LIZLLL;
            anonymousClass0956LIZLLL.LJII(new AwS374S0200000_8(this, anonymousClass0956LIZLLL, 56));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("BYPASS missing-context musicId=");
        sbLIZ4.append(str2);
        sbLIZ4.append(" resourceId=");
        sbLIZ4.append(str3);
        sbLIZ4.append(" hasService=");
        if (iLyricsRuleTemplatePreloadServiceH2 != null) {
            z = true;
        }
        sbLIZ4.append(z);
        C1426005i6.LIZJ(c1398350mUb, "Anchor.Album.GateRecord", C2188811AlT.LIZIZ(sbLIZ4));
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(android.app.Activity r9, kotlin.Pair<java.lang.Integer, ? extends kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super java.lang.Boolean>, ? extends java.lang.Object>>[] r10, boolean r11, X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C540670LIj
            if (r0 == 0) goto L2a
            r7 = r12
            X.0LIj r7 = (X.C540670LIj) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r2 = r7.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r7.LLILZIL
            r6 = 95
            r5 = 0
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L38
            if (r1 != r0) goto L30
            boolean r11 = r7.LLILLJJLI
            java.lang.Object r9 = r7.LL
            android.app.Activity r9 = (android.app.Activity) r9
            goto L52
        L2a:
            X.0LIj r7 = new X.0LIj
            r7.<init>(r8, r12)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r2)
            r8.v3(r9)
            X.05z2 r2 = new X.05z2     // Catch: java.util.concurrent.CancellationException -> L96
            r2.<init>(r10, r8, r5)     // Catch: java.util.concurrent.CancellationException -> L96
            r7.LL = r9     // Catch: java.util.concurrent.CancellationException -> L96
            r7.LLILLJJLI = r11     // Catch: java.util.concurrent.CancellationException -> L96
            r7.LLILZIL = r0     // Catch: java.util.concurrent.CancellationException -> L96
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r7)     // Catch: java.util.concurrent.CancellationException -> L96
            if (r2 != r3) goto L55
            return r3
        L52:
            X.C155000ia.LIZIZ(r2)     // Catch: java.util.concurrent.CancellationException -> L96
        L55:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.util.concurrent.CancellationException -> L96
            if (r2 == 0) goto L5e
            boolean r3 = r2.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L96
            goto L5f
        L5e:
            r3 = 0
        L5f:
            android.os.Handler r1 = r8.LLILZIL
            Y.ARunnableS108S0100000_8 r0 = r8.LLJILJILJ
            r1.removeCallbacks(r0)
            r8.LLJI = r4
            r8.LLJIJIL = r6
            if (r3 == 0) goto L82
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r2 = r8.LLJ
            if (r2 == 0) goto L76
            r1 = 100
            r0 = 2
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog.DefaultImpls.updateProgress$default(r2, r1, r4, r0, r5)
        L76:
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r0 = r8.LLJ
            if (r0 == 0) goto L7d
            r0.dismiss()
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L82:
            X.0mUb r2 = X.C1398350mUb.LIZIZ
            java.lang.String r1 = "Anchor.Album.GateRunner"
            java.lang.String r0 = "FAIL gate failed or timed out (15s)"
            X.C1426005i6.LIZJ(r2, r1, r0)
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r0 = r8.LLJ
            if (r0 == 0) goto L92
            r0.dismiss()
        L92:
            r8.q3(r9, r11)
            goto L7d
        L96:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            android.os.Handler r1 = r8.LLILZIL
            Y.ARunnableS108S0100000_8 r0 = r8.LLJILJILJ
            r1.removeCallbacks(r0)
            r8.LLJI = r4
            r8.LLJIJIL = r6
            com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog r0 = r8.LLJ
            if (r0 == 0) goto Lac
            r0.dismiss()
        Lac:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C540660LIi.i3(android.app.Activity, kotlin.Pair[], boolean, X.05Vn):java.lang.Object");
    }
}
