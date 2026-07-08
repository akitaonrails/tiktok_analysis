package X;

import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModelKt;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import defpackage.d2;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348310lBt extends FrameLayout {
    public static final Set<EnumC1355290lN9> LLJLIL = Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS);
    public static final Set<EnumC1355300lNA> LLJLILLLLZIIL = Collections.singleton(EnumC1355300lNA.VOICE_CALL);
    public AudioCommentModel LL;
    public AnonymousClass0956 LLILLJJLI;
    public InterfaceC497601wk LLILLL;
    public CommentContextSource LLILZ;
    public TuxTextView LLILZIL;
    public C376870Eq5 LLILZLL;
    public View LLIZ;
    public ViewFlipper LLIZLLLIL;
    public String LLJ;
    public final C01GW LLJI;
    public View.OnClickListener LLJIJIL;
    public View LLJILJIL;
    public Drawable LLJILJILJ;
    public final BPEAHandler LLJILLL;
    public boolean LLJJ;
    public Function0<Unit> LLJJI;
    public long LLJJIII;
    public final ARunnableS116S0100000_16 LLJJIJI;
    public final ARunnableS116S0100000_16 LLJJIJIIJIL;
    public String LLJJIJIL;
    public Comment LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final AObserverS224S0100000_21 LLJJJJLIIL;
    public final AObserverS224S0100000_21 LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    public C1348310lBt(Context context) {
        this(context, null, 6);
    }

    public C1348310lBt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJFF() {
        this.LLJJJJJIL = false;
        getAudioPlayer().LIZLLL().removeObserver(this.LLJJJJLIIL);
        getAudioPlayer().getClass();
        C1348320lBu.LIZLLL.removeObserver(this.LLJJL);
    }

    private final NumberFormat getMinutesFormater() {
        return (NumberFormat) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final NumberFormat getSecondsFormater() {
        return (NumberFormat) this.LLJL.getValue();
    }

    public final boolean LIZ() {
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ == null) {
            return true;
        }
        EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.COMMENT_VOICE;
        businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
        AbstractC1883407Zg abstractC1883407ZgLJFF = businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, LLJLIL, new C1360910lWD(LLJLILLLLZIIL, new InterfaceC1360930lWF() { // from class: X.0Xqz
            @Override // X.InterfaceC1360930lWF
            public final void LIZ(EnumC1355300lNA enumC1355300lNA2, Set set) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Audio playback preempted by ");
                sbLIZ.append(enumC1355300lNA2);
                sbLIZ.append(", lost=");
                sbLIZ.append(set);
                sbLIZ.append("; pausing player");
                C2188811AlT.LIZIZ(sbLIZ);
                C1348310lBt c1348310lBt = this.LIZ;
                c1348310lBt.getAudioPlayer().LJI(c1348310lBt.LLJ, "preempted_by_voice_call");
            }
        }));
        if (!C1355270lN7.LIZIZ(abstractC1883407ZgLJFF)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Audio playback denied: ");
        sbLIZ.append(abstractC1883407ZgLJFF);
        C1344030l4z.LIZ("AudioPlaybackPreviewViewTAG", C2188811AlT.LIZIZ(sbLIZ));
        C1389880mGw c1389880mGw = new C1389880mGw(this);
        c1389880mGw.LJIIIIZZ(2131832241);
        c1389880mGw.LJIIJ();
        return false;
    }

    public final void LJIIIIZZ() {
        if (!this.LLJJJJJIL) {
            this.LLJJJJ = true;
            getAudioPlayer().LIZLLL().observeForever(this.LLJJJJLIIL);
            getAudioPlayer().getClass();
            C1348320lBu.LIZLLL.observeForever(this.LLJJL);
        }
        this.LLJJJJJIL = true;
    }

    public final C1348320lBu getAudioPlayer() {
        return (C1348320lBu) this.LLJI.getValue();
    }

    public final void LJ() {
        getAudioPlayer().LJIIIIZZ(this.LLJ, null);
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LJFF();
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZIZ(EnumC1355300lNA.COMMENT_VOICE);
        }
    }

    public final void LIZIZ(String str) {
        if (getAudioPlayer().LJIIJ(str)) {
            int iLJFF = getAudioPlayer().LJFF();
            getAudioPlayer().LIZ(str);
            LJIIJJI(iLJFF);
        }
    }

    public final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioStopped called with playId: ");
        sbLIZ.append(str);
        sbLIZ.append(", current playId: ");
        sbLIZ.append(this);
        sbLIZ.append(".playId");
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(this.LLJ, str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Stopping audio playback for: ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            LJIIJ(false, false);
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJFF();
            C376870Eq5 c376870Eq5 = this.LLILZLL;
            if (c376870Eq5 != null) {
                c376870Eq5.setProgress(1.0f);
            }
            AudioCommentModel audioCommentModel = this.LL;
            if (audioCommentModel != null) {
                TuxTextView tuxTextView = this.LLILZIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(LIZJ(audioCommentModel.totalDurationMillis, true));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Progress reset - duration: ");
                sbLIZ3.append(audioCommentModel.totalDurationMillis);
                sbLIZ3.append("ms");
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            BusinessCapabilityService.LIZ.getClass();
            BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
            if (businessCapabilityServiceLIZ != null) {
                businessCapabilityServiceLIZ.LJ(EnumC1355300lNA.COMMENT_VOICE, LLJLIL);
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Audio stop ignored - playId mismatch: ");
        sbLIZ4.append(str);
        sbLIZ4.append(" vs ");
        sbLIZ4.append(this);
        sbLIZ4.append(".playId");
        C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final void LJIIIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Starting progress updates for playId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LLILLL;
        if (interfaceC497601wk != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C859290XnL(str, this, null), 3);
        }
        this.LLILLJJLI = anonymousClass0956LIZLLL;
    }

    public final void LJIIJJI(long j) {
        if (this.LL != null) {
            C376870Eq5 c376870Eq5 = this.LLILZLL;
            if (c376870Eq5 != null) {
                c376870Eq5.setProgress(getAudioPlayer().LIZ(this.LLJ));
            }
            if (getAudioPlayer().LJIIJJI(this.LLJ) > 0) {
                getAudioPlayer().LJIIJJI(this.LLJ);
            }
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                tuxTextView.setText(LIZJ(j, false));
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        View view2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.LLJILLL.removeCallbacks(this.LLJJIJI);
                    this.LLJILLL.removeCallbacks(this.LLJJIJIIJIL);
                    Drawable drawable = this.LLJILJILJ;
                    if (drawable != null && (view2 = this.LLJILJIL) != null) {
                        view2.setBackground(drawable);
                    }
                    this.LLJILJILJ = null;
                }
            } else {
                this.LLJILLL.removeCallbacks(this.LLJJIJI);
                this.LLJILLL.removeCallbacks(this.LLJJIJIIJIL);
                Drawable drawable2 = this.LLJILJILJ;
                if (drawable2 != null && (view = this.LLJILJIL) != null) {
                    view.setBackground(drawable2);
                }
                this.LLJILJILJ = null;
                if (!this.LLJJ) {
                    View.OnClickListener onClickListener = this.LLJIJIL;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    AudioCommentModel audioCommentModel = this.LL;
                    if (audioCommentModel != null) {
                        if (getAudioPlayer().LJIIJ(this.LLJ)) {
                            d2.a value = getAudioPlayer().LIZLLL().getValue();
                            if (value instanceof d2.a.g) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Pausing audio: ");
                                sbLIZ.append(this.LLJ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                getAudioPlayer().LJI(this.LLJ, "click_pause_btn");
                                return true;
                            }
                            if (value instanceof d2.a.f) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Resuming audio: ");
                                sbLIZ2.append(this.LLJ);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (LIZ()) {
                                    getAudioPlayer().LJ(this.LLJ);
                                    return true;
                                }
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Stopping audio: ");
                                sbLIZ3.append(this.LLJ);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                getAudioPlayer().LJIIIIZZ(this.LLJ, null);
                                return true;
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Starting audio playback: ");
                            sbLIZ4.append(this.LLJ);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            if (LIZ()) {
                                LJIIIIZZ();
                                getAudioPlayer().LJIIIZ(this.LLJ, audioCommentModel);
                                return true;
                            }
                        }
                    } else {
                        C1344030l4z.LIZLLL("AudioPlaybackPreviewViewTAG", "togglePlayback called but audioModel is null");
                        return true;
                    }
                }
            }
            return true;
        }
        this.LLJJ = false;
        C786410Ut5.LJLIIL(70L, this.LLJILLL, this.LLJJIJI);
        C786410Ut5.LJLIIL(this.LLJJIII, this.LLJILLL, this.LLJJIJIIJIL);
        return true;
    }

    public final void setCellItemView(View view) {
        this.LLJILJIL = view;
    }

    public final String LIZJ(long j, boolean z) {
        int i;
        String strValueOf;
        String strValueOf2;
        if (z) {
            i = 500;
        } else {
            i = 0;
        }
        long j2 = j + ((long) i);
        if (j2 > 60000) {
            j2 = 60000;
        }
        long j3 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int i2 = (int) j5;
        try {
            strValueOf = getMinutesFormater().format(Integer.valueOf(i2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strValueOf = String.valueOf(i2);
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append(':');
        int i3 = (int) j6;
        try {
            strValueOf2 = getSecondsFormater().format(Integer.valueOf(i3));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            strValueOf2 = String.valueOf(i3);
        }
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIJ(boolean z, boolean z2) {
        if (z2) {
            ViewFlipper viewFlipper = this.LLIZLLLIL;
            if (viewFlipper != null) {
                viewFlipper.setDisplayedChild(2);
                return;
            }
            return;
        }
        if (z) {
            ViewFlipper viewFlipper2 = this.LLIZLLLIL;
            if (viewFlipper2 == null) {
                return;
            }
            viewFlipper2.setDisplayedChild(1);
            return;
        }
        ViewFlipper viewFlipper3 = this.LLIZLLLIL;
        if (viewFlipper3 == null) {
            return;
        }
        viewFlipper3.setDisplayedChild(0);
    }

    public C1348310lBt(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJ = "";
        this.LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(93));
        this.LLJILLL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIII = ViewConfiguration.getLongPressTimeout();
        this.LLJJIJI = new ARunnableS116S0100000_16(this, 27);
        this.LLJJIJIIJIL = new ARunnableS116S0100000_16(this, 26);
        this.LLJJIJIL = "";
        this.LLJJJIL = -1;
        this.LLJJJJ = true;
        this.LLJJJJLIIL = new AObserverS224S0100000_21(this, 18);
        this.LLJJL = new AObserverS224S0100000_21(this, 19);
        C786410Ut5.LJLLJ(getContext(), R.layout.agu, this);
        findViewById(R.id.cn_);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.z_f);
        this.LLILZIL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextSize(1, 14.0f);
        }
        this.LLILZLL = (C376870Eq5) findViewById(R.id.wave_view_audio_preview);
        this.LLIZ = findViewById(R.id.e_e);
        this.LLIZLLLIL = (ViewFlipper) findViewById(R.id.e_c);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(94));
        this.LLJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(95));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144 A[PHI: r6
      0x0144: PHI (r6v1 java.lang.Double) = (r6v0 java.lang.Double), (r6v3 java.lang.Double), (r6v3 java.lang.Double) binds: [B:68:0x0140, B:37:0x006b, B:39:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.Long r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348310lBt.LJI(java.lang.Long, java.lang.String, java.lang.String):void");
    }

    public static void LJII(C1348310lBt c1348310lBt, AudioCommentModel audioCommentModel, LifecycleCoroutineScope lifecycleCoroutineScope, CommentContextSource commentContextSource, String str, Comment comment, String str2, int i, int i2, ACListenerS155S0100000_21 aCListenerS155S0100000_21, int i3) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams;
        TuxTextView tuxTextView;
        int i4 = i;
        ACListenerS155S0100000_21 aCListenerS155S0100000_212 = aCListenerS155S0100000_21;
        int i5 = i2;
        Integer numValueOf2 = null;
        if ((i3 & 16) != 0) {
            comment = null;
        }
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        if ((i3 & 64) != 0) {
            i4 = -1;
        }
        if ((i3 & 128) != 0) {
            i5 = 0;
        }
        if ((i3 & 256) != 0) {
            aCListenerS155S0100000_212 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioModel called - duration: ");
        sbLIZ.append(audioCommentModel.totalDurationMillis);
        sbLIZ.append("ms, waveformData size: ");
        List<Float> list = audioCommentModel.waveformData;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        c1348310lBt.LL = audioCommentModel;
        c1348310lBt.LLILLL = lifecycleCoroutineScope;
        c1348310lBt.LLJIJIL = aCListenerS155S0100000_212;
        c1348310lBt.LLILZ = commentContextSource;
        c1348310lBt.LLJJIJIL = str;
        c1348310lBt.LLJJJ = comment;
        c1348310lBt.LLJJJIL = i4;
        C376870Eq5 c376870Eq5 = c1348310lBt.LLILZLL;
        if (c376870Eq5 != null) {
            c376870Eq5.setProgress(1.0f);
        }
        C376870Eq5 c376870Eq52 = c1348310lBt.LLILZLL;
        if (c376870Eq52 != null) {
            layoutParams = c376870Eq52.getLayoutParams();
        } else {
            layoutParams = null;
        }
        int iLIZIZ = i5 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(93));
        float fLIZ = C1341690l1D.LIZ(audioCommentModel.totalDurationMillis);
        float f = C376870Eq5.LLJILJIL;
        int i6 = (int) (fLIZ * f);
        int iLIZ = C1341690l1D.LIZ(audioCommentModel.totalDurationMillis);
        int i7 = (int) (iLIZIZ / f);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Audio model set maxWaveWidth = ");
        sbLIZ2.append(iLIZIZ);
        sbLIZ2.append(" width = ");
        sbLIZ2.append(i6);
        sbLIZ2.append(" barCount = ");
        sbLIZ2.append(iLIZ);
        sbLIZ2.append(" maxBarCount = ");
        sbLIZ2.append(i7);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (i6 > iLIZIZ && iLIZIZ > 0) {
            iLIZ = i7;
        } else {
            iLIZIZ = i6;
        }
        if (layoutParams != null) {
            layoutParams.width = iLIZIZ;
        }
        C376870Eq5 c376870Eq53 = c1348310lBt.LLILZLL;
        if (c376870Eq53 != null) {
            c376870Eq53.requestLayout();
        }
        C376870Eq5 c376870Eq54 = c1348310lBt.LLILZLL;
        if (c376870Eq54 != null) {
            List<Float> list2 = audioCommentModel.waveformData;
            ((ArrayList) c376870Eq54.LLILZLL).clear();
            ((ArrayList) c376870Eq54.LLILZLL).addAll(list2);
            c376870Eq54.LLIZ = iLIZ;
            ((ArrayList) c376870Eq54.LLIZLLLIL).clear();
            c376870Eq54.invalidate();
        }
        if (!C123100dR.LIZ(str2)) {
            str2 = AudioCommentModelKt.getPlayId(audioCommentModel);
        }
        c1348310lBt.LLJ = str2;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Audio model set - playId: ");
        sbLIZ3.append(c1348310lBt.LLJ);
        sbLIZ3.append(", waveView width: ");
        if (layoutParams != null) {
            numValueOf2 = Integer.valueOf(layoutParams.width);
        }
        sbLIZ3.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ3);
        AudioCommentModel audioCommentModel2 = c1348310lBt.LL;
        if (audioCommentModel2 != null && (tuxTextView = c1348310lBt.LLILZIL) != null) {
            tuxTextView.setText(c1348310lBt.LIZJ(audioCommentModel2.totalDurationMillis, true));
        }
        c1348310lBt.LJIIJ(false, false);
        c1348310lBt.LJIIIIZZ();
        if (c1348310lBt.getAudioPlayer().LJIIJ(c1348310lBt.LLJ)) {
            d2.a value = c1348310lBt.getAudioPlayer().LIZLLL().getValue();
            if (value instanceof d2.a.g) {
                c1348310lBt.LJIIJ(true, false);
                c1348310lBt.LIZIZ(c1348310lBt.LLJ);
                c1348310lBt.LJIIIZ(c1348310lBt.LLJ);
            } else if (value instanceof d2.a.h) {
                c1348310lBt.LJIIJ(true, true);
                c1348310lBt.LIZIZ(c1348310lBt.LLJ);
                c1348310lBt.LJIIIZ(c1348310lBt.LLJ);
            } else if (value instanceof d2.a.f) {
                c1348310lBt.LJIIJ(false, false);
                c1348310lBt.LIZIZ(c1348310lBt.LLJ);
            } else {
                c1348310lBt.LJIIJ(false, false);
            }
        }
    }
}
