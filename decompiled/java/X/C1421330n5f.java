package X;

import Y.AObserverS225S0100000_22;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import com.ss.android.ugc.aweme.creative.model.stickers.PovModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS10S0120000_22;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.ranges.IntRange;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0n5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421330n5f extends i<InterfaceC1410080mnW, C1421180n5Q, C1421230n5V, C1421210n5T> implements InterfaceC1410080mnW, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public TextStickerData LLJJ;
    public InputMethodManager LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public Function0<? extends C21410318qb> LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public String LLJJJ;
    public long LLJJJIL;
    public String LLJJJJ;
    public final Function0<C1421230n5V> LLJJJJJIL;
    public final Function0<C1421210n5T> LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1421330n5f.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1421330n5f.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1421330n5f.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final InterfaceC1461660o8i O4() {
        return (InterfaceC1461660o8i) this.LLJJIJI.getValue(this, LLJJL[1]);
    }

    private final void x5() {
        i3(AFwS261S0000000_22.get$arr$(219));
    }

    public final InterfaceC1455860nzM K4() {
        return (InterfaceC1455860nzM) this.LLJJIII.getValue(this, LLJJL[0]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJJL[2]);
    }

    private final void Z4() {
        List<PovItemInfo> list;
        PovModel povModel = LJJJLIIL().creativeModel.povModel;
        if (povModel == null || (list = povModel.povList) == null) {
            list = C13BV.INSTANCE;
        }
        C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("povListSize:");
        sbLIZ.append(list.size());
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
        if (C1421380n5k.LIZ(LJJJLIIL())) {
            C1421380n5k.LIZJ(false, LJJJLIIL(), new AwS601S0100000_22(this, 519), new AwS601S0100000_22(this, 520));
            return;
        }
        C1421430n5p c1421430n5p = C1421430n5p.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJIL;
        c1421430n5p.getClass();
        C1421430n5p.LIZIZ(jCurrentTimeMillis, true, true);
        C5(list, false);
    }

    public final C0FVT P4() {
        return O4().kR();
    }

    public final void d5() {
        C1421380n5k.LJFF(false, LJJJLIIL(), new AwS601S0100000_22(this, 521), new AwS601S0100000_22(this, 522));
    }

    public final void k5() {
        x5();
        C1421380n5k.LJFF(true, LJJJLIIL(), new AwS601S0100000_22(this, 523), new AwS601S0100000_22(this, 524));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K4().ww2().observe(this, new AObserverS225S0100000_22(this, 121));
        Z4();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1421450n5r c1421450n5r = C1421380n5k.LJFF;
        if (c1421450n5r != null) {
            c1421450n5r.LIZJ = true;
        }
        C1421380n5k.LJFF = null;
    }

    @Override // X.InterfaceC1410080mnW
    public void zX() {
        this.LLJJJIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1421230n5V> o2() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1421210n5T> w2() {
        return this.LLJJJJLIIL;
    }

    private final String n5(String str) {
        if (u.LJIIZILJ(str, "\r\n", false)) {
            return C13LN.LJLL(2, str);
        }
        if (!u.LJIIZILJ(str, "\n", false) && !u.LJIIZILJ(str, "\r", false)) {
            return str;
        }
        return C13LN.LJLL(1, str);
    }

    public final void F4(List<PovItemInfo> list) {
        int size;
        int size2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "edit_text_pov_mark_staring", true, true) && !list.isEmpty()) {
            PovItemInfo povItemInfo = (PovItemInfo) ListProtector.get(list, 0);
            Boolean bool = Boolean.TRUE;
            povItemInfo.setStar(bool);
            if (list.size() != 1) {
                if (list.size() % 2 == 0) {
                    size = list.size() - 2;
                } else {
                    size = list.size() - 1;
                }
                if (list.size() % 2 == 1) {
                    size2 = list.size() - 2;
                } else {
                    size2 = list.size() - 1;
                }
                IntRange intRange = new IntRange(0, 1);
                C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
                ((PovItemInfo) ListProtector.get(list, Math.min((C13LZ.LJIIJ(c19994913Lf, intRange) + 4) * 2, size))).setStar(bool);
                int iLJIIJ = C13LZ.LJIIJ(c19994913Lf, new IntRange(0, 2));
                if (iLJIIJ != 0) {
                    if (iLJIIJ != 1) {
                        if (iLJIIJ == 2) {
                            ((PovItemInfo) ListProtector.get(list, Math.min(5, size2))).setStar(bool);
                            ((PovItemInfo) ListProtector.get(list, Math.min(15, size2))).setStar(bool);
                            return;
                        }
                        return;
                    }
                    ((PovItemInfo) ListProtector.get(list, Math.min(5, size2))).setStar(bool);
                    ((PovItemInfo) ListProtector.get(list, Math.min(13, size2))).setStar(bool);
                    return;
                }
                ((PovItemInfo) ListProtector.get(list, Math.min(3, size2))).setStar(bool);
                ((PovItemInfo) ListProtector.get(list, Math.min(13, size2))).setStar(bool);
            }
        }
    }

    public final boolean H4(int i) {
        if (C1421340n5g.LIZ() - i > 0) {
            return true;
        }
        return false;
    }

    public final void t5(boolean z) {
        C1421350n5h c1421350n5hLIZ;
        String strN5;
        C21410318qb c21410318qbInvoke = this.LLJJIJIIJIL.invoke();
        if (c21410318qbInvoke != null && (c1421350n5hLIZ = C1421620n68.LIZ(String.valueOf(C2204961BRm.LLJJIII(c21410318qbInvoke, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUh3GYbBWWn1vhImEJJD0Tyc+iXIBM7GxNZQ/AMwLw==", null))))) != null && c1421350n5hLIZ.LIZJ.length() == 0) {
            if (c1421350n5hLIZ.LIZ.length() > 0 && c1421350n5hLIZ.LIZIZ.length() == 0) {
                strN5 = n5(c1421350n5hLIZ.LIZ);
            } else {
                strN5 = c1421350n5hLIZ.LIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strN5);
            sbLIZ.append(c1421350n5hLIZ.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c21410318qbInvoke.setText(strLIZIZ);
            c21410318qbInvoke.setSelection(strLIZIZ.length());
        }
        UO2(false, true, null, "", false, AFwS210S0000000_22.get$arr$(258), new AwS123S0110000_5(z, this, 3));
    }

    public final void v5(int i) {
        i3(new AwS35S0001000_22(i, 24));
    }

    public C1421330n5f(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
        this.LLJJIJIIJIL = AFwS210S0000000_22.get$arr$(257);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJJJIL = AFwS210S0000000_22.get$arr$(256);
        this.LLJJJJLIIL = new AwS566S0100000_22(this, 741);
    }

    private final void T4(C21410318qb c21410318qb, C1421350n5h c1421350n5h) throws Throwable {
        if (c21410318qb != null && c1421350n5h == null) {
            if (C09AZ.LIZJ(String.valueOf(C2204961BRm.LLJJIII(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUh3GYbBWWn1vhImEJJD0Tyc+iXIBM7GxNZQ/AMwLw==", null)))).length() == 0) {
                Editable editableLLJJIII = C2204961BRm.LLJJIII(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUh3GYbBWWn1vhImEJJD0Tyc+iXIBM7GxNZQ/AMwLw==", null));
                if (editableLLJJIII != null) {
                    editableLLJJIII.insert(c21410318qb.getSelectionStart(), "POV:");
                    return;
                }
                return;
            }
            Editable editableLLJJIII2 = C2204961BRm.LLJJIII(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUh3GYbBWWn1vhImEJJD0Tyc+iXIBM7GxNZQ/AMwLw==", null));
            if (editableLLJJIII2 == null) {
                return;
            }
            editableLLJJIII2.insert(String.valueOf(C2204961BRm.LLJJIII(c21410318qb, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0D4MVc3nBqUh3GYbBWWn1vhImEJJD0Tyc+iXIBM7GxNZQ/AMwLw==", null))).length(), "\nPOV:");
        }
    }

    public final void C5(List<PovItemInfo> list, boolean z) {
        i3(new AwS10S0120000_22((List) list, (List<PovItemInfo>) H4(list.size()), z, true));
    }

    public final void E5(List<PovItemInfo> list, boolean z, boolean z2) {
        i3(new AwS10S0120000_22((List) list, (List<PovItemInfo>) z, z2, true));
    }

    public final void D5(List<PovItemInfo> list, boolean z, C1421350n5h c1421350n5h, String str) {
        i3(new C1421320n5e(list, H4(list.size()), z, c1421350n5h, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    @Override // X.InterfaceC1410080mnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void UO2(boolean r13, boolean r14, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r15, java.lang.String r16, boolean r17, kotlin.jvm.functions.Function0<? extends X.C21410318qb> r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421330n5f.UO2(boolean, boolean, com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }
}
