package X;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978520bZS {
    public static final List<GiftMode> LIZIZ() {
        List<GiftMode> listLIZLLL;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            List<GiftMode> listLIZLLL2 = C915980Zwa.LJI().LJI().LIZLLL();
            return listLIZLLL2 == null ? C13BV.INSTANCE : listLIZLLL2;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        return (interfaceC975810bV5LIZLLL == null || (listLIZLLL = interfaceC975810bV5LIZLLL.LIZLLL()) == null) ? C13BV.INSTANCE : listLIZLLL;
    }

    public static final GiftMode LJFF() {
        if (!LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
            return C978440bZK.LJII(interfaceC975810bV5LIZLLL != null ? interfaceC975810bV5LIZLLL.LJII() : null);
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            return interfaceC973730bRjYf2.LJJIL();
        }
        return null;
    }

    public static final Text LJI() {
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            return C915980Zwa.LJI().LJI().LIZ();
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            return interfaceC975810bV5LIZLLL.LIZ();
        }
        return null;
    }

    public static final GiftMode LJII() {
        LiveData<GiftMode> liveDataLJI;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            return C915980Zwa.LJI().LJI().LJI().getValue();
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL == null || (liveDataLJI = interfaceC975810bV5LIZLLL.LJI()) == null) {
            return null;
        }
        return liveDataLJI.getValue();
    }

    public static final long LJIIIIZZ() {
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            return C915980Zwa.LJI().LJI().LIZIZ();
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            return interfaceC975810bV5LIZLLL.LIZIZ();
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LJIIIZ() {
        MutableLiveData mutableLiveDataLJIILLIIL;
        Integer num;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            Integer value = C915980Zwa.LJI().LJI().LJIIIIZZ().getValue();
            if (value != null) {
                return value.intValue();
            }
            return 0;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL == null || (mutableLiveDataLJIILLIIL = interfaceC975810bV5LIZLLL.LJIILLIIL()) == null || (num = (Integer) mutableLiveDataLJIILLIIL.getValue()) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final boolean LJIIJJI() {
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            return C500260Jjc.LJJJI(interfaceC973730bRjYf2 != null ? Boolean.valueOf(interfaceC973730bRjYf2.LJ()) : null);
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        return C500260Jjc.LJJJI(interfaceC975810bV5LIZLLL != null ? Boolean.valueOf(interfaceC975810bV5LIZLLL.LJ()) : null);
    }

    public static final String LIZJ(boolean z) {
        long j;
        GiftModeMeta giftModeMetaLJII;
        GiftModeMeta giftModeMetaLJII2;
        String str;
        GiftMode giftModeLJJIL;
        String str2 = null;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 == null || (giftModeLJJIL = interfaceC973730bRjYf2.LJJIL()) == null) {
                return null;
            }
            return giftModeLJJIL.giftName;
        }
        if (z) {
            InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
            if (interfaceC975810bV5LIZLLL != null && (giftModeMetaLJII2 = interfaceC975810bV5LIZLLL.LJII()) != null && (str = giftModeMetaLJII2.giftNameKey) != null && str.length() != 0) {
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                if (giftModeMetaLJII2 != null) {
                    str2 = giftModeMetaLJII2.giftNameKey;
                }
                c1124870fNVLIZJ.getClass();
                return C1124870fNV.LIZIZ(str2);
            }
            return "";
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL2 = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL2 == null) {
            return null;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL3 = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL3 != null && (giftModeMetaLJII = interfaceC975810bV5LIZLLL3.LJII()) != null) {
            j = giftModeMetaLJII.giftId;
        } else {
            j = 0;
        }
        GiftMode giftModeLJJIFFI = interfaceC975810bV5LIZLLL2.LJJIFFI(j);
        if (giftModeLJJIFFI == null) {
            return null;
        }
        return giftModeLJJIFFI.giftName;
    }

    public static final String LIZLLL(boolean z) {
        GiftMode giftModeLJJJJZ;
        GiftMode giftModeLJJIL;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
            if (interfaceC973730bRjYf2 == null || (giftModeLJJIL = interfaceC973730bRjYf2.LJJIL()) == null) {
                return null;
            }
            return giftModeLJJIL.giftName;
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf22 == null || (giftModeLJJJJZ = interfaceC973730bRjYf22.LJJJJZ()) == null) {
            return null;
        }
        return giftModeLJJJJZ.giftName;
    }

    public static final long LJ(boolean z) {
        GiftMode giftModeLJJIL;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
            if (interfaceC973730bRjYf2 == null || (giftModeLJJIL = interfaceC973730bRjYf2.LJJIL()) == null) {
                return 0L;
            }
            return giftModeLJJIL.giftId;
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf22 == null) {
            return 0L;
        }
        return interfaceC973730bRjYf22.q9();
    }

    public static final boolean LJIIJ(InterfaceC973730bRj interfaceC973730bRj) {
        BattleSetting battleSettingLJIILIIL;
        Integer numValueOf;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            if (interfaceC973730bRj != null) {
                numValueOf = Integer.valueOf(interfaceC973730bRj.LJJJJZI());
            } else {
                return false;
            }
        } else if (interfaceC973730bRj != null && (battleSettingLJIILIIL = interfaceC973730bRj.LJIILIIL()) != null) {
            numValueOf = Integer.valueOf(battleSettingLJIILIIL.gameplayOption);
        } else {
            return false;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(boolean z) {
        Boolean boolValueOf = null;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
            if (interfaceC973730bRjYf2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC973730bRjYf2.LJ());
            }
            return C500260Jjc.LJJJI(boolValueOf);
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(z);
        if (interfaceC973730bRjYf22 != null) {
            boolValueOf = Boolean.valueOf(interfaceC973730bRjYf22.LJIILL());
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static final boolean LJIILIIL(boolean z) {
        Long lValueOf;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            GiftMode value = C915980Zwa.LJI().LJI().LJI().getValue();
            if (value == null || (lValueOf = Long.valueOf(value.giftId)) == null || lValueOf.longValue() == 0) {
                return false;
            }
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(z);
            if (interfaceC973730bRjYf2 != null && interfaceC973730bRjYf2.q9() == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.Spannable LJIIZILJ(com.bytedance.android.livesdk.model.message.common.Text r3) {
        /*
            r2 = 0
            if (r3 != 0) goto L4
            return r2
        L4:
            java.lang.String r0 = r3.key
            if (r0 == 0) goto L39
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r3.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L39
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r3.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
        L28:
            android.text.Spannable r1 = X.C1133830fbx.LJIILJJIL(r0, r3, r2)
            if (r1 != 0) goto L32
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r0)
        L32:
            int r0 = r1.length()
            if (r0 <= 0) goto L40
            return r1
        L39:
            java.lang.String r0 = r3.defaultPattern
            if (r0 != 0) goto L28
            java.lang.String r0 = ""
            goto L28
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978520bZS.LJIIZILJ(com.bytedance.android.livesdk.model.message.common.Text):android.text.Spannable");
    }

    public static final void LJIJJ(long j) {
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC978510bZR interfaceC978510bZRLJI = C915980Zwa.LJI().LJI();
            interfaceC978510bZRLJI.LJIIIZ(j);
            interfaceC978510bZRLJI.LJ(j);
        }
    }

    public static final void LJIJJLI(GiftMode giftMode) {
        long j;
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            InterfaceC978510bZR interfaceC978510bZRLJI = C915980Zwa.LJI().LJI();
            interfaceC978510bZRLJI.LJII(giftMode);
            if (giftMode != null) {
                j = giftMode.giftId;
            } else {
                j = 0;
            }
            interfaceC978510bZRLJI.LJ(j);
        }
    }

    public static final void LIZ(Function1<? super List<GiftMode>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            C915980Zwa.LJI().LJI().LIZJ(function1, function12);
            return;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL == null) {
            return;
        }
        interfaceC975810bV5LIZLLL.LIZJ(function1, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILJJIL(com.bytedance.android.livesdk.model.message.common.Text r6, X.InterfaceC1364105Vn<? super android.text.Spannable> r7) {
        /*
            boolean r0 = r7 instanceof X.C978550bZV
            if (r0 == 0) goto L3e
            r5 = r7
            X.0bZV r5 = (X.C978550bZV) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L45
            X.C155000ia.LIZIZ(r4)
        L23:
            r0 = r4
            android.text.Spannable r0 = (android.text.Spannable) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L44
            return r4
        L2d:
            X.C155000ia.LIZIZ(r4)
            if (r6 != 0) goto L33
            return r2
        L33:
            X.01OO r0 = X.C01OO.LIZ
            r5.LLILLJJLI = r1
            java.lang.Object r4 = r0.LIZ(r6, r5)
            if (r4 != r3) goto L23
            return r3
        L3e:
            X.0bZV r5 = new X.0bZV
            r5.<init>(r7)
            goto L12
        L44:
            return r2
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978520bZS.LJIILJJIL(com.bytedance.android.livesdk.model.message.common.Text, X.05Vn):java.lang.Object");
    }

    public static final Spannable LJIJ(MatchInvitePanelConfig matchInvitePanelConfig, String str) {
        Text text;
        if (matchInvitePanelConfig != null) {
            text = matchInvitePanelConfig.descText;
        } else {
            text = null;
        }
        Spannable spannableLJIIZILJ = LJIIZILJ(text);
        if (spannableLJIIZILJ == null) {
            if (str == null) {
                return null;
            }
            return SpannableString.valueOf(str);
        }
        return spannableLJIIZILJ;
    }

    public static final Spannable LJIJI(MatchInvitePanelConfig matchInvitePanelConfig, String str) {
        Text text;
        if (matchInvitePanelConfig != null) {
            text = matchInvitePanelConfig.headerText;
        } else {
            text = null;
        }
        Spannable spannableLJIIZILJ = LJIIZILJ(text);
        if (spannableLJIIZILJ == null) {
            return SpannableString.valueOf(str);
        }
        return spannableLJIIZILJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILL(com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig r6, java.lang.String r7, X.InterfaceC1364105Vn<? super android.text.Spannable> r8) {
        /*
            boolean r0 = r8 instanceof X.C978530bZT
            if (r0 == 0) goto L44
            r5 = r8
            X.0bZT r5 = (X.C978530bZT) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L4b
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r4)
        L27:
            if (r4 != 0) goto L4a
            if (r7 == 0) goto L2f
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r7)
        L2f:
            return r2
        L30:
            X.C155000ia.LIZIZ(r4)
            if (r6 == 0) goto L42
            com.bytedance.android.livesdk.model.message.common.Text r0 = r6.descText
        L37:
            r5.LL = r7
            r5.LLILLL = r1
            java.lang.Object r4 = LJIILJJIL(r0, r5)
            if (r4 != r3) goto L27
            return r3
        L42:
            r0 = r2
            goto L37
        L44:
            X.0bZT r5 = new X.0bZT
            r5.<init>(r8)
            goto L12
        L4a:
            return r4
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978520bZS.LJIILL(com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILLIIL(com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig r5, java.lang.String r6, X.InterfaceC1364105Vn<? super android.text.Spannable> r7) {
        /*
            boolean r0 = r7 instanceof X.C978540bZU
            if (r0 == 0) goto L41
            r4 = r7
            X.0bZU r4 = (X.C978540bZU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L47
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L26:
            if (r3 != 0) goto L2c
            android.text.SpannableString r3 = android.text.SpannableString.valueOf(r6)
        L2c:
            return r3
        L2d:
            X.C155000ia.LIZIZ(r3)
            if (r5 == 0) goto L3f
            com.bytedance.android.livesdk.model.message.common.Text r0 = r5.headerText
        L34:
            r4.LL = r6
            r4.LLILLL = r1
            java.lang.Object r3 = LJIILJJIL(r0, r4)
            if (r3 != r2) goto L26
            return r2
        L3f:
            r0 = 0
            goto L34
        L41:
            X.0bZU r4 = new X.0bZU
            r4.<init>(r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978520bZS.LJIILLIIL(com.bytedance.android.livesdkapi.depend.model.live.match.MatchInvitePanelConfig, java.lang.String, X.05Vn):java.lang.Object");
    }
}
