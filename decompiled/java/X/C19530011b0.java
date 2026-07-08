package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MemeSoundMusicParam;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS135S1200000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS60S0310000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11b0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19530011b0 extends AbstractC2255721DQs<InterfaceC1457820o2W> implements InterfaceC1457820o2W, InterfaceC379610EuV {
    public static final C19530311b3 LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C1DRG LL;
    public InterfaceC990330bsV LLILZIL;
    public C19521511Zd LLILZLL;
    public InterfaceC1631620sYq<? super Float, ? super Integer, ? super String, Unit> LLIZLLLIL;
    public C19529711ax LLJ;
    public long LLJI;
    public List<String> LLJILJILJ;
    public List<TTSModel> LLJILLL;
    public MemeSoundMusicParam LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public Function1<? super AVMusic, Unit> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public boolean LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1457820o2W LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19530111b1.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(259));
    public SafeHandler LLJIJIL = new SafeHandler(this);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);

    /* JADX WARN: Type inference failed for: r0v11, types: [X.11Zd, X.11a4] */
    @Override // X.InterfaceC1457820o2W
    public void gr2() {
        this.LLJJJ = false;
        if ((!this.LLJILJILJ.isEmpty()) && (!this.LLJILLL.isEmpty()) && this.LLJJ != null) {
            if (Z1().oh()) {
                return;
            }
            Z1().Ma1(new AwS608S0100000_29(this, 337));
            Z1().Cu0(this.LLJILJILJ, this.LLJILLL, this.LLJJ);
            C1419240n2I.LIZ(Z1(), false, false, false, null, false, 30);
            return;
        }
        C19529711ax c19529711ax = this.LLJ;
        if (c19529711ax != null && !c19529711ax.LJII) {
            Z1().Km1();
            return;
        }
        C1419240n2I.LIZ(Z1(), false, false, false, null, false, 30);
        this.LLJI = System.currentTimeMillis();
        Z1().Km1();
        final C19522911Zr c19522911Zr = new C19522911Zr();
        final VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c19522911Zr.LIZIZ("UploadVideoFrames", new InterfaceC19523111Zt<C11ZH>(videoPublishEditModelLJJJLIIL) { // from class: X.11ZG
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new C11ZH() { // from class: X.11ZE
                    @Override // X.C11ZH
                    public final C11ZF LJIIJJI() {
                        IEditMusicServiceApi iEditMusicServiceApi = (IEditMusicServiceApi) PluggableExtentionKt.pluggableSpi$default(IEditMusicServiceApi.class, false, false, false, 14, null);
                        String strLIZJ = iEditMusicServiceApi != null ? iEditMusicServiceApi.LIZJ() : null;
                        C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PPUploadVideoFramesAbility uploadVideoFrames-->curUploadUri:");
                        sbLIZ.append(strLIZJ);
                        C201955140j.LIZJ(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
                        if (strLIZJ != null && C123100dR.LIZ(strLIZJ)) {
                            C11ZF c11zf = new C11ZF();
                            c11zf.LIZ = strLIZJ;
                            return c11zf;
                        }
                        C11ZF c11zf2 = new C11ZF();
                        c11zf2.LJI = 2;
                        c11zf2.LJII = "upload uri is empty";
                        return c11zf2;
                    }
                };
            }
        });
        c19522911Zr.LIZIZ("FetchMemeAudioText", new InterfaceC19523111Zt<C11ZN>() { // from class: X.11Zh
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new C19521611Ze();
            }
        });
        final InterfaceC990330bsV interfaceC990330bsV = this.LLILZIL;
        if (interfaceC990330bsV != null) {
            c19522911Zr.LIZIZ("FetchTTSVoiceList", new InterfaceC19523111Zt<C11ZX>(interfaceC990330bsV) { // from class: X.11Zl
                public final InterfaceC990330bsV LIZ;

                @Override // X.InterfaceC19523111Zt
                public final C11ZA LJIIIIZZ() {
                    return new C11ZX(this.LIZ) { // from class: X.0cAv
                        public final InterfaceC990330bsV LIZ;

                        {
                            this.LIZ = interfaceC990330bsV;
                        }

                        @Override // X.C11ZX
                        public final Object LIZLLL(Map map, C11ZW c11zw) {
                            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c11zw));
                            this.LIZ.Fm(new C5183020f(c23260099m, 331), map);
                            Object objLIZ = c23260099m.LIZ();
                            if (objLIZ == C099R.LJFF()) {
                                C099Q.LIZJ(c11zw);
                            }
                            return objLIZ;
                        }
                    };
                }

                {
                    this.LIZ = interfaceC990330bsV;
                }
            });
            c19522911Zr.LIZIZ("FetchTTSAudio", new InterfaceC19523111Zt<C11Z8>(interfaceC990330bsV) { // from class: X.11ZC
                public final InterfaceC990330bsV LIZ;

                @Override // X.InterfaceC19523111Zt
                public final C11ZA LJIIIIZZ() {
                    return new C11Z8(this.LIZ) { // from class: X.11Z7
                        public final InterfaceC990330bsV LIZ;

                        {
                            this.LIZ = interfaceC990330bsV;
                        }

                        @Override // X.C11Z8
                        public final void LJIIIZ(List list, List list2, List list3, AwS124S0400000_29 awS124S0400000_29, AwS643S0100000_29 awS643S0100000_29) {
                            if (C703302op.LIZ((String) C13LP.LJJJJZI(list))) {
                                this.LIZ.Cm(list, list2, list3, awS124S0400000_29, awS643S0100000_29);
                            } else {
                                if (((CharSequence) C13LP.LJJJJZI(list)).length() == 0) {
                                    InterfaceC990330bsV interfaceC990330bsV2 = this.LIZ;
                                    C13BV c13bv = C13BV.INSTANCE;
                                    interfaceC990330bsV2.Cm(c13bv, list2, c13bv, awS124S0400000_29, awS643S0100000_29);
                                    return;
                                }
                                awS643S0100000_29.invoke(-1, "fetchTTSAudio param error");
                            }
                        }
                    };
                }

                {
                    this.LIZ = interfaceC990330bsV;
                }
            });
        }
        c19522911Zr.LIZIZ("FetchMusicList", new C11ZB());
        c19522911Zr.LIZIZ("DownloadMusic", new C11ZO());
        ?? r0 = new AbstractC19524211a4(c19522911Zr) { // from class: X.11Zd
            public final C19522911Zr LJIIJJI;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC19524011a2
            public final void LJI() {
                AbstractC1219760hqY abstractC1219760hqY = new AbstractC1219760hqY() { // from class: X.11ZJ
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "UploadVideoFrame";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "UploadVideoFrames");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C11ZJ.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPUploadVideoFramesAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.AbstractC19526011aM
                    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        return false;
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    @Override // X.AbstractC1219760hqY
                    public final Object LJJIJL(List list) {
                        boolean z;
                        String str;
                        Iterator it2 = list.iterator();
                        loop0: while (true) {
                            z = true;
                            while (it2.hasNext()) {
                                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                                if (!z || (str = (String) LJJIII(interfaceC19526611aS, "frame_uri")) == null || !C703302op.LIZ(str)) {
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                            return "_CONNECT_ID_DEFAULT";
                        }
                        return "_CONNECT_ID_TERMINATION_ERROR";
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
                    @Override // X.AbstractC1219760hqY
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r16, X.InterfaceC19526611aS r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
                        /*
                            Method dump skipped, instruction units count: 208
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZJ.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
                    }

                    @Override // X.AbstractC1219760hqY, X.AbstractC19526011aM
                    public final Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
                        return AbstractC1219760hqY.LJJIJIIJIL(this, interfaceC19526511aR, list, list2, interfaceC1364105Vn);
                    }
                };
                if (abstractC1219760hqY instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC1219760hqY).LJII();
                }
                abstractC1219760hqY.LJIJ("frame_uri", "video_frame_uri");
                abstractC1219760hqY.LJFF = 4;
                AbstractC19526011aM abstractC19526011aM = new AbstractC19526011aM() { // from class: X.11ZZ
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "FetchTexts";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchMemeAudioText");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C11ZZ.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchMemeAudioTextAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJIJJ(X.InterfaceC19526611aS r10, X.C11ZU r11) {
                        /*
                            r9 = this;
                            r8 = 0
                            if (r11 != 0) goto L4
                            return r8
                        L4:
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = r10.LJJ()
                            r1.append(r0)
                            java.lang.String r4 = "description"
                            r1.append(r4)
                            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                            long r6 = android.os.SystemClock.uptimeMillis()
                            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r11.LIZ
                            java.lang.Object r5 = r0.get(r1)
                            X.11ZT r5 = (X.C11ZT) r5
                            if (r5 == 0) goto L30
                            java.lang.Integer r2 = r5.LIZIZ
                            if (r2 != 0) goto L31
                            T r1 = r5.LIZ
                            boolean r0 = r1 instanceof java.util.List
                            if (r0 != 0) goto L47
                        L30:
                            return r8
                        L31:
                            long r0 = r5.LIZJ
                            long r6 = r6 - r0
                            int r0 = r2.intValue()
                            long r2 = (long) r0
                            r0 = 1000(0x3e8, double:4.94E-321)
                            long r2 = r2 * r0
                            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                            if (r0 >= 0) goto L30
                            T r1 = r5.LIZ
                            boolean r0 = r1 instanceof java.util.List
                            if (r0 != 0) goto L47
                            return r8
                        L47:
                            if (r1 == 0) goto L30
                            r9.LJJIJIIJI(r10, r4, r1)
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZZ.LJIJJ(X.11aS, X.11ZU):boolean");
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        Object objLJJIII;
                        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "description")) == null) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(interfaceC19526611aS.LJJ());
                        sbLIZ.append("description");
                        c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJIJI(X.InterfaceC19526511aR r17, java.util.List<? extends X.InterfaceC19526611aS> r18, java.util.List<? extends X.InterfaceC19526611aS> r19, X.InterfaceC1364105Vn<? super java.lang.String> r20) {
                        /*
                            r16 = this;
                            r3 = r20
                            boolean r0 = r3 instanceof X.C19521211Za
                            r9 = r16
                            if (r0 == 0) goto L9a
                            r8 = r3
                            X.11Za r8 = (X.C19521211Za) r8
                            int r2 = r8.LLILZLL
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r2 & r1
                            if (r0 == 0) goto L9a
                            int r2 = r2 - r1
                            r8.LLILZLL = r2
                        L16:
                            java.lang.Object r2 = r8.LLILZ
                            java.lang.Object r7 = X.C099R.LJFF()
                            int r0 = r8.LLILZLL
                            java.lang.String r6 = "description"
                            r5 = 1
                            if (r0 == 0) goto L52
                            if (r0 != r5) goto La1
                            X.11aS r10 = r8.LL
                            X.C155000ia.LIZIZ(r2)
                        L2a:
                            X.11ZF r2 = (X.C11ZF) r2
                            if (r2 == 0) goto Lbe
                            java.lang.String r1 = "log_id"
                            java.lang.String r0 = r2.LJIIIIZZ
                            r9.LJJIJIIJI(r10, r1, r0)
                            int r0 = r2.LJI
                            if (r0 != 0) goto La9
                            java.util.List<java.lang.String> r0 = r2.LIZIZ
                            boolean r0 = r0.isEmpty()
                            r0 = r0 ^ 1
                            if (r0 == 0) goto La9
                            java.lang.String r1 = "texts"
                            java.util.List<java.lang.String> r0 = r2.LIZIZ
                            r9.LJJIJIIJI(r10, r1, r0)
                            java.util.List<java.lang.String> r0 = r2.LIZJ
                            r9.LJJIJIIJI(r10, r6, r0)
                            java.lang.String r0 = "_CONNECT_ID_DEFAULT"
                            return r0
                        L52:
                            X.C155000ia.LIZIZ(r2)
                            java.util.List r0 = r17.LLILIL()
                            java.lang.Object r10 = X.C13LP.LJJJLL(r0)
                            X.11aS r10 = (X.InterfaceC19526611aS) r10
                            if (r10 == 0) goto Lbe
                            java.lang.String r0 = "frameUri"
                            java.lang.Object r4 = r9.LJJIII(r10, r0)
                            java.lang.String r4 = (java.lang.String) r4
                            if (r4 == 0) goto Lbe
                            java.lang.Object r3 = r9.LJJIII(r10, r6)
                            java.util.List r3 = (java.util.List) r3
                            if (r3 != 0) goto L75
                            X.13BV r3 = X.C13BV.INSTANCE
                        L75:
                            java.lang.String r1 = r9.LJIIIZ
                            java.lang.String r0 = "pp_data_key_error_handler"
                            r10.LJJIFFI(r1, r0)
                            X.11Zu r2 = r9.LJIIJ
                            X.1Bqa<java.lang.Object>[] r1 = X.C11ZZ.LJIIJJI
                            r0 = 0
                            r0 = r1[r0]
                            java.lang.Object r0 = r2.getValue(r9, r0)
                            X.11ZN r0 = (X.C11ZN) r0
                            if (r0 == 0) goto Lbe
                            r8.LL = r10
                            r8.LLILLJJLI = r4
                            r8.LLILLL = r3
                            r8.LLILZLL = r5
                            java.lang.Object r2 = r0.LJIILL(r4, r3, r8)
                            if (r2 != r7) goto L2a
                            return r7
                        L9a:
                            X.11Za r8 = new X.11Za
                            r8.<init>(r9, r3)
                            goto L16
                        La1:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r0)
                            throw r1
                        La9:
                            int r11 = r2.LJI
                            if (r11 != 0) goto Lae
                            r11 = -1
                        Lae:
                            X.13BV r0 = X.C13BV.INSTANCE
                            r9.LJJIJIIJI(r10, r6, r0)
                            java.lang.String r12 = r2.LJII
                            java.lang.String r13 = r9.LJIIIZ
                            java.lang.String r14 = r2.LJIIIIZZ
                            X.11YJ r15 = X.C11YJ.MUSIC_SERVER
                            r9.LJJIIZI(r10, r11, r12, r13, r14, r15)
                        Lbe:
                            java.lang.String r0 = "_CONNECT_ID_TERMINATION_ERROR"
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZZ.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
                    }
                };
                if (abstractC19526011aM instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC19526011aM).LJII();
                }
                abstractC19526011aM.LJIJ("frameUri", "video_frame_uri");
                abstractC19526011aM.LJIJ("texts", "text_list");
                abstractC19526011aM.LJIJ("description", "text_description");
                abstractC19526011aM.LJIJ("log_id", "server_log_id");
                abstractC19526011aM.LJFF = 4;
                AbstractC1219760hqY abstractC1219760hqY2 = new AbstractC1219760hqY() { // from class: X.11ZV
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "FetchVoiceList";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchTTSVoiceList");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C11ZV.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchTTSVoiceListAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.AbstractC1219760hqY
                    public final Object LJJIJL(List list) {
                        return "_CONNECT_ID_DEFAULT";
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJIJJ(X.InterfaceC19526611aS r9, X.C11ZU r10) {
                        /*
                            r8 = this;
                            r7 = 0
                            if (r10 != 0) goto L4
                            return r7
                        L4:
                            java.lang.String r1 = r9.LJJ()
                            long r5 = android.os.SystemClock.uptimeMillis()
                            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r10.LIZ
                            java.lang.Object r4 = r0.get(r1)
                            X.11ZT r4 = (X.C11ZT) r4
                            if (r4 == 0) goto L20
                            java.lang.Integer r2 = r4.LIZIZ
                            if (r2 != 0) goto L21
                            T r1 = r4.LIZ
                            boolean r0 = r1 instanceof java.util.List
                            if (r0 != 0) goto L37
                        L20:
                            return r7
                        L21:
                            long r0 = r4.LIZJ
                            long r5 = r5 - r0
                            int r0 = r2.intValue()
                            long r2 = (long) r0
                            r0 = 1000(0x3e8, double:4.94E-321)
                            long r2 = r2 * r0
                            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                            if (r0 >= 0) goto L20
                            T r1 = r4.LIZ
                            boolean r0 = r1 instanceof java.util.List
                            if (r0 != 0) goto L37
                            return r7
                        L37:
                            if (r1 == 0) goto L20
                            java.lang.String r0 = "voice_list"
                            r8.LJJIJIIJI(r9, r0, r1)
                            r0 = 1
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZV.LJIJJ(X.11aS, X.11ZU):boolean");
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        Object objLJJIII;
                        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "voice_list")) == null) {
                            return;
                        }
                        c11zu.LIZ(null, interfaceC19526611aS.LJJ(), objLJJIII);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0154  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x015a  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x0081 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:86:? A[LOOP:0: B:14:0x003a->B:86:?, LOOP_END, SYNTHETIC] */
                    @Override // X.AbstractC1219760hqY
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r19, X.InterfaceC19526611aS r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
                        /*
                            Method dump skipped, instruction units count: 352
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZV.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
                    }
                };
                if (abstractC1219760hqY2 instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC1219760hqY2).LJII();
                }
                abstractC1219760hqY2.LJIJ("voice_list", "voice_list");
                abstractC1219760hqY2.LJIJ("fetch_voice_list_result", "fetch_voice_list_result");
                abstractC1219760hqY2.LJFF = 4;
                AbstractC19526011aM abstractC19526011aM2 = new AbstractC19526011aM() { // from class: X.11Z5
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "FetchTTSAudioFile";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchTTSAudio");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C11Z5.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchTTSAudioAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.AbstractC19526011aM
                    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        return false;
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:191:0x0345  */
                    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.CharSequence] */
                    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.functions.Function1] */
                    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r2v95 */
                    /* JADX WARN: Type inference failed for: r2v96 */
                    /* JADX WARN: Type inference failed for: r2v97 */
                    /* JADX WARN: Type inference failed for: r3v26, types: [T, X.11UL] */
                    /* JADX WARN: Type inference failed for: r3v47 */
                    /* JADX WARN: Type inference failed for: r3v48 */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v13, types: [T] */
                    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.StringBuilder] */
                    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.CharSequence] */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJIJI(X.InterfaceC19526511aR r48, java.util.List<? extends X.InterfaceC19526611aS> r49, java.util.List<? extends X.InterfaceC19526611aS> r50, X.InterfaceC1364105Vn<? super java.lang.String> r51) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 880
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11Z5.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
                    }
                };
                if (abstractC19526011aM2 instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC19526011aM2).LJII();
                }
                abstractC19526011aM2.LJIJ("voice_list", "voice_list");
                abstractC19526011aM2.LJIJ("text_list", "text_list");
                abstractC19526011aM2.LJIJ("audio_files", "tts_audio_path_list");
                abstractC19526011aM2.LJIJ("speaker_id_list", "tts_speaker_id_list");
                abstractC19526011aM2.LJIJ("tts_model_list", "tts_model_list");
                abstractC19526011aM2.LJJIIJ("schedule_handler_all", C1697810uHb.LJIIJJI(abstractC19526011aM, abstractC1219760hqY2));
                abstractC19526011aM2.LJFF = 1;
                AbstractC19526011aM abstractC19526011aM3 = new AbstractC19526011aM() { // from class: X.11ZQ
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "FetchMusicList";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchMusicList");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C11ZQ.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchMusicListAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJIJJ(X.InterfaceC19526611aS r9, X.C11ZU r10) {
                        /*
                            r8 = this;
                            java.lang.String r0 = "upload_frames_uri"
                            java.lang.Object r1 = r8.LJJIII(r9, r0)
                            r7 = 0
                            if (r1 != 0) goto La
                            return r7
                        La:
                            if (r10 == 0) goto L24
                            long r5 = android.os.SystemClock.uptimeMillis()
                            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.11ZT<?>> r0 = r10.LIZ
                            java.lang.Object r4 = r0.get(r1)
                            X.11ZT r4 = (X.C11ZT) r4
                            if (r4 == 0) goto L24
                            java.lang.Integer r2 = r4.LIZIZ
                            if (r2 != 0) goto L25
                            T r1 = r4.LIZ
                            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.model.MusicModel
                            if (r0 != 0) goto L3b
                        L24:
                            return r7
                        L25:
                            long r0 = r4.LIZJ
                            long r5 = r5 - r0
                            int r0 = r2.intValue()
                            long r2 = (long) r0
                            r0 = 1000(0x3e8, double:4.94E-321)
                            long r2 = r2 * r0
                            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                            if (r0 >= 0) goto L24
                            T r1 = r4.LIZ
                            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.shortvideo.model.MusicModel
                            if (r0 != 0) goto L3b
                            return r7
                        L3b:
                            if (r1 == 0) goto L24
                            r7 = 1
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZQ.LJIJJ(X.11aS, X.11ZU):boolean");
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        String str;
                        Object objLJJIII;
                        if (c11zu == null || (str = (String) LJJIII(interfaceC19526611aS, "upload_frames_uri")) == null || (objLJJIII = LJJIII(interfaceC19526611aS, "music_model")) == null) {
                            return;
                        }
                        c11zu.LIZ(null, str, objLJJIII);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJIJI(X.InterfaceC19526511aR r18, java.util.List<? extends X.InterfaceC19526611aS> r19, java.util.List<? extends X.InterfaceC19526611aS> r20, X.InterfaceC1364105Vn<? super java.lang.String> r21) {
                        /*
                            Method dump skipped, instruction units count: 208
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C11ZQ.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
                    }
                };
                if (abstractC19526011aM3 instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC19526011aM3).LJII();
                }
                abstractC19526011aM3.LJIJ("creation_id", "creation_id");
                abstractC19526011aM3.LJIJ("shoot_way", "shoot_way");
                abstractC19526011aM3.LJIJ("enter_from", "enter_from");
                abstractC19526011aM3.LJIJ("upload_frames_uri", "video_frame_uri");
                abstractC19526011aM3.LJIJ("music_model", "music_model");
                abstractC19526011aM3.LJFF = 4;
                AbstractC19526011aM abstractC19526011aM4 = new AbstractC19526011aM() { // from class: X.11Zc
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
                    public final String LJIIIZ = "DownloadMusic";
                    public final C19523211Zu LJIIJ = new C19523211Zu(this, "DownloadMusic");

                    static {
                        C2217381BqS c2217381BqS = new C2217381BqS(C19521411Zc.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPDownloadMusicAbility;", 0);
                        C13LE.LIZ.getClass();
                        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
                    }

                    @Override // X.InterfaceC19524311a5
                    public final String LJIILLIIL() {
                        return this.LJIIIZ;
                    }

                    @Override // X.AbstractC19526011aM
                    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        String str;
                        MusicModel musicModel = (MusicModel) LJJIII(interfaceC19526611aS, "music_model");
                        if (musicModel == null) {
                            return false;
                        }
                        Object obj = null;
                        if (c11zu == null) {
                            return false;
                        }
                        String musicId = musicModel.getMusicId();
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        C11ZT<?> c11zt = c11zu.LIZ.get(musicId);
                        if (c11zt == null) {
                            return false;
                        }
                        Integer num = c11zt.LIZIZ;
                        if (num == null) {
                            Object obj2 = c11zt.LIZ;
                            if (obj2 instanceof String) {
                                obj = obj2;
                            }
                            str = (String) obj;
                        } else {
                            if (jUptimeMillis - c11zt.LIZJ >= ((long) num.intValue()) * 1000) {
                                return false;
                            }
                            Object obj3 = c11zt.LIZ;
                            if (obj3 instanceof String) {
                                obj = obj3;
                            }
                            str = (String) obj;
                        }
                        if (str == null || !C123100dR.LIZ(str)) {
                            return false;
                        }
                        return true;
                    }

                    @Override // X.AbstractC19526011aM
                    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                        MusicModel musicModel;
                        String str;
                        if (c11zu != null && (musicModel = (MusicModel) LJJIII(interfaceC19526611aS, "music_model")) != null && (str = (String) LJJIII(interfaceC19526611aS, "music_file_path")) != null && C123100dR.LIZ(str)) {
                            c11zu.LIZ(null, musicModel.getMusicId(), str);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
                    @Override // X.AbstractC19526011aM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJIJI(X.InterfaceC19526511aR r18, java.util.List<? extends X.InterfaceC19526611aS> r19, java.util.List<? extends X.InterfaceC19526611aS> r20, X.InterfaceC1364105Vn<? super java.lang.String> r21) {
                        /*
                            Method dump skipped, instruction units count: 226
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C19521411Zc.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
                    }
                };
                if (abstractC19526011aM4 instanceof InterfaceC19524011a2) {
                    ((InterfaceC19524011a2) abstractC19526011aM4).LJII();
                }
                abstractC19526011aM4.LJIJ("music_model", "music_model");
                abstractC19526011aM4.LJIJ("music_file_path", "music_file_path");
                abstractC19526011aM4.LJFF = 1;
                LJJIJIIJIL(abstractC1219760hqY, "_CONNECT_ID_DEFAULT", abstractC19526011aM);
                LJJIJIIJIL(abstractC19526011aM, "_CONNECT_ID_DEFAULT", abstractC19526011aM2);
                LJJIJIIJIL(abstractC1219760hqY2, "_CONNECT_ID_DEFAULT", abstractC19526011aM2);
                LJJIJIIJIL(abstractC1219760hqY, "_CONNECT_ID_DEFAULT", abstractC19526011aM3);
                LJJIJIIJIL(abstractC19526011aM3, "_CONNECT_ID_DEFAULT", abstractC19526011aM4);
                LJJIZ(C1697810uHb.LJIIJJI(abstractC1219760hqY, abstractC1219760hqY2));
                LJJIL(C1697810uHb.LJIIJJI(abstractC19526011aM2, abstractC19526011aM4), null);
            }

            @Override // X.AbstractC19524211a4
            public final void LJJIJL() {
                this.LIZLLL = this.LJIIJJI;
            }

            {
                this.LJIIJJI = c19522911Zr;
            }
        };
        this.LLILZLL = r0;
        r0.LJII();
        final C1211030hcT c1211030hcT = new C1211030hcT();
        C19529711ax c19529711ax2 = new C19529711ax(C1664590tQ1.LJII(this));
        this.LLJ = c19529711ax2;
        C19529911az c19529911az = new C19529911az(String.valueOf(hashCode()));
        c19529911az.LJJIFFI(LJJJLIIL().getCreationId(), "creation_id");
        c19529911az.LJJIFFI(LJJJLIIL().mShootWay, "shoot_way");
        c19529911az.LJJIFFI(LJJJLIIL().getEnterFrom(), "enter_from");
        c19529711ax2.LJII(c19529911az);
        C19529711ax c19529711ax3 = this.LLJ;
        if (c19529711ax3 != null) {
            c19529711ax3.LJFF.LIZ = new InterfaceC1210670hbt() { // from class: X.0iji
                @Override // X.InterfaceC1210670hbt
                public final void LIZ(boolean z, C19530211b2 c19530211b2, InterfaceC19526511aR interfaceC19526511aR) {
                    C01TT.LIZLLL(new AwS60S0310000_29(this, z, c19530211b2, interfaceC19526511aR, 0));
                }

                @Override // X.InterfaceC1210670hbt
                public final void LIZIZ(InterfaceC19526611aS interfaceC19526611aS, String str, int i, Boolean bool) {
                    C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startMemeAudio onProcess->item:");
                    sbLIZ.append(interfaceC19526611aS);
                    sbLIZ.append(" handlerId:");
                    sbLIZ.append(str);
                    sbLIZ.append(" handlerState:");
                    sbLIZ.append(i);
                    sbLIZ.append(" useCache:");
                    sbLIZ.append(bool);
                    C201955140j.LJIILJJIL(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
                    C01TT.LIZLLL(new AwS135S1200000_19(str, c1211030hcT, this, 2));
                }
            };
        }
        this.LLJIJIL.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(20000L, this.LLJIJIL, new ARunnableS129S0100000_29(this, 103));
        C19529711ax c19529711ax4 = this.LLJ;
        if (c19529711ax4 != null) {
            InterfaceC1413540mt6 interfaceC1413540mt6Q3 = q3();
            if (interfaceC1413540mt6Q3 != null) {
                interfaceC1413540mt6Q3.lz(null);
            }
            C19521511Zd c19521511Zd = this.LLILZLL;
            if (c19521511Zd != null) {
                c19521511Zd.LJJIJIL(c19529711ax4, B3());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.11b3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19530011b0.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19530011b0.class, "captionApiComponent", "getCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0), new C2217381BqS(C19530011b0.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C19530011b0.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C19530011b0.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C19530011b0.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new C2217381BqS(C19530011b0.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C19530011b0.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C19530011b0.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/VideoMixEditingAssetsApi;", 0), new C2217381BqS(C19530011b0.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C19530011b0.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C19530011b0.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.11b3
        };
    }

    private final C11ZU B3() {
        return (C11ZU) this.LLIZ.getValue();
    }

    private final InterfaceC1456910o13 T2() {
        return (InterfaceC1456910o13) this.LLJJL.getValue(this, LLJL[11]);
    }

    private final InterfaceC1455850nzL o2() {
        return (InterfaceC1455850nzL) this.LLJJJJJIL.getValue(this, LLJL[9]);
    }

    private final InterfaceC1415760mwg v3() {
        return (InterfaceC1415760mwg) this.LLJJJJ.getValue(this, LLJL[8]);
    }

    public final InterfaceC1453200nv4 G2() {
        return (InterfaceC1453200nv4) this.LLJJI.getValue(this, LLJL[3]);
    }

    public final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLJILJIL.getValue(this, LLJL[2]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJL[0]);
    }

    @Override // X.InterfaceC1457820o2W
    public boolean Ye2() {
        C19529711ax c19529711ax = this.LLJ;
        return (c19529711ax == null || c19529711ax.LJII || this.LLIZLLLIL == null) ? false : true;
    }

    public final InterfaceC19530111b1 Z1() {
        return (InterfaceC19530111b1) this.LLILZ.getValue(this, LLJL[1]);
    }

    public final InterfaceC1460000o62 c3() {
        return (InterfaceC1460000o62) this.LLJJJIL.getValue(this, LLJL[7]);
    }

    public final InterfaceC377540ErA i3() {
        return (InterfaceC377540ErA) this.LLJJIJI.getValue(this, LLJL[4]);
    }

    public final C19EG m3() {
        return (C19EG) this.LLJJJJLIIL.getValue(this, LLJL[10]);
    }

    public final InterfaceC1413540mt6 q3() {
        return (InterfaceC1413540mt6) this.LLJJIJIIJIL.getValue(this, LLJL[5]);
    }

    public final InterfaceC1417050myl w2() {
        return (InterfaceC1417050myl) this.LLJJIJIL.getValue(this, LLJL[6]);
    }

    public final void H3() {
        Z1().aL2();
        InterfaceC1631620sYq<? super Float, ? super Integer, ? super String, Unit> interfaceC1631620sYq = this.LLIZLLLIL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Float.valueOf(1.0f), -1, "cancel");
        }
        this.LLIZLLLIL = null;
        InterfaceC1413540mt6 interfaceC1413540mt6Q3 = q3();
        if (interfaceC1413540mt6Q3 != null) {
            interfaceC1413540mt6Q3.lz(null);
        }
    }

    public final void O3() {
        LiveEvent<Integer> liveEventEF2;
        C0ETY c0ety;
        Class<InterfaceC19530111b1> cls;
        AwS608S0100000_29 awS608S0100000_29;
        if (C338630DPh.LIZ()) {
            C1DRG diContainer = getDiContainer();
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC19530111b1.class;
                awS608S0100000_29 = new AwS608S0100000_29(this, 335);
            } else {
                if (!C365940EWi.LIZLLL(videoPublishEditModelLJJJLIIL)) {
                    InterfaceC19530111b1 interfaceC19530111b1 = (InterfaceC19530111b1) ((C05YF) diContainer.LJIIL(null, InterfaceC19530111b1.class));
                    if (interfaceC19530111b1 == null || (liveEventEF2 = interfaceC19530111b1.eF2()) == null) {
                        return;
                    }
                    liveEventEF2.LJII(this, Lifecycle.State.CREATED, new AObjectS247S0100000_29(this, 64));
                    return;
                }
                c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
                cls = InterfaceC19530111b1.class;
                awS608S0100000_29 = new AwS608S0100000_29(this, 336);
            }
            c0ety.Sd(cls, awS608S0100000_29);
        }
    }

    @Override // X.InterfaceC1457820o2W
    public TextStickerData Vf() {
        return Z1().Vf();
    }

    public final void W1() {
        if (LJJJLIIL().mIsFromDraft || l80().length() != 0) {
            if ((!this.LLJILJILJ.isEmpty()) && (!this.LLJILLL.isEmpty())) {
                return;
            }
            if (!LJJJLIIL().creativeModel.stickerModel.aiCaptionShuffleTexts.isEmpty()) {
                this.LLJILJILJ = LJJJLIIL().creativeModel.stickerModel.aiCaptionShuffleTexts;
            }
            if (!LJJJLIIL().creativeModel.stickerModel.aiCaptionShuffleTTSDatas.isEmpty()) {
                this.LLJILLL = LJJJLIIL().creativeModel.stickerModel.aiCaptionShuffleTTSDatas;
            }
            this.LLJJ = LJJJLIIL().creativeModel.stickerModel.memeSoundMusicParam;
        }
    }

    @Override // X.InterfaceC1457820o2W
    public boolean W11() {
        if (Ye2()) {
            sg1("");
            Z1().aL2();
            C1419240n2I.LIZ(Z1(), true, false, false, null, false, 30);
            return true;
        }
        if (Vf() == null) {
            return false;
        }
        Z1().Bk();
        return true;
    }

    public final C0FVT W2() {
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        InterfaceC1455850nzL interfaceC1455850nzLO2 = o2();
        if (interfaceC1455850nzLO2 == null || (c385670FAfAT = interfaceC1455850nzLO2.AT()) == null || (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) == null) {
            return null;
        }
        return interfaceC1461660o8iLIZJ.kR();
    }

    @Override // X.InterfaceC1457820o2W
    public String l80() {
        return Z1().j11();
    }

    @Override // X.InterfaceC1457820o2W
    public boolean oh() {
        return Z1().oh();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H2().ww2().observe(this, new AObserverS231S0100000_29(this, 95));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        H3();
        C19529711ax c19529711ax = this.LLJ;
        if (c19529711ax != null && !c19529711ax.LJII) {
            C19529711ax c19529711ax2 = this.LLJ;
            if (c19529711ax2 != null) {
                c19529711ax2.LJI = true;
            }
            C19529711ax c19529711ax3 = this.LLJ;
            if (c19529711ax3 != null) {
                c19529711ax3.LIZLLL();
            }
        }
        C19529711ax c19529711ax4 = this.LLJ;
        if (c19529711ax4 != null) {
            c19529711ax4.LJFF.LIZ = null;
        }
        this.LLJ = null;
        this.LLJIJIL.removeCallbacksAndMessages(null);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJILJILJ = c13bv;
        this.LLJILLL = c13bv;
        this.LLJJ = null;
    }

    public InterfaceC1457820o2W X1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19530011b0(C1DRG c1drg) {
        this.LL = c1drg;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJILJILJ = c13bv;
        this.LLJILLL = c13bv;
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1415760mwg.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    }

    @Override // X.InterfaceC1457820o2W
    public void JZ(Function1<? super AVMusic, Unit> function1) {
        this.LLJJIII = function1;
    }

    @Override // X.InterfaceC1457820o2W
    public void KE2(InterfaceC990330bsV interfaceC990330bsV) {
        this.LLILZIL = interfaceC990330bsV;
    }

    @Override // X.InterfaceC1457820o2W
    public void bC(InterfaceC1631620sYq<? super Float, ? super Integer, ? super String, Unit> interfaceC1631620sYq) {
        this.LLIZLLLIL = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC1457820o2W
    public void mX(String str) {
        C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeMemeAudio-->findMemeAudioSticker:");
        sbLIZ.append(Vf());
        C201955140j.LJIILJJIL(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
        if (Vf() == null && !Intrinsics.LJFF(str, "forced")) {
            H3();
            return;
        }
        Z1().Bk();
        if (!Intrinsics.LJFF(str, "capsule")) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_method", "capsule");
        C20684815ws.LJIILLIIL("delete_meme_audio", c0lab.LIZ);
    }

    @Override // X.InterfaceC1457820o2W
    public void sg1(String str) {
        Boolean boolValueOf;
        C19522211Zk c19522211Zk = C19522211Zk.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelMemeAudio ");
        C19529711ax c19529711ax = this.LLJ;
        if (c19529711ax != null) {
            boolValueOf = Boolean.valueOf(c19529711ax.LJII);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C201955140j.LJIILJJIL(c19522211Zk, C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(str, "click_cancel")) {
            this.LLJJJ = true;
            E3(this.LLJI, null);
            H3();
        } else {
            if (Intrinsics.LJFF(str, "cancel_from_select_music")) {
                InterfaceC1417050myl interfaceC1417050mylW2 = w2();
                if (interfaceC1417050mylW2 != null && interfaceC1417050mylW2.Z72()) {
                    return;
                }
                H3();
                return;
            }
            H3();
        }
    }

    public final void E3(long j, Boolean bool) {
        String str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str = "success";
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            str = "fail";
        } else {
            str = null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT), "duration");
        if (str != null) {
            c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        }
        C20684815ws.LJIILLIIL("meme_audio_loading_time", c0lab.LIZ);
    }
}
