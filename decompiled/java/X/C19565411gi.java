package X;

import Y.ACallableS175S0300000_5;
import Y.ARunnableS129S0100000_29;
import Y.AfS181S0100000_12;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19565411gi extends AbstractC2255721DQs<InterfaceC1648330szn> implements InterfaceC1648330szn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public boolean LLIZLLLIL;
    public final C19EG LLILLJJLI = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(305));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(304));
    public CopyOnWriteArraySet<StickerModel> LLJ = new CopyOnWriteArraySet<>();
    public CopyOnWriteArraySet<StickerModel> LLJI = new CopyOnWriteArraySet<>();
    public volatile boolean LLJIJIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19565411gi.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19565411gi.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19565411gi.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJILJ = 8;
    }

    public InterfaceC1648330szn X1() {
        return this;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        this.LLIZLLLIL = false;
        super.onDestroy();
        Z1().dispose();
        this.LLJI.clear();
        this.LLJ.clear();
    }

    private final C11NJ Z1() {
        return (C11NJ) this.LLIZ.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    public final void W2() {
        C2487409ou.LIZJ(new ARunnableS129S0100000_29(this, 112));
    }

    public final InterfaceC1647520syU o2() {
        return (InterfaceC1647520syU) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    public final C11PQ<Object> w2() {
        return (C11PQ) this.LLILZLL.getValue();
    }

    private final void G2() {
        Z1().LIZ(w2().LJLIL(3000L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 141)));
    }

    private final void H2() {
        InterfaceC1647520syU interfaceC1647520syUO2 = o2();
        if (interfaceC1647520syUO2 != null) {
            interfaceC1647520syUO2.LJJZZI(new C0FTB() { // from class: X.11gm
                @Override // X.C0FTB
                public final void LIZ(StickerModel stickerModel, boolean z) {
                }

                @Override // X.C0FTB
                public final void LIZIZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LIZJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LIZLLL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJFF(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJI(StickerModel stickerModel, boolean z) {
                }

                @Override // X.C0FTB
                public final void LJIIIIZZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIIZ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIIL(StickerModel stickerModel, int i) {
                }

                @Override // X.C0FTB
                public final void LJIILIIL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILJJIL(int i) {
                }

                @Override // X.C0FTB
                public final void LJIILL(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIILLIIL(int i) {
                }

                @Override // X.C0FTB
                public final void LJIIZILJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJ(int i) {
                }

                @Override // X.C0FTB
                public final void LJIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIJJLI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJIL() {
                }

                @Override // X.C0FTB
                public final void LJJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIFFI(int i) {
                }

                @Override // X.C0FTB
                public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
                }

                @Override // X.C0FTB
                public final void LJJIII(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIJ(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
                }

                @Override // X.C0FTB
                public final void LJJIIZ() {
                }

                @Override // X.C0FTB
                public final void LJJIIZI(int i) {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJI(StickerModel stickerModel) {
                }

                @Override // X.C0FTB
                public final void LJJIJIIJIL(int i) {
                }

                @Override // X.C0FTB
                public final void LJII() {
                    this.LL.w2().onNext(Unit.LIZ);
                }

                @Override // X.C0FTB
                public final void LJJIJ() {
                    this.LL.w2().onNext(Unit.LIZ);
                }

                @Override // X.C0FTB
                public final EnumC1466150oFx[] LJJIJIL() {
                    return EnumC1466150oFx.values();
                }

                @Override // X.C0FTB
                public final void f4(StickerModel stickerModel) {
                    this.LL.LLJI.add(stickerModel);
                }

                @Override // X.C0FTB
                public final void LJIIJ(StickerModel stickerModel, String str) {
                    this.LL.LLJI.remove(stickerModel);
                }
            });
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        TextFontStyleData next;
        super.onCreate();
        this.LLIZLLLIL = true;
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null) {
            recordAdapterApi.w70(this);
        }
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        G2();
        H2();
        final TextStickerModel textStickerModel = getShortVideoContext().creativeModel.initialModel.dmCameraModel.fontData;
        if (textStickerModel == null) {
            return;
        }
        List<TextFontStyleData> listLJIJ = C0FI2.LJIJJ().LJIJ();
        final String str = textStickerModel.getFontModel().fontResId;
        Iterator<TextFontStyleData> it2 = listLJIJ.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LJ.getResourceId(), str)) {
                Iterator<TextFontStyleData> it3 = listLJIJ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.LJ.getResourceId(), str)) {
                            break;
                        }
                    }
                }
                TextFontStyleData textFontStyleData = next;
                if (textFontStyleData != null) {
                    W1(textStickerModel, textFontStyleData);
                    return;
                }
                return;
            }
        }
        C0FI2.LJIJJ().LJI(this.LLILLJJLI, Boolean.FALSE, Boolean.valueOf(true ^ C298130BmN.LIZ()), new C0FIB() { // from class: X.11gj
            @Override // X.C0FIB
            public final void accept(Object obj) {
                Object next2;
                String str2 = str;
                Iterator it4 = ((List) obj).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF(((TextFontStyleData) next2).LJ.getResourceId(), str2)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                TextFontStyleData textFontStyleData2 = (TextFontStyleData) next2;
                if (textFontStyleData2 != null) {
                    this.W1(textStickerModel, textFontStyleData2);
                    return;
                }
                C0FI2 c0fi2LJIJJ = C0FI2.LJIJJ();
                C19EG c19eg = this.LLILLJJLI;
                Boolean bool = Boolean.FALSE;
                Boolean boolValueOf = Boolean.valueOf(true ^ C298130BmN.LIZ());
                final String str3 = str;
                final C19565411gi c19565411gi = this;
                final TextStickerModel textStickerModel2 = textStickerModel;
                c0fi2LJIJJ.LJI(c19eg, bool, boolValueOf, new C0FIB() { // from class: X.11gl
                    @Override // X.C0FIB
                    public final void accept(Object obj2) {
                        Object next3;
                        String str4 = str3;
                        Iterator it5 = ((List) obj2).iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next3 = it5.next();
                                if (Intrinsics.LJFF(((TextFontStyleData) next3).LJ.getResourceId(), str4)) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        TextFontStyleData textFontStyleData3 = (TextFontStyleData) next3;
                        if (textFontStyleData3 != null) {
                            c19565411gi.W1(textStickerModel2, textFontStyleData3);
                        }
                    }
                });
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19565411gi(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final TextFontModel T2(TextFontStyleData textFontStyleData) {
        String id;
        String resource_id;
        String panel;
        boolean z;
        Effect effect = textFontStyleData.LJ;
        if (effect == null || (id = effect.getId()) == null) {
            id = "";
        }
        Effect effect2 = textFontStyleData.LJ;
        if (effect2 == null || (resource_id = effect2.getResource_id()) == null) {
            resource_id = "";
        }
        Effect effect3 = textFontStyleData.LJ;
        if (effect3 == null || (panel = effect3.getPanel()) == null) {
            panel = "";
        }
        String str = textFontStyleData.fontName;
        if (str == null) {
            str = "";
        }
        String str2 = textFontStyleData.title;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = textFontStyleData.fileName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleData.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        boolean z2 = false;
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        if (textFontStyleData.enableMaskBlurLightColor == 1) {
            z2 = true;
        }
        return new TextFontModel(id, resource_id, panel, null, str, str2, 28, 0, str3, str4, z, z2, false, 0, 12424, null);
    }

    @Override // X.InterfaceC1648330szn
    public void Vi2(boolean z) {
        this.LLJIJIL = z;
        W2();
    }

    public final void W1(final TextStickerModel textStickerModel, TextFontStyleData textFontStyleData) {
        if (textFontStyleData.LIZIZ()) {
            this.LLJ.add(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, T2(textFontStyleData), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -513, 65535, null));
            W2();
            return;
        }
        C0FI2 c0fi2LJIJJ = C0FI2.LJIJJ();
        C19EG c19eg = this.LLILLJJLI;
        C0FID c0fid = new C0FID() { // from class: X.11gk
            @Override // X.C0FID
            public final void LIZJ() {
            }

            @Override // X.C0FID
            public final void LIZLLL(TextFontStyleData textFontStyleData2, boolean z) {
                if (textFontStyleData2 == null) {
                    return;
                }
                C19565411gi c19565411gi = this.LL;
                c19565411gi.LLJ.add(TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, 0, 0, 0, 0.0f, c19565411gi.T2(textFontStyleData2), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -513, 65535, null));
                this.LL.W2();
            }
        };
        if (c19eg == null) {
            return;
        }
        C15O7.LIZJ(new ACallableS175S0300000_5(c0fi2LJIJJ, textFontStyleData, c0fid, 0));
    }
}
