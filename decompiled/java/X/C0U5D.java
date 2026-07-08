package X;

import Y.AObjectS12S0600000_12;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import java.util.List;
import kotlin.jvm.internal.AwS138S0201000_12;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS413S0200000_12;

/* JADX INFO: renamed from: X.0U5D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5D {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(LiveEffect liveEffect, C0U5B c0u5b, DataChannel dataChannel, C0U5F c0u5f, BgEffectViewModel bgEffectViewModel) {
        String strLJJLIIIJLLLLLLLZ;
        String strLLJLLIL = liveEffect.LLJLLIL();
        if (strLLJLLIL == null || (strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ()) == null) {
            return;
        }
        C207209166l c207209166l = new C207209166l(strLJJLIIIJLLLLLLLZ, EnumC771350UNp.SHARE_EFFECT, null, null, strLLJLLIL, null, false, 3, false, 748);
        C207232167i.LIZIZ(c207209166l, new AObjectS12S0600000_12(liveEffect, c0u5b, c0u5f, c207209166l, bgEffectViewModel, dataChannel, 0));
    }

    public static void LIZ(LiveEffect liveEffect, C0U5B c0u5b, StickerEffectViewModel stickerEffectViewModel, DataChannel dataChannel, C0U5F c0u5f, BgEffectViewModel bgEffectViewModel) {
        if (c0u5b != null) {
            c0u5b.LLLII(liveEffect);
        }
        if (c0u5f != null) {
            c0u5f.LIZLLL(liveEffect);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<LiveEffect> listLL = liveEffect.LL();
        if (listLL != null) {
            boolean z = true;
            for (LiveEffect liveEffect2 : listLL) {
                if (stickerEffectViewModel.yQ2(liveEffect2)) {
                    liveEffect2.LJJLIL(true);
                    liveEffect2.LJLILLLLZI(false);
                } else {
                    liveEffect.LJJLIL(false);
                    liveEffect.LJLILLLLZI(true);
                    LIZJ(liveEffect2, c0u5b, stickerEffectViewModel, dataChannel, liveEffect, Long.valueOf(jCurrentTimeMillis), c0u5f, null, 128);
                    z = false;
                }
            }
            if (!z) {
                return;
            }
        }
        if (c0u5b != null) {
            c0u5b.LLLIILIL(liveEffect);
        }
        if (c0u5f != null) {
            c0u5f.LIZJ(bgEffectViewModel, liveEffect);
        }
    }

    public static void LIZJ(final LiveEffect liveEffect, final C0U5B c0u5b, final StickerEffectViewModel stickerEffectViewModel, final DataChannel dataChannel, LiveEffect liveEffect2, Long l, C0U5F c0u5f, BgEffectViewModel bgEffectViewModel, int i) {
        final C0U5F c0u5f2 = c0u5f;
        final Long l2 = l;
        final LiveEffect liveEffect3 = liveEffect2;
        final BgEffectViewModel bgEffectViewModel2 = null;
        if ((i & 16) != 0) {
            liveEffect3 = null;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            c0u5f2 = null;
        }
        if ((i & 128) == 0) {
            bgEffectViewModel2 = bgEffectViewModel;
        }
        BaseEffectViewModel.wQ2(stickerEffectViewModel, liveEffect, new C0U45() { // from class: X.0U5G
            public long LIZ;
            public long LIZIZ = -1;

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect4) {
                long jLongValue;
                liveEffect.LJJLIL(true);
                liveEffect.LJLILLLLZI(false);
                if (C0U7C.LJIILIIL(liveEffect3)) {
                    LiveEffect liveEffect5 = liveEffect3;
                    if (liveEffect5 != null) {
                        liveEffect5.LJJLIL(true);
                    }
                    LiveEffect liveEffect6 = liveEffect3;
                    if (liveEffect6 != null) {
                        liveEffect6.LJLILLLLZI(false);
                    }
                }
                C0U5F c0u5f3 = c0u5f2;
                if (c0u5f3 != null) {
                    c0u5f3.LIZJ(bgEffectViewModel2, liveEffect);
                }
                C0U5B c0u5b2 = c0u5b;
                if (c0u5b2 != null && c0u5b2.LLILZ) {
                    return;
                }
                LiveEffect liveEffect7 = liveEffect3;
                if (liveEffect7 != null) {
                    if (C0U7C.LJIILIIL(liveEffect7)) {
                        C0UC4 c0uc4 = C0UC4.LIZ;
                        DataChannel dataChannel2 = dataChannel;
                        LiveEffect liveEffect8 = liveEffect3;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Long l3 = l2;
                        if (l3 != null) {
                            jLongValue = l3.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        C0UC4.LJJ(dataChannel2, liveEffect8, true, jCurrentTimeMillis - jLongValue, this.LIZIZ, -1, "", null, null);
                        C500260Jjc.LJJLIIIJILLIZJL(new AwS413S0200000_12(c0u5b, liveEffect3, 29));
                        return;
                    }
                    List<LiveEffect> listLL = liveEffect3.LL();
                    if (listLL == null) {
                        return;
                    }
                    listLL.size();
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS256S0300000_12(c0u5b, liveEffect3, stickerEffectViewModel, 3));
                    return;
                }
                C0UC4 c0uc42 = C0UC4.LIZ;
                C0UC4.LJJ(dataChannel, liveEffect, true, System.currentTimeMillis() - this.LIZ, this.LIZIZ, -1, "", null, null);
                C500260Jjc.LJJLIIIJILLIZJL(new AwS413S0200000_12(c0u5b, liveEffect, 30));
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect4) {
                liveEffect.LJJLIL(false);
                liveEffect.LJLILLLLZI(true);
                C0U5F c0u5f3 = c0u5f2;
                if (c0u5f3 != null) {
                    LiveEffect liveEffect5 = liveEffect3;
                    if (liveEffect5 == null) {
                        liveEffect5 = liveEffect;
                    }
                    c0u5f3.LIZLLL(liveEffect5);
                }
                C0U5B c0u5b2 = c0u5b;
                if (c0u5b2 != null && c0u5b2.LLILZ) {
                    return;
                }
                this.LIZ = System.currentTimeMillis();
                C500260Jjc.LJJLIIIJILLIZJL(new AwS256S0300000_12(c0u5b, liveEffect3, liveEffect, 2));
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect4, ExceptionResult exceptionResult) {
                Integer numValueOf;
                Integer numValueOf2;
                liveEffect.LJJLIL(false);
                liveEffect.LJLILLLLZI(false);
                C0U5F c0u5f3 = c0u5f2;
                if (c0u5f3 != null) {
                    c0u5f3.LIZ(liveEffect);
                }
                C0U5B c0u5b2 = c0u5b;
                if (c0u5b2 != null && c0u5b2.LLILZ) {
                    return;
                }
                LiveEffect liveEffect5 = liveEffect3;
                String msg = null;
                if (liveEffect5 != null) {
                    C0UC4 c0uc4 = C0UC4.LIZ;
                    DataChannel dataChannel2 = dataChannel;
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
                    long j = this.LIZIZ;
                    if (exceptionResult != null) {
                        numValueOf2 = Integer.valueOf(exceptionResult.getErrorCode());
                        msg = exceptionResult.getMsg();
                    } else {
                        numValueOf2 = null;
                    }
                    C0UC4.LJJ(dataChannel2, liveEffect5, false, jCurrentTimeMillis, j, numValueOf2, msg, null, null);
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS413S0200000_12(c0u5b, liveEffect3, 27));
                } else {
                    C0UC4 c0uc42 = C0UC4.LIZ;
                    DataChannel dataChannel3 = dataChannel;
                    LiveEffect liveEffect6 = liveEffect;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LIZ;
                    long j2 = this.LIZIZ;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                        msg = exceptionResult.getMsg();
                    } else {
                        numValueOf = null;
                    }
                    C0UC4.LJJ(dataChannel3, liveEffect6, false, jCurrentTimeMillis2, j2, numValueOf, msg, null, null);
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS413S0200000_12(c0u5b, liveEffect, 28));
                }
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZLLL = 2131842507;
                c0u4r.LJFF = true;
                c0u4r.LJII = dataChannel;
                c0u4r.LIZJ = "pm_liveBackground_backgroundPanel_errorToast";
                C766270U4b.LJIIJ(c0u4r);
            }

            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect4, int i2, long j) {
                this.LIZIZ = j;
                C0U5F c0u5f3 = c0u5f2;
                if (c0u5f3 != null) {
                    c0u5f3.LIZIZ(liveEffect);
                }
                C0U5B c0u5b2 = c0u5b;
                if ((c0u5b2 == null || !c0u5b2.LLILZ) && liveEffect3 == null) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS138S0201000_12(c0u5b2, liveEffect, i2, 3));
                }
            }
        });
    }
}
