package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IExploreFeedDebugService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20526015Tm extends C150D {
    public final Aweme LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final LogPbBean LLILZ;
    public final boolean LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final Boolean LLJ;
    public final long LLJI;
    public Long LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public boolean LLJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20526015Tm)) {
            return false;
        }
        C20526015Tm c20526015Tm = (C20526015Tm) obj;
        return Intrinsics.LJFF(this.LL, c20526015Tm.LL) && this.LLILLJJLI == c20526015Tm.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c20526015Tm.LLILLL) && Intrinsics.LJFF(this.LLILZ, c20526015Tm.LLILZ) && this.LLILZIL == c20526015Tm.LLILZIL && this.LLILZLL == c20526015Tm.LLILZLL && this.LLIZ == c20526015Tm.LLIZ && this.LLIZLLLIL == c20526015Tm.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c20526015Tm.LLJ) && this.LLJI == c20526015Tm.LLJI && Intrinsics.LJFF(this.LLJIJIL, c20526015Tm.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c20526015Tm.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c20526015Tm.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c20526015Tm.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c20526015Tm.LLJJ) && Intrinsics.LJFF(this.LLJJI, c20526015Tm.LLJJI) && this.LLJJIII == c20526015Tm.LLJJIII;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LogPbBean logPbBean = this.LLILZ;
        int iHashCode3 = (((((((((iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31;
        Boolean bool = this.LLJ;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Y2(this.LLJI)) * 31;
        Long l = this.LLJIJIL;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJJI;
        return ((iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJIII);
    }

    public final String toString() {
        return "ExploreFeedItem(aweme=" + this.LL + ", userDigged=" + this.LLILLJJLI + ", requestId=" + this.LLILLL + ", logPbBean=" + this.LLILZ + ", isCachedItem=" + this.LLILZIL + ", source=" + this.LLILZLL + ", isFirstScreen=" + this.LLIZ + ", isEnterGraphicDetail=" + this.LLIZLLLIL + ", debugSwitchFlipped=" + this.LLJ + ", requestTime=" + this.LLJI + ", lynxInterestId=" + this.LLJIJIL + ", lynxInterestName=" + this.LLJILJIL + ", lynxInsertSource=" + this.LLJILJILJ + ", lynxSubInsertSource=" + this.LLJILLL + ", lynxSpecialShapedCardTriggerType=" + this.LLJJ + ", lynxRequestId=" + this.LLJJI + ", shouldHighlight=" + this.LLJJIII + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[PHI: r2
      0x0047: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean) binds: [B:28:0x0044, B:13:0x001d, B:15:0x0023, B:17:0x0029, B:22:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Override // X.C150D, X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(X.InterfaceC1891350zJl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C20526015Tm
            r4 = 0
            if (r0 == 0) goto L49
            X.15Tm r6 = (X.C20526015Tm) r6
            if (r6 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.LL
        Lb:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 1
            if (r0 == 0) goto L43
            boolean r1 = r6.LLILLJJLI
            boolean r0 = r5.LLILLJJLI
            if (r1 != r0) goto L43
            r2 = 1
        L1b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()
            if (r1 == 0) goto L47
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LL
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r0.getPlayAddr()
        L37:
            boolean r0 = r1.equals(r4)
            if (r0 != r3) goto L47
            r0 = 1
        L3e:
            if (r2 == 0) goto L4c
            if (r0 == 0) goto L4c
            return r3
        L43:
            r2 = 0
            if (r6 == 0) goto L47
            goto L1b
        L47:
            r0 = 0
            goto L3e
        L49:
            r6 = r4
        L4a:
            r1 = r4
            goto Lb
        L4c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20526015Tm.areContentsTheSame(X.0zJl):boolean");
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C20526015Tm c20526015Tm;
        Aweme aweme;
        String aid = null;
        if (interfaceC1891350zJl instanceof C20526015Tm) {
            c20526015Tm = (C20526015Tm) interfaceC1891350zJl;
        } else {
            c20526015Tm = null;
        }
        String aid2 = this.LL.getAid();
        if (c20526015Tm != null && (aweme = c20526015Tm.LL) != null) {
            aid = aweme.getAid();
        }
        return Intrinsics.LJFF(aid2, aid);
    }

    @Override // X.C150D, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        VideoUrlModel playAddr;
        VideoUrlModel playAddr2;
        if (interfaceC1891350zJl instanceof C20526015Tm) {
            Video video = ((C20526015Tm) interfaceC1891350zJl).LL.getVideo();
            if (video != null && (playAddr = video.getPlayAddr()) != null) {
                Video video2 = this.LL.getVideo();
                if (video2 != null) {
                    playAddr2 = video2.getPlayAddr();
                } else {
                    playAddr2 = null;
                }
                if (playAddr.equals(playAddr2)) {
                    if (((C20526015Tm) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
                        return new Object() { // from class: X.15U8
                        };
                    }
                }
            }
            return new Object() { // from class: X.15U7
            };
        }
        return null;
    }

    public static C20526015Tm LIZ(C20526015Tm c20526015Tm, Aweme aweme, boolean z, int i) {
        String str;
        LogPbBean logPbBean;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        Boolean bool;
        long j;
        Long l;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z4;
        boolean z5 = z;
        Aweme aweme2 = aweme;
        if ((i & 1) != 0) {
            aweme2 = c20526015Tm.LL;
        }
        if ((i & 2) != 0) {
            z5 = c20526015Tm.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str = c20526015Tm.LLILLL;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            logPbBean = c20526015Tm.LLILZ;
        } else {
            logPbBean = null;
        }
        if ((i & 16) != 0) {
            z2 = c20526015Tm.LLILZIL;
        } else {
            z2 = false;
        }
        if ((i & 32) != 0) {
            i2 = c20526015Tm.LLILZLL;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            z3 = c20526015Tm.LLIZ;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            i3 = c20526015Tm.LLIZLLLIL;
        } else {
            i3 = 0;
        }
        if ((i & 256) != 0) {
            bool = c20526015Tm.LLJ;
        } else {
            bool = null;
        }
        if ((i & 512) != 0) {
            j = c20526015Tm.LLJI;
        } else {
            j = 0;
        }
        if ((i & 1024) != 0) {
            l = c20526015Tm.LLJIJIL;
        } else {
            l = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str2 = c20526015Tm.LLJILJIL;
        } else {
            str2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str3 = c20526015Tm.LLJILJILJ;
        } else {
            str3 = null;
        }
        if ((i & 8192) != 0) {
            str4 = c20526015Tm.LLJILLL;
        } else {
            str4 = null;
        }
        if ((i & 16384) != 0) {
            str5 = c20526015Tm.LLJJ;
        } else {
            str5 = null;
        }
        if ((32768 & i) != 0) {
            str6 = c20526015Tm.LLJJI;
        } else {
            str6 = null;
        }
        if ((i & 65536) != 0) {
            z4 = c20526015Tm.LLJJIII;
        } else {
            z4 = false;
        }
        c20526015Tm.getClass();
        return new C20526015Tm(aweme2, z5, str, logPbBean, z2, i2, z3, i3, bool, j, l, str2, str3, str4, str5, str6, z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C20526015Tm(Aweme aweme, boolean z, String str, LogPbBean logPbBean, boolean z2, int i, boolean z3, long j, Long l, String str2, String str3, String str4, String str5, String str6, int i2) {
        Boolean bool;
        String str7 = str5;
        String str8 = str4;
        String str9 = str3;
        long j2 = j;
        boolean z4 = z3;
        String str10 = str2;
        int value = i;
        Long l2 = l;
        boolean z5 = (i2 & 16) != 0 ? false : z2;
        value = (i2 & 32) != 0 ? C15TI.UNKNOWN.getValue() : value;
        z4 = (i2 & 64) != 0 ? false : z4;
        if ((i2 & 256) != 0) {
            IExploreFeedDebugService iExploreFeedDebugService = (IExploreFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IExploreFeedDebugService.class, false, false, false, 14, null);
            if (iExploreFeedDebugService != null) {
                iExploreFeedDebugService.LIZIZ();
            }
            bool = false;
        } else {
            bool = null;
        }
        this(aweme, z, str, logPbBean, z5, value, z4, 0, bool, (i2 & 512) != 0 ? -1L : j2, (i2 & 1024) != 0 ? null : l2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str10, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i2 & 8192) != 0 ? null : str8, (i2 & 16384) != 0 ? null : str7, (i2 & 32768) == 0 ? str6 : null, false);
    }

    public C20526015Tm(Aweme aweme, boolean z, String str, LogPbBean logPbBean, boolean z2, int i, boolean z3, int i2, Boolean bool, long j, Long l, String str2, String str3, String str4, String str5, String str6, boolean z4) {
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = logPbBean;
        this.LLILZIL = z2;
        this.LLILZLL = i;
        this.LLIZ = z3;
        this.LLIZLLLIL = i2;
        this.LLJ = bool;
        this.LLJI = j;
        this.LLJIJIL = l;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = str4;
        this.LLJJ = str5;
        this.LLJJI = str6;
        this.LLJJIII = z4;
    }
}
