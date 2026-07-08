package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C462980IDo implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$1(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$2(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$3(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$4(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$5(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$6(C462980IDo c462980IDo) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO[] c0hwoArr) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
            case 2:
                LIZ$2(this, c0hwoArr);
                break;
            case 3:
                LIZ$3(this, c0hwoArr);
                break;
            case 4:
                LIZ$4(this, c0hwoArr);
                break;
            case 5:
                LIZ$5(this, c0hwoArr);
                break;
            case 6:
                LIZ$6(this, c0hwoArr);
                break;
            case 7:
                LIZ$7(this, c0hwoArr);
                break;
            case 8:
                LIZ$8(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
            case 3:
                onCanceled$3(this);
                break;
            case 4:
                onCanceled$4(this);
                break;
            case 5:
                onCanceled$5(this);
                break;
            case 6:
                onCanceled$6(this);
                break;
            case 7:
                onCanceled$7(this);
                break;
            case 8:
                onCanceled$8(this);
                break;
        }
    }

    public static final void onCanceled$7(C462980IDo c462980IDo) {
    }

    public static final void onCanceled$8(C462980IDo c462980IDo) {
    }

    public C462980IDo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C462980IDo c462980IDo, C0HWO[] c0hwoArr) {
        C0HWO c0hwo = (C0HWO) C13LQ.LJJIFFI(c0hwoArr);
        if (c0hwo != null) {
            LocalMusicTabFragment localMusicTabFragment = (LocalMusicTabFragment) c462980IDo.l0;
            int i = C449050HjD.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        localMusicTabFragment.ZR(localMusicTabFragment.getContext(), null);
                        return;
                    }
                    throw new C1954807lC();
                }
                return;
            }
            C0W79.LIZLLL(localMusicTabFragment.getActivity());
        }
    }

    public static final void LIZ$1(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.RECORD_AUDIO")) {
                int i = C449020HjA.LIZ[c0hwo.LIZIZ.ordinal()];
                if (i == 1) {
                    continue;
                } else if (i != 2) {
                    if (i == 3) {
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        Activity activity = (Activity) c462980IDo.l0;
                        iMVoiceMessageUtil.getClass();
                        C19741112Lp.LIZ.getClass();
                        C19741112Lp.LJIIIZ(activity, "android.permission.RECORD_AUDIO");
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    IMVoiceMessageUtil iMVoiceMessageUtil2 = IMVoiceMessageUtil.LIZ;
                    Activity activity2 = (Activity) c462980IDo.l0;
                    iMVoiceMessageUtil2.getClass();
                    C19741112Lp.LIZ.getClass();
                    C19741112Lp.LJIIIZ(activity2, "android.permission.RECORD_AUDIO");
                }
            }
        }
    }

    public static final void LIZ$2(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        Function1 function1 = (Function1) c462980IDo.l0;
        if (function1 != null) {
            int i = C449170HjP.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        function1.invoke(Boolean.FALSE);
                        return;
                    }
                    throw new C1954807lC();
                }
                function1.invoke(Boolean.FALSE);
                return;
            }
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void LIZ$3(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        Function2 function2 = (Function2) c462980IDo.l0;
        for (C0HWO c0hwo : c0hwoArr) {
            function2.invoke(c0hwo.LIZ, c0hwo.LIZIZ);
        }
    }

    public static final void LIZ$4(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C449070HjF.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((Function1) c462980IDo.l0).invoke(Boolean.FALSE);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ((Function1) c462980IDo.l0).invoke(Boolean.FALSE);
                }
            } else {
                ((Function1) c462980IDo.l0).invoke(Boolean.TRUE);
            }
        }
    }

    public static final void LIZ$5(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        for (C0HWO c0hwo : c0hwoArr) {
            int i = C449080HjG.LIZ[c0hwo.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((Function1) c462980IDo.l0).invoke(Boolean.FALSE);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ((Function1) c462980IDo.l0).invoke(Boolean.FALSE);
                }
            } else {
                ((Function1) c462980IDo.l0).invoke(Boolean.TRUE);
            }
        }
    }

    public static final void LIZ$6(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        boolean z = true;
        if (c0hwoArr.length == 0) {
            ((Function1) c462980IDo.l0).invoke(Boolean.FALSE);
            return;
        }
        Function1 function1 = (Function1) c462980IDo.l0;
        int length = c0hwoArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (c0hwoArr[i].LIZIZ == EnumC442280HVy.GRANTED) {
                    i++;
                } else {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        function1.invoke(Boolean.valueOf(z));
    }

    public static final void LIZ$7(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        Function2 function2 = (Function2) c462980IDo.l0;
        for (C0HWO c0hwo : c0hwoArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestPermission: permission = ");
            sbLIZ.append(c0hwo.LIZ);
            sbLIZ.append(", result = ");
            sbLIZ.append(c0hwo.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            function2.invoke(c0hwo.LIZ, c0hwo.LIZIZ);
        }
    }

    public static final void LIZ$8(C462980IDo c462980IDo, C0HWO... c0hwoArr) {
        Function2 function2 = (Function2) c462980IDo.l0;
        for (C0HWO c0hwo : c0hwoArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestPermission: permission = ");
            sbLIZ.append(c0hwo.LIZ);
            sbLIZ.append(", result = ");
            sbLIZ.append(c0hwo.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            function2.invoke(c0hwo.LIZ, c0hwo.LIZIZ);
        }
    }
}
